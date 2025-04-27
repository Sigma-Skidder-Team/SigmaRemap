// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.apache.logging.log4j.LogManager;

import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import com.google.common.collect.Queues;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.Queue;
import java.util.PriorityQueue;
import org.apache.logging.log4j.Logger;

public class Class7520
{
    private static final Logger field29127;
    private final PriorityQueue<Class1944> field29128;
    private final Queue<Class9226> field29129;
    private final Queue<Runnable> field29130;
    private volatile int field29131;
    private volatile int field29132;
    private final Class9226 field29133;
    private final Class877<Runnable> field29134;
    private final Executor field29135;
    private World field29136;
    private final Class1656 field29137;
    private Vec3d field29138;
    private final int field29139;
    private final List<Class9226> field29140;
    public static final Class6332[] field29141;
    private static final boolean field29142;
    private static final boolean field29143;
    private static final boolean field29144;
    private static final boolean field29145;
    public static int field29146;
    
    public Class7520(final World class1847, final Class1656 class1848, final Executor executor, final boolean b, final Class9226 class1849) {
        this(class1847, class1848, executor, b, class1849, -1);
    }
    
    public Class7520(final World field29136, final Class1656 field29137, final Executor field29138, final boolean b, final Class9226 field29139, final int n) {
        this.field29128 = Queues.newPriorityQueue();
        this.field29130 = Queues.newConcurrentLinkedQueue();
        this.field29138 = Vec3d.ZERO;
        this.field29140 = new ArrayList<Class9226>();
        this.field29136 = field29136;
        this.field29137 = field29137;
        final int max = Math.max(1, (int)(Runtime.getRuntime().maxMemory() * 0.3) / (Class6332.method18795().stream().mapToInt(Class6332::method18796).sum() * 4) - 1);
        final int availableProcessors = Runtime.getRuntime().availableProcessors();
        int max2 = Math.max(1, Math.min(b ? availableProcessors : Math.min(availableProcessors, 4), max));
        if (n > 0) {
            max2 = n;
        }
        this.field29133 = field29139;
        final ArrayList arrayListWithExpectedSize = Lists.newArrayListWithExpectedSize(max2);
        Label_0279: {
            try {
                for (int i = 0; i < max2; ++i) {
                    arrayListWithExpectedSize.add(new Class9226());
                }
                break Label_0279;
            }
            catch (final OutOfMemoryError outOfMemoryError) {
                Class7520.field29127.warn("Allocated only {}/{} buffers", arrayListWithExpectedSize.size(), max2);
                for (int min = Math.min(arrayListWithExpectedSize.size() * 2 / 3, arrayListWithExpectedSize.size() - 1), j = 0; j < min; ++j) {
                    arrayListWithExpectedSize.remove(arrayListWithExpectedSize.size() - 1);
                }
            }
            System.gc();
        }
        this.field29129 = Queues.newArrayDeque(arrayListWithExpectedSize);
        this.field29132 = this.field29129.size();
        this.field29139 = this.field29132;
        this.field29135 = field29138;
        (this.field29134 = Class877.method5393(field29138, "Chunk Renderer")).method5386(this::method23453);
    }
    
    public void method23452(final World field29136) {
        this.field29136 = field29136;
    }
    
    private void method23453() {
        if (!this.field29129.isEmpty()) {
            if (this.field29128.poll() != null) {
                final Class9226 class9226 = this.field29129.poll();
                this.field29131 = this.field29128.size();
                this.field29132 = this.field29129.size();
                CompletableFuture.runAsync(() -> {}, this.field29135).thenCompose(p2 -> class9227.method7894(class9228)).whenComplete((p1, t2) -> {
                    if (t2 == null) {
                        this.field29134.method5386(() -> {
                            if (class9229 != Class2033.field11589) {
                                class9230.method34026();
                            }
                            else {
                                class9230.method34025();
                            }
                            this.field29129.add(class9230);
                            this.field29132 = this.field29129.size();
                            this.method23453();
                        });
                    }
                    else {
                        Minecraft.getInstance().method5238(Minecraft.getInstance().method5275(CrashReport.makeCrashReport(t2, "Batching chunks")));
                    }
                });
            }
        }
    }
    
    public String method23454() {
        return String.format("pC: %03d, pU: %02d, aB: %02d", this.field29131, this.field29130.size(), this.field29132);
    }
    
    public void method23455(final Vec3d field29138) {
        this.field29138 = field29138;
    }
    
    public Vec3d method23456() {
        return this.field29138;
    }
    
    public boolean method23457() {
        boolean b = false;
        Runnable runnable;
        while ((runnable = this.field29130.poll()) != null) {
            runnable.run();
            b = true;
        }
        return b;
    }
    
    public void method23458(final Class8974 class8974) {
        class8974.method31884();
    }
    
    public void method23459() {
        this.method23463();
    }
    
    public void method23460(final Class1944 class1944) {
        this.field29134.method5386(() -> {
            this.field29128.offer(e);
            this.field29131 = this.field29128.size();
            this.method23453();
        });
    }
    
    public CompletableFuture<Void> method23461(final BufferBuilder class4148, final Class1918 class4149) {
        return CompletableFuture.runAsync(() -> {}, this.field29130::add).thenCompose(p2 -> this.method23462(class4150, class4151));
    }
    
    private CompletableFuture<Void> method23462(final BufferBuilder class4148, final Class1918 class4149) {
        return class4149.method7589(class4148);
    }
    
    private void method23463() {
        while (!this.field29128.isEmpty()) {
            final Class1944 class1944 = this.field29128.poll();
            if (class1944 == null) {
                continue;
            }
            class1944.method7895();
        }
        this.field29131 = 0;
    }
    
    public boolean method23464() {
        return this.field29131 == 0 && this.field29130.isEmpty();
    }
    
    public void method23465() {
        this.method23463();
        this.field29134.close();
        this.field29129.clear();
    }
    
    public void method23466() {
        while (this.field29140.size() != this.field29139) {
            this.method23457();
            final Class9226 class9226 = this.field29129.poll();
            if (class9226 == null) {
                continue;
            }
            this.field29140.add(class9226);
        }
    }
    
    public void method23467() {
        this.field29129.addAll(this.field29140);
        this.field29140.clear();
    }
    
    public boolean method23468(final Class8974 class8974) {
        this.method23458(class8974);
        return true;
    }
    
    public boolean method23469(final Class8974 class8974) {
        if (!this.field29129.isEmpty()) {
            class8974.method31882(this);
            return true;
        }
        return false;
    }
    
    public boolean method23470(final Class8974 class8974) {
        return !this.field29129.isEmpty() && class8974.method31879(Class9484.field40762, this);
    }
    
    static {
        field29127 = LogManager.getLogger();
        field29141 = Class6332.method18795().toArray(new Class6332[0]);
        field29142 = Class9570.field41282.method22623();
        field29143 = Class9570.field41355.method22605();
        field29144 = Class9570.field41355.method22605();
        field29145 = Class9570.field41311.method22605();
    }
}
