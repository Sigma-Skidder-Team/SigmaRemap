// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6186 extends Class6159
{
    private static String[] field24997;
    private final Class7805 field24998;
    
    private Class6186(final Class1847 class1847, final double n, final double n2, final double n3, final double n4, final double n5, final double n6, final Class6912 class1848, final Class7805 field24998) {
        super(class1847, n, n2, n3, n4, n5, n6);
        this.field24998 = field24998;
        this.field24939 *= 0.10000000149011612;
        this.field24940 *= 0.10000000149011612;
        this.field24941 *= 0.10000000149011612;
        final float n7 = (float)Math.random() * 0.4f + 0.6f;
        this.field24953 = ((float)(Math.random() * 0.20000000298023224) + 0.8f) * class1848.method21277() * n7;
        this.field24954 = ((float)(Math.random() * 0.20000000298023224) + 0.8f) * class1848.method21278() * n7;
        this.field24955 = ((float)(Math.random() * 0.20000000298023224) + 0.8f) * class1848.method21279() * n7;
        this.field24930 *= 0.75f * class1848.method21280();
        this.field24951 = (int)Math.max((int)(8.0 / (Math.random() * 0.8 + 0.2)) * class1848.method21280(), 1.0f);
        this.method18429(field24998);
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
            this.method18429(this.field24998);
            this.method18431(this.field24939, this.field24940, this.field24941);
            if (this.field24937 == this.field24934) {
                this.field24939 *= 1.1;
                this.field24941 *= 1.1;
            }
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
