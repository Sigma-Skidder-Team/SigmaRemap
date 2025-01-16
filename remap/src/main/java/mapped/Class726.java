// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

public class Class726 extends Class516<Class3438> implements Class725<Class3438>
{
    private static final ResourceLocation field3957;
    private final int field3958;
    
    public Class726(final Class3438 class3438, final Class464 class3439, final ITextComponent class3440) {
        super(class3438, class3439, class3440);
        this.field3155 = false;
        this.field3958 = class3438.method10973();
        this.field3076 = 114 + this.field3958 * 18;
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
        this.field3150.method5290().method5849(Class726.field3957);
        final int n4 = (this.field3152 - this.field3075) / 2;
        final int n5 = (this.field3153 - this.field3076) / 2;
        this.method3186(n4, n5, 0, 0, this.field3075, this.field3958 * 18 + 17);
        this.method3186(n4, n5 + this.field3958 * 18 + 17, 0, 126, this.field3075, 96);
    }
    
    static {
        field3957 = new ResourceLocation("textures/gui/container/generic_54.png");
    }
}
