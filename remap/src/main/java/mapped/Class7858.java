// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.nbt.INBT;
import org.apache.logging.log4j.LogManager;
import java.util.function.Function;
import java.util.Iterator;
import java.util.Collections;
import java.util.Set;
import java.util.Collection;

import com.google.common.collect.HashBasedTable;
import java.util.PriorityQueue;
import java.util.Comparator;
import com.google.common.collect.Table;
import com.google.common.primitives.UnsignedLong;
import java.util.Queue;
import org.apache.logging.log4j.Logger;

public class Class7858<T>
{
    private static final Logger field32284;
    private final Class7271<T> field32285;
    private final Queue<Class7599<T>> field32286;
    private UnsignedLong field32287;
    private final Table<String, Long, Class7599<T>> field32288;
    
    private static <T> Comparator<Class7599<T>> method25412() {
        return Comparator.comparingLong(class7599 -> class7599.field30134).thenComparing(class7600 -> class7600.field30135);
    }
    
    public Class7858(final Class7271<T> field32285) {
        this.field32286 = new PriorityQueue<Class7599<T>>(method25412());
        this.field32287 = UnsignedLong.ZERO;
        this.field32288 = HashBasedTable.create();
        this.field32285 = field32285;
    }
    
    public void run(final T t, final long l) {
        while (true) {
            final Class7599 class7599 = this.field32286.peek();
            if (class7599 == null || class7599.field30134 > l) {
                break;
            }
            this.field32286.remove();
            this.field32288.remove(class7599.field30136, (Object)l);
            class7599.field30137.run(t, this, l);
        }
    }
    
    public void method25413(final String s, final long n, final Class8183<T> class8183) {
        if (!this.field32288.contains(s, (Object)n)) {
            this.field32287 = this.field32287.plus(UnsignedLong.ONE);
            final Class7599 class8184 = new Class7599(n, this.field32287, s, class8183, null);
            this.field32288.put((Object)s, (Object)n, (Object)class8184);
            this.field32286.add(class8184);
        }
    }
    
    public int method25414(final String s) {
        final Collection values = this.field32288.row(s).values();
        values.forEach(this.field32286::remove);
        final int size = values.size();
        values.clear();
        return size;
    }
    
    public Set<String> method25415() {
        return Collections.unmodifiableSet(this.field32288.rowKeySet());
    }
    
    private void method25416(final CompoundNBT class51) {
        final Class8183<T> method22280 = this.field32285.method22280(class51.getCompound("Callback"));
        if (method22280 != null) {
            this.method25413(class51.getString("Name"), class51.getLong("TriggerTime"), method22280);
        }
    }
    
    public void method25417(final ListNBT obj) {
        this.field32286.clear();
        this.field32288.clear();
        this.field32287 = UnsignedLong.ZERO;
        if (!obj.isEmpty()) {
            if (obj.getTagType() == 10) {
                final Iterator<INBT> iterator = obj.iterator();
                while (iterator.hasNext()) {
                    this.method25416((CompoundNBT)iterator.next());
                }
            }
            else {
                Class7858.field32284.warn("Invalid format of events: " + obj);
            }
        }
    }
    
    private CompoundNBT method25418(final Class7599<T> class7599) {
        final CompoundNBT class7600 = new CompoundNBT();
        class7600.putString("Name", class7599.field30136);
        class7600.putLong("TriggerTime", class7599.field30134);
        class7600.put("Callback", this.field32285.method22279(class7599.field30137));
        return class7600;
    }
    
    public ListNBT method25419() {
        final ListNBT class52 = new ListNBT();
        this.field32286.stream().sorted(method25412()).map((Function<? super Object, ?>)this::method25418).forEach(class52::add);
        return class52;
    }
    
    static {
        field32284 = LogManager.getLogger();
    }
}
