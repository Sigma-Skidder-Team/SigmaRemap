// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class Class6184 extends Class6159
{
    private static String[] field24993;
    private final Class7805 field24994;
    
    private Class6184(final World class1847, final double n, final double n2, final double n3, final double n4, final double n5, final double n6, final Class7805 field24994) {
        super(class1847, n, n2, n3, 0.0, 0.0, 0.0);
        this.field24994 = field24994;
        this.field24939 *= 0.10000000149011612;
        this.field24940 *= 0.10000000149011612;
        this.field24941 *= 0.10000000149011612;
        this.field24939 += n4;
        this.field24940 += n5;
        this.field24941 += n6;
        final float field24995 = 1.0f - (float)(Math.random() * 0.30000001192092896);
        this.field24953 = field24995;
        this.field24954 = field24995;
        this.field24955 = field24995;
        this.field24930 *= 1.875f;
        this.field24951 = (int)Math.max((int)(8.0 / (Math.random() * 0.8 + 0.3)) * 2.5f, 1.0f);
        this.field24944 = false;
        this.method18429(field24994);
    }
    
    @Override
    public Class6451 method18418() {
        return Class6451.field25660;
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
            this.method18429(this.field24994);
            this.method18431(this.field24939, this.field24940, this.field24941);
            this.field24939 *= 0.9599999785423279;
            this.field24940 *= 0.9599999785423279;
            this.field24941 *= 0.9599999785423279;
            final PlayerEntity method7132 = this.field24932.method7132(this.field24936, this.field24937, this.field24938, 2.0, false);
            if (method7132 != null) {
                final double method7133 = method7132.getPosY();
                if (this.field24937 > method7133) {
                    this.field24937 += (method7133 - this.field24937) * 0.2;
                    this.field24940 += (method7132.getMotion().y - this.field24940) * 0.2;
                    this.method18441(this.field24936, this.field24937, this.field24938);
                }
            }
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
