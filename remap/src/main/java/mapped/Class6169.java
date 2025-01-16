// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.world.World;

public class Class6169 extends Class6159
{
    private static String[] field24927;
    
    private Class6169(final World class1847, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        super(class1847, n, n2, n3);
        this.method18440(0.02f, 0.02f);
        this.field24930 *= this.field24949.nextFloat() * 0.6f + 0.2f;
        this.field24939 = n4 * 0.20000000298023224 + (Math.random() * 2.0 - 1.0) * 0.019999999552965164;
        this.field24940 = n5 * 0.20000000298023224 + (Math.random() * 2.0 - 1.0) * 0.019999999552965164;
        this.field24941 = n6 * 0.20000000298023224 + (Math.random() * 2.0 - 1.0) * 0.019999999552965164;
        this.field24951 = (int)(8.0 / (Math.random() * 0.8 + 0.2));
    }
    
    @Override
    public void method18420() {
        this.field24933 = this.field24936;
        this.field24934 = this.field24937;
        this.field24935 = this.field24938;
        if (this.field24951-- > 0) {
            this.field24940 += 0.002;
            this.method18431(this.field24939, this.field24940, this.field24941);
            this.field24939 *= 0.8500000238418579;
            this.field24940 *= 0.8500000238418579;
            this.field24941 *= 0.8500000238418579;
            if (!this.field24932.getFluidState(new BlockPos(this.field24936, this.field24937, this.field24938)).isTagged(Class7324.field28319)) {
                this.method18439();
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
