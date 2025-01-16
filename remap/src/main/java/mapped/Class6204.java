// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class Class6204 extends Class6159
{
    private static String[] field25038;
    private float field25039;
    
    private Class6204(final World class1847, final double n, final double n2, final double n3) {
        super(class1847, n, n2, n3);
        this.field24951 = (int)(Math.random() * 60.0) + 30;
        this.field24944 = false;
        this.field24939 = 0.0;
        this.field24940 = -0.05;
        this.field24941 = 0.0;
        this.method18440(0.02f, 0.02f);
        this.field24930 *= this.field24949.nextFloat() * 0.6f + 0.2f;
        this.field24952 = 0.002f;
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
            this.field24939 += 0.6f * MathHelper.cos(this.field25039);
            this.field24941 += 0.6f * MathHelper.sin(this.field25039);
            this.field24939 *= 0.07;
            this.field24941 *= 0.07;
            this.method18431(this.field24939, this.field24940, this.field24941);
            if (!this.field24932.getFluidState(new BlockPos(this.field24936, this.field24937, this.field24938)).isTagged(Class7324.field28319) || this.field24943) {
                this.method18439();
            }
            this.field25039 += (float)0.08;
        }
        else {
            this.method18439();
        }
    }
}
