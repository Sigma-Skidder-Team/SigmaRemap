// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Sets;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.MarkerManager;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import com.google.common.collect.Lists;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Maps;

import java.util.List;
import com.google.common.collect.Multimap;
import java.util.Map;
import java.util.Set;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;

public class Class9382
{
    private static final Marker field40242;
    private static final Logger field40243;
    private static final Set<ResourceLocation> field40244;
    private final Class1784 field40245;
    private final Class5760 field40246;
    private boolean field40247;
    private final Class7278 field40248;
    private final Class6379 field40249;
    private final Class9130 field40250;
    private final Class874 field40251;
    private final Class8399 field40252;
    private int field40253;
    private final Map<Class6834, Class9196> field40254;
    private final Multimap<Class286, Class6834> field40255;
    private final List<Class6833> field40256;
    private final Map<Class6834, Integer> field40257;
    private final Map<Class6834, Integer> field40258;
    private final List<Class687> field40259;
    private final List<Class6833> field40260;
    private final List<Class7832> field40261;
    
    public Class9382(final Class1784 field40245, final Class5760 field40246, final Class6582 class6582) {
        this.field40248 = new Class7278();
        this.field40249 = this.field40248.method22312();
        this.field40251 = new Class874();
        this.field40252 = new Class8399(this.field40248, this.field40251);
        this.field40254 = Maps.newHashMap();
        this.field40255 = (Multimap<Class286, Class6834>)HashMultimap.create();
        this.field40256 = Lists.newArrayList();
        this.field40257 = Maps.newHashMap();
        this.field40258 = Maps.newHashMap();
        this.field40259 = Lists.newArrayList();
        this.field40260 = Lists.newArrayList();
        this.field40261 = Lists.newArrayList();
        this.field40245 = field40245;
        this.field40246 = field40246;
        this.field40250 = new Class9130(class6582);
    }
    
    public void method34832() {
        Class9382.field40244.clear();
        for (final Class7795 class7795 : Registry.field205) {
            final ResourceLocation method25124 = class7795.method25124();
            if (this.field40245.method6419(method25124) != null) {
                continue;
            }
            Class9382.field40243.warn("Missing sound for event: {}", (Object) Registry.field205.getKey(class7795));
            Class9382.field40244.add(method25124);
        }
        this.method34836();
        this.method34833();
    }
    
    private synchronized void method34833() {
        if (!this.field40247) {
            try {
                this.field40248.method22308();
                this.field40249.method19053();
                this.field40249.method19051(this.field40246.method17122(Class286.field1578));
                this.field40250.method33128(this.field40261).thenRun(this.field40261::clear);
                this.field40247 = true;
                Class9382.field40243.info(Class9382.field40242, "Sound engine started");
            }
            catch (final RuntimeException ex) {
                Class9382.field40243.error(Class9382.field40242, "Error starting SoundSystem. Turning off sounds & music", (Throwable)ex);
            }
        }
    }
    
    private float method34834(final Class286 class286) {
        return (class286 != null && class286 != Class286.field1578) ? this.field40246.method17122(class286) : 1.0f;
    }
    
    public void method34835(final Class286 class286, final float n) {
        if (this.field40247) {
            if (class286 != Class286.field1578) {
                this.field40254.forEach((p0, class287) -> class287.method33649(class289 -> {
                    this.method34848(class288);
                    if (n2 > 0.0f) {
                        class289.method34878(n2);
                    }
                    else {
                        class289.method34873();
                    }
                }));
            }
            else {
                this.field40249.method19051(n);
            }
        }
    }
    
    public void method34836() {
        if (this.field40247) {
            this.method34838();
            this.field40250.method33127();
            this.field40248.method22311();
            this.field40247 = false;
        }
    }
    
    public void method34837(final Class6834 class6834) {
        if (this.field40247) {
            final Class9196 class6835 = this.field40254.get(class6834);
            if (class6835 != null) {
                class6835.method33649(Class9383::method34873);
            }
        }
    }
    
    public void method34838() {
        if (this.field40247) {
            this.field40251.method5389();
            this.field40254.values().forEach(class9196 -> class9196.method33649(Class9383::method34873));
            this.field40254.clear();
            this.field40252.method28011();
            this.field40257.clear();
            this.field40256.clear();
            this.field40255.clear();
            this.field40258.clear();
            this.field40260.clear();
        }
    }
    
