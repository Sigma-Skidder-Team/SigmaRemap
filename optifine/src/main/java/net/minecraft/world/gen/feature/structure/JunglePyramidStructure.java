package net.minecraft.world.gen.feature.structure;

import com.mojang.datafixers.Dynamic;
import java.util.function.Function;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.template.TemplateManager;

public class JunglePyramidStructure extends ScatteredStructure<NoFeatureConfig>
{
    public JunglePyramidStructure(Function < Dynamic<?>, ? extends NoFeatureConfig > p_i3761_1_)
    {
        super(p_i3761_1_);
    }

    public String getStructureName()
    {
        return "Jungle_Pyramid";
    }

    public int getSize()
    {
        return 3;
    }

    public Structure.IStartFactory getStartFactory()
    {
        return JunglePyramidStructure.Start::new;
    }

    protected int getSeedModifier()
    {
        return 14357619;
    }

    public static class Start extends StructureStart
    {
        public Start(Structure<?> p_i2189_1_, int p_i2189_2_, int p_i2189_3_, MutableBoundingBox p_i2189_4_, int p_i2189_5_, long p_i2189_6_)
        {
            super(p_i2189_1_, p_i2189_2_, p_i2189_3_, p_i2189_4_, p_i2189_5_, p_i2189_6_);
        }

        public void init(ChunkGenerator<?> generator, TemplateManager templateManagerIn, int chunkX, int chunkZ, Biome biomeIn)
        {
            JunglePyramidPiece junglepyramidpiece = new JunglePyramidPiece(this.rand, chunkX * 16, chunkZ * 16);
            this.components.add(junglepyramidpiece);
            this.recalculateStructureSize();
        }
    }
}
