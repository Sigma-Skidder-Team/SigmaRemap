// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.concurrent.CompletableFuture;
import java.util.function.IntSupplier;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.ObjectList;
import org.apache.logging.log4j.Logger;

public class Class1885 extends Class1886 implements AutoCloseable
{
    private static final Logger field10263;
    private final Class877<Runnable> field10264;
    private final ObjectList<Pair<Class2216, Runnable>> field10265;
    private final Class388 field10266;
    private final Class875<Class7701<Runnable>> field10267;
    private volatile int field10268;
    private final AtomicBoolean field10269;
    
    public Class1885(final Class1908 class1908, final Class388 field10266, final boolean b, final Class877<Runnable> field10267, final Class875<Class7701<Runnable>> field10268) {
        super(class1908, true, b);
        this.field10265 = (ObjectList<Pair<Class2216, Runnable>>)new ObjectArrayList();
        this.field10268 = 5;
        this.field10269 = new AtomicBoolean();
        this.field10266 = field10266;
        this.field10267 = field10268;
        this.field10264 = field10267;
    }
    
    @Override
    public void close() {
    }
    
    @Override
    public int method7250(final int n, final boolean b, final boolean b2) {
        throw Class8349.method27859(new UnsupportedOperationException("Ran authomatically on a different thread!"));
    }
    
    @Override
    public void method7251(final BlockPos class354, final int n) {
        throw Class8349.method27859(new UnsupportedOperationException("Ran authomatically on a different thread!"));
    }
    
    @Override
    public void method7252(final BlockPos class354) {
        class354.method1153();
        this.method7257(class354.getX() >> 4, class354.getZ() >> 4, Class2216.field13612, Class8349.method27856(() -> super.method7252(class355), () -> "checkBlock " + obj));
    }
    
    public void method7253(final Class7859 class7859) {
        this.method7258(class7859.field32290, class7859.field32291, () -> 0, Class2216.field13611, Class8349.method27856(() -> {
            super.method7259(class7860, false);
            super.method7255(class7860, false);
            int i = 0;
            while (i < 17) {
                super.method7256(Class237.field912, Class353.method1090(class7860, i), null);
                super.method7256(Class237.field911, Class353.method1090(class7860, i), null);
                ++i;
            }
            int j = 0;
            while (j < 16) {
                super.method7254(Class353.method1090(class7860, j), true);
                ++j;
            }
        }, () -> "updateChunkStatus " + obj + " " + true));
    }
    
    @Override
    public void method7254(final Class353 class353, final boolean b) {
        this.method7258(class353.method1102(), class353.method1104(), () -> 0, Class2216.field13611, Class8349.method27856(() -> super.method7254(class354, b2), () -> "updateSectionStatus " + obj + " " + b3));
    }
    
    @Override
    public void method7255(final Class7859 class7859, final boolean b) {
        this.method7257(class7859.field32290, class7859.field32291, Class2216.field13611, Class8349.method27856(() -> super.method7255(class7860, b2), () -> "enableLight " + obj + " " + b3));
    }
    
    @Override
    public void method7256(final Class237 class237, final Class353 class238, final Class7281 class239) {
        this.method7258(class238.method1102(), class238.method1104(), () -> 0, Class2216.field13611, Class8349.method27856(() -> super.method7256(class240, class241, class242), () -> "queueData " + obj));
    }
    
    private void method7257(final int n, final int n2, final Class2216 class2216, final Runnable runnable) {
        this.method7258(n, n2, this.field10266.method1318(Class7859.method25423(n, n2)), class2216, runnable);
    }
    
    private void method7258(final int n, final int n2, final IntSupplier intSupplier, final Class2216 class2216, final Runnable runnable) {
        this.field10267.method5386(Class1910.method7463(() -> {
            this.field10265.add((Object)Pair.of((Object)class2217, (Object)runnable2));
            if (this.field10265.size() >= this.field10268) {
                this.method7262();
            }
        }, Class7859.method25423(n, n2), intSupplier));
    }
    
    @Override
    public void method7259(final Class7859 class7859, final boolean b) {
        this.method7258(class7859.field32290, class7859.field32291, () -> 0, Class2216.field13611, Class8349.method27856(() -> super.method7259(class7860, b2), () -> "retainData " + obj));
    }
    
    public CompletableFuture<Class1860> method7260(final Class1860 class1860, final boolean b) {
        final Class7859 method7019 = class1860.method7019();
        class1860.method7044(false);
        this.method7257(method7019.field32290, method7019.field32291, Class2216.field13611, Class8349.method27856(() -> {
            class1861.method7014();
            int i = 0;
            while (i < 16) {
                final Class8199[] array;
                if (!Class8199.method27155(array[i])) {
                    super.method7254(Class353.method1090(class1862, i), (boolean)(0 != 0));
                }
                ++i;
            }
            super.method7255(class1862, (boolean)(1 != 0));
            if (!b2) {
                class1861.method7035().forEach(class1864 -> super.method7251(class1864, class1863.method6984(class1864)));
            }
            this.field10266.method1331(class1862);
            return;
        }, () -> "lightChunk " + obj + " " + b3));
        return CompletableFuture.supplyAsync(() -> {
            class1865.method7044(true);
            super.method7259(class1866, false);
            return class1865;
        }, runnable2 -> this.method7257(class1867.field32290, class1867.field32291, Class2216.field13612, runnable2));
    }
    
    public void method7261() {
        if (!this.field10265.isEmpty() || super.method7287()) {
            if (this.field10269.compareAndSet(false, true)) {
                this.field10264.method5386(() -> {
                    this.method7262();
                    this.field10269.set(false);
                });
            }
        }
    }
    
    private void method7262() {
        int min;
        ObjectListIterator iterator;
        int n;
        Pair pair;
        for (min = Math.min(this.field10265.size(), this.field10268), iterator = this.field10265.iterator(), n = 0; iterator.hasNext() && n < min; ++n) {
            pair = (Pair)iterator.next();
            if (pair.getFirst() == Class2216.field13611) {
                ((Runnable)pair.getSecond()).run();
            }
        }
        iterator.back(n);
        super.method7250(Integer.MAX_VALUE, true, true);
        for (int n2 = 0; iterator.hasNext() && n2 < min; ++n2) {
            final Pair pair2 = (Pair)iterator.next();
            if (pair2.getFirst() == Class2216.field13612) {
                ((Runnable)pair2.getSecond()).run();
            }
            iterator.remove();
        }
    }
    
    public void method7263(final int field10268) {
        this.field10268 = field10268;
    }
    
    static {
        field10263 = LogManager.getLogger();
    }
}
