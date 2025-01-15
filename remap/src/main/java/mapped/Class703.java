// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

public class Class703 extends Class698
{
    private static String[] field3867;
    public final Class527 field3868;
    public final Class5760 field3869;
    
    public Class703(final Class527 field3868, final ITextComponent class2250) {
        super(class2250);
        this.field3868 = field3868;
        this.field3869 = Class869.method5277().field4648;
    }
    
    public Class703(final Class527 field3868, final Class5760 field3869, final ITextComponent class2250) {
        super(class2250);
        this.field3868 = field3868;
        this.field3869 = field3869;
    }
    
    @Override
    public void method2971() {
        this.field3150.field4648.method17121();
    }
    
    @Override
    public void method3028() {
        this.field3150.method5244(this.field3868);
    }
}
