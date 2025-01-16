// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util2.Direction;

import java.util.Random;

public class Class4478 extends Class4475
{
    private final boolean[] field19868;
    
    public Class4478(final Random random, final int n, final int n2) {
        super(Class9520.field40981, random, n, 64, n2, 21, 15, 21);
        this.field19868 = new boolean[4];
    }
    
    public Class4478(final Class1795 class1795, final Class51 class1796) {
        super(Class9520.field40981, class1796);
        (this.field19868 = new boolean[4])[0] = class1796.method329("hasPlacedChest0");
        this.field19868[1] = class1796.method329("hasPlacedChest1");
        this.field19868[2] = class1796.method329("hasPlacedChest2");
        this.field19868[3] = class1796.method329("hasPlacedChest3");
    }
    
    @Override
    public void method13415(final Class51 class51) {
        super.method13415(class51);
        class51.method312("hasPlacedChest0", this.field19868[0]);
        class51.method312("hasPlacedChest1", this.field19868[1]);
        class51.method312("hasPlacedChest2", this.field19868[2]);
        class51.method312("hasPlacedChest3", this.field19868[3]);
    }
    
    @Override
    public boolean method13421(final Class1851 class1851, final Class6346<?> class1852, final Random random, final MutableBoundingBox class1853, final Class7859 class1854) {
        this.method13444(class1851, class1853, 0, -4, 0, this.field19857 - 1, 0, this.field19859 - 1, Class7521.field29217.getDefaultState(), Class7521.field29217.getDefaultState(), false);
        for (int i = 1; i <= 9; ++i) {
            this.method13444(class1851, class1853, i, i, i, this.field19857 - 1 - i, i, this.field19859 - 1 - i, Class7521.field29217.getDefaultState(), Class7521.field29217.getDefaultState(), false);
            this.method13444(class1851, class1853, i + 1, i, i + 1, this.field19857 - 2 - i, i, this.field19859 - 2 - i, Class7521.field29147.getDefaultState(), Class7521.field29147.getDefaultState(), false);
        }
        for (int j = 0; j < this.field19857; ++j) {
            for (int k = 0; k < this.field19859; ++k) {
                this.method13449(class1851, Class7521.field29217.getDefaultState(), j, -5, k, class1853);
            }
        }
        final BlockState class1855 = ((StateHolder<O, BlockState>)Class7521.field29407.getDefaultState()).with((IProperty<Comparable>)Class3916.field17732, Direction.NORTH);
        final BlockState class1856 = ((StateHolder<O, BlockState>)Class7521.field29407.getDefaultState()).with((IProperty<Comparable>)Class3916.field17732, Direction.SOUTH);
        final BlockState class1857 = ((StateHolder<O, BlockState>)Class7521.field29407.getDefaultState()).with((IProperty<Comparable>)Class3916.field17732, Direction.EAST);
        final BlockState class1858 = ((StateHolder<O, BlockState>)Class7521.field29407.getDefaultState()).with((IProperty<Comparable>)Class3916.field17732, Direction.WEST);
        this.method13444(class1851, class1853, 0, 0, 0, 4, 9, 4, Class7521.field29217.getDefaultState(), Class7521.field29147.getDefaultState(), false);
        this.method13444(class1851, class1853, 1, 10, 1, 3, 10, 3, Class7521.field29217.getDefaultState(), Class7521.field29217.getDefaultState(), false);
        this.method13440(class1851, class1855, 2, 10, 0, class1853);
        this.method13440(class1851, class1856, 2, 10, 4, class1853);
        this.method13440(class1851, class1857, 0, 10, 2, class1853);
        this.method13440(class1851, class1858, 4, 10, 2, class1853);
        this.method13444(class1851, class1853, this.field19857 - 5, 0, 0, this.field19857 - 1, 9, 4, Class7521.field29217.getDefaultState(), Class7521.field29147.getDefaultState(), false);
        this.method13444(class1851, class1853, this.field19857 - 4, 10, 1, this.field19857 - 2, 10, 3, Class7521.field29217.getDefaultState(), Class7521.field29217.getDefaultState(), false);
        this.method13440(class1851, class1855, this.field19857 - 3, 10, 0, class1853);
        this.method13440(class1851, class1856, this.field19857 - 3, 10, 4, class1853);
        this.method13440(class1851, class1857, this.field19857 - 5, 10, 2, class1853);
        this.method13440(class1851, class1858, this.field19857 - 1, 10, 2, class1853);
        this.method13444(class1851, class1853, 8, 0, 0, 12, 4, 4, Class7521.field29217.getDefaultState(), Class7521.field29147.getDefaultState(), false);
        this.method13444(class1851, class1853, 9, 1, 0, 11, 3, 4, Class7521.field29147.getDefaultState(), Class7521.field29147.getDefaultState(), false);
        this.method13440(class1851, Class7521.field29219.getDefaultState(), 9, 1, 1, class1853);
        this.method13440(class1851, Class7521.field29219.getDefaultState(), 9, 2, 1, class1853);
        this.method13440(class1851, Class7521.field29219.getDefaultState(), 9, 3, 1, class1853);
        this.method13440(class1851, Class7521.field29219.getDefaultState(), 10, 3, 1, class1853);
        this.method13440(class1851, Class7521.field29219.getDefaultState(), 11, 3, 1, class1853);
        this.method13440(class1851, Class7521.field29219.getDefaultState(), 11, 2, 1, class1853);
        this.method13440(class1851, Class7521.field29219.getDefaultState(), 11, 1, 1, class1853);
        this.method13444(class1851, class1853, 4, 1, 1, 8, 3, 3, Class7521.field29217.getDefaultState(), Class7521.field29147.getDefaultState(), false);
        this.method13444(class1851, class1853, 4, 1, 2, 8, 2, 2, Class7521.field29147.getDefaultState(), Class7521.field29147.getDefaultState(), false);
        this.method13444(class1851, class1853, 12, 1, 1, 16, 3, 3, Class7521.field29217.getDefaultState(), Class7521.field29147.getDefaultState(), false);
        this.method13444(class1851, class1853, 12, 1, 2, 16, 2, 2, Class7521.field29147.getDefaultState(), Class7521.field29147.getDefaultState(), false);
        this.method13444(class1851, class1853, 5, 4, 5, this.field19857 - 6, 4, this.field19859 - 6, Class7521.field29217.getDefaultState(), Class7521.field29217.getDefaultState(), false);
        this.method13444(class1851, class1853, 9, 4, 9, 11, 4, 11, Class7521.field29147.getDefaultState(), Class7521.field29147.getDefaultState(), false);
        this.method13444(class1851, class1853, 8, 1, 8, 8, 3, 8, Class7521.field29219.getDefaultState(), Class7521.field29219.getDefaultState(), false);
        this.method13444(class1851, class1853, 12, 1, 8, 12, 3, 8, Class7521.field29219.getDefaultState(), Class7521.field29219.getDefaultState(), false);
        this.method13444(class1851, class1853, 8, 1, 12, 8, 3, 12, Class7521.field29219.getDefaultState(), Class7521.field29219.getDefaultState(), false);
        this.method13444(class1851, class1853, 12, 1, 12, 12, 3, 12, Class7521.field29219.getDefaultState(), Class7521.field29219.getDefaultState(), false);
        this.method13444(class1851, class1853, 1, 1, 5, 4, 4, 11, Class7521.field29217.getDefaultState(), Class7521.field29217.getDefaultState(), false);
        this.method13444(class1851, class1853, this.field19857 - 5, 1, 5, this.field19857 - 2, 4, 11, Class7521.field29217.getDefaultState(), Class7521.field29217.getDefaultState(), false);
        this.method13444(class1851, class1853, 6, 7, 9, 6, 7, 11, Class7521.field29217.getDefaultState(), Class7521.field29217.getDefaultState(), false);
        this.method13444(class1851, class1853, this.field19857 - 7, 7, 9, this.field19857 - 7, 7, 11, Class7521.field29217.getDefaultState(), Class7521.field29217.getDefaultState(), false);
        this.method13444(class1851, class1853, 5, 5, 9, 5, 7, 11, Class7521.field29219.getDefaultState(), Class7521.field29219.getDefaultState(), false);
        this.method13444(class1851, class1853, this.field19857 - 6, 5, 9, this.field19857 - 6, 7, 11, Class7521.field29219.getDefaultState(), Class7521.field29219.getDefaultState(), false);
        this.method13440(class1851, Class7521.field29147.getDefaultState(), 5, 5, 10, class1853);
        this.method13440(class1851, Class7521.field29147.getDefaultState(), 5, 6, 10, class1853);
        this.method13440(class1851, Class7521.field29147.getDefaultState(), 6, 6, 10, class1853);
        this.method13440(class1851, Class7521.field29147.getDefaultState(), this.field19857 - 6, 5, 10, class1853);
        this.method13440(class1851, Class7521.field29147.getDefaultState(), this.field19857 - 6, 6, 10, class1853);
        this.method13440(class1851, Class7521.field29147.getDefaultState(), this.field19857 - 7, 6, 10, class1853);
        this.method13444(class1851, class1853, 2, 4, 4, 2, 6, 4, Class7521.field29147.getDefaultState(), Class7521.field29147.getDefaultState(), false);
        this.method13444(class1851, class1853, this.field19857 - 3, 4, 4, this.field19857 - 3, 6, 4, Class7521.field29147.getDefaultState(), Class7521.field29147.getDefaultState(), false);
        this.method13440(class1851, class1855, 2, 4, 5, class1853);
        this.method13440(class1851, class1855, 2, 3, 4, class1853);
        this.method13440(class1851, class1855, this.field19857 - 3, 4, 5, class1853);
        this.method13440(class1851, class1855, this.field19857 - 3, 3, 4, class1853);
        this.method13444(class1851, class1853, 1, 1, 3, 2, 2, 3, Class7521.field29217.getDefaultState(), Class7521.field29217.getDefaultState(), false);
        this.method13444(class1851, class1853, this.field19857 - 3, 1, 3, this.field19857 - 2, 2, 3, Class7521.field29217.getDefaultState(), Class7521.field29217.getDefaultState(), false);
        this.method13440(class1851, Class7521.field29217.getDefaultState(), 1, 1, 2, class1853);
        this.method13440(class1851, Class7521.field29217.getDefaultState(), this.field19857 - 2, 1, 2, class1853);
        this.method13440(class1851, Class7521.field29599.getDefaultState(), 1, 2, 2, class1853);
        this.method13440(class1851, Class7521.field29599.getDefaultState(), this.field19857 - 2, 2, 2, class1853);
        this.method13440(class1851, class1858, 2, 1, 2, class1853);
        this.method13440(class1851, class1857, this.field19857 - 3, 1, 2, class1853);
        this.method13444(class1851, class1853, 4, 3, 5, 4, 3, 17, Class7521.field29217.getDefaultState(), Class7521.field29217.getDefaultState(), false);
        this.method13444(class1851, class1853, this.field19857 - 5, 3, 5, this.field19857 - 5, 3, 17, Class7521.field29217.getDefaultState(), Class7521.field29217.getDefaultState(), false);
        this.method13444(class1851, class1853, 3, 1, 5, 4, 2, 16, Class7521.field29147.getDefaultState(), Class7521.field29147.getDefaultState(), false);
        this.method13444(class1851, class1853, this.field19857 - 6, 1, 5, this.field19857 - 5, 2, 16, Class7521.field29147.getDefaultState(), Class7521.field29147.getDefaultState(), false);
        for (int l = 5; l <= 17; l += 2) {
            this.method13440(class1851, Class7521.field29219.getDefaultState(), 4, 1, l, class1853);
            this.method13440(class1851, Class7521.field29218.getDefaultState(), 4, 2, l, class1853);
            this.method13440(class1851, Class7521.field29219.getDefaultState(), this.field19857 - 5, 1, l, class1853);
            this.method13440(class1851, Class7521.field29218.getDefaultState(), this.field19857 - 5, 2, l, class1853);
        }
        this.method13440(class1851, Class7521.field29483.getDefaultState(), 10, 0, 7, class1853);
        this.method13440(class1851, Class7521.field29483.getDefaultState(), 10, 0, 8, class1853);
        this.method13440(class1851, Class7521.field29483.getDefaultState(), 9, 0, 9, class1853);
        this.method13440(class1851, Class7521.field29483.getDefaultState(), 11, 0, 9, class1853);
        this.method13440(class1851, Class7521.field29483.getDefaultState(), 8, 0, 10, class1853);
        this.method13440(class1851, Class7521.field29483.getDefaultState(), 12, 0, 10, class1853);
        this.method13440(class1851, Class7521.field29483.getDefaultState(), 7, 0, 10, class1853);
        this.method13440(class1851, Class7521.field29483.getDefaultState(), 13, 0, 10, class1853);
        this.method13440(class1851, Class7521.field29483.getDefaultState(), 9, 0, 11, class1853);
        this.method13440(class1851, Class7521.field29483.getDefaultState(), 11, 0, 11, class1853);
        this.method13440(class1851, Class7521.field29483.getDefaultState(), 10, 0, 12, class1853);
        this.method13440(class1851, Class7521.field29483.getDefaultState(), 10, 0, 13, class1853);
        this.method13440(class1851, Class7521.field29493.getDefaultState(), 10, 0, 10, class1853);
        for (int n = 0; n <= this.field19857 - 1; n += this.field19857 - 1) {
            this.method13440(class1851, Class7521.field29219.getDefaultState(), n, 2, 1, class1853);
            this.method13440(class1851, Class7521.field29483.getDefaultState(), n, 2, 2, class1853);
            this.method13440(class1851, Class7521.field29219.getDefaultState(), n, 2, 3, class1853);
            this.method13440(class1851, Class7521.field29219.getDefaultState(), n, 3, 1, class1853);
            this.method13440(class1851, Class7521.field29483.getDefaultState(), n, 3, 2, class1853);
            this.method13440(class1851, Class7521.field29219.getDefaultState(), n, 3, 3, class1853);
            this.method13440(class1851, Class7521.field29483.getDefaultState(), n, 4, 1, class1853);
            this.method13440(class1851, Class7521.field29218.getDefaultState(), n, 4, 2, class1853);
            this.method13440(class1851, Class7521.field29483.getDefaultState(), n, 4, 3, class1853);
            this.method13440(class1851, Class7521.field29219.getDefaultState(), n, 5, 1, class1853);
            this.method13440(class1851, Class7521.field29483.getDefaultState(), n, 5, 2, class1853);
            this.method13440(class1851, Class7521.field29219.getDefaultState(), n, 5, 3, class1853);
            this.method13440(class1851, Class7521.field29483.getDefaultState(), n, 6, 1, class1853);
            this.method13440(class1851, Class7521.field29218.getDefaultState(), n, 6, 2, class1853);
            this.method13440(class1851, Class7521.field29483.getDefaultState(), n, 6, 3, class1853);
            this.method13440(class1851, Class7521.field29483.getDefaultState(), n, 7, 1, class1853);
            this.method13440(class1851, Class7521.field29483.getDefaultState(), n, 7, 2, class1853);
            this.method13440(class1851, Class7521.field29483.getDefaultState(), n, 7, 3, class1853);
            this.method13440(class1851, Class7521.field29219.getDefaultState(), n, 8, 1, class1853);
            this.method13440(class1851, Class7521.field29219.getDefaultState(), n, 8, 2, class1853);
            this.method13440(class1851, Class7521.field29219.getDefaultState(), n, 8, 3, class1853);
        }
        for (int n2 = 2; n2 <= this.field19857 - 3; n2 += this.field19857 - 3 - 2) {
            this.method13440(class1851, Class7521.field29219.getDefaultState(), n2 - 1, 2, 0, class1853);
            this.method13440(class1851, Class7521.field29483.getDefaultState(), n2, 2, 0, class1853);
            this.method13440(class1851, Class7521.field29219.getDefaultState(), n2 + 1, 2, 0, class1853);
            this.method13440(class1851, Class7521.field29219.getDefaultState(), n2 - 1, 3, 0, class1853);
            this.method13440(class1851, Class7521.field29483.getDefaultState(), n2, 3, 0, class1853);
            this.method13440(class1851, Class7521.field29219.getDefaultState(), n2 + 1, 3, 0, class1853);
            this.method13440(class1851, Class7521.field29483.getDefaultState(), n2 - 1, 4, 0, class1853);
            this.method13440(class1851, Class7521.field29218.getDefaultState(), n2, 4, 0, class1853);
            this.method13440(class1851, Class7521.field29483.getDefaultState(), n2 + 1, 4, 0, class1853);
            this.method13440(class1851, Class7521.field29219.getDefaultState(), n2 - 1, 5, 0, class1853);
            this.method13440(class1851, Class7521.field29483.getDefaultState(), n2, 5, 0, class1853);
            this.method13440(class1851, Class7521.field29219.getDefaultState(), n2 + 1, 5, 0, class1853);
            this.method13440(class1851, Class7521.field29483.getDefaultState(), n2 - 1, 6, 0, class1853);
            this.method13440(class1851, Class7521.field29218.getDefaultState(), n2, 6, 0, class1853);
            this.method13440(class1851, Class7521.field29483.getDefaultState(), n2 + 1, 6, 0, class1853);
            this.method13440(class1851, Class7521.field29483.getDefaultState(), n2 - 1, 7, 0, class1853);
            this.method13440(class1851, Class7521.field29483.getDefaultState(), n2, 7, 0, class1853);
            this.method13440(class1851, Class7521.field29483.getDefaultState(), n2 + 1, 7, 0, class1853);
            this.method13440(class1851, Class7521.field29219.getDefaultState(), n2 - 1, 8, 0, class1853);
            this.method13440(class1851, Class7521.field29219.getDefaultState(), n2, 8, 0, class1853);
            this.method13440(class1851, Class7521.field29219.getDefaultState(), n2 + 1, 8, 0, class1853);
        }
        this.method13444(class1851, class1853, 8, 4, 0, 12, 6, 0, Class7521.field29219.getDefaultState(), Class7521.field29219.getDefaultState(), false);
        this.method13440(class1851, Class7521.field29147.getDefaultState(), 8, 6, 0, class1853);
        this.method13440(class1851, Class7521.field29147.getDefaultState(), 12, 6, 0, class1853);
        this.method13440(class1851, Class7521.field29483.getDefaultState(), 9, 5, 0, class1853);
        this.method13440(class1851, Class7521.field29218.getDefaultState(), 10, 5, 0, class1853);
        this.method13440(class1851, Class7521.field29483.getDefaultState(), 11, 5, 0, class1853);
        this.method13444(class1851, class1853, 8, -14, 8, 12, -11, 12, Class7521.field29219.getDefaultState(), Class7521.field29219.getDefaultState(), false);
        this.method13444(class1851, class1853, 8, -10, 8, 12, -10, 12, Class7521.field29218.getDefaultState(), Class7521.field29218.getDefaultState(), false);
        this.method13444(class1851, class1853, 8, -9, 8, 12, -9, 12, Class7521.field29219.getDefaultState(), Class7521.field29219.getDefaultState(), false);
        this.method13444(class1851, class1853, 8, -8, 8, 12, -1, 12, Class7521.field29217.getDefaultState(), Class7521.field29217.getDefaultState(), false);
        this.method13444(class1851, class1853, 9, -11, 9, 11, -1, 11, Class7521.field29147.getDefaultState(), Class7521.field29147.getDefaultState(), false);
        this.method13440(class1851, Class7521.field29317.getDefaultState(), 10, -11, 10, class1853);
        this.method13444(class1851, class1853, 9, -13, 9, 11, -13, 11, Class7521.field29283.getDefaultState(), Class7521.field29147.getDefaultState(), false);
        this.method13440(class1851, Class7521.field29147.getDefaultState(), 8, -11, 10, class1853);
        this.method13440(class1851, Class7521.field29147.getDefaultState(), 8, -10, 10, class1853);
        this.method13440(class1851, Class7521.field29218.getDefaultState(), 7, -10, 10, class1853);
        this.method13440(class1851, Class7521.field29219.getDefaultState(), 7, -11, 10, class1853);
        this.method13440(class1851, Class7521.field29147.getDefaultState(), 12, -11, 10, class1853);
        this.method13440(class1851, Class7521.field29147.getDefaultState(), 12, -10, 10, class1853);
        this.method13440(class1851, Class7521.field29218.getDefaultState(), 13, -10, 10, class1853);
        this.method13440(class1851, Class7521.field29219.getDefaultState(), 13, -11, 10, class1853);
        this.method13440(class1851, Class7521.field29147.getDefaultState(), 10, -11, 8, class1853);
        this.method13440(class1851, Class7521.field29147.getDefaultState(), 10, -10, 8, class1853);
        this.method13440(class1851, Class7521.field29218.getDefaultState(), 10, -10, 7, class1853);
        this.method13440(class1851, Class7521.field29219.getDefaultState(), 10, -11, 7, class1853);
        this.method13440(class1851, Class7521.field29147.getDefaultState(), 10, -11, 12, class1853);
        this.method13440(class1851, Class7521.field29147.getDefaultState(), 10, -10, 12, class1853);
        this.method13440(class1851, Class7521.field29218.getDefaultState(), 10, -10, 13, class1853);
        this.method13440(class1851, Class7521.field29219.getDefaultState(), 10, -11, 13, class1853);
        for (final Direction class1859 : Plane.HORIZONTAL) {
            if (this.field19868[class1859.getHorizontalIndex()]) {
                continue;
            }
            this.field19868[class1859.getHorizontalIndex()] = this.method13450(class1851, class1853, random, 10 + class1859.getXOffset() * 2, -11, 10 + class1859.getZOffset() * 2, Class9020.field38088);
        }
        return true;
    }
}
