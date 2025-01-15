// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.world.World;

public class Class6198 extends Class6197
{
    private static String[] field25020;
    
    private Class6198(final World class1847, final double n, final double n2, final double n3, final double field24939, final double field24940, final double field24941, final Class7805 class1848) {
        super(class1847, n, n2, n3, class1848, 0.0f);
        this.field24930 = 0.5f;
        this.method18436(1.0f);
        this.method18435(0.0f, 0.0f, 0.0f);
        this.field24951 = (int)(this.field24930 * 12.0f / (Math.random() * 0.800000011920929 + 0.20000000298023224));
        this.method18429(class1848);
        this.field24944 = false;
        this.field24939 = field24939;
        this.field24940 = field24940;
        this.field24941 = field24941;
        this.method18457(0.0f);
    }
    
    @Override
    public void method18420() {
        this.field24933 = this.field24936;
        this.field24934 = this.field24937;
        this.field24935 = this.field24938;
        if (this.field24950++ < this.field24951) {
            this.method18429(this.field25013);
            if (this.field24950 > this.field24951 / 2) {
                this.method18436(1.0f - (this.field24950 - (float)(this.field24951 / 2)) / this.field24951);
            }
            this.method18431(this.field24939, this.field24940, this.field24941);
            if (this.field24932.method6701(new BlockPos(this.field24936, this.field24937, this.field24938)).method21706()) {
                this.field24940 -= 0.00800000037997961;
            }
            this.field24939 *= 0.9200000166893005;
            this.field24940 *= 0.9200000166893005;
            this.field24941 *= 0.9200000166893005;
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
