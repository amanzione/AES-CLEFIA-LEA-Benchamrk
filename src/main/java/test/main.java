package test;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.profile.GCProfiler;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

@State(Scope.Thread)
public class main {

//    @Param({"1", "5","10", "50", "100"})
//    public int params;


//    @Benchmark
//    @BenchmarkMode(Mode.Throughput)
//    @OutputTimeUnit(TimeUnit.NANOSECONDS)
//    public int doDynamic(){
//        return dynamic(params);
//    }

    //AES test values
//    @Benchmark
//    @BenchmarkMode(Mode.Throughput)
//    @OutputTimeUnit(TimeUnit.MILLISECONDS)
//    public int[][] aes(){
//        return AES.aes(new int[][]{{0x32, 0x88, 0x31, 0xe0},
//                {0x43, 0x5a, 0x31, 0x37},
//                {0xf6, 0x30, 0x98, 0x07},
//                {0xa8, 0x8d, 0xa2, 0x34}}, new int[][]{{0x2b, 0x28, 0xab, 0x09},
//                {0x7e, 0xae, 0xf7, 0xcf},
//                {0x15, 0xd2, 0x15, 0x4f},
//                {0x16, 0xa6, 0x88, 0x3c}});
//    }

//    @Benchmark
//    @BenchmarkMode(Mode.Throughput)
//    @OutputTimeUnit(TimeUnit.MILLISECONDS)
//    public int[] clefia(){
//        return Clefia.clefia(new int[]{0x2b28ab09, 0x7eaef7cf, 0x15d2154f, 0x16a6883c}, new int[] {0x328831e0, 0x435a3137, 0xf6309807, 0xa88da234});
//    }

//    @Benchmark
//    @BenchmarkMode(Mode.Throughput)
//    @OutputTimeUnit(TimeUnit.MILLISECONDS)
//    public int[] lea(){
//        return LEA.LEA(new int[]{0x2b28ab09, 0x7eaef7cf, 0x15d2154f, 0x16a6883c}, new int[] {0x328831e0, 0x435a3137, 0xf6309807, 0xa88da234});
//    }

    //CLEFIA test values

//    @Benchmark
//    @BenchmarkMode(Mode.Throughput)
//    @OutputTimeUnit(TimeUnit.MILLISECONDS)
//    public int[][] aes(){
//        return AES.aes(new int[][]{{0x00, 0x01, 0x02, 0x03},
//                {0x04, 0x05, 0x06, 0x07},
//                {0x08, 0x09, 0x0a, 0x0b},
//                {0x0c, 0x0d, 0x0e, 0x0f}}, new int[][]{{0xff, 0xee, 0xdd, 0xcc},
//                {0xbb, 0xaa, 0x99, 0x88},
//                {0x77, 0x66, 0x55, 0x44},
//                {0x33, 0x22, 0x11, 0x00}});
//    }

//    @Benchmark
//    @BenchmarkMode(Mode.Throughput)
//    @OutputTimeUnit(TimeUnit.MILLISECONDS)
//    public int[] clefia(){
//        return Clefia.clefia(new int[]{0xffeeddcc, 0xbbaa9988, 0x77665544, 0x33221100}, new int[] {0x00010203,0x04050607, 0x08090a0b, 0x0c0d0e0f});
//    }

//    @Benchmark
//    @BenchmarkMode(Mode.Throughput)
//    @OutputTimeUnit(TimeUnit.MILLISECONDS)
//    public int[] lea(){
//        return LEA.LEA(new int[]{0xccddeeff, 0x8899aabb, 0x44556677, 0x00112233}, new int[] {0x03020100,0x07060504, 0x0b0a0908, 0x0f0e0d0c});
//    }


    // LEA test values

    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public int[][] aes(){
        return AES.aes(new int[][]{{0x10, 0x11, 0x12, 0x13},
                {0x14, 0x15, 0x16, 0x17},
                {0x18, 0x19, 0x1a, 0x1b},
                {0x1c, 0x1d, 0x1e, 0x1f}}, new int[][]{{0x0f, 0x1e, 0x2d, 0x3c},
                {0x4b, 0x5a, 0x69, 0x78},
                {0x87, 0x96, 0xa5, 0xb4},
                {0xc3, 0xd2, 0xe1, 0xf0}});
    }

    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public int[] clefia(){
        return Clefia.clefia(new int[]{0x0f1e2d3c, 0x4b5a6978, 0x8796a5b4, 0xc3d2e1f0}, new int[] {0x10111213,0x14151617, 0x18191a1b, 0x1c1d1e1f});
    }


    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public int[] lea(){
        return LEA.LEA(new int[] {0x3c2d1e0f, 0x78695a4b, 0xb4a59687, 0xf0e1d2c3}, new int[] {0x13121110, 0x17161514, 0x1b1a1918, 0x1f1e1d1c});
    }



    static int dynamic(int number) {
        if(number < 1 ) return 0;
        int[] fibs = new int[number + 1];
        fibs[0] = 1;
        fibs[1] = 1;
        for(int i = 2; i <= number; ++i) {
            fibs[i] = fibs[i - 1] + fibs[i - 2];
        }
        return fibs[number];
    }
    public static void main(String[] args) throws IOException, RunnerException {
        Options opt = new OptionsBuilder()
                .include(main.class.getSimpleName())
                //.forks(2)
                //.warmupIterations(5)
                //.measurementIterations(6)
                //.addProfiler(StackProfiler.class)
                .addProfiler(GCProfiler.class)
                .build();

        new Runner(opt).run();
    }
}
