// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import javax.annotation.Nullable;
import java.util.Collection;
import java.util.function.Function;
import com.google.common.base.Functions;
import java.util.Iterator;
import com.google.common.collect.Sets;
import com.google.common.collect.Maps;
import java.util.Set;
import java.util.Map;
import org.apache.logging.log4j.Logger;

public class Class6518
{
    private static final Logger field25938;
    private final Map<Class1932, Class8863> field25939;
    private final Set<Class8863> field25940;
    private final Set<Class8863> field25941;
    private Class559 field25942;
    
    public Class6518() {
        this.field25939 = Maps.newHashMap();
        this.field25940 = Sets.newLinkedHashSet();
        this.field25941 = Sets.newLinkedHashSet();
    }
    
    private void method19669(final Class8863 class8863) {
        final Iterator<Class8863> iterator = class8863.method31038().iterator();
        while (iterator.hasNext()) {
            this.method19669(iterator.next());
        }
        Class6518.field25938.info("Forgot about advancement {}", (Object)class8863.method31042());
        this.field25939.remove(class8863.method31042());
        if (class8863.method31035() != null) {
            this.field25941.remove(class8863);
            if (this.field25942 != null) {
                this.field25942.method3266(class8863);
            }
        }
        else {
            this.field25940.remove(class8863);
            if (this.field25942 != null) {
                this.field25942.method3264(class8863);
            }
        }
    }
    
    public void method19670(final Set<Class1932> set) {
        for (final Class1932 class1932 : set) {
            final Class8863 class1933 = this.field25939.get(class1932);
            if (class1933 != null) {
                this.method19669(class1933);
            }
            else {
                Class6518.field25938.warn("Told to remove advancement {} but I don't know what that is", (Object)class1932);
            }
        }
    }
    
    public void method19671(final Map<Class1932, Class6056> map) {
        final com.google.common.base.Function forMap = Functions.forMap((Map)this.field25939, (Object)null);
        while (!map.isEmpty()) {
            int n = 0;
            final Iterator<Map.Entry<Class1932, Class6056>> iterator = map.entrySet().iterator();
            while (iterator.hasNext()) {
                final Map.Entry<Class1932, V> entry = (Map.Entry<Class1932, V>)iterator.next();
                final Class1932 class1932 = entry.getKey();
                final Class6056 class1933 = (Class6056)entry.getValue();
                if (!class1933.method18012((Function<Class1932, Class8863>)forMap)) {
                    continue;
                }
                final Class8863 method18013 = class1933.method18013(class1932);
                this.field25939.put(class1932, method18013);
                n = 1;
                iterator.remove();
                if (method18013.method31035() != null) {
                    this.field25941.add(method18013);
                    if (this.field25942 == null) {
                        continue;
                    }
                    this.field25942.method3265(method18013);
                }
                else {
                    this.field25940.add(method18013);
                    if (this.field25942 == null) {
                        continue;
                    }
                    this.field25942.method3263(method18013);
                }
            }
            if (n != 0) {
                continue;
            }
            for (final Map.Entry<Object, V> entry2 : map.entrySet()) {
                Class6518.field25938.error("Couldn't load advancement {}: {}", entry2.getKey(), (Object)entry2.getValue());
            }
            break;
        }
        Class6518.field25938.info("Loaded {} advancements", (Object)this.field25939.size());
    }
    
    public void method19672() {
        this.field25939.clear();
        this.field25940.clear();
        this.field25941.clear();
        if (this.field25942 != null) {
            this.field25942.method3269();
        }
    }
    
    public Iterable<Class8863> method19673() {
        return this.field25940;
    }
    
    public Collection<Class8863> method19674() {
        return this.field25939.values();
    }
    
    @Nullable
    public Class8863 method19675(final Class1932 class1932) {
        return this.field25939.get(class1932);
    }
    
    public void method19676(final Class559 field25942) {
        this.field25942 = field25942;
        if (field25942 != null) {
            final Iterator<Class8863> iterator = this.field25940.iterator();
            while (iterator.hasNext()) {
                field25942.method3263(iterator.next());
            }
            final Iterator<Class8863> iterator2 = this.field25941.iterator();
            while (iterator2.hasNext()) {
                field25942.method3265(iterator2.next());
            }
        }
    }
    
    static {
        field25938 = LogManager.getLogger();
    }
}
