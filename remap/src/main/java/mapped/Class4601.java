// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import com.google.common.collect.Lists;

import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.MathHelper;

import java.util.function.Function;

public class Class4601 extends Class4592<Class5129>
{
    public Class4601(final Function<Dynamic<?>, ? extends Class5129> function) {
        super(function);
    }
    
    private void method13648(final Class1875 class1875, final Random random, final BlockPos class1876, final float n, final Set<BlockPos> set, final MutableBoundingBox class1877, final Class5129 class1878) {
        for (int n2 = (int)(n + 0.618), i = -n2; i <= n2; ++i) {
            for (int j = -n2; j <= n2; ++j) {
                if (Math.pow(Math.abs(i) + 0.5, 2.0) + Math.pow(Math.abs(j) + 0.5, 2.0) <= n * n) {
                    this.method13619(class1875, random, class1876.add(i, 0, j), set, class1877, class1878);
                }
            }
        }
    }
    
    private float method13649(final int n, final int n2) {
        if (n2 >= n * 0.3f) {
            final float n3 = n / 2.0f;
            final float a = n3 - n2;
            float method35640 = MathHelper.method35640(n3 * n3 - a * a);
            if (a != 0.0f) {
                if (Math.abs(a) >= n3) {
                    return 0.0f;
                }
            }
            else {
                method35640 = n3;
            }
            return method35640 * 0.5f;
        }
        return -1.0f;
    }
    
    private float method13650(final int n) {
        if (n >= 0 && n < 5) {
            return (n != 0 && n != 4) ? 3.0f : 2.0f;
        }
        return -1.0f;
    }
    
    private void method13651(final Class1875 class1875, final Random random, final BlockPos class1876, final Set<BlockPos> set, final MutableBoundingBox class1877, final Class5129 class1878) {
        for (int i = 0; i < 5; ++i) {
            this.method13648(class1875, random, class1876.method1138(i), this.method13650(i), set, class1877, class1878);
        }
    }
    
    private int method13652(final Class1875 class1875, final Random random, final BlockPos a, final BlockPos b, final boolean b2, final Set<BlockPos> set, final MutableBoundingBox class1876, final Class5129 class1877) {
        if (!b2 && Objects.equals(a, b)) {
            return -1;
        }
        final BlockPos method1134 = b.add(-a.getX(), -a.getY(), -a.getZ());
        final int method1135 = this.method13653(method1134);
        final float n = method1134.getX() / (float)method1135;
        final float n2 = method1134.getY() / (float)method1135;
        final float n3 = method1134.getZ() / (float)method1135;
        for (int i = 0; i <= method1135; ++i) {
            final BlockPos method1136 = a.add(0.5f + i * n, 0.5f + i * n2, 0.5f + i * n3);
            if (!b2) {
                if (!Class4592.method13608(class1875, method1136)) {
                    return i;
                }
            }
            else {
                this.method13620(class1875, method1136, (Class7096)((Class7097<Object, Object>)class1877.field22079.method1164(random, method1136)).method21773(Class4029.field18120, this.method13654(a, method1136)), class1876);
                set.add(method1136);
            }
        }
        return -1;
    }
    
    private int method13653(final BlockPos class354) {
        final int method35648 = MathHelper.abs(class354.getX());
        final int method35649 = MathHelper.abs(class354.getY());
        final int method35650 = MathHelper.abs(class354.getZ());
        if (method35650 > method35648 && method35650 > method35649) {
            return method35650;
        }
        return (method35649 <= method35648) ? method35648 : method35649;
    }
    
    private Axis method13654(final BlockPos class354, final BlockPos class355) {
        Axis class356 = Axis.Y;
        final int abs = Math.abs(class355.getX() - class354.getX());
        final int abs2 = Math.abs(class355.getZ() - class354.getZ());
        final int max = Math.max(abs, abs2);
        if (max > 0) {
            if (abs != max) {
                if (abs2 == max) {
                    class356 = Axis.Z;
                }
            }
            else {
                class356 = Axis.X;
            }
        }
        return class356;
    }
    
    private void method13655(final Class1875 class1875, final Random random, final int n, final BlockPos class1876, final List<Class355> list, final Set<BlockPos> set, final MutableBoundingBox class1877, final Class5129 class1878) {
        for (final Class355 class1879 : list) {
            if (!this.method13656(n, class1879.method1163() - class1876.getY())) {
                continue;
            }
            this.method13651(class1875, random, class1879, set, class1877, class1878);
        }
    }
    
