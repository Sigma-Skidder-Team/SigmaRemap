package net.minecraft.block;

import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.block.material.PushReaction;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class PistonBlockStructureHelper
{
    private final World world;
    private final BlockPos pistonPos;
    private final boolean extending;
    private final BlockPos blockToMove;
    private final Direction moveDirection;
    private final List<BlockPos> toMove = Lists.newArrayList();
    private final List<BlockPos> toDestroy = Lists.newArrayList();
    private final Direction facing;

    public PistonBlockStructureHelper(World p_i2544_1_, BlockPos p_i2544_2_, Direction p_i2544_3_, boolean p_i2544_4_)
    {
        this.world = p_i2544_1_;
        this.pistonPos = p_i2544_2_;
        this.facing = p_i2544_3_;
        this.extending = p_i2544_4_;

        if (p_i2544_4_)
        {
            this.moveDirection = p_i2544_3_;
            this.blockToMove = p_i2544_2_.offset(p_i2544_3_);
        }
        else
        {
            this.moveDirection = p_i2544_3_.getOpposite();
            this.blockToMove = p_i2544_2_.offset(p_i2544_3_, 2);
        }
    }

    public boolean canMove()
    {
        this.toMove.clear();
        this.toDestroy.clear();
        BlockState blockstate = this.world.getBlockState(this.blockToMove);

        if (!PistonBlock.canPush(blockstate, this.world, this.blockToMove, this.moveDirection, false, this.facing))
        {
            if (this.extending && blockstate.getPushReaction() == PushReaction.DESTROY)
            {
                this.toDestroy.add(this.blockToMove);
                return true;
            }
            else
            {
                return false;
            }
        }
        else if (!this.addBlockLine(this.blockToMove, this.moveDirection))
        {
            return false;
        }
        else
        {
            for (int i = 0; i < this.toMove.size(); ++i)
            {
                BlockPos blockpos = this.toMove.get(i);

                if (func_227029_a_(this.world.getBlockState(blockpos).getBlock()) && !this.addBranchingBlocks(blockpos))
                {
                    return false;
                }
            }

            return true;
        }
    }

    private static boolean func_227029_a_(Block p_227029_0_)
    {
        return p_227029_0_ == Blocks.SLIME_BLOCK || p_227029_0_ == Blocks.HONEY_BLOCK;
    }

    private static boolean func_227030_a_(Block p_227030_0_, Block p_227030_1_)
    {
        if (p_227030_0_ == Blocks.HONEY_BLOCK && p_227030_1_ == Blocks.SLIME_BLOCK)
        {
            return false;
        }
        else if (p_227030_0_ == Blocks.SLIME_BLOCK && p_227030_1_ == Blocks.HONEY_BLOCK)
        {
            return false;
        }
        else
        {
            return func_227029_a_(p_227030_0_) || func_227029_a_(p_227030_1_);
        }
    }

    private boolean addBlockLine(BlockPos origin, Direction facingIn)
    {
        BlockState blockstate = this.world.getBlockState(origin);
        Block block = blockstate.getBlock();

        if (blockstate.isAir())
        {
            return true;
        }
        else if (!PistonBlock.canPush(blockstate, this.world, origin, this.moveDirection, false, facingIn))
        {
            return true;
        }
        else if (origin.equals(this.pistonPos))
        {
            return true;
        }
        else if (this.toMove.contains(origin))
        {
            return true;
        }
        else
        {
            int i = 1;

            if (i + this.toMove.size() > 12)
            {
                return false;
            }
            else
            {
                while (func_227029_a_(block))
                {
                    BlockPos blockpos = origin.offset(this.moveDirection.getOpposite(), i);
                    Block block1 = block;
                    blockstate = this.world.getBlockState(blockpos);
                    block = blockstate.getBlock();

                    if (blockstate.isAir() || !func_227030_a_(block1, block) || !PistonBlock.canPush(blockstate, this.world, blockpos, this.moveDirection, false, this.moveDirection.getOpposite()) || blockpos.equals(this.pistonPos))
                    {
                        break;
                    }

                    ++i;

                    if (i + this.toMove.size() > 12)
                    {
                        return false;
                    }
                }

                int l = 0;

                for (int i1 = i - 1; i1 >= 0; --i1)
                {
                    this.toMove.add(origin.offset(this.moveDirection.getOpposite(), i1));
                    ++l;
                }

                int j1 = 1;

                while (true)
                {
                    BlockPos blockpos1 = origin.offset(this.moveDirection, j1);
                    int j = this.toMove.indexOf(blockpos1);

                    if (j > -1)
                    {
                        this.reorderListAtCollision(l, j);

                        for (int k = 0; k <= j + l; ++k)
                        {
                            BlockPos blockpos2 = this.toMove.get(k);

                            if (func_227029_a_(this.world.getBlockState(blockpos2).getBlock()) && !this.addBranchingBlocks(blockpos2))
                            {
                                return false;
                            }
                        }

                        return true;
                    }

                    blockstate = this.world.getBlockState(blockpos1);

                    if (blockstate.isAir())
                    {
                        return true;
                    }

                    if (!PistonBlock.canPush(blockstate, this.world, blockpos1, this.moveDirection, true, this.moveDirection) || blockpos1.equals(this.pistonPos))
                    {
                        return false;
                    }

                    if (blockstate.getPushReaction() == PushReaction.DESTROY)
                    {
                        this.toDestroy.add(blockpos1);
                        return true;
                    }

                    if (this.toMove.size() >= 12)
                    {
                        return false;
                    }

                    this.toMove.add(blockpos1);
                    ++l;
                    ++j1;
                }
            }
        }
    }

    private void reorderListAtCollision(int p_177255_1_, int p_177255_2_)
    {
        List<BlockPos> list = Lists.newArrayList();
        List<BlockPos> list1 = Lists.newArrayList();
        List<BlockPos> list2 = Lists.newArrayList();
        list.addAll(this.toMove.subList(0, p_177255_2_));
        list1.addAll(this.toMove.subList(this.toMove.size() - p_177255_1_, this.toMove.size()));
        list2.addAll(this.toMove.subList(p_177255_2_, this.toMove.size() - p_177255_1_));
        this.toMove.clear();
        this.toMove.addAll(list);
        this.toMove.addAll(list1);
        this.toMove.addAll(list2);
    }

    private boolean addBranchingBlocks(BlockPos fromPos)
    {
        BlockState blockstate = this.world.getBlockState(fromPos);

        for (Direction direction : Direction.values())
        {
            if (direction.getAxis() != this.moveDirection.getAxis())
            {
                BlockPos blockpos = fromPos.offset(direction);
                BlockState blockstate1 = this.world.getBlockState(blockpos);

                if (func_227030_a_(blockstate1.getBlock(), blockstate.getBlock()) && !this.addBlockLine(blockpos, direction))
                {
                    return false;
                }
            }
        }

        return true;
    }

    public List<BlockPos> getBlocksToMove()
    {
        return this.toMove;
    }

    public List<BlockPos> getBlocksToDestroy()
    {
        return this.toDestroy;
    }
}
