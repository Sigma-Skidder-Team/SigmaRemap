// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class156 implements Class122
{
    private static final Logger field456;
    private final ResourceLocation field457;
    
    public Class156(final ResourceLocation field457) {
        this.field457 = field457;
    }
    
    @Override
    public void method636(final Class7790 class7790) {
        if (!class7790.method25019(this.field457)) {
            super.method636(class7790);
            final Class122 method25023 = class7790.method25023(this.field457);
            if (method25023 != null) {
                method25023.method636(class7790.method25016(".{" + this.field457 + "}", this.field457));
            }
            else {
                class7790.method25014("Unknown condition table called " + this.field457);
            }
        }
        else {
            class7790.method25014("Condition " + this.field457 + " is recursively called");
        }
    }
    
    @Override
    public boolean test(final Class7529 class7529) {
        final Class122 method23585 = class7529.method23585(this.field457);
        if (class7529.method23582(method23585)) {
            boolean test;
            try {
                test = method23585.test(class7529);
            }
            finally {
                class7529.method23583(method23585);
            }
            return test;
        }
        Class156.field456.warn("Detected infinite loop in loot tables");
        return false;
    }
    
    static {
        field456 = LogManager.getLogger();
    }
}
