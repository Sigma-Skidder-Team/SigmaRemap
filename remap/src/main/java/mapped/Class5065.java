// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5065 extends RealmsGuiEventListener
{
    private static String[] field21714;
    private final Class576 field21715;
    
    public Class5065(final int n, final int n2, final int n3, final int n4, final int n5, final String s) {
        this.field21715 = new Class576(Minecraft.getInstance().fontRenderer, n2, n3, n4, n5, null, s);
    }
    
    public String method15586() {
        return this.field21715.method3378();
    }
    
    public void method15587() {
        this.field21715.method3376();
    }
    
    public void method15588(final String s) {
        this.field21715.method3377(s);
    }
    
    @Override
    public boolean charTyped(final char c, final int n) {
        return this.field21715.charTyped(c, n);
    }
    
    @Override
    public IGuiEventListener getProxy() {
        return this.field21715;
    }
    
    @Override
    public boolean keyPressed(final int n, final int n2, final int n3) {
        return this.field21715.keyPressed(n, n2, n3);
    }
    
    public boolean method15589() {
        return this.field21715.method3370();
    }
    
    @Override
    public boolean mouseClicked(final double n, final double n2, final int n3) {
        return this.field21715.mouseClicked(n, n2, n3);
    }
    
    @Override
    public boolean mouseReleased(final double n, final double n2, final int n3) {
        return this.field21715.mouseReleased(n, n2, n3);
    }
    
    @Override
    public boolean mouseDragged(final double n, final double n2, final int n3, final double n4, final double n5) {
        return this.field21715.mouseDragged(n, n2, n3, n4, n5);
    }
    
    @Override
    public boolean mouseScrolled(final double n, final double n2, final double n3) {
        return this.field21715.mouseScrolled(n, n2, n3);
    }
    
    public void method15590(final int n, final int n2, final float n3) {
        this.field21715.render(n, n2, n3);
    }
    
    public void method15591(final int n) {
        this.field21715.method3397(n);
    }
    
    public void method15592(final boolean b) {
        this.field21715.method3405(b);
    }
}
