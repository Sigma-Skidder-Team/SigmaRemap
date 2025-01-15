// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Function;
import java.util.function.Supplier;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collections;
import java.util.List;
import it.unimi.dsi.fastutil.objects.Object2IntMap;

public class Class8570
{
    private static String[] field36006;
    private final String field36007;
    private final Object2IntMap<Class6102> field36008;
    private final Class6102[] field36009;
    
    public Class8570(final String field36007, final Class6102[] field36008, final Object2IntMap<Class6102> field36009) {
        this.field36007 = field36007;
        this.field36009 = field36008;
        this.field36008 = field36009;
    }
    
    public List<Class41> method28804(final Class41 o) throws CommandSyntaxException {
        List<Class41> list = Collections.singletonList(o);
        for (final Class6102 class6102 : this.field36009) {
            list = class6102.method18202(list);
            if (list.isEmpty()) {
                throw this.method28811(class6102);
            }
        }
        return list;
    }
    
    public int method28805(final Class41 o) {
        List<Class41> list = Collections.singletonList(o);
        final Class6102[] field36009 = this.field36009;
        for (int length = field36009.length, i = 0; i < length; ++i) {
            list = field36009[i].method18202(list);
            if (list.isEmpty()) {
                return 0;
            }
        }
        return list.size();
    }
    
    private List<Class41> method28806(final Class41 o) throws CommandSyntaxException {
        List<Class41> list = Collections.singletonList(o);
        for (int i = 0; i < this.field36009.length - 1; ++i) {
            final Class6102 class6102 = this.field36009[i];
            list = class6102.method18203(list, this.field36009[i + 1]::method18199);
            if (list.isEmpty()) {
                throw this.method28811(class6102);
            }
        }
        return list;
    }
    
    public List<Class41> method28807(final Class41 class41, final Supplier<Class41> supplier) throws CommandSyntaxException {
        return this.field36009[this.field36009.length - 1].method18203(this.method28806(class41), supplier);
    }
    
    private static int method28808(final List<Class41> list, final Function<Class41, Integer> function) {
        return list.stream().map((Function<? super Object, ? extends Integer>)function).reduce(Integer.valueOf(0), (n, n3) -> n + n3);
    }
    
    public int method28809(final Class41 class41, final Supplier<Class41> supplier) throws CommandSyntaxException {
        return method28808(this.method28806(class41), class44 -> {
            final Object o = this.field36009[this.field36009.length - 1];
            return class42.method18200(class44, supplier2);
        });
    }
    
    public int method28810(final Class41 o) {
        List<Class41> list = Collections.singletonList(o);
        for (int i = 0; i < this.field36009.length - 1; ++i) {
            list = this.field36009[i].method18202(list);
        }
        return method28808(list, this.field36009[this.field36009.length - 1]::method18201);
    }
    
    private CommandSyntaxException method28811(final Class6102 class6102) {
        return Class8258.field33909.create((Object)this.field36007.substring(0, this.field36008.getInt((Object)class6102)));
    }
    
    @Override
    public String toString() {
        return this.field36007;
    }
}
