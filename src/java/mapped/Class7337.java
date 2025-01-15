// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.sourceforge.jaad.aac.AACException;

public class Class7337 implements Class7338
{
    private static String[] field28338;
    private static final int field28339 = 7;
    
    public void method22522(final Class8157 class8157, final Class4192 class8158, final int[][] array) throws AACException {
        final int n = class8158.method12588().method12557() ? 11 : 9;
        class8157.method26942();
        class8157.method26940(8);
        class8157.method26940(n);
        final Class4182 method12588 = class8158.method12588();
        final int method12589 = method12588.method12554();
        final int method12590 = method12588.method12549();
        final int[][] array2 = null;
        int method12591 = class8158.method12594();
        int n2 = 0;
        int method12592 = method12591 - 90 - 256;
        int n3 = 0;
        int n4 = 0;
        for (int i = 0; i < method12589; ++i) {
            for (int j = 0; j < method12590; ++j) {
                switch (array2[i][j]) {
                    case 0: {
                        array[i][j] = 0;
                        break;
                    }
                    case 14:
                    case 15: {
                        if (n3 == 0) {
                            n3 = 1;
                        }
                        n2 += this.method22524(class8157);
                        array[i][j] = n2;
                        break;
                    }
                    case 13: {
                        if (n4 != 0) {
                            method12592 += this.method22524(class8157);
                            array[i][j] = method12592;
                            break;
                        }
                        n4 = 1;
                        method12592 = this.method22524(class8157);
                        break;
                    }
                    default: {
                        method12591 += this.method22524(class8157);
                        array[i][j] = method12591;
                        break;
                    }
                }
            }
        }
        if (n3 != 0) {
            this.method22524(class8157);
        }
        if (class8157.method26942()) {
            this.method22523(class8157, class8158, array);
        }
    }
    
    private void method22523(final Class8157 class8157, final Class4192 class8158, final int[][] array) throws AACException {
        final Class4182 method12588 = class8158.method12588();
        final int method12589 = method12588.method12554();
        final int method12590 = method12588.method12549();
        final int[][] array2 = null;
        class8157.method26940(8);
        int n = 0;
        for (int i = 0; i < method12589; ++i) {
            for (int j = 0; j < method12590; ++j) {
                if (array2[i][j] == 13 && n == 0) {
                    n = 1;
                }
                else if (Math.abs(array2[i][j]) == 7) {
                    final int method12591 = this.method22525(class8157);
                    if (array2[i][j] != -7) {
                        final int[] array3 = array[i];
                        final int n2 = j;
                        array3[n2] += method12591;
                    }
                    else {
                        final int[] array4 = array[i];
                        final int n3 = j;
                        array4[n3] -= method12591;
                    }
                }
            }
        }
    }
    
    private int method22524(final Class8157 class8157) throws AACException {
        int n = 0;
        int n3;
        for (int n2 = Class7337.field28340[n][1], method26940 = class8157.method26940(n2); method26940 != Class7337.field28340[n][2] && n2 < 10; ++n, n3 = Class7337.field28340[n][1] - n2, n2 += n3, method26940 = (method26940 << n3 | class8157.method26940(n3))) {}
        return Class7337.field28340[n][0];
    }
    
    private int method22525(final Class8157 class8157) throws AACException {
        int n = 0;
        int n3;
        for (int n2 = Class7337.field28341[n][1], method26940 = class8157.method26940(n2); method26940 != Class7337.field28341[n][2] && n2 < 21; ++n, n3 = Class7337.field28341[n][1] - n2, n2 += n3, method26940 = (method26940 << n3 | class8157.method26940(n3))) {}
        return Class7337.field28341[n][0];
    }
}
