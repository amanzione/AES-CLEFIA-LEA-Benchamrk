package test;

public class LEA {
    private static int[] constants = {0xc3efe9db, 0x44626b02, 0x79e27c8a, 0x78df30ec};

    public static int[][] generateRoundKeys(int[] key){
        int[][] RKs = new int[24][6];
        int[] T = {key[0], key[1], key[2], key[3]};
        for (int i = 0; i < 24; i++) {
            T[0] = ROL(T[0] + ROL(constants[i%4], i) , 1);
            T[1] = ROL(T[1] + ROL(constants[i%4], i + 1), 3);
            T[2] = ROL(T[2] + ROL(constants[i%4], i + 2) , 6);
            T[3] = ROL(T[3] + ROL(constants[i%4], i + 3) , 11);
            RKs[i][0] = T[0];
            RKs[i][1] = T[1];
            RKs[i][2] = T[2];
            RKs[i][3] = T[1];
            RKs[i][4] = T[3];
            RKs[i][5] = T[1];
        }
        return RKs;
    }

    public static int ROL(int word, int i){ return (word << i) | (word >>> (32 - i));}

    public static int ROR(int word, int i){ return (word >>> i) | (word << (32 - i));}

    public static int[] LEA(int[] key, int[] plain){
        int[][] RKs = generateRoundKeys(key);
        int[] X = {plain[0], plain[1], plain[2], plain[3]};
        for (int i=0; i< 24; i++){
            X[3] = ROR((X[2] ^ RKs[i][4]) + (X[3] ^ RKs[i][5]), 3);
            X[2] = ROR((X[1] ^ RKs[i][2]) + (X[2] ^ RKs[i][3]), 5);
            X[1] = ROL((X[0] ^ RKs[i][0]) + (X[1] ^ RKs[i][1]), 9);
            X = new int[] {X[1], X[2], X[3], X[0]};
        }
        return X;
    }
}

