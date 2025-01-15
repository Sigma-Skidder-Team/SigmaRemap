package net.minecraft.entity.ai.brain.task;

import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.LivingEntity;
import net.minecraft.world.server.ServerWorld;

public class DummyTask extends Task<LivingEntity>
{
    public DummyTask(int p_i577_1_, int p_i577_2_)
    {
        super(ImmutableMap.of(), p_i577_1_, p_i577_2_);
    }

    protected boolean shouldContinueExecuting(ServerWorld worldIn, LivingEntity entityIn, long gameTimeIn)
    {
        return true;
    }
}
