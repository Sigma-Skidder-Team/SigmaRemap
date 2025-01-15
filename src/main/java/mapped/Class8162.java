// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Optional;
import java.util.Iterator;
import java.util.function.Function;
import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.Collections;
import com.google.common.collect.Sets;
import java.util.Set;

public class Class8162<T>
{
    private final Set<Class6967<T>> field33622;
    private boolean field33623;
    
    public Class8162() {
        this.field33622 = Sets.newLinkedHashSet();
    }
    
    public static <T> Class8162<T> method26975() {
        return new Class8162<T>();
    }
    
    public Class8162<T> method26976(final Class6967<T> class6967) {
        this.field33622.add(class6967);
        return this;
    }
    
    public Class8162<T> method26977(final T o) {
        this.field33622.add(new Class6968<T>(Collections.singleton(o)));
        return this;
    }
    
    @SafeVarargs
    public final Class8162<T> method26978(final T... array) {
        this.field33622.add(new Class6968<T>(Lists.newArrayList((Object[])array)));
        return this;
    }
    
    public Class8162<T> method26979(final Class7909<T> class7909) {
        this.field33622.add(new Class6966<T>(class7909));
        return this;
    }
    
    public Class8162<T> method26980(final boolean field33623) {
        this.field33623 = field33623;
        return this;
    }
    
    public boolean method26981(final Function<Class1932, Class7909<T>> function) {
        final Iterator<Class6967<T>> iterator = this.field33622.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().method21378(function)) {
                continue;
            }
            return false;
        }
        return true;
    }
    
    public Class7909<T> method26982(final Class1932 class1932) {
        return new Class7909<T>(class1932, this.field33622, this.field33623);
    }
    
    public Class8162<T> method26983(final Function<Class1932, Optional<T>> function, final JsonObject jsonObject) {
        final JsonArray method35917 = Class9583.method35917(jsonObject, "values");
        final ArrayList arrayList = Lists.newArrayList();
        final Iterator iterator = method35917.iterator();
        while (iterator.hasNext()) {
            final String method35918 = Class9583.method35894(iterator.next(), "value");
            if (!method35918.startsWith("#")) {
                arrayList.add(new Class6968(Collections.singleton((Object)((Optional<T>)function.apply(new Class1932(method35918))).orElseThrow(() -> {
                    new JsonParseException("Unknown value '" + obj + "'");
                    return;
                }))));
            }
            else {
                arrayList.add(new Class6966(new Class1932(method35918.substring(1))));
            }
        }
        if (Class9583.method35901(jsonObject, "replace", false)) {
            this.field33622.clear();
        }
        this.field33622.addAll(arrayList);
        return this;
    }
}
