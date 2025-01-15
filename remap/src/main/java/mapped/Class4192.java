// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;
import net.sourceforge.jaad.aac.AACException;
import java.util.logging.Level;

public class Class4192 implements Class4178, Class4191, Class4194, Class4193
{
    private static final int field18743 = 60;
    private static final int field18744 = 200;
    private static int field18745;
    private final int field18746;
    private final Class4182 field18747;
    private final int[] field18748;
    private final int[] field18749;
    private final float[] field18750;
    private final float[] field18751;
    private int field18752;
    private boolean field18753;
    private boolean field18754;
    private boolean field18755;
    private Class4180 field18756;
    private Class6689 field18757;
    private int[] field18758;
    private int[] field18759;
    private int field18760;
    private int field18761;
    private boolean field18762;
    private int field18763;
    private int field18764;
    private Class7337 field18765;
    
    public Class4192(final int field18746) {
        this.field18746 = field18746;
        this.field18747 = new Class4182(field18746);
        this.field18748 = new int[120];
        this.field18749 = new int[120];
        this.field18750 = new float[field18746];
        this.field18751 = new float[120];
    }
    
    public void method12582(final Class8157 class8157, final boolean b, final Class4179 class8158) throws AACException {
        if (class8158.method12539()) {
            if (this.field18765 == null) {
                this.field18765 = new Class7337();
            }
        }
        final boolean method8029 = class8158.method12531().method8029();
        this.field18752 = class8157.method26940(8);
        if (!b) {
            this.field18747.method12547(class8157, class8158, b);
        }
        this.method12583(class8157, class8158.method12540());
        this.method12585(class8157);
        if (this.field18753 = class8157.method26942()) {
            if (this.field18747.method12557()) {
                throw new Class2348("pulse data not allowed for short frames");
            }
            Class4192.field18616.log(Level.FINE, "PULSE");
            this.method12584(class8157);
        }
        if (this.field18754 = class8157.method26942()) {
            if (!method8029) {
                if (this.field18756 == null) {
                    this.field18756 = new Class4180();
                }
                this.field18756.method12545(class8157, this.field18747);
            }
        }
        if (this.field18755 = class8157.method26942()) {
            if (this.field18757 == null) {
                this.field18757 = new Class6689(this.field18746);
            }
            Class4192.field18616.log(Level.FINE, "GAIN");
            this.field18757.method20340(class8157, this.field18747.method12556());
        }
        if (!class8158.method12541()) {
            this.method12586(class8157);
        }
        else {
            this.field18763 = Math.max(class8157.method26940(14), (class8158.method12520() != Class2001.field11210) ? 12288 : 6144);
            this.field18764 = Math.max(class8157.method26940(6), 49);
        }
    }
    
    public void method12583(final Class8157 class8157, final boolean b) throws AACException {
        Arrays.fill(this.field18748, 0);
        Arrays.fill(this.field18749, 0);
        final int n = this.field18747.method12557() ? 3 : 5;
        final int n2 = (1 << n) - 1;
        final int method12554 = this.field18747.method12554();
        final int method12555 = this.field18747.method12549();
        int n3 = 0;
        for (int i = 0; i < method12554; ++i) {
            int j = 0;
            while (j < method12555) {
                int n4 = j;
                final int method12556 = class8157.method26940(4);
                if (method12556 == 12) {
                    throw new Class2348("invalid huffman codebook: 12");
                }
                int method12557;
                while ((method12557 = class8157.method26940(n)) == n2) {
                    n4 += method12557;
                }
                final int k = n4 + method12557;
                if (k > method12555) {
                    throw new Class2348("too many bands: " + k + ", allowed: " + method12555);
                }
                while (j < k) {
                    this.field18748[n3] = method12556;
                    this.field18749[n3++] = k;
                    ++j;
                }
            }
        }
    }
    
    private void method12584(final Class8157 class8157) throws AACException {
        this.field18760 = class8157.method26940(2) + 1;
        this.field18761 = class8157.method26940(6);
        if (this.field18761 < this.field18747.method12550()) {
            if (this.field18758 == null || this.field18760 != this.field18758.length) {
                this.field18758 = new int[this.field18760];
                this.field18759 = new int[this.field18760];
            }
            this.field18758[0] = this.field18747.method12551()[this.field18761];
            final int[] field18758 = this.field18758;
            final int n = 0;
            field18758[n] += class8157.method26940(5);
            this.field18759[0] = class8157.method26940(4);
            for (int i = 1; i < this.field18760; ++i) {
                this.field18758[i] = class8157.method26940(5) + this.field18758[i - 1];
                if (this.field18758[i] > 1023) {
                    throw new Class2348("pulse offset out of range: " + this.field18758[0]);
                }
                this.field18759[i] = class8157.method26940(4);
            }
            return;
        }
        throw new Class2348("pulse SWB out of range: " + this.field18761 + " > " + this.field18747.method12550());
    }
    
