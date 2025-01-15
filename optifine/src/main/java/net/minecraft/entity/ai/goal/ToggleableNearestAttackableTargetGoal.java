package net.minecraft.entity.ai.goal;

import java.util.function.Predicate;
import javax.annotation.Nullable;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.monster.AbstractRaiderEntity;

public class ToggleableNearestAttackableTargetGoal<T extends LivingEntity> extends NearestAttackableTargetGoal<T>
{
    private boolean field_220784_i = true;

    public ToggleableNearestAttackableTargetGoal(AbstractRaiderEntity p_i3226_1_, Class<T> p_i3226_2_, int p_i3226_3_, boolean p_i3226_4_, boolean p_i3226_5_, @Nullable Predicate<LivingEntity> p_i3226_6_)
    {
        super(p_i3226_1_, p_i3226_2_, p_i3226_3_, p_i3226_4_, p_i3226_5_, p_i3226_6_);
    }

    public void func_220783_a(boolean p_220783_1_)
    {
        this.field_220784_i = p_220783_1_;
    }

    public boolean shouldExecute()
    {
        return this.field_220784_i && super.shouldExecute();
    }
}
