// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;

public final class Class8815 implements Class8814
{
    public final /* synthetic */ Map field37023;
    
    public Class8815(final Map field37023) {
        this.field37023 = field37023;
    }
    
    @Override
    public void method30752(final Class8153 class8153, final Class8215 class8154) {
        synchronized (this.field37023) {
            this.field37023.put("Response", class8154);
            this.field37023.notifyAll();
        }
    }
    
    @Override
    public void method30753(final Class8153 class8153, final Exception ex) {
        synchronized (this.field37023) {
            this.field37023.put("Exception", ex);
            this.field37023.notifyAll();
        }
    }
}
