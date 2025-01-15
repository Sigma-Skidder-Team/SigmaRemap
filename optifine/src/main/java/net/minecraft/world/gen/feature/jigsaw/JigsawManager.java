package net.minecraft.world.gen.feature.jigsaw;

import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import java.util.Deque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;
import net.minecraft.block.JigsawBlock;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.gen.feature.structure.AbstractVillagePiece;
import net.minecraft.world.gen.feature.structure.StructurePiece;
import net.minecraft.world.gen.feature.structure.Structures;
import net.minecraft.world.gen.feature.template.Template;
import net.minecraft.world.gen.feature.template.TemplateManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class JigsawManager
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final JigsawPatternRegistry REGISTRY = new JigsawPatternRegistry();

    public static void func_214889_a(ResourceLocation p_214889_0_, int p_214889_1_, JigsawManager.IPieceFactory p_214889_2_, ChunkGenerator<?> p_214889_3_, TemplateManager templateManagerIn, BlockPos p_214889_5_, List<StructurePiece> p_214889_6_, Random p_214889_7_)
    {
        Structures.init();
        new JigsawManager.Assembler(p_214889_0_, p_214889_1_, p_214889_2_, p_214889_3_, templateManagerIn, p_214889_5_, p_214889_6_, p_214889_7_);
    }

    static
    {
        REGISTRY.register(JigsawPattern.EMPTY);
    }

    static final class Assembler
    {
        private final int field_214882_a;
        private final JigsawManager.IPieceFactory pieceFactory;
        private final ChunkGenerator<?> chunkGenerator;
        private final TemplateManager templateManager;
        private final List<StructurePiece> structurePieces;
        private final Random rand;
        private final Deque<JigsawManager.Entry> availablePieces = Queues.newArrayDeque();

        public Assembler(ResourceLocation p_i1145_1_, int p_i1145_2_, JigsawManager.IPieceFactory p_i1145_3_, ChunkGenerator<?> p_i1145_4_, TemplateManager p_i1145_5_, BlockPos p_i1145_6_, List<StructurePiece> p_i1145_7_, Random p_i1145_8_)
        {
            this.field_214882_a = p_i1145_2_;
            this.pieceFactory = p_i1145_3_;
            this.chunkGenerator = p_i1145_4_;
            this.templateManager = p_i1145_5_;
            this.structurePieces = p_i1145_7_;
            this.rand = p_i1145_8_;
            Rotation rotation = Rotation.randomRotation(p_i1145_8_);
            JigsawPattern jigsawpattern = JigsawManager.REGISTRY.get(p_i1145_1_);
            JigsawPiece jigsawpiece = jigsawpattern.getRandomPiece(p_i1145_8_);
            AbstractVillagePiece abstractvillagepiece = p_i1145_3_.create(p_i1145_5_, jigsawpiece, p_i1145_6_, jigsawpiece.func_214850_d(), rotation, jigsawpiece.getBoundingBox(p_i1145_5_, p_i1145_6_, rotation));
            MutableBoundingBox mutableboundingbox = abstractvillagepiece.getBoundingBox();
            int i = (mutableboundingbox.maxX + mutableboundingbox.minX) / 2;
            int j = (mutableboundingbox.maxZ + mutableboundingbox.minZ) / 2;
            int k = p_i1145_4_.func_222532_b(i, j, Heightmap.Type.WORLD_SURFACE_WG);
            abstractvillagepiece.offset(0, k - (mutableboundingbox.minY + abstractvillagepiece.getGroundLevelDelta()), 0);
            p_i1145_7_.add(abstractvillagepiece);

            if (p_i1145_2_ > 0)
            {
                int l = 80;
                AxisAlignedBB axisalignedbb = new AxisAlignedBB((double)(i - 80), (double)(k - 80), (double)(j - 80), (double)(i + 80 + 1), (double)(k + 80 + 1), (double)(j + 80 + 1));
                this.availablePieces.addLast(new JigsawManager.Entry(abstractvillagepiece, new AtomicReference<>(VoxelShapes.combineAndSimplify(VoxelShapes.create(axisalignedbb), VoxelShapes.create(AxisAlignedBB.toImmutable(mutableboundingbox)), IBooleanFunction.ONLY_FIRST)), k + 80, 0));

                while (!this.availablePieces.isEmpty())
                {
                    JigsawManager.Entry jigsawmanager$entry = this.availablePieces.removeFirst();
                    this.func_214881_a(jigsawmanager$entry.villagePiece, jigsawmanager$entry.field_214877_b, jigsawmanager$entry.field_214878_c, jigsawmanager$entry.field_214879_d);
                }
            }
        }

        private void func_214881_a(AbstractVillagePiece villagePieceIn, AtomicReference<VoxelShape> atomicVoxelShape, int p_214881_3_, int p_214881_4_)
        {
            JigsawPiece jigsawpiece = villagePieceIn.getJigsawPiece();
            BlockPos blockpos = villagePieceIn.getPos();
            Rotation rotation = villagePieceIn.getRotation();
            JigsawPattern.PlacementBehaviour jigsawpattern$placementbehaviour = jigsawpiece.getPlacementBehaviour();
            boolean flag = jigsawpattern$placementbehaviour == JigsawPattern.PlacementBehaviour.RIGID;
            AtomicReference<VoxelShape> atomicreference = new AtomicReference<>();
            MutableBoundingBox mutableboundingbox = villagePieceIn.getBoundingBox();
            int i = mutableboundingbox.minY;
            label123:

            for (Template.BlockInfo template$blockinfo : jigsawpiece.getJigsawBlocks(this.templateManager, blockpos, rotation, this.rand))
            {
                Direction direction = template$blockinfo.state.get(JigsawBlock.FACING);
                BlockPos blockpos1 = template$blockinfo.pos;
                BlockPos blockpos2 = blockpos1.offset(direction);
                int j = blockpos1.getY() - i;
                int k = -1;
                JigsawPattern jigsawpattern = JigsawManager.REGISTRY.get(new ResourceLocation(template$blockinfo.nbt.getString("target_pool")));
                JigsawPattern jigsawpattern1 = JigsawManager.REGISTRY.get(jigsawpattern.func_214948_a());

                if (jigsawpattern != JigsawPattern.INVALID && (jigsawpattern.getNumberOfPieces() != 0 || jigsawpattern == JigsawPattern.EMPTY))
                {
                    boolean flag1 = mutableboundingbox.isVecInside(blockpos2);
                    AtomicReference<VoxelShape> atomicreference1;
                    int l;

                    if (flag1)
                    {
                        atomicreference1 = atomicreference;
                        l = i;

                        if (atomicreference.get() == null)
                        {
                            atomicreference.set(VoxelShapes.create(AxisAlignedBB.toImmutable(mutableboundingbox)));
                        }
                    }
                    else
                    {
                        atomicreference1 = atomicVoxelShape;
                        l = p_214881_3_;
                    }

                    List<JigsawPiece> list = Lists.newArrayList();

                    if (p_214881_4_ != this.field_214882_a)
                    {
                        list.addAll(jigsawpattern.getShuffledPieces(this.rand));
                    }

                    list.addAll(jigsawpattern1.getShuffledPieces(this.rand));

                    for (JigsawPiece jigsawpiece1 : list)
                    {
                        if (jigsawpiece1 == EmptyJigsawPiece.INSTANCE)
                        {
                            break;
                        }

                        for (Rotation rotation1 : Rotation.shuffledRotations(this.rand))
                        {
                            List<Template.BlockInfo> list1 = jigsawpiece1.getJigsawBlocks(this.templateManager, BlockPos.ZERO, rotation1, this.rand);
                            MutableBoundingBox mutableboundingbox1 = jigsawpiece1.getBoundingBox(this.templateManager, BlockPos.ZERO, rotation1);
                            int i1;

                            if (mutableboundingbox1.getYSize() > 16)
                            {
                                i1 = 0;
                            }
                            else
                            {
                                i1 = list1.stream().mapToInt((p_214880_2_) ->
                                {
                                    if (!mutableboundingbox1.isVecInside(p_214880_2_.pos.offset(p_214880_2_.state.get(JigsawBlock.FACING))))
                                    {
                                        return 0;
                                    }
                                    else {
                                        ResourceLocation resourcelocation = new ResourceLocation(p_214880_2_.nbt.getString("target_pool"));
                                        JigsawPattern jigsawpattern2 = JigsawManager.REGISTRY.get(resourcelocation);
                                        JigsawPattern jigsawpattern3 = JigsawManager.REGISTRY.get(jigsawpattern2.func_214948_a());
                                        return Math.max(jigsawpattern2.func_214945_a(this.templateManager), jigsawpattern3.func_214945_a(this.templateManager));
                                    }
                                }).max().orElse(0);
                            }

                            for (Template.BlockInfo template$blockinfo1 : list1)
                            {
                                if (JigsawBlock.func_220171_a(template$blockinfo, template$blockinfo1))
                                {
                                    BlockPos blockpos3 = template$blockinfo1.pos;
                                    BlockPos blockpos4 = new BlockPos(blockpos2.getX() - blockpos3.getX(), blockpos2.getY() - blockpos3.getY(), blockpos2.getZ() - blockpos3.getZ());
                                    MutableBoundingBox mutableboundingbox2 = jigsawpiece1.getBoundingBox(this.templateManager, blockpos4, rotation1);
                                    int j1 = mutableboundingbox2.minY;
                                    JigsawPattern.PlacementBehaviour jigsawpattern$placementbehaviour1 = jigsawpiece1.getPlacementBehaviour();
                                    boolean flag2 = jigsawpattern$placementbehaviour1 == JigsawPattern.PlacementBehaviour.RIGID;
                                    int k1 = blockpos3.getY();
                                    int l1 = j - k1 + template$blockinfo.state.get(JigsawBlock.FACING).getYOffset();
                                    int i2;

                                    if (flag && flag2)
                                    {
                                        i2 = i + l1;
                                    }
                                    else
                                    {
                                        if (k == -1)
                                        {
                                            k = this.chunkGenerator.func_222532_b(blockpos1.getX(), blockpos1.getZ(), Heightmap.Type.WORLD_SURFACE_WG);
                                        }

                                        i2 = k - k1;
                                    }

                                    int j2 = i2 - j1;
                                    MutableBoundingBox mutableboundingbox3 = mutableboundingbox2.func_215127_b(0, j2, 0);
                                    BlockPos blockpos5 = blockpos4.add(0, j2, 0);

                                    if (i1 > 0)
                                    {
                                        int k2 = Math.max(i1 + 1, mutableboundingbox3.maxY - mutableboundingbox3.minY);
                                        mutableboundingbox3.maxY = mutableboundingbox3.minY + k2;
                                    }

                                    if (!VoxelShapes.compare(atomicreference1.get(), VoxelShapes.create(AxisAlignedBB.toImmutable(mutableboundingbox3).shrink(0.25D)), IBooleanFunction.ONLY_SECOND))
                                    {
                                        atomicreference1.set(VoxelShapes.combine(atomicreference1.get(), VoxelShapes.create(AxisAlignedBB.toImmutable(mutableboundingbox3)), IBooleanFunction.ONLY_FIRST));
                                        int j3 = villagePieceIn.getGroundLevelDelta();
                                        int l2;

                                        if (flag2)
                                        {
                                            l2 = j3 - l1;
                                        }
                                        else
                                        {
                                            l2 = jigsawpiece1.func_214850_d();
                                        }

                                        AbstractVillagePiece abstractvillagepiece = this.pieceFactory.create(this.templateManager, jigsawpiece1, blockpos5, l2, rotation1, mutableboundingbox3);
                                        int i3;

                                        if (flag)
                                        {
                                            i3 = i + j;
                                        }
                                        else if (flag2)
                                        {
                                            i3 = i2 + k1;
                                        }
                                        else
                                        {
                                            if (k == -1)
                                            {
                                                k = this.chunkGenerator.func_222532_b(blockpos1.getX(), blockpos1.getZ(), Heightmap.Type.WORLD_SURFACE_WG);
                                            }

                                            i3 = k + l1 / 2;
                                        }

                                        villagePieceIn.addJunction(new JigsawJunction(blockpos2.getX(), i3 - j + j3, blockpos2.getZ(), l1, jigsawpattern$placementbehaviour1));
                                        abstractvillagepiece.addJunction(new JigsawJunction(blockpos1.getX(), i3 - k1 + l2, blockpos1.getZ(), -l1, jigsawpattern$placementbehaviour));
                                        this.structurePieces.add(abstractvillagepiece);

                                        if (p_214881_4_ + 1 <= this.field_214882_a)
                                        {
                                            this.availablePieces.addLast(new JigsawManager.Entry(abstractvillagepiece, atomicreference1, l, p_214881_4_ + 1));
                                        }

                                        continue label123;
                                    }
                                }
                            }
                        }
                    }
                }
                else
                {
                    JigsawManager.LOGGER.warn("Empty or none existent pool: {}", (Object)template$blockinfo.nbt.getString("target_pool"));
                }
            }
        }
    }

    static final class Entry
    {
        private final AbstractVillagePiece villagePiece;
        private final AtomicReference<VoxelShape> field_214877_b;
        private final int field_214878_c;
        private final int field_214879_d;

        private Entry(AbstractVillagePiece p_i852_1_, AtomicReference<VoxelShape> p_i852_2_, int p_i852_3_, int p_i852_4_)
        {
            this.villagePiece = p_i852_1_;
            this.field_214877_b = p_i852_2_;
            this.field_214878_c = p_i852_3_;
            this.field_214879_d = p_i852_4_;
        }
    }

    public interface IPieceFactory
    {
        AbstractVillagePiece create(TemplateManager p_create_1_, JigsawPiece p_create_2_, BlockPos p_create_3_, int p_create_4_, Rotation p_create_5_, MutableBoundingBox p_create_6_);
    }
}
