// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class9215
{
    private static final Logger field39027;
    private final Class852 field39028;
    private final Class5783[] field39029;
    private Class5783 field39030;
    
    public Class9215(final Class852 field39028) {
        this.field39029 = new Class5783[Class7193.method22079()];
        this.field39028 = field39028;
        this.method33696(Class7193.field27958);
    }
    
    public void method33696(final Class7193<?> class7193) {
        if (this.field39030 == null || class7193 != this.field39030.method17253()) {
            if (this.field39030 != null) {
                this.field39030.method17250();
            }
            this.field39030 = this.method33698(class7193);
            if (!this.field39028.world.field10067) {
                this.field39028.method1650().set(Class852.field4530, class7193.method22077());
            }
            Class9215.field39027.debug("Dragon is now in phase {} on the {}", (Object)class7193, (Object)(this.field39028.world.field10067 ? "client" : "server"));
            this.field39030.method17249();
        }
    }
    
    public Class5783 method33697() {
        return this.field39030;
    }
    
    public <T extends Class5783> T method33698(final Class7193<T> class7193) {
        final int method22077 = class7193.method22077();
        if (this.field39029[method22077] == null) {
            this.field39029[method22077] = class7193.method22075(this.field39028);
        }
        return (T)this.field39029[method22077];
    }
    
    static {
        field39027 = LogManager.getLogger();
    }
}
