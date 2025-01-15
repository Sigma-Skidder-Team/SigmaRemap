package net.minecraft.world.gen.feature.structure;

import com.mojang.datafixers.Dynamic;
import java.util.Random;
import java.util.function.Function;
import net.minecraft.util.SharedSeedRandom;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeManager;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.IFeatureConfig;

public abstract class ScatteredStructure<C extends IFeatureConfig> extends Structure<C>
{
    public ScatteredStructure(Function < Dynamic<?>, ? extends C > p_i1581_1_)
    {
        super(p_i1581_1_);
    }

    protected ChunkPos getStartPositionForPosition(ChunkGenerator<?> chunkGenerator, Random random, int x, int z, int spacingOffsetsX, int spacingOffsetsZ)
    {
        int i = this.getBiomeFeatureDistance(chunkGenerator);
        int j = this.getBiomeFeatureSeparation(chunkGenerator);
        int k = x + i * spacingOffsetsX;
        int l = z + i * spacingOffsetsZ;
        int i1 = k < 0 ? k - i + 1 : k;
        int j1 = l < 0 ? l - i + 1 : l;
        int k1 = i1 / i;
        int l1 = j1 / i;
        ((SharedSeedRandom)random).setLargeFeatureSeedWithSalt(chunkGenerator.getSeed(), k1, l1, this.getSeedModifier());
        k1 = k1 * i;
        l1 = l1 * i;
        k1 = k1 + random.nextInt(i - j);
        l1 = l1 + random.nextInt(i - j);
        return new ChunkPos(k1, l1);
    }

    public boolean func_225558_a_(BiomeManager p_225558_1_, ChunkGenerator<?> p_225558_2_, Random p_225558_3_, int p_225558_4_, int p_225558_5_, Biome p_225558_6_)
    {
        ChunkPos chunkpos = this.getStartPositionForPosition(p_225558_2_, p_225558_3_, p_225558_4_, p_225558_5_, 0, 0);
        return p_225558_4_ == chunkpos.x && p_225558_5_ == chunkpos.z && p_225558_2_.hasStructure(p_225558_6_, this);
    }

    protected int getBiomeFeatureDistance(ChunkGenerator<?> chunkGenerator)
    {
        return chunkGenerator.getSettings().getBiomeFeatureDistance();
    }

    protected int getBiomeFeatureSeparation(ChunkGenerator<?> chunkGenerator)
    {
        return chunkGenerator.getSettings().getBiomeFeatureSeparation();
    }

    protected abstract int getSeedModifier();
}
