package net.minecraft.world.gen.feature.structure;

import java.util.List;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Rotation;
import net.minecraft.util.SharedSeedRandom;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.jigsaw.JigsawManager;
import net.minecraft.world.gen.feature.jigsaw.JigsawPiece;
import net.minecraft.world.gen.feature.template.TemplateManager;

public class VillagePieces
{
    public static void func_214838_a(ChunkGenerator<?> chunkGeneratorIn, TemplateManager templateManagerIn, BlockPos p_214838_2_, List<StructurePiece> structurePieces, SharedSeedRandom sharedSeedRandomIn, VillageConfig villageConfigIn)
    {
        PlainsVillagePools.init();
        SnowyVillagePools.init();
        SavannaVillagePools.init();
        DesertVillagePools.init();
        TaigaVillagePools.init();
        JigsawManager.func_214889_a(villageConfigIn.startPool, villageConfigIn.size, VillagePieces.Village::new, chunkGeneratorIn, templateManagerIn, p_214838_2_, structurePieces, sharedSeedRandomIn);
    }

    public static class Village extends AbstractVillagePiece
    {
        public Village(TemplateManager p_i520_1_, JigsawPiece p_i520_2_, BlockPos p_i520_3_, int p_i520_4_, Rotation p_i520_5_, MutableBoundingBox p_i520_6_)
        {
            super(IStructurePieceType.NVI, p_i520_1_, p_i520_2_, p_i520_3_, p_i520_4_, p_i520_5_, p_i520_6_);
        }

        public Village(TemplateManager p_i521_1_, CompoundNBT p_i521_2_)
        {
            super(p_i521_1_, p_i521_2_, IStructurePieceType.NVI);
        }
    }
}
