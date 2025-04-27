// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collection;
import java.util.List;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class Class5224 extends Class5207
{
    public static final Class2449<String, String> field22245;
    
    public static String method16340(String string) {
        if (string == null || string.equalsIgnoreCase("null")) {
            string = "{\"text\":\"\"}";
        }
        else {
            if ((!string.startsWith("\"") || !string.endsWith("\"")) && (!string.startsWith("{") || !string.endsWith("}"))) {
                return method16341(string);
            }
            if (string.startsWith("\"") && string.endsWith("\"")) {
                string = "{\"text\":" + string + "}";
            }
        }
        try {
            Class8557.method28750().fromJson(string, (Class)JsonObject.class);
            return string;
        }
        catch (final Exception ex) {
            if (Class8563.method28792().method23289()) {
                return method16341(string);
            }
        }
        final Exception ex;
        Class8563.method28793().method34742().warning("Invalid JSON String: \"" + string + "\" Please report this issue to the ViaVersion Github: " + ex.getMessage());
        return "{\"text\":\"\"}";
    }
    
    private static String method16341(final String s) {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("text", s);
        return Class8557.method28750().toJson(jsonObject);
    }
    
    public static Class7562 method16342(final Class6108 class6108) {
        return Class8563.method28794().method33549().method29950(Class6480.class).method19507(class6108);
    }
    
    public static boolean method16343(final int n) {
        return n == 267 || n == 268 || n == 272 || n == 276 || n == 283;
    }
    
    @Override
    public void method16306() {
        this.method16316(Class2044.field11647, 0, 0, new Class2781(this));
        Class8414.method28105(this);
        Class7641.method24157(this);
        Class8958.method31780(this);
        Class8136.method26816(this);
        Class6543.method19784(this);
    }
    
    @Override
    public void method16311(final Class8720 class8720) {
        class8720.method29948(Class6480.class, new Class6480());
        class8720.method29948(Class6479.class, new Class6479());
        class8720.method29948(Class6482.class, new Class6482());
        class8720.method29948(Class6486.class, new Class6486());
        class8720.method29948(Class6483.class, new Class6483());
        class8720.method29948(Class6495.class, new Class6495());
        class8720.method29947(Class6487.class);
        if (Class8563.method28792().method23284()) {
            Class8563.method28793().method34749(new Class1332(), 1L);
        }
    }
    
    @Override
    public boolean method16308(final Class clazz) {
        return Class8563.method28794().method33549().method29950(Class6479.class).method19505(clazz);
    }
    
    @Override
    public void method16309(final Class6108 class6108, final Object o, final List list) throws Exception {
        list.addAll(class6108.method18207(Class6646.class).method20187(o));
    }
    
    @Override
    public void method16307(final Class6108 class6108) {
        class6108.method18209(new Class6634(class6108));
        class6108.method18209(new Class6646(class6108));
        class6108.method18209(new Class6653(class6108));
        class6108.method18209(new Class6636(class6108));
        class6108.method18209(new Class6652(class6108));
        class6108.method18209(new Class6648(class6108));
    }
    
    static {
        field22245 = new Class2455(Class5260.field22308);
    }
}
