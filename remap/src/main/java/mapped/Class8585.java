// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap$Entry;
import java.util.stream.Stream;
import java.util.UUID;
import java.util.function.Predicate;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;

public class Class8585
{
    private static String[] field36074;
    private final Object2IntMap<Class100> field36075;
    
    private Class8585() {
        this.field36075 = (Object2IntMap<Class100>)new Object2IntOpenHashMap();
    }
    
    public int method29063(final Predicate<Class100> predicate) {
        return this.field36075.object2IntEntrySet().stream().filter(object2IntMap$Entry -> predicate2.test(object2IntMap$Entry.getKey())).mapToInt(object2IntMap$Entry2 -> object2IntMap$Entry2.getIntValue() * object2IntMap$Entry2.getKey().field291).sum();
    }
    
    public Stream<Class6556> method29064(final UUID uuid) {
        return this.field36075.object2IntEntrySet().stream().map(object2IntMap$Entry -> new Class6556(uuid2, (Class100)object2IntMap$Entry.getKey(), object2IntMap$Entry.getIntValue()));
    }
    
    public void method29065() {
        final ObjectIterator iterator = this.field36075.object2IntEntrySet().iterator();
        while (iterator.hasNext()) {
            final Object2IntMap$Entry object2IntMap$Entry = (Object2IntMap$Entry)iterator.next();
            final int value = object2IntMap$Entry.getIntValue() - ((Class100)object2IntMap$Entry.getKey()).field293;
            if (value >= 2) {
                object2IntMap$Entry.setValue(value);
            }
            else {
                iterator.remove();
            }
        }
    }
    
    public boolean method29066() {
        return this.field36075.isEmpty();
    }
    
    public void method29067(final Class100 class100) {
        final int int1 = this.field36075.getInt(class100);
        if (int1 > class100.field292) {
            this.field36075.put((Object)class100, class100.field292);
        }
        if (int1 < 2) {
            this.method29068(class100);
        }
    }
    
    public void method29068(final Class100 class100) {
        this.field36075.removeInt(class100);
    }
}
