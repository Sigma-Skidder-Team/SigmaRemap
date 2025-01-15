// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonDeserializationContext;
import org.apache.commons.lang3.ArrayUtils;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonObject;

public abstract class Class6528<T extends Class6367> extends Class6529<T>
{
    public Class6528(final Class1932 class1932, final Class<T> clazz) {
        super(class1932, clazz);
    }
    
    public void method19750(final JsonObject jsonObject, final T t, final JsonSerializationContext jsonSerializationContext) {
        if (t.field25468 != 1) {
            jsonObject.addProperty("weight", (Number)t.field25468);
        }
        if (t.field25469 != 0) {
            jsonObject.addProperty("quality", (Number)t.field25469);
        }
        if (!ArrayUtils.isEmpty((Object[])t.field25470)) {
            jsonObject.add("functions", jsonSerializationContext.serialize((Object)t.field25470));
        }
    }
    
    public final T method19751(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext, final Class122[] array) {
        return this.method19749(jsonObject, jsonDeserializationContext, Class9583.method35910(jsonObject, "weight", 1), Class9583.method35910(jsonObject, "quality", 0), array, Class9583.method35921(jsonObject, "functions", new Class125[0], jsonDeserializationContext, Class125[].class));
    }
    
    public abstract T method19749(final JsonObject p0, final JsonDeserializationContext p1, final int p2, final int p3, final Class122[] p4, final Class125[] p5);
}
