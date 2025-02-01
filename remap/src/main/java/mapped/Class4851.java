// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4851 extends Class4841
{
    private static String[] field20591;
    private int field20791;
    private int field20792;
    public boolean field20793;
    
    public Class4851(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final int field20791, final int field20792) {
        super(class4803, s, n, n2, n3, n4, false);
        this.field20793 = false;
        this.field20791 = field20791;
        this.field20792 = field20792;
    }
    
    public void method14556(final int field20791) {
        this.field20791 = field20791;
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        final int n3 = this.method14320() - this.method14280();
        if (this.field20793) {
            this.method14558((int)(n3 / (float)this.method14276() * 255.0f));
        }
        super.method14200(n, n2);
    }
    
    @Override
    public void draw(final float n) {
        RenderUtil.method26874((float)this.field20478, (float)this.field20479, (float)this.field20480, (float)this.field20481, this.field20791);
        super.draw(n);
    }
    
    @Override
    public boolean method14211(final int n, final int n2, final int n3) {
        this.field20793 = true;
        return super.method14211(n, n2, n3);
    }
    
    @Override
    public void method14233(final int n, final int n2, final int n3) {
        this.field20793 = false;
    }
    
    public float method14557() {
        return (float)this.field20792;
    }
    
    public void method14558(final int n) {
        this.method14559(n, true);
    }
    
    public void method14559(int min, final boolean b) {
        min = Math.min(Math.max(min, 0), 255);
        final int field20792 = this.field20792;
        this.field20792 = min;
        if (b) {
            if (field20792 != min) {
                this.method14517();
            }
        }
    }
}
