// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.world.World;

public class Class6197 extends Class6159
{
    private static String[] field25012;
    public final Class7805 field25013;
    private final float field25014;
    private float field25015;
    private float field25016;
    private float field25017;
    private float field25018;
    private boolean field25019;
    
    public Class6197(final World class1847, final double n, final double n2, final double n3, final Class7805 field25013, final float field25014) {
        super(class1847, n, n2, n3);
        this.field25015 = 0.91f;
        this.field25013 = field25013;
        this.field25014 = field25014;
    }
    
    public void method18455(final int n) {
        this.method18435(((n & 0xFF0000) >> 16) / 255.0f * 1.0f, ((n & 0xFF00) >> 8) / 255.0f * 1.0f, ((n & 0xFF) >> 0) / 255.0f * 1.0f);
    }
    
    public void method18456(final int n) {
        this.field25016 = ((n & 0xFF0000) >> 16) / 255.0f;
        this.field25017 = ((n & 0xFF00) >> 8) / 255.0f;
        this.field25018 = ((n & 0xFF) >> 0) / 255.0f;
        this.field25019 = true;
    }
    
    @Override
    public Class6451 method18418() {
        return Class6451.field25660;
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
                if (this.field25019) {
                    this.field24953 += (this.field25016 - this.field24953) * 0.2f;
                    this.field24954 += (this.field25017 - this.field24954) * 0.2f;
                    this.field24955 += (this.field25018 - this.field24955) * 0.2f;
                }
            }
            this.field24940 += this.field25014;
            this.method18431(this.field24939, this.field24940, this.field24941);
            this.field24939 *= this.field25015;
            this.field24940 *= this.field25015;
            this.field24941 *= this.field25015;
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
    public int method18419(final float n) {
        return 15728880;
    }
    
    public void method18457(final float field25015) {
        this.field25015 = field25015;
    }
}
