package net.minecraft.pathfinding;

import net.minecraft.entity.Entity;
import net.minecraft.entity.MobEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ClimberPathNavigator extends GroundPathNavigator
{
    private BlockPos targetPosition;

    public ClimberPathNavigator(MobEntity p_i1833_1_, World p_i1833_2_)
    {
        super(p_i1833_1_, p_i1833_2_);
    }

    public Path getPathToPos(BlockPos pos, int p_179680_2_)
    {
        this.targetPosition = pos;
        return super.getPathToPos(pos, p_179680_2_);
    }

    public Path getPathToEntity(Entity entityIn, int p_75494_2_)
    {
        this.targetPosition = new BlockPos(entityIn);
        return super.getPathToEntity(entityIn, p_75494_2_);
    }

    public boolean tryMoveToEntityLiving(Entity entityIn, double speedIn)
    {
        Path path = this.getPathToEntity(entityIn, 0);

        if (path != null)
        {
            return this.setPath(path, speedIn);
        }
        else
        {
            this.targetPosition = new BlockPos(entityIn);
            this.speed = speedIn;
            return true;
        }
    }

    public void tick()
    {
        if (!this.noPath())
        {
            super.tick();
        }
        else
        {
            if (this.targetPosition != null)
            {
                if (!this.targetPosition.withinDistance(this.entity.getPositionVec(), (double)this.entity.getWidth()) && (!(this.entity.getPosY() > (double)this.targetPosition.getY()) || !(new BlockPos((double)this.targetPosition.getX(), this.entity.getPosY(), (double)this.targetPosition.getZ())).withinDistance(this.entity.getPositionVec(), (double)this.entity.getWidth())))
                {
                    this.entity.getMoveHelper().setMoveTo((double)this.targetPosition.getX(), (double)this.targetPosition.getY(), (double)this.targetPosition.getZ(), this.speed);
                }
                else
                {
                    this.targetPosition = null;
                }
            }
        }
    }
}
