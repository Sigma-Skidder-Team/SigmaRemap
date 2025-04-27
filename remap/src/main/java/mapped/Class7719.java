// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Iterables;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.function.Supplier;
import java.util.List;
import it.unimi.dsi.fastutil.objects.Object2IntMap;

public class Class7719<T extends INetHandler>
{
    private final Object2IntMap<Class<? extends IPacket<T>>> field30707;
    private final List<Supplier<? extends IPacket<T>>> field30708;
    
    private Class7719() {
        this.field30707 = (Object2IntMap<Class<? extends IPacket<T>>>) Util.method27851((Object2IntMap)new Object2IntOpenHashMap(), object2IntOpenHashMap -> object2IntOpenHashMap.defaultReturnValue(-1));
        this.field30708 = Lists.newArrayList();
    }
    
    public <P extends IPacket<T>> Class7719<T> method24645(final Class<P> obj, final Supplier<P> supplier) {
        final int put = this.field30707.put((Object)obj, this.field30708.size());
        if (put == -1) {
            this.field30708.add(supplier);
            return this;
        }
        final String string = "Packet " + obj + " is already registered to ID " + put;
        LogManager.getLogger().fatal(string);
        throw new IllegalArgumentException(string);
    }
    
    @Nullable
    public Integer method24646(final Class<?> clazz) {
        final int int1 = this.field30707.getInt(clazz);
        return (int1 != -1) ? Integer.valueOf(int1) : null;
    }
    
    @Nullable
    public IPacket<?> method24647(final int n) {
        final Supplier supplier = this.field30708.get(n);
        return (supplier == null) ? null : ((IPacket<?>)supplier.get());
    }
    
    public Iterable<Class<? extends IPacket<?>>> method24648() {
        return Iterables.unmodifiableIterable((Iterable)this.field30707.keySet());
    }
}
