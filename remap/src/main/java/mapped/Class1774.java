// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;
import org.apache.logging.log4j.LogManager;
import java.util.HashSet;
import java.awt.Dimension;
import java.io.InputStream;
import java.util.TreeSet;
import java.util.HashMap;
import javax.annotation.Nullable;
import com.mojang.datafixers.util.Pair;
import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Iterator;
import java.util.Collection;
import java.io.IOException;
import java.util.LinkedHashMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.Lists;
import java.util.Map;
import java.util.Set;
import java.util.List;
import org.apache.logging.log4j.Logger;

public class Class1774 extends Class1666 implements Class1664
{
    private static final Logger field9852;
    @Deprecated
    public static final ResourceLocation field9853;
    @Deprecated
    public static final ResourceLocation field9854;
    private final List<Class1912> field9855;
    private final Set<ResourceLocation> field9856;
    private final Map<ResourceLocation, Class1912> field9857;
    private final ResourceLocation field9858;
    private final int field9859;
    private Map<ResourceLocation, Class1912> field9860;
    private Map<ResourceLocation, Class1912> field9861;
    private Class1912[] field9862;
    private int field9863;
    private int field9864;
    private int field9865;
    private double field9866;
    private double field9867;
    private Class8891 field9868;
    public int field9869;
    public int field9870;
    private int field9871;
    private int field9872;
    private boolean field9873;
    private boolean field9874;
    private boolean field9875;
    
    public Class1774(final ResourceLocation field9858) {
        this.field9855 = Lists.newArrayList();
        this.field9856 = Sets.newHashSet();
        this.field9857 = Maps.newHashMap();
        this.field9860 = new LinkedHashMap<ResourceLocation, Class1912>();
        this.field9861 = new LinkedHashMap<ResourceLocation, Class1912>();
        this.field9862 = null;
        this.field9863 = -1;
        this.field9864 = -1;
        this.field9865 = -1;
        this.field9866 = -1.0;
        this.field9867 = -1.0;
        this.field9868 = new Class8891(0);
        this.field9869 = 0;
        this.field9870 = 0;
        this.field9858 = field9858;
        this.field9859 = Class8726.method30087();
        this.field9873 = field9858.equals(Class1774.field9853);
        this.field9874 = Config.method28955();
        this.field9875 = Config.method28928();
        if (this.field9873) {
            Config.method29000(this);
        }
    }
    
    @Override
    public void method5871(final Class6582 class6582) throws IOException {
    }
    
    public void method6331(final Class9430 class9430) {
        this.field9856.clear();
        this.field9856.addAll(class9430.field40452);
        Class1774.field9852.info("Created: {}x{}x{} {}-atlas", (Object)class9430.field40453, (Object)class9430.field40454, (Object)class9430.field40455, (Object)this.field9858);
        Class8995.method32105(this.method5869(), class9430.field40455, class9430.field40453, class9430.field40454);
        this.field9869 = class9430.field40453;
        this.field9870 = class9430.field40454;
        if (this.field9874) {
            Class8990.method32054(class9430.field40455, class9430.field40453, class9430.field40454, this);
        }
        this.method6339();
        for (final Class1912 class9431 : class9430.field40456) {
            this.field9857.put(class9431.method7503(), class9431);
            try {
                class9431.method7507();
            }
            catch (final Throwable t) {
                final Class7689 method24421 = Class7689.method24421(t, "Stitching texture atlas");
                final Class5204 method24422 = method24421.method24418("Texture being stitched together");
                method24422.method16297("Atlas path", this.field9858);
                method24422.method16297("Sprite", class9431);
                throw new Class2365(method24421);
            }
            if (class9431.method7511()) {
                class9431.method7516(this.field9855.size());
                this.field9855.add(class9431);
            }
        }
        Class8969.method31830(this);
        Config.method28852("Animated sprites: " + this.field9855.size());
        if (Config.method28928()) {
            for (final Class1912 obj : class9430.field40456) {
                final Class1912 field10387 = obj.field10387;
                if (field10387 != null) {
                    field10387.method7516(obj.method7515());
                    obj.method7522();
                    try {
                        field10387.method7507();
                    }
                    catch (final Exception ex) {
                        Config.method28847("Error uploading sprite single: " + field10387 + ", parent: " + obj);
                        ex.printStackTrace();
                    }
                }
            }
            Class8933.method31617(this.method5869());
        }
        if (Config.method28955()) {
            final List<Class1912> field10388 = class9430.field40456;
            if (Class9216.field39313) {
                Class8933.method31617(this.method5874().field38157);
                final Iterator<Class1912> iterator3 = field10388.iterator();
                while (iterator3.hasNext()) {
                    final Class1912 field10389 = iterator3.next().field10391;
                    if (field10389 != null) {
                        field10389.method7507();
                    }
                }
            }
            if (Class9216.field39314) {
                Class8933.method31617(this.method5874().field38158);
                final Iterator<Class1912> iterator4 = field10388.iterator();
                while (iterator4.hasNext()) {
                    final Class1912 field10390 = iterator4.next().field10392;
                    if (field10390 != null) {
                        field10390.method7507();
                    }
                }
            }
            Class8933.method31617(this.method5869());
        }
        Class9570.method35811(Class9570.field41308, this);
        this.method6355(class9430.field40453, class9430.field40454);
        if (Config.equals(System.getProperty("saveTextureMap"), "true")) {
            Config.method28847("Exporting texture map: " + this.field9858);
            Class8969.method31845("debug/" + this.field9858.method7797().replaceAll("/", "_"), this.method5869(), class9430.field40455, class9430.field40453, class9430.field40454);
            if (this.field9874) {
                if (Class9216.field39313) {
                    Class8969.method31845("debug/" + this.field9858.method7797().replaceAll("/", "_").replace(".png", "_n.png"), this.field9438.field38157, class9430.field40455, class9430.field40453, class9430.field40454);
                }
                if (Class9216.field39314) {
                    Class8969.method31845("debug/" + this.field9858.method7797().replaceAll("/", "_").replace(".png", "_s.png"), this.field9438.field38158, class9430.field40455, class9430.field40453, class9430.field40454);
                }
                Class8933.method31617(this.method5869());
            }
        }
    }
    
