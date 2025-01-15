package net.minecraft.entity.ai.goal;

import javax.annotation.Nullable;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.ai.RandomPositionGenerator;
import net.minecraft.util.math.Vec3d;

public class WaterAvoidingRandomWalkingGoal extends RandomWalkingGoal
{
    protected final float probability;

    public WaterAvoidingRandomWalkingGoal(CreatureEntity p_i967_1_, double p_i967_2_)
    {
        this(p_i967_1_, p_i967_2_, 0.001F);
    }

    public WaterAvoidingRandomWalkingGoal(CreatureEntity p_i968_1_, double p_i968_2_, float p_i968_4_)
    {
        super(p_i968_1_, p_i968_2_);
        this.probability = p_i968_4_;
    }

    @Nullable
    protected Vec3d getPosition()
    {
        if (this.creature.isInWaterOrBubbleColumn())
        {
            Vec3d vec3d = RandomPositionGenerator.getLandPos(this.creature, 15, 7);
            return vec3d == null ? super.getPosition() : vec3d;
        }
        else
        {
            return this.creature.getRNG().nextFloat() >= this.probability ? RandomPositionGenerator.getLandPos(this.creature, 10, 7) : super.getPosition();
        }
    }
}
