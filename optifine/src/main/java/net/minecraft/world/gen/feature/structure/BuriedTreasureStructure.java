package net.minecraft.world.gen.feature.structure;

import com.mojang.datafixers.Dynamic;
import java.util.Random;
import java.util.function.Function;
import net.minecraft.util.SharedSeedRandom;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeManager;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.template.TemplateManager;

public class BuriedTreasureStructure extends Structure<BuriedTreasureConfig>
{
    public BuriedTreasureStructure(Function < Dynamic<?>, ? extends BuriedTreasureConfig > worldIn)
    {
        super(worldIn);
    }

    public boolean func_225558_a_(BiomeManager p_225558_1_, ChunkGenerator<?> p_225558_2_, Random p_225558_3_, int p_225558_4_, int p_225558_5_, Biome p_225558_6_)
    {
        if (p_225558_2_.hasStructure(p_225558_6_, this))
        {
            ((SharedSeedRandom)p_225558_3_).setLargeFeatureSeedWithSalt(p_225558_2_.getSeed(), p_225558_4_, p_225558_5_, 10387320);
            BuriedTreasureConfig buriedtreasureconfig = (BuriedTreasureConfig)p_225558_2_.getStructureConfig(p_225558_6_, this);
            return p_225558_3_.nextFloat() < buriedtreasureconfig.probability;
        }
        else
        {
            return false;
        }
    }

    public Structure.IStartFactory getStartFactory()
    {
        return BuriedTreasureStructure.Start::new;
    }

    public String getStructureName()
    {
        return "Buried_Treasure";
    }

    public int getSize()
    {
        return 1;
    }

    public static class Start extends StructureStart
    {
        public Start(Structure<?> p_i2524_1_, int p_i2524_2_, int p_i2524_3_, MutableBoundingBox p_i2524_4_, int p_i2524_5_, long p_i2524_6_)
        {
            super(p_i2524_1_, p_i2524_2_, p_i2524_3_, p_i2524_4_, p_i2524_5_, p_i2524_6_);
        }

        public void init(ChunkGenerator<?> generator, TemplateManager templateManagerIn, int chunkX, int chunkZ, Biome biomeIn)
        {
            int i = chunkX * 16;
            int j = chunkZ * 16;
            BlockPos blockpos = new BlockPos(i + 9, 90, j + 9);
            this.components.add(new BuriedTreasure.Piece(blockpos));
            this.recalculateStructureSize();
        }

        public BlockPos getPos()
        {
            return new BlockPos((this.getChunkPosX() << 4) + 9, 0, (this.getChunkPosZ() << 4) + 9);
        }
    }
}
