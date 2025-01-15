package net.minecraft.client.gui;

import net.minecraft.network.play.server.SUpdateBossInfoPacket;
import net.minecraft.util.Util;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.BossInfo;

public class ClientBossInfo extends BossInfo
{
    protected float rawPercent;
    protected long percentSetTime;

    public ClientBossInfo(SUpdateBossInfoPacket p_i1180_1_)
    {
        super(p_i1180_1_.getUniqueId(), p_i1180_1_.getName(), p_i1180_1_.getColor(), p_i1180_1_.getOverlay());
        this.rawPercent = p_i1180_1_.getPercent();
        this.percent = p_i1180_1_.getPercent();
        this.percentSetTime = Util.milliTime();
        this.setDarkenSky(p_i1180_1_.shouldDarkenSky());
        this.setPlayEndBossMusic(p_i1180_1_.shouldPlayEndBossMusic());
        this.setCreateFog(p_i1180_1_.shouldCreateFog());
    }

    public void setPercent(float percentIn)
    {
        this.percent = this.getPercent();
        this.rawPercent = percentIn;
        this.percentSetTime = Util.milliTime();
    }

    public float getPercent()
    {
        long i = Util.milliTime() - this.percentSetTime;
        float f = MathHelper.clamp((float)i / 100.0F, 0.0F, 1.0F);
        return MathHelper.lerp(f, this.percent, this.rawPercent);
    }

    public void updateFromPacket(SUpdateBossInfoPacket packetIn)
    {
        switch (packetIn.getOperation())
        {
            case UPDATE_NAME:
                this.setName(packetIn.getName());
                break;

            case UPDATE_PCT:
                this.setPercent(packetIn.getPercent());
                break;

            case UPDATE_STYLE:
                this.setColor(packetIn.getColor());
                this.setOverlay(packetIn.getOverlay());
                break;

            case UPDATE_PROPERTIES:
                this.setDarkenSky(packetIn.shouldDarkenSky());
                this.setPlayEndBossMusic(packetIn.shouldPlayEndBossMusic());
        }
    }
}
