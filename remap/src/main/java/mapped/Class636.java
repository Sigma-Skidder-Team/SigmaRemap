// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class636 extends Class633
{
    private final Minecraft field3634;
    
    public Class636() {
        this.field3634 = Minecraft.getInstance();
    }
    
    @Override
    public void method3467(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final boolean b, final float n8) {
        final int n9 = n2 + n5 / 2 - 4;
        this.field3634.fontRenderer.method6610(Class8822.method30773("lanServer.scanning"), (float)(this.field3634.currentScreen.width / 2 - this.field3634.fontRenderer.getStringWidth(Class8822.method30773("lanServer.scanning")) / 2), (float)n9, 16777215);
        String s = null;
        switch ((int)(Util.method27837() / 300L % 4L)) {
            default: {
                s = "O o o";
                break;
            }
            case 1:
            case 3: {
                s = "o O o";
                break;
            }
            case 2: {
                s = "o o O";
                break;
            }
        }
        this.field3634.fontRenderer.method6610(s, (float)(this.field3634.currentScreen.width / 2 - this.field3634.fontRenderer.getStringWidth(s) / 2), (float)(n9 + 9), 8421504);
    }
}
