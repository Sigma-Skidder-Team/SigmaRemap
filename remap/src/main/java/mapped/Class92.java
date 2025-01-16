// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.util.Random;
import java.util.Collections;
import java.util.Set;
import java.util.Optional;
import java.util.Iterator;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.BiMap;
import org.apache.logging.log4j.Logger;

public class Class92<T> extends Class91<T>
{
    public static final Logger field246;
    public final Class95<T> field247;
    public final BiMap<ResourceLocation, T> field248;
    public Object[] field249;
    private int field250;
    
    public Class92() {
        this.field247 = new Class95<T>(256);
        this.field248 = (BiMap<ResourceLocation, T>)HashBiMap.create();
    }
    
    @Override
    public <V extends T> V method557(final int n, final ResourceLocation class1932, final V v) {
        this.field247.method570(v, n);
        Validate.notNull((Object)class1932);
        Validate.notNull((Object)v);
        this.field249 = null;
        if (this.field248.containsKey((Object)class1932)) {
            Class92.field246.debug("Adding duplicate key '{}' to registry", (Object)class1932);
        }
        this.field248.put((Object)class1932, (Object)v);
        if (this.field250 <= n) {
            this.field250 = n + 1;
        }
        return v;
    }
    
    @Override
    public <V extends T> V method558(final ResourceLocation class1932, final V v) {
        return this.method557(this.field250, class1932, v);
    }
    
    @Nullable
    @Override
    public ResourceLocation getKey(final T t) {
        return (ResourceLocation)this.field248.inverse().get((Object)t);
    }
    
    @Override
    public int getId(final T t) {
        return this.field247.method565(t);
    }
    
    @Nullable
    @Override
    public T method499(final int n) {
        return this.field247.method499(n);
    }
    
    @Override
    public Iterator<T> iterator() {
        return this.field247.iterator();
    }
    
    @Nullable
    @Override
    public T getOrDefault(final ResourceLocation class1932) {
        return (T)this.field248.get((Object)class1932);
    }
    
    @Override
    public Optional<T> method506(final ResourceLocation class1932) {
        return Optional.ofNullable(this.field248.get((Object)class1932));
    }
    
    @Override
    public Set<ResourceLocation> method507() {
        return Collections.unmodifiableSet((Set<? extends ResourceLocation>)this.field248.keySet());
    }
    
    @Override
    public boolean method559() {
        return this.field248.isEmpty();
    }
    
    @Nullable
    @Override
    public T method508(final Random random) {
        if (this.field249 == null) {
            final Set values = this.field248.values();
            if (values.isEmpty()) {
                return null;
            }
            this.field249 = values.toArray(new Object[values.size()]);
        }
        return (T)this.field249[random.nextInt(this.field249.length)];
    }
    
    @Override
    public boolean method510(final ResourceLocation class1932) {
        return this.field248.containsKey((Object)class1932);
    }
    
    static {
        field246 = LogManager.getLogger();
    }
}
