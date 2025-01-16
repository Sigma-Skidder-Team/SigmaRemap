// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import com.google.common.collect.Sets;
import com.google.common.collect.Lists;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Set;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class Class8206<S> implements Class8207
{
    private static String[] field33734;
    public final Class6582 field33735;
    public final CompletableFuture<Class315> field33736;
    public final CompletableFuture<List<S>> field33737;
    private final Set<Class1662> field33738;
    private final int field33739;
    private int field33740;
    private int field33741;
    private final AtomicInteger field33742;
    private final AtomicInteger field33743;
    
    public static Class8206<Void> method27187(final Class6582 class6582, final List<Class1662> list, final Executor executor, final Executor executor2, final CompletableFuture<Class315> completableFuture) {
        return new Class8206<Void>(executor, executor2, class6582, list, (class7885, class7886, class7887, executor2, executor3) -> class7887.method5785(class7885, class7886, Class5026.field21549, Class5026.field21549, executor, executor3), completableFuture);
    }
    
    public Class8206(final Executor executor, final Executor executor2, final Class6582 field33735, final List<Class1662> list, final Class9441<S> class9441, final CompletableFuture<Class315> completableFuture) {
        this.field33736 = new CompletableFuture<Class315>();
        this.field33742 = new AtomicInteger();
        this.field33743 = new AtomicInteger();
        this.field33735 = field33735;
        this.field33739 = list.size();
        this.field33742.incrementAndGet();
        completableFuture.thenRun(this.field33743::incrementAndGet);
        final ArrayList arrayList = Lists.newArrayList();
        CompletableFuture completableFuture2 = completableFuture;
        this.field33738 = Sets.newHashSet((Iterable)list);
        for (final Class1662 class9442 : list) {
            final CompletableFuture<S> method35078 = class9441.method35078(new Class7886(this, executor2, class9442, completableFuture2), field33735, class9442, p1 -> {
                this.field33742.incrementAndGet();
                executor3.execute(() -> {
                    runnable2.run();
                    this.field33743.incrementAndGet();
                });
                return;
            }, p1 -> {
                ++this.field33740;
                executor4.execute(() -> {
                    runnable4.run();
                    ++this.field33741;
                });
                return;
            });
            arrayList.add(method35078);
            completableFuture2 = method35078;
        }
        this.field33737 = (CompletableFuture<List<S>>) Util.method27853((List<? extends CompletableFuture<?>>)arrayList);
    }
    
    @Override
    public CompletableFuture<Class315> method27188() {
        return this.field33737.thenApply(p0 -> Class315.field1875);
    }
    
    @Override
    public float method27189() {
        return (this.field33743.get() * 2 + this.field33741 * 2 + (this.field33739 - this.field33738.size()) * 1) / (float)(this.field33742.get() * 2 + this.field33740 * 2 + this.field33739 * 1);
    }
    
    @Override
    public boolean method27190() {
        return this.field33736.isDone();
    }
    
    @Override
    public boolean method27191() {
        return this.field33737.isDone();
    }
    
    @Override
    public void method27192() {
        if (this.field33737.isCompletedExceptionally()) {
            this.field33737.join();
        }
    }
}
