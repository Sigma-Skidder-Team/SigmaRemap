// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.Random;
import com.google.gson.JsonElement;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.function.Function;
import java.util.Iterator;
import com.google.common.collect.Sets;
import java.util.Collections;
import java.util.Collection;
import java.util.Set;

public class Class7909<T>
{
    private final ResourceLocation field32480;
    private final Set<T> field32481;
    private final Collection<Class6967<T>> field32482;
    
    public Class7909(final ResourceLocation field32480) {
        this.field32480 = field32480;
        this.field32481 = Collections.emptySet();
        this.field32482 = (Collection<Class6967<T>>)Collections.emptyList();
    }
    
    public Class7909(final ResourceLocation field32480, final Collection<Class6967<T>> field32481, final boolean b) {
        this.field32480 = field32480;
        this.field32481 = (b ? Sets.newLinkedHashSet() : Sets.newHashSet());
        this.field32482 = field32481;
        final Iterator<Class6967<T>> iterator = field32481.iterator();
        while (iterator.hasNext()) {
            iterator.next().method21379(this.field32481);
        }
    }
    
    public JsonObject method25619(final Function<T, ResourceLocation> function) {
        final JsonObject jsonObject = new JsonObject();
        final JsonArray jsonArray = new JsonArray();
        final Iterator<Class6967<T>> iterator = this.field32482.iterator();
        while (iterator.hasNext()) {
            iterator.next().method21381(jsonArray, function);
        }
        jsonObject.addProperty("replace", Boolean.valueOf(false));
        jsonObject.add("values", (JsonElement)jsonArray);
        return jsonObject;
    }
    
    public boolean method25618(final T t) {
        return this.field32481.contains(t);
    }
    
    public Collection<T> method25616() {
        return this.field32481;
    }
    
    public Collection<Class6967<T>> method25617() {
        return this.field32482;
    }
    
    public T method25620(final Random random) {
        final ArrayList arrayList = Lists.newArrayList((Iterable)this.method25616());
        return (T)arrayList.get(random.nextInt(arrayList.size()));
    }
    
    public ResourceLocation method25621() {
        return this.field32480;
    }
}
