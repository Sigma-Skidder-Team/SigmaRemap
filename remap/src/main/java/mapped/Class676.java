// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class676 extends Class673
{
    public Class676(final int n, final int n2, final int n3) {
        super(n, n2, n3, 22, 20, "");
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        if (this.field3432) {
            super.render(n, n2, n3);
            Config.method28895().method5849(new ResourceLocation("optifine/textures/icons.png"));
            Class8933.method31646(1.0f, 1.0f, 1.0f, 1.0f);
            this.blit(this.field3426 + 3, this.field3427 + 2, 0, 0, 16, 16);
        }
    }
}
