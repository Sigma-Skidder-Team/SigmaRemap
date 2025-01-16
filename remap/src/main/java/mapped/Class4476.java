// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.util.Direction;

import java.util.Random;

public class Class4476 extends Class4475
{
    private boolean field19861;
    private boolean field19862;
    
    public Class4476(final Random random, final int n, final int n2) {
        super(Class9520.field40980, random, n, 64, n2, 7, 7, 9);
    }
    
    public Class4476(final Class1795 class1795, final Class51 class1796) {
        super(Class9520.field40980, class1796);
        this.field19861 = class1796.method329("Witch");
        this.field19862 = class1796.method329("Cat");
    }
    
    @Override
    public void method13415(final Class51 class51) {
        super.method13415(class51);
        class51.method312("Witch", this.field19861);
        class51.method312("Cat", this.field19862);
    }
    
    @Override
    public boolean method13421(final Class1851 class1851, final Class6346<?> class1852, final Random random, final MutableBoundingBox class1853, final Class7859 class1854) {
        if (this.method13460(class1851, class1853, 0)) {
            this.method13444(class1851, class1853, 1, 1, 1, 5, 1, 7, Class7521.field29161.getDefaultState(), Class7521.field29161.getDefaultState(), false);
            this.method13444(class1851, class1853, 1, 4, 2, 5, 4, 7, Class7521.field29161.getDefaultState(), Class7521.field29161.getDefaultState(), false);
            this.method13444(class1851, class1853, 2, 1, 0, 4, 1, 0, Class7521.field29161.getDefaultState(), Class7521.field29161.getDefaultState(), false);
            this.method13444(class1851, class1853, 2, 2, 2, 3, 3, 2, Class7521.field29161.getDefaultState(), Class7521.field29161.getDefaultState(), false);
            this.method13444(class1851, class1853, 1, 2, 3, 1, 3, 6, Class7521.field29161.getDefaultState(), Class7521.field29161.getDefaultState(), false);
            this.method13444(class1851, class1853, 5, 2, 3, 5, 3, 6, Class7521.field29161.getDefaultState(), Class7521.field29161.getDefaultState(), false);
            this.method13444(class1851, class1853, 2, 2, 7, 4, 3, 7, Class7521.field29161.getDefaultState(), Class7521.field29161.getDefaultState(), false);
            this.method13444(class1851, class1853, 1, 0, 2, 1, 3, 2, Class7521.field29181.getDefaultState(), Class7521.field29181.getDefaultState(), false);
            this.method13444(class1851, class1853, 5, 0, 2, 5, 3, 2, Class7521.field29181.getDefaultState(), Class7521.field29181.getDefaultState(), false);
            this.method13444(class1851, class1853, 1, 0, 7, 1, 3, 7, Class7521.field29181.getDefaultState(), Class7521.field29181.getDefaultState(), false);
            this.method13444(class1851, class1853, 5, 0, 7, 5, 3, 7, Class7521.field29181.getDefaultState(), Class7521.field29181.getDefaultState(), false);
            this.method13440(class1851, Class7521.field29336.getDefaultState(), 2, 3, 2, class1853);
            this.method13440(class1851, Class7521.field29336.getDefaultState(), 3, 3, 7, class1853);
            this.method13440(class1851, Class7521.field29147.getDefaultState(), 1, 3, 4, class1853);
            this.method13440(class1851, Class7521.field29147.getDefaultState(), 5, 3, 4, class1853);
            this.method13440(class1851, Class7521.field29147.getDefaultState(), 5, 3, 5, class1853);
            this.method13440(class1851, Class7521.field29441.getDefaultState(), 1, 3, 5, class1853);
            this.method13440(class1851, Class7521.field29296.getDefaultState(), 3, 2, 6, class1853);
            this.method13440(class1851, Class7521.field29400.getDefaultState(), 4, 2, 6, class1853);
            this.method13440(class1851, Class7521.field29336.getDefaultState(), 1, 2, 1, class1853);
            this.method13440(class1851, Class7521.field29336.getDefaultState(), 5, 2, 1, class1853);
            final BlockState class1855 = ((StateHolder<O, BlockState>)Class7521.field29413.getDefaultState()).with((IProperty<Comparable>)Class3916.field17732, Direction.NORTH);
            final BlockState class1856 = ((StateHolder<O, BlockState>)Class7521.field29413.getDefaultState()).with((IProperty<Comparable>)Class3916.field17732, Direction.EAST);
            final BlockState class1857 = ((StateHolder<O, BlockState>)Class7521.field29413.getDefaultState()).with((IProperty<Comparable>)Class3916.field17732, Direction.WEST);
            final BlockState class1858 = ((StateHolder<O, BlockState>)Class7521.field29413.getDefaultState()).with((IProperty<Comparable>)Class3916.field17732, Direction.SOUTH);
            this.method13444(class1851, class1853, 0, 4, 1, 6, 4, 1, class1855, class1855, false);
            this.method13444(class1851, class1853, 0, 4, 2, 0, 4, 7, class1856, class1856, false);
            this.method13444(class1851, class1853, 6, 4, 2, 6, 4, 7, class1857, class1857, false);
            this.method13444(class1851, class1853, 0, 4, 8, 6, 4, 8, class1858, class1858, false);
            this.method13440(class1851, ((StateHolder<O, BlockState>)class1855).with(Class3916.field17734, Class183.field571), 0, 4, 1, class1853);
            this.method13440(class1851, ((StateHolder<O, BlockState>)class1855).with(Class3916.field17734, Class183.field570), 6, 4, 1, class1853);
            this.method13440(class1851, ((StateHolder<O, BlockState>)class1858).with(Class3916.field17734, Class183.field570), 0, 4, 8, class1853);
            this.method13440(class1851, ((StateHolder<O, BlockState>)class1858).with(Class3916.field17734, Class183.field571), 6, 4, 8, class1853);
            for (int i = 2; i <= 7; i += 5) {
                for (int j = 1; j <= 5; j += 4) {
                    this.method13449(class1851, Class7521.field29181.getDefaultState(), j, -1, i, class1853);
                }
            }
            if (!this.field19861) {
                final int method13437 = this.method13437(2, 5);
                final int method13438 = this.method13438(2);
                final int method13439 = this.method13439(2, 5);
                if (class1853.isVecInside(new BlockPos(method13437, method13438, method13439))) {
                    this.field19861 = true;
                    final Class778 class1859 = EntityType.field29047.method23371(class1851.method6744());
                    class1859.method4190();
                    class1859.method1730(method13437 + 0.5, method13438, method13439 + 0.5, 0.0f, 0.0f);
                    class1859.method4188(class1851, class1851.method6784(new BlockPos(method13437, method13438, method13439)), Class2101.field12177, null, null);
                    class1851.method6886(class1859);
                }
            }
            this.method13461(class1851, class1853);
            return true;
        }
        return false;
    }
    
    private void method13461(final Class1851 class1851, final MutableBoundingBox class1852) {
        if (!this.field19862) {
            final int method13437 = this.method13437(2, 5);
            final int method13438 = this.method13438(2);
            final int method13439 = this.method13439(2, 5);
            if (class1852.isVecInside(new BlockPos(method13437, method13438, method13439))) {
                this.field19862 = true;
                final Class800 class1853 = EntityType.field28964.method23371(class1851.method6744());
                class1853.method4190();
                class1853.method1730(method13437 + 0.5, method13438, method13439 + 0.5, 0.0f, 0.0f);
                class1853.method4188(class1851, class1851.method6784(new BlockPos(method13437, method13438, method13439)), Class2101.field12177, null, null);
                class1851.method6886(class1853);
            }
        }
    }
}
