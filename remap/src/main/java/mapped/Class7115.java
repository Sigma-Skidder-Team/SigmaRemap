// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.Collection;

public class Class7115 extends Class7114<Class179>
{
    private static String[] field27745;
    
    public Class7115(final String s, final Collection<Class179> collection) {
        super(s, Class179.class, collection);
    }
    
    public static Class7115 method21841(final String s, final Predicate<Class179> predicate) {
        return method21843(s, (Collection<Class179>)Arrays.stream(Class179.values()).filter(predicate).collect((Collector<? super Class179, ?, List<? super Class179>>)Collectors.toList()));
    }
    
    public static Class7115 method21842(final String s, final Class179... array) {
        return method21843(s, Lists.newArrayList((Object[])array));
    }
    
    public static Class7115 method21843(final String s, final Collection<Class179> collection) {
        return new Class7115(s, collection);
    }
}
