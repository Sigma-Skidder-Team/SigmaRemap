// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.ArrayList;
import com.google.common.collect.EvictingQueue;
import com.google.common.collect.Lists;
import javax.annotation.Nullable;
import java.io.IOException;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.io.InputStreamReader;
import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.CompletionStage;
import java.util.stream.Stream;
import java.util.function.Function;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.HashMap;
import com.google.common.collect.Queues;
import com.google.common.collect.Maps;
import net.minecraft.entity.Entity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.MathHelper;

import java.util.Random;
import java.util.Queue;
import java.util.Map;
import java.util.List;

public class Class1793 implements Class1662
{
    private static final List<Class6451> field9922;
    public Class1847 field9923;
    private final Map<Class6451, Queue<Class6173>> field9924;
    private final Queue<Class6177> field9925;
    private final Class1663 field9926;
    private final Random field9927;
    private final Map<Class1932, Class5350<?>> field9928;
    private final Queue<Class6173> field9929;
    private final Map<Class1932, Class7806> field9930;
    private final Class1774 field9931;
    
    public Class1793(final Class1847 field9923, final Class1663 field9924) {
        this.field9924 = Maps.newIdentityHashMap();
        this.field9925 = Queues.newArrayDeque();
        this.field9927 = new Random();
        this.field9928 = new HashMap<Class1932, Class5350<?>>();
        this.field9929 = Queues.newArrayDeque();
        this.field9930 = Maps.newHashMap();
        this.field9931 = new Class1774(Class1774.field9854);
        field9924.method5851(this.field9931.method6340(), this.field9931);
        this.field9923 = field9923;
        this.field9926 = field9924;
        this.method6471();
    }
    
