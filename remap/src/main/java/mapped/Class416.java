// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.world.World;

public abstract class Class416 extends Class419 implements Class407
{
    private static final DataParameter<ItemStack> field2524;
    
    public Class416(final EntityType<? extends Class416> class7499, final World class7500) {
        super(class7499, class7500);
    }
    
    public Class416(final EntityType<? extends Class416> class7499, final double n, final double n2, final double n3, final double n4, final double n5, final double n6, final World class7500) {
        super(class7499, n, n2, n3, n4, n5, n6, class7500);
    }
    
    public Class416(final EntityType<? extends Class416> class7499, final LivingEntity class7500, final double n, final double n2, final double n3, final World class7501) {
        super(class7499, class7500, n, n2, n3, class7501);
    }
    
    public void method2029(final ItemStack class8321) {
        if (class8321.getItem() != Items.field31511 || class8321.method27656()) {
            this.method1650().set(Class416.field2524, (ItemStack) Util.method27851((T)class8321.method27641(), class8322 -> class8322.method27691(1)));
        }
    }
    
    public ItemStack method2030() {
        return this.method1650().get(Class416.field2524);
    }
    
    @Override
    public ItemStack method2005() {
        final ItemStack method2030 = this.method2030();
        return method2030.method27620() ? new ItemStack(Items.field31511) : method2030;
    }
    
    @Override
    public void method1649() {
        this.method1650().register(Class416.field2524, ItemStack.field34174);
    }
    
    @Override
    public void method1761(final CompoundNBT class51) {
        super.method1761(class51);
        final ItemStack method2030 = this.method2030();
        if (!method2030.method27620()) {
            class51.put("Item", method2030.method27627(new CompoundNBT()));
        }
    }
    
    @Override
    public void method1760(final CompoundNBT class51) {
        super.method1760(class51);
        this.method2029(ItemStack.method27619(class51.getCompound("Item")));
    }
    
    static {
        field2524 = EntityDataManager.method33564(Class416.class, Class7709.field30659);
    }
}
