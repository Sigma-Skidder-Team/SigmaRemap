// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4902 extends Class4841
{
    private static String[] field20591;
    public Class8321 field20973;
    public boolean field20974;
    
    public Class4902(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final Class8321 field20973) {
        super(class4803, s, n, n2, n3, n4, false);
        this.field20973 = field20973;
    }
    
    @Override
    public void method14205(final float n) {
        final int n2 = 5;
        if (this.method14723() || this.method14308()) {
            Class8154.method26914((float)this.field20478, (float)this.field20479, (float)this.field20480, (float)this.field20481, 14.0f, this.method14723() ? (0.8f * n) : (0.3f * n));
        }
        Class8154.method26929(this.field20973, this.field20478 + n2, this.field20479 + n2, this.field20480 - n2 * 2, this.field20481 - n2 * 2);
        super.method14205(n);
    }
    
    public boolean method14723() {
        return this.field20974;
    }
    
    public void method14724(final boolean b) {
        this.method14725(b, true);
    }
    
    public void method14725(final boolean field20974, final boolean b) {
        if (field20974 != this.method14723()) {
            this.field20974 = field20974;
            this.method14517();
        }
    }
    
    @Override
    public void method14234(final int n, final int n2, final int n3) {
        this.method14725(!this.field20974, true);
    }
}
