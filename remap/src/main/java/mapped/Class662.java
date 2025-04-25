// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

public abstract class Class662 extends Widget
{
    public final Class5760 field3693;
    public double field3694;
    
    public Class662(final int n, final int n2, final int n3, final int n4, final double n5) {
        this(Minecraft.getInstance().gameSettings, n, n2, n3, n4, n5);
    }
    
    public Class662(final Class5760 field3693, final int n, final int n2, final int n3, final int n4, final double field3694) {
        super(n, n2, n3, n4, "");
        this.field3693 = field3693;
        this.field3694 = field3694;
    }
    
    @Override
    public int method3350(final boolean b) {
        return 0;
    }
    
    @Override
    public String method3352() {
        return Class8822.method30773("gui.narrate.slider", this.method3369());
    }
    
    @Override
    public void method3354(final Minecraft class869, final int n, final int n2) {
        class869.method5290().method5849(Class662.field3421);
        RenderSystem.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        final int n3 = (this.method3360() ? 2 : 1) * 20;
        this.blit(this.field3426 + (int)(this.field3694 * (this.field3424 - 8)), this.field3427, 0, 46 + n3, 4, 20);
        this.blit(this.field3426 + (int)(this.field3694 * (this.field3424 - 8)) + 4, this.field3427, 196, 46 + n3, 4, 20);
    }
    
    @Override
    public void method3355(final double n, final double n2) {
        this.method3714(n);
    }
    
    @Override
    public boolean keyPressed(final int n, final int n2, final int n3) {
        final boolean b = n == 263;
        if (b || n == 262) {
            this.method3715(this.field3694 + (b ? -1.0f : 1.0f) / (this.field3424 - 8));
        }
        return false;
    }
    
    private void method3714(final double n) {
        this.method3715((n - (this.field3426 + 4)) / (this.field3424 - 8));
    }
    
    private void method3715(final double n) {
        final double field3694 = this.field3694;
        this.field3694 = MathHelper.clamp(n, 0.0, 1.0);
        if (field3694 != this.field3694) {
            this.method3710();
        }
        this.method3711();
    }
    
    @Override
    public void method3357(final double n, final double n2, final double n3, final double n4) {
        this.method3714(n);
        super.method3357(n, n2, n3, n4);
    }
    
    @Override
    public void method3363(final Class1784 class1784) {
    }
    
    @Override
    public void method3356(final double n, final double n2) {
        super.method3363(Minecraft.getInstance().method5299());
    }
    
    public abstract void method3711();
    
    public abstract void method3710();
}
