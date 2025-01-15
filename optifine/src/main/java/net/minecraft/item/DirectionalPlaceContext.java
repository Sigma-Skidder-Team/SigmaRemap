package net.minecraft.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class DirectionalPlaceContext extends BlockItemUseContext
{
    private final Direction lookDirection;

    public DirectionalPlaceContext(World p_i3596_1_, BlockPos p_i3596_2_, Direction p_i3596_3_, ItemStack p_i3596_4_, Direction p_i3596_5_)
    {
        super(p_i3596_1_, (PlayerEntity)null, Hand.MAIN_HAND, p_i3596_4_, new BlockRayTraceResult(new Vec3d((double)p_i3596_2_.getX() + 0.5D, (double)p_i3596_2_.getY(), (double)p_i3596_2_.getZ() + 0.5D), p_i3596_5_, p_i3596_2_, false));
        this.lookDirection = p_i3596_3_;
    }

    public BlockPos getPos()
    {
        return this.rayTraceResult.getPos();
    }

    public boolean canPlace()
    {
        return this.world.getBlockState(this.rayTraceResult.getPos()).isReplaceable(this);
    }

    public boolean replacingClickedOnBlock()
    {
        return this.canPlace();
    }

    public Direction getNearestLookingDirection()
    {
        return Direction.DOWN;
    }

    public Direction[] getNearestLookingDirections()
    {
        switch (this.lookDirection)
        {
            case DOWN:
            default:
                return new Direction[] {Direction.DOWN, Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST, Direction.UP};
            case UP:
                return new Direction[] {Direction.DOWN, Direction.UP, Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST};
            case NORTH:
                return new Direction[] {Direction.DOWN, Direction.NORTH, Direction.EAST, Direction.WEST, Direction.UP, Direction.SOUTH};
            case SOUTH:
                return new Direction[] {Direction.DOWN, Direction.SOUTH, Direction.EAST, Direction.WEST, Direction.UP, Direction.NORTH};
            case WEST:
                return new Direction[] {Direction.DOWN, Direction.WEST, Direction.SOUTH, Direction.UP, Direction.NORTH, Direction.EAST};
            case EAST:
                return new Direction[] {Direction.DOWN, Direction.EAST, Direction.SOUTH, Direction.UP, Direction.NORTH, Direction.WEST};
        }
    }

    public Direction getPlacementHorizontalFacing()
    {
        return this.lookDirection.getAxis() == Direction.Axis.Y ? Direction.NORTH : this.lookDirection;
    }

    public boolean func_225518_g_()
    {
        return false;
    }

    public float getPlacementYaw()
    {
        return (float)(this.lookDirection.getHorizontalIndex() * 90);
    }
}
