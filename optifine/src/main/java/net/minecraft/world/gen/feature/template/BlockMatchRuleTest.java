package net.minecraft.world.gen.feature.template;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;

public class BlockMatchRuleTest extends RuleTest
{
    private final Block block;

    public BlockMatchRuleTest(Block p_i3159_1_)
    {
        this.block = p_i3159_1_;
    }

    public <T> BlockMatchRuleTest(Dynamic<T> p_i3160_1_)
    {
        this(Registry.BLOCK.getOrDefault(new ResourceLocation(p_i3160_1_.get("block").asString(""))));
    }

    public boolean test(BlockState p_215181_1_, Random p_215181_2_)
    {
        return p_215181_1_.getBlock() == this.block;
    }

    protected IRuleTestType getType()
    {
        return IRuleTestType.BLOCK_MATCH;
    }

    protected <T> Dynamic<T> serialize0(DynamicOps<T> p_215182_1_)
    {
        return new Dynamic<>(p_215182_1_, p_215182_1_.createMap(ImmutableMap.of(p_215182_1_.createString("block"), p_215182_1_.createString(Registry.BLOCK.getKey(this.block).toString()))));
    }
}
