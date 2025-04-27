// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashSet;
import java.util.Set;

public class DeferredEventRegistry {
    public static final Set<Object> pendingRegistrations = new HashSet<>();
    public static volatile boolean modulesLoaded = false;
}
