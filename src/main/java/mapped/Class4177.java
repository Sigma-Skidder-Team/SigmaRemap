// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.sourceforge.jaad.aac.AACException;

public class Class4177 extends Class4176 implements Class4178
{
    private static final int field18608 = 0;
    private static final int field18609 = 1;
    private static final int field18610 = 2;
    private static final int field18611 = 11;
    private static final int field18612 = 13;
    private static final int field18613 = 14;
    private final boolean field18614;
    private Class7708 field18615;
    
    public Class4177(final boolean field18614) {
        this.field18614 = field18614;
    }
    
    public void method12516(final Class8157 class8157, final Class4176 class8158, final Class2077 class8159, final boolean b, final boolean b2) throws AACException {
        int method26940 = class8157.method26940(4);
        if (method26940 == 15) {
            method26940 += class8157.method26940(8) - 1;
        }
        final int n;
        int i = n = method26940 * 8;
        final int method26941 = class8157.method26937();
        while (i > 0) {
            i = this.method12517(class8157, i, class8158, class8159, b, b2);
        }
        final int n2 = class8157.method26937() - method26941;
        final int j = n - n2;
        if (j <= 0) {
            if (j < 0) {
                throw new Class2348("FIL element overread: " + j);
            }
        }
        else {
            class8157.method26945(n2);
        }
    }
    
    private int method12517(final Class8157 class8157, final int n, final Class4176 obj, final Class2077 class8158, final boolean b, final boolean b2) throws AACException {
        final int method26940 = class8157.method26940(4);
        int n2 = n - 4;
        switch (method26940) {
            case 11: {
                return this.method12518(class8157, n2);
            }
            case 13:
            case 14: {
                if (!b) {
                    class8157.method26945(n2);
                    n2 = 0;
                    break;
                }
                if (obj instanceof Class4209 || obj instanceof Class4188 || obj instanceof Class4175) {
                    obj.method12513(class8157, class8158, n2, obj instanceof Class4188, method26940 == 14, this.field18614, b2);
                    return 0;
                }
                throw new Class2348("SBR applied on unexpected element: " + obj);
            }
        }
        class8157.method26945(n2);
        return 0;
    }
    
    private int method12518(final Class8157 class8157, final int n) throws AACException {
        if (this.field18615 == null) {
            this.field18615 = new Class7708();
        }
        int n2 = n;
        int n3 = 1;
        if (Class7708.method24588(this.field18615, class8157.method26942())) {
            Class7708.method24589(this.field18615, class8157.method26940(4));
            Class7708.method24590(this.field18615, class8157.method26940(4));
        }
        if (Class7708.method24591(this.field18615, class8157.method26942())) {
            n2 -= this.method12519(class8157);
        }
        if (Class7708.method24592(this.field18615, class8157.method26942())) {
            Class7708.method24593(this.field18615, class8157.method26940(4));
            Class7708.method24594(this.field18615, class8157.method26940(4));
            n2 -= 8;
            n3 += Class7708.method24595(this.field18615);
            Class7708.method24596(this.field18615, new int[n3]);
            for (int i = 0; i < n3; ++i) {
                Class7708.method24597(this.field18615)[i] = class8157.method26940(8);
                n2 -= 8;
            }
        }
        if (Class7708.method24598(this.field18615, class8157.method26942())) {
            Class7708.method24599(this.field18615, class8157.method26940(7));
            Class7708.method24600(this.field18615, class8157.method26940(1));
            n2 -= 8;
        }
        Class7708.method24601(this.field18615, new boolean[n3]);
        Class7708.method24602(this.field18615, new int[n3]);
        for (int j = 0; j < n3; ++j) {
            Class7708.method24603(this.field18615)[j] = class8157.method26942();
            Class7708.method24604(this.field18615)[j] = class8157.method26940(7);
            n2 -= 8;
        }
        return n2;
    }
    
    private int method12519(final Class8157 class8157) throws AACException {
        int n = 0;
        do {
            for (int i = 0; i < 7; ++i) {
                Class7708.method24605(this.field18615)[n] = class8157.method26942();
                ++n;
            }
        } while (n < 57 && class8157.method26942());
        return n / 7 * 8;
    }
}
