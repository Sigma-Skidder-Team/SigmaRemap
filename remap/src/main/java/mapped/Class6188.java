// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.world.World;

public class Class6188 extends Class6159
{
    private static String[] field25001;
    private final Class7805 field25002;
    
    public Class6188(final World class1847, final double n, final double n2, final double n3, final double n4, final double n5, final double n6, final Class7805 field25002) {
        super(class1847, n, n2, n3);
        this.field25002 = field25002;
        this.field24939 = n4 + (Math.random() * 2.0 - 1.0) * 0.05000000074505806;
        this.field24940 = n5 + (Math.random() * 2.0 - 1.0) * 0.05000000074505806;
        this.field24941 = n6 + (Math.random() * 2.0 - 1.0) * 0.05000000074505806;
        final float field25003 = this.field24949.nextFloat() * 0.3f + 0.7f;
        this.field24953 = field25003;
        this.field24954 = field25003;
        this.field24955 = field25003;
        this.field24930 = 0.1f * (this.field24949.nextFloat() * this.field24949.nextFloat() * 6.0f + 1.0f);
        this.field24951 = (int)(16.0 / (this.field24949.nextFloat() * 0.8 + 0.2)) + 2;
        this.method18429(field25002);
    }
    
    @Override
    public Class6451 method18418() {
        return Class6451.field25659;
    }
    
    @Override
    public void method18420() {
        this.field24933 = this.field24936;
        this.field24934 = this.field24937;
        this.field24935 = this.field24938;
        if (this.field24950++ < this.field24951) {
            this.method18429(this.field25002);
            this.field24940 += 0.004;
            this.method18431(this.field24939, this.field24940, this.field24941);
            this.field24939 *= 0.8999999761581421;
            this.field24940 *= 0.8999999761581421;
            this.field24941 *= 0.8999999761581421;
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
