// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.world.World;

public class Class6202 extends Class6159
{
    private static String[] field25031;
    private final double field25032;
    private final double field25033;
    private final double field25034;
    
    private Class6202(final World class1847, final double field24936, final double field24937, final double field24938, final double field24939, final double field24940, final double field24941) {
        super(class1847, field24936, field24937, field24938);
        this.field24939 = field24939;
        this.field24940 = field24940;
        this.field24941 = field24941;
        this.field24936 = field24936;
        this.field24937 = field24937;
        this.field24938 = field24938;
        this.field25032 = this.field24936;
        this.field25033 = this.field24937;
        this.field25034 = this.field24938;
        this.field24930 = 0.1f * (this.field24949.nextFloat() * 0.2f + 0.5f);
        final float field24942 = this.field24949.nextFloat() * 0.6f + 0.4f;
        this.field24953 = field24942 * 0.9f;
        this.field24954 = field24942 * 0.3f;
        this.field24955 = field24942;
        this.field24951 = (int)(Math.random() * 10.0) + 40;
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
    public float method18430(final float n) {
        final float n2 = 1.0f - (this.field24950 + n) / this.field24951;
        return this.field24930 * (1.0f - n2 * n2);
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
            final float n = this.field24950 / (float)this.field24951;
            final float n2 = 1.0f - (-n + n * n * 2.0f);
            this.field24936 = this.field25032 + this.field24939 * n2;
            this.field24937 = this.field25033 + this.field24940 * n2 + (1.0f - n);
            this.field24938 = this.field25034 + this.field24941 * n2;
        }
        else {
            this.method18439();
        }
    }
}
