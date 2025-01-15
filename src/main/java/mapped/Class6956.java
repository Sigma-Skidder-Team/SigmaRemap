// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashSet;
import java.util.function.Consumer;
import java.util.stream.Stream;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.function.Function;
import java.util.Set;

public class Class6956<T> implements Class6952<T>
{
    private final Set<Class7460<T>> field27232;
    private final Function<T, Class1932> field27233;
    
    public Class6956(final Function<T, Class1932> function, final List<Class7460<T>> list) {
        this(function, Sets.newHashSet((Iterable)list));
    }
    
    private Class6956(final Function<T, Class1932> field27233, final Set<Class7460<T>> field27234) {
        this.field27232 = field27234;
        this.field27233 = field27233;
    }
    
    @Override
    public boolean method21340(final Class354 class354, final T t) {
        return false;
    }
    
    @Override
    public void method21341(final Class354 class354, final T t, final int n, final Class1955 class355) {
        this.field27232.add(new Class7460<T>(class354, t, n, class355));
    }
    
    @Override
    public boolean method21342(final Class354 class354, final T t) {
        return false;
    }
    
    @Override
    public void method21343(final Stream<Class7460<T>> stream) {
        stream.forEach(this.field27232::add);
    }
    
    public Stream<Class7460<T>> method21357() {
        return this.field27232.stream();
    }
    
    public Class52 method21358(final long n) {
        return Class6953.method21352(this.field27233, this.field27232, n);
    }
    
    public static <T> Class6956<T> method21359(final Class52 class52, final Function<T, Class1932> function, final Function<Class1932, T> function2) {
        final HashSet hashSet = Sets.newHashSet();
        for (int i = 0; i < class52.size(); ++i) {
            final Class51 method346 = class52.method346(i);
            final T apply = function2.apply(new Class1932(method346.method323("i")));
            if (apply != null) {
                hashSet.add(new Class7460(new Class354(method346.method319("x"), method346.method319("y"), method346.method319("z")), apply, method346.method319("t"), Class1955.method7940(method346.method319("p"))));
            }
        }
        return new Class6956<T>((Function<Object, Class1932>)function, hashSet);
    }
}