    private void method6471() {
        this.method6473((Class6907<Class6909>)Class8432.field34597, Class5354::new);
        this.method6473((Class6907<Class6909>)Class8432.field34598, Class5400::new);
        this.method6472((Class6907<Class6909>)Class8432.field34599, (Class5350<Class6909>)new Class5370());
        this.method6472(Class8432.field34600, new Class5385());
        this.method6473((Class6907<Class6909>)Class8432.field34601, Class5401::new);
        this.method6473((Class6907<Class6909>)Class8432.field34650, Class5362::new);
        this.method6473((Class6907<Class6909>)Class8432.field34648, Class5388::new);
        this.method6473((Class6907<Class6909>)Class8432.field34653, Class5351::new);
        this.method6473((Class6907<Class6909>)Class8432.field34654, Class5389::new);
        this.method6473((Class6907<Class6909>)Class8432.field34602, Class5408::new);
        this.method6473((Class6907<Class6909>)Class8432.field34626, Class5352::new);
        this.method6473((Class6907<Class6909>)Class8432.field34603, Class5369::new);
        this.method6473((Class6907<Class6909>)Class8432.field34649, Class5375::new);
        this.method6473((Class6907<Class6909>)Class8432.field34604, Class5374::new);
        this.method6473((Class6907<Class6909>)Class8432.field34605, Class5405::new);
        this.method6473((Class6907<Class6909>)Class8432.field34652, Class5387::new);
        this.method6473((Class6907<Class6909>)Class8432.field34606, Class5368::new);
        this.method6473((Class6907<Class6909>)Class8432.field34607, Class5376::new);
        this.method6473((Class6907<Class6909>)Class8432.field34608, Class5404::new);
        this.method6473((Class6907<Class6909>)Class8432.field34609, Class5356::new);
        this.method6473((Class6907<Class6909>)Class8432.field34610, Class5364::new);
        this.method6473(Class8432.field34611, Class5410::new);
        this.method6473((Class6907<Class6909>)Class8432.field34612, Class5381::new);
        this.method6472((Class6907<Class6909>)Class8432.field34613, (Class5350<Class6909>)new Class5379());
        this.method6473((Class6907<Class6909>)Class8432.field34614, Class5394::new);
        this.method6473((Class6907<Class6909>)Class8432.field34615, Class5378::new);
        this.method6473((Class6907<Class6909>)Class8432.field34616, Class5411::new);
        this.method6473((Class6907<Class6909>)Class8432.field34617, Class5382::new);
        this.method6472((Class6907<Class6909>)Class8432.field34618, (Class5350<Class6909>)new Class5380());
        this.method6473((Class6907<Class6909>)Class8432.field34619, Class5396::new);
        this.method6473(Class8432.field34620, Class5393::new);
        this.method6473((Class6907<Class6909>)Class8432.field34621, Class5390::new);
        this.method6473((Class6907<Class6909>)Class8432.field34622, Class5371::new);
        this.method6473((Class6907<Class6909>)Class8432.field34623, Class5372::new);
        this.method6473((Class6907<Class6909>)Class8432.field34624, Class5355::new);
        this.method6473((Class6907<Class6909>)Class8432.field34625, Class5359::new);
        this.method6473((Class6907<Class6909>)Class8432.field34627, Class5406::new);
        this.method6473((Class6907<Class6909>)Class8432.field34628, Class5392::new);
        this.method6472(Class8432.field34629, new Class5409());
        this.method6472((Class6907<Class6909>)Class8432.field34630, (Class5350<Class6909>)new Class5365());
        this.method6472((Class6907<Class6909>)Class8432.field34631, (Class5350<Class6909>)new Class5386());
        this.method6473((Class6907<Class6909>)Class8432.field34632, Class5373::new);
        this.method6473((Class6907<Class6909>)Class8432.field34633, Class5398::new);
        this.method6473((Class6907<Class6909>)Class8432.field34634, Class5361::new);
        this.method6473((Class6907<Class6909>)Class8432.field34651, Class5353::new);
        this.method6473((Class6907<Class6909>)Class8432.field34635, Class5384::new);
        this.method6473((Class6907<Class6909>)Class8432.field34636, Class5377::new);
        this.method6473((Class6907<Class6909>)Class8432.field34637, Class5395::new);
        this.method6473((Class6907<Class6909>)Class8432.field34638, Class5403::new);
        this.method6473((Class6907<Class6909>)Class8432.field34639, Class5358::new);
        this.method6473((Class6907<Class6909>)Class8432.field34640, Class5391::new);
        this.method6473((Class6907<Class6909>)Class8432.field34641, Class5397::new);
        this.method6473((Class6907<Class6909>)Class8432.field34643, Class5383::new);
        this.method6473((Class6907<Class6909>)Class8432.field34644, Class5349::new);
        this.method6473((Class6907<Class6909>)Class8432.field34642, Class5366::new);
        this.method6473((Class6907<Class6909>)Class8432.field34645, Class5402::new);
        this.method6473((Class6907<Class6909>)Class8432.field34646, Class5407::new);
        this.method6473((Class6907<Class6909>)Class8432.field34647, Class5360::new);
        this.method6473((Class6907<Class6909>)Class8432.field34655, Class5363::new);
        this.method6473((Class6907<Class6909>)Class8432.field34656, Class5367::new);
        this.method6473((Class6907<Class6909>)Class8432.field34657, Class5399::new);
        this.method6473((Class6907<Class6909>)Class8432.field34658, Class5357::new);
    }
    
    private <T extends Class6909> void method6472(final Class6907<T> class6907, final Class5350<T> class6908) {
        this.field9928.put(Class90.field222.method503(class6907), class6908);
    }
    
    private <T extends Class6909> void method6473(final Class6907<T> class6907, final Class7759<T> class6908) {
        final Class7806 class6909 = new Class7806(this, null);
        this.field9930.put(Class90.field222.method503(class6907), class6909);
        this.field9928.put(Class90.field222.method503(class6907), class6908.method24763(class6909));
    }
    
