package net.minecraft.world.gen.feature.jigsaw;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.ObjectArrays;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.gen.feature.template.GravityStructureProcessor;
import net.minecraft.world.gen.feature.template.StructureProcessor;
import net.minecraft.world.gen.feature.template.TemplateManager;

public class JigsawPattern
{
    public static final JigsawPattern EMPTY = new JigsawPattern(new ResourceLocation("empty"), new ResourceLocation("empty"), ImmutableList.of(), JigsawPattern.PlacementBehaviour.RIGID);
    public static final JigsawPattern INVALID = new JigsawPattern(new ResourceLocation("invalid"), new ResourceLocation("invalid"), ImmutableList.of(), JigsawPattern.PlacementBehaviour.RIGID);
    private final ResourceLocation name;
    private final ImmutableList<Pair<JigsawPiece, Integer>> field_214952_d;
    private final List<JigsawPiece> jigsawPieces;
    private final ResourceLocation field_214954_f;
    private final JigsawPattern.PlacementBehaviour placementBehaviour;
    private int field_214956_h = Integer.MIN_VALUE;

    public JigsawPattern(ResourceLocation p_i844_1_, ResourceLocation p_i844_2_, List<Pair<JigsawPiece, Integer>> p_i844_3_, JigsawPattern.PlacementBehaviour p_i844_4_)
    {
        this.name = p_i844_1_;
        this.field_214952_d = ImmutableList.copyOf(p_i844_3_);
        this.jigsawPieces = Lists.newArrayList();

        for (Pair<JigsawPiece, Integer> pair : p_i844_3_)
        {
            for (Integer integer = 0; integer < pair.getSecond(); integer = integer + 1)
            {
                this.jigsawPieces.add(pair.getFirst().setPlacementBehaviour(p_i844_4_));
            }
        }

        this.field_214954_f = p_i844_2_;
        this.placementBehaviour = p_i844_4_;
    }

    public int func_214945_a(TemplateManager templateManagerIn)
    {
        if (this.field_214956_h == Integer.MIN_VALUE)
        {
            this.field_214956_h = this.jigsawPieces.stream().mapToInt((p_214942_1_) ->
            {
                return p_214942_1_.getBoundingBox(templateManagerIn, BlockPos.ZERO, Rotation.NONE).getYSize();
            }).max().orElse(0);
        }

        return this.field_214956_h;
    }

    public ResourceLocation func_214948_a()
    {
        return this.field_214954_f;
    }

    public JigsawPiece getRandomPiece(Random rand)
    {
        return this.jigsawPieces.get(rand.nextInt(this.jigsawPieces.size()));
    }

    public List<JigsawPiece> getShuffledPieces(Random rand)
    {
        return ImmutableList.copyOf(ObjectArrays.shuffle(this.jigsawPieces.toArray(new JigsawPiece[0]), rand));
    }

    public ResourceLocation func_214947_b()
    {
        return this.name;
    }

    public int getNumberOfPieces()
    {
        return this.jigsawPieces.size();
    }

    public static enum PlacementBehaviour
    {
        TERRAIN_MATCHING("terrain_matching", ImmutableList.of(new GravityStructureProcessor(Heightmap.Type.WORLD_SURFACE_WG, -1))),
        RIGID("rigid", ImmutableList.of());

        private static final Map<String, JigsawPattern.PlacementBehaviour> BEHAVIOURS = Arrays.stream(values()).collect(Collectors.toMap(JigsawPattern.PlacementBehaviour::getName, (p_214935_0_) -> {
            return p_214935_0_;
        }));
        private final String name;
        private final ImmutableList<StructureProcessor> structureProcessors;

        private PlacementBehaviour(String p_i1972_3_, ImmutableList<StructureProcessor> p_i1972_4_)
        {
            this.name = p_i1972_3_;
            this.structureProcessors = p_i1972_4_;
        }

        public String getName()
        {
            return this.name;
        }

        public static JigsawPattern.PlacementBehaviour getBehaviour(String nameIn)
        {
            return BEHAVIOURS.get(nameIn);
        }

        public ImmutableList<StructureProcessor> getStructureProcessors()
        {
            return this.structureProcessors;
        }
    }
}
