// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.util.HashMap;
import java.io.InputStream;
import java.io.Closeable;
import org.apache.commons.io.IOUtils;
import java.io.IOException;
import com.google.gson.JsonObject;
import java.io.Reader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.io.BufferedReader;
import com.google.common.collect.Maps;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.Iterator;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.Collection;
import javax.annotation.Nullable;
import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import java.util.function.Function;
import java.util.Map;
import com.google.gson.Gson;
import org.apache.logging.log4j.Logger;

public class Class6208<T>
{
    private static final Logger field25043;
    private static final Gson field25044;
    private static final int field25045;
    private Map<ResourceLocation, Class7909<T>> field25046;
    private final Function<ResourceLocation, Optional<T>> field25047;
    private final String field25048;
    private final boolean field25049;
    private final String field25050;
    
    public Class6208(final Function<ResourceLocation, Optional<T>> field25047, final String field25048, final boolean field25049, final String field25050) {
        this.field25046 = (Map<ResourceLocation, Class7909<T>>)ImmutableMap.of();
        this.field25047 = field25047;
        this.field25048 = field25048;
        this.field25049 = field25049;
        this.field25050 = field25050;
    }
    
    @Nullable
    public Class7909<T> method18460(final ResourceLocation class1932) {
        return this.field25046.get(class1932);
    }
    
    public Class7909<T> method18461(final ResourceLocation class1932) {
        final Class7909 class1933 = this.field25046.get(class1932);
        return (class1933 != null) ? class1933 : new Class7909<T>(class1932);
    }
    
    public Collection<ResourceLocation> method18462() {
        return this.field25046.keySet();
    }
    
    public Collection<ResourceLocation> method18463(final T t) {
        final ArrayList arrayList = Lists.newArrayList();
        for (final Map.Entry<K, Class7909> entry : this.field25046.entrySet()) {
            if (!entry.getValue().method25618(t)) {
                continue;
            }
            arrayList.add(entry.getKey());
        }
        return arrayList;
    }
    
    public CompletableFuture<Map<ResourceLocation, Class8162<T>>> method18464(final Class6582 class6582, final Executor executor) {
        return (CompletableFuture<Map<ResourceLocation, Class8162<T>>>)CompletableFuture.supplyAsync(() -> {
            Maps.newHashMap();
            class6583.method19936(this.field25048, s2 -> s2.endsWith(".json")).iterator();
            final Iterator iterator;
            final HashMap hashMap;
            while (iterator.hasNext()) {
                final ResourceLocation class6584 = iterator.next();
                class6584.method7797();
                final String s;
                final ResourceLocation key = new ResourceLocation(class6584.method7798(), s.substring(this.field25048.length() + 1, s.length() - Class6208.field25045));
                try {
                    class6583.method19935(class6584).iterator();
                    final Iterator iterator2;
                    while (iterator2.hasNext()) {
                        final Class1671 class6585 = iterator2.next();
                        try {
                            class6585.method5887();
                            try {
                                final InputStream in;
                                new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8));
                                try {
                                    final Reader reader;
                                    final JsonObject jsonObject = Class9583.method35928(Class6208.field25044, reader, JsonObject.class);
                                    if (jsonObject == null) {
                                        Class6208.field25043.error("Couldn't load {} tag list {} from {} in data pack {} as it's empty or null", (Object)this.field25050, (Object)key, (Object)class6584, (Object)class6585.method5889());
                                    }
                                    else {
                                        ((Class8162)hashMap.computeIfAbsent(key, p0 -> Util.method27851(Class8162.method26975(), class6586 -> class6586.method26980(this.field25049)))).method26983(this.field25047, jsonObject);
                                    }
                                }
                                catch (final Throwable t) {
                                    throw t;
                                }
                                finally {
                                    final Reader reader;
                                    if (reader != null) {
                                        final Throwable t2;
                                        if (t2 != null) {
                                            try {
                                                reader.close();
                                            }
                                            catch (final Throwable exception) {
                                                t2.addSuppressed(exception);
                                            }
                                        }
                                        else {
                                            reader.close();
                                        }
                                    }
                                }
                            }
                            catch (final Throwable t3) {
                                throw t3;
                            }
                            finally {
                                final InputStream in;
                                if (in != null) {
                                    final Throwable t4;
                                    if (t4 != null) {
                                        try {
                                            in.close();
                                        }
                                        catch (final Throwable exception2) {
                                            t4.addSuppressed(exception2);
                                        }
                                    }
                                    else {
                                        in.close();
                                    }
                                }
                            }
                        }
                        catch (final RuntimeException | IOException ex) {
                            Class6208.field25043.error("Couldn't read {} tag list {} from {} in data pack {}", (Object)this.field25050, (Object)key, (Object)class6584, (Object)class6585.method5889(), (Object)ex);
                        }
                        finally {
                            IOUtils.closeQuietly((Closeable)class6585);
                        }
                    }
                }
                catch (final IOException ex2) {
                    Class6208.field25043.error("Couldn't read {} tag list {} from {}", (Object)this.field25050, (Object)key, (Object)class6584, (Object)ex2);
                }
            }
            return hashMap;
        }, executor);
    }
    
    public void method18465(final Map<ResourceLocation, Class8162<T>> map) {
        final HashMap hashMap = Maps.newHashMap();
        while (!map.isEmpty()) {
            int n = 0;
            final Iterator<Map.Entry<ResourceLocation, Class8162<T>>> iterator = map.entrySet().iterator();
            while (iterator.hasNext()) {
                final Map.Entry<K, Class8162> entry = (Map.Entry<K, Class8162>)iterator.next();
                final Class8162 class8162 = entry.getValue();
                if (!class8162.method26981(hashMap::get)) {
                    continue;
                }
                n = 1;
                final ResourceLocation class8163 = (ResourceLocation)entry.getKey();
                hashMap.put(class8163, class8162.method26982(class8163));
                iterator.remove();
            }
            if (n != 0) {
                continue;
            }
            map.forEach((class8164, p1) -> Class6208.field25043.error("Couldn't load {} tag {} as it either references another tag that doesn't exist, or ultimately references itself", (Object)this.field25050, (Object)class8164));
            break;
        }
        map.forEach((class8165, class8166) -> {
            final Class7909 class8167 = map2.put(class8165, class8166.method26982(class8165));
            return;
        });
        this.method18466(hashMap);
    }
    
    public void method18466(final Map<ResourceLocation, Class7909<T>> map) {
        this.field25046 = (Map<ResourceLocation, Class7909<T>>)ImmutableMap.copyOf((Map)map);
    }
    
    public Map<ResourceLocation, Class7909<T>> method18467() {
        return this.field25046;
    }
    
    static {
        field25043 = LogManager.getLogger();
        field25044 = new Gson();
        field25045 = Class6208.\u9b8d\uae67\u345d\u415c\u9aed\u6779[4].length();
    }
}
