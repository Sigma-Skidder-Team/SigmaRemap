// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

public class Class6995 implements Class6991
{
    private final int field27291;
    private final boolean field27292;
    
    public Class6995(final int field27291, final boolean field27292) {
        this.field27291 = field27291;
        this.field27292 = field27292;
    }
    
    @Override
    public void method21402(final Class9039 class9039) {
        Class9039.method32501(class9039, Class9039.method32502(class9039) + this.field27291);
    }
    
    @Override
    public ITextComponent method21403() {
        return (this.field27291 >= 0) ? new Class2259("spectatorMenu.next_page", new Object[0]) : new Class2259("spectatorMenu.previous_page", new Object[0]);
    }
    
    @Override
    public void method21404(final float n, final int n2) {
        Minecraft.getInstance().method5290().method5849(Class569.field3395);
        if (this.field27291 >= 0) {
            AbstractGui.blit(0, 0, 160.0f, 0.0f, 16, 16, 256, 256);
        }
        else {
            AbstractGui.blit(0, 0, 144.0f, 0.0f, 16, 16, 256, 256);
        }
    }
    
    @Override
    public boolean method21405() {
        return this.field27292;
    }
}
