// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class EventReceivePacket extends CancellableEvent2
{
    private IPacket<?> packet;
    
    public EventReceivePacket(final IPacket<?> packet) {
        this.packet = packet;
    }
    
    public IPacket getPacket() {
        return this.packet;
    }
    
    public void setPacket(final IPacket field23275) {
        this.packet = field23275;
    }
}