    public void method34839(final Class687 class687) {
        this.field40259.add(class687);
    }
    
    public void method34840(final Class687 class687) {
        this.field40259.remove(class687);
    }
    
    public void method34841(final boolean b) {
        if (!b) {
            this.method34842();
        }
        this.field40252.method28010();
    }
    
    private void method34842() {
        ++this.field40253;
        this.field40260.forEach(this::method34844);
        this.field40260.clear();
        for (final Class6833 class6833 : this.field40256) {
            class6833.method20918();
            if (class6833.method20919()) {
                this.method34837(class6833);
            }
            else {
                this.method34848(class6833);
                this.method34847(class6833);
                final Vec3d class6834 = new Vec3d(class6833.method20929(), class6833.method20930(), class6833.method20931());
                final Class9196 class6835 = this.field40254.get(class6833);
                if (class6835 == null) {
                    continue;
                }
                class6835.method33649(class6840 -> {
                    class6840.method34878(n);
                    class6840.method34876(n2);
                    class6840.method34875(class6839);
                    return;
                });
            }
        }
        try {
            final Iterator<Map.Entry<Class6834, Class9196>> iterator2 = this.field40254.entrySet().iterator();
            while (iterator2.hasNext()) {
                final Map.Entry<K, Class9196> entry = (Map.Entry<K, Class9196>)iterator2.next();
                final Class9196 class6836 = entry.getValue();
                final Class6834 class6837 = (Class6834)entry.getKey();
                if (this.field40246.method17122(class6837.method20923()) <= 0.0f) {
                    class6836.method33649(Class9383::method34873);
                    iterator2.remove();
                }
                else {
                    if (!class6836.method33648() || this.field40258.get(class6837) > this.field40253) {
                        continue;
                    }
                    final int method20926 = class6837.method20926();
                    if (class6837.method20924() && method20926 > 0) {
                        this.field40257.put(class6837, this.field40253 + method20926);
                    }
                    iterator2.remove();
                    Class9382.field40243.debug(Class9382.field40242, "Removed channel {} because it's not playing anymore", (Object)class6836);
                    this.field40258.remove(class6837);
                    try {
                        this.field40255.remove((Object)class6837.method20923(), (Object)class6837);
                    }
                    catch (final RuntimeException ex) {}
                    if (!(class6837 instanceof Class6833)) {
                        continue;
                    }
                    this.field40256.remove(class6837);
                }
            }
        }
        catch (final ConcurrentModificationException ex2) {}
        final Iterator<Map.Entry<Class6834, Integer>> iterator3 = this.field40257.entrySet().iterator();
        while (iterator3.hasNext()) {
            final Map.Entry<K, Integer> entry2 = (Map.Entry<K, Integer>)iterator3.next();
            if (this.field40253 >= entry2.getValue()) {
                final Class6834 class6838 = (Class6834)entry2.getKey();
                if (class6838 instanceof Class6833) {
                    ((Class6833)class6838).method20918();
                }
                this.method34844(class6838);
                iterator3.remove();
            }
        }
    }
    
    public boolean method34843(final Class6834 class6834) {
        return this.field40247 && ((this.field40258.containsKey(class6834) && this.field40258.get(class6834) <= this.field40253) || this.field40254.containsKey(class6834));
    }
    
