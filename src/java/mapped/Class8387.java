// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8387
{
    private final boolean field34380;
    private final boolean field34381;
    private final boolean field34382;
    
    public Class8387(final boolean field34380, final boolean field34381, final boolean field34382) {
        this.field34380 = field34380;
        this.field34381 = field34381;
        this.field34382 = field34382;
    }
    
    public boolean method27955() {
        return this.field34380;
    }
    
    public boolean method27956() {
        return this.field34381;
    }
    
    public boolean method27957() {
        return this.field34382;
    }
    
    @Override
    public String toString() {
        return "TripwireConnectionHandler.TripwireData(attached=" + this.method27955() + ", disarmed=" + this.method27956() + ", powered=" + this.method27957() + ")";
    }
}
