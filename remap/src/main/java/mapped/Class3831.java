// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import com.google.common.collect.Iterables;
import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemStack;
import net.minecraft.util2.Direction;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Map;

public class Class3831 extends Item
{
    private static final Map<EntityType<?>, Class3831> field17386;
    private final int field17387;
    private final int field17388;
    private final EntityType<?> field17389;
    
    public Class3831(final EntityType<?> field17389, final int field17390, final int field17391, final Class8959 class8959) {
        super(class8959);
        this.field17389 = field17389;
        this.field17387 = field17390;
        this.field17388 = field17391;
        Class3831.field17386.put(field17389, this);
    }
    
    @Override
    public Class2201 method11694(final Class7075 class7075) {
        final World method21654 = class7075.method21654();
        if (!method21654.isRemote) {
            final ItemStack method21655 = class7075.method21651();
            final BlockPos method21656 = class7075.method21639();
            final Direction method21657 = class7075.method21648();
            final Class7096 method21658 = method21654.getBlockState(method21656);
            if (method21658.method21696() == Class7521.field29290) {
                final TileEntity method21659 = method21654.getTileEntity(method21656);
                if (method21659 instanceof Class494) {
                    ((Class494)method21659).method2509().method13884(this.method11773(method21655.method27657()));
                    method21659.method2161();
                    method21654.method6693(method21656, method21658, method21658, 3);
                    method21655.method27693(1);
                    return Class2201.field13400;
                }
            }
            BlockPos method21660;
            if (!method21658.method21727(method21654, method21656).method24540()) {
                method21660 = method21656.method1149(method21657);
            }
            else {
                method21660 = method21656;
            }
            if (this.method11773(method21655.method27657()).method23356(method21654, method21655, class7075.method21652(), method21660, Class2101.field12186, true, !Objects.equals(method21656, method21660) && method21657 == Direction.UP) != null) {
                method21655.method27693(1);
            }
            return Class2201.field13400;
        }
        return Class2201.field13400;
    }
    
    @Override
    public Class9355<ItemStack> method11695(final World class1847, final PlayerEntity class1848, final Class316 class1849) {
        final ItemStack method2715 = class1848.method2715(class1849);
        final Class7006 method2716 = Item.method11733(class1847, class1848, RayTraceContext.FluidMode.SOURCE_ONLY);
        if (method2716.method21449() != Class2165.field12881) {
            return Class9355.method34676(method2715);
        }
        if (class1847.isRemote) {
            return Class9355.method34674(method2715);
        }
        final BlockRayTraceResult class1850 = (BlockRayTraceResult)method2716;
        final BlockPos method2717 = class1850.method21447();
        if (!(class1847.getBlockState(method2717).method21696() instanceof Class3859)) {
            return Class9355.method34676(method2715);
        }
        if (!class1847.method6760(class1848, method2717) || !class1848.method2881(method2717, class1850.method21448(), method2715)) {
            return Class9355.method34677(method2715);
        }
        if (this.method11773(method2715.method27657()).method23356(class1847, method2715, class1848, method2717, Class2101.field12186, false, false) != null) {
            if (!class1848.field3025.field27304) {
                method2715.method27693(1);
            }
            class1848.method2859(Class8276.field33981.method8449(this));
            return Class9355.method34674(method2715);
        }
        return Class9355.method34676(method2715);
    }
    
    public boolean method11769(final Class51 class51, final EntityType<?> b) {
        return Objects.equals(this.method11773(class51), b);
    }
    
    public int method11770(final int n) {
        return (n != 0) ? this.field17388 : this.field17387;
    }
    
    @Nullable
    public static Class3831 method11771(final EntityType<?> class7499) {
        return Class3831.field17386.get(class7499);
    }
    
    public static Iterable<Class3831> method11772() {
        return Iterables.unmodifiableIterable((Iterable)Class3831.field17386.values());
    }
    
    public EntityType<?> method11773(final Class51 class51) {
        if (class51 != null) {
            if (class51.method316("EntityTag", 10)) {
                final Class51 method327 = class51.method327("EntityTag");
                if (method327.method316("id", 8)) {
                    return EntityType.method23355(method327.method323("id")).orElse(this.field17389);
                }
            }
        }
        return this.field17389;
    }
    
    static {
        field17386 = Maps.newIdentityHashMap();
    }
}
