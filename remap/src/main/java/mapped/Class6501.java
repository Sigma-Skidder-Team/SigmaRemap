// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.lang.reflect.Array;
import java.util.ArrayDeque;

public class Class6501
{
    private static ArrayDeque<int[]> field25872;
    private static int field25873;
    
    private static synchronized int[] method19577(final int n) {
        int[] array = Class6501.field25872.pollLast();
        if (array == null || array.length < n) {
            array = new int[n];
        }
        return array;
    }
    
    public static synchronized void method19578(final int[] e) {
        if (Class6501.field25872.size() < Class6501.field25873) {
            Class6501.field25872.add(e);
        }
    }
    
    public static void main(final String[] array) throws Exception {
        final int n = 4096;
        final int n2 = 500000;
        method19580(n, n2);
        method19579(n, n2);
        method19582(n, n2);
        method19581(n, n2);
        method19583(BlockState.class, n, n2);
        final long method19580 = method19580(n, n2);
        final long method19581 = method19579(n, n2);
        final long method19582 = method19582(n, n2);
        final long method19583 = method19581(n, n2);
        final long method19584 = method19583(BlockState.class, n, n2);
        Class8571.method28847("New: " + method19580);
        Class8571.method28847("Clone: " + method19581);
        Class8571.method28847("NewObj: " + method19582);
        Class8571.method28847("CloneObj: " + method19583);
        Class8571.method28847("NewObjDyn: " + method19584);
    }
    
    private static long method19579(final int n, final int n2) {
        final long currentTimeMillis = System.currentTimeMillis();
        final int[] array = new int[n];
        for (int i = 0; i < n2; ++i) {
            final int[] array2 = array.clone();
        }
        return System.currentTimeMillis() - currentTimeMillis;
    }
    
    private static long method19580(final int length, final int n) {
        final long currentTimeMillis = System.currentTimeMillis();
        for (int i = 0; i < n; ++i) {
            final int[] array = (int[])Array.newInstance(Integer.TYPE, length);
        }
        return System.currentTimeMillis() - currentTimeMillis;
    }
    
    private static long method19581(final int n, final int n2) {
        final long currentTimeMillis = System.currentTimeMillis();
        final BlockState[] array = new BlockState[n];
        for (int i = 0; i < n2; ++i) {
            final BlockState[] array2 = array.clone();
        }
        return System.currentTimeMillis() - currentTimeMillis;
    }
    
    private static long method19582(final int n, final int n2) {
        final long currentTimeMillis = System.currentTimeMillis();
        for (int i = 0; i < n2; ++i) {
            final BlockState[] array = new BlockState[n];
        }
        return System.currentTimeMillis() - currentTimeMillis;
    }
    
    private static long method19583(final Class componentType, final int length, final int n) {
        final long currentTimeMillis = System.currentTimeMillis();
        for (int i = 0; i < n; ++i) {
            final Object[] array = (Object[])Array.newInstance(componentType, length);
        }
        return System.currentTimeMillis() - currentTimeMillis;
    }
    
    static {
        Class6501.field25872 = new ArrayDeque<int[]>();
        Class6501.field25873 = 10;
    }
}
