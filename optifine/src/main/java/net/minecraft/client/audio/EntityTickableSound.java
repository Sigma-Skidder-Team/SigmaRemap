package net.minecraft.client.audio;

import net.minecraft.entity.Entity;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;

public class EntityTickableSound extends TickableSound
{
    private final Entity field_217863_o;

    public EntityTickableSound(SoundEvent p_i2620_1_, SoundCategory p_i2620_2_, Entity p_i2620_3_)
    {
        this(p_i2620_1_, p_i2620_2_, 1.0F, 1.0F, p_i2620_3_);
    }

    public EntityTickableSound(SoundEvent p_i2621_1_, SoundCategory p_i2621_2_, float p_i2621_3_, float p_i2621_4_, Entity p_i2621_5_)
    {
        super(p_i2621_1_, p_i2621_2_);
        this.volume = p_i2621_3_;
        this.pitch = p_i2621_4_;
        this.field_217863_o = p_i2621_5_;
        this.x = (float)this.field_217863_o.getPosX();
        this.y = (float)this.field_217863_o.getPosY();
        this.z = (float)this.field_217863_o.getPosZ();
    }

    public void tick()
    {
        if (this.field_217863_o.removed)
        {
            this.donePlaying = true;
        }
        else
        {
            this.x = (float)this.field_217863_o.getPosX();
            this.y = (float)this.field_217863_o.getPosY();
            this.z = (float)this.field_217863_o.getPosZ();
        }
    }
}
