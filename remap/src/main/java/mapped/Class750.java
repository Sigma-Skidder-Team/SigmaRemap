// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

public class Class750 extends Class516<Class3440>
{
    private static final ResourceLocation field4048;
    
    public Class750(final Class3440 class3440, final Class464 class3441, final ITextComponent class3442) {
        super(class3440, class3441, class3442);
    }
    
    @Override
    public void method2973(final int n, final int n2) {
        this.field3156.method6610(this.field3148.getFormattedText(), 8.0f, 6.0f, 4210752);
        this.field3156.method6610(this.field3078.getDisplayName().getFormattedText(), 8.0f, (float)(this.field3076 - 96 + 2), 4210752);
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        this.method3041();
        this.method2976(n3, n, n2);
        super.method2975(n, n2, n3);
        this.method2977(n, n2);
    }
    
    @Override
    public void method2976(final float n, final int n2, final int n3) {
        Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        this.field3150.method5290().method5849(Class750.field4048);
        final int n4 = (this.field3152 - this.field3075) / 2;
        final int n5 = (this.field3153 - this.field3076) / 2;
        this.method3186(n4, n5, 0, 0, this.field3075, this.field3076);
        if (this.field3077.method10878(0).method20054() || this.field3077.method10878(1).method20054()) {
            if (!this.field3077.method10878(2).method20054()) {
                this.method3186(n4 + 92, n5 + 31, this.field3075, 0, 28, 21);
            }
        }
    }
    
    static {
        field4048 = new ResourceLocation("textures/gui/container/grindstone.png");
    }
}
