// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

import java.util.Random;

public class Class8820
{
    private static String[] field37086;
    public static final int[][] field37087;
    private static final double field37088;
    private static final double field37089;
    private static final double field37090;
    private final int[] field37091;
    public final double field37092;
    public final double field37093;
    public final double field37094;
    
    public Class8820(final Random random) {
        this.field37091 = new int[512];
        this.field37092 = random.nextDouble() * 256.0;
        this.field37093 = random.nextDouble() * 256.0;
        this.field37094 = random.nextDouble() * 256.0;
        for (int i = 0; i < 256; this.field37091[i] = i++) {}
        for (int j = 0; j < 256; ++j) {
            final int nextInt = random.nextInt(256 - j);
            final int n = this.field37091[j];
            this.field37091[j] = this.field37091[nextInt + j];
            this.field37091[nextInt + j] = n;
        }
    }
    
    private int method30763(final int n) {
        return this.field37091[n & 0xFF];
    }
    
    public static double method30764(final int[] array, final double n, final double n2, final double n3) {
        return array[0] * n + array[1] * n2 + array[2] * n3;
    }
    
    private double method30765(final int n, final double n2, final double n3, final double n4, final double n5) {
        final double n6 = n5 - n2 * n2 - n3 * n3 - n4 * n4;
        double n8;
        if (n6 >= 0.0) {
            final double n7 = n6 * n6;
            n8 = n7 * n7 * method30764(Class8820.field37087[n], n2, n3, n4);
        }
        else {
            n8 = 0.0;
        }
        return n8;
    }
    
    public double method30766(final double n, final double n2) {
        final double n3 = (n + n2) * Class8820.field37089;
        final int method35644 = MathHelper.floor(n + n3);
        final int method35645 = MathHelper.floor(n2 + n3);
        final double n4 = (method35644 + method35645) * Class8820.field37090;
        final double n5 = method35644 - n4;
        final double n6 = method35645 - n4;
        final double n7 = n - n5;
        final double n8 = n2 - n6;
        int n9;
        int n10;
        if (n7 <= n8) {
            n9 = 0;
            n10 = 1;
        }
        else {
            n9 = 1;
            n10 = 0;
        }
        final double n11 = n7 - n9 + Class8820.field37090;
        final double n12 = n8 - n10 + Class8820.field37090;
        final double n13 = n7 - 1.0 + 2.0 * Class8820.field37090;
        final double n14 = n8 - 1.0 + 2.0 * Class8820.field37090;
        final int n15 = method35644 & 0xFF;
        final int n16 = method35645 & 0xFF;
        return 70.0 * (this.method30765(this.method30763(n15 + this.method30763(n16)) % 12, n7, n8, 0.0, 0.5) + this.method30765(this.method30763(n15 + n9 + this.method30763(n16 + n10)) % 12, n11, n12, 0.0, 0.5) + this.method30765(this.method30763(n15 + 1 + this.method30763(n16 + 1)) % 12, n13, n14, 0.0, 0.5));
    }
    
    public double method30767(final double n, final double n2, final double n3) {
        final double n4 = (n + n2 + n3) * 0.3333333333333333;
        final int method35644 = MathHelper.floor(n + n4);
        final int method35645 = MathHelper.floor(n2 + n4);
        final int method35646 = MathHelper.floor(n3 + n4);
        final double n5 = (method35644 + method35645 + method35646) * 0.16666666666666666;
        final double n6 = method35644 - n5;
        final double n7 = method35645 - n5;
        final double n8 = method35646 - n5;
        final double n9 = n - n6;
        final double n10 = n2 - n7;
        final double n11 = n3 - n8;
        int n12;
        int n13;
        int n14;
        int n15;
        int n16;
        int n17;
        if (n9 < n10) {
            if (n10 >= n11) {
                if (n9 >= n11) {
                    n12 = 0;
                    n13 = 1;
                    n14 = 0;
                    n15 = 1;
                    n16 = 1;
                    n17 = 0;
                }
                else {
                    n12 = 0;
                    n13 = 1;
                    n14 = 0;
                    n15 = 0;
                    n16 = 1;
                    n17 = 1;
                }
            }
            else {
                n12 = 0;
                n13 = 0;
                n14 = 1;
                n15 = 0;
                n16 = 1;
                n17 = 1;
            }
        }
        else if (n10 < n11) {
            if (n9 < n11) {
                n12 = 0;
                n13 = 0;
                n14 = 1;
                n15 = 1;
                n16 = 0;
                n17 = 1;
            }
            else {
                n12 = 1;
                n13 = 0;
                n14 = 0;
                n15 = 1;
                n16 = 0;
                n17 = 1;
            }
        }
        else {
            n12 = 1;
            n13 = 0;
            n14 = 0;
            n15 = 1;
            n16 = 1;
            n17 = 0;
        }
        final double n18 = n9 - n12 + 0.16666666666666666;
        final double n19 = n10 - n13 + 0.16666666666666666;
        final double n20 = n11 - n14 + 0.16666666666666666;
        final double n21 = n9 - n15 + 0.3333333333333333;
        final double n22 = n10 - n16 + 0.3333333333333333;
        final double n23 = n11 - n17 + 0.3333333333333333;
        final double n24 = n9 - 1.0 + 0.5;
        final double n25 = n10 - 1.0 + 0.5;
        final double n26 = n11 - 1.0 + 0.5;
        final int n27 = method35644 & 0xFF;
        final int n28 = method35645 & 0xFF;
        final int n29 = method35646 & 0xFF;
        return 32.0 * (this.method30765(this.method30763(n27 + this.method30763(n28 + this.method30763(n29))) % 12, n9, n10, n11, 0.6) + this.method30765(this.method30763(n27 + n12 + this.method30763(n28 + n13 + this.method30763(n29 + n14))) % 12, n18, n19, n20, 0.6) + this.method30765(this.method30763(n27 + n15 + this.method30763(n28 + n16 + this.method30763(n29 + n17))) % 12, n21, n22, n23, 0.6) + this.method30765(this.method30763(n27 + 1 + this.method30763(n28 + 1 + this.method30763(n29 + 1))) % 12, n24, n25, n26, 0.6));
    }
    
    static {
        field37087 = new int[][] { { 1, 1, 0 }, { -1, 1, 0 }, { 1, -1, 0 }, { -1, -1, 0 }, { 1, 0, 1 }, { -1, 0, 1 }, { 1, 0, -1 }, { -1, 0, -1 }, { 0, 1, 1 }, { 0, -1, 1 }, { 0, 1, -1 }, { 0, -1, -1 }, { 1, 1, 0 }, { 0, -1, 1 }, { -1, 1, 0 }, { 0, -1, -1 } };
        field37088 = Math.sqrt(3.0);
        field37089 = 0.5 * (Class8820.field37088 - 1.0);
        field37090 = (3.0 - Class8820.field37088) / 6.0;
    }
}
