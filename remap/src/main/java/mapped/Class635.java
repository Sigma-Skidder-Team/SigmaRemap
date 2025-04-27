// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class635 extends Class633
{
    private final Class720 field3630;
    public final Minecraft field3631;
    public final Class9506 field3632;
    private long field3633;
    
    public Class635(final Class720 field3630, final Class9506 field3631) {
        this.field3630 = field3630;
        this.field3632 = field3631;
        this.field3631 = Minecraft.getInstance();
    }
    
    @Override
    public void method3467(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final boolean b, final float n8) {
        this.field3631.fontRenderer.method6610(Class8822.method30773("lanServer.title"), (float)(n3 + 32 + 3), (float)(n2 + 1), 16777215);
        this.field3631.fontRenderer.method6610(this.field3632.method35414(), (float)(n3 + 32 + 3), (float)(n2 + 12), 8421504);
        if (!this.field3631.gameSettings.field23393) {
            this.field3631.fontRenderer.method6610(this.field3632.method35415(), (float)(n3 + 32 + 3), (float)(n2 + 12 + 11), 3158064);
        }
        else {
            this.field3631.fontRenderer.method6610(Class8822.method30773("selectServer.hiddenAddress"), (float)(n3 + 32 + 3), (float)(n2 + 12 + 11), 3158064);
        }
    }
    
    @Override
    public boolean mouseClicked(final double n, final double n2, final int n3) {
        this.field3630.method3950(this);
        if (Util.method27837() - this.field3633 < 250L) {
            this.field3630.method3948();
        }
        this.field3633 = Util.method27837();
        return false;
    }
    
    public Class9506 method3661() {
        return this.field3632;
    }
}
