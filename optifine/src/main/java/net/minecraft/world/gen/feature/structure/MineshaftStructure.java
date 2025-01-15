package net.minecraft.world.gen.feature.structure;

import com.mojang.datafixers.Dynamic;
import java.util.Arrays;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;
import net.minecraft.util.SharedSeedRandom;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeManager;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.template.TemplateManager;

public class MineshaftStructure extends Structure<MineshaftConfig>
{
    public MineshaftStructure(Function < Dynamic<?>, ? extends MineshaftConfig > p_i3026_1_)
    {
        super(p_i3026_1_);
    }

    public boolean func_225558_a_(BiomeManager p_225558_1_, ChunkGenerator<?> p_225558_2_, Random p_225558_3_, int p_225558_4_, int p_225558_5_, Biome p_225558_6_)
    {
        ((SharedSeedRandom)p_225558_3_).setLargeFeatureSeed(p_225558_2_.getSeed(), p_225558_4_, p_225558_5_);

        if (p_225558_2_.hasStructure(p_225558_6_, this))
        {
            MineshaftConfig mineshaftconfig = (MineshaftConfig)p_225558_2_.getStructureConfig(p_225558_6_, this);
            double d0 = mineshaftconfig.probability;
            return p_225558_3_.nextDouble() < d0;
        }
        else
        {
            return false;
        }
    }

    public Structure.IStartFactory getStartFactory()
    {
        return MineshaftStructure.Start::new;
    }

    public String getStructureName()
    {
        return "Mineshaft";
    }

    public int getSize()
    {
        return 8;
    }

    public static class Start extends StructureStart
    {
        public Start(Structure<?> p_i1926_1_, int p_i1926_2_, int p_i1926_3_, MutableBoundingBox p_i1926_4_, int p_i1926_5_, long p_i1926_6_)
        {
            super(p_i1926_1_, p_i1926_2_, p_i1926_3_, p_i1926_4_, p_i1926_5_, p_i1926_6_);
        }

        public void init(ChunkGenerator<?> generator, TemplateManager templateManagerIn, int chunkX, int chunkZ, Biome biomeIn)
        {
            MineshaftConfig mineshaftconfig = (MineshaftConfig)generator.getStructureConfig(biomeIn, Feature.MINESHAFT);
            MineshaftPieces.Room mineshaftpieces$room = new MineshaftPieces.Room(0, this.rand, (chunkX << 4) + 2, (chunkZ << 4) + 2, mineshaftconfig.type);
            this.components.add(mineshaftpieces$room);
            mineshaftpieces$room.buildComponent(mineshaftpieces$room, this.components, this.rand);
            this.recalculateStructureSize();

            if (mineshaftconfig.type == MineshaftStructure.Type.MESA)
            {
                int i = -5;
                int j = generator.getSeaLevel() - this.bounds.maxY + this.bounds.getYSize() / 2 - -5;
                this.bounds.offset(0, j, 0);

                for (StructurePiece structurepiece : this.components)
                {
                    structurepiece.offset(0, j, 0);
                }
            }
            else
            {
                this.func_214628_a(generator.getSeaLevel(), this.rand, 10);
            }
        }
    }

    public static enum Type
    {
        NORMAL("normal"),
        MESA("mesa");

        private static final Map<String, MineshaftStructure.Type> BY_NAME = Arrays.stream(values()).collect(Collectors.toMap(MineshaftStructure.Type::getName, (p_214716_0_) -> {
            return p_214716_0_;
        }));
        private final String name;

        private Type(String p_i3434_3_)
        {
            this.name = p_i3434_3_;
        }

        public String getName()
        {
            return this.name;
        }

        public static MineshaftStructure.Type byName(String p_214715_0_)
        {
            return BY_NAME.get(p_214715_0_);
        }

        public static MineshaftStructure.Type byId(int id)
        {
            return id >= 0 && id < values().length ? values()[id] : NORMAL;
        }
    }
}