    public void method34844(final Class6834 class6834) {
        if (this.field40247) {
            final Class7833 method20921 = class6834.method20921(this.field40245);
            final ResourceLocation method20922 = class6834.method20920();
            if (method20921 != null) {
                if (!this.field40259.isEmpty()) {
                    final Iterator<Class687> iterator = this.field40259.iterator();
                    while (iterator.hasNext()) {
                        iterator.next().method3818(class6834, method20921);
                    }
                }
                if (this.field40249.method19052() > 0.0f) {
                    final Class7832 method20923 = class6834.method20922();
                    if (method20923 != Class1784.field9895) {
                        final float n = Math.max(class6834.method20927(), 1.0f) * method20923.method25311();
                        final Class286 method20924 = class6834.method20923();
                        final float method20925 = this.method34848(class6834);
                        this.method34847(class6834);
                        class6834.method20932();
                        class6834.method20925();
                        if (method20925 == 0.0f && !class6834.method20917()) {
                            Class9382.field40243.debug(Class9382.field40242, "Skipped playing sound {}, volume was zero.", (Object)method20923.method25304());
                        }
                        else {
                            final boolean b = class6834.method20924() && class6834.method20926() == 0;
                            final Vec3d class6835 = new Vec3d(class6834.method20929(), class6834.method20930(), class6834.method20931());
                            final Class9196 method20926 = this.field40252.method28008(method20923.method25309() ? Class269.field1461 : Class269.field1460);
                            Class9382.field40243.debug(Class9382.field40242, "Playing sound {} for event {}", (Object)method20923.method25304(), (Object)method20922);
                            this.field40258.put(class6834, this.field40253 + 20);
                            this.field40254.put(class6834, method20926);
                            this.field40255.put((Object)method20924, (Object)class6834);
                            method20926.method33649(class6838 -> {
                                class6838.method34876(n2);
                                class6838.method34878(n3);
                                if (class6836 != Class229.field810) {
                                    class6838.method34879();
                                }
                                else {
                                    class6838.method34880(n4);
                                }
                                class6838.method34877(b2);
                                class6838.method34875(class6837);
                                class6838.method34881(b3);
                                return;
                            });
                            if (method20923.method25309()) {
                                this.field40250.method33126(method20923.method25305()).thenAccept(p1 -> class6839.method33649(class6841 -> {
                                    class6841.method34883(class6840);
                                    class6841.method34869();
                                }));
                            }
                            else {
                                this.field40250.method33125(method20923.method25305()).thenAccept(p1 -> class6842.method33649(class6844 -> {
                                    class6844.method34882(class6843);
                                    class6844.method34869();
                                }));
                            }
                            if (class6834 instanceof Class6833) {
                                this.field40256.add((Class6833)class6834);
                            }
                        }
                    }
                    else if (Class9382.field40244.add(method20922)) {
                        Class9382.field40243.warn(Class9382.field40242, "Unable to play empty soundEvent: {}", (Object)method20922);
                    }
                }
                else {
                    Class9382.field40243.debug(Class9382.field40242, "Skipped playing soundEvent: {}, master volume was zero", (Object)method20922);
                }
            }
            else if (Class9382.field40244.add(method20922)) {
                Class9382.field40243.warn(Class9382.field40242, "Unable to play unknown soundEvent: {}", (Object)method20922);
            }
        }
    }
    
    public void method34845(final Class6833 class6833) {
        this.field40260.add(class6833);
    }
    
    public void method34846(final Class7832 class7832) {
        this.field40261.add(class7832);
    }
    
    private float method34847(final Class6834 class6834) {
        return MathHelper.clamp(class6834.method20928(), 0.5f, 2.0f);
    }
    
    private float method34848(final Class6834 class6834) {
        return MathHelper.clamp(class6834.method20927() * this.method34834(class6834.method20923()), 0.0f, 1.0f);
    }
    
    public void method34849() {
        if (this.field40247) {
            this.field40252.method28009(stream -> stream.forEach(Class9383::method34871));
        }
    }
    
    public void method34850() {
        if (this.field40247) {
            this.field40252.method28009(stream -> stream.forEach(Class9383::method34872));
        }
    }
    
    public void method34851(final Class6834 class6834, final int n) {
        this.field40257.put(class6834, this.field40253 + n);
    }
    
    public void method34852(final Class6092 class6093) {
        if (this.field40247) {
            if (class6093.method18167()) {
                this.field40251.execute(() -> {
                    class6093.method18161();
                    class6093.method18173();
                    class6093.method18174();
                    this.field40249.method19049(class6094);
                    this.field40249.method19050(class6095, class6096);
                });
            }
        }
    }
    
    public void method34853(final ResourceLocation class1932, final Class286 class1933) {
        if (class1933 == null) {
            if (class1932 != null) {
                for (final Class6834 class1934 : this.field40254.keySet()) {
                    if (!class1934.method20920().equals(class1932)) {
                        continue;
                    }
                    this.method34837(class1934);
                }
            }
            else {
                this.method34838();
            }
        }
        else {
            for (final Class6834 class1935 : this.field40255.get((Object)class1933)) {
                if (class1932 != null && !class1935.method20920().equals(class1932)) {
                    continue;
                }
                this.method34837(class1935);
            }
        }
    }
    
    public String method34854() {
        return this.field40248.method22315();
    }
    
    static {
        field40242 = MarkerManager.getMarker("SOUNDS");
        field40243 = LogManager.getLogger();
        field40244 = Sets.newHashSet();
    }
}
