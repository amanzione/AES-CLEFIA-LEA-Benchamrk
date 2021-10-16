package test;

public class Clefia {
    static int sBox0[] = {
            0x57, 0x49, 0xd1, 0xc6, 0x2f, 0x33, 0x74, 0xfb, 0x95, 0x6d, 0x82, 0xea, 0x0e, 0xb0, 0xa8, 0x1c,
            0x28, 0xd0, 0x4b, 0x92, 0x5c, 0xee, 0x85, 0xb1, 0xc4, 0x0a, 0x76, 0x3d, 0x63, 0xf9, 0x17, 0xaf,
            0xbf, 0xa1, 0x19, 0x65, 0xf7, 0x7a, 0x32, 0x20, 0x06, 0xce, 0xe4, 0x83, 0x9d, 0x5b, 0x4c, 0xd8,
            0x42, 0x5d, 0x2e, 0xe8, 0xd4, 0x9b, 0x0f, 0x13, 0x3c, 0x89, 0x67, 0xc0, 0x71, 0xaa, 0xb6, 0xf5,
            0xa4, 0xbe, 0xfd, 0x8c, 0x12, 0x00, 0x97, 0xda, 0x78, 0xe1, 0xcf, 0x6b, 0x39, 0x43, 0x55, 0x26,
            0x30, 0x98, 0xcc, 0xdd, 0xeb, 0x54, 0xb3, 0x8f, 0x4e, 0x16, 0xfa, 0x22, 0xa5, 0x77, 0x09, 0x61,
            0xd6, 0x2a, 0x53, 0x37, 0x45, 0xc1, 0x6c, 0xae, 0xef, 0x70, 0x08, 0x99, 0x8b, 0x1d, 0xf2, 0xb4,
            0xe9, 0xc7, 0x9f, 0x4a, 0x31, 0x25, 0xfe, 0x7c, 0xd3, 0xa2, 0xbd, 0x56, 0x14, 0x88, 0x60, 0x0b,
            0xcd, 0xe2, 0x34, 0x50, 0x9e, 0xdc, 0x11, 0x05, 0x2b, 0xb7, 0xa9, 0x48, 0xff, 0x66, 0x8a, 0x73,
            0x03, 0x75, 0x86, 0xf1, 0x6a, 0xa7, 0x40, 0xc2, 0xb9, 0x2c, 0xdb, 0x1f, 0x58, 0x94, 0x3e, 0xed,
            0xfc, 0x1b, 0xa0, 0x04, 0xb8, 0x8d, 0xe6, 0x59, 0x62, 0x93, 0x35, 0x7e, 0xca, 0x21, 0xdf, 0x47,
            0x15, 0xf3, 0xba, 0x7f, 0xa6, 0x69, 0xc8, 0x4d, 0x87, 0x3b, 0x9c, 0x01, 0xe0, 0xde, 0x24, 0x52,
            0x7b, 0x0c, 0x68, 0x1e, 0x80, 0xb2, 0x5a, 0xe7, 0xad, 0xd5, 0x23, 0xf4, 0x46, 0x3f, 0x91, 0xc9,
            0x6e, 0x84, 0x72, 0xbb, 0x0d, 0x18, 0xd9, 0x96, 0xf0, 0x5f, 0x41, 0xac, 0x27, 0xc5, 0xe3, 0x3a,
            0x81, 0x6f, 0x07, 0xa3, 0x79, 0xf6, 0x2d, 0x38, 0x1a, 0x44, 0x5e, 0xb5, 0xd2, 0xec, 0xcb, 0x90,
            0x9a, 0x36, 0xe5, 0x29, 0xc3, 0x4f, 0xab, 0x64, 0x51, 0xf8, 0x10, 0xd7, 0xbc, 0x02, 0x7d, 0x8e
    };

