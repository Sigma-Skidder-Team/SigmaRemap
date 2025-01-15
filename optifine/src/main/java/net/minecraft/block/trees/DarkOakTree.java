package net.minecraft.block.trees;

import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.HugeTreeFeatureConfig;
import net.minecraft.world.gen.feature.TreeFeatureConfig;

public class DarkOakTree extends BigTree
{
    @Nullable
    protected ConfiguredFeature < TreeFeatureConfig, ? > getTreeFeature(Random randomIn, boolean p_225546_2_)
    {
        return null;
    }

    @Nullable
    protected ConfiguredFeature < HugeTreeFeatureConfig, ? > getHugeTreeFeature(Random p_225547_1_)
    {
        return Feature.DARK_OAK_TREE.withConfiguration(DefaultBiomeFeatures.DARK_OAK_TREE_CONFIG);
    }
}
