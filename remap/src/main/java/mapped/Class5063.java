// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public abstract class Class5063 extends RealmsGuiEventListener
{
    private final Class602 field21712;
    
    public Class5063(final int n, final int n2, final int n3, final int n4, final int n5) {
        this.field21712 = new Class602(this, n, n2, n3, n4, n5);
    }
    
    public void method15551(final int n, final int n2, final float n3) {
        this.field21712.method2975(n, n2, n3);
    }
    
    public int method15552() {
        return this.field21712.method3521();
    }
    
    public void method15553(final int n, final int n2, final int n3, final int n4, final Class7710 class7710, final int n5, final int n6) {
    }
    
    public void method15554(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        this.method15553(n, n2, n3, n4, Class7710.field30674, n5, n6);
    }
    
    public int method15555() {
        return 0;
    }
    
    public boolean method15556(final int n, final int n2, final double n3, final double n4) {
        return true;
    }
    
    public boolean method15557(final int n) {
        return false;
    }
    
    public void method15558() {
    }
    
    public int method15559() {
        return 0;
    }
    
    public int method15560() {
        return this.field21712.method3521() / 2 + 124;
    }
    
    public void method15561(final int n) {
        this.field21712.method3502(n);
    }
    
    public int method15562() {
        return this.field21712.method3499();
    }
    
    public void method15563(final int n, final int n2, final int n3, final int n4) {
    }
    
    @Override
    public IGuiEventListener getProxy() {
        return this.field21712;
    }
}
