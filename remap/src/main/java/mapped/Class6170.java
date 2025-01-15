// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.world.World;

public class Class6170 extends Class6159
{
    private static String[] field24928;
    
    private Class6170(final World class1847, final double n, final double n2, final double n3, final double field24939, final double n4, final double field24940, final boolean b) {
        super(class1847, n, n2, n3);
        this.method18433(3.0f);
        this.method18440(0.25f, 0.25f);
        if (!b) {
            this.field24951 = this.field24949.nextInt(50) + 80;
        }
        else {
            this.field24951 = this.field24949.nextInt(50) + 280;
        }
        this.field24952 = 3.0E-6f;
        this.field24939 = field24939;
        this.field24940 = n4 + this.field24949.nextFloat() / 500.0f;
        this.field24941 = field24940;
    }
    
    @Override
    public void method18420() {
        this.field24933 = this.field24936;
        this.field24934 = this.field24937;
        this.field24935 = this.field24938;
        if (this.field24950++ < this.field24951 && this.field24956 > 0.0f) {
            this.field24939 += this.field24949.nextFloat() / 5000.0f * (this.field24949.nextBoolean() ? 1 : -1);
            this.field24941 += this.field24949.nextFloat() / 5000.0f * (this.field24949.nextBoolean() ? 1 : -1);
            this.field24940 -= this.field24952;
            this.method18431(this.field24939, this.field24940, this.field24941);
            if (this.field24950 >= this.field24951 - 60) {
                if (this.field24956 > 0.01f) {
                    this.field24956 -= 0.015f;
                }
            }
        }
        else {
            this.method18439();
        }
    }
    
    @Override
    public Class6451 method18418() {
        return Class6451.field25660;
    }
}
