// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4201 implements Class4198
{
    private static String[] field18926;
    
    public static int method12636(final Class4197 class4197, final int n) {
        final int[] array = new int[6];
        array[0] = class4197.field18783 * class4197.field18801[n];
        array[class4197.field18805[n]] = class4197.field18783 * class4197.field18802[n];
        Label_0573: {
            switch (class4197.field18883[n]) {
                case 0: {
                    switch (class4197.field18805[n]) {
                        case 4: {
                            final int n2 = class4197.field18855 / 4;
                            array[3] = class4197.field18783 * 3 * n2;
                            array[2] = class4197.field18783 * 2 * n2;
                            array[1] = class4197.field18783 * n2;
                            break Label_0573;
                        }
                        case 2: {
                            array[1] = class4197.field18783 * (class4197.field18855 / 2);
                            break Label_0573;
                        }
                        default: {
                            break Label_0573;
                        }
                    }
                    break;
                }
                case 1: {
                    if (class4197.field18805[n] > 1) {
                        int n3 = class4197.field18805[n];
                        int n4 = class4197.field18802[n];
                        for (int i = 0; i < class4197.field18805[n] - 1; ++i) {
                            if (n4 < class4197.field18884[n][i]) {
                                return 1;
                            }
                            n4 -= class4197.field18884[n][i];
                            array[--n3] = class4197.field18783 * n4;
                        }
                        break;
                    }
                    break;
                }
                case 2: {
                    if (class4197.field18805[n] > 1) {
                        int n5 = 1;
                        int n6 = class4197.field18801[n];
                        for (int j = 0; j < class4197.field18805[n] - 1; ++j) {
                            n6 += class4197.field18884[n][j];
                            if (class4197.field18783 * n6 + class4197.field18857 > class4197.field18854 + class4197.field18856) {
                                return 1;
                            }
                            array[n5++] = class4197.field18783 * n6;
                        }
                        break;
                    }
                    break;
                }
                case 3: {
                    if (class4197.field18890[n] != 0) {
                        int n7 = 1;
                        int n8 = class4197.field18801[n];
                        for (int k = 0; k < class4197.field18890[n]; ++k) {
                            n8 += class4197.field18885[n][k];
                            if (class4197.field18783 * n8 + class4197.field18857 > class4197.field18854 + class4197.field18856) {
                                return 1;
                            }
                            array[n7++] = class4197.field18783 * n8;
                        }
                    }
                    if (class4197.field18891[n] != 0) {
                        int n9 = class4197.field18805[n];
                        int n10 = class4197.field18802[n];
                        for (int l = 0; l < class4197.field18891[n]; ++l) {
                            if (n10 < class4197.field18886[n][l]) {
                                return 1;
                            }
                            n10 -= class4197.field18886[n][l];
                            array[--n9] = class4197.field18783 * n10;
                        }
                        break;
                    }
                    break;
                }
            }
        }
        for (int n11 = 0; n11 < 6; ++n11) {
            class4197.field18808[n][n11] = array[n11];
        }
        return 0;
    }
    
    public static void method12637(final Class4197 class4197, final int n) {
        class4197.field18809[n][0] = class4197.field18808[n][0];
        if (class4197.field18805[n] != 1) {
            class4197.field18809[n][1] = class4197.field18808[n][method12638(class4197, n)];
            class4197.field18809[n][2] = class4197.field18808[n][class4197.field18805[n]];
        }
        else {
            class4197.field18809[n][1] = class4197.field18808[n][1];
            class4197.field18809[n][2] = 0;
        }
    }
    
    private static int method12638(final Class4197 class4197, final int n) {
        int n2 = 0;
        switch (class4197.field18883[n]) {
            case 0: {
                n2 = class4197.field18805[n] / 2;
                break;
            }
            case 2: {
                if (class4197.field18887[n] == 0) {
                    n2 = 1;
                    break;
                }
                if (class4197.field18887[n] == 1) {
                    n2 = class4197.field18805[n] - 1;
                    break;
                }
                n2 = class4197.field18887[n] - 1;
                break;
            }
            case 1:
            case 3: {
                if (class4197.field18887[n] > 1) {
                    n2 = class4197.field18805[n] + 1 - class4197.field18887[n];
                    break;
                }
                n2 = class4197.field18805[n] - 1;
                break;
            }
        }
        return (n2 > 0) ? n2 : false;
    }
}
