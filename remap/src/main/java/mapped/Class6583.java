// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.util.Collections;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.Iterator;
import java.util.ArrayList;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileNotFoundException;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import com.google.common.collect.Lists;
import java.util.List;
import org.apache.logging.log4j.Logger;

public class Class6583 implements Class6582
{
    private static final Logger field26120;
    public final List<Class1727> field26121;
    private final Class346 field26122;
    private final String field26123;
    
    public Class6583(final Class346 field26122, final String field26123) {
        this.field26121 = Lists.newArrayList();
        this.field26122 = field26122;
        this.field26123 = field26123;
    }
    
    public void method19939(final Class1727 class1727) {
        this.field26121.add(class1727);
    }
    
    @Override
    public Set<String> method19932() {
        return (Set<String>)ImmutableSet.of((Object)this.field26123);
    }
    
    @Override
    public Class1671 method19933(final Class1932 class1932) throws IOException {
        this.method19941(class1932);
        Class1727 class1933 = null;
        final Class1932 method19943 = method19943(class1932);
        for (int i = this.field26121.size() - 1; i >= 0; --i) {
            final Class1727 class1934 = this.field26121.get(i);
            if (class1933 == null) {
                if (class1934.method6099(this.field26122, method19943)) {
                    class1933 = class1934;
                }
            }
            if (class1934.method6099(this.field26122, class1932)) {
                InputStream method19944 = null;
                if (class1933 != null) {
                    method19944 = this.method19940(method19943, class1933);
                }
                return new Class1673(class1934.method6102(), class1932, this.method19940(class1932, class1934), method19944);
            }
        }
        throw new FileNotFoundException(class1932.toString());
    }
    
    @Override
    public boolean method19934(final Class1932 class1932) {
        if (this.method19942(class1932)) {
            for (int i = this.field26121.size() - 1; i >= 0; --i) {
                if (this.field26121.get(i).method6099(this.field26122, class1932)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    
    public InputStream method19940(final Class1932 class1932, final Class1727 class1933) throws IOException {
        final InputStream method6097 = class1933.method6097(this.field26122, class1932);
        return Class6583.field26120.isDebugEnabled() ? new Class1748(method6097, class1932, class1933.method6102()) : method6097;
    }
    
    private void method19941(final Class1932 obj) throws IOException {
        if (this.method19942(obj)) {
            return;
        }
        throw new IOException("Invalid relative path to resource: " + obj);
    }
    
    private boolean method19942(final Class1932 class1932) {
        return !class1932.method7797().contains("..");
    }
    
    @Override
    public List<Class1671> method19935(final Class1932 class1932) throws IOException {
        this.method19941(class1932);
        final ArrayList arrayList = Lists.newArrayList();
        final Class1932 method19943 = method19943(class1932);
        for (final Class1727 class1933 : this.field26121) {
            if (!class1933.method6099(this.field26122, class1932)) {
                continue;
            }
            arrayList.add(new Class1673(class1933.method6102(), class1932, this.method19940(class1932, class1933), class1933.method6099(this.field26122, method19943) ? this.method19940(method19943, class1933) : null));
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        throw new FileNotFoundException(class1932.toString());
    }
    
    @Override
    public Collection<Class1932> method19936(final String s, final Predicate<String> predicate) {
        final ArrayList arrayList = Lists.newArrayList();
        final Iterator<Class1727> iterator = this.field26121.iterator();
        while (iterator.hasNext()) {
            arrayList.addAll(iterator.next().method6098(this.field26122, this.field26123, s, Integer.MAX_VALUE, predicate));
        }
        Collections.sort((List<Comparable>)arrayList);
        return arrayList;
    }
    
    public static Class1932 method19943(final Class1932 class1932) {
        return new Class1932(class1932.method7798(), class1932.method7797() + ".mcmeta");
    }
    
    static {
        field26120 = LogManager.getLogger();
    }
}