    @Override
    public CompletableFuture<Void> method5785(final Class7885 class7885, final Class6582 class7886, final Class5028 class7887, final Class5028 class7888, final Executor executor, final Executor executor2) {
        Maps.newConcurrentMap();
        return CompletableFuture.allOf((CompletableFuture<?>[])Class90.field222.method507().stream().map(p3 -> CompletableFuture.runAsync(() -> this.method6475(class7889, class7890, map), executor3)).toArray(CompletableFuture[]::new)).thenApplyAsync(p3 -> {
            class7891.method15295();
            class7891.method15297("stitching");
            this.field9931.method6332(class7892, map2.values().stream().flatMap((Function<? super Object, ? extends Stream<? extends Class1932>>)Collection::stream), class7891, 0);
            class7891.method15299();
            class7891.method15296();
            return;
        }, executor).thenCompose((Function<? super Object, ? extends CompletionStage<Object>>)class7885::method25538).thenAcceptAsync(class7895 -> {
            this.field9924.clear();
            class7894.method15295();
            class7894.method15297("upload");
            this.field9931.method6331(class7895);
            class7894.method15300("bindSpriteSets");
            map3.forEach((class7897, list) -> {
                this.field9931.method6338(Class1913.method7551());
                this.field9930.get(class7897).method25211((List<Class1912>)(list.isEmpty() ? ImmutableList.of((Object)class7896) : list.stream().map(this.field9931::method6338).collect(ImmutableList.toImmutableList())));
                return;
            });
            class7894.method15299();
            class7894.method15296();
        }, executor2);
    }
    
    public void method6474() {
        this.field9931.method6339();
    }
    
    private void method6475(final Class6582 class6582, final Class1932 obj, final Map<Class1932, List<Class1932>> map) {
        final Class1932 class6583 = new Class1932(obj.method7798(), "particles/" + obj.method7797() + ".json");
        try (final Class1671 method19933 = class6582.method19933(class6583);
             final InputStreamReader inputStreamReader = new InputStreamReader(method19933.method5887(), Charsets.UTF_8)) {
            final List<Class1932> method19934 = Class8638.method29314(Class9583.method35933(inputStreamReader)).method29313();
            final boolean containsKey = this.field9930.containsKey(obj);
            if (method19934 == null) {
                if (containsKey) {
                    throw new IllegalStateException("Missing texture list for particle " + obj);
                }
            }
            else {
                if (!containsKey) {
                    throw new IllegalStateException("Redundant texture list for particle " + obj);
                }
                map.put(obj, method19934.stream().map(class6584 -> {
                    new Class1932(class6584.method7798(), "particle/" + class6584.method7797());
                    return;
                }).collect((Collector<? super Object, ?, List<Class1932>>)Collectors.toList()));
            }
        }
        catch (final IOException cause) {
            throw new IllegalStateException("Failed to load description for particle " + obj, cause);
        }
    }
    
    public void method6476(final Entity class399, final Class6909 class400) {
        this.field9925.add(new Class6177(this.field9923, class399, class400));
    }
    
    public void method6477(final Entity class399, final Class6909 class400, final int n) {
        this.field9925.add(new Class6177(this.field9923, class399, class400, n));
    }
    
    @Nullable
    public Class6173 method6478(final Class6909 class6909, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        final Class6173 method6479 = this.method6479(class6909, n, n2, n3, n4, n5, n6);
        if (method6479 == null) {
            return null;
        }
        this.method6480(method6479);
        return method6479;
    }
    
    @Nullable
    private <T extends Class6909> Class6173 method6479(final T t, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        final Class5350 class5350 = this.field9928.get(Class90.field222.method503((Class6907<? extends Class6909>)t.method21272()));
        return (class5350 != null) ? class5350.method16516(t, this.field9923, n, n2, n3, n4, n5, n6) : null;
    }
    
    public void method6480(final Class6173 class6173) {
        if (class6173 != null) {
            if (!(class6173 instanceof Class6201) || Class8571.method28884()) {
                this.field9929.add(class6173);
            }
        }
    }
    
    public void method6481() {
        this.field9924.forEach((class6179, queue2) -> {
            this.field9923.method6796().method15297(class6179.toString());
            this.method6482(queue2);
            this.field9923.method6796().method15299();
            return;
        });
        if (!this.field9925.isEmpty()) {
            final ArrayList arrayList = Lists.newArrayList();
            for (final Class6177 class6177 : this.field9925) {
                class6177.method18420();
                if (class6177.method18443()) {
                    continue;
                }
                arrayList.add(class6177);
            }
            this.field9925.removeAll(arrayList);
        }
        if (!this.field9929.isEmpty()) {
            Class6173 class6178;
            while ((class6178 = this.field9929.poll()) != null) {
                final Queue queue = this.field9924.computeIfAbsent(class6178.method18418(), p0 -> EvictingQueue.create(16384));
                if (class6178 instanceof Class6163 && this.method6489(class6178, queue)) {
                    continue;
                }
                queue.add(class6178);
            }
        }
    }
    
