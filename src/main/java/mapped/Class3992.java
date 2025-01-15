// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;

public class Class3992 extends Class3833
{
    private static String[] field18011;
    
    public Class3992(final Class9288 class9288) {
        super(class9288);
    }
    
    public int method12141(final Random random) {
        if (this == Class7521.field29180) {
            return Class9546.method35658(random, 0, 2);
        }
        if (this == Class7521.field29294) {
            return Class9546.method35658(random, 3, 7);
        }
        if (this == Class7521.field29408) {
            return Class9546.method35658(random, 3, 7);
        }
        if (this != Class7521.field29214) {
            return (this != Class7521.field29474) ? 0 : Class9546.method35658(random, 2, 5);
        }
        return Class9546.method35658(random, 2, 5);
    }
    
    @Override
    public void method11831(final Class7096 class7096, final Class1847 class7097, final Class354 class7098, final Class8321 class7099) {
        super.method11831(class7096, class7097, class7098, class7099);
        if (Class8742.method30195(Class7882.field32366, class7099) == 0) {
            final int method12141 = this.method12141(class7097.field10062);
            if (method12141 > 0) {
                this.method11840(class7097, class7098, method12141);
            }
        }
    }
}
