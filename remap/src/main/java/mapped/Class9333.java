// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.lang.reflect.Type;
import com.google.gson.GsonBuilder;
import com.google.gson.Gson;

public final class Class9333
{
    private static String[] field40057;
    public final Gson field40058;
    private Class9104<Class3833, Class7096> field40059;
    
    public Class9333() {
        this.field40058 = new GsonBuilder().registerTypeAdapter((Type)Class5593.class, (Object)new Class5976()).registerTypeAdapter((Type)Class2124.class, (Object)new Class5984()).registerTypeAdapter((Type)Class7683.class, (Object)new Class5987()).registerTypeAdapter((Type)Class7686.class, (Object)new Class5966(this)).registerTypeAdapter((Type)Class8997.class, (Object)new Class5973()).create();
    }
    
    public Class9104<Class3833, Class7096> method34573() {
        return this.field40059;
    }
    
    public void method34574(final Class9104<Class3833, Class7096> field40059) {
        this.field40059 = field40059;
    }
}
