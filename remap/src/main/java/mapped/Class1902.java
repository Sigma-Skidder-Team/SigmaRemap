// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util2.Direction;
import net.minecraft.world.chunk.IChunkLightProvider;
import org.apache.commons.lang3.mutable.MutableInt;

public final class Class1902 extends Class1890<Class7500, Class1898>
{
    private static final Direction[] field10274;
    private static final Direction[] field10327;
    
    public Class1902(final IChunkLightProvider class1908) {
        super(class1908, Class237.field911, new Class1898(class1908));
    }
    
    @Override
    public int method7305(final long n, final long n2, int n3) {
        if (n2 == Long.MAX_VALUE) {
            return 15;
        }
        if (n == Long.MAX_VALUE) {
            if (!((Class1898)this.field10277).method7371(n2)) {
                return 15;
            }
            n3 = 0;
        }
        if (n3 >= 15) {
            return n3;
        }
        final MutableInt mutableInt = new MutableInt();
        final BlockState method7297 = this.method7297(n2, mutableInt);
        if (mutableInt.getValue() < 15) {
            final int method7298 = BlockPos.unpackX(n);
            final int method7299 = BlockPos.unpackY(n);
            final int method7300 = BlockPos.unpackZ(n);
            final int method7301 = BlockPos.unpackX(n2);
            final int method7302 = BlockPos.unpackY(n2);
            final int method7303 = BlockPos.unpackZ(n2);
            final boolean b = method7298 == method7301 && method7300 == method7303;
            final int signum = Integer.signum(method7301 - method7298);
            final int signum2 = Integer.signum(method7302 - method7299);
            final int signum3 = Integer.signum(method7303 - method7300);
            Direction class179;
            if (n != Long.MAX_VALUE) {
                class179 = Direction.byLong(signum, signum2, signum3);
            }
            else {
                class179 = Direction.DOWN;
            }
            final BlockState method7304 = this.method7297(n, null);
            if (class179 == null) {
                if (VoxelShapes.method24505(this.method7298(method7304, n, Direction.DOWN), VoxelShapes.empty())) {
                    return 15;
                }
                final Direction method7305 = Direction.byLong(signum, b ? -1 : 0, signum3);
                if (method7305 == null) {
                    return 15;
                }
                if (VoxelShapes.method24505(VoxelShapes.empty(), this.method7298(method7297, n2, method7305.getOpposite()))) {
                    return 15;
                }
            }
            else if (VoxelShapes.method24505(this.method7298(method7304, n, class179), this.method7298(method7297, n2, class179.getOpposite()))) {
                return 15;
            }
            if (n == Long.MAX_VALUE || (b && method7299 > method7302)) {
                if (n3 == 0) {
                    if (mutableInt.getValue() == 0) {
                        return 0;
                    }
                }
            }
            return n3 + Math.max(1, mutableInt.getValue());
        }
        return 15;
    }
    
    @Override
    public void method7326(final long n, final int n2, final boolean b) {
        final long method1111 = Class353.method1111(n);
        final int method1112 = BlockPos.unpackY(n);
        final int method1113 = Class353.method1096(method1112);
        final int method1114 = Class353.method1095(method1112);
        int n4;
        if (method1113 == 0) {
            int n3;
            for (n3 = 0; !((Class1898)this.field10277).method7347(Class353.method1094(method1111, 0, -n3 - 1, 0)) && ((Class1898)this.field10277).method7370(method1114 - n3 - 1); ++n3) {}
            n4 = n3;
        }
        else {
            n4 = 0;
        }
        final long method1115 = BlockPos.offset(n, 0, -1 - n4 * 16, 0);
        final long method1116 = Class353.method1111(method1115);
        if (method1111 == method1116 || ((Class1898)this.field10277).method7347(method1116)) {
            this.method7322(n, method1115, n2, b);
        }
        final long method1117 = BlockPos.offset(n, Direction.UP);
        final long method1118 = Class353.method1111(method1117);
        if (method1111 == method1118 || ((Class1898)this.field10277).method7347(method1118)) {
            this.method7322(n, method1117, n2, b);
        }
        for (final Direction class179 : Class1902.field10327) {
            int n5 = 0;
            do {
                final long method1119 = BlockPos.offset(n, class179.getXOffset(), -n5, class179.getZOffset());
                final long method1120 = Class353.method1111(method1119);
                if (method1111 == method1120) {
                    this.method7322(n, method1119, n2, b);
                    break;
                }
                if (((Class1898)this.field10277).method7347(method1120)) {
                    this.method7322(n, method1119, n2, b);
                }
            } while (++n5 <= n4 * 16);
        }
    }
    
    @Override
    public int method7301(final long n, final long n2, final int n3) {
        int n4 = n3;
        if (Long.MAX_VALUE != n2) {
            final int method7305 = this.method7305(Long.MAX_VALUE, n, 0);
            if (n3 > method7305) {
                n4 = method7305;
            }
            if (n4 == 0) {
                return n4;
            }
        }
        final long method7306 = Class353.method1111(n);
        final Class7281 method7307 = ((Class1898)this.field10277).method7348(method7306, true);
        for (final Direction class179 : Class1902.field10274) {
            final long method7308 = BlockPos.offset(n, class179);
            long n5 = Class353.method1111(method7308);
            Class7281 method7309;
            if (method7306 != n5) {
                method7309 = ((Class1898)this.field10277).method7348(n5, true);
            }
            else {
                method7309 = method7307;
            }
            if (method7309 == null) {
                if (class179 != Direction.DOWN) {
                    long n6;
                    for (n6 = BlockPos.func_218288_f(method7308); !((Class1898)this.field10277).method7347(n5) && !((Class1898)this.field10277).method7372(n5); n5 = Class353.method1093(n5, Direction.UP), n6 = BlockPos.offset(n6, 0, 16, 0)) {}
                    final Class7281 method7310 = ((Class1898)this.field10277).method7348(n5, true);
                    if (n6 != n2) {
                        int method7311;
                        if (method7310 == null) {
                            method7311 = (((Class1898)this.field10277).method7373(n5) ? 0 : 15);
                        }
                        else {
                            method7311 = this.method7305(n6, n, this.method7303(method7310, n6));
                        }
                        if (n4 > method7311) {
                            n4 = method7311;
                        }
                        if (n4 == 0) {
                            return n4;
                        }
                    }
                }
            }
            else if (method7308 != n2) {
                final int method7312 = this.method7305(method7308, n, this.method7303(method7309, method7308));
                if (n4 > method7312) {
                    n4 = method7312;
                }
                if (n4 == 0) {
                    return n4;
                }
            }
        }
        return n4;
    }
    
    @Override
    public void method7294(long n) {
        ((Class1898)this.field10277).method7364();
        long n2 = Class353.method1111(n);
        if (!((Class1898)this.field10277).method7347(n2)) {
            for (n = BlockPos.func_218288_f(n); !((Class1898)this.field10277).method7347(n2) && !((Class1898)this.field10277).method7372(n2); n2 = Class353.method1093(n2, Direction.UP), n = BlockPos.offset(n, 0, 16, 0)) {}
            if (((Class1898)this.field10277).method7347(n2)) {
                super.method7294(n);
            }
        }
        else {
            super.method7294(n);
        }
    }
    
    @Override
    public String method7309(final long n) {
        return super.method7309(n) + (((Class1898)this.field10277).method7372(n) ? "*" : "");
    }
    
    static {
        field10274 = Direction.values();
        field10327 = new Direction[] { Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST};
    }
}
