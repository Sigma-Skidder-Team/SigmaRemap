// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import net.minecraft.world.chunk.IChunk;

import java.util.function.Function;

public class Class6040 extends Class6032<Class4408>
{
    private static final BlockState field24579;
    private static final BlockState field24580;
    private static final BlockState field24581;
    private static final BlockState field24582;
    private static final BlockState field24583;
    private static final BlockState field24584;
    private static final BlockState field24585;
    public BlockState[] field24586;
    public long field24587;
    public Class8575 field24588;
    public Class8575 field24589;
    public Class8575 field24590;
    
    public Class6040(final Function<Dynamic<?>, ? extends Class4408> function) {
        super(function);
    }
    
    public void method17959(final Random random, final IChunk class1860, final Biome class1861, final int n, final int n2, final int n3, final double n4, final BlockState class1862, final BlockState class1863, final int n5, final long n6, final Class4408 class1864) {
        final int n7 = n & 0xF;
        final int n8 = n2 & 0xF;
        BlockState class1865 = Class6040.field24579;
        BlockState class1866 = class1861.method9872().method13339();
        final int n9 = (int)(n4 / 3.0 + 3.0 + random.nextDouble() * 0.25);
        final boolean b = Math.cos(n4 / 3.0 * 3.141592653589793) > 0.0;
        int n10 = -1;
        boolean b2 = false;
        int n11 = 0;
        final Mutable class1867 = new Mutable();
        for (int i = n3; i >= 0; --i) {
            if (n11 < 15) {
                class1867.setPos(n7, i, n8);
                final BlockState method6701 = class1860.getBlockState(class1867);
                if (!method6701.method21706()) {
                    if (method6701.getBlock() == class1862.getBlock()) {
                        if (n10 != -1) {
                            if (n10 > 0) {
                                --n10;
                                if (!b2) {
                                    class1860.method7008(class1867, this.method17964(n, i, n2), false);
                                }
                                else {
                                    class1860.method7008(class1867, Class6040.field24580, false);
                                }
                            }
                        }
                        else {
                            b2 = false;
                            if (n9 > 0) {
                                if (i >= n5 - 4) {
                                    if (i <= n5 + 1) {
                                        class1865 = Class6040.field24579;
                                        class1866 = class1861.method9872().method13339();
                                    }
                                }
                            }
                            else {
                                class1865 = Blocks.AIR.getDefaultState();
                                class1866 = class1862;
                            }
                            if (i < n5) {
                                if (class1865 == null || class1865.method21706()) {
                                    class1865 = class1863;
                                }
                            }
                            n10 = n9 + Math.max(0, i - n5);
                            if (i < n5 - 1) {
                                class1860.method7008(class1867, class1866, false);
                                final Block method6702 = class1866.getBlock();
                                Label_0645: {
                                    if (method6702 != Blocks.field29482) {
                                        if (method6702 != Blocks.field29483) {
                                            if (method6702 != Blocks.field29484) {
                                                if (method6702 != Blocks.field29485) {
                                                    if (method6702 != Blocks.field29486) {
                                                        if (method6702 != Blocks.field29487) {
                                                            if (method6702 != Blocks.field29488) {
                                                                if (method6702 != Blocks.field29489) {
                                                                    if (method6702 != Blocks.field29490) {
                                                                        if (method6702 != Blocks.field29491) {
                                                                            if (method6702 != Blocks.field29492) {
                                                                                if (method6702 != Blocks.field29493) {
                                                                                    if (method6702 != Blocks.field29494) {
                                                                                        if (method6702 != Blocks.field29495) {
                                                                                            if (method6702 != Blocks.field29496) {
                                                                                                if (method6702 != Blocks.field29497) {
                                                                                                    break Label_0645;
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
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    class1860.method7008(class1867, Class6040.field24580, false);
                                }
                            }
                            else if (i <= n5 + 3 + n9) {
                                class1860.method7008(class1867, class1861.method9872().method13338(), false);
                                b2 = true;
                            }
                            else {
                                BlockState class1868;
                                if (i >= 64 && i <= 127) {
                                    if (!b) {
                                        class1868 = this.method17964(n, i, n2);
                                    }
                                    else {
                                        class1868 = Class6040.field24581;
                                    }
                                }
                                else {
                                    class1868 = Class6040.field24580;
                                }
                                class1860.method7008(class1867, class1868, false);
                            }
                        }
                        ++n11;
                    }
                }
                else {
                    n10 = -1;
                }
            }
        }
    }
    
    @Override
    public void method17962(final long field24587) {
        if (this.field24587 != field24587 || this.field24586 == null) {
            this.method17963(field24587);
        }
        Label_0100: {
            if (this.field24587 == field24587) {
                if (this.field24588 != null) {
                    if (this.field24589 != null) {
                        break Label_0100;
                    }
                }
            }
            final Class2317 class2317 = new Class2317(field24587);
            this.field24588 = new Class8575(class2317, 3, 0);
            this.field24589 = new Class8575(class2317, 0, 0);
        }
        this.field24587 = field24587;
    }
    
    public void method17963(final long n) {
        Arrays.fill(this.field24586 = new BlockState[64], Class6040.field24581);
        final Class2317 class2317 = new Class2317(n);
        this.field24590 = new Class8575(class2317, 0, 0);
        for (int i = 0; i < 64; ++i) {
            i += class2317.nextInt(5) + 1;
            if (i < 64) {
                this.field24586[i] = Class6040.field24580;
            }
        }
        for (int n2 = class2317.nextInt(4) + 2, j = 0; j < n2; ++j) {
            for (int n3 = class2317.nextInt(3) + 1, nextInt = class2317.nextInt(64), n4 = 0; nextInt + n4 < 64 && n4 < n3; ++n4) {
                this.field24586[nextInt + n4] = Class6040.field24582;
            }
        }
        for (int n5 = class2317.nextInt(4) + 2, k = 0; k < n5; ++k) {
            for (int n6 = class2317.nextInt(3) + 2, nextInt2 = class2317.nextInt(64), n7 = 0; nextInt2 + n7 < 64 && n7 < n6; ++n7) {
                this.field24586[nextInt2 + n7] = Class6040.field24583;
            }
        }
        for (int n8 = class2317.nextInt(4) + 2, l = 0; l < n8; ++l) {
            for (int n9 = class2317.nextInt(3) + 1, nextInt3 = class2317.nextInt(64), n10 = 0; nextInt3 + n10 < 64 && n10 < n9; ++n10) {
                this.field24586[nextInt3 + n10] = Class6040.field24584;
            }
        }
        final int n11 = class2317.nextInt(3) + 3;
        int n12 = 0;
        for (int n13 = 0; n13 < n11; ++n13) {
            n12 += class2317.nextInt(16) + 4;
            for (int n14 = 0; n12 + n14 < 64 && n14 < 1; ++n14) {
                this.field24586[n12 + n14] = Class6040.field24579;
                if (n12 + n14 > 1) {
                    if (class2317.nextBoolean()) {
                        this.field24586[n12 + n14 - 1] = Class6040.field24585;
                    }
                }
                if (n12 + n14 < 63) {
                    if (class2317.nextBoolean()) {
                        this.field24586[n12 + n14 + 1] = Class6040.field24585;
                    }
                }
            }
        }
    }
    
    public BlockState method17964(final int n, final int n2, final int n3) {
        return this.field24586[(n2 + (int)Math.round(this.field24590.method29027(n / 512.0, n3 / 512.0, false) * 2.0) + 64) % 64];
    }
    
    static {
        field24579 = Blocks.field29482.getDefaultState();
        field24580 = Blocks.field29483.getDefaultState();
        field24581 = Blocks.field29546.getDefaultState();
        field24582 = Blocks.field29486.getDefaultState();
        field24583 = Blocks.field29494.getDefaultState();
        field24584 = Blocks.field29496.getDefaultState();
        field24585 = Blocks.field29490.getDefaultState();
    }
}
