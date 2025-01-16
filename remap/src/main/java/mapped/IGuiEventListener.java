// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public interface IGuiEventListener
{
    default void mouseMoved(final double n, final double n2) {
    }
    
    default boolean mouseClicked(final double n, final double n2, final int n3) {
        return false;
    }
    
    default boolean mouseReleased(final double n, final double n2, final int n3) {
        return false;
    }
    
    default boolean mouseDragged(final double n, final double n2, final int n3, final double n4, final double n5) {
        return false;
    }
    
    default boolean mouseScrolled(final double n, final double n2, final double n3) {
        return false;
    }
    
    default boolean keyPressed(final int n, final int n2, final int n3) {
        return false;
    }
    
    default boolean keyReleased(final int n, final int n2, final int n3) {
        return false;
    }
    
    default boolean charTyped(final char c, final int n) {
        return false;
    }
    
    default boolean changeFocus(final boolean b) {
        return false;
    }
    
    default boolean isMouseOver(final double n, final double n2) {
        return false;
    }
}
