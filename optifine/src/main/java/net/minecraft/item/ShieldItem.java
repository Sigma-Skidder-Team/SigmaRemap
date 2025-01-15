package net.minecraft.item;

import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.block.DispenserBlock;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

public class ShieldItem extends Item
{
    public ShieldItem(Item.Properties p_i2923_1_)
    {
        super(p_i2923_1_);
        this.addPropertyOverride(new ResourceLocation("blocking"), (p_210314_0_, p_210314_1_, p_210314_2_) ->
        {
            return p_210314_2_ != null && p_210314_2_.isHandActive() && p_210314_2_.getActiveItemStack() == p_210314_0_ ? 1.0F : 0.0F;
        });
        DispenserBlock.registerDispenseBehavior(this, ArmorItem.DISPENSER_BEHAVIOR);
    }

    public String getTranslationKey(ItemStack stack)
    {
        return stack.getChildTag("BlockEntityTag") != null ? this.getTranslationKey() + '.' + getColor(stack).getTranslationKey() : super.getTranslationKey(stack);
    }

    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
    {
        BannerItem.appendHoverTextFromTileEntityTag(stack, tooltip);
    }

    public UseAction getUseAction(ItemStack stack)
    {
        return UseAction.BLOCK;
    }

    public int getUseDuration(ItemStack stack)
    {
        return 72000;
    }

    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn)
    {
        ItemStack itemstack = playerIn.getHeldItem(handIn);
        playerIn.setActiveHand(handIn);
        return ActionResult.resultConsume(itemstack);
    }

    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        return ItemTags.PLANKS.contains(repair.getItem()) || super.getIsRepairable(toRepair, repair);
    }

    public static DyeColor getColor(ItemStack stack)
    {
        return DyeColor.byId(stack.getOrCreateChildTag("BlockEntityTag").getInt("Base"));
    }
}
