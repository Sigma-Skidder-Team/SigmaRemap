// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util2.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import java.util.stream.IntStream;
import java.util.Iterator;
import java.util.function.Supplier;
import java.util.List;

public class Class455 extends Class456 implements Class453, Class439
{
    private Class2265<ItemStack> field2707;
    private int field2708;
    private long field2709;
    
    public Class455() {
        super(Class5412.field22557);
        this.field2707 = Class2265.method8507(5, ItemStack.field34174);
        this.field2708 = -1;
    }
    
    @Override
    public void method2179(final Class51 class51) {
        super.method2179(class51);
        this.field2707 = Class2265.method8507(this.method2239(), ItemStack.field34174);
        if (!this.method2324(class51)) {
            Class8508.method28426(class51, this.field2707);
        }
        this.field2708 = class51.method319("TransferCooldown");
    }
    
    @Override
    public Class51 method2180(final Class51 class51) {
        super.method2180(class51);
        if (!this.method2325(class51)) {
            Class8508.method28424(class51, this.field2707);
        }
        class51.method298("TransferCooldown", this.field2708);
        return class51;
    }
    
    @Override
    public int method2239() {
        return this.field2707.size();
    }
    
    @Override
    public ItemStack method2158(final int n, final int n2) {
        this.method2326(null);
        return Class8508.method28422(this.method2246(), n, n2);
    }
    
    @Override
    public void method2160(final int n, final ItemStack class8321) {
        this.method2326(null);
        this.method2246().set(n, class8321);
        if (class8321.method27690() > this.method2254()) {
            class8321.method27691(this.method2254());
        }
    }
    
    @Override
    public ITextComponent method2243() {
        return new Class2259("container.hopper", new Object[0]);
    }
    
    @Override
    public void method2229() {
        if (this.field2656 != null) {
            if (!this.field2656.isRemote) {
                --this.field2708;
                this.field2709 = this.field2656.method6754();
                if (!this.method2314()) {
                    this.method2313(0);
                    this.method2294(() -> method2300(this));
                }
            }
        }
    }
    
