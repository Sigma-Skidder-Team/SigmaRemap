// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class DeferredTrueState extends DeferredEventState {
    public DeferredTrueState(final String name) {
        super(name);
    }

    @Override
    public boolean shouldDefer() {
        return true;
    }
}
