// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import com.google.gson.JsonSyntaxException;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.UUID;

public class Class7376
{
    private final String field28426;
    private final String field28427;
    private final Class2157 field28428;
    private final Class5772 field28429;
    private final UUID field28430;
    private final Class2215[] field28431;
    
    private Class7376(final String field28426, final String field28427, final Class2157 field28428, final Class5772 field28429, final Class2215[] field28430, final UUID field28431) {
        this.field28426 = field28426;
        this.field28427 = field28427;
        this.field28428 = field28428;
        this.field28429 = field28429;
        this.field28430 = field28431;
        this.field28431 = field28430;
    }
    
    public JsonObject method22642(final JsonSerializationContext jsonSerializationContext) {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", this.field28426);
        jsonObject.addProperty("attribute", this.field28427);
        jsonObject.addProperty("operation", method22644(this.field28428));
        jsonObject.add("amount", jsonSerializationContext.serialize(this.field28429));
        if (this.field28430 != null) {
            jsonObject.addProperty("id", this.field28430.toString());
        }
        if (this.field28431.length != 1) {
            final JsonArray jsonArray = new JsonArray();
            final Class2215[] field28431 = this.field28431;
            for (int length = field28431.length, i = 0; i < length; ++i) {
                jsonArray.add(new JsonPrimitive(field28431[i].method8404()));
            }
            jsonObject.add("slot", jsonArray);
        }
        else {
            jsonObject.addProperty("slot", this.field28431[0].method8404());
        }
        return jsonObject;
    }
    
    public static Class7376 method22643(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext) {
        final String method35895 = Class9583.method35895(jsonObject, "name");
        final String method35896 = Class9583.method35895(jsonObject, "attribute");
        final Class2157 method35897 = method22645(Class9583.method35895(jsonObject, "operation"));
        final Class5772 class5772 = Class9583.method35920(jsonObject, "amount", jsonDeserializationContext, (Class<? extends Class5772>)Class5772.class);
        UUID fromString = null;
        Class2215[] array;
        if (Class9583.method35887(jsonObject, "slot")) {
            array = new Class2215[] { Class2215.method8405(Class9583.method35895(jsonObject, "slot")) };
        }
        else {
            if (!Class9583.method35891(jsonObject, "slot")) {
                throw new JsonSyntaxException("Invalid or missing attribute modifier slot; must be either string or array of strings.");
            }
            final JsonArray method35898 = Class9583.method35917(jsonObject, "slot");
            array = new Class2215[method35898.size()];
            int n = 0;
            final Iterator iterator = method35898.iterator();
            while (iterator.hasNext()) {
                array[n++] = Class2215.method8405(Class9583.method35894((JsonElement)iterator.next(), "slot"));
            }
            if (array.length == 0) {
                throw new JsonSyntaxException("Invalid attribute modifier slot; must contain at least one entry.");
            }
        }
        if (jsonObject.has("id")) {
            final String method35899 = Class9583.method35895(jsonObject, "id");
            try {
                fromString = UUID.fromString(method35899);
            }
            catch (final IllegalArgumentException ex) {
                throw new JsonSyntaxException("Invalid attribute modifier id '" + method35899 + "' (must be UUID format, with dashes)");
            }
        }
        return new Class7376(method35895, method35896, method35897, class5772, array, fromString);
    }
    
    private static String method22644(final Class2157 obj) {
        switch (Class8800.field36997[obj.ordinal()]) {
            case 1: {
                return "addition";
            }
            case 2: {
                return "multiply_base";
            }
            case 3: {
                return "multiply_total";
            }
            default: {
                throw new IllegalArgumentException("Unknown operation " + obj);
            }
        }
    }
    
    private static Class2157 method22645(final String str) {
        switch (str) {
            case "addition": {
                return Class2157.field12809;
            }
            case "multiply_base": {
                return Class2157.field12810;
            }
            case "multiply_total": {
                return Class2157.field12811;
            }
            default: {
                throw new JsonSyntaxException("Unknown attribute modifier operation " + str);
            }
        }
    }
}
