// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public abstract class Class5064 extends RealmsGuiEventListener
{
    private final Class600 field21713;
    
    public Class5064(final int n, final int n2, final int n3, final int n4, final int n5) {
        this.field21713 = new Class600(this, n, n2, n3, n4, n5);
    }
    
    public void method15564(final int n, final int n2, final float n3) {
        this.field21713.render(n, n2, n3);
    }
    
    public int method15565() {
        return this.field21713.method3512();
    }
    
    public void method15566(final int n, final int n2, final int n3, final int n4, final Class7710 class7710, final int n5, final int n6) {
    }
    
    public void method15567(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        this.method15566(n, n2, n3, n4, Class7710.field30674, n5, n6);
    }
    
    public int method15568() {
        return 0;
    }
    
    public boolean method15569(final int n, final int n2, final double n3, final double n4) {
        return true;
    }
    
    public boolean method15570(final int n) {
        return false;
    }
    
    public void method15571() {
    }
    
    public int method15572() {
        return 0;
    }
    
    public int method15573() {
        return this.field21713.method3512() / 2 + 124;
    }
    
    @Override
    public IGuiEventListener getProxy() {
        return this.field21713;
    }
    
    public void method15574(final int n) {
        this.field21713.method3502(n);
    }
    
    public int method15575() {
        return this.field21713.method3499();
    }
    
    public void method15576(final int n, final int n2, final int n3, final int n4) {
    }
    
    public void method15577(final int n, final int n2, final double n3, final double n4, final int n5) {
    }
    
    public void method15578(final int n, final int n2, final int n3, final Class7710 class7710) {
    }
    
    public void method15579(final int n) {
        this.field21713.method3510(n);
    }
    
    public int method15580() {
        return this.field21713.method3515();
    }
    
    public int method15581() {
        return this.field21713.method3516();
    }
    
    public int method15582() {
        return this.field21713.method3517();
    }
    
    public double method15583() {
        return this.field21713.method3518();
    }
    
    public int method15584() {
        return this.field21713.method3519();
    }
    
    public boolean method15585() {
        return this.field21713.method3484();
    }
}
