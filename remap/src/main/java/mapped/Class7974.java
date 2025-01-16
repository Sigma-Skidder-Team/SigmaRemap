// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.Collection;
import com.google.common.primitives.Floats;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Class7974
{
    private Class8521[] field32807;
    private Map<Class9100, Integer> field32808;
    public static final Integer field32809;
    
    public Class7974(final Class8521[] field32807) {
        this.field32808 = new HashMap<Class9100, Integer>();
        this.field32807 = field32807;
    }
    
    public Integer method25914(final ItemStack class8321, final World class8322, final LivingEntity class8323) {
        final Class9100 method25916 = this.method25916(class8321, class8322, class8323);
        return (method25916 != null) ? this.field32808.get(method25916) : null;
    }
    
    public void method25915(final ItemStack class8321, final World class8322, final LivingEntity class8323, final Integer n) {
        final Class9100 method25916 = this.method25916(class8321, class8322, class8323);
        if (method25916 != null) {
            this.field32808.put(method25916, n);
        }
    }
    
    private Class9100 method25916(final ItemStack class8321, final World class8322, final LivingEntity class8323) {
        final Integer[] array = new Integer[this.field32807.length];
        for (int i = 0; i < array.length; ++i) {
            final Integer method28533 = this.field32807[i].method28533(class8321, class8322, class8323);
            if (method28533 == null) {
                return null;
            }
            array[i] = method28533;
        }
        return new Class9100(array);
    }
    
    public static Class7974 method25917(final List<Class6559> list) {
        if (list.isEmpty()) {
            return null;
        }
        if (Class9570.field41438.method22634()) {
            final LinkedHashMap linkedHashMap = new LinkedHashMap();
            final Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                final Map map = (Map)Class9570.method35828(iterator.next(), Class9570.field41438);
                for (final ResourceLocation class1932 : map.keySet()) {
                    final Float n = map.get(class1932);
                    if (n == null) {
                        continue;
                    }
                    Set set = (Set)linkedHashMap.get(class1932);
                    if (set == null) {
                        set = new HashSet();
                        linkedHashMap.put(class1932, set);
                    }
                    set.add(n);
                }
            }
            final ArrayList list2 = new ArrayList();
            for (final ResourceLocation class1933 : linkedHashMap.keySet()) {
                list2.add(new Class8521(class1933, Floats.toArray((Collection)linkedHashMap.get(class1933))));
            }
            final Class8521[] array = (Class8521[])list2.toArray(new Class8521[list2.size()]);
            final Class7974 class1934 = new Class7974(array);
            method25918(array, list);
            return class1934;
        }
        return null;
    }
    
    private static void method25918(final Class8521[] array, final List<Class6559> list) {
        final StringBuffer sb = new StringBuffer();
        for (int i = 0; i < array.length; ++i) {
            final Class8521 class8521 = array[i];
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("" + class8521.method28534() + "=" + class8521.method28535().length);
        }
        if (list.size() > 0) {
            sb.append(" -> " + list.get(0).method19882() + " ...");
        }
        Config.method28847("ItemOverrideCache: " + sb.toString());
    }
    
    @Override
    public String toString() {
        return "properties: " + this.field32807.length + ", modelIndexes: " + this.field32808.size();
    }
    
    static {
        field32809 = new Integer(-1);
    }
}
