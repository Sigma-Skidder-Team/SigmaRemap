// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class DeferredFalseState extends DeferredEventState {

    public DeferredFalseState(final String name) {
        super(name);
    }

    @Override
    public boolean shouldDefer() {
        return false;
    }
}
