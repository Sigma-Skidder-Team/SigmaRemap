// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.GsonBuilder;
import java.util.Iterator;
import java.io.IOException;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.Gson;

public class Class3691 implements Class3689
{
    private static final Gson field17003;
    private final Class7203 field17004;
    
    public Class3691(final Class7203 field17004) {
        this.field17004 = field17004;
    }
    
    @Override
    public void method11337(final Class8842 class8842) throws IOException {
        final JsonObject jsonObject = new JsonObject();
        Class90.field204.method507().forEach(class8843 -> jsonObject2.add(class8843.toString(), method11354(Class90.field204.method505(class8843))));
        Class3689.method11346(Class3691.field17003, class8842, (JsonElement)jsonObject, this.field17004.method22099().resolve("reports/registries.json"));
    }
    
    private static <T> JsonElement method11354(final Class91<T> class91) {
        final JsonObject jsonObject = new JsonObject();
        if (class91 instanceof Class93) {
            jsonObject.addProperty("default", ((Class93)class91).method560().toString());
        }
        jsonObject.addProperty("protocol_id", (Number)Class90.field204.method504((Class93)class91));
        final JsonObject jsonObject2 = new JsonObject();
        for (final Class1932 class92 : class91.method507()) {
            final int method504 = class91.method504(class91.method505(class92));
            final JsonObject jsonObject3 = new JsonObject();
            jsonObject3.addProperty("protocol_id", (Number)method504);
            jsonObject2.add(class92.toString(), (JsonElement)jsonObject3);
        }
        jsonObject.add("entries", (JsonElement)jsonObject2);
        return (JsonElement)jsonObject;
    }
    
    @Override
    public String method11338() {
        return "Registry Dump";
    }
    
    static {
        field17003 = new GsonBuilder().setPrettyPrinting().create();
    }
}
