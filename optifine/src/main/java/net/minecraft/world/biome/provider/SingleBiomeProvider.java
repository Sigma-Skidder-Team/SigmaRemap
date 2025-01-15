package net.minecraft.world.biome.provider;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Random;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;

public class SingleBiomeProvider extends BiomeProvider
{
    private final Biome biome;

    public SingleBiomeProvider(SingleBiomeProviderSettings p_i1646_1_)
    {
        super(ImmutableSet.of(p_i1646_1_.getBiome()));
        this.biome = p_i1646_1_.getBiome();
    }

    public Biome getNoiseBiome(int x, int y, int z)
    {
        return this.biome;
    }

    @Nullable
    public BlockPos func_225531_a_(int p_225531_1_, int p_225531_2_, int p_225531_3_, int p_225531_4_, List<Biome> p_225531_5_, Random p_225531_6_)
    {
        return p_225531_5_.contains(this.biome) ? new BlockPos(p_225531_1_ - p_225531_4_ + p_225531_6_.nextInt(p_225531_4_ * 2 + 1), p_225531_2_, p_225531_3_ - p_225531_4_ + p_225531_6_.nextInt(p_225531_4_ * 2 + 1)) : null;
    }

    public Set<Biome> func_225530_a_(int p_225530_1_, int p_225530_2_, int p_225530_3_, int p_225530_4_)
    {
        return Sets.newHashSet(this.biome);
    }
}