    public Class9430 method6332(final Class6582 class6582, final Stream<ResourceLocation> stream, final IProfiler class6583, final int i) {
        this.field9873 = this.field9858.equals(Class1774.field9853);
        this.field9874 = Config.method28955();
        this.field9875 = Config.method28928();
        int method6350 = i;
        this.field9860.clear();
        this.field9861.clear();
        this.field9868.method31288();
        class6583.startSection("preparing");
        final Set<? super ResourceLocation> set = stream.peek(class6587 -> {
            if (class6587 != null) {
                return;
            }
            else {
                throw new IllegalArgumentException("Location cannot be null!");
            }
        }).collect((Collector<? super ResourceLocation, ?, Set<? super ResourceLocation>>)Collectors.toSet());
        Config.method28847("Multitexture: " + Config.method28928());
        Class8969.method31829(this);
        set.addAll(this.field9860.keySet());
        Class8880.method31244(this, method6363(set, this.field9860.keySet()));
        set.addAll(this.field9860.keySet());
        if (i >= 4) {
            method6350 = this.method6350((Set<ResourceLocation>)set, class6582);
            Config.method28852("Mipmap levels: " + method6350);
        }
        final int method6351 = Class8969.method31846();
        final Class7498 class6584 = new Class7498(method6351, method6351, i);
        int min = Integer.MAX_VALUE;
        final int method6352 = method6352(method6350);
        this.field9863 = method6352;
        int b = 1 << i;
        class6583.method15300("extracting_frames");
        Class9570.method35811(Class9570.field41307, this, set);
        for (final Class9336 class6585 : this.method6333(class6582, (Set<ResourceLocation>)set)) {
            final int method6353 = class6585.method34592();
            final int method6354 = class6585.method34593();
            if (method6353 >= 1 && method6354 >= 1) {
                if (method6353 < method6352 || method6350 > 0) {
                    final int n = (method6350 > 0) ? Class8969.method31841(method6353, method6352) : Class8969.method31842(method6353, method6352);
                    if (n != method6353) {
                        if (!Class8969.method31836(method6353)) {
                            Config.method28852("Scaled non power of 2: " + class6585.method34591() + ", " + method6353 + " -> " + n);
                        }
                        else {
                            Config.method28852("Scaled too small texture: " + class6585.method34591() + ", " + method6353 + " -> " + n);
                        }
                        final int n2 = method6354 * n / method6353;
                        class6585.method34594(n);
                        class6585.method34595(n2);
                        class6585.method34598(n * 1.0 / method6353);
                    }
                }
                min = Math.min(min, Math.min(class6585.method34592(), class6585.method34593()));
                final int min2 = Math.min(Integer.lowestOneBit(class6585.method34592()), Integer.lowestOneBit(class6585.method34593()));
                if (min2 < b) {
                    Class1774.field9852.warn("Texture {} with size {}x{} limits mip level from {} to {}", (Object)class6585.method34591(), (Object)class6585.method34592(), (Object)class6585.method34593(), (Object) MathHelper.log2(b), (Object) MathHelper.log2(min2));
                    b = min2;
                }
                class6584.method23341(class6585);
            }
            else {
                Config.warn("Invalid sprite size: " + class6585.method34591());
            }
        }
        final int min3 = Math.min(min, b);
        int method6355 = MathHelper.log2(min3);
        if (method6355 < 0) {
            method6355 = 0;
        }
        int n3;
        if (method6355 < i) {
            Class1774.field9852.warn("{}: dropping miplevel from {} to {}, because of minimum power of two: {}", (Object)this.field9858, (Object)i, (Object)method6355, (Object)min3);
            n3 = method6355;
        }
        else {
            n3 = i;
        }
        class6583.method15300("register");
        class6584.method23341(method6353(Class1913.method7552(), method6352));
        class6583.method15300("stitching");
        try {
            class6584.method23342();
        }
        catch (final Class2361 class6586) {
            final Class7689 method6356 = Class7689.method24421(class6586, "Stitching");
            final Class5204 method6357 = method6356.method24418("Stitcher");
            method6357.method16297("Sprites", class6586.method9498().stream().map(class6588 -> String.format("%s[%dx%d]", class6588.method34591(), class6588.method34592(), class6588.method34593())).collect((Collector<? super Object, ?, String>)Collectors.joining(",")));
            method6357.method16297("Max Texture Size", method6351);
            throw new Class2365(method6356);
        }
        class6583.method15300("loading");
        final List<Class1912> method6358 = this.method6334(class6582, class6584, n3);
        class6583.endSection();
        return new Class9430((Set<ResourceLocation>)set, class6584.method23339(), class6584.method23340(), n3, method6358);
    }
    
