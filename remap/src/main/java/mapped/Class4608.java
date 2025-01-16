// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.BitSet;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;

import java.util.function.Function;

public class Class4608 extends Class4535<Class5133>
{
    public Class4608(final Function<Dynamic<?>, ? extends Class5133> function) {
        super(function);
    }
    
    public boolean method13663(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, final BlockPos class1853, final Class5133 class1854) {
        final float n = random.nextFloat() * 3.1415927f;
        final float n2 = class1854.field22108 / 8.0f;
        final int method35649 = MathHelper.ceil((class1854.field22108 / 16.0f * 2.0f + 1.0f) / 2.0f);
        final double n3 = class1853.getX() + MathHelper.sin(n) * n2;
        final double n4 = class1853.getX() - MathHelper.sin(n) * n2;
        final double n5 = class1853.getZ() + MathHelper.cos(n) * n2;
        final double n6 = class1853.getZ() - MathHelper.cos(n) * n2;
        final double n7 = class1853.getY() + random.nextInt(3) - 2;
        final double n8 = class1853.getY() + random.nextInt(3) - 2;
        final int n9 = class1853.getX() - MathHelper.ceil(n2) - method35649;
        final int n10 = class1853.getY() - 2 - method35649;
        final int n11 = class1853.getZ() - MathHelper.ceil(n2) - method35649;
        final int n12 = 2 * (MathHelper.ceil(n2) + method35649);
        final int n13 = 2 * (2 + method35649);
        for (int i = n9; i <= n9 + n12; ++i) {
            for (int j = n11; j <= n11 + n12; ++j) {
                if (n10 <= class1851.method6699(HeightmapType.field11523, i, j)) {
                    return this.method13664(class1851, random, class1854, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13);
                }
            }
        }
        return false;
    }
    
    public boolean method13664(final Class1851 class1851, final Random random, final Class5133 class1852, final double n, final double n2, final double n3, final double n4, final double n5, final double n6, final int b, final int b2, final int b3, final int n7, final int n8) {
        int n9 = 0;
        final BitSet set = new BitSet(n7 * n8 * n7);
        final Mutable class1853 = new Mutable();
        final double[] array = new double[class1852.field22108 * 4];
        for (int i = 0; i < class1852.field22108; ++i) {
            final float n10 = i / (float)class1852.field22108;
            final double method35701 = MathHelper.lerp(n10, n, n2);
            final double method35702 = MathHelper.lerp(n10, n5, n6);
            final double method35703 = MathHelper.lerp(n10, n3, n4);
            final double n11 = ((MathHelper.sin(3.1415927f * n10) + 1.0f) * (random.nextDouble() * class1852.field22108 / 16.0) + 1.0) / 2.0;
            array[i * 4 + 0] = method35701;
            array[i * 4 + 1] = method35702;
            array[i * 4 + 2] = method35703;
            array[i * 4 + 3] = n11;
        }
        for (int j = 0; j < class1852.field22108 - 1; ++j) {
            if (array[j * 4 + 3] > 0.0) {
                for (int k = j + 1; k < class1852.field22108; ++k) {
                    if (array[k * 4 + 3] > 0.0) {
                        final double n12 = array[j * 4 + 0] - array[k * 4 + 0];
                        final double n13 = array[j * 4 + 1] - array[k * 4 + 1];
                        final double n14 = array[j * 4 + 2] - array[k * 4 + 2];
                        final double n15 = array[j * 4 + 3] - array[k * 4 + 3];
                        if (n15 * n15 > n12 * n12 + n13 * n13 + n14 * n14) {
                            if (n15 <= 0.0) {
                                array[j * 4 + 3] = -1.0;
                            }
                            else {
                                array[k * 4 + 3] = -1.0;
                            }
                        }
                    }
                }
            }
        }
        for (int l = 0; l < class1852.field22108; ++l) {
            final double n16 = array[l * 4 + 3];
            if (n16 >= 0.0) {
                final double n17 = array[l * 4 + 0];
                final double n18 = array[l * 4 + 1];
                final double n19 = array[l * 4 + 2];
                final int max = Math.max(MathHelper.floor(n17 - n16), b);
                final int max2 = Math.max(MathHelper.floor(n18 - n16), b2);
                final int max3 = Math.max(MathHelper.floor(n19 - n16), b3);
                final int max4 = Math.max(MathHelper.floor(n17 + n16), max);
                final int max5 = Math.max(MathHelper.floor(n18 + n16), max2);
                final int max6 = Math.max(MathHelper.floor(n19 + n16), max3);
                for (int n20 = max; n20 <= max4; ++n20) {
                    final double n21 = (n20 + 0.5 - n17) / n16;
                    if (n21 * n21 < 1.0) {
                        for (int n22 = max2; n22 <= max5; ++n22) {
                            final double n23 = (n22 + 0.5 - n18) / n16;
                            if (n21 * n21 + n23 * n23 < 1.0) {
                                for (int n24 = max3; n24 <= max6; ++n24) {
                                    final double n25 = (n24 + 0.5 - n19) / n16;
                                    if (n21 * n21 + n23 * n23 + n25 * n25 < 1.0) {
                                        final int n26 = n20 - b + (n22 - b2) * n7 + (n24 - b3) * n7 * n8;
                                        if (!set.get(n26)) {
                                            set.set(n26);
                                            class1853.setPos(n20, n22, n24);
                                            if (class1852.field22107.method8158().test(class1851.getBlockState(class1853))) {
                                                class1851.setBlockState(class1853, class1852.field22109, 2);
                                                ++n9;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return n9 > 0;
    }
}
