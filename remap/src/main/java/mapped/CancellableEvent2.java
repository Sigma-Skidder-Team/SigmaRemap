// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class CancellableEvent2 implements ICancellableEvent, IEvent {
    public boolean cancelled;
    
    public CancellableEvent2() {
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
