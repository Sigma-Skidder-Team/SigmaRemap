// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

public abstract class Class4500 extends Class4473
{
    public Class1982 field19896;
    
    public Class4500(final Class9520 class9520, final int n) {
        super(class9520, n);
        this.field19896 = Class1982.field10976;
    }
    
    public Class4500(final Class9520 class9520, final CompoundNBT class9521) {
        super(class9520, class9521);
        this.field19896 = Class1982.field10976;
        this.field19896 = Class1982.valueOf(class9521.getString("EntryDoor"));
    }
    
    @Override
    public void method13415(final CompoundNBT class51) {
        class51.putString("EntryDoor", this.field19896.name());
    }
    
    public void method13492(final Class1851 class1851, final Random random, final MutableBoundingBox class1852, final Class1982 class1853, final int n, final int n2, final int n3) {
        switch (Class6870.field26918[class1853.ordinal()]) {
            case 1: {
                this.method13444(class1851, class1852, n, n2, n3, n + 3 - 1, n2 + 3 - 1, n3, Class4500.field19848, Class4500.field19848, false);
                break;
            }
            case 2: {
                this.method13440(class1851, Blocks.field29368.getDefaultState(), n, n2, n3, class1852);
                this.method13440(class1851, Blocks.field29368.getDefaultState(), n, n2 + 1, n3, class1852);
                this.method13440(class1851, Blocks.field29368.getDefaultState(), n, n2 + 2, n3, class1852);
                this.method13440(class1851, Blocks.field29368.getDefaultState(), n + 1, n2 + 2, n3, class1852);
                this.method13440(class1851, Blocks.field29368.getDefaultState(), n + 2, n2 + 2, n3, class1852);
                this.method13440(class1851, Blocks.field29368.getDefaultState(), n + 2, n2 + 1, n3, class1852);
                this.method13440(class1851, Blocks.field29368.getDefaultState(), n + 2, n2, n3, class1852);
                this.method13440(class1851, Blocks.field29306.getDefaultState(), n + 1, n2, n3, class1852);
                this.method13440(class1851, Blocks.field29306.getDefaultState().with(Class3969.field17935, Class182.field564), n + 1, n2 + 1, n3, class1852);
                break;
            }
            case 3: {
                this.method13440(class1851, Blocks.CAVE_AIR.getDefaultState(), n + 1, n2, n3, class1852);
                this.method13440(class1851, Blocks.CAVE_AIR.getDefaultState(), n + 1, n2 + 1, n3, class1852);
                this.method13440(class1851, ((StateHolder<O, BlockState>) Blocks.field29381.getDefaultState()).with((IProperty<Comparable>)Class3853.field17468, true), n, n2, n3, class1852);
                this.method13440(class1851, ((StateHolder<O, BlockState>) Blocks.field29381.getDefaultState()).with((IProperty<Comparable>)Class3853.field17468, true), n, n2 + 1, n3, class1852);
                this.method13440(class1851, ((StateHolder<O, BlockState>)((StateHolder<O, BlockState>) Blocks.field29381.getDefaultState()).with((IProperty<Comparable>)Class3853.field17466, true)).with((IProperty<Comparable>)Class3853.field17468, true), n, n2 + 2, n3, class1852);
                this.method13440(class1851, ((StateHolder<O, BlockState>)((StateHolder<O, BlockState>) Blocks.field29381.getDefaultState()).with((IProperty<Comparable>)Class3853.field17466, true)).with((IProperty<Comparable>)Class3853.field17468, true), n + 1, n2 + 2, n3, class1852);
                this.method13440(class1851, ((StateHolder<O, BlockState>)((StateHolder<O, BlockState>) Blocks.field29381.getDefaultState()).with((IProperty<Comparable>)Class3853.field17466, true)).with((IProperty<Comparable>)Class3853.field17468, true), n + 2, n2 + 2, n3, class1852);
                this.method13440(class1851, ((StateHolder<O, BlockState>) Blocks.field29381.getDefaultState()).with((IProperty<Comparable>)Class3853.field17466, true), n + 2, n2 + 1, n3, class1852);
                this.method13440(class1851, ((StateHolder<O, BlockState>) Blocks.field29381.getDefaultState()).with((IProperty<Comparable>)Class3853.field17466, true), n + 2, n2, n3, class1852);
                break;
            }
            case 4: {
                this.method13440(class1851, Blocks.field29368.getDefaultState(), n, n2, n3, class1852);
                this.method13440(class1851, Blocks.field29368.getDefaultState(), n, n2 + 1, n3, class1852);
                this.method13440(class1851, Blocks.field29368.getDefaultState(), n, n2 + 2, n3, class1852);
                this.method13440(class1851, Blocks.field29368.getDefaultState(), n + 1, n2 + 2, n3, class1852);
                this.method13440(class1851, Blocks.field29368.getDefaultState(), n + 2, n2 + 2, n3, class1852);
                this.method13440(class1851, Blocks.field29368.getDefaultState(), n + 2, n2 + 1, n3, class1852);
                this.method13440(class1851, Blocks.field29368.getDefaultState(), n + 2, n2, n3, class1852);
                this.method13440(class1851, Blocks.field29318.getDefaultState(), n + 1, n2, n3, class1852);
                this.method13440(class1851, Blocks.field29318.getDefaultState().with(Class3969.field17935, Class182.field564), n + 1, n2 + 1, n3, class1852);
                this.method13440(class1851, ((StateHolder<O, BlockState>) Blocks.field29328.getDefaultState()).with((IProperty<Comparable>)Class3905.field17564, Direction.NORTH), n + 2, n2 + 1, n3 + 1, class1852);
                this.method13440(class1851, ((StateHolder<O, BlockState>) Blocks.field29328.getDefaultState()).with((IProperty<Comparable>)Class3905.field17564, Direction.SOUTH), n + 2, n2 + 1, n3 - 1, class1852);
                break;
            }
        }
    }
    
