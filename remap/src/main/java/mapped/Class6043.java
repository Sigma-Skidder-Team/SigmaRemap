// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import com.mojang.datafixers.Dynamic;
import net.minecraft.world.chunk.IChunk;

import java.util.function.Function;

public class Class6043 extends Class6032<Class4408>
{
    public Class6043(final Function<Dynamic<?>, ? extends Class4408> function) {
        super(function);
    }
    
    public void method17959(final Random random, final IChunk class1860, final Biome class1861, final int n, final int n2, final int n3, final double n4, final Class7096 class1862, final Class7096 class1863, final int n5, final long n6, final Class4408 class1864) {
        this.method17965(random, class1860, class1861, n, n2, n3, n4, class1862, class1863, class1864.method13338(), class1864.method13339(), class1864.method13340(), n5);
    }
    
    public void method17965(final Random random, final IChunk class1860, final Biome class1861, final int n, final int n2, final int n3, final double n4, final Class7096 class1862, final Class7096 class1863, final Class7096 class1864, final Class7096 class1865, final Class7096 class1866, final int n5) {
        Class7096 class1867 = class1864;
        Class7096 class1868 = class1865;
        final Mutable class1869 = new Mutable();
        int n6 = -1;
        final int n7 = (int)(n4 / 3.0 + 3.0 + random.nextDouble() * 0.25);
        final int n8 = n & 0xF;
        final int n9 = n2 & 0xF;
        for (int i = n3; i >= 0; --i) {
            class1869.setPos(n8, i, n9);
            final Class7096 method6701 = class1860.getBlockState(class1869);
            if (!method6701.method21706()) {
                if (method6701.method21696() == class1862.method21696()) {
                    if (n6 != -1) {
                        if (n6 > 0) {
                            --n6;
                            class1860.method7008(class1869, class1868, false);
                            if (n6 == 0) {
                                if (class1868.method21696() == Blocks.field29175) {
                                    if (n7 > 1) {
                                        n6 = random.nextInt(4) + Math.max(0, i - 63);
                                        class1868 = ((class1868.method21696() != Blocks.field29176) ? Blocks.field29217.getDefaultState() : Blocks.field29587.getDefaultState());
                                    }
                                }
                            }
                        }
                    }
                    else {
                        if (n7 > 0) {
                            if (i >= n5 - 4) {
                                if (i <= n5 + 1) {
                                    class1867 = class1864;
                                    class1868 = class1865;
                                }
                            }
                        }
                        else {
                            class1867 = Blocks.AIR.getDefaultState();
                            class1868 = class1862;
                        }
                        if (i < n5) {
                            if (class1867 == null || class1867.method21706()) {
                                if (class1861.method9845(class1869.setPos(n, i, n2)) >= 0.15f) {
                                    class1867 = class1863;
                                }
                                else {
                                    class1867 = Blocks.field29330.getDefaultState();
                                }
                                class1869.setPos(n8, i, n9);
                            }
                        }
                        n6 = n7;
                        if (i < n5 - 1) {
                            if (i >= n5 - 7 - n7) {
                                class1860.method7008(class1869, class1868, false);
                            }
                            else {
                                class1867 = Blocks.AIR.getDefaultState();
                                class1868 = class1862;
                                class1860.method7008(class1869, class1866, false);
                            }
                        }
                        else {
                            class1860.method7008(class1869, class1867, false);
                        }
                    }
                }
            }
            else {
                n6 = -1;
            }
        }
    }
}
