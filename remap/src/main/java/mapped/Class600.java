// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class600 extends Class599
{
    private static String[] field3528;
    private final Class5064 field3529;
    
    public Class600(final Class5064 field3529, final int n, final int n2, final int n3, final int n4, final int n5) {
        super(Minecraft.getInstance(), n, n2, n3, n4, n5);
        this.field3529 = field3529;
    }
    
    @Override
    public int method3485() {
        return this.field3529.method15568();
    }
    
    @Override
    public boolean method3486(final int n, final int n2, final double n3, final double n4) {
        return this.field3529.method15569(n, n2, n3, n4);
    }
    
    @Override
    public boolean method3487(final int n) {
        return this.field3529.method15570(n);
    }
    
    @Override
    public void method3489() {
        this.field3529.method15571();
    }
    
    @Override
    public void method3491(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final float n7) {
        this.field3529.method15567(n, n2, n3, n4, n5, n6);
    }
    
    public int method3512() {
        return this.field3513;
    }
    
    @Override
    public int method3488() {
        return this.field3529.method15572();
    }
    
    @Override
    public int method3508() {
        return this.field3529.method15573();
    }
    
    public void method3513(final int n, final int n2, final int n3, final int n4, final int n5) {
        this.field3529.method15577(n, n2, n3, n4, n5);
    }
    
    @Override
    public boolean mouseScrolled(final double n, final double n2, final double n3) {
        return this.field3529.mouseScrolled(n, n2, n3) || super.mouseScrolled(n, n2, n3);
    }
    
    @Override
    public boolean mouseClicked(final double n, final double n2, final int n3) {
        return this.field3529.mouseClicked(n, n2, n3) || super.mouseClicked(n, n2, n3);
    }
    
    @Override
    public boolean mouseReleased(final double n, final double n2, final int n3) {
        return this.field3529.mouseReleased(n, n2, n3);
    }
    
    @Override
    public boolean mouseDragged(final double n, final double n2, final int n3, final double n4, final double n5) {
        return this.field3529.mouseDragged(n, n2, n3, n4, n5) || super.mouseDragged(n, n2, n3, n4, n5);
    }
    
    public void method3514(final int n, final int n2, final int n3, final Class7710 class7710) {
        this.field3529.method15578(n, n2, n3, class7710);
    }
    
    @Override
    public void method3506(final int n, final int n2, final int n3, final int n4, final float n5) {
        for (int method3485 = this.method3485(), i = 0; i < method3485; ++i) {
            final int n6 = n2 + i * this.field3519 + this.field3526;
            final int n7 = this.field3519 - 4;
            if (n6 > this.field3516 || n6 + n7 < this.field3515) {
                this.method3490(i, n, n6, n5);
            }
            if (this.field3524) {
                if (this.method3487(i)) {
                    this.method3514(this.field3513, n6, n7, Class7710.field30674);
                }
            }
            this.method3491(i, n, n6, n7, n3, n4, n5);
        }
    }
    
    public int method3515() {
        return this.field3515;
    }
    
    public int method3516() {
        return this.field3516;
    }
    
    public int method3517() {
        return this.field3526;
    }
    
    public double method3518() {
        return this.field3522;
    }
    
    public int method3519() {
        return this.field3519;
    }
}
