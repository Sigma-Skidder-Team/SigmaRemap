// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.sourceforge.jaad.aac.AACException;

public class Class7841 implements Class7842
{
    private static final boolean[] field32100;
    private static final int field32101 = 4;
    private static final int field32102 = 2;
    
    private Class7841() {
    }
    
    private static int method25332(final Class8157 class8157, final int[][] array) throws AACException {
        int n = 0;
        int n3;
        for (int n2 = array[n][0], i = class8157.method26940(n2); i != array[n][1]; ++n, n3 = array[n][0] - n2, n2 = array[n][0], i = (i << n3 | class8157.method26940(n3))) {}
        return n;
    }
    
    private static void method25333(final Class8157 class8157, final int[] array, final int n, final int n2) throws AACException {
        for (int i = n; i < n + n2; ++i) {
            if (array[i] != 0) {
                if (class8157.method26942()) {
                    array[i] = -array[i];
                }
            }
        }
    }
    
    private static int method25334(final Class8157 class8157, final int n) throws AACException {
        final boolean b = n < 0;
        int n2 = 4;
        while (class8157.method26942()) {
            ++n2;
        }
        final int n3 = class8157.method26940(n2) | 1 << n2;
        return b ? (-n3) : n3;
    }
    
    public static int method25335(final Class8157 class8157) throws AACException {
        return Class7841.field32114[method25332(class8157, Class7841.field32114)][2];
    }
    
    public static void method25336(final Class8157 class8157, final int i, final int[] array, final int n) throws AACException {
        final int[][] array2 = Class7841.field32115[i - 1];
        final int method25332 = method25332(class8157, array2);
        array[n] = array2[method25332][2];
        array[n + 1] = array2[method25332][3];
        if (i < 5) {
            array[n + 2] = array2[method25332][4];
            array[n + 3] = array2[method25332][5];
        }
        if (i >= 11) {
            if (i != 11 && i <= 15) {
                throw new Class2348("Huffman: unknown spectral codebook: " + i);
            }
            method25333(class8157, array, n, (i >= 5) ? 2 : 4);
            if (Math.abs(array[n]) == 16) {
                array[n] = method25334(class8157, array[n]);
            }
            if (Math.abs(array[n + 1]) == 16) {
                array[n + 1] = method25334(class8157, array[n + 1]);
            }
        }
        else if (Class7841.field32100[i - 1]) {
            method25333(class8157, array, n, (i >= 5) ? 2 : 4);
        }
    }
    
    static {
        field32100 = new boolean[] { false, false, true, true, false, false, true, true, true, true, true };
    }
}
