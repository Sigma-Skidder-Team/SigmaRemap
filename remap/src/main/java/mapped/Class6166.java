// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

public class Class6166 extends Class6159
{
    private static String[] field24922;
    
    private Class6166(final Class1847 class1847, final double n, final double n2, final double n3) {
        super(class1847, n, n2, n3, 0.0, 0.0, 0.0);
        this.field24939 *= 0.009999999776482582;
        this.field24940 *= 0.009999999776482582;
        this.field24941 *= 0.009999999776482582;
        this.field24940 += 0.1;
        this.field24930 *= 1.5f;
        this.field24951 = 16;
        this.field24944 = false;
    }
    
    @Override
    public Class6451 method18418() {
        return Class6451.field25659;
    }
    
    @Override
    public float method18430(final float n) {
        return this.field24930 * MathHelper.method35653((this.field24950 + n) / this.field24951 * 32.0f, 0.0f, 1.0f);
    }
    
    @Override
    public void method18420() {
        this.field24933 = this.field24936;
        this.field24934 = this.field24937;
        this.field24935 = this.field24938;
        if (this.field24950++ < this.field24951) {
            this.method18431(this.field24939, this.field24940, this.field24941);
            if (this.field24937 == this.field24934) {
                this.field24939 *= 1.1;
                this.field24941 *= 1.1;
            }
            this.field24939 *= 0.8600000143051147;
            this.field24940 *= 0.8600000143051147;
            this.field24941 *= 0.8600000143051147;
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
