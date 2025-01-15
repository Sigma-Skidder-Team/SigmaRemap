package net.minecraft.entity.projectile;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.IRendersAsItem;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.Util;
import net.minecraft.world.World;

public abstract class ProjectileItemEntity extends ThrowableEntity implements IRendersAsItem
{
    private static final DataParameter<ItemStack> ITEMSTACK_DATA = EntityDataManager.createKey(ProjectileItemEntity.class, DataSerializers.ITEMSTACK);

    public ProjectileItemEntity(EntityType <? extends ProjectileItemEntity > p_i2391_1_, World p_i2391_2_)
    {
        super(p_i2391_1_, p_i2391_2_);
    }

    public ProjectileItemEntity(EntityType <? extends ProjectileItemEntity > p_i2392_1_, double p_i2392_2_, double p_i2392_4_, double p_i2392_6_, World p_i2392_8_)
    {
        super(p_i2392_1_, p_i2392_2_, p_i2392_4_, p_i2392_6_, p_i2392_8_);
    }

    public ProjectileItemEntity(EntityType <? extends ProjectileItemEntity > p_i2393_1_, LivingEntity p_i2393_2_, World p_i2393_3_)
    {
        super(p_i2393_1_, p_i2393_2_, p_i2393_3_);
    }

    public void setItem(ItemStack stack)
    {
        if (stack.getItem() != this.getDefaultItem() || stack.hasTag())
        {
            this.getDataManager().set(ITEMSTACK_DATA, Util.make(stack.copy(), (p_213883_0_) ->
            {
                p_213883_0_.setCount(1);
            }));
        }
    }

    protected abstract Item getDefaultItem();

    protected ItemStack func_213882_k()
    {
        return this.getDataManager().get(ITEMSTACK_DATA);
    }

    public ItemStack getItem()
    {
        ItemStack itemstack = this.func_213882_k();
        return itemstack.isEmpty() ? new ItemStack(this.getDefaultItem()) : itemstack;
    }

    protected void registerData()
    {
        this.getDataManager().register(ITEMSTACK_DATA, ItemStack.EMPTY);
    }

    public void writeAdditional(CompoundNBT compound)
    {
        super.writeAdditional(compound);
        ItemStack itemstack = this.func_213882_k();

        if (!itemstack.isEmpty())
        {
            compound.put("Item", itemstack.write(new CompoundNBT()));
        }
    }

    public void readAdditional(CompoundNBT compound)
    {
        super.readAdditional(compound);
        ItemStack itemstack = ItemStack.read(compound.getCompound("Item"));
        this.setItem(itemstack);
    }
}
