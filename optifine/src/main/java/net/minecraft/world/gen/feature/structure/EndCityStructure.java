package net.minecraft.world.gen.feature.structure;

import com.mojang.datafixers.Dynamic;
import java.util.Random;
import java.util.function.Function;
import net.minecraft.util.Rotation;
import net.minecraft.util.SharedSeedRandom;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeManager;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.template.TemplateManager;

public class EndCityStructure extends Structure<NoFeatureConfig>
{
    public EndCityStructure(Function < Dynamic<?>, ? extends NoFeatureConfig > p_i3509_1_)
    {
        super(p_i3509_1_);
    }

    protected ChunkPos getStartPositionForPosition(ChunkGenerator<?> chunkGenerator, Random random, int x, int z, int spacingOffsetsX, int spacingOffsetsZ)
    {
        int i = chunkGenerator.getSettings().getEndCityDistance();
        int j = chunkGenerator.getSettings().getEndCitySeparation();
        int k = x + i * spacingOffsetsX;
        int l = z + i * spacingOffsetsZ;
        int i1 = k < 0 ? k - i + 1 : k;
        int j1 = l < 0 ? l - i + 1 : l;
        int k1 = i1 / i;
        int l1 = j1 / i;
        ((SharedSeedRandom)random).setLargeFeatureSeedWithSalt(chunkGenerator.getSeed(), k1, l1, 10387313);
        k1 = k1 * i;
        l1 = l1 * i;
        k1 = k1 + (random.nextInt(i - j) + random.nextInt(i - j)) / 2;
        l1 = l1 + (random.nextInt(i - j) + random.nextInt(i - j)) / 2;
        return new ChunkPos(k1, l1);
    }

    public boolean func_225558_a_(BiomeManager p_225558_1_, ChunkGenerator<?> p_225558_2_, Random p_225558_3_, int p_225558_4_, int p_225558_5_, Biome p_225558_6_)
    {
        ChunkPos chunkpos = this.getStartPositionForPosition(p_225558_2_, p_225558_3_, p_225558_4_, p_225558_5_, 0, 0);

        if (p_225558_4_ == chunkpos.x && p_225558_5_ == chunkpos.z)
        {
            if (!p_225558_2_.hasStructure(p_225558_6_, this))
            {
                return false;
            }
            else
            {
                int i = getYPosForStructure(p_225558_4_, p_225558_5_, p_225558_2_);
                return i >= 60;
            }
        }
        else
        {
            return false;
        }
    }

    public Structure.IStartFactory getStartFactory()
    {
        return EndCityStructure.Start::new;
    }

    public String getStructureName()
    {
        return "EndCity";
    }

    public int getSize()
    {
        return 8;
    }

    private static int getYPosForStructure(int chunkX, int chunkY, ChunkGenerator<?> generatorIn)
    {
        Random random = new Random((long)(chunkX + chunkY * 10387313));
        Rotation rotation = Rotation.values()[random.nextInt(Rotation.values().length)];
        int i = 5;
        int j = 5;

        if (rotation == Rotation.CLOCKWISE_90)
        {
            i = -5;
        }
        else if (rotation == Rotation.CLOCKWISE_180)
        {
            i = -5;
            j = -5;
        }
        else if (rotation == Rotation.COUNTERCLOCKWISE_90)
        {
            j = -5;
        }

        int k = (chunkX << 4) + 7;
        int l = (chunkY << 4) + 7;
        int i1 = generatorIn.func_222531_c(k, l, Heightmap.Type.WORLD_SURFACE_WG);
        int j1 = generatorIn.func_222531_c(k, l + j, Heightmap.Type.WORLD_SURFACE_WG);
        int k1 = generatorIn.func_222531_c(k + i, l, Heightmap.Type.WORLD_SURFACE_WG);
        int l1 = generatorIn.func_222531_c(k + i, l + j, Heightmap.Type.WORLD_SURFACE_WG);
        return Math.min(Math.min(i1, j1), Math.min(k1, l1));
    }

    public static class Start extends StructureStart
    {
        public Start(Structure<?> p_i2792_1_, int p_i2792_2_, int p_i2792_3_, MutableBoundingBox p_i2792_4_, int p_i2792_5_, long p_i2792_6_)
        {
            super(p_i2792_1_, p_i2792_2_, p_i2792_3_, p_i2792_4_, p_i2792_5_, p_i2792_6_);
        }

        public void init(ChunkGenerator<?> generator, TemplateManager templateManagerIn, int chunkX, int chunkZ, Biome biomeIn)
        {
            Rotation rotation = Rotation.values()[this.rand.nextInt(Rotation.values().length)];
            int i = EndCityStructure.getYPosForStructure(chunkX, chunkZ, generator);

            if (i >= 60)
            {
                BlockPos blockpos = new BlockPos(chunkX * 16 + 8, i, chunkZ * 16 + 8);
                EndCityPieces.startHouseTower(templateManagerIn, blockpos, rotation, this.components, this.rand);
                this.recalculateStructureSize();
            }
        }
    }
}
