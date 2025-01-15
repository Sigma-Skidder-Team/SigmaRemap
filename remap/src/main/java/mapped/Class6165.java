// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.world.World;

public class Class6165 extends Class6159
{
    private static String[] field24921;
    
    private Class6165(final World class1847, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        super(class1847, n, n2, n3, n4, n5, n6);
        final float field24955 = this.field24949.nextFloat() * 0.1f + 0.2f;
        this.field24953 = field24955;
        this.field24954 = field24955;
        this.field24955 = field24955;
        this.method18440(0.02f, 0.02f);
        this.field24930 *= this.field24949.nextFloat() * 0.6f + 0.5f;
        this.field24939 *= 0.019999999552965164;
        this.field24940 *= 0.019999999552965164;
        this.field24941 *= 0.019999999552965164;
        this.field24951 = (int)(20.0 / (Math.random() * 0.8 + 0.2));
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
    public void method18420() {
        this.field24933 = this.field24936;
        this.field24934 = this.field24937;
        this.field24935 = this.field24938;
        if (this.field24951-- > 0) {
            this.method18431(this.field24939, this.field24940, this.field24941);
            this.field24939 *= 0.99;
            this.field24940 *= 0.99;
            this.field24941 *= 0.99;
        }
        else {
            this.method18439();
        }
    }
}
