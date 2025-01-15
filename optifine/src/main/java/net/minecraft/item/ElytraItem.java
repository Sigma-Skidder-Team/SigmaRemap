package net.minecraft.item;

import net.minecraft.block.DispenserBlock;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class ElytraItem extends Item
{
    public ElytraItem(Item.Properties p_i2179_1_)
    {
        super(p_i2179_1_);
        this.addPropertyOverride(new ResourceLocation("broken"), (p_210312_0_, p_210312_1_, p_210312_2_) ->
        {
            return isUsable(p_210312_0_) ? 0.0F : 1.0F;
        });
        DispenserBlock.registerDispenseBehavior(this, ArmorItem.DISPENSER_BEHAVIOR);
    }

    public static boolean isUsable(ItemStack stack)
    {
        return stack.getDamage() < stack.getMaxDamage() - 1;
    }

    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        return repair.getItem() == Items.PHANTOM_MEMBRANE;
    }

    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn)
    {
        ItemStack itemstack = playerIn.getHeldItem(handIn);
        EquipmentSlotType equipmentslottype = MobEntity.getSlotForItemStack(itemstack);
        ItemStack itemstack1 = playerIn.getItemStackFromSlot(equipmentslottype);

        if (itemstack1.isEmpty())
        {
            playerIn.setItemStackToSlot(equipmentslottype, itemstack.copy());
            itemstack.setCount(0);
            return ActionResult.resultSuccess(itemstack);
        }
        else
        {
            return ActionResult.resultFail(itemstack);
        }
    }
}
