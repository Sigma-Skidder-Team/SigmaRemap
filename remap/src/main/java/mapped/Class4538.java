// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util2.Direction;

import java.util.function.Function;

public class Class4538 extends Class4536
{
    public Class4538(final Function<Dynamic<?>, ? extends Class5122> function) {
        super(function);
    }
    
    @Override
    public boolean method13536(final Class1851 class1851, final Random random, final BlockPos class1852, final BlockState class1853) {
        final int n = random.nextInt(3) + 3;
        final int n2 = random.nextInt(3) + 3;
        final int n3 = random.nextInt(3) + 3;
        final int n4 = random.nextInt(3) + 1;
        final Mutable class1854 = new Mutable(class1852);
        for (int i = 0; i <= n2; ++i) {
            for (int j = 0; j <= n; ++j) {
                int k = 0;
            Label_0141_Outer:
                while (k <= n3) {
                    class1854.setPos(i + class1852.getX(), j + class1852.getY(), k + class1852.getZ());
                    class1854.method1291(Direction.DOWN, n4);
                    while (true) {
                        Label_0155: {
                            if (i != 0 && i != n2) {
                                break Label_0155;
                            }
                            if (j != 0) {
                                if (j != n) {
                                    break Label_0155;
                                }
                            }
                            ++k;
                            continue Label_0141_Outer;
                        }
                        if (k == 0 || k == n3) {
                            if (j == 0) {
                                continue;
                            }
                            if (j == n) {
                                continue;
                            }
                        }
                        if (i == 0 || i == n2) {
                            if (k == 0) {
                                continue;
                            }
                            if (k == n3) {
                                continue;
                            }
                        }
                        if (i != 0) {
                            if (i != n2) {
                                if (j != 0) {
                                    if (j != n) {
                                        if (k != 0) {
                                            if (k != n3) {
                                                continue;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (random.nextFloat() < 0.1f) {
                            continue;
                        }
                        if (this.method13537(class1851, random, class1854, class1853)) {}
                        continue;
                    }
                }
            }
        }
        return true;
    }
}