    private boolean method2294(final Supplier<Boolean> supplier) {
        if (this.field2656 != null && !this.field2656.isRemote) {
            if (!this.method2314()) {
                if (this.method2194().get((IProperty<Boolean>)Class3959.field17882)) {
                    boolean method2296 = false;
                    if (!this.method2156()) {
                        method2296 = this.method2296();
                    }
                    if (!this.method2295()) {
                        method2296 |= supplier.get();
                    }
                    if (method2296) {
                        this.method2313(8);
                        this.method2161();
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }
    
    private boolean method2295() {
        for (final ItemStack class8321 : this.field2707) {
            if (!class8321.method27620() && class8321.method27690() == class8321.method27628()) {
                continue;
            }
            return false;
        }
        return true;
    }
    
    private boolean method2296() {
        final Class446 method2307 = this.method2307();
        if (method2307 == null) {
            return false;
        }
        final Direction method2308 = this.method2194().get((IProperty<Direction>)Class3959.field17881).getOpposite();
        if (!this.method2298(method2307, method2308)) {
            for (int i = 0; i < this.method2239(); ++i) {
                if (!this.method2157(i).method27620()) {
                    final ItemStack method2309 = this.method2157(i).method27641();
                    if (method2303(this, method2307, this.method2158(i, 1), method2308).method27620()) {
                        method2307.method2161();
                        return true;
                    }
                    this.method2160(i, method2309);
                }
            }
            return false;
        }
        return false;
    }
    
    private static IntStream method2297(final Class446 class446, final Direction class447) {
        return (class446 instanceof Class441) ? IntStream.of(((Class441)class446).method2248(class447)) : IntStream.range(0, class446.method2239());
    }
    
    private boolean method2298(final Class446 class446, final Direction class447) {
        return method2297(class446, class447).allMatch(n2 -> {
            class448.method2157(n2);
            final ItemStack class449;
            return class449.method27690() >= class449.method27628();
        });
    }
    
    private static boolean method2299(final Class446 class446, final Direction class447) {
        return method2297(class446, class447).allMatch(n2 -> class448.method2157(n2).method27620());
    }
    
    public static boolean method2300(final Class453 class453) {
        final Class446 method2308 = method2308(class453);
        if (method2308 == null) {
            final Iterator<Class427> iterator = method2309(class453).iterator();
            while (iterator.hasNext()) {
                if (!method2302(class453, iterator.next())) {
                    continue;
                }
                return true;
            }
            return false;
        }
        final Direction field511 = Direction.DOWN;
        return !method2299(method2308, field511) && method2297(method2308, field511).anyMatch(n2 -> method2301(class454, class455, n2, class456));
    }
    
    private static boolean method2301(final Class453 class453, final Class446 class454, final int n, final Direction class455) {
        final ItemStack method2157 = class454.method2157(n);
        if (!method2157.method27620()) {
            if (method2305(class454, method2157, n, class455)) {
                final ItemStack method2158 = method2157.method27641();
                if (method2303(class454, class453, class454.method2158(n, 1), null).method27620()) {
                    class454.method2161();
                    return true;
                }
                class454.method2160(n, method2158);
            }
        }
        return false;
    }
    
    public static boolean method2302(final Class446 class446, final Class427 class447) {
        boolean b = false;
        final ItemStack method2303 = method2303(null, class446, class447.method2107().method27641(), null);
        if (!method2303.method27620()) {
            class447.method2108(method2303);
        }
        else {
            b = true;
            class447.method1652();
        }
        return b;
    }
    
    public static ItemStack method2303(final Class446 class446, final Class446 class447, ItemStack class448, final Direction class449) {
        if (class447 instanceof Class441 && class449 != null) {
            final int[] method2248 = ((Class441)class447).method2248(class449);
            for (int n = 0; n < method2248.length && !class448.method27620(); class448 = method2306(class446, class447, class448, method2248[n], class449), ++n) {}
        }
        else {
            for (int method2249 = class447.method2239(), i = 0; i < method2249; ++i) {
                if (class448.method27620()) {
                    break;
                }
                class448 = method2306(class446, class447, class448, i, class449);
            }
        }
        return class448;
    }
    
    private static boolean method2304(final Class446 class446, final ItemStack class447, final int n, final Direction class448) {
        return class446.method2264(n, class447) && (!(class446 instanceof Class441) || ((Class441)class446).method2249(n, class447, class448));
    }
    
    private static boolean method2305(final Class446 class446, final ItemStack class447, final int n, final Direction class448) {
        return !(class446 instanceof Class441) || ((Class441)class446).method2250(n, class447, class448);
    }
    
    private static ItemStack method2306(final Class446 class446, final Class446 class447, ItemStack field34174, final int n, final Direction class448) {
        final ItemStack method2157 = class447.method2157(n);
        if (method2304(class447, field34174, n, class448)) {
            int n2 = 0;
            final boolean method2158 = class447.method2156();
            if (!method2157.method27620()) {
                if (method2312(method2157, field34174)) {
                    final int min = Math.min(field34174.method27690(), field34174.method27628() - method2157.method27690());
                    field34174.method27693(min);
                    method2157.method27692(min);
                    n2 = ((min > 0) ? 1 : 0);
                }
            }
            else {
                class447.method2160(n, field34174);
                field34174 = ItemStack.field34174;
                n2 = 1;
            }
            if (n2 != 0) {
                if (method2158) {
                    if (class447 instanceof Class455) {
                        final Class455 class449 = (Class455)class447;
                        if (!class449.method2315()) {
                            int n3 = 0;
                            if (class446 instanceof Class455) {
                                if (class449.field2709 >= ((Class455)class446).field2709) {
                                    n3 = 1;
                                }
                            }
                            class449.method2313(8 - n3);
                        }
                    }
                }
                class447.method2161();
            }
        }
        return field34174;
    }
    
    @Nullable
    private Class446 method2307() {
        return method2310(this.method2186(), this.field2657.method1149(this.method2194().get((IProperty<Direction>)Class3959.field17881)));
    }
    
    @Nullable
    public static Class446 method2308(final Class453 class453) {
        return method2311(class453.method2186(), class453.method2286(), class453.method2287() + 1.0, class453.method2288());
    }
    
    public static List<Class427> method2309(final Class453 class453) {
        return class453.method2285().toBoundingBoxList().stream().flatMap(class455 -> class454.method2186().method6739((Class<? extends Entity>)Class427.class, class455.method18499(class454.method2286() - 0.5, class454.method2287() - 0.5, class454.method2288() - 0.5), (Predicate<? super Entity>)Class9170.field38845).stream()).collect((Collector<? super Object, ?, List<Class427>>)Collectors.toList());
    }
    
    @Nullable
    public static Class446 method2310(final World class1847, final BlockPos class1848) {
        return method2311(class1847, class1848.getX() + 0.5, class1848.getY() + 0.5, class1848.getZ() + 0.5);
    }
    
    @Nullable
    public static Class446 method2311(final World class1847, final double n, final double n2, final double n3) {
        Class446 class1848 = null;
        final BlockPos class1849 = new BlockPos(n, n2, n3);
        final BlockState method6701 = class1847.getBlockState(class1849);
        final Block method6702 = method6701.getBlock();
        if (!(method6702 instanceof Class3966)) {
            if (method6702.method11802()) {
                final TileEntity method6703 = class1847.getTileEntity(class1849);
                if (method6703 instanceof Class446) {
                    class1848 = (Class446)method6703;
                    if (class1848 instanceof Class475) {
                        if (method6702 instanceof Class3865) {
                            class1848 = Class3865.method11936((Class3865)method6702, method6701, class1847, class1849, true);
                        }
                    }
                }
            }
        }
        else {
            class1848 = ((Class3966)method6702).method12099(method6701, class1847, class1849);
        }
        if (class1848 == null) {
            final List<Entity> method6704 = class1847.method6737(null, new AxisAlignedBB(n - 0.5, n2 - 0.5, n3 - 0.5, n + 0.5, n2 + 0.5, n3 + 0.5), Class9170.field38848);
            if (!method6704.isEmpty()) {
                class1848 = (Class446)method6704.get(class1847.rand.nextInt(method6704.size()));
            }
        }
        return class1848;
    }
    
    private static boolean method2312(final ItemStack class8321, final ItemStack class8322) {
        return class8321.getItem() == class8322.getItem() && class8321.method27632() == class8322.method27632() && class8321.method27690() <= class8321.method27628() && ItemStack.method27642(class8321, class8322);
    }
    
    @Override
    public double method2286() {
        return this.field2657.getX() + 0.5;
    }
    
    @Override
    public double method2287() {
        return this.field2657.getY() + 0.5;
    }
    
    @Override
    public double method2288() {
        return this.field2657.getZ() + 0.5;
    }
    
    private void method2313(final int field2708) {
        this.field2708 = field2708;
    }
    
    private boolean method2314() {
        return this.field2708 > 0;
    }
    
    private boolean method2315() {
        return this.field2708 > 8;
    }
    
    @Override
    public Class2265<ItemStack> method2246() {
        return this.field2707;
    }
    
    @Override
    public void method2247(final Class2265<ItemStack> field2707) {
        this.field2707 = field2707;
    }
    
    public void method2316(final Entity class399) {
        if (class399 instanceof Class427) {
            final BlockPos method2193 = this.getPos();
            if (VoxelShapes.method24496(VoxelShapes.method24489(class399.getBoundingBox().method18499(-method2193.getX(), -method2193.getY(), -method2193.getZ())), this.method2285(), IBooleanFunction.AND)) {
                this.method2294(() -> method2302(this, (Class427)class400));
            }
        }
    }
    
    @Override
    public Class3418 method2253(final int n, final Class464 class464) {
        return new Class3437(n, class464, this);
    }
}
