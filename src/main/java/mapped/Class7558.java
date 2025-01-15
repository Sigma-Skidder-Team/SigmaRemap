// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.UnmodifiableIterator;
import java.util.Iterator;

public class Class7558
{
    public static final Class7255 field29974;
    public static final Class7257 field29975;
    public static final Class7257 field29976;
    public static final Class7257 field29977;
    public static final Class7257 field29978;
    
    private static <T extends Class7255> T method23729(final String s, final T t) {
        return Class90.method511(Class90.field206, s, t);
    }
    
    static {
        field29974 = method23729("empty", new Class7256());
        field29975 = method23729("flowing_water", new Class7259());
        field29976 = method23729("water", new Class7260());
        field29977 = method23729("flowing_lava", new Class7262());
        field29978 = method23729("lava", new Class7263());
        final Iterator<Object> iterator = Class90.field206.iterator();
        while (iterator.hasNext()) {
            final UnmodifiableIterator iterator2 = iterator.next().method22146().method32902().iterator();
            while (((Iterator)iterator2).hasNext()) {
                Class7255.field28128.method562((Class7099)((Iterator)iterator2).next());
            }
        }
    }
}
