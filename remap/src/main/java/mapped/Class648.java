// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public abstract class Class648 extends Class573
{
    public Class648(final int n, final int n2, final int n3, final int n4, final String s) {
        super(n, n2, n3, n4, s);
    }
    
    public abstract void method3705();
    
    @Override
    public void method3355(final double n, final double n2) {
        this.method3705();
    }
    
    @Override
    public boolean keyPressed(final int n, final int n2, final int n3) {
        if (this.field3431 && this.field3432) {
            if (n != 257) {
                if (n != 32) {
                    if (n != 335) {
                        return false;
                    }
                }
            }
            this.method3363(Minecraft.method5277().method5299());
            this.method3705();
            return true;
        }
        return false;
    }
}
