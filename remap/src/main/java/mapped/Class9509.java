// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import com.google.common.collect.Maps;
import java.util.Map;

public class Class9509
{
    private static String[] field40920;
    private final Map<BlockState, Class6313> field40921;
    private final Class1790 field40922;
    
    public Class9509(final Class1790 field40922) {
        this.field40921 = Maps.newIdentityHashMap();
        this.field40922 = field40922;
    }
    
    public Class1912 method35427(final BlockState class7096) {
        return this.method35428(class7096).method18696();
    }
    
    public Class6313 method35428(final BlockState class7096) {
        Class6313 method6452 = this.field40921.get(class7096);
        if (method6452 == null) {
            method6452 = this.field40922.method6452();
        }
        return method6452;
    }
    
    public Class1790 method35429() {
        return this.field40922;
    }
    
    public void method35430() {
        this.field40921.clear();
        final Iterator<Object> iterator = Registry.BLOCK.iterator();
        while (iterator.hasNext()) {
            iterator.next().method11876().method32902().forEach(class7096 -> {
                final Class6313 class7097 = this.field40921.put(class7096, this.field40922.method6451(method35431(class7096)));
            });
        }
    }
    
    public static Class1933 method35431(final BlockState class7096) {
        return method35432(Registry.BLOCK.getKey(class7096.getBlock()), class7096);
    }
    
    public static Class1933 method35432(final ResourceLocation class1932, final BlockState class1933) {
        return new Class1933(class1932, method35433((Map<IProperty<?>, Comparable<?>>)class1933.getValues()));
    }
    
    public static String method35433(final Map<IProperty<?>, Comparable<?>> map) {
        final StringBuilder sb = new StringBuilder();
        for (final Map.Entry<IProperty, V> entry : map.entrySet()) {
            if (sb.length() != 0) {
                sb.append(',');
            }
            final IProperty class7111 = entry.getKey();
            sb.append(class7111.getName());
            sb.append('=');
            sb.append(method35434((IProperty<Comparable>)class7111, (Comparable<?>)entry.getValue()));
        }
        return sb.toString();
    }
    
    private static <T extends Comparable<T>> String method35434(final IProperty<T> class7111, final Comparable<?> comparable) {
        return class7111.getName((T)comparable);
    }
}
