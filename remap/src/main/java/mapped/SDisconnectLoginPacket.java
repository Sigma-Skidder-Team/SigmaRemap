// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

import java.io.IOException;

public class SDisconnectLoginPacket implements IPacket<IClientLoginNetHandler>
{
    private static String[] field19186;
    private ITextComponent reason;
    
    public SDisconnectLoginPacket() {
    }
    
    public SDisconnectLoginPacket(final ITextComponent reason) {
        this.reason = reason;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.reason = Class5953.method17873(class8654.readString(262144));
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeTextComponent(this.reason);
    }
    
    public void processPacket(final IClientLoginNetHandler IClientLoginNetHandler) {
        IClientLoginNetHandler.handleDisconnect(this);
    }
    
    public ITextComponent getReason() {
        return this.reason;
    }
}
