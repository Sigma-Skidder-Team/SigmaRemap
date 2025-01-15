package net.minecraft.world.gen.feature.structure;

import java.util.Random;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.Heightmap;

public abstract class ScatteredStructurePiece extends StructurePiece
{
    protected final int width;
    protected final int height;
    protected final int depth;
    protected int hPos = -1;

    protected ScatteredStructurePiece(IStructurePieceType p_i3207_1_, Random p_i3207_2_, int p_i3207_3_, int p_i3207_4_, int p_i3207_5_, int p_i3207_6_, int p_i3207_7_, int p_i3207_8_)
    {
        super(p_i3207_1_, 0);
        this.width = p_i3207_6_;
        this.height = p_i3207_7_;
        this.depth = p_i3207_8_;
        this.setCoordBaseMode(Direction.Plane.HORIZONTAL.random(p_i3207_2_));

        if (this.getCoordBaseMode().getAxis() == Direction.Axis.Z)
        {
            this.boundingBox = new MutableBoundingBox(p_i3207_3_, p_i3207_4_, p_i3207_5_, p_i3207_3_ + p_i3207_6_ - 1, p_i3207_4_ + p_i3207_7_ - 1, p_i3207_5_ + p_i3207_8_ - 1);
        }
        else
        {
            this.boundingBox = new MutableBoundingBox(p_i3207_3_, p_i3207_4_, p_i3207_5_, p_i3207_3_ + p_i3207_8_ - 1, p_i3207_4_ + p_i3207_7_ - 1, p_i3207_5_ + p_i3207_6_ - 1);
        }
    }

    protected ScatteredStructurePiece(IStructurePieceType p_i3208_1_, CompoundNBT p_i3208_2_)
    {
        super(p_i3208_1_, p_i3208_2_);
        this.width = p_i3208_2_.getInt("Width");
        this.height = p_i3208_2_.getInt("Height");
        this.depth = p_i3208_2_.getInt("Depth");
        this.hPos = p_i3208_2_.getInt("HPos");
    }

    protected void readAdditional(CompoundNBT tagCompound)
    {
        tagCompound.putInt("Width", this.width);
        tagCompound.putInt("Height", this.height);
        tagCompound.putInt("Depth", this.depth);
        tagCompound.putInt("HPos", this.hPos);
    }

    protected boolean isInsideBounds(IWorld worldIn, MutableBoundingBox boundsIn, int heightIn)
    {
        if (this.hPos >= 0)
        {
            return true;
        }
        else
        {
            int i = 0;
            int j = 0;
            BlockPos.Mutable blockpos$mutable = new BlockPos.Mutable();

            for (int k = this.boundingBox.minZ; k <= this.boundingBox.maxZ; ++k)
            {
                for (int l = this.boundingBox.minX; l <= this.boundingBox.maxX; ++l)
                {
                    blockpos$mutable.setPos(l, 64, k);

                    if (boundsIn.isVecInside(blockpos$mutable))
                    {
                        i += worldIn.getHeight(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, blockpos$mutable).getY();
                        ++j;
                    }
                }
            }

            if (j == 0)
            {
                return false;
            }
            else
            {
                this.hPos = i / j;
                this.boundingBox.offset(0, this.hPos - this.boundingBox.minY + heightIn, 0);
                return true;
            }
        }
    }
}
