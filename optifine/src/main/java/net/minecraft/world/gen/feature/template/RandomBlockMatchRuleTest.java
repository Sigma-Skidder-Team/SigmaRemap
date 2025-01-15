package net.minecraft.world.gen.feature.template;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;

public class RandomBlockMatchRuleTest extends RuleTest
{
    private final Block block;
    private final float probability;

    public RandomBlockMatchRuleTest(Block p_i1063_1_, float p_i1063_2_)
    {
        this.block = p_i1063_1_;
        this.probability = p_i1063_2_;
    }

    public <T> RandomBlockMatchRuleTest(Dynamic<T> p_i1064_1_)
    {
        this(Registry.BLOCK.getOrDefault(new ResourceLocation(p_i1064_1_.get("block").asString(""))), p_i1064_1_.get("probability").asFloat(1.0F));
    }

    public boolean test(BlockState p_215181_1_, Random p_215181_2_)
    {
        return p_215181_1_.getBlock() == this.block && p_215181_2_.nextFloat() < this.probability;
    }

    protected IRuleTestType getType()
    {
        return IRuleTestType.RANDOM_BLOCK_MATCH;
    }

    protected <T> Dynamic<T> serialize0(DynamicOps<T> p_215182_1_)
    {
        return new Dynamic<>(p_215182_1_, p_215182_1_.createMap(ImmutableMap.of(p_215182_1_.createString("block"), p_215182_1_.createString(Registry.BLOCK.getKey(this.block).toString()), p_215182_1_.createString("probability"), p_215182_1_.createFloat(this.probability))));
    }
}
