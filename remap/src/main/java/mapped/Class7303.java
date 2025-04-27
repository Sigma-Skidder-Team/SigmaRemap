// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.BitSet;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.chunk.IChunk;

import java.util.function.Function;

public class Class7303 extends Class7304<Class5117>
{
    public Class7303(final Function<Dynamic<?>, ? extends Class5117> function, final int n) {
        super(function, n);
    }
    
    public boolean method22397(final Random random, final int n, final int n2, final Class5117 class5117) {
        return random.nextFloat() <= class5117.field22066;
    }
    
    public boolean method22398(final IChunk class1860, final Function<BlockPos, Biome> function, final Random random, final int n, final int n2, final int n3, final int n4, final int n5, final BitSet set, final Class5117 class1861) {
        final int n6 = (this.method22405() * 2 - 1) * 16;
        for (int nextInt = random.nextInt(random.nextInt(random.nextInt(this.method22392()) + 1) + 1), i = 0; i < nextInt; ++i) {
            final double n7 = n2 * 16 + random.nextInt(16);
            final double n8 = this.method22395(random);
            final double n9 = n3 * 16 + random.nextInt(16);
            int n10 = 1;
            if (random.nextInt(4) == 0) {
                this.method22399(class1860, function, random.nextLong(), n, n4, n5, n7, n8, n9, 1.0f + random.nextFloat() * 6.0f, 0.5, set);
                n10 += random.nextInt(4);
            }
            for (int j = 0; j < n10; ++j) {
                this.method22400(class1860, function, random.nextLong(), n, n4, n5, n7, n8, n9, this.method22393(random), random.nextFloat() * 6.2831855f, (random.nextFloat() - 0.5f) / 4.0f, 0, n6 - random.nextInt(n6 / 4), this.method22394(), set);
            }
        }
        return true;
    }
    
    public int method22392() {
        return 15;
    }
    
    public float method22393(final Random random) {
        float n = random.nextFloat() * 2.0f + random.nextFloat();
        if (random.nextInt(10) == 0) {
            n *= random.nextFloat() * random.nextFloat() * 3.0f + 1.0f;
        }
        return n;
    }
    
    public double method22394() {
        return 1.0;
    }
    
    public int method22395(final Random random) {
        return random.nextInt(random.nextInt(120) + 8);
    }
    
    public void method22399(final IChunk class1860, final Function<BlockPos, Biome> function, final long n, final int n2, final int n3, final int n4, final double n5, final double n6, final double n7, final float n8, final double n9, final BitSet set) {
        final double n10 = 1.5 + MathHelper.sin(1.5707964f) * n8;
        this.method22406(class1860, function, n, n2, n3, n4, n5 + 1.0, n6, n7, n10, n10 * n9, set);
    }
    
    public void method22400(final IChunk class1860, final Function<BlockPos, Biome> function, final long seed, final int n, final int n2, final int n3, double n4, double n5, double n6, final float n7, float n8, float n9, final int n10, final int n11, final double n12, final BitSet set) {
        final Random random = new Random(seed);
        final int n13 = random.nextInt(n11 / 2) + n11 / 4;
        final boolean b = random.nextInt(6) == 0;
        float n14 = 0.0f;
        float n15 = 0.0f;
        for (int i = n10; i < n11; ++i) {
            final double n16 = 1.5 + MathHelper.sin(3.1415927f * i / n11) * n7;
            final double n17 = n16 * n12;
            final float method35639 = MathHelper.cos(n9);
            n4 += MathHelper.cos(n8) * method35639;
            n5 += MathHelper.sin(n9);
            n6 += MathHelper.sin(n8) * method35639;
            n9 *= (b ? 0.92f : 0.7f);
            n9 += n15 * 0.1f;
            n8 += n14 * 0.1f;
            final float n18 = n15 * 0.9f;
            final float n19 = n14 * 0.75f;
            n15 = n18 + (random.nextFloat() - random.nextFloat()) * random.nextFloat() * 2.0f;
            n14 = n19 + (random.nextFloat() - random.nextFloat()) * random.nextFloat() * 4.0f;
            if (i == n13 && n7 > 1.0f) {
                this.method22400(class1860, function, random.nextLong(), n, n2, n3, n4, n5, n6, random.nextFloat() * 0.5f + 0.5f, n8 - 1.5707964f, n9 / 3.0f, i, n11, 1.0, set);
                this.method22400(class1860, function, random.nextLong(), n, n2, n3, n4, n5, n6, random.nextFloat() * 0.5f + 0.5f, n8 + 1.5707964f, n9 / 3.0f, i, n11, 1.0, set);
                return;
            }
            if (random.nextInt(4) != 0) {
                if (!this.method22411(n2, n3, n4, n6, i, n11, n7)) {
                    return;
                }
                this.method22406(class1860, function, seed, n, n2, n3, n4, n5, n6, n16, n17, set);
            }
        }
    }
    
    @Override
    public boolean method22401(final double n, final double n2, final double n3, final int n4) {
        return n2 <= -0.7 || n * n + n2 * n2 + n3 * n3 >= 1.0;
    }
}