    private void method6482(final Collection<Class6173> collection) {
        if (!collection.isEmpty()) {
            final long currentTimeMillis = System.currentTimeMillis();
            int size = collection.size();
            final Iterator iterator = collection.iterator();
            while (iterator.hasNext()) {
                final Class6173 class6173 = (Class6173)iterator.next();
                this.method6483(class6173);
                if (!class6173.method18443()) {
                    iterator.remove();
                }
                --size;
                if (System.currentTimeMillis() <= currentTimeMillis + 20L) {
                    continue;
                }
                break;
            }
            if (size > 0) {
                int n = size;
                final Iterator iterator2 = collection.iterator();
                while (iterator2.hasNext()) {
                    if (n <= 0) {
                        break;
                    }
                    ((Class6173)iterator2.next()).method18439();
                    iterator2.remove();
                    --n;
                }
            }
        }
    }
    
    private void method6483(final Class6173 class6173) {
        try {
            class6173.method18420();
        }
        catch (final Throwable t) {
            final Class7689 method24421 = Class7689.method24421(t, "Ticking Particle");
            final Class5204 method24422 = method24421.method24418("Particle being ticked");
            method24422.method16296("Particle", class6173::toString);
            method24422.method16296("Particle Type", class6173.method18418()::toString);
            throw new Class2365(method24421);
        }
    }
    
    public void method6484(final Class7351 class7351, final Class7808 class7352, final Class392 class7353, final Class6092 class7354, final float n) {
        class7353.method1418();
        final Runnable runnable = () -> {
            Class8726.method29999();
            Class8726.method30118();
            Class8726.method30008();
            Class8726.method30019();
            return;
        };
        Class8726.method30059();
        Class8726.method30067(class7351.method22569().method32111());
        Object o = Class1793.field9922;
        if (Class9570.field41282.method22623()) {
            o = this.field9924.keySet();
        }
        for (final Class6451 class7355 : o) {
            if (class7355 != Class6451.field25663) {
                runnable.run();
                final Iterable iterable = this.field9924.get(class7355);
                if (iterable == null) {
                    continue;
                }
                Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
                final Class7392 method22694 = Class7392.method22694();
                final Class4148 method22695 = method22694.method22696();
                class7355.method19304(method22695, this.field9926);
                for (final Class6173 class7356 : iterable) {
                    try {
                        class7356.method18432(method22695, class7354, n);
                    }
                    catch (final Throwable t) {
                        final Class7689 method22696 = Class7689.method24421(t, "Rendering Particle");
                        final Class5204 method22697 = method22696.method24418("Particle being rendered");
                        method22697.method16296("Particle", class7356::toString);
                        method22697.method16296("Particle Type", class7355::toString);
                        throw new Class2365(method22696);
                    }
                }
                class7355.method19305(method22694);
            }
        }
        Class8726.method30060();
        Class8726.method30010(true);
        Class8726.method30012();
        Class8726.method30118();
        class7353.method1417();
        Class8726.method30020();
        Class8726.method30008();
    }
    
    public void method6485(final Class1847 field9923) {
        this.field9923 = field9923;
        this.field9924.clear();
        this.field9925.clear();
    }
    
