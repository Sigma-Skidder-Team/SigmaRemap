// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;

public final class Class8488
{
    private static String[] field34831;
    private final byte[] field34832;
    public final double field34833;
    public final double field34834;
    public final double field34835;
    
    public Class8488(final Random random) {
        this.field34833 = random.nextDouble() * 256.0;
        this.field34834 = random.nextDouble() * 256.0;
        this.field34835 = random.nextDouble() * 256.0;
        this.field34832 = new byte[256];
        for (int i = 0; i < 256; ++i) {
            this.field34832[i] = (byte)i;
        }
        for (int j = 0; j < 256; ++j) {
            final int nextInt = random.nextInt(256 - j);
            final byte b = this.field34832[j];
            this.field34832[j] = this.field34832[j + nextInt];
            this.field34832[j + nextInt] = b;
        }
    }
    
    public double method28343(final double n, final double n2, final double n3, final double n4, final double a) {
        final double n5 = n + this.field34833;
        final double n6 = n2 + this.field34834;
        final double n7 = n3 + this.field34835;
        final int method35644 = Class9546.method35644(n5);
        final int method35645 = Class9546.method35644(n6);
        final int method35646 = Class9546.method35644(n7);
        final double n8 = n5 - method35644;
        final double b = n6 - method35645;
        final double n9 = n7 - method35646;
        final double method35647 = Class9546.method35704(n8);
        final double method35648 = Class9546.method35704(b);
        final double method35649 = Class9546.method35704(n9);
        double n10;
        if (n4 == 0.0) {
            n10 = 0.0;
        }
        else {
            n10 = Class9546.method35644(Math.min(a, b) / n4) * n4;
        }
        return this.method28346(method35644, method35645, method35646, n8, b - n10, n9, method35647, method35648, method35649);
    }
    
    private static double method28344(final int n, final double n2, final double n3, final double n4) {
        return Class8820.method30764(Class8820.field37087[n & 0xF], n2, n3, n4);
    }
    
    private int method28345(final int n) {
        return this.field34832[n & 0xFF] & 0xFF;
    }
    
    public double method28346(final int n, final int n2, final int n3, final double n4, final double n5, final double n6, final double n7, final double n8, final double n9) {
        final int n10 = this.method28345(n) + n2;
        final int n11 = this.method28345(n10) + n3;
        final int n12 = this.method28345(n10 + 1) + n3;
        final int n13 = this.method28345(n + 1) + n2;
        final int n14 = this.method28345(n13) + n3;
        final int n15 = this.method28345(n13 + 1) + n3;
        return Class9546.method35703(n7, n8, n9, method28344(this.method28345(n11), n4, n5, n6), method28344(this.method28345(n14), n4 - 1.0, n5, n6), method28344(this.method28345(n12), n4, n5 - 1.0, n6), method28344(this.method28345(n15), n4 - 1.0, n5 - 1.0, n6), method28344(this.method28345(n11 + 1), n4, n5, n6 - 1.0), method28344(this.method28345(n14 + 1), n4 - 1.0, n5, n6 - 1.0), method28344(this.method28345(n12 + 1), n4, n5 - 1.0, n6 - 1.0), method28344(this.method28345(n15 + 1), n4 - 1.0, n5 - 1.0, n6 - 1.0));
    }
}
