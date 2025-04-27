// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class CancellableEvent implements IEvent, ICancellableEvent
{
    public boolean cancelled;
    
    public CancellableEvent() {
        this.cancelled = false;
    }
    
    @Override
    public boolean setCancelled(final boolean cancelled) {
        return this.cancelled = cancelled;
    }
    
    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }
}
