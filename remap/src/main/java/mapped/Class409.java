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

public abstract class Class409 extends Class414 implements Class407
{
    private static final DataParameter<ItemStack> field2506;
    
    public Class409(final EntityType<? extends Class409> class7499, final World class7500) {
        super(class7499, class7500);
    }
    
    public Class409(final EntityType<? extends Class409> class7499, final double n, final double n2, final double n3, final World class7500) {
        super(class7499, n, n2, n3, class7500);
    }
    
    public Class409(final EntityType<? extends Class409> class7499, final LivingEntity class7500, final World class7501) {
        super(class7499, class7500, class7501);
    }
    
    public void method2012(final ItemStack class8321) {
        if (class8321.getItem() != this.method2013() || class8321.method27656()) {
            this.method1650().set(Class409.field2506, (ItemStack) Util.method27851((T)class8321.method27641(), class8322 -> class8322.method27691(1)));
        }
    }
    
    public abstract Item method2013();
    
    public ItemStack method2014() {
        return this.method1650().get(Class409.field2506);
    }
    
    @Override
    public ItemStack method2005() {
        final ItemStack method2014 = this.method2014();
        return method2014.method27620() ? new ItemStack(this.method2013()) : method2014;
    }
    
    @Override
    public void method1649() {
        this.method1650().register(Class409.field2506, ItemStack.EMPTY);
    }
    
    @Override
    public void method1761(final CompoundNBT class51) {
        super.method1761(class51);
        final ItemStack method2014 = this.method2014();
        if (!method2014.method27620()) {
            class51.put("Item", method2014.method27627(new CompoundNBT()));
        }
    }
    
    @Override
    public void method1760(final CompoundNBT class51) {
        super.method1760(class51);
        this.method2012(ItemStack.method27619(class51.getCompound("Item")));
    }
    
    static {
        field2506 = EntityDataManager.method33564(Class409.class, Class7709.field30659);
    }
}
