// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6168 extends Class6159
{
    private static String[] field24926;
    
    private Class6168(final Class1847 class1847, final double n, final double n2, final double n3) {
        super(class1847, n, n2, n3, 0.0, 0.0, 0.0);
        this.field24939 *= 0.800000011920929;
        this.field24940 *= 0.800000011920929;
        this.field24941 *= 0.800000011920929;
        this.field24940 = this.field24949.nextFloat() * 0.4f + 0.05f;
        this.field24930 *= this.field24949.nextFloat() * 2.0f + 0.2f;
        this.field24951 = (int)(16.0 / (Math.random() * 0.8 + 0.2));
    }
    
    @Override
    public Class6451 method18418() {
        return Class6451.field25659;
    }
    
    @Override
    public int method18419(final float n) {
        return 0xF0 | (super.method18419(n) >> 16 & 0xFF) << 16;
    }
    
    @Override
    public float method18430(final float n) {
        final float n2 = (this.field24950 + n) / this.field24951;
        return this.field24930 * (1.0f - n2 * n2);
    }
    
    @Override
    public void method18420() {
        this.field24933 = this.field24936;
        this.field24934 = this.field24937;
        this.field24935 = this.field24938;
        if (this.field24949.nextFloat() > this.field24950 / (float)this.field24951) {
            this.field24932.method6709(Class8432.field34639, this.field24936, this.field24937, this.field24938, this.field24939, this.field24940, this.field24941);
        }
        if (this.field24950++ < this.field24951) {
            this.field24940 -= 0.03;
            this.method18431(this.field24939, this.field24940, this.field24941);
            this.field24939 *= 0.9990000128746033;
            this.field24940 *= 0.9990000128746033;
            this.field24941 *= 0.9990000128746033;
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
