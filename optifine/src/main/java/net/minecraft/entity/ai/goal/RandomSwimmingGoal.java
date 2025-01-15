package net.minecraft.entity.ai.goal;

import javax.annotation.Nullable;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.ai.RandomPositionGenerator;
import net.minecraft.pathfinding.PathType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

public class RandomSwimmingGoal extends RandomWalkingGoal
{
    public RandomSwimmingGoal(CreatureEntity p_i3603_1_, double p_i3603_2_, int p_i3603_4_)
    {
        super(p_i3603_1_, p_i3603_2_, p_i3603_4_);
    }

    @Nullable
    protected Vec3d getPosition()
    {
        Vec3d vec3d = RandomPositionGenerator.findRandomTarget(this.creature, 10, 7);

        for (int i = 0; vec3d != null && !this.creature.world.getBlockState(new BlockPos(vec3d)).allowsMovement(this.creature.world, new BlockPos(vec3d), PathType.WATER) && i++ < 10; vec3d = RandomPositionGenerator.findRandomTarget(this.creature, 10, 7))
        {
            ;
        }

        return vec3d;
    }
}
