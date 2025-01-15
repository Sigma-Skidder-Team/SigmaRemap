// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;

public class Class3536 extends Class3531
{
    private static String[] field16574;
    public final /* synthetic */ Class769 field16575;
    
    private Class3536(final Class769 field16575) {
        this.field16575 = field16575;
        super(field16575);
    }
    
    @Override
    public boolean method11013() {
        return super.method11013() && !this.field16575.method2653(Class9439.field40487);
    }
    
    @Override
    public int method11084() {
        return 20;
    }
    
    @Override
    public int method11085() {
        return 340;
    }
    
    @Override
    public void method11082() {
        this.field16575.method2655(new Class1948(Class9439.field40487, 1200));
    }
    
    @Nullable
    @Override
    public Class7795 method11086() {
        return Class8520.field35310;
    }
    
    @Override
    public Class2107 method11087() {
        return Class2107.field12217;
    }
}
