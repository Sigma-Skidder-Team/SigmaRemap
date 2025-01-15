// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.mods.util.InDevelopment;

@InDevelopment
public class Class3234 extends Class3167
{
    public Class3234() {
        super(Class8013.field32989, "BedRockFinder", "Finds cords based on bedrock patterns");
    }
    
    @Override
    public void method9879() {
        System.out.println(this.method10206(new int[] { 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0 }, 8, 8, 38, -55));
    }
    
    private Class7835 method10206(final int[] array, final int n, final int n2, final int n3, final int n4) {
        final int[] array2 = new int[2304];
        for (long n5 = -1L; n5 <= 1L; ++n5) {
            for (long n6 = -1L; n6 <= 1L; ++n6) {
                long n7 = (n3 + n6) * 341873128712L + (n4 + n5) * 132897987541L ^ 0x5DEECE66DL;
                for (int i = 0; i < 16; ++i) {
                    for (int j = 0; j < 16; ++j) {
                        final long n8 = n7 * 709490313259657689L + 1748772144486964054L & 0xFFFFFFFFFFFFL;
                        if (4L > (n8 >> 17) % 5L) {
                            array2[(int)((16L * (n5 + 1L) + i) * 48L + (16L * (n6 + 1L) + j))] = 0;
                        }
                        else {
                            array2[(int)((16L * (n5 + 1L) + i) * 48L + (16L * (n6 + 1L) + j))] = 1;
                        }
                        n7 = n8 * 5985058416696778513L - 8542997297661424380L;
                    }
                }
            }
        }
        for (int k = 0; k <= 48 - n; ++k) {
            for (int l = 0; l <= 48 - n2; ++l) {
                int n9 = 1;
                for (int n10 = 0; n10 < n && n9 == 1; ++n10) {
                    for (int n11 = 0; n11 < n2; ++n11) {
                        if (n9 != 1) {
                            break;
                        }
                        if (array[n10 * n2 + n11] != array2[(k + n10) * 48 + (l + n11)]) {
                            n9 = 0;
                            break;
                        }
                        if (n9 == 0) {
                            break;
                        }
                    }
                }
                if (n9 != 0) {
                    return new Class7835(k, l);
                }
            }
        }
        return null;
    }
    
    public static void method10207(final long n, final long n2) {
        long n3 = n * 341873128712L + n2 * 132897987541L ^ 0x5DEECE66DL;
        final char[] s = { '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\n' };
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                final long n4 = n3 * 709490313259657689L + 1748772144486964054L & 0xFFFFFFFFFFFFL;
                if (4L > (n4 >> 17) % 5L) {
                    s[j] = ' ';
                }
                else {
                    s[j] = '*';
                }
                n3 = n4 * 5985058416696778513L - 8542997297661424380L;
            }
            System.out.print(s);
        }
    }
}
