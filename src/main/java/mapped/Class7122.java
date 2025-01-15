// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.Collection;
import javax.annotation.Nullable;
import java.util.Iterator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import com.google.common.collect.Queues;
import java.util.stream.IntStream;
import java.util.Queue;
import java.util.List;

public final class Class7122 implements Class7121<Class1414, Runnable>
{
    private static String[] field27761;
    private final List<Queue<Runnable>> field27762;
    
    public Class7122(final int endExclusive) {
        this.field27762 = IntStream.range(0, endExclusive).mapToObj(p0 -> Queues.newConcurrentLinkedQueue()).collect((Collector<? super Object, ?, List<Queue<Runnable>>>)Collectors.toList());
    }
    
    @Nullable
    public Runnable method21859() {
        final Iterator<Queue<Runnable>> iterator = this.field27762.iterator();
        while (iterator.hasNext()) {
            final Runnable runnable = iterator.next().poll();
            if (runnable == null) {
                continue;
            }
            return runnable;
        }
        return null;
    }
    
    public boolean method21860(final Class1414 class1414) {
        this.field27762.get(class1414.method5658()).add((Object)class1414);
        return true;
    }
    
    @Override
    public boolean method21858() {
        return this.field27762.stream().allMatch(Collection::isEmpty);
    }
}
