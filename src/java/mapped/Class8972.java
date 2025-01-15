// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.Lists;
import java.util.Optional;
import javax.annotation.Nullable;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.function.Consumer;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class Class8972
{
    private static final Collection<Class6812> field37806;
    private static final Set<String> field37807;
    private static final Map<String, Consumer<Class1849>> field37808;
    
    public static Collection<Class6812> method31853(final String s) {
        return Class8972.field37806.stream().filter(class6812 -> method31860(class6812, s2)).collect((Collector<? super Class6812, ?, Collection<Class6812>>)Collectors.toList());
    }
    
    public static Collection<Class6812> method31854() {
        return Class8972.field37806;
    }
    
    public static Collection<String> method31855() {
        return Class8972.field37807;
    }
    
    public static boolean method31856(final String s) {
        return Class8972.field37807.contains(s);
    }
    
    @Nullable
    public static Consumer<Class1849> method31857(final String s) {
        return Class8972.field37808.get(s);
    }
    
    public static Optional<Class6812> method31858(final String s) {
        return method31854().stream().filter(class6812 -> class6812.method20849().equalsIgnoreCase(anotherString)).findFirst();
    }
    
    public static Class6812 method31859(final String str) {
        final Optional<Class6812> method31858 = method31858(str);
        if (method31858.isPresent()) {
            return method31858.get();
        }
        throw new IllegalArgumentException("Can't find the test function for " + str);
    }
    
    private static boolean method31860(final Class6812 class6812, final String s) {
        return class6812.method20849().toLowerCase().startsWith(s.toLowerCase() + ".");
    }
    
    static {
        field37806 = Lists.newArrayList();
        field37807 = Sets.newHashSet();
        field37808 = Maps.newHashMap();
    }
}
