package net.minecraft.client.audio;

import net.minecraft.entity.passive.BeeEntity;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;

public class BeeAngrySound extends BeeSound
{
    public BeeAngrySound(BeeEntity p_i1572_1_)
    {
        super(p_i1572_1_, SoundEvents.field_226126_aa_, SoundCategory.NEUTRAL);
        this.repeatDelay = 0;
    }

    protected TickableSound func_225642_o_()
    {
        return new BeeFlightSound(this.field_229357_o_);
    }

    protected boolean func_225643_p_()
    {
        return !this.field_229357_o_.func_226427_ez_();
    }
}
