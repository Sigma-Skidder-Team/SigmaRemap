// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.util.Locale;
import java.io.Writer;
import org.apache.commons.io.IOUtils;

import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.io.FileOutputStream;
import java.io.File;
import it.unimi.dsi.fastutil.objects.Object2LongMap;
import java.util.TreeMap;
import com.google.common.collect.Maps;

import java.util.ArrayList;
import java.util.Collections;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Map;
import java.util.Comparator;
import com.google.common.base.Splitter;
import org.apache.logging.log4j.Logger;

public class Class5755 implements Class5756
{
    private static final Logger field23364;
    private static final Class7003 field23365;
    private static final Splitter field23366;
    private static final Comparator<Map.Entry<String, Class7933>> field23367;
    private final Map<String, ? extends Class7003> field23368;
    private final long field23369;
    private final int field23370;
    private final long field23371;
    private final int field23372;
    private final int field23373;
    
    public Class5755(final Map<String, ? extends Class7003> field23368, final long field23369, final int field23370, final long field23371, final int field23372) {
        this.field23368 = field23368;
        this.field23369 = field23369;
        this.field23370 = field23370;
        this.field23371 = field23371;
        this.field23372 = field23372;
        this.field23373 = field23372 - field23370;
    }
    
    private Class7003 method17083(final String s) {
        final Class7003 class7003 = this.field23368.get(s);
        return (class7003 == null) ? Class5755.field23365 : class7003;
    }
    
    @Override
    public List<Class1943> method17084(String string) {
        long method21438 = this.method17083("root").method21438();
        final Class7003 method21439 = this.method17083(string);
        final long method21440 = method21439.method21438();
        final long method21441 = method21439.method21439();
        final ArrayList arrayList = Lists.newArrayList();
        if (!string.isEmpty()) {
            string += '\u001e';
        }
        long n = 0L;
        for (final String s : this.field23368.keySet()) {
            if (!method17085(string, s)) {
                continue;
            }
            n += this.method17083(s).method21438();
        }
        final float n2 = (float)n;
        if (n < method21440) {
            n = method21440;
        }
        if (method21438 < n) {
            method21438 = n;
        }
        for (final String s2 : this.field23368.keySet()) {
            if (!method17085(string, s2)) {
                continue;
            }
            final Class7003 method21442 = this.method17083(s2);
            final long method21443 = method21442.method21438();
            arrayList.add(new Class1943(s2.substring(string.length()), method21443 * 100.0 / n, method21443 * 100.0 / method21438, method21442.method21439()));
        }
        if (n > n2) {
            arrayList.add(new Class1943("unspecified", (n - n2) * 100.0 / n, (n - n2) * 100.0 / method21438, method21441));
        }
        Collections.sort((List<Comparable>)arrayList);
        arrayList.add(0, new Class1943(string, 100.0, n * 100.0 / method21438, method21441));
        return arrayList;
    }
    
    private static boolean method17085(final String prefix, final String s) {
        if (s.length() > prefix.length()) {
            if (s.startsWith(prefix)) {
                return s.indexOf(30, prefix.length() + 1) < 0;
            }
        }
        return false;
    }
    
    private Map<String, Class7933> method17086() {
        final TreeMap treeMap = Maps.newTreeMap();
        this.field23368.forEach((p1, class7003) -> {
            class7003.method21440();
            final Object2LongMap object2LongMap;
            if (!object2LongMap.isEmpty()) {
                object2LongMap.forEach((key, n) -> {
                    Class5755.field23366.splitToList((CharSequence)s);
                    map.computeIfAbsent(key, p0 -> new Class7933(null)).method25730(list.iterator(), n);
                });
            }
        });
        return treeMap;
    }
    
    @Override
    public long method17087() {
        return this.field23369;
    }
    
    @Override
    public int method17088() {
        return this.field23370;
    }
    
    @Override
    public long method17089() {
        return this.field23371;
    }
    
    @Override
    public int method17090() {
        return this.field23372;
    }
    
