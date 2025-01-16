// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemStack;
import net.minecraft.util2.Direction;
import net.minecraft.world.World;

public class Class4081 extends Item
{
    private static String[] field18185;
    private final EntityType<? extends Class860> field18186;
    
    public Class4081(final EntityType<? extends Class860> field18186, final Class8959 class8959) {
        super(class8959);
        this.field18186 = field18186;
    }
    
    @Override
    public Class2201 method11694(final Class7075 class7075) {
        final BlockPos method21639 = class7075.method21639();
        final Direction method21640 = class7075.method21648();
        final BlockPos method21641 = method21639.method1149(method21640);
        final PlayerEntity method21642 = class7075.method21652();
        final ItemStack method21643 = class7075.method21651();
        if (method21642 != null && !this.method12287(method21642, method21640, method21643, method21641)) {
            return Class2201.field13403;
        }
        final World method21644 = class7075.method21654();
        Class860 class7076;
        if (this.field18186 != EntityType.field29009) {
            if (this.field18186 != EntityType.field28993) {
                return Class2201.field13400;
            }
            class7076 = new Class862(method21644, method21641, method21640);
        }
        else {
            class7076 = new Class861(method21644, method21641, method21640);
        }
        final CompoundNBT method21645 = method21643.method27657();
        if (method21645 != null) {
            EntityType.method23360(method21644, method21642, class7076, method21645);
        }
        if (!class7076.method5189()) {
            return Class2201.field13401;
        }
        if (!method21644.isRemote) {
            class7076.method5193();
            method21644.method6886(class7076);
        }
        method21643.method27693(1);
        return Class2201.field13400;
    }
    
    public boolean method12287(final PlayerEntity playerEntity, final Direction class513, final ItemStack class514, final BlockPos class515) {
        return !class513.getAxis().isVertical() && playerEntity.method2881(class515, class513, class514);
    }
}