    private boolean method13656(final int n, final int n2) {
        return n2 >= n * 0.2;
    }
    
    private void method13657(final Class1875 class1875, final Random random, final BlockPos class1876, final int n, final Set<BlockPos> set, final MutableBoundingBox class1877, final Class5129 class1878) {
        this.method13652(class1875, random, class1876, class1876.method1138(n), true, set, class1877, class1878);
    }
    
    private void method13658(final Class1875 class1875, final Random random, final int n, final BlockPos class1876, final List<Class355> list, final Set<BlockPos> set, final MutableBoundingBox class1877, final Class5129 class1878) {
        for (final Class355 class1879 : list) {
            final int method1163 = class1879.method1163();
            final BlockPos class1880 = new BlockPos(class1876.getX(), method1163, class1876.getZ());
            if (class1880.equals(class1879)) {
                continue;
            }
            if (!this.method13656(n, method1163 - class1876.getY())) {
                continue;
            }
            this.method13652(class1875, random, class1880, class1879, true, set, class1877, class1878);
        }
    }
    
    public boolean method13647(final Class1875 class1875, final Random random, final BlockPos class1876, final Set<BlockPos> set, final Set<BlockPos> set2, final MutableBoundingBox class1877, final Class5129 class1878) {
        final Random random2 = new Random(random.nextLong());
        final int method13659 = this.method13659(class1875, random, class1876, 5 + random2.nextInt(12), set, class1877, class1878);
        if (method13659 != -1) {
            this.method13617(class1875, class1876.method1139());
            int n = (int)(method13659 * 0.618);
            if (n >= method13659) {
                n = method13659 - 1;
            }
            int n2 = (int)(1.382 + Math.pow(1.0 * method13659 / 13.0, 2.0));
            if (n2 < 1) {
                n2 = 1;
            }
            final int n3 = class1876.getY() + n;
            int i = method13659 - 5;
            final ArrayList arrayList = Lists.newArrayList();
            arrayList.add(new Class355(class1876.method1138(i), n3));
            while (i >= 0) {
                final float method13660 = this.method13649(method13659, i);
                if (method13660 >= 0.0f) {
                    for (int j = 0; j < n2; ++j) {
                        final double n4 = 1.0 * method13660 * (random2.nextFloat() + 0.328);
                        final double n5 = random2.nextFloat() * 2.0f * 3.141592653589793;
                        final BlockPos method13661 = class1876.add(n4 * Math.sin(n5) + 0.5, i - 1, n4 * Math.cos(n5) + 0.5);
                        if (this.method13652(class1875, random, method13661, method13661.method1138(5), false, set, class1877, class1878) == -1) {
                            final int n6 = class1876.getX() - method13661.getX();
                            final int n7 = class1876.getZ() - method13661.getZ();
                            final double n8 = method13661.getY() - Math.sqrt(n6 * n6 + n7 * n7) * 0.381;
                            final BlockPos class1879 = new BlockPos(class1876.getX(), (n8 <= n3) ? ((int)n8) : n3, class1876.getZ());
                            if (this.method13652(class1875, random, class1879, method13661, false, set, class1877, class1878) == -1) {
                                arrayList.add(new Class355(method13661, class1879.getY()));
                            }
                        }
                    }
                }
                --i;
            }
            this.method13655(class1875, random, method13659, class1876, arrayList, set2, class1877, class1878);
            this.method13657(class1875, random, class1876, n, set, class1877, class1878);
            this.method13658(class1875, random, method13659, class1876, arrayList, set, class1877, class1878);
            return true;
        }
        return false;
    }
    
    private int method13659(final Class1875 class1875, final Random random, final BlockPos class1876, final int n, final Set<BlockPos> set, final MutableBoundingBox class1877, final Class5129 class1878) {
        if (!Class4592.method13615(class1875, class1876.method1139())) {
            return -1;
        }
        final int method13652 = this.method13652(class1875, random, class1876, class1876.method1138(n - 1), false, set, class1877, class1878);
        if (method13652 != -1) {
            return (method13652 >= 6) ? method13652 : -1;
        }
        return n;
    }
}