    @Override
    public boolean method17091(final File file) {
        file.getParentFile().mkdirs();
        Writer writer = null;
        boolean b;
        try {
            writer = new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8);
            writer.write(this.method17092(this.method17106(), this.method17098()));
            return true;
        }
        catch (final Throwable t) {
            Class5755.field23364.error("Could not save profiler results to {}", file, t);
            b = false;
        }
        finally {
            IOUtils.closeQuietly(writer);
        }
        return b;
    }
    
    public String method17092(final long n, final int i) {
        final StringBuilder sb = new StringBuilder();
        sb.append("---- Minecraft Profiler Results ----\n");
        sb.append("// ");
        sb.append(method17097());
        sb.append("\n\n");
        sb.append("Version: ").append(Class9528.method35579().getId()).append('\n');
        sb.append("Time span: ").append(n / 1000000L).append(" ms\n");
        sb.append("Tick span: ").append(i).append(" ticks\n");
        sb.append("// This is approximately ").append(String.format(Locale.ROOT, "%.2f", i / (n / 1.0E9f))).append(" ticks per second. It should be ").append(20).append(" ticks per second\n\n");
        sb.append("--- BEGIN PROFILE DUMP ---\n\n");
        this.method17094(0, "root", sb);
        sb.append("--- END PROFILE DUMP ---\n\n");
        final Map<String, Class7933> method17086 = this.method17086();
        if (!method17086.isEmpty()) {
            sb.append("--- BEGIN COUNTER DUMP ---\n\n");
            this.method17096(method17086, sb, i);
            sb.append("--- END COUNTER DUMP ---\n\n");
        }
        return sb.toString();
    }
    
    private static StringBuilder method17093(final StringBuilder sb, final int i) {
        sb.append(String.format("[%02d] ", i));
        for (int j = 0; j < i; ++j) {
            sb.append("|   ");
        }
        return sb;
    }
    
    private void method17094(final int n, final String str, final StringBuilder sb) {
        final List<Class1943> method17084 = this.method17084(str);
        this.field23368.get(str).method21440().forEach((str2, obj2) -> method17093(sb2, n2).append('#').append(str2).append(' ').append(obj2).append('/').append(obj2 / this.field23373).append('\n'));
        if (method17084.size() >= 3) {
            for (int i = 1; i < method17084.size(); ++i) {
                final Class1943 class1943 = method17084.get(i);
                method17093(sb, n).append(class1943.field10595).append('(').append(class1943.field10594).append('/').append(String.format(Locale.ROOT, "%.0f", class1943.field10594 / (float)this.field23373)).append(')').append(" - ").append(String.format(Locale.ROOT, "%.2f", class1943.field10592)).append("%/").append(String.format(Locale.ROOT, "%.2f", class1943.field10593)).append("%\n");
                if (!"unspecified".equals(class1943.field10595)) {
                    try {
                        this.method17094(n + 1, str + '\u001e' + class1943.field10595, sb);
                    }
                    catch (final Exception obj) {
                        sb.append("[[ EXCEPTION ").append(obj).append(" ]]");
                    }
                }
            }
        }
    }
    
    private void method17095(final int n, final String str, final Class7933 class7933, final int n2, final StringBuilder sb) {
        method17093(sb, n).append(str).append(" total:").append(Class7933.method25733(class7933)).append('/').append(Class7933.method25732(class7933)).append(" average: ").append(Class7933.method25733(class7933) / n2).append('/').append(Class7933.method25732(class7933) / n2).append('\n');
        Class7933.method25734(class7933).entrySet().stream().sorted(Class5755.field23367).forEach(entry -> this.method17095(n3 + 1, entry.getKey(), (Class7933)entry.getValue(), n4, sb2));
    }
    
    private void method17096(final Map<String, Class7933> map, final StringBuilder sb, final int n) {
        map.forEach((str, class7933) -> {
            sb2.append("-- Counter: ").append(str).append(" --\n");
            this.method17095(0, "root", Class7933.method25734(class7933).get("root"), n2, sb2);
            sb2.append("\n\n");
        });
    }
    
    private static String method17097() {
        final String[] array = { "Shiny numbers!", "Am I not running fast enough? :(", "I'm working as hard as I can!", "Will I ever be good enough for you? :(", "Speedy. Zoooooom!", "Hello world", "40% better than a crash report.", "Now with extra numbers", "Now with less numbers", "Now with the same numbers", "You should add flames to things, it makes them go faster!", "Do you feel the need for... optimization?", "*cracks redstone whip*", "Maybe if you treated it better then it'll have more motivation to work faster! Poor server." };
        try {
            return array[(int)(Util.method27838() % array.length)];
        }
        catch (final Throwable t) {
            return "Witty comment unavailable :(";
        }
    }
    
    @Override
    public int method17098() {
        return this.field23373;
    }
    
    static {
        field23364 = LogManager.getLogger();
        field23365 = new Class7004();
        field23366 = Splitter.on('\u001e');
        field23367 = Map.Entry.comparingByValue(Comparator.comparingLong(class7933 -> Class7933.method25732(class7933))).reversed();
    }
}
