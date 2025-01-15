// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Date;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import com.google.common.collect.Maps;
import java.util.Map;

public class Class348 implements Comparable<Class348>
{
    private final Map<String, Class8000> field2147;
    private String[][] field2148;
    
    public Class348() {
        this.field2147 = Maps.newHashMap();
        this.field2148 = new String[0][];
    }
    
    public void method1030(final Map<String, Class8832> map, final String[][] field2148) {
        final Set<String> keySet = map.keySet();
        this.field2147.entrySet().removeIf(entry -> !set.contains(entry.getKey()));
        for (final String s : keySet) {
            if (this.field2147.containsKey(s)) {
                continue;
            }
            this.field2147.put(s, new Class8000());
        }
        this.field2148 = field2148;
    }
    
    public boolean method1031() {
        if (this.field2148.length != 0) {
            for (final String[] array : this.field2148) {
                int n = 0;
                final String[] array2 = array;
                for (int length2 = array2.length, j = 0; j < length2; ++j) {
                    final Class8000 method1037 = this.method1037(array2[j]);
                    if (method1037 != null && method1037.method26167()) {
                        n = 1;
                        break;
                    }
                }
                if (n == 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    public boolean method1032() {
        final Iterator<Class8000> iterator = this.field2147.values().iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().method26167()) {
                continue;
            }
            return true;
        }
        return false;
    }
    
    public boolean method1033(final String s) {
        final Class8000 class8000 = this.field2147.get(s);
        if (class8000 != null && !class8000.method26167()) {
            class8000.method26168();
            return true;
        }
        return false;
    }
    
    public boolean method1034(final String s) {
        final Class8000 class8000 = this.field2147.get(s);
        if (class8000 != null && class8000.method26167()) {
            class8000.method26169();
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "AdvancementProgress{criteria=" + this.field2147 + ", requirements=" + Arrays.deepToString(this.field2148) + '}';
    }
    
    public void method1035(final PacketBuffer class8654) {
        class8654.writeVarInt(this.field2147.size());
        for (final Map.Entry<String, V> entry : this.field2147.entrySet()) {
            class8654.method29514(entry.getKey());
            ((Class8000)entry.getValue()).method26171(class8654);
        }
    }
    
    public static Class348 method1036(final PacketBuffer class8654) {
        final Class348 class8655 = new Class348();
        for (int method29501 = class8654.readVarInt(), i = 0; i < method29501; ++i) {
            class8655.field2147.put(class8654.method29513(32767), Class8000.method26173(class8654));
        }
        return class8655;
    }
    
    @Nullable
    public Class8000 method1037(final String s) {
        return this.field2147.get(s);
    }
    
    public float method1038() {
        if (!this.field2147.isEmpty()) {
            return this.method1040() / (float)this.field2148.length;
        }
        return 0.0f;
    }
    
    @Nullable
    public String method1039() {
        if (this.field2147.isEmpty()) {
            return null;
        }
        final int length = this.field2148.length;
        if (length > 1) {
            return this.method1040() + "/" + length;
        }
        return null;
    }
    
    private int method1040() {
        int n = 0;
        for (final String[] array : this.field2148) {
            int n2 = 0;
            final String[] array2 = array;
            for (int length2 = array2.length, j = 0; j < length2; ++j) {
                final Class8000 method1037 = this.method1037(array2[j]);
                if (method1037 != null && method1037.method26167()) {
                    n2 = 1;
                    break;
                }
            }
            if (n2 != 0) {
                ++n;
            }
        }
        return n;
    }
    
    public Iterable<String> method1041() {
        final ArrayList arrayList = Lists.newArrayList();
        for (final Map.Entry<K, Class8000> entry : this.field2147.entrySet()) {
            if (entry.getValue().method26167()) {
                continue;
            }
            arrayList.add(entry.getKey());
        }
        return arrayList;
    }
    
    public Iterable<String> method1042() {
        final ArrayList arrayList = Lists.newArrayList();
        for (final Map.Entry<K, Class8000> entry : this.field2147.entrySet()) {
            if (!entry.getValue().method26167()) {
                continue;
            }
            arrayList.add(entry.getKey());
        }
        return arrayList;
    }
    
    @Nullable
    public Date method1043() {
        Date method26170 = null;
        for (final Class8000 class8000 : this.field2147.values()) {
            if (!class8000.method26167()) {
                continue;
            }
            if (method26170 != null && !class8000.method26170().before(method26170)) {
                continue;
            }
            method26170 = class8000.method26170();
        }
        return method26170;
    }
    
    @Override
    public int compareTo(final Class348 class348) {
        final Date method1043 = this.method1043();
        final Date method1044 = class348.method1043();
        if (method1043 == null && method1044 != null) {
            return 1;
        }
        if (method1043 != null && method1044 == null) {
            return -1;
        }
        return (method1043 == null && method1044 == null) ? 0 : method1043.compareTo(method1044);
    }
}
