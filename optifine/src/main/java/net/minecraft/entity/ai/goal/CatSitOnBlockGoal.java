package net.minecraft.entity.ai.goal;

import net.minecraft.block.BedBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FurnaceBlock;
import net.minecraft.entity.passive.CatEntity;
import net.minecraft.state.properties.BedPart;
import net.minecraft.tags.BlockTags;
import net.minecraft.tileentity.ChestTileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;

public class CatSitOnBlockGoal extends MoveToBlockGoal
{
    private final CatEntity field_220728_g;

    public CatSitOnBlockGoal(CatEntity p_i2863_1_, double p_i2863_2_)
    {
        super(p_i2863_1_, p_i2863_2_, 8);
        this.field_220728_g = p_i2863_1_;
    }

    public boolean shouldExecute()
    {
        return this.field_220728_g.isTamed() && !this.field_220728_g.isSitting() && super.shouldExecute();
    }

    public void startExecuting()
    {
        super.startExecuting();
        this.field_220728_g.getAISit().setSitting(false);
    }

    public void resetTask()
    {
        super.resetTask();
        this.field_220728_g.setSitting(false);
    }

    public void tick()
    {
        super.tick();
        this.field_220728_g.getAISit().setSitting(false);

        if (!this.getIsAboveDestination())
        {
            this.field_220728_g.setSitting(false);
        }
        else if (!this.field_220728_g.isSitting())
        {
            this.field_220728_g.setSitting(true);
        }
    }

    protected boolean shouldMoveTo(IWorldReader worldIn, BlockPos pos)
    {
        if (!worldIn.isAirBlock(pos.up()))
        {
            return false;
        }
        else
        {
            BlockState blockstate = worldIn.getBlockState(pos);
            Block block = blockstate.getBlock();

            if (block == Blocks.CHEST)
            {
                return ChestTileEntity.getPlayersUsing(worldIn, pos) < 1;
            }
            else if (block == Blocks.FURNACE && blockstate.get(FurnaceBlock.LIT))
            {
                return true;
            }
            else
            {
                return block.isIn(BlockTags.BEDS) && blockstate.get(BedBlock.PART) != BedPart.HEAD;
            }
        }
    }
}
