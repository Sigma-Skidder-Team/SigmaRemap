// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Set;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;

import java.util.function.Function;

public abstract class Class4593<T extends Class5127> extends Class4592<T>
{
    public Class4593(final Function<Dynamic<?>, ? extends T> function) {
        super(function);
    }
    
    public int method13634(final Random random, final Class5128 class5128) {
        int n = random.nextInt(3) + class5128.field22082;
        if (class5128.field22084 > 1) {
            n += random.nextInt(class5128.field22084);
        }
        return n;
    }
    
    private boolean method13635(final Class1877 class1877, final BlockPos class1878, final int n) {
        boolean b = true;
        if (class1878.getY() >= 1 && class1878.getY() + n + 1 <= 256) {
            for (int i = 0; i <= 1 + n; ++i) {
                int n2 = 2;
                if (i != 0) {
                    if (i >= 1 + n - 2) {
                        n2 = 2;
                    }
                }
                else {
                    n2 = 1;
                }
                for (int n3 = -n2; n3 <= n2 && b; ++n3) {
                    for (int n4 = -n2; n4 <= n2 && b; ++n4) {
                        if (class1878.getY() + i >= 0) {
                            if (class1878.getY() + i < 256) {
                                if (Class4592.method13608(class1877, class1878.add(n3, i, n4))) {
                                    continue;
                                }
                            }
                        }
                        b = false;
                    }
                }
            }
            return b;
        }
        return false;
    }
    
    private boolean method13636(final Class1875 class1875, final BlockPos class1876) {
        final BlockPos method1139 = class1876.method1139();
        if (Class4592.method13614(class1875, method1139) && class1876.getY() >= 2) {
            this.method13617(class1875, method1139);
            this.method13617(class1875, method1139.method1147());
            this.method13617(class1875, method1139.method1143());
            this.method13617(class1875, method1139.method1143().method1147());
            return true;
        }
        return false;
    }
    
    public boolean method13637(final Class1875 class1875, final BlockPos class1876, final int n) {
        return this.method13635(class1875, class1876, n) && this.method13636(class1875, class1876);
    }
    
    public void method13638(final Class1875 class1875, final Random random, final BlockPos class1876, final int n, final Set<BlockPos> set, final MutableBoundingBox class1877, final Class5127 class1878) {
        final int n2 = n * n;
        for (int i = -n; i <= n + 1; ++i) {
            for (int j = -n; j <= n + 1; ++j) {
                final int min = Math.min(Math.abs(i), Math.abs(i - 1));
                final int min2 = Math.min(Math.abs(j), Math.abs(j - 1));
                if (min + min2 < 7) {
                    if (min * min + min2 * min2 <= n2) {
                        this.method13619(class1875, random, class1876.add(i, 0, j), set, class1877, class1878);
                    }
                }
            }
        }
    }
    
    public void method13639(final Class1875 class1875, final Random random, final BlockPos class1876, final int n, final Set<BlockPos> set, final MutableBoundingBox class1877, final Class5127 class1878) {
        final int n2 = n * n;
        for (int i = -n; i <= n; ++i) {
            for (int j = -n; j <= n; ++j) {
                if (i * i + j * j <= n2) {
                    this.method13619(class1875, random, class1876.add(i, 0, j), set, class1877, class1878);
                }
            }
        }
    }
    
    public void method13640(final Class1875 class1875, final Random random, final BlockPos class1876, final int n, final Set<BlockPos> set, final MutableBoundingBox class1877, final Class5128 class1878) {
        final Mutable class1879 = new Mutable();
        for (int i = 0; i < n; ++i) {
            class1879.method1287(class1876).method1292(0, i, 0);
            if (Class4592.method13608(class1875, class1879)) {
                this.method13618(class1875, random, class1879, set, class1877, class1878);
            }
            if (i < n - 1) {
                class1879.method1287(class1876).method1292(1, i, 0);
                if (Class4592.method13608(class1875, class1879)) {
                    this.method13618(class1875, random, class1879, set, class1877, class1878);
                }
                class1879.method1287(class1876).method1292(1, i, 1);
                if (Class4592.method13608(class1875, class1879)) {
                    this.method13618(class1875, random, class1879, set, class1877, class1878);
                }
                class1879.method1287(class1876).method1292(0, i, 1);
                if (Class4592.method13608(class1875, class1879)) {
                    this.method13618(class1875, random, class1879, set, class1877, class1878);
                }
            }
        }
    }
}
