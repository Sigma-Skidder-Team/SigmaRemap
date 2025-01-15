package net.minecraft.world.gen.feature.structure;

import com.google.common.collect.Lists;
import com.mojang.datafixers.Dynamic;
import java.util.List;
import java.util.function.Function;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.IWorld;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.template.TemplateManager;

public class SwampHutStructure extends ScatteredStructure<NoFeatureConfig>
{
    private static final List<Biome.SpawnListEntry> field_202384_d = Lists.newArrayList(new Biome.SpawnListEntry(EntityType.WITCH, 1, 1, 1));
    private static final List<Biome.SpawnListEntry> field_214559_aS = Lists.newArrayList(new Biome.SpawnListEntry(EntityType.CAT, 1, 1, 1));

    public SwampHutStructure(Function < Dynamic<?>, ? extends NoFeatureConfig > p_i2916_1_)
    {
        super(p_i2916_1_);
    }

    public String getStructureName()
    {
        return "Swamp_Hut";
    }

    public int getSize()
    {
        return 3;
    }

    public Structure.IStartFactory getStartFactory()
    {
        return SwampHutStructure.Start::new;
    }

    protected int getSeedModifier()
    {
        return 14357620;
    }

    public List<Biome.SpawnListEntry> getSpawnList()
    {
        return field_202384_d;
    }

    public List<Biome.SpawnListEntry> getCreatureSpawnList()
    {
        return field_214559_aS;
    }

    public boolean func_202383_b(IWorld p_202383_1_, BlockPos p_202383_2_)
    {
        StructureStart structurestart = this.getStart(p_202383_1_, p_202383_2_, true);

        if (structurestart != StructureStart.DUMMY && structurestart instanceof SwampHutStructure.Start && !structurestart.getComponents().isEmpty())
        {
            StructurePiece structurepiece = structurestart.getComponents().get(0);
            return structurepiece instanceof SwampHutPiece;
        }
        else
        {
            return false;
        }
    }

    public static class Start extends StructureStart
    {
        public Start(Structure<?> p_i2771_1_, int p_i2771_2_, int p_i2771_3_, MutableBoundingBox p_i2771_4_, int p_i2771_5_, long p_i2771_6_)
        {
            super(p_i2771_1_, p_i2771_2_, p_i2771_3_, p_i2771_4_, p_i2771_5_, p_i2771_6_);
        }

        public void init(ChunkGenerator<?> generator, TemplateManager templateManagerIn, int chunkX, int chunkZ, Biome biomeIn)
        {
            SwampHutPiece swamphutpiece = new SwampHutPiece(this.rand, chunkX * 16, chunkZ * 16);
            this.components.add(swamphutpiece);
            this.recalculateStructureSize();
        }
    }
}
