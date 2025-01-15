// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.List;

public class Class9567
{
    private static String[] field41165;
    private final List<ConcurrentLinkedQueue<Class7531>> field41166;
    private volatile int field41167;
    private volatile int field41168;
    private volatile int field41169;
    
    public Class9567() {
        this.field41166 = (List<ConcurrentLinkedQueue<Class7531>>)ImmutableList.of((Object)new ConcurrentLinkedQueue(), (Object)new ConcurrentLinkedQueue(), (Object)new ConcurrentLinkedQueue(), (Object)new ConcurrentLinkedQueue());
        final int n = this.field41169 + 1;
        this.field41168 = n;
        this.field41167 = n;
    }
}
