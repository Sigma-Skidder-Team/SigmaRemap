// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

public class Class6195 extends Class6159
{
    private static String[] field25009;
    private final Class7805 field25010;
    
    public Class6195(final Class1847 class1847, final double n, final double n2, final double n3, final double n4, final double n5, final double n6, final float n7, final Class7805 field25010) {
        super(class1847, n, n2, n3, 0.0, 0.0, 0.0);
        this.field25010 = field25010;
        this.field24939 *= 0.10000000149011612;
        this.field24940 *= 0.10000000149011612;
        this.field24941 *= 0.10000000149011612;
        this.field24939 += n4;
        this.field24940 += n5;
        this.field24941 += n6;
        final float field25011 = (float)(Math.random() * 0.30000001192092896);
        this.field24953 = field25011;
        this.field24954 = field25011;
        this.field24955 = field25011;
        this.field24930 *= 0.75f * n7;
        this.field24951 = (int)(8.0 / (Math.random() * 0.8 + 0.2));
        this.field24951 *= (int)n7;
        this.field24951 = Math.max(this.field24951, 1);
        this.method18429(field25010);
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
            this.method18429(this.field25010);
            this.field24940 += 0.004;
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
