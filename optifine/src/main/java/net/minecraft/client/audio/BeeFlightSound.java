package net.minecraft.client.audio;

import net.minecraft.entity.passive.BeeEntity;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;

public class BeeFlightSound extends BeeSound
{
    public BeeFlightSound(BeeEntity p_i445_1_)
    {
        super(p_i445_1_, SoundEvents.field_226127_ab_, SoundCategory.NEUTRAL);
    }

    protected TickableSound func_225642_o_()
    {
        return new BeeAngrySound(this.field_229357_o_);
    }

    protected boolean func_225643_p_()
    {
        return this.field_229357_o_.func_226427_ez_();
    }
}
