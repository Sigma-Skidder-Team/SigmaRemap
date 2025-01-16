// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public abstract class RealmsGuiEventListener
{
    public boolean mouseClicked(final double n, final double n2, final int n3) {
        return false;
    }
    
    public boolean mouseReleased(final double n, final double n2, final int n3) {
        return false;
    }
    
    public boolean mouseDragged(final double n, final double n2, final int n3, final double n4, final double n5) {
        return false;
    }
    
    public boolean mouseScrolled(final double n, final double n2, final double n3) {
        return false;
    }
    
    public boolean keyPressed(final int n, final int n2, final int n3) {
        return false;
    }
    
    public boolean keyReleased(final int n, final int n2, final int n3) {
        return false;
    }
    
    public boolean charTyped(final char c, final int n) {
        return false;
    }
    
    public abstract IGuiEventListener getProxy();
}
