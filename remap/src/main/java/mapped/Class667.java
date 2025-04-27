// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class667 extends Class654
{
    private boolean field3700;
    
    public Class667(final int n, final int n2, final Class6887 class6887) {
        super(n, n2, 20, 20, Class8822.method30773("narrator.button.difficulty_lock"), class6887);
    }
    
    @Override
    public String method3352() {
        return super.method3352() + ". " + (this.method3731() ? Class8822.method30773("narrator.button.difficulty_lock.locked") : Class8822.method30773("narrator.button.difficulty_lock.unlocked"));
    }
    
    public boolean method3731() {
        return this.field3700;
    }
    
    public void method3732(final boolean field3700) {
        this.field3700 = field3700;
    }
    
    @Override
    public void method3353(final int n, final int n2, final float n3) {
        Minecraft.getInstance().method5290().method5849(Class654.field3421);
        RenderSystem.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        Class2147 class2147;
        if (this.field3431) {
            if (!this.method3360()) {
                class2147 = (this.field3700 ? Class2147.field12639 : Class2147.field12642);
            }
            else {
                class2147 = (this.field3700 ? Class2147.field12640 : Class2147.field12643);
            }
        }
        else {
            class2147 = (this.field3700 ? Class2147.field12641 : Class2147.field12644);
        }
        this.blit(this.field3426, this.field3427, class2147.method8311(), class2147.method8312(), this.field3424, this.field3425);
    }
}
