// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonPrimitive;
import com.google.gson.JsonElement;
import java.util.Optional;

public class Class7590 extends Class7591
{
    private static String[] field30110;
    private final String field30111;
    
    public Class7590(final String s, final String field30111) {
        super(s);
        this.field30111 = field30111;
    }
    
    @Override
    public <T extends Comparable<T>> boolean method23883(final Class7098<?> class7098, final Class7111<T> class7099) {
        final Comparable<T> method21772 = class7098.method21772(class7099);
        final Optional<T> method21773 = class7099.method21830(this.field30111);
        return method21773.isPresent() && method21772.compareTo(method21773.get()) == 0;
    }
    
    @Override
    public JsonElement method23884() {
        return (JsonElement)new JsonPrimitive(this.field30111);
    }
}