    private Collection<Class9336> method6333(final Class6582 class6582, final Set<ResourceLocation> set) {
        final ArrayList arrayList = Lists.newArrayList();
        final ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        final Iterator<ResourceLocation> iterator = set.iterator();
        while (iterator.hasNext()) {
            if (Class1913.method7551().equals(iterator.next())) {
                continue;
            }
            arrayList.add(CompletableFuture.runAsync(() -> {
                this.method6336(class6583);
                Object e;
                try {
                    final ResourceLocation class6585;
                    class6584.method19933(class6585);
                    try {
                        final Class1671 class6587;
                        final Class8736 class6586 = new Class8736(class6587.toString(), class6587.method5887());
                        Class8637 field36232 = class6587.method5888((Class5092<Class8637>)Class8637.field36231);
                        if (field36232 == null) {
                            field36232 = Class8637.field36232;
                        }
                        field36232.method29301(class6586.field36713, class6586.field36714);
                        final Pair pair;
                        e = new Class9336(class6583, (int)pair.getFirst(), (int)pair.getSecond(), field36232);
                    }
                    catch (final Throwable t) {
                        throw t;
                    }
                    finally {
                        final Class1671 class6587;
                        if (class6587 != null) {
                            final Throwable t2;
                            if (t2 != null) {
                                try {
                                    class6587.close();
                                }
                                catch (final Throwable exception) {
                                    t2.addSuppressed(exception);
                                }
                            }
                            else {
                                class6587.close();
                            }
                        }
                    }
                }
                catch (final RuntimeException ex) {
                    final ResourceLocation class6585;
                    Class1774.field9852.error("Unable to parse metadata from {} : {}", (Object)class6585, (Object)ex);
                    this.method6362(class6583);
                    return;
                }
                catch (final IOException ex2) {
                    final ResourceLocation class6585;
                    Class1774.field9852.error("Using missing texture, unable to load {} : {}", (Object)class6585, (Object)ex2);
                    this.method6362(class6583);
                    return;
                }
                concurrentLinkedQueue2.add(e);
                return;
            }, Class8349.method27841()));
        }
        CompletableFuture.allOf((CompletableFuture<?>[])arrayList.toArray(new CompletableFuture[0])).join();
        return concurrentLinkedQueue;
    }
    