    static int sBox1[] = {
            0x6c, 0xda, 0xc3, 0xe9, 0x4e, 0x9d, 0x0a, 0x3d, 0xb8, 0x36, 0xb4, 0x38, 0x13, 0x34, 0x0c, 0xd9,
            0xbf, 0x74, 0x94, 0x8f, 0xb7, 0x9c, 0xe5, 0xdc, 0x9e, 0x07, 0x49, 0x4f, 0x98, 0x2c, 0xb0, 0x93,
            0x12, 0xeb, 0xcd, 0xb3, 0x92, 0xe7, 0x41, 0x60, 0xe3, 0x21, 0x27, 0x3b, 0xe6, 0x19, 0xd2, 0x0e,
            0x91, 0x11, 0xc7, 0x3f, 0x2a, 0x8e, 0xa1, 0xbc, 0x2b, 0xc8, 0xc5, 0x0f, 0x5b, 0xf3, 0x87, 0x8b,
            0xfb, 0xf5, 0xde, 0x20, 0xc6, 0xa7, 0x84, 0xce, 0xd8, 0x65, 0x51, 0xc9, 0xa4, 0xef, 0x43, 0x53,
            0x25, 0x5d, 0x9b, 0x31, 0xe8, 0x3e, 0x0d, 0xd7, 0x80, 0xff, 0x69, 0x8a, 0xba, 0x0b, 0x73, 0x5c,
            0x6e, 0x54, 0x15, 0x62, 0xf6, 0x35, 0x30, 0x52, 0xa3, 0x16, 0xd3, 0x28, 0x32, 0xfa, 0xaa, 0x5e,
            0xcf, 0xea, 0xed, 0x78, 0x33, 0x58, 0x09, 0x7b, 0x63, 0xc0, 0xc1, 0x46, 0x1e, 0xdf, 0xa9, 0x99,
            0x55, 0x04, 0xc4, 0x86, 0x39, 0x77, 0x82, 0xec, 0x40, 0x18, 0x90, 0x97, 0x59, 0xdd, 0x83, 0x1f,
            0x9a, 0x37, 0x06, 0x24, 0x64, 0x7c, 0xa5, 0x56, 0x48, 0x08, 0x85, 0xd0, 0x61, 0x26, 0xca, 0x6f,
            0x7e, 0x6a, 0xb6, 0x71, 0xa0, 0x70, 0x05, 0xd1, 0x45, 0x8c, 0x23, 0x1c, 0xf0, 0xee, 0x89, 0xad,
            0x7a, 0x4b, 0xc2, 0x2f, 0xdb, 0x5a, 0x4d, 0x76, 0x67, 0x17, 0x2d, 0xf4, 0xcb, 0xb1, 0x4a, 0xa8,
            0xb5, 0x22, 0x47, 0x3a, 0xd5, 0x10, 0x4c, 0x72, 0xcc, 0x00, 0xf9, 0xe0, 0xfd, 0xe2, 0xfe, 0xae,
            0xf8, 0x5f, 0xab, 0xf1, 0x1b, 0x42, 0x81, 0xd6, 0xbe, 0x44, 0x29, 0xa6, 0x57, 0xb9, 0xaf, 0xf2,
            0xd4, 0x75, 0x66, 0xbb, 0x68, 0x9f, 0x50, 0x02, 0x01, 0x3c, 0x7f, 0x8d, 0x1a, 0x88, 0xbd, 0xac,
            0xf7, 0xe4, 0x79, 0x96, 0xa2, 0xfc, 0x6d, 0xb2, 0x6b, 0x03, 0xe1, 0x2e, 0x7d, 0x14, 0x95, 0x1d
    };

    static int[] CONs = { 0xf56b7aeb, 0x994a8a42, 0x96a4bd75, 0xfa854521,
            0x735b768a, 0x1f7abac4, 0xd5bc3b45, 0xb99d5d62,
            0x52d73592, 0x3ef636e5, 0xc57a1ac9, 0xa95b9b72,
            0x5ab42554, 0x369555ed, 0x1553ba9a, 0x7972b2a2,
            0xe6b85d4d, 0x8a995951, 0x4b550696, 0x2774b4fc,
            0xc9bb034b, 0xa59a5a7e, 0x88cc81a5, 0xe4ed2d3f,
            0x7c6f68e2, 0x104e8ecb, 0xd2263471, 0xbe07c765,
            0x511a3208, 0x3d3bfbe6, 0x1084b134, 0x7ca565a7,
            0x304bf0aa, 0x5c6aaa87, 0xf4347855, 0x9815d543,
            0x4213141a, 0x2e32f2f5, 0xcd180a0d, 0xa139f97a,
            0x5e852d36, 0x32a464e9, 0xc353169b, 0xaf72b274,
            0x8db88b4d, 0xe199593a, 0x7ed56d96, 0x12f434c9,
            0xd37b36cb, 0xbf5a9a64, 0x85ac9b65, 0xe98d4d32,
            0x7adf6582, 0x16fe3ecd, 0xd17e32c1, 0xbd5f9f66,
            0x50b63150, 0x3c9757e7, 0x1052b098, 0x7c73b3a7
    };

    public static int[] GFN_(int[] keys, int[] input, int rounds){
        int[] y = input;
        for (int i = 0; i<rounds; i++){
            y[1] = y[1] ^ joinHexadecimals(f0(keys[2*i], y[0]));
            y[3] = y[3] ^ joinHexadecimals(f1(keys[2*i + 1], y[2]));
            y = new int[]{y[1], y[2], y[3], y[0]};
        }
        return new int[] {y[3], y[0], y[1], y[2]};
    }

