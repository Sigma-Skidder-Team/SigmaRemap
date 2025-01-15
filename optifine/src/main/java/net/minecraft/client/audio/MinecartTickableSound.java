package net.minecraft.client.audio;

import net.minecraft.entity.Entity;
import net.minecraft.entity.item.minecart.AbstractMinecartEntity;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.MathHelper;

public class MinecartTickableSound extends TickableSound
{
    private final AbstractMinecartEntity minecart;
    private float distance = 0.0F;

    public MinecartTickableSound(AbstractMinecartEntity model)
    {
        super(SoundEvents.ENTITY_MINECART_RIDING, SoundCategory.NEUTRAL);
        this.minecart = model;
        this.repeat = true;
        this.repeatDelay = 0;
        this.volume = 0.0F;
        this.x = (float)model.getPosX();
        this.y = (float)model.getPosY();
        this.z = (float)model.getPosZ();
    }

    public boolean canBeSilent()
    {
        return true;
    }

    public void tick()
    {
        if (this.minecart.removed)
        {
            this.donePlaying = true;
        }
        else
        {
            this.x = (float)this.minecart.getPosX();
            this.y = (float)this.minecart.getPosY();
            this.z = (float)this.minecart.getPosZ();
            float f = MathHelper.sqrt(Entity.horizontalMag(this.minecart.getMotion()));

            if ((double)f >= 0.01D)
            {
                this.distance = MathHelper.clamp(this.distance + 0.0025F, 0.0F, 1.0F);
                this.volume = MathHelper.lerp(MathHelper.clamp(f, 0.0F, 0.5F), 0.0F, 0.7F);
            }
            else
            {
                this.distance = 0.0F;
                this.volume = 0.0F;
            }
        }
    }
}