    public Class1982 method13493(final Random random) {
        switch (random.nextInt(5)) {
            default: {
                return Class1982.field10976;
            }
            case 2: {
                return Class1982.field10977;
            }
            case 3: {
                return Class1982.field10978;
            }
            case 4: {
                return Class1982.field10979;
            }
        }
    }
    
    @Nullable
    public Class4473 method13494(final Class4507 class4507, final List<Class4473> list, final Random random, final int n, final int n2) {
        final Direction method13455 = this.method13455();
        if (method13455 != null) {
            switch (Class6870.field26919[method13455.ordinal()]) {
                case 1: {
                    return Class6924.method21298(class4507, list, random, this.field19849.minX + n, this.field19849.minY + n2, this.field19849.minZ - 1, method13455, this.method13433());
                }
                case 2: {
                    return Class6924.method21298(class4507, list, random, this.field19849.minX + n, this.field19849.minY + n2, this.field19849.maxZ + 1, method13455, this.method13433());
                }
                case 3: {
                    return Class6924.method21298(class4507, list, random, this.field19849.minX - 1, this.field19849.minY + n2, this.field19849.minZ + n, method13455, this.method13433());
                }
                case 4: {
                    return Class6924.method21298(class4507, list, random, this.field19849.maxX + 1, this.field19849.minY + n2, this.field19849.minZ + n, method13455, this.method13433());
                }
            }
        }
        return null;
    }
    
    @Nullable
    public Class4473 method13495(final Class4507 class4507, final List<Class4473> list, final Random random, final int n, final int n2) {
        final Direction method13455 = this.method13455();
        if (method13455 != null) {
            switch (Class6870.field26919[method13455.ordinal()]) {
                case 1: {
                    return Class6924.method21298(class4507, list, random, this.field19849.minX - 1, this.field19849.minY + n, this.field19849.minZ + n2, Direction.WEST, this.method13433());
                }
                case 2: {
                    return Class6924.method21298(class4507, list, random, this.field19849.minX - 1, this.field19849.minY + n, this.field19849.minZ + n2, Direction.WEST, this.method13433());
                }
                case 3: {
                    return Class6924.method21298(class4507, list, random, this.field19849.minX + n2, this.field19849.minY + n, this.field19849.minZ - 1, Direction.NORTH, this.method13433());
                }
                case 4: {
                    return Class6924.method21298(class4507, list, random, this.field19849.minX + n2, this.field19849.minY + n, this.field19849.minZ - 1, Direction.NORTH, this.method13433());
                }
            }
        }
        return null;
    }
    
    @Nullable
    public Class4473 method13496(final Class4507 class4507, final List<Class4473> list, final Random random, final int n, final int n2) {
        final Direction method13455 = this.method13455();
        if (method13455 != null) {
            switch (Class6870.field26919[method13455.ordinal()]) {
                case 1: {
                    return Class6924.method21298(class4507, list, random, this.field19849.maxX + 1, this.field19849.minY + n, this.field19849.minZ + n2, Direction.EAST, this.method13433());
                }
                case 2: {
                    return Class6924.method21298(class4507, list, random, this.field19849.maxX + 1, this.field19849.minY + n, this.field19849.minZ + n2, Direction.EAST, this.method13433());
                }
                case 3: {
                    return Class6924.method21298(class4507, list, random, this.field19849.minX + n2, this.field19849.minY + n, this.field19849.maxZ + 1, Direction.SOUTH, this.method13433());
                }
                case 4: {
                    return Class6924.method21298(class4507, list, random, this.field19849.minX + n2, this.field19849.minY + n, this.field19849.maxZ + 1, Direction.SOUTH, this.method13433());
                }
            }
        }
        return null;
    }
    
    public static boolean method13497(final MutableBoundingBox class6997) {
        return class6997 != null && class6997.minY > 10;
    }
}