    private List<Class1912> method6334(final Class6582 class6582, final Class7498 class6583, final int n) {
        final ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        final ArrayList arrayList = Lists.newArrayList();
        class6583.method23343((class6583, n2, n3, n4, n5) -> {
            if (!class6583.method34591().equals(Class1913.method7552().method34591())) {
                arrayList.add(CompletableFuture.runAsync(() -> {
                    this.method6335(class6584, class6585, n6, n7, n8, n9, n10);
                    final Class1912 e2;
                    if (e2 != null) {
                        concurrentLinkedQueue2.add(e2);
                    }
                }, Class8349.method27841()));
            }
            else {
                final Class1913 e = new Class1913(this, class6583, n, n2, n3, n4, n5);
                e.method7536(class6582);
                concurrentLinkedQueue.add(e);
            }
        });
        CompletableFuture.allOf((CompletableFuture<?>[])arrayList.toArray(new CompletableFuture[0])).join();
        return Lists.newArrayList((Iterable)concurrentLinkedQueue);
    }
    
    @Nullable
    private Class1912 method6335(final Class6582 class6582, final Class9336 class6583, final int n, final int n2, final int n3, final int n4, final int n5) {
        final ResourceLocation method6336 = this.method6336(class6583.method34591());
        try (final Class1671 method6337 = class6582.method19933(method6336)) {
            final Class1912 class6584 = new Class1912(this, class6583, n3, n, n2, n4, n5, Class1846.method6637(method6337.method5887()));
            class6584.method7536(class6582);
            return class6584;
        }
        catch (final RuntimeException ex) {
            Class1774.field9852.error("Unable to parse metadata from {}", (Object)method6336, (Object)ex);
            return null;
        }
        catch (final IOException ex2) {
            Class1774.field9852.error("Using missing texture, unable to load {}", (Object)method6336, (Object)ex2);
            return null;
        }
    }
    
    public ResourceLocation method6336(final ResourceLocation class1932) {
        return this.method6342(class1932) ? new ResourceLocation(class1932.method7798(), class1932.method7797() + ".png") : new ResourceLocation(class1932.method7798(), String.format("textures/%s%s", class1932.method7797(), ".png"));
    }
    
    public void method6337() {
        boolean b = false;
        boolean b2 = false;
        this.method5872();
        int field9871 = 0;
        for (final Class1912 class1912 : this.field9855) {
            if (!this.method6348(class1912)) {
                continue;
            }
            class1912.method7510();
            if (class1912.method7517()) {
                ++field9871;
            }
            if (class1912.field10391 != null) {
                b = true;
            }
            if (class1912.field10392 == null) {
                continue;
            }
            b2 = true;
        }
        if (Config.method28928()) {
            for (final Class1912 class1913 : this.field9855) {
                if (!this.method6348(class1913)) {
                    continue;
                }
                if (!class1913.method7517()) {
                    continue;
                }
                final Class1912 field9872 = class1913.field10387;
                if (field9872 == null) {
                    continue;
                }
                class1913.method7522();
                field9872.method7510();
                if (!field9872.method7517()) {
                    continue;
                }
                ++field9871;
            }
            Class8933.method31617(this.method5869());
        }
        if (Config.method28955()) {
            if (b) {
                Class8933.method31617(this.method5874().field38157);
                for (final Class1912 class1914 : this.field9855) {
                    if (class1914.field10391 == null) {
                        continue;
                    }
                    if (!this.method6348(class1914)) {
                        continue;
                    }
                    if (!class1914.method7517()) {
                        continue;
                    }
                    class1914.field10391.method7510();
                    if (!class1914.field10391.method7517()) {
                        continue;
                    }
                    ++field9871;
                }
            }
            if (b2) {
                Class8933.method31617(this.method5874().field38158);
                for (final Class1912 class1915 : this.field9855) {
                    if (class1915.field10392 == null) {
                        continue;
                    }
                    if (!this.method6348(class1915)) {
                        continue;
                    }
                    if (!class1915.method7517()) {
                        continue;
                    }
                    class1915.field10392.method7510();
                    if (!class1915.field10392.method7517()) {
                        continue;
                    }
                    ++field9871;
                }
            }
            if (b || b2) {
                Class8933.method31617(this.method5869());
            }
        }
        if (this.field9873) {
            final int method5768 = Config.method28894().field4636.method5768();
            if (method5768 != this.field9872) {
                this.field9871 = field9871;
                this.field9872 = method5768;
            }
            if (Class7663.method24283()) {
                Class7663.method24288(this);
            }
        }
    }
    
