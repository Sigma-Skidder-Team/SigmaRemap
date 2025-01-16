// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util2.Direction;

import javax.annotation.Nullable;
import java.util.Random;
import java.util.List;

public abstract class Class4484 extends Class4473
{
    public Class4484(final Class9520 class9520, final int n) {
        super(class9520, n);
    }
    
    public Class4484(final Class9520 class9520, final CompoundNBT class9521) {
        super(class9520, class9521);
    }
    
    @Override
    public void method13415(final CompoundNBT class51) {
    }
    
    private int method13471(final List<Class7530> list) {
        boolean b = false;
        int n = 0;
        for (final Class7530 class7530 : list) {
            if (class7530.field29908 > 0) {
                if (class7530.field29907 < class7530.field29908) {
                    b = true;
                }
            }
            n += class7530.field29906;
        }
        return (!b) ? -1 : n;
    }
    
    private Class4484 method13472(final Class4494 class4494, final List<Class7530> list, final List<Class4473> list2, final Random random, final int n, final int n2, final int n3, final Direction class4495, final int n4) {
        final int method13471 = this.method13471(list);
        final boolean b = method13471 > 0 && n4 <= 30;
        int n5 = 0;
        while (n5 < 5 && b) {
            ++n5;
            int nextInt = random.nextInt(method13471);
            for (final Class7530 field19887 : list) {
                nextInt -= field19887.field29906;
                if (nextInt >= 0) {
                    continue;
                }
                if (!field19887.method23589(n4)) {
                    break;
                }
                if (field19887 == class4494.field19887 && !field19887.field29909) {
                    break;
                }
                final Class4484 method13472 = Class6784.method20740(field19887, list2, random, n, n2, n3, class4495, n4);
                if (method13472 == null) {
                    continue;
                }
                final Class7530 class4496 = field19887;
                ++class4496.field29907;
                class4494.field19887 = field19887;
                if (!field19887.method23590()) {
                    list.remove(field19887);
                }
                return method13472;
            }
        }
        return Class4485.method13478(list2, random, n, n2, n3, class4495, n4);
    }
    
    private Class4473 method13473(final Class4494 class4494, final List<Class4473> list, final Random random, final int n, final int n2, final int n3, final Direction class4495, final int n4, final boolean b) {
        if (Math.abs(n - class4494.method13432().minX) <= 112 && Math.abs(n3 - class4494.method13432().minZ) <= 112) {
            List<Class7530> list2 = class4494.field19888;
            if (b) {
                list2 = class4494.field19889;
            }
            final Class4484 method13472 = this.method13472(class4494, list2, list, random, n, n2, n3, class4495, n4 + 1);
            if (method13472 != null) {
                list.add(method13472);
                class4494.field19890.add(method13472);
            }
            return method13472;
        }
        return Class4485.method13478(list, random, n, n2, n3, class4495, n4);
    }
    
    @Nullable
    public Class4473 method13474(final Class4494 class4494, final List<Class4473> list, final Random random, final int n, final int n2, final boolean b) {
        final Direction method13455 = this.method13455();
        if (method13455 != null) {
            switch (Class9129.field38691[method13455.ordinal()]) {
                case 1: {
                    return this.method13473(class4494, list, random, this.field19849.minX + n, this.field19849.minY + n2, this.field19849.minZ - 1, method13455, this.method13433(), b);
                }
                case 2: {
                    return this.method13473(class4494, list, random, this.field19849.minX + n, this.field19849.minY + n2, this.field19849.maxZ + 1, method13455, this.method13433(), b);
                }
                case 3: {
                    return this.method13473(class4494, list, random, this.field19849.minX - 1, this.field19849.minY + n2, this.field19849.minZ + n, method13455, this.method13433(), b);
                }
                case 4: {
                    return this.method13473(class4494, list, random, this.field19849.maxX + 1, this.field19849.minY + n2, this.field19849.minZ + n, method13455, this.method13433(), b);
                }
            }
        }
        return null;
    }
    
    @Nullable
    public Class4473 method13475(final Class4494 class4494, final List<Class4473> list, final Random random, final int n, final int n2, final boolean b) {
        final Direction method13455 = this.method13455();
        if (method13455 != null) {
            switch (Class9129.field38691[method13455.ordinal()]) {
                case 1: {
                    return this.method13473(class4494, list, random, this.field19849.minX - 1, this.field19849.minY + n, this.field19849.minZ + n2, Direction.WEST, this.method13433(), b);
                }
                case 2: {
                    return this.method13473(class4494, list, random, this.field19849.minX - 1, this.field19849.minY + n, this.field19849.minZ + n2, Direction.WEST, this.method13433(), b);
                }
                case 3: {
                    return this.method13473(class4494, list, random, this.field19849.minX + n2, this.field19849.minY + n, this.field19849.minZ - 1, Direction.NORTH, this.method13433(), b);
                }
                case 4: {
                    return this.method13473(class4494, list, random, this.field19849.minX + n2, this.field19849.minY + n, this.field19849.minZ - 1, Direction.NORTH, this.method13433(), b);
                }
            }
        }
        return null;
    }
    
    @Nullable
    public Class4473 method13476(final Class4494 class4494, final List<Class4473> list, final Random random, final int n, final int n2, final boolean b) {
        final Direction method13455 = this.method13455();
        if (method13455 != null) {
            switch (Class9129.field38691[method13455.ordinal()]) {
                case 1: {
                    return this.method13473(class4494, list, random, this.field19849.maxX + 1, this.field19849.minY + n, this.field19849.minZ + n2, Direction.EAST, this.method13433(), b);
                }
                case 2: {
                    return this.method13473(class4494, list, random, this.field19849.maxX + 1, this.field19849.minY + n, this.field19849.minZ + n2, Direction.EAST, this.method13433(), b);
                }
                case 3: {
                    return this.method13473(class4494, list, random, this.field19849.minX + n2, this.field19849.minY + n, this.field19849.maxZ + 1, Direction.SOUTH, this.method13433(), b);
                }
                case 4: {
                    return this.method13473(class4494, list, random, this.field19849.minX + n2, this.field19849.minY + n, this.field19849.maxZ + 1, Direction.SOUTH, this.method13433(), b);
                }
            }
        }
        return null;
    }
    
    public static boolean method13477(final MutableBoundingBox class6997) {
        return class6997 != null && class6997.minY > 10;
    }
}
