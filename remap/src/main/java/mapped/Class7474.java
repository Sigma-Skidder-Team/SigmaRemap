// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;

public class Class7474
{
    private static String[] field28870;
    public final Object2IntMap<Class9455<?>> field28871;
    
    public Class7474() {
        (this.field28871 = (Object2IntMap<Class9455<?>>)Object2IntMaps.synchronize((Object2IntMap)new Object2IntOpenHashMap())).defaultReturnValue(0);
    }
    
    public void method23089(final PlayerEntity playerEntity, final Class9455<?> class513, final int n) {
        this.method23075(playerEntity, class513, this.method23091(class513) + n);
    }
    
    public void method23075(final PlayerEntity playerEntity, final Class9455<?> class513, final int n) {
        this.field28871.put((Object)class513, n);
    }
    
    public <T> int method23090(final Class2248<T> class2248, final T t) {
        return class2248.method8446(t) ? this.method23091(class2248.method8449(t)) : 0;
    }
    
    public int method23091(final Class9455<?> class9455) {
        return this.field28871.getInt((Object)class9455);
    }
}
