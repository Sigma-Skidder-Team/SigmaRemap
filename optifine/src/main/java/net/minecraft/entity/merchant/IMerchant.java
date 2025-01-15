package net.minecraft.entity.merchant;

import java.util.OptionalInt;
import javax.annotation.Nullable;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.container.MerchantContainer;
import net.minecraft.inventory.container.SimpleNamedContainerProvider;
import net.minecraft.item.ItemStack;
import net.minecraft.item.MerchantOffer;
import net.minecraft.item.MerchantOffers;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

public interface IMerchant
{
    void setCustomer(@Nullable PlayerEntity player);

    @Nullable
    PlayerEntity getCustomer();

    MerchantOffers getOffers();

    void setClientSideOffers(@Nullable MerchantOffers offers);

    void onTrade(MerchantOffer offer);

    void verifySellingItem(ItemStack stack);

    World getWorld();

    int getXp();

    void setXP(int xpIn);

    boolean func_213705_dZ();

    SoundEvent getYesSound();

default boolean func_223340_ej()
    {
        return false;
    }

default void openMerchantContainer(PlayerEntity player, ITextComponent p_213707_2_, int level)
    {
        OptionalInt optionalint = player.openContainer(new SimpleNamedContainerProvider((p_213701_1_, p_213701_2_, p_213701_3_) ->
        {
            return new MerchantContainer(p_213701_1_, p_213701_2_, this);
        }, p_213707_2_));

        if (optionalint.isPresent())
        {
            MerchantOffers merchantoffers = this.getOffers();

            if (!merchantoffers.isEmpty())
            {
                player.openMerchantContainer(optionalint.getAsInt(), merchantoffers, level, this.getXp(), this.func_213705_dZ(), this.func_223340_ej());
            }
        }
    }
}
