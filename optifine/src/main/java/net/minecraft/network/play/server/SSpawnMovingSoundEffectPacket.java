package net.minecraft.network.play.server;

import java.io.IOException;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.entity.Entity;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.registry.Registry;
import org.apache.commons.lang3.Validate;

public class SSpawnMovingSoundEffectPacket implements IPacket<IClientPlayNetHandler>
{
    private SoundEvent field_218765_a;
    private SoundCategory field_218766_b;
    private int field_218767_c;
    private float field_218768_d;
    private float field_218769_e;

    public SSpawnMovingSoundEffectPacket()
    {
    }

    public SSpawnMovingSoundEffectPacket(SoundEvent p_i3316_1_, SoundCategory p_i3316_2_, Entity p_i3316_3_, float p_i3316_4_, float p_i3316_5_)
    {
        Validate.notNull(p_i3316_1_, "sound");
        this.field_218765_a = p_i3316_1_;
        this.field_218766_b = p_i3316_2_;
        this.field_218767_c = p_i3316_3_.getEntityId();
        this.field_218768_d = p_i3316_4_;
        this.field_218769_e = p_i3316_5_;
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.field_218765_a = Registry.SOUND_EVENT.getByValue(buf.readVarInt());
        this.field_218766_b = buf.readEnumValue(SoundCategory.class);
        this.field_218767_c = buf.readVarInt();
        this.field_218768_d = buf.readFloat();
        this.field_218769_e = buf.readFloat();
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeVarInt(Registry.SOUND_EVENT.getId(this.field_218765_a));
        buf.writeEnumValue(this.field_218766_b);
        buf.writeVarInt(this.field_218767_c);
        buf.writeFloat(this.field_218768_d);
        buf.writeFloat(this.field_218769_e);
    }

    public SoundEvent func_218763_b()
    {
        return this.field_218765_a;
    }

    public SoundCategory func_218760_c()
    {
        return this.field_218766_b;
    }

    public int func_218762_d()
    {
        return this.field_218767_c;
    }

    public float func_218764_e()
    {
        return this.field_218768_d;
    }

    public float func_218761_f()
    {
        return this.field_218769_e;
    }

    public void processPacket(IClientPlayNetHandler handler)
    {
        handler.func_217266_a(this);
    }
}
