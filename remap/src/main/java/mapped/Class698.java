// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

import java.util.List;

public class Class698 extends Class527
{
    private static String[] field3841;
    public List<Class573> field3842;
    public Class1844 field3843;
    public boolean field3844;
    
    public Class698(final ITextComponent class2250) {
        super(class2250);
        this.field3842 = this.field3154;
        this.field3843 = Class869.method5277().field4643;
        this.field3844 = false;
    }
    
    public void method3896(final Class573 class573) {
    }
    
    public void method3897(final Class573 class573) {
    }
    
    @Override
    public boolean method2982(final double n, final double n2, final int n3) {
        final boolean method2982 = super.method2982(n, n2, n3);
        this.field3844 = true;
        final Class573 method2983 = method3898((int)n, (int)n2, this.field3842);
        if (method2983 != null && method2983.field3431) {
            if (n3 == 1) {
                if (method2983 instanceof Class659) {
                    if (((Class659)method2983).method3709() == Class6469.field25724) {
                        method2983.method3363(super.field3150.method5299());
                    }
                }
            }
            if (n3 != 0) {
                if (n3 == 1) {
                    this.method3897(method2983);
                }
            }
            else {
                this.method3896(method2983);
            }
            return true;
        }
        return method2982;
    }
    
    @Override
    public boolean method2985(final double n, final double n2, final int n3) {
        if (this.field3844) {
            this.method3469(this.field3844 = false);
            return (this.method3471() != null && this.method3471().method2985(n, n2, n3)) || super.method2985(n, n2, n3);
        }
        return false;
    }
    
    @Override
    public boolean method2984(final double n, final double n2, final int n3, final double n4, final double n5) {
        return this.field3844 && super.method2984(n, n2, n3, n4, n5);
    }
    
    public static Class573 method3898(final int n, final int n2, final List<Class573> list) {
        for (int i = 0; i < list.size(); ++i) {
            final Class573 class573 = list.get(i);
            if (class573.field3432) {
                final int method35784 = Class9563.method35784(class573);
                final int method35785 = Class9563.method35785(class573);
                if (n >= class573.field3426) {
                    if (n2 >= class573.field3427) {
                        if (n < class573.field3426 + method35784) {
                            if (n2 < class573.field3427 + method35785) {
                                return class573;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }
}
