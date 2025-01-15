// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6160 extends Class6159
{
    private static String[] field24911;
    private final float field24912;
    private final Class7805 field24913;
    
    private Class6160(final Class1847 class1847, final double n, final double n2, final double n3, final float field24953, final float field24954, final float field24955, final Class7805 field24956) {
        super(class1847, n, n2, n3);
        this.field24913 = field24956;
        this.field24953 = field24953;
        this.field24954 = field24954;
        this.field24955 = field24955;
        this.field24930 *= 0.67499995f;
        this.field24951 = (int)Math.max((int)(32.0 / (Math.random() * 0.8 + 0.2)) * 0.9f, 1.0f);
        this.method18429(field24956);
        this.field24912 = ((float)Math.random() - 0.5f) * 0.1f;
        this.field24957 = (float)Math.random() * 6.2831855f;
    }
    
    @Override
    public Class6451 method18418() {
        return Class6451.field25659;
    }
    
    @Override
    public float method18430(final float n) {
        return this.field24930 * Class9546.method35653((this.field24950 + n) / this.field24951 * 32.0f, 0.0f, 1.0f);
    }
    
    @Override
    public void method18420() {
        this.field24933 = this.field24936;
        this.field24934 = this.field24937;
        this.field24935 = this.field24938;
        if (this.field24950++ < this.field24951) {
            this.method18429(this.field24913);
            this.field24958 = this.field24957;
            this.field24957 += 3.1415927f * this.field24912 * 2.0f;
            if (this.field24943) {
                final float n = 0.0f;
                this.field24957 = n;
                this.field24958 = n;
            }
            this.method18431(this.field24939, this.field24940, this.field24941);
            this.field24940 -= 0.003000000026077032;
            this.field24940 = Math.max(this.field24940, -0.14000000059604645);
        }
        else {
            this.method18439();
        }
    }
}
