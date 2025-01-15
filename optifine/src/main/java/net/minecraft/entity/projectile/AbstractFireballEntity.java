package net.minecraft.entity.projectile;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.IRendersAsItem;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.Util;
import net.minecraft.world.World;

public abstract class AbstractFireballEntity extends DamagingProjectileEntity implements IRendersAsItem
{
    private static final DataParameter<ItemStack> STACK = EntityDataManager.createKey(AbstractFireballEntity.class, DataSerializers.ITEMSTACK);

    public AbstractFireballEntity(EntityType <? extends AbstractFireballEntity > p_i950_1_, World p_i950_2_)
    {
        super(p_i950_1_, p_i950_2_);
    }

    public AbstractFireballEntity(EntityType <? extends AbstractFireballEntity > p_i951_1_, double p_i951_2_, double p_i951_4_, double p_i951_6_, double p_i951_8_, double p_i951_10_, double p_i951_12_, World p_i951_14_)
    {
        super(p_i951_1_, p_i951_2_, p_i951_4_, p_i951_6_, p_i951_8_, p_i951_10_, p_i951_12_, p_i951_14_);
    }

    public AbstractFireballEntity(EntityType <? extends AbstractFireballEntity > p_i952_1_, LivingEntity p_i952_2_, double p_i952_3_, double p_i952_5_, double p_i952_7_, World p_i952_9_)
    {
        super(p_i952_1_, p_i952_2_, p_i952_3_, p_i952_5_, p_i952_7_, p_i952_9_);
    }

    public void setStack(ItemStack p_213898_1_)
    {
        if (p_213898_1_.getItem() != Items.FIRE_CHARGE || p_213898_1_.hasTag())
        {
            this.getDataManager().set(STACK, Util.make(p_213898_1_.copy(), (p_213897_0_) ->
            {
                p_213897_0_.setCount(1);
            }));
        }
    }

    protected ItemStack getStack()
    {
        return this.getDataManager().get(STACK);
    }

    public ItemStack getItem()
    {
        ItemStack itemstack = this.getStack();
        return itemstack.isEmpty() ? new ItemStack(Items.FIRE_CHARGE) : itemstack;
    }

    protected void registerData()
    {
        this.getDataManager().register(STACK, ItemStack.EMPTY);
    }

    public void writeAdditional(CompoundNBT compound)
    {
        super.writeAdditional(compound);
        ItemStack itemstack = this.getStack();

        if (!itemstack.isEmpty())
        {
            compound.put("Item", itemstack.write(new CompoundNBT()));
        }
    }

    public void readAdditional(CompoundNBT compound)
    {
        super.readAdditional(compound);
        ItemStack itemstack = ItemStack.read(compound.getCompound("Item"));
        this.setStack(itemstack);
    }
}