    public void method6486(final BlockPos class354, final Class7096 class355) {
        boolean b;
        if (Class9570.field41241.method22605() && Class9570.field41247.method22605()) {
            class355.method21696();
            b = (!Class9570.method35820(class355, Class9570.field41247, this.field9923, class354) && !Class9570.method35820(class355, Class9570.field41241, this.field9923, class354, this));
        }
        else {
            b = !class355.method21706();
        }
        if (b) {
            class355.method21725(this.field9923, class354).method24544((n, n2, n3, n4, n5, n6) -> {
                final double min = Math.min(1.0, n4 - n);
                final double min2 = Math.min(1.0, n5 - n2);
                final double min3 = Math.min(1.0, n6 - n3);
                final int max = Math.max(2, MathHelper.method35650(min / 0.25));
                final int max2 = Math.max(2, MathHelper.method35650(min2 / 0.25));
                final int max3 = Math.max(2, MathHelper.method35650(min3 / 0.25));
                for (int i = 0; i < max; ++i) {
                    for (int j = 0; j < max2; ++j) {
                        for (int k = 0; k < max3; ++k) {
                            final double n7 = (i + 0.5) / max;
                            final double n8 = (j + 0.5) / max2;
                            final double n9 = (k + 0.5) / max3;
                            this.method6480(new Class6182(this.field9923, class354.getX() + (n7 * min + n), class354.getY() + (n8 * min2 + n2), class354.getZ() + (n9 * min3 + n3), n7 - 0.5, n8 - 0.5, n9 - 0.5, class355).method18452(class354));
                        }
                    }
                }
            });
        }
    }
    
    public void method6487(final BlockPos class354, final Direction class355) {
        final Class7096 method6701 = this.field9923.method6701(class354);
        if (method6701.method21710() != Class2115.field12305) {
            final int method6702 = class354.getX();
            final int method6703 = class354.getY();
            final int method6704 = class354.getZ();
            final Class6221 method6705 = method6701.method21725(this.field9923, class354).method24537();
            double n = method6702 + this.field9927.nextDouble() * (method6705.field25076 - method6705.field25073 - 0.20000000298023224) + 0.10000000149011612 + method6705.field25073;
            double n2 = method6703 + this.field9927.nextDouble() * (method6705.field25077 - method6705.field25074 - 0.20000000298023224) + 0.10000000149011612 + method6705.field25074;
            double n3 = method6704 + this.field9927.nextDouble() * (method6705.field25078 - method6705.field25075 - 0.20000000298023224) + 0.10000000149011612 + method6705.field25075;
            if (class355 == Direction.DOWN) {
                n2 = method6703 + method6705.field25074 - 0.10000000149011612;
            }
            if (class355 == Direction.UP) {
                n2 = method6703 + method6705.field25077 + 0.10000000149011612;
            }
            if (class355 == Direction.NORTH) {
                n3 = method6704 + method6705.field25075 - 0.10000000149011612;
            }
            if (class355 == Direction.SOUTH) {
                n3 = method6704 + method6705.field25078 + 0.10000000149011612;
            }
            if (class355 == Direction.WEST) {
                n = method6702 + method6705.field25073 - 0.10000000149011612;
            }
            if (class355 == Direction.EAST) {
                n = method6702 + method6705.field25076 + 0.10000000149011612;
            }
            this.method6480(new Class6182(this.field9923, n, n2, n3, 0.0, 0.0, 0.0, method6701).method18452(class354).method18434(0.2f).method18433(0.6f));
        }
    }
    
    public String method6488() {
        return String.valueOf(this.field9924.values().stream().mapToInt(Collection::size).sum());
    }
    
    private boolean method6489(final Class6173 class6173, final Queue<Class6173> queue) {
        for (final Class6173 class6174 : queue) {
            if (!(class6174 instanceof Class6163)) {
                continue;
            }
            if (class6173.field24933 != class6174.field24933) {
                continue;
            }
            if (class6173.field24934 != class6174.field24934) {
                continue;
            }
            if (class6173.field24935 != class6174.field24935) {
                continue;
            }
            class6174.field24950 = 0;
            return true;
        }
        return false;
    }
    
    public void method6490(final BlockPos class354, final Class7005 class355) {
        final Class7096 method6701 = this.field9923.method6701(class354);
        if (method6701 != null) {
            if (!Class9570.method35820(method6701, Class9570.field41242, this.field9923, class355, this)) {
                this.method6487(class354, class355.method21448());
            }
        }
    }
    
    static {
        field9922 = (List)ImmutableList.of((Object)Class6451.field25658, (Object)Class6451.field25659, (Object)Class6451.field25661, (Object)Class6451.field25660, (Object)Class6451.field25662);
    }
}
