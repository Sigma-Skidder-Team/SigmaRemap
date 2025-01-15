// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.netty.util.ResourceLeakDetector$Level;
import io.netty.util.ResourceLeakDetector;

public class Class5016 extends Class5009
{
    @Override
    public String method15225() {
        return "displayleaks";
    }
    
    @Override
    public String method15226() {
        return "Try to hunt memory leaks!";
    }
    
    @Override
    public boolean method15227(final Class7671 class7671, final String[] array) {
        if (ResourceLeakDetector.getLevel() == ResourceLeakDetector$Level.ADVANCED) {
            ResourceLeakDetector.setLevel(ResourceLeakDetector$Level.DISABLED);
        }
        else {
            ResourceLeakDetector.setLevel(ResourceLeakDetector$Level.ADVANCED);
        }
        this.method15234(class7671, "&6Leak detector is now %s", (ResourceLeakDetector.getLevel() != ResourceLeakDetector$Level.ADVANCED) ? "&cdisabled" : "&aenabled");
        return true;
    }
}
