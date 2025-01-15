// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.command.ICommandSource;
import net.minecraft.util.math.Vec3d;
import org.apache.logging.log4j.LogManager;
import java.io.IOException;
import java.util.concurrent.CompletionException;
import org.apache.commons.io.IOUtils;
import java.nio.charset.StandardCharsets;
import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;
import java.util.Collection;
import java.util.Iterator;
import com.mojang.brigadier.CommandDispatcher;
import java.util.Optional;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.ArrayDeque;
import java.util.Map;
import org.apache.logging.log4j.Logger;

public class Class1794 implements Class1657
{
    private static final Logger field9932;
    private static final Class1932 field9933;
    private static final Class1932 field9934;
    public static final int field9935;
    public static final int field9936;
    private final Class394 field9937;
    private final Map<Class1932, Class8263> field9938;
    private boolean field9939;
    private final ArrayDeque<Class9234> field9940;
    private final List<Class9234> field9941;
    private final Class6208<Class8263> field9942;
    private final List<Class8263> field9943;
    private boolean field9944;
    
    public Class1794(final Class394 field9937) {
        this.field9938 = Maps.newHashMap();
        this.field9940 = new ArrayDeque<Class9234>();
        this.field9941 = Lists.newArrayList();
        this.field9942 = new Class6208<Class8263>(this::method6502, "tags/functions", true, "function");
        this.field9943 = Lists.newArrayList();
        this.field9937 = field9937;
    }
    
    public Optional<Class8263> method6502(final Class1932 class1932) {
        return Optional.ofNullable(this.field9938.get(class1932));
    }
    
    public Class394 method6503() {
        return this.field9937;
    }
    
    public int method6504() {
        return this.field9937.method1583().method31217(Class8878.field37336);
    }
    
    public Map<Class1932, Class8263> method6505() {
        return this.field9938;
    }
    
    public CommandDispatcher<Class7492> method6506() {
        return this.field9937.method1573().method25004();
    }
    
    public void method6507() {
        this.field9937.method1590().method15298(Class1794.field9933::toString);
        final Iterator<Class8263> iterator = this.field9943.iterator();
        while (iterator.hasNext()) {
            this.method6508(iterator.next(), this.method6511());
        }
        this.field9937.method1590().method15299();
        if (this.field9944) {
            this.field9944 = false;
            final Collection<Class8263> method25616 = this.method6513().method18461(Class1794.field9934).method25616();
            this.field9937.method1590().method15298(Class1794.field9934::toString);
            final Iterator<Class8263> iterator2 = method25616.iterator();
            while (iterator2.hasNext()) {
                this.method6508(iterator2.next(), this.method6511());
            }
            this.field9937.method1590().method15299();
        }
    }
    
    public int method6508(final Class8263 class8263, final Class7492 class8264) {
        final int method6504 = this.method6504();
        if (this.field9939) {
            if (this.field9940.size() + this.field9941.size() < method6504) {
                this.field9941.add(new Class9234(this, class8264, new Class6783(class8263)));
            }
            return 0;
        }
        try {
            this.field9939 = true;
            int n = 0;
            final Class6782[] method6505 = class8263.method27444();
            for (int i = method6505.length - 1; i >= 0; --i) {
                this.field9940.push(new Class9234(this, class8264, method6505[i]));
            }
            while (!this.field9940.isEmpty()) {
                try {
                    final Class9234 class8265 = this.field9940.removeFirst();
                    this.field9937.method1590().method15298(class8265::toString);
                    class8265.method34051(this.field9940, method6504);
                    if (!this.field9941.isEmpty()) {
                        Lists.reverse((List)this.field9941).forEach(this.field9940::addFirst);
                        this.field9941.clear();
                    }
                }
                finally {
                    this.field9937.method1590().method15299();
                }
                if (++n >= method6504) {
                    return n;
                }
            }
            return n;
        }
        finally {
            this.field9940.clear();
            this.field9941.clear();
            this.field9939 = false;
        }
    }
    
    @Override
    public void method5691(final Class6582 class6582) {
        this.field9938.clear();
        this.field9943.clear();
        final Collection<Class1932> method19936 = class6582.method19936("functions", s -> s.endsWith(".mcfunction"));
        final ArrayList arrayList = Lists.newArrayList();
        final Iterator<Class1932> iterator = method19936.iterator();
        while (iterator.hasNext()) {
            iterator.next().method7797();
            arrayList.add(CompletableFuture.supplyAsync(() -> method6510(class6583, class6584), Class1673.field9460).thenApplyAsync(list -> {
                final Class1932 class6586;
                final String s2;
                final Object o = new Class1932(class6586.method7798(), s2.substring(Class1794.field9935, s2.length() - Class1794.field9936));
                return Class8263.method27445(class6585, this, list);
            }, this.field9937.method1591()).handle((class6588, t3) -> this.method6509(class6588, t3, class6587)));
        }
        CompletableFuture.allOf((CompletableFuture<?>[])arrayList.toArray(new CompletableFuture[0])).join();
        if (!this.field9938.isEmpty()) {
            Class1794.field9932.info("Loaded {} custom command functions", (Object)this.field9938.size());
        }
        this.field9942.method18465(this.field9942.method18464(class6582, this.field9937.method1591()).join());
        this.field9943.addAll(this.field9942.method18461(Class1794.field9933).method25616());
        this.field9944 = true;
    }
    
    @Nullable
    private Class8263 method6509(final Class8263 class8263, final Throwable t, final Class1932 class8264) {
        if (t != null) {
            Class1794.field9932.error("Couldn't load function at {}", (Object)class8264, (Object)t);
            return null;
        }
        synchronized (this.field9938) {
            this.field9938.put(class8263.method27443(), class8263);
            return class8263;
        }
    }
    
    private static List<String> method6510(final Class6582 class6582, final Class1932 class6583) {
        try (final Class1671 method19933 = class6582.method19933(class6583)) {
            return IOUtils.readLines(method19933.method5887(), StandardCharsets.UTF_8);
        }
        catch (final IOException cause) {
            throw new CompletionException(cause);
        }
    }
    
    public Class7492 method6511() {
        return this.field9937.method1574().method23241(2).method23240();
    }
    
    public Class7492 method6512() {
        return new Class7492(ICommandSource.DUMMY, Vec3d.ZERO, Vec2f.ZERO, null, this.field9937.method1449(), "", new Class2260(""), this.field9937, null);
    }
    
    public Class6208<Class8263> method6513() {
        return this.field9942;
    }
    
    static {
        field9932 = LogManager.getLogger();
        field9933 = new Class1932("tick");
        field9934 = new Class1932("load");
        field9935 = "functions/".length();
        field9936 = Class1794.\u6c4f\ubbcd\u11e9\ud553\u3ead\uc799[6].length();
    }
}
