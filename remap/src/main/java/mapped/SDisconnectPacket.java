// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

import java.io.IOException;

public class SDisconnectPacket implements IPacket<IClientPlayNetHandler>
{
    private ITextComponent reason;
    
    public SDisconnectPacket() {
    }
    
    public SDisconnectPacket(final ITextComponent reason) {
        this.reason = reason;
    }
    
    @Override
    public void readPacketData(final PacketBuffer buf) throws IOException {
        this.reason = buf.readTextComponent();
    }
    
    @Override
    public void writePacketData(final PacketBuffer buf) throws IOException {
        buf.writeTextComponent(this.reason);
    }
    
    public void processPacket(final IClientPlayNetHandler handler) {
        handler.handleDisconnect(this);
    }
    
    public ITextComponent getReason() {
        return this.reason;
    }
}