    public void method12585(final Class8157 class8157) throws AACException {
        final int method12554 = this.field18747.method12554();
        final int method12555 = this.field18747.method12549();
        final int[] array = { this.field18752, this.field18752 - 90, 0 };
        int n = 1;
        int n2 = 0;
        for (int i = 0; i < method12554; ++i) {
            int j = 0;
            while (j < method12555) {
                final int n3 = this.field18749[n2];
                switch (this.field18748[n2]) {
                    case 0: {
                        while (j < n3) {
                            this.field18751[n2] = 0.0f;
                            ++j;
                            ++n2;
                        }
                        continue;
                    }
                    case 14:
                    case 15: {
                        while (j < n3) {
                            final int[] array2 = array;
                            final int n4 = 2;
                            array2[n4] += Class7841.method25335(class8157) - 60;
                            this.field18751[n2] = Class4192.field18767[-Math.min(Math.max(array[2], -155), 100) + 200];
                            ++j;
                            ++n2;
                        }
                        continue;
                    }
                    case 13: {
                        while (j < n3) {
                            if (n != 0) {
                                final int[] array3 = array;
                                final int n5 = 1;
                                array3[n5] += class8157.method26940(9) - 256;
                                n = 0;
                            }
                            else {
                                final int[] array4 = array;
                                final int n6 = 1;
                                array4[n6] += Class7841.method25335(class8157) - 60;
                            }
                            this.field18751[n2] = -Class4192.field18767[Math.min(Math.max(array[1], -100), 155) + 200];
                            ++j;
                            ++n2;
                        }
                        continue;
                    }
                    default: {
                        while (j < n3) {
                            final int[] array5 = array;
                            final int n7 = 0;
                            array5[n7] += Class7841.method25335(class8157) - 60;
                            if (array[0] > 255) {
                                throw new Class2348("scalefactor out of range: " + array[0]);
                            }
                            this.field18751[n2] = Class4192.field18767[array[0] - 100 + 200];
                            ++j;
                            ++n2;
                        }
                        continue;
                    }
                }
            }
        }
    }
    
    private void method12586(final Class8157 class8157) throws AACException {
        Arrays.fill(this.field18750, 0.0f);
        final int method12549 = this.field18747.method12549();
        final int method12550 = this.field18747.method12554();
        final int[] method12551 = this.field18747.method12551();
        final int[] array = new int[4];
        int n = 0;
        int n2 = 0;
        for (int i = 0; i < method12550; ++i) {
            final int method12552 = this.field18747.method12555(i);
            for (int j = 0; j < method12549; ++j, ++n2) {
                final int n3 = this.field18748[n2];
                int fromIndex = n + method12551[j];
                final int n4 = method12551[j + 1] - method12551[j];
                if (n3 != 0) {
                    if (n3 != 15) {
                        if (n3 != 14) {
                            if (n3 != 13) {
                                for (int k = 0; k < method12552; ++k, fromIndex += 128) {
                                    for (int n5 = (n3 < 5) ? 4 : 2, l = 0; l < n4; l += n5) {
                                        Class7841.method25336(class8157, n3, array, 0);
                                        for (int n6 = 0; n6 < n5; ++n6) {
                                            this.field18750[fromIndex + l + n6] = ((array[n6] <= 0) ? (-Class4192.field18766[-array[n6]]) : Class4192.field18766[array[n6]]);
                                            final float[] field18750 = this.field18750;
                                            final int n7 = fromIndex + l + n6;
                                            field18750[n7] *= this.field18751[n2];
                                        }
                                    }
                                }
                                continue;
                            }
                            for (int n8 = 0; n8 < method12552; ++n8, fromIndex += 128) {
                                float n9 = 0.0f;
                                for (int n10 = 0; n10 < n4; ++n10) {
                                    Class4192.field18745 *= 1015568748;
                                    this.field18750[fromIndex + n10] = (float)Class4192.field18745;
                                    n9 += this.field18750[fromIndex + n10] * this.field18750[fromIndex + n10];
                                }
                                final float n11 = (float)(this.field18751[n2] / Math.sqrt(n9));
                                for (int n12 = 0; n12 < n4; ++n12) {
                                    final float[] field18751 = this.field18750;
                                    final int n13 = fromIndex + n12;
                                    field18751[n13] *= n11;
                                }
                            }
                            continue;
                        }
                    }
                }
                for (int n14 = 0; n14 < method12552; ++n14, fromIndex += 128) {
                    Arrays.fill(this.field18750, fromIndex, fromIndex + n4, 0.0f);
                }
            }
            n += method12552 << 7;
        }
    }
    
    public float[] method12587() throws AACException {
        return this.field18750;
    }
    
    public Class4182 method12588() {
        return this.field18747;
    }
    
    public int[] method12589() {
        return this.field18749;
    }
    
    public int[] method12590() {
        return this.field18748;
    }
    
    public float[] method12591() {
        return this.field18751;
    }
    
    public boolean method12592() {
        return this.field18754;
    }
    
    public Class4180 method12593() {
        return this.field18756;
    }
    
    public int method12594() {
        return this.field18752;
    }
    
    public boolean method12595() {
        return this.field18762;
    }
    
    public int method12596() {
        return this.field18764;
    }
    
    public int method12597() {
        return this.field18763;
    }
    
    public boolean method12598() {
        return this.field18755;
    }
    
    public Class6689 method12599() {
        return this.field18757;
    }
    
    static {
        Class4192.field18745 = 523124044;
    }
}
