// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class EventRenderFire extends CancellableEvent2
{
    private float fireHeight;
    
    public EventRenderFire() {
        this.fireHeight = 1.0f;
    }
    
    public EventRenderFire(final float fireHeight) {
        this.fireHeight = fireHeight;
    }
    
    public void method17053(final float field23335) {
        this.fireHeight = field23335;
    }
    
    public float method17054() {
        return this.fireHeight;
    }
}
