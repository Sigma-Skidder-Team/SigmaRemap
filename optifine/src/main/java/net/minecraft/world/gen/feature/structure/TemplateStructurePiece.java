package net.minecraft.world.gen.feature.structure;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Random;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.command.arguments.BlockStateParser;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.state.properties.StructureMode;
import net.minecraft.util.Direction;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.template.PlacementSettings;
import net.minecraft.world.gen.feature.template.Template;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class TemplateStructurePiece extends StructurePiece
{
    private static final Logger LOGGER = LogManager.getLogger();
    protected Template template;
    protected PlacementSettings placeSettings;
    protected BlockPos templatePosition;

    public TemplateStructurePiece(IStructurePieceType p_i4114_1_, int p_i4114_2_)
    {
        super(p_i4114_1_, p_i4114_2_);
    }

    public TemplateStructurePiece(IStructurePieceType p_i4115_1_, CompoundNBT p_i4115_2_)
    {
        super(p_i4115_1_, p_i4115_2_);
        this.templatePosition = new BlockPos(p_i4115_2_.getInt("TPX"), p_i4115_2_.getInt("TPY"), p_i4115_2_.getInt("TPZ"));
    }

    protected void setup(Template templateIn, BlockPos pos, PlacementSettings settings)
    {
        this.template = templateIn;
        this.setCoordBaseMode(Direction.NORTH);
        this.templatePosition = pos;
        this.placeSettings = settings;
        this.boundingBox = templateIn.getMutableBoundingBox(settings, pos);
    }

    protected void readAdditional(CompoundNBT tagCompound)
    {
        tagCompound.putInt("TPX", this.templatePosition.getX());
        tagCompound.putInt("TPY", this.templatePosition.getY());
        tagCompound.putInt("TPZ", this.templatePosition.getZ());
    }

    public boolean func_225577_a_(IWorld p_225577_1_, ChunkGenerator<?> p_225577_2_, Random p_225577_3_, MutableBoundingBox p_225577_4_, ChunkPos p_225577_5_)
    {
        this.placeSettings.setBoundingBox(p_225577_4_);
        this.boundingBox = this.template.getMutableBoundingBox(this.placeSettings, this.templatePosition);

        if (this.template.addBlocksToWorld(p_225577_1_, this.templatePosition, this.placeSettings, 2))
        {
            for (Template.BlockInfo template$blockinfo : this.template.func_215381_a(this.templatePosition, this.placeSettings, Blocks.STRUCTURE_BLOCK))
            {
                if (template$blockinfo.nbt != null)
                {
                    StructureMode structuremode = StructureMode.valueOf(template$blockinfo.nbt.getString("mode"));

                    if (structuremode == StructureMode.DATA)
                    {
                        this.handleDataMarker(template$blockinfo.nbt.getString("metadata"), template$blockinfo.pos, p_225577_1_, p_225577_3_, p_225577_4_);
                    }
                }
            }

            for (Template.BlockInfo template$blockinfo1 : this.template.func_215381_a(this.templatePosition, this.placeSettings, Blocks.JIGSAW))
            {
                if (template$blockinfo1.nbt != null)
                {
                    String s = template$blockinfo1.nbt.getString("final_state");
                    BlockStateParser blockstateparser = new BlockStateParser(new StringReader(s), false);
                    BlockState blockstate = Blocks.AIR.getDefaultState();

                    try
                    {
                        blockstateparser.parse(true);
                        BlockState blockstate1 = blockstateparser.getState();

                        if (blockstate1 != null)
                        {
                            blockstate = blockstate1;
                        }
                        else
                        {
                            LOGGER.error("Error while parsing blockstate {} in jigsaw block @ {}", s, template$blockinfo1.pos);
                        }
                    }
                    catch (CommandSyntaxException var14)
                    {
                        LOGGER.error("Error while parsing blockstate {} in jigsaw block @ {}", s, template$blockinfo1.pos);
                    }

                    p_225577_1_.setBlockState(template$blockinfo1.pos, blockstate, 3);
                }
            }
        }

        return true;
    }

    protected abstract void handleDataMarker(String function, BlockPos pos, IWorld worldIn, Random rand, MutableBoundingBox sbb);

    public void offset(int x, int y, int z)
    {
        super.offset(x, y, z);
        this.templatePosition = this.templatePosition.add(x, y, z);
    }

    public Rotation getRotation()
    {
        return this.placeSettings.getRotation();
    }
}
