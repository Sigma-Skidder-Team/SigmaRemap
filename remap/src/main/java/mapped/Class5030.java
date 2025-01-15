// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.time.Duration;
import org.apache.logging.log4j.util.Supplier;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import com.google.common.collect.Lists;
import java.util.function.IntSupplier;
import java.util.Map;
import it.unimi.dsi.fastutil.longs.LongList;
import java.util.List;
import org.apache.logging.log4j.Logger;

public class Class5030 implements Class5027
{
    private static final long field21568;
    private static final Logger field21569;
    private final List<String> field21570;
    private final LongList field21571;
    private final Map<String, Class7002> field21572;
    private final IntSupplier field21573;
    private final long field21574;
    private final int field21575;
    private String field21576;
    private boolean field21577;
    private Class7002 field21578;
    private final boolean field21579;
    
    public Class5030(final long field21574, final IntSupplier field21575, final boolean field21576) {
        this.field21570 = Lists.newArrayList();
        this.field21571 = (LongList)new LongArrayList();
        this.field21572 = Maps.newHashMap();
        this.field21576 = "";
        this.field21574 = field21574;
        this.field21575 = field21575.getAsInt();
        this.field21573 = field21575;
        this.field21579 = field21576;
    }
    
    @Override
    public void method15295() {
        if (!this.field21577) {
            this.field21577 = true;
            this.field21576 = "";
            this.field21570.clear();
            this.method15297("root");
        }
        else {
            Class5030.field21569.error("Profiler tick already started - missing endTick()?");
        }
    }
    
    @Override
    public void method15296() {
        if (this.field21577) {
            this.method15299();
            this.field21577 = false;
            if (!this.field21576.isEmpty()) {
                Class5030.field21569.error("Profiler tick ended before path was fully popped (remainder: '{}'). Mismatched push/pop?", new Supplier[] { () -> Class5756.method17107(this.field21576) });
            }
        }
        else {
            Class5030.field21569.error("Profiler tick already ended - missing startTick()?");
        }
    }
    
    @Override
    public void method15297(final String str) {
        if (this.field21577) {
            if (!this.field21576.isEmpty()) {
                this.field21576 += '\u001e';
            }
            this.field21576 += str;
            this.field21570.add(this.field21576);
            this.field21571.add(Class8349.method27838());
            this.field21578 = null;
        }
        else {
            Class5030.field21569.error("Cannot push '{}' to profiler if profiler tick hasn't started - missing startTick()?", (Object)str);
        }
    }
    
    @Override
    public void method15298(final java.util.function.Supplier<String> supplier) {
        this.method15297(supplier.get());
    }
    
    @Override
    public void method15299() {
        if (this.field21577) {
            if (!this.field21571.isEmpty()) {
                final long method27838 = Class8349.method27838();
                final long removeLong = this.field21571.removeLong(this.field21571.size() - 1);
                this.field21570.remove(this.field21570.size() - 1);
                final long n = method27838 - removeLong;
                final Class7002 method27839 = this.method15307();
                Class7002.method21441(method27839, (Class7002.method21442(method27839) * 49L + n) / 50L);
                Class7002.method21443(method27839, 1L);
                if (this.field21579) {
                    if (n > Class5030.field21568) {
                        Class5030.field21569.warn("Something's taking too long! '{}' took aprox {} ms", new Supplier[] { () -> Class5756.method17107(this.field21576), () -> n / 1000000.0 });
                    }
                }
                this.field21576 = (this.field21570.isEmpty() ? "" : this.field21570.get(this.field21570.size() - 1));
                this.field21578 = null;
            }
            else {
                Class5030.field21569.error("Tried to pop one too many times! Mismatched push() and pop()?");
            }
        }
        else {
            Class5030.field21569.error("Cannot pop from profiler if profiler tick hasn't started - missing startTick()?");
        }
    }
    
    @Override
    public void method15300(final String s) {
        this.method15299();
        this.method15297(s);
    }
    
    @Override
    public void method15301(final java.util.function.Supplier<String> supplier) {
        this.method15299();
        this.method15298(supplier);
    }
    
    private Class7002 method15307() {
        if (this.field21578 == null) {
            this.field21578 = this.field21572.computeIfAbsent(this.field21576, p0 -> new Class7002(null));
        }
        return this.field21578;
    }
    
    @Override
    public void method15302(final String s) {
        Class7002.method21444(this.method15307()).addTo((Object)s, 1L);
    }
    
    @Override
    public void method15303(final java.util.function.Supplier<String> supplier) {
        Class7002.method21444(this.method15307()).addTo((Object)supplier.get(), 1L);
    }
    
    @Override
    public Class5756 method15304() {
        return new Class5755(this.field21572, this.field21574, this.field21575, Class8349.method27838(), this.field21573.getAsInt());
    }
    
    static {
        field21568 = Duration.ofMillis(100L).toNanos();
        field21569 = LogManager.getLogger();
    }
}
