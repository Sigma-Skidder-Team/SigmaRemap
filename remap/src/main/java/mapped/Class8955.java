// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

import javax.annotation.Nullable;
import java.util.Comparator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Random;

public class Class8955
{
    private static String[] field37651;
    private final Class1849 field37652;
    private final Random field37653;
    
    public Class8955(final Class1849 field37652) {
        this.field37652 = field37652;
        this.field37653 = new Random(field37652.method6753());
    }
    
    public boolean method31767(final Entity class399, final float n) {
        final Vec3d method1859 = class399.method1859();
        final Class9402 method1860 = this.method31768(new BlockPos(class399), class399.getMotion(), class399.method1860(), method1859.x, method1859.y, class399 instanceof PlayerEntity);
        if (method1860 != null) {
            final Vec3d field40340 = method1860.field40340;
            class399.method1936(method1860.field40341);
            class399.rotationYaw = n + method1860.field40342;
            class399.method1950(field40340.x, field40340.y, field40340.z);
            return true;
        }
        return false;
    }
    
    @Nullable
    public Class9402 method31768(final BlockPos class354, final Vec3d class355, final Direction class356, final double n, final double n2, final boolean b) {
        final Class1883 method6921 = this.field37652.method6921();
        method6921.method7216(this.field37652, class354, 128);
        return method6921.method7199(class357 -> class357 == Class8912.field37480, class354, 128, Class2045.field11652).collect((Collector<? super Class377, ?, List<? super Class377>>)Collectors.toList()).stream().min(Comparator.comparingDouble(class359 -> class359.method1259().method1083(class358)).thenComparingInt(class360 -> class360.method1259().method1075())).map(class363 -> {
            class363.method1259();
            final BlockPos class364;
            this.field37652.method6904().method7441(Class9105.field38570, new ChunkPos(class364), 3, class364);
            return Class3998.method12149(this.field37652, class364).method25271(class361, class364, n3, class362, n4);
        }).orElse(null);
    }
    
