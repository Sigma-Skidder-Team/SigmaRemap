// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class Class6161 extends Class6159
{
    private static String[] field24914;
    
    private Class6161(final World class1847, final double n, final double n2, final double n3, final double n4) {
        super(class1847, n, n2, n3, 0.0, 0.0, 0.0);
        this.field24939 *= 0.009999999776482582;
        this.field24940 *= 0.009999999776482582;
        this.field24941 *= 0.009999999776482582;
        this.field24940 += 0.2;
        this.field24953 = Math.max(0.0f, MathHelper.sin(((float)n4 + 0.0f) * 6.2831855f) * 0.65f + 0.35f);
        this.field24954 = Math.max(0.0f, MathHelper.sin(((float)n4 + 0.33333334f) * 6.2831855f) * 0.65f + 0.35f);
        this.field24955 = Math.max(0.0f, MathHelper.sin(((float)n4 + 0.6666667f) * 6.2831855f) * 0.65f + 0.35f);
        this.field24930 *= 1.5f;
        this.field24951 = 6;
    }
    
    @Override
    public Class6451 method18418() {
        return Class6451.field25659;
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
            if (this.field24937 == this.field24934) {
                this.field24939 *= 1.1;
                this.field24941 *= 1.1;
            }
            this.field24939 *= 0.6600000262260437;
            this.field24940 *= 0.6600000262260437;
            this.field24941 *= 0.6600000262260437;
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
