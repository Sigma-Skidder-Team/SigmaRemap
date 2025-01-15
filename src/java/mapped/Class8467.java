// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.Collection;
import javax.annotation.Nullable;
import com.google.common.collect.Maps;
import java.util.Map;

public class Class8467
{
    private static String[] field34748;
    private final Class394 field34749;
    private final Map<Class1932, Class6878> field34750;
    
    public Class8467(final Class394 field34749) {
        this.field34750 = Maps.newHashMap();
        this.field34749 = field34749;
    }
    
    @Nullable
    public Class6878 method28260(final Class1932 class1932) {
        return this.field34750.get(class1932);
    }
    
    public Class6878 method28261(final Class1932 class1932, final Class2250 class1933) {
        final Class6878 class1934 = new Class6878(class1932, class1933);
        this.field34750.put(class1932, class1934);
        return class1934;
    }
    
    public void method28262(final Class6878 class6878) {
        this.field34750.remove(class6878.method21048());
    }
    
    public Collection<Class1932> method28263() {
        return this.field34750.keySet();
    }
    
    public Collection<Class6878> method28264() {
        return this.field34750.values();
    }
    
    public Class51 method28265() {
        final Class51 class51 = new Class51();
        for (final Class6878 class52 : this.field34750.values()) {
            class51.method295(class52.method21048().toString(), class52.method21059());
        }
        return class51;
    }
    
    public void method28266(final Class51 class51) {
        for (final String s : class51.method293()) {
            final Class1932 class52 = new Class1932(s);
            this.field34750.put(class52, Class6878.method21060(class51.method327(s), class52));
        }
    }
    
    public void method28267(final Class513 class513) {
        final Iterator<Class6878> iterator = this.field34750.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().method21061(class513);
        }
    }
    
    public void method28268(final Class513 class513) {
        final Iterator<Class6878> iterator = this.field34750.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().method21062(class513);
        }
    }
}
