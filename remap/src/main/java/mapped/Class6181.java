// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.world.World;

public class Class6181 extends Class6159
{
    private static String[] field24983;
    private final double field24984;
    private final double field24985;
    private final double field24986;
    
    private Class6181(final World class1847, final double field24984, final double field24985, final double field24986, final double field24987, final double field24988, final double field24989) {
        super(class1847, field24984, field24985, field24986);
        this.field24939 = field24987;
        this.field24940 = field24988;
        this.field24941 = field24989;
        this.field24984 = field24984;
        this.field24985 = field24985;
        this.field24986 = field24986;
        this.field24933 = field24984 + field24987;
        this.field24934 = field24985 + field24988;
        this.field24935 = field24986 + field24989;
        this.field24936 = this.field24933;
        this.field24937 = this.field24934;
        this.field24938 = this.field24935;
        this.field24930 = 0.1f * (this.field24949.nextFloat() * 0.5f + 0.2f);
        final float field24990 = this.field24949.nextFloat() * 0.6f + 0.4f;
        this.field24953 = 0.9f * field24990;
        this.field24954 = 0.9f * field24990;
        this.field24955 = field24990;
        this.field24944 = false;
        this.field24951 = (int)(Math.random() * 10.0) + 30;
    }
    
    @Override
    public Class6451 method18418() {
        return Class6451.field25659;
    }
    
    @Override
    public void method18431(final double n, final double n2, final double n3) {
        this.method18445(this.method18444().method18499(n, n2, n3));
        this.method18442();
    }
    
    @Override
    public int method18419(final float n) {
        final int method18419 = super.method18419(n);
        final float n2 = this.field24950 / (float)this.field24951;
        final float n3 = n2 * n2;
        final float n4 = n3 * n3;
        final int n5 = method18419 & 0xFF;
        int n6 = (method18419 >> 16 & 0xFF) + (int)(n4 * 15.0f * 16.0f);
        if (n6 > 240) {
            n6 = 240;
        }
        return n5 | n6 << 16;
    }
    
    @Override
    public void method18420() {
        this.field24933 = this.field24936;
        this.field24934 = this.field24937;
        this.field24935 = this.field24938;
        if (this.field24950++ < this.field24951) {
            final float n = 1.0f - this.field24950 / (float)this.field24951;
            final float n2 = 1.0f - n;
            final float n3 = n2 * n2;
            final float n4 = n3 * n3;
            this.field24936 = this.field24984 + this.field24939 * n;
            this.field24937 = this.field24985 + this.field24940 * n - n4 * 1.2f;
            this.field24938 = this.field24986 + this.field24941 * n;
        }
        else {
            this.method18439();
        }
    }
}
