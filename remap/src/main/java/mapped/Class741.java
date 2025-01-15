// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

public class Class741 extends Class516<Class3437>
{
    private static final Class1932 field4011;
    
    public Class741(final Class3437 class3437, final Class464 class3438, final ITextComponent class3439) {
        super(class3437, class3438, class3439);
        this.field3155 = false;
        this.field3076 = 133;
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        this.method3041();
        super.method2975(n, n2, n3);
        this.method2977(n, n2);
    }
    
    @Override
    public void method2973(final int n, final int n2) {
        this.field3156.method6610(this.field3148.getFormattedText(), 8.0f, 6.0f, 4210752);
        this.field3156.method6610(this.field3078.getDisplayName().getFormattedText(), 8.0f, (float)(this.field3076 - 96 + 2), 4210752);
    }
    
    @Override
    public void method2976(final float n, final int n2, final int n3) {
        Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        this.field3150.method5290().method5849(Class741.field4011);
        this.method3186((this.field3152 - this.field3075) / 2, (this.field3153 - this.field3076) / 2, 0, 0, this.field3075, this.field3076);
    }
    
    static {
        field4011 = new Class1932("textures/gui/container/hopper.png");
    }
}