    public static int[] f0(int key, int x){
        int[] t = splitIntIn4(x ^ key);
        t[0] = sBox0[t[0]];
        t[1] = sBox1[t[1]];
        t[2] = sBox0[t[2]];
        t[3] = sBox1[t[3]];
        int[] y = new int[4];
        y[0] = t[0] ^ mul2(t[1]) ^ mul4(t[2]) ^ mul6(t[3]);
        y[1] = mul2(t[0]) ^ t[1] ^ mul6(t[2]) ^ mul4(t[3]);
        y[2] = mul4(t[0]) ^ mul6(t[1]) ^ t[2] ^ mul2(t[3]);
        y[3] = mul6(t[0]) ^ mul4(t[1]) ^ mul2(t[2]) ^ t[3];
        return y;
    }

    public static int[] f1(int key, int x){
        int[] t = splitIntIn4(x ^ key);
        t[0] = sBox1[t[0]];
        t[1] = sBox0[t[1]];
        t[2] = sBox1[t[2]];
        t[3] = sBox0[t[3]];
        int[] y = new int[4];
        y[0] = t[0] ^ mul8(t[1]) ^ mul2(t[2]) ^ mulA(t[3]);
        y[1] = mul8(t[0]) ^ t[1] ^ mulA(t[2]) ^ mul2(t[3]);
        y[2] = mul2(t[0]) ^ mulA(t[1]) ^ t[2] ^ mul8(t[3]);
        y[3] = mulA(t[0]) ^ mul2(t[1]) ^ mul8(t[2]) ^ t[3];
        return y;
    }

    public static int[] splitIntIn4(int x){
        int c0 = (x & 0xFF000000) >> 24;
        int c1 = (x & 0x00FF0000) >> 16;
        int c2 = (x & 0x0000FF00) >> 8;
        int c3 = (x & 0x000000FF);
        return new int[] {c0 >= 0 ? c0 : c0 + 256, c1 >= 0 ? c1 : c1 + 256, c2 >= 0 ? c2 : c2 + 256, c3 >= 0 ? c3 : c3 + 256};
    }

    public static int joinHexadecimals(int[] x){
        return x[0] << 24 | x[1] << 16 | x[2] << 8 | x[3];
    }

    //multiplicación sobre un campo de galois GF(2^8)
    public static int mul2(int x){
        if((x & 0x80) > 0){
            x = x ^ 0x0e;
        }
        int res = ((x << 1) | (x >> 7));
        if(res > 256) {
            res &= 0xff;
        }
        return res;
    }

    public static int mul4(int x) { return mul2(mul2(x)); }

    public static int mul6(int x) { return mul2(x) ^ mul4(x); }

    public static int mul8(int x) { return mul2(mul4(x)); }

    public static int mulA(int x) { return mul2(x) ^ mul8(x);}

    public static int[] generateKeys(int[] keys){
        int[] L = GFN_(CONs, new int[]{keys[0], keys[1], keys[2], keys[3]}, 12);
        int[] T = new int[4];
        int[] RKs = new int[36];
        for(int i = 0; i <= 8; i++){
            T[0] = L[0] ^ CONs[24 + 4*i];
            T[1] = L[1] ^ CONs[24 + 4*i+1];
            T[2] = L[2] ^ CONs[24 + 4*i+2];
            T[3] = L[3] ^ CONs[24 + 4*i+3];
            L = sigma(L);
            if(i % 2 == 1){
                T[0] ^= keys[0];
                T[1] ^= keys[1];
                T[2] ^= keys[2];
                T[3] ^= keys[3];
            }
            RKs[4*i] = T[0];
            RKs[4*i+1] = T[1];
            RKs[4*i+2] = T[2];
            RKs[4*i+3] = T[3];
        }
        return RKs;
    }

    public static int[] sigma(int[] L){
        int[] res = new int[4];
        res[0] = ((L[0] & 0x01ffffff) << 7) | ((L[1] & 0xfe000000) >>> 25);
        res[1] = ((L[1] & 0x01ffffff) << 7) | ((L[3] & 0x0000007f));
        res[2] = (L[0] & 0xfe000000) | ((L[2] & 0xffffff80) >>> 7);
        res[3] = ((L[2] & 0x0000007f) << 25) | ((L[3] & 0xffffff80) >>> 7);
        return res;
    }

    public static int[] clefia(int[] keys, int[] P){
        int[] RKs = generateKeys(keys);
        int[] T = new int[] {P[0], P[1] ^ keys[0], P[2], P[3] ^ keys[1]};
        T = GFN_(RKs, T, 18);
        return new int[] {T[0], T[1] ^ keys[2], T[2], T[3] ^ keys[3]};
    }
}