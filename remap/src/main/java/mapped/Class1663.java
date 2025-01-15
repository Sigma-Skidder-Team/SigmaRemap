// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;

import java.util.HashSet;
import java.util.concurrent.CompletionStage;
import java.util.function.Function;
import java.util.Iterator;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import java.io.IOException;
import com.google.common.collect.Sets;
import com.google.common.collect.Maps;
import java.util.Set;
import java.util.Map;
import org.apache.logging.log4j.Logger;

public class Class1663 implements Class1664, AutoCloseable, Class1662
{
    private static final Logger field9427;
    public static final Class1932 field9428;
    private final Map<Class1932, Class1666> field9429;
    private final Set<Class1664> field9430;
    private final Map<String, Integer> field9431;
    private final Class6582 field9432;
    private Class1666 field9433;
    private Class1932 field9434;
    
    public Class1663(final Class6582 field9432) {
        this.field9429 = Maps.newHashMap();
        this.field9430 = Sets.newHashSet();
        this.field9431 = Maps.newHashMap();
        this.field9432 = field9432;
    }
    
    public void method5849(final Class1932 class1932) {
        if (Class8726.method29984()) {
            this.method5850(class1932);
        }
        else {
            Class8726.method29991(() -> this.method5850(class1932));
        }
    }
    
    private void method5850(Class1932 method25542) {
        if (Class8571.method29006()) {
            method25542 = Class7890.method25542(method25542);
        }
        Class1666 method25543 = this.field9429.get(method25542);
        if (Class8880.method31235()) {
            method25543 = Class8880.method31238(method25543, this.field9429);
        }
        if (method25543 == null) {
            method25543 = new Class1767(method25542);
            this.method5851(method25542, method25543);
        }
        if (!Class8571.method28955()) {
            method25543.method5872();
        }
        else {
            Class8990.method32049(method25543);
        }
        this.field9433 = method25543;
        this.field9434 = method25542;
    }
    
    public void method5851(final Class1932 class1932, Class1666 method5852) {
        method5852 = this.method5852(class1932, method5852);
        final Class1666 class1933 = this.field9429.put(class1932, method5852);
        if (class1933 != method5852) {
            if (class1933 != null) {
                if (class1933 != Class1913.method7553()) {
                    class1933.method5870();
                    this.field9430.remove(class1933);
                }
            }
            if (method5852 instanceof Class1664) {
                this.field9430.add((Class1664)method5852);
            }
        }
    }
    
    private Class1666 method5852(final Class1932 class1932, final Class1666 class1933) {
        try {
            class1933.method5871(this.field9432);
            return class1933;
        }
        catch (final IOException ex) {
            if (class1932 != Class1663.field9428) {
                Class1663.field9427.warn("Failed to load texture: {}", (Object)class1932, (Object)ex);
            }
            return Class1913.method7553();
        }
        catch (final Throwable t) {
            final Class7689 method24421 = Class7689.method24421(t, "Registering texture");
            final Class5204 method24422 = method24421.method24418("Resource location being registered");
            method24422.method16297("Resource location", class1932);
            method24422.method16296("Texture object class", () -> class1934.getClass().getName());
            throw new Class2365(method24421);
        }
    }
    
    @Nullable
    public Class1666 method5853(final Class1932 class1932) {
        return this.field9429.get(class1932);
    }
    
    public Class1932 method5854(final String s, final Class1773 class1773) {
        final Integer n = this.field9431.get(s);
        Integer n2;
        if (n != null) {
            n2 = n + 1;
        }
        else {
            n2 = 1;
        }
        this.field9431.put(s, n2);
        final Class1932 class1774 = new Class1932(String.format("dynamic/%s_%d", s, n2));
        this.method5851(class1774, class1773);
        return class1774;
    }
    
    public CompletableFuture<Void> method5855(final Class1932 class1932, final Executor executor) {
        if (this.field9429.containsKey(class1932)) {
            return CompletableFuture.completedFuture((Void)null);
        }
        final Class1770 class1933 = new Class1770(this.field9432, class1932, executor);
        this.field9429.put(class1932, class1933);
        return class1933.method6316().thenRunAsync(() -> this.method5851(class1934, class1935), Class1663::method5856);
    }
    
    private static void method5856(final Runnable runnable) {
        Class869.method5277().execute(() -> Class8726.method29991(runnable2::run));
    }
    
    @Override
    public void method5857() {
        final Iterator<Class1664> iterator = this.field9430.iterator();
        while (iterator.hasNext()) {
            iterator.next().method5857();
        }
    }
    
    public void method5858(final Class1932 class1932) {
        final Class1666 method5853 = this.method5853(class1932);
        if (method5853 != null) {
            this.field9429.remove(class1932);
            Class8995.method32102(method5853.method5869());
        }
    }
    
    @Override
    public void close() {
        this.field9429.values().forEach(Class1666::method5870);
        this.field9429.clear();
        this.field9430.clear();
        this.field9431.clear();
    }
    
    @Override
    public CompletableFuture<Void> method5785(final Class7885 class7885, final Class6582 class7886, final IProfiler class7887, final IProfiler class7888, final Executor executor, final Executor executor2) {
        Class8571.method28847("*** Reloading textures ***");
        Class8571.method28852("Resource packs: " + Class8571.method28904());
        final Iterator<Class1932> iterator = this.field9429.keySet().iterator();
        while (iterator.hasNext()) {
            final Class1932 class7889 = iterator.next();
            if (!class7889.method7797().startsWith("optifine/") && !Class8880.method31248(class7889)) {
                continue;
            }
            final Class1666 class7890 = this.field9429.get(class7889);
            if (class7890 instanceof Class1666) {
                class7890.method5870();
            }
            iterator.remove();
        }
        Class8880.method31243();
        return CompletableFuture.allOf(Class548.method3215(this, executor), this.method5855(Class573.field3421, executor)).thenCompose((Function<? super Void, ? extends CompletionStage<Object>>)class7885::method25538).thenAcceptAsync(p2 -> {
            Class1913.method7553();
            Class5079.method15797(this.field9432);
            new HashSet(this.field9429.entrySet()).iterator();
            final Iterator iterator2;
            while (iterator2.hasNext()) {
                final Map.Entry<Class1932, V> entry = iterator2.next();
                final Class1932 class7892 = entry.getKey();
                final Class1666 class7893 = (Class1666)entry.getValue();
                if (class7893 == Class1913.method7553() && !class7892.equals(Class1913.method7551())) {
                    iterator2.remove();
                }
                else {
                    class7893.method5873(this, class7891, class7892, executor3);
                }
            }
        }, runnable -> Class8726.method29991(runnable::run));
    }
    
    public void method5859() {
        for (final Map.Entry<Class1932, V> entry : new HashSet(this.field9429.entrySet())) {
            final Class1932 class1932 = entry.getKey();
            final Class1666 class1933 = (Class1666)entry.getValue();
            if (!(class1933 instanceof Class1772)) {
                continue;
            }
            this.method5851(class1932, class1933);
        }
    }
    
    public Class1666 method5860() {
        return this.field9433;
    }
    
    public Class1932 method5861() {
        return this.field9434;
    }
    
    static {
        field9427 = LogManager.getLogger();
        field9428 = new Class1932("");
    }
}
