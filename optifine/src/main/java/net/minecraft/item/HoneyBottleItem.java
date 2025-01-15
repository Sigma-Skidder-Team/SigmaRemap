package net.minecraft.item;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.potion.Effects;
import net.minecraft.stats.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

public class HoneyBottleItem extends Item
{
    public HoneyBottleItem(Item.Properties p_i3093_1_)
    {
        super(p_i3093_1_);
    }

    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving)
    {
        super.onItemUseFinish(stack, worldIn, entityLiving);

        if (entityLiving instanceof ServerPlayerEntity)
        {
            ServerPlayerEntity serverplayerentity = (ServerPlayerEntity)entityLiving;
            CriteriaTriggers.CONSUME_ITEM.trigger(serverplayerentity, stack);
            serverplayerentity.addStat(Stats.ITEM_USED.get(this));
        }

        if (!worldIn.isRemote)
        {
            entityLiving.removePotionEffect(Effects.POISON);
        }

        if (stack.isEmpty())
        {
            return new ItemStack(Items.GLASS_BOTTLE);
        }
        else
        {
            if (entityLiving instanceof PlayerEntity && !((PlayerEntity)entityLiving).abilities.isCreativeMode)
            {
                ItemStack itemstack = new ItemStack(Items.GLASS_BOTTLE);
                PlayerEntity playerentity = (PlayerEntity)entityLiving;

                if (!playerentity.inventory.addItemStackToInventory(itemstack))
                {
                    playerentity.dropItem(itemstack, false);
                }
            }

            return stack;
        }
    }

    public int getUseDuration(ItemStack stack)
    {
        return 40;
    }

    public UseAction getUseAction(ItemStack stack)
    {
        return UseAction.DRINK;
    }

    public SoundEvent func_225520_U__()
    {
        return SoundEvents.field_226141_eV_;
    }

    public SoundEvent func_225519_S__()
    {
        return SoundEvents.field_226141_eV_;
    }

    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn)
    {
        playerIn.setActiveHand(handIn);
        return ActionResult.resultSuccess(playerIn.getHeldItem(handIn));
    }
}
