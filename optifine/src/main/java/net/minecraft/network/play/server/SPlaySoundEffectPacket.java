package net.minecraft.network.play.server;

import java.io.IOException;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.registry.Registry;
import org.apache.commons.lang3.Validate;

public class SPlaySoundEffectPacket implements IPacket<IClientPlayNetHandler>
{
    private SoundEvent sound;
    private SoundCategory category;
    private int posX;
    private int posY;
    private int posZ;
    private float soundVolume;
    private float soundPitch;

    public SPlaySoundEffectPacket()
    {
    }

    public SPlaySoundEffectPacket(SoundEvent p_i393_1_, SoundCategory p_i393_2_, double p_i393_3_, double p_i393_5_, double p_i393_7_, float p_i393_9_, float p_i393_10_)
    {
        Validate.notNull(p_i393_1_, "sound");
        this.sound = p_i393_1_;
        this.category = p_i393_2_;
        this.posX = (int)(p_i393_3_ * 8.0D);
        this.posY = (int)(p_i393_5_ * 8.0D);
        this.posZ = (int)(p_i393_7_ * 8.0D);
        this.soundVolume = p_i393_9_;
        this.soundPitch = p_i393_10_;
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.sound = Registry.SOUND_EVENT.getByValue(buf.readVarInt());
        this.category = buf.readEnumValue(SoundCategory.class);
        this.posX = buf.readInt();
        this.posY = buf.readInt();
        this.posZ = buf.readInt();
        this.soundVolume = buf.readFloat();
        this.soundPitch = buf.readFloat();
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeVarInt(Registry.SOUND_EVENT.getId(this.sound));
        buf.writeEnumValue(this.category);
        buf.writeInt(this.posX);
        buf.writeInt(this.posY);
        buf.writeInt(this.posZ);
        buf.writeFloat(this.soundVolume);
        buf.writeFloat(this.soundPitch);
    }

    public SoundEvent getSound()
    {
        return this.sound;
    }

    public SoundCategory getCategory()
    {
        return this.category;
    }

    public double getX()
    {
        return (double)((float)this.posX / 8.0F);
    }

    public double getY()
    {
        return (double)((float)this.posY / 8.0F);
    }

    public double getZ()
    {
        return (double)((float)this.posZ / 8.0F);
    }

    public float getVolume()
    {
        return this.soundVolume;
    }

    public float getPitch()
    {
        return this.soundPitch;
    }

    public void processPacket(IClientPlayNetHandler handler)
    {
        handler.handleSoundEffect(this);
    }
}
