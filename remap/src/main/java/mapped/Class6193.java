// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class Class6193 extends Class6159
{
    private static String[] field25007;
    
    private Class6193(final World class1847, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        super(class1847, n, n2, n3, 0.0, 0.0, 0.0);
        this.field24939 *= 0.10000000149011612;
        this.field24940 *= 0.10000000149011612;
        this.field24941 *= 0.10000000149011612;
        this.field24939 += n4 * 0.4;
        this.field24940 += n5 * 0.4;
        this.field24941 += n6 * 0.4;
        final float field24955 = (float)(Math.random() * 0.30000001192092896 + 0.6000000238418579);
        this.field24953 = field24955;
        this.field24954 = field24955;
        this.field24955 = field24955;
        this.field24930 *= 0.75f;
        this.field24951 = Math.max((int)(6.0 / (Math.random() * 0.8 + 0.6)), 1);
        this.field24944 = false;
        this.method18420();
    }
    
    @Override
    public float method18430(final float n) {
        return this.field24930 * MathHelper.clamp((this.field24950 + n) / this.field24951 * 32.0f, 0.0f, 1.0f);
    }
    
    @Override
    public void method18420() {
        this.field24933 = this.field24936;
        this.field24934 = this.field24937;
        this.field24935 = this.field24938;
        if (this.field24950++ < this.field24951) {
            this.method18431(this.field24939, this.field24940, this.field24941);
            this.field24954 *= (float)0.96;
            this.field24955 *= (float)0.9;
            this.field24939 *= 0.699999988079071;
            this.field24940 *= 0.699999988079071;
            this.field24941 *= 0.699999988079071;
            this.field24940 -= 0.019999999552965164;
            if (this.field24943) {
                this.field24939 *= 0.699999988079071;
                this.field24941 *= 0.699999988079071;
            }
        }
        else {
            this.method18439();
        }
    }
    
    @Override
    public Class6451 method18418() {
        return Class6451.field25659;
    }
}
