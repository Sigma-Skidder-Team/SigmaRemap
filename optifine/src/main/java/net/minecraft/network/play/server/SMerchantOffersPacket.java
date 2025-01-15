package net.minecraft.network.play.server;

import java.io.IOException;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.item.MerchantOffers;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;

public class SMerchantOffersPacket implements IPacket<IClientPlayNetHandler>
{
    private int containerId;
    private MerchantOffers offers;
    private int level;
    private int xp;
    private boolean field_218740_e;
    private boolean field_223478_f;

    public SMerchantOffersPacket()
    {
    }

    public SMerchantOffersPacket(int p_i3041_1_, MerchantOffers p_i3041_2_, int p_i3041_3_, int p_i3041_4_, boolean p_i3041_5_, boolean p_i3041_6_)
    {
        this.containerId = p_i3041_1_;
        this.offers = p_i3041_2_;
        this.level = p_i3041_3_;
        this.xp = p_i3041_4_;
        this.field_218740_e = p_i3041_5_;
        this.field_223478_f = p_i3041_6_;
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.containerId = buf.readVarInt();
        this.offers = MerchantOffers.read(buf);
        this.level = buf.readVarInt();
        this.xp = buf.readVarInt();
        this.field_218740_e = buf.readBoolean();
        this.field_223478_f = buf.readBoolean();
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeVarInt(this.containerId);
        this.offers.write(buf);
        buf.writeVarInt(this.level);
        buf.writeVarInt(this.xp);
        buf.writeBoolean(this.field_218740_e);
        buf.writeBoolean(this.field_223478_f);
    }

    public void processPacket(IClientPlayNetHandler handler)
    {
        handler.handleMerchantOffers(this);
    }

    public int getContainerId()
    {
        return this.containerId;
    }

    public MerchantOffers getOffers()
    {
        return this.offers;
    }

    public int getLevel()
    {
        return this.level;
    }

    public int getExp()
    {
        return this.xp;
    }

    public boolean func_218735_f()
    {
        return this.field_218740_e;
    }

    public boolean func_223477_g()
    {
        return this.field_223478_f;
    }
}
