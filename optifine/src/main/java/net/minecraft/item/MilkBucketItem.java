package net.minecraft.item;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.stats.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class MilkBucketItem extends Item
{
    public MilkBucketItem(Item.Properties p_i3315_1_)
    {
        super(p_i3315_1_);
    }

    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving)
    {
        if (entityLiving instanceof ServerPlayerEntity)
        {
            ServerPlayerEntity serverplayerentity = (ServerPlayerEntity)entityLiving;
            CriteriaTriggers.CONSUME_ITEM.trigger(serverplayerentity, stack);
            serverplayerentity.addStat(Stats.ITEM_USED.get(this));
        }

        if (entityLiving instanceof PlayerEntity && !((PlayerEntity)entityLiving).abilities.isCreativeMode)
        {
            stack.shrink(1);
        }

        if (!worldIn.isRemote)
        {
            entityLiving.clearActivePotions();
        }

        return stack.isEmpty() ? new ItemStack(Items.BUCKET) : stack;
    }

    public int getUseDuration(ItemStack stack)
    {
        return 32;
    }

    public UseAction getUseAction(ItemStack stack)
    {
        return UseAction.DRINK;
    }

    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn)
    {
        playerIn.setActiveHand(handIn);
        return ActionResult.resultSuccess(playerIn.getHeldItem(handIn));
    }
}