    public boolean method31769(final Entity class399) {
        double n = -1.0;
        final int method35644 = MathHelper.floor(class399.getPosX());
        final int method35645 = MathHelper.floor(class399.getPosY());
        final int method35646 = MathHelper.floor(class399.getPosZ());
        int n2 = method35644;
        int n3 = method35645;
        int n4 = method35646;
        int n5 = 0;
        final int nextInt = this.field37653.nextInt(4);
        final Mutable class400 = new Mutable();
        for (int i = method35644 - 16; i <= method35644 + 16; ++i) {
            final double n6 = i + 0.5 - class399.getPosX();
            for (int j = method35646 - 16; j <= method35646 + 16; ++j) {
                final double n7 = j + 0.5 - class399.getPosZ();
            Label_0236:
                for (int k = this.field37652.method6778() - 1; k >= 0; --k) {
                    if (this.field37652.method6961(class400.setPos(i, k, j))) {
                        while (k > 0 && this.field37652.method6961(class400.setPos(i, k - 1, j))) {
                            --k;
                        }
                        for (int l = nextInt; l < nextInt + 4; ++l) {
                            int n8 = l % 2;
                            int n9 = 1 - n8;
                            if (l % 4 >= 2) {
                                n8 = -n8;
                                n9 = -n9;
                            }
                            for (int n10 = 0; n10 < 3; ++n10) {
                                for (int n11 = 0; n11 < 4; ++n11) {
                                    for (int n12 = -1; n12 < 4; ++n12) {
                                        class400.setPos(i + (n11 - 1) * n8 + n10 * n9, k + n12, j + (n11 - 1) * n9 - n10 * n8);
                                        if (n12 < 0 && !this.field37652.getBlockState(class400).method21697().method26439()) {
                                            continue Label_0236;
                                        }
                                        if (n12 >= 0 && !this.field37652.method6961(class400)) {
                                            continue Label_0236;
                                        }
                                    }
                                }
                            }
                            final double n13 = k + 0.5 - class399.getPosY();
                            final double n14 = n6 * n6 + n13 * n13 + n7 * n7;
                            if (n < 0.0 || n14 < n) {
                                n = n14;
                                n2 = i;
                                n3 = k;
                                n4 = j;
                                n5 = l % 4;
                            }
                        }
                    }
                }
            }
        }
        if (n < 0.0) {
            for (int n15 = method35644 - 16; n15 <= method35644 + 16; ++n15) {
                final double n16 = n15 + 0.5 - class399.getPosX();
                for (int n17 = method35646 - 16; n17 <= method35646 + 16; ++n17) {
                    final double n18 = n17 + 0.5 - class399.getPosZ();
                Label_0702:
                    for (int n19 = this.field37652.method6778() - 1; n19 >= 0; --n19) {
                        if (this.field37652.method6961(class400.setPos(n15, n19, n17))) {
                            while (n19 > 0 && this.field37652.method6961(class400.setPos(n15, n19 - 1, n17))) {
                                --n19;
                            }
                            for (int n20 = nextInt; n20 < nextInt + 2; ++n20) {
                                final int n21 = n20 % 2;
                                final int n22 = 1 - n21;
                                for (int n23 = 0; n23 < 4; ++n23) {
                                    for (int n24 = -1; n24 < 4; ++n24) {
                                        class400.setPos(n15 + (n23 - 1) * n21, n19 + n24, n17 + (n23 - 1) * n22);
                                        if (n24 < 0 && !this.field37652.getBlockState(class400).method21697().method26439()) {
                                            continue Label_0702;
                                        }
                                        if (n24 >= 0 && !this.field37652.method6961(class400)) {
                                            continue Label_0702;
                                        }
                                    }
                                }
                                final double n25 = n19 + 0.5 - class399.getPosY();
                                final double n26 = n16 * n16 + n25 * n25 + n18 * n18;
                                if (n < 0.0 || n26 < n) {
                                    n = n26;
                                    n2 = n15;
                                    n3 = n19;
                                    n4 = n17;
                                    n5 = n20 % 2;
                                }
                            }
                        }
                    }
                }
            }
        }
        final int n27 = n2;
        int method35647 = n3;
        final int n28 = n4;
        int n29 = n5 % 2;
        int n30 = 1 - n29;
        if (n5 % 4 >= 2) {
            n29 = -n29;
            n30 = -n30;
        }
        if (n < 0.0) {
            method35647 = MathHelper.method35651(n3, 70, this.field37652.method6778() - 10);
            for (int n31 = -1; n31 <= 1; ++n31) {
                for (int n32 = 1; n32 < 3; ++n32) {
                    for (int n33 = -1; n33 < 3; ++n33) {
                        final int n34 = n27 + (n32 - 1) * n29 + n31 * n30;
                        final int n35 = method35647 + n33;
                        final int n36 = n28 + (n32 - 1) * n30 - n31 * n29;
                        final boolean b = n33 < 0;
                        class400.setPos(n34, n35, n36);
                        this.field37652.method6692(class400, b ? Class7521.field29286.getDefaultState() : Class7521.field29147.getDefaultState());
                    }
                }
            }
        }
        for (int n37 = -1; n37 < 3; ++n37) {
            for (int n38 = -1; n38 < 4; ++n38) {
                if (n37 != -1) {
                    if (n37 != 2) {
                        if (n38 != -1) {
                            if (n38 != 3) {
                                continue;
                            }
                        }
                    }
                }
                class400.setPos(n27 + n37 * n29, method35647 + n38, n28 + n37 * n30);
                this.field37652.setBlockState(class400, Class7521.field29286.getDefaultState(), 3);
            }
        }
        final BlockState class401 = ((StateHolder<O, BlockState>)Class7521.field29341.getDefaultState()).with(Class3998.field18018, (n29 != 0) ? Direction.Axis.X : Direction.Axis.Z);
        for (int n39 = 0; n39 < 2; ++n39) {
            for (int n40 = 0; n40 < 3; ++n40) {
                class400.setPos(n27 + n39 * n29, method35647 + n40, n28 + n39 * n30);
                this.field37652.setBlockState(class400, class401, 18);
            }
        }
        return true;
    }
}
