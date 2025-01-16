// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

public class Class682 extends Class648
{
    private static final ResourceLocation field3725;
    public boolean field3726;
    
    public Class682(final int n, final int n2, final int n3, final int n4, final String s, final boolean field3726) {
        super(n, n2, n3, n4, s);
        this.field3726 = field3726;
    }
    
    @Override
    public void method3705() {
        this.field3726 = !this.field3726;
    }
    
    public boolean method3743() {
        return this.field3726;
    }
    
    @Override
    public void method3353(final int n, final int n2, final float n3) {
        final Class869 method5277 = Class869.method5277();
        method5277.method5290().method5849(Class682.field3725);
        Class8726.method30008();
        final Class1844 field4643 = method5277.field4643;
        Class8726.method30068(1.0f, 1.0f, 1.0f, this.field3433);
        Class8726.method30011();
        Class8726.method30117();
        Class8726.method30013(Class2050.field11693, Class2135.field12460);
        Class565.method3188(this.field3426, this.field3427, 0.0f, this.field3726 ? 20.0f : 0.0f, 20, this.field3425, 32, 64);
        this.method3354(method5277, n, n2);
        this.method3297(field4643, this.method3369(), this.field3426 + 24, this.field3427 + (this.field3425 - 8) / 2, 0xE0E0E0 | MathHelper.ceil(this.field3433 * 255.0f) << 24);
    }
    
    static {
        field3725 = new ResourceLocation("textures/gui/checkbox.png");
    }
}
