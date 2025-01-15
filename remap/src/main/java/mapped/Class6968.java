// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.function.Function;
import com.google.gson.JsonArray;
import java.util.Collection;

public class Class6968<T> implements Class6967<T>
{
    private final Collection<T> field27248;
    
    public Class6968(final Collection<T> field27248) {
        this.field27248 = field27248;
    }
    
    @Override
    public void method21379(final Collection<T> collection) {
        collection.addAll((Collection<? extends T>)this.field27248);
    }
    
    @Override
    public void method21381(final JsonArray jsonArray, final Function<T, Class1932> function) {
        final Iterator<T> iterator = this.field27248.iterator();
        while (iterator.hasNext()) {
            final Class1932 class1932 = function.apply(iterator.next());
            if (class1932 == null) {
                throw new IllegalStateException("Unable to serialize an anonymous value to json!");
            }
            jsonArray.add(class1932.toString());
        }
    }
    
    public Collection<T> method21382() {
        return this.field27248;
    }
}
