// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6194 extends Class6159
{
    private static String[] field25008;
    
    private Class6194(final Class1847 class1847, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        super(class1847, n, n2, n3, n4, n5, n6);
        this.field24939 = this.field24939 * 0.009999999776482582 + n4;
        this.field24940 = this.field24940 * 0.009999999776482582 + n5;
        this.field24941 = this.field24941 * 0.009999999776482582 + n6;
        this.field24936 += (this.field24949.nextFloat() - this.field24949.nextFloat()) * 0.05f;
        this.field24937 += (this.field24949.nextFloat() - this.field24949.nextFloat()) * 0.05f;
        this.field24938 += (this.field24949.nextFloat() - this.field24949.nextFloat()) * 0.05f;
        this.field24951 = (int)(8.0 / (Math.random() * 0.8 + 0.2)) + 4;
    }
    
    @Override
    public Class6451 method18418() {
        return Class6451.field25659;
    }
    
    @Override
    public void method18431(final double n, final double n2, final double n3) {
        this.method18445(this.method18444().method18499(n, n2, n3));
        this.method18442();
    }
    
    @Override
    public float method18430(final float n) {
        final float n2 = (this.field24950 + n) / this.field24951;
        return this.field24930 * (1.0f - n2 * n2 * 0.5f);
    }
    
    @Override
    public int method18419(final float n) {
        final float method35653 = Class9546.method35653((this.field24950 + n) / this.field24951, 0.0f, 1.0f);
        final int method35654 = super.method18419(n);
        final int n2 = method35654 & 0xFF;
        final int n3 = method35654 >> 16 & 0xFF;
        int n4 = n2 + (int)(method35653 * 15.0f * 16.0f);
        if (n4 > 240) {
            n4 = 240;
        }
        return n4 | n3 << 16;
    }
    
    @Override
    public void method18420() {
        this.field24933 = this.field24936;
        this.field24934 = this.field24937;
        this.field24935 = this.field24938;
        if (this.field24950++ < this.field24951) {
            this.method18431(this.field24939, this.field24940, this.field24941);
            this.field24939 *= 0.9599999785423279;
            this.field24940 *= 0.9599999785423279;
            this.field24941 *= 0.9599999785423279;
            if (this.field24943) {
                this.field24939 *= 0.699999988079071;
                this.field24941 *= 0.699999988079071;
            }
        }
        else {
            this.method18439();
        }
    }
}
