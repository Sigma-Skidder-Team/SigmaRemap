package net.minecraft.world.storage.loot;

import java.util.function.Consumer;
import net.minecraft.item.ItemStack;

public interface ILootGenerator
{
    int getEffectiveWeight(float luck);

    void func_216188_a(Consumer<ItemStack> p_216188_1_, LootContext p_216188_2_);
}
