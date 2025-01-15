package net.minecraft.item;

import net.minecraft.entity.item.ExperienceBottleEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.stats.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

public class ExperienceBottleItem extends Item
{
    public ExperienceBottleItem(Item.Properties p_i3189_1_)
    {
        super(p_i3189_1_);
    }

    public boolean hasEffect(ItemStack stack)
    {
        return true;
    }

    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn)
    {
        ItemStack itemstack = playerIn.getHeldItem(handIn);
        worldIn.playSound((PlayerEntity)null, playerIn.getPosX(), playerIn.getPosY(), playerIn.getPosZ(), SoundEvents.ENTITY_EXPERIENCE_BOTTLE_THROW, SoundCategory.NEUTRAL, 0.5F, 0.4F / (random.nextFloat() * 0.4F + 0.8F));

        if (!worldIn.isRemote)
        {
            ExperienceBottleEntity experiencebottleentity = new ExperienceBottleEntity(worldIn, playerIn);
            experiencebottleentity.setItem(itemstack);
            experiencebottleentity.shoot(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, -20.0F, 0.7F, 1.0F);
            worldIn.addEntity(experiencebottleentity);
        }

        playerIn.addStat(Stats.ITEM_USED.get(this));

        if (!playerIn.abilities.isCreativeMode)
        {
            itemstack.shrink(1);
        }

        return ActionResult.resultSuccess(itemstack);
    }
}
