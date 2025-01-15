// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import java.util.Optional;

public class Class7592 extends Class7591
{
    private final String field30113;
    private final String field30114;
    
    public Class7592(final String s, final String field30113, final String field30114) {
        super(s);
        this.field30113 = field30113;
        this.field30114 = field30114;
    }
    
    @Override
    public <T extends Comparable<T>> boolean method23883(final Class7098<?> class7098, final Class7111<T> class7099) {
        final Comparable<T> method21772 = class7098.method21772(class7099);
        if (this.field30113 != null) {
            final Optional<T> method21773 = class7099.method21830(this.field30113);
            if (!method21773.isPresent() || method21772.compareTo(method21773.get()) < 0) {
                return false;
            }
        }
        if (this.field30114 != null) {
            final Optional<T> method21774 = class7099.method21830(this.field30114);
            if (!method21774.isPresent() || method21772.compareTo(method21774.get()) > 0) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public JsonElement method23884() {
        final JsonObject jsonObject = new JsonObject();
        if (this.field30113 != null) {
            jsonObject.addProperty("min", this.field30113);
        }
        if (this.field30114 != null) {
            jsonObject.addProperty("max", this.field30114);
        }
        return (JsonElement)jsonObject;
    }
}