    @Override
    public void method5857() {
        if (Class8726.method29984()) {
            this.method6337();
        }
        else {
            Class8726.method29991(this::method6337);
        }
    }
    
    public Class1912 method6338(final ResourceLocation class1932) {
        final Class1912 class1933 = this.field9857.get(class1932);
        return (class1933 != null) ? class1933 : this.field9857.get(Class1913.method7551());
    }
    
    public void method6339() {
        final Iterator<Class1912> iterator = this.field9857.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().close();
        }
        if (this.field9875) {
            final Iterator<Class1912> iterator2 = this.field9857.values().iterator();
            while (iterator2.hasNext()) {
                iterator2.next().method7523();
            }
        }
        this.field9857.clear();
        this.field9855.clear();
    }
    
    public ResourceLocation method6340() {
        return this.field9858;
    }
    
    public void method6341(final Class9430 class9430) {
        this.method5868(false, class9430.field40455 > 0);
    }
    
    private boolean method6342(final ResourceLocation class1932) {
        return this.method6343(class1932.method7797());
    }
    
    private boolean method6343(final String s) {
        return s.toLowerCase().startsWith("optifine/");
    }
    
    public Class1912 method6344(final String s) {
        return this.method6345(new ResourceLocation(s));
    }
    
    public Class1912 method6345(final ResourceLocation class1932) {
        return this.field9860.get(class1932);
    }
    
    public Class1912 method6346(final String s) {
        return this.method6347(new ResourceLocation(s));
    }
    
    public Class1912 method6347(final ResourceLocation class1932) {
        return this.field9857.get(class1932);
    }
    
    private boolean method6348(final Class1912 class1912) {
        if (!this.field9873) {
            return true;
        }
        if (class1912 == Class8969.field37706 || class1912 == Class8969.field37707) {
            return Config.method28869();
        }
        if (class1912 == Class8969.field37708 || class1912 == Class8969.field37709) {
            return Config.method28872();
        }
        if (class1912 != Class8969.field37710 && class1912 != Class8969.field37711) {
            return (class1912 != Class8969.field37712) ? Config.method28938() : Config.method28871();
        }
        return Config.method28874();
    }
    
    public int method6349() {
        return this.field9868.method31289();
    }
    
    private int method6350(final Set<ResourceLocation> set, final Class6582 class6582) {
        int method6351 = this.method6351(set, class6582, 20);
        if (method6351 < 16) {
            method6351 = 16;
        }
        final int method6352 = MathHelper.smallestEncompassingPowerOfTwo(method6351);
        if (method6352 > 16) {
            Config.method28852("Sprite size: " + method6352);
        }
        int method6353 = MathHelper.log2(method6352);
        if (method6353 < 4) {
            method6353 = 4;
        }
        return method6353;
    }
    
    private int method6351(final Set<ResourceLocation> set, final Class6582 class6582, final int n) {
        final HashMap hashMap = new HashMap();
        final Iterator<ResourceLocation> iterator = set.iterator();
        while (iterator.hasNext()) {
            final ResourceLocation method6336 = this.method6336(iterator.next());
            try {
                final Class1671 method6337 = class6582.method19933(method6336);
                if (method6337 == null) {
                    continue;
                }
                final InputStream method6338 = method6337.method5887();
                if (method6338 == null) {
                    continue;
                }
                final Dimension method6339 = Class8969.method31843(method6338, "png");
                if (method6339 == null) {
                    continue;
                }
                final int method6340 = MathHelper.smallestEncompassingPowerOfTwo(method6339.width);
                if (!hashMap.containsKey(method6340)) {
                    hashMap.put(method6340, 1);
                }
                else {
                    hashMap.put(method6340, (int)hashMap.get(method6340) + 1);
                }
            }
            catch (final Exception ex) {}
        }
        int n2 = 0;
        final TreeSet set2 = new TreeSet(hashMap.keySet());
        final Iterator iterator2 = set2.iterator();
        while (iterator2.hasNext()) {
            n2 += (int)hashMap.get((int)iterator2.next());
        }
        int n3 = 16;
        int n4 = 0;
        final int n5 = n2 * n / 100;
        for (final int intValue : set2) {
            n4 += (int)hashMap.get(intValue);
            if (intValue > n3) {
                n3 = intValue;
            }
            if (n4 > n5) {
                return n3;
            }
        }
        return n3;
    }
    
    private static int method6352(final int n) {
        int n2 = 1 << n;
        if (n2 < 8) {
            n2 = 8;
        }
        return n2;
    }
    
    private static Class9336 method6353(final Class9336 class9336, final int n) {
        if (class9336.method34592() >= n && class9336.method34593() >= n) {
            return class9336;
        }
        return new Class9336(class9336.method34591(), Math.max(class9336.method34592(), n), Math.max(class9336.method34593(), n), class9336.method34596());
    }
    
    public boolean method6354() {
        return Class8933.method31667() == this.method5869();
    }
    
    private void method6355(final int n, final int n2) {
        this.field9864 = -1;
        this.field9865 = -1;
        this.field9862 = null;
        if (this.field9863 > 0) {
            this.field9864 = n / this.field9863;
            this.field9865 = n2 / this.field9863;
            this.field9862 = new Class1912[this.field9864 * this.field9865];
            this.field9866 = 1.0 / this.field9864;
            this.field9867 = 1.0 / this.field9865;
            for (final Class1912 class1912 : this.field9857.values()) {
                final double n3 = 0.5 / n;
                final double n4 = 0.5 / n2;
                final double n5 = Math.min(class1912.method7497(), class1912.method7498()) + n3;
                final double n6 = Math.min(class1912.method7500(), class1912.method7501()) + n4;
                final double n7 = Math.max(class1912.method7497(), class1912.method7498()) - n3;
                final double n8 = Math.max(class1912.method7500(), class1912.method7501()) - n4;
                final int n9 = (int)(n5 / this.field9866);
                final int n10 = (int)(n6 / this.field9867);
                final int n11 = (int)(n7 / this.field9866);
                final int n12 = (int)(n8 / this.field9867);
                for (int i = n9; i <= n11; ++i) {
                    if (i >= 0 && i < this.field9864) {
                        for (int j = n10; j <= n12; ++j) {
                            if (j >= 0 && j < this.field9864) {
                                this.field9862[j * this.field9864 + i] = class1912;
                            }
                            else {
                                Config.warn("Invalid grid V: " + j + ", icon: " + class1912.method7503());
                            }
                        }
                    }
                    else {
                        Config.warn("Invalid grid U: " + i + ", icon: " + class1912.method7503());
                    }
                }
            }
        }
    }
    
    public Class1912 method6356(final double n, final double n2) {
        if (this.field9862 != null) {
            final int n3 = (int)(n2 / this.field9867) * this.field9864 + (int)(n / this.field9866);
            return (n3 >= 0 && n3 <= this.field9862.length) ? this.field9862[n3] : null;
        }
        return null;
    }
    
    public int method6357() {
        return this.field9855.size();
    }
    
    public int method6358() {
        return this.field9871;
    }
    
    public Class1912 method6359(final ResourceLocation class1932) {
        if (class1932 == null) {
            throw new IllegalArgumentException("Location cannot be null!");
        }
        final Class1912 class1933 = this.field9860.get(class1932);
        if (class1933 == null) {
            this.field9856.add(class1932);
            final Class1912 class1934 = new Class1912(class1932);
            this.field9860.put(class1932, class1934);
            class1934.method7514(this.field9868);
            return class1934;
        }
        return class1933;
    }
    
    public boolean method6360() {
        return this.field9873;
    }
    
    public Class8891 method6361() {
        return this.field9868;
    }
    
    private void method6362(final ResourceLocation class1932) {
        final Class1912 class1933 = this.field9860.get(class1932);
        if (class1933 != null) {
            this.field9861.put(class1932, class1933);
        }
    }
    
    private static <T> Set<T> method6363(final Set<T> set, final Set<T> set2) {
        final HashSet set3 = new HashSet();
        set3.addAll(set);
        set3.addAll(set2);
        return set3;
    }
    
    @Override
    public String toString() {
        return "" + this.field9858;
    }
    
    static {
        field9852 = LogManager.getLogger();
        field9853 = Class3427.field16192;
        field9854 = new ResourceLocation("textures/atlas/particles.png");
    }
}
