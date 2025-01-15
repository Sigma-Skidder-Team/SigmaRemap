package net.minecraft.world.gen.feature.structure;

import com.mojang.datafixers.Dynamic;
import java.util.function.Function;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.template.TemplateManager;

public class IglooStructure extends ScatteredStructure<NoFeatureConfig>
{
    public IglooStructure(Function < Dynamic<?>, ? extends NoFeatureConfig > serverIn)
    {
        super(serverIn);
    }

    public String getStructureName()
    {
        return "Igloo";
    }

    public int getSize()
    {
        return 3;
    }

    public Structure.IStartFactory getStartFactory()
    {
        return IglooStructure.Start::new;
    }

    protected int getSeedModifier()
    {
        return 14357618;
    }

    public static class Start extends StructureStart
    {
        public Start(Structure<?> p_i2056_1_, int p_i2056_2_, int p_i2056_3_, MutableBoundingBox p_i2056_4_, int p_i2056_5_, long p_i2056_6_)
        {
            super(p_i2056_1_, p_i2056_2_, p_i2056_3_, p_i2056_4_, p_i2056_5_, p_i2056_6_);
        }

        public void init(ChunkGenerator<?> generator, TemplateManager templateManagerIn, int chunkX, int chunkZ, Biome biomeIn)
        {
            NoFeatureConfig nofeatureconfig = (NoFeatureConfig)generator.getStructureConfig(biomeIn, Feature.IGLOO);
            int i = chunkX * 16;
            int j = chunkZ * 16;
            BlockPos blockpos = new BlockPos(i, 90, j);
            Rotation rotation = Rotation.values()[this.rand.nextInt(Rotation.values().length)];
            IglooPieces.func_207617_a(templateManagerIn, blockpos, rotation, this.components, this.rand, nofeatureconfig);
            this.recalculateStructureSize();
        }
    }
}
