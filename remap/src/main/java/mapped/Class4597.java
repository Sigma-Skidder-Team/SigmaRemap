// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Set;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util2.Direction;

import java.util.function.Function;

public class Class4597 extends Class4592<Class5128>
{
    public Class4597(final Function<Dynamic<?>, ? extends Class5128> function) {
        super(function);
    }
    
    public boolean method13641(final Class1875 class1875, final Random random, final BlockPos class1876, final Set<BlockPos> set, final Set<BlockPos> set2, final MutableBoundingBox class1877, final Class5128 class1878) {
        final int n = random.nextInt(3) + random.nextInt(2) + class1878.field22082;
        final int method1074 = class1876.getX();
        final int method1075 = class1876.getY();
        final int method1076 = class1876.getZ();
        if (method1075 < 1 || method1075 + n + 1 >= 256) {
            return false;
        }
        final BlockPos method1077 = class1876.method1139();
        if (!Class4592.method13614(class1875, method1077)) {
            return false;
        }
        if (this.method13644(class1875, class1876, n)) {
            this.method13617(class1875, method1077);
            this.method13617(class1875, method1077.method1147());
            this.method13617(class1875, method1077.method1143());
            this.method13617(class1875, method1077.method1143().method1147());
            final Direction method1078 = Plane.HORIZONTAL.method576(random);
            final int n2 = n - random.nextInt(4);
            int n3 = 2 - random.nextInt(3);
            int n4 = method1074;
            int n5 = method1076;
            final int n6 = method1075 + n - 1;
            for (int i = 0; i < n; ++i) {
                if (i >= n2) {
                    if (n3 > 0) {
                        n4 += method1078.getXOffset();
                        n5 += method1078.getZOffset();
                        --n3;
                    }
                }
                final BlockPos class1879 = new BlockPos(n4, method1075 + i, n5);
                if (Class4592.method13613(class1875, class1879)) {
                    this.method13618(class1875, random, class1879, set, class1877, class1878);
                    this.method13618(class1875, random, class1879.method1147(), set, class1877, class1878);
                    this.method13618(class1875, random, class1879.method1143(), set, class1877, class1878);
                    this.method13618(class1875, random, class1879.method1147().method1143(), set, class1877, class1878);
                }
            }
            for (int j = -2; j <= 0; ++j) {
                for (int k = -2; k <= 0; ++k) {
                    final int n7 = -1;
                    this.method13619(class1875, random, new BlockPos(n4 + j, n6 + n7, n5 + k), set2, class1877, class1878);
                    this.method13619(class1875, random, new BlockPos(1 + n4 - j, n6 + n7, n5 + k), set2, class1877, class1878);
                    this.method13619(class1875, random, new BlockPos(n4 + j, n6 + n7, 1 + n5 - k), set2, class1877, class1878);
                    this.method13619(class1875, random, new BlockPos(1 + n4 - j, n6 + n7, 1 + n5 - k), set2, class1877, class1878);
                    if (j > -2 || k > -1) {
                        if (j != -1 || k != -2) {
                            final int n8 = 1;
                            this.method13619(class1875, random, new BlockPos(n4 + j, n6 + n8, n5 + k), set2, class1877, class1878);
                            this.method13619(class1875, random, new BlockPos(1 + n4 - j, n6 + n8, n5 + k), set2, class1877, class1878);
                            this.method13619(class1875, random, new BlockPos(n4 + j, n6 + n8, 1 + n5 - k), set2, class1877, class1878);
                            this.method13619(class1875, random, new BlockPos(1 + n4 - j, n6 + n8, 1 + n5 - k), set2, class1877, class1878);
                        }
                    }
                }
            }
            if (random.nextBoolean()) {
                this.method13619(class1875, random, new BlockPos(n4, n6 + 2, n5), set2, class1877, class1878);
                this.method13619(class1875, random, new BlockPos(n4 + 1, n6 + 2, n5), set2, class1877, class1878);
                this.method13619(class1875, random, new BlockPos(n4 + 1, n6 + 2, n5 + 1), set2, class1877, class1878);
                this.method13619(class1875, random, new BlockPos(n4, n6 + 2, n5 + 1), set2, class1877, class1878);
            }
            for (int l = -3; l <= 4; ++l) {
                for (int a = -3; a <= 4; ++a) {
                    if (l != -3 || a != -3) {
                        if (l != -3 || a != 4) {
                            if (l != 4 || a != -3) {
                                if (l != 4 || a != 4) {
                                    if (Math.abs(l) < 3 || Math.abs(a) < 3) {
                                        this.method13619(class1875, random, new BlockPos(n4 + l, n6, n5 + a), set2, class1877, class1878);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            for (int n9 = -1; n9 <= 2; ++n9) {
                for (int n10 = -1; n10 <= 2; ++n10) {
                    if (n9 >= 0) {
                        if (n9 <= 1) {
                            if (n10 >= 0) {
                                if (n10 <= 1) {
                                    continue;
                                }
                            }
                        }
                    }
                    if (random.nextInt(3) <= 0) {
                        for (int n11 = random.nextInt(3) + 2, n12 = 0; n12 < n11; ++n12) {
                            this.method13618(class1875, random, new BlockPos(method1074 + n9, n6 - n12 - 1, method1076 + n10), set, class1877, class1878);
                        }
                        for (int n13 = -1; n13 <= 1; ++n13) {
                            for (int n14 = -1; n14 <= 1; ++n14) {
                                this.method13619(class1875, random, new BlockPos(n4 + n9 + n13, n6, n5 + n10 + n14), set2, class1877, class1878);
                            }
                        }
                        for (int a2 = -2; a2 <= 2; ++a2) {
                            for (int a3 = -2; a3 <= 2; ++a3) {
                                if (Math.abs(a2) != 2 || Math.abs(a3) != 2) {
                                    this.method13619(class1875, random, new BlockPos(n4 + n9 + a2, n6 - 1, n5 + n10 + a3), set2, class1877, class1878);
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
    
    private boolean method13644(final Class1877 class1877, final BlockPos class1878, final int n) {
        final int method1074 = class1878.getX();
        final int method1075 = class1878.getY();
        final int method1076 = class1878.getZ();
        final Mutable class1879 = new Mutable();
        for (int i = 0; i <= n + 1; ++i) {
            int n2 = 1;
            if (i == 0) {
                n2 = 0;
            }
            if (i >= n - 1) {
                n2 = 2;
            }
            for (int j = -n2; j <= n2; ++j) {
                for (int k = -n2; k <= n2; ++k) {
                    if (!Class4592.method13608(class1877, class1879.setPos(method1074 + j, method1075 + i, method1076 + k))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
