// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class EventSlowDown extends CancellableEvent
{
    public float slowDown;
    
    public EventSlowDown(final float slowDown) {
        this.slowDown = slowDown;
    }
    
    public float getSlowDown() {
        return this.slowDown;
    }
    
    public void setSlowDown(final float field23283) {
        this.slowDown = field23283;
    }
}
