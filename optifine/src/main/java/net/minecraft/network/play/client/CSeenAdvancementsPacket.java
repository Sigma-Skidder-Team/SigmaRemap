package net.minecraft.network.play.client;

import java.io.IOException;
import javax.annotation.Nullable;
import net.minecraft.advancements.Advancement;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.IServerPlayNetHandler;
import net.minecraft.util.ResourceLocation;

public class CSeenAdvancementsPacket implements IPacket<IServerPlayNetHandler>
{
    private CSeenAdvancementsPacket.Action action;
    private ResourceLocation tab;

    public CSeenAdvancementsPacket()
    {
    }

    public CSeenAdvancementsPacket(CSeenAdvancementsPacket.Action p_i911_1_, @Nullable ResourceLocation p_i911_2_)
    {
        this.action = p_i911_1_;
        this.tab = p_i911_2_;
    }

    public static CSeenAdvancementsPacket openedTab(Advancement p_194163_0_)
    {
        return new CSeenAdvancementsPacket(CSeenAdvancementsPacket.Action.OPENED_TAB, p_194163_0_.getId());
    }

    public static CSeenAdvancementsPacket closedScreen()
    {
        return new CSeenAdvancementsPacket(CSeenAdvancementsPacket.Action.CLOSED_SCREEN, (ResourceLocation)null);
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.action = buf.readEnumValue(CSeenAdvancementsPacket.Action.class);

        if (this.action == CSeenAdvancementsPacket.Action.OPENED_TAB)
        {
            this.tab = buf.readResourceLocation();
        }
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeEnumValue(this.action);

        if (this.action == CSeenAdvancementsPacket.Action.OPENED_TAB)
        {
            buf.writeResourceLocation(this.tab);
        }
    }

    public void processPacket(IServerPlayNetHandler handler)
    {
        handler.handleSeenAdvancements(this);
    }

    public CSeenAdvancementsPacket.Action getAction()
    {
        return this.action;
    }

    public ResourceLocation getTab()
    {
        return this.tab;
    }

    public static enum Action
    {
        OPENED_TAB,
        CLOSED_SCREEN;
    }
}
