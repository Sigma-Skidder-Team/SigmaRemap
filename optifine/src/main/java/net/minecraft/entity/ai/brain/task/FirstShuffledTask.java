package net.minecraft.entity.ai.brain.task;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.brain.memory.MemoryModuleStatus;
import net.minecraft.entity.ai.brain.memory.MemoryModuleType;

public class FirstShuffledTask<E extends LivingEntity> extends MultiTask<E>
{
    public FirstShuffledTask(List < Pair < Task <? super E > , Integer >> p_i2198_1_)
    {
        this(ImmutableMap.of(), p_i2198_1_);
    }

    public FirstShuffledTask(Map < MemoryModuleType<?>, MemoryModuleStatus > p_i2199_1_, List < Pair < Task <? super E > , Integer >> p_i2199_2_)
    {
        super(p_i2199_1_, ImmutableSet.of(), MultiTask.Ordering.SHUFFLED, MultiTask.RunType.RUN_ONE, p_i2199_2_);
    }
}
