// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import com.google.common.collect.ImmutableList;
import com.google.common.base.Preconditions;
import java.util.concurrent.Executors;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.util.Map;
import com.google.common.collect.Multimaps;
import java.util.HashSet;
import java.util.IdentityHashMap;
import com.google.common.collect.Multimap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ExecutorService;

public class Class6558 implements Class6557
{
    private final ExecutorService field26047;
    private final ScheduledExecutorService field26048;
    private final Multimap<Object, Class988> field26049;
    
    public Class6558() {
        this.field26049 = (Multimap<Object, Class988>)Multimaps.synchronizedMultimap((Multimap)Multimaps.newSetMultimap(new IdentityHashMap(), HashSet::new));
        this.field26047 = Executors.newCachedThreadPool(new ThreadFactoryBuilder().setDaemon(true).setNameFormat("Jello Portal Task Scheduler - #%d").build());
        this.field26048 = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryBuilder().setDaemon(true).setNameFormat("Jello Portal Task Scheduler Timer").build());
    }
    
    @Override
    public Class7118 method19877(final Object o, final Runnable runnable) {
        Preconditions.checkNotNull(o, "plugin");
        Preconditions.checkNotNull((Object)runnable, "runnable");
        return new Class7119(this, o, runnable, null);
    }
    
    public boolean method19878() throws InterruptedException {
        final ImmutableList copy;
        synchronized (this.field26049) {
            copy = ImmutableList.copyOf(this.field26049.values());
        }
        final Iterator iterator = ((Collection)copy).iterator();
        while (iterator.hasNext()) {
            ((Class988)iterator.next()).method5602();
        }
        this.field26048.shutdown();
        this.field26047.shutdown();
        return this.field26047.awaitTermination(10L, TimeUnit.SECONDS);
    }
}
