// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;
import com.google.gson.JsonObject;

public class Class6099 implements Class6096<Class3679>
{
    public Class3679 method18190(final Class1932 class1932, final JsonObject jsonObject) {
        final String method35896 = Class9583.method35896(jsonObject, "group", "");
        final Class2265<Class120> method35897 = method18191(Class9583.method35917(jsonObject, "ingredients"));
        if (method35897.isEmpty()) {
            throw new JsonParseException("No ingredients for shapeless recipe");
        }
        if (method35897.size() <= 9) {
            return new Class3679(class1932, method35896, Class3664.method11312(Class9583.method35914(jsonObject, "result")), method35897);
        }
        throw new JsonParseException("Too many ingredients for shapeless recipe");
    }
    
    private static Class2265<Class120> method18191(final JsonArray jsonArray) {
        final Class2265<Object> method8506 = Class2265.method8506();
        for (int i = 0; i < jsonArray.size(); ++i) {
            final Class120 method8507 = Class120.method622(jsonArray.get(i));
            if (!method8507.method616()) {
                method8506.add(method8507);
            }
        }
        return (Class2265<Class120>)method8506;
    }
    
    public Class3679 method18192(final Class1932 class1932, final Class8654 class1933) {
        final String method29513 = class1933.method29513(32767);
        final Class2265<Class120> method29514 = Class2265.method8507(class1933.method29501(), Class120.field374);
        for (int i = 0; i < method29514.size(); ++i) {
            method29514.set(i, Class120.method621(class1933));
        }
        return new Class3679(class1932, method29513, class1933.method29511(), method29514);
    }
    
    public void method18193(final Class8654 class8654, final Class3679 class8655) {
        class8654.method29514(Class3679.method11325(class8655));
        class8654.method29505(Class3679.method11326(class8655).size());
        final Iterator iterator = Class3679.method11326(class8655).iterator();
        while (iterator.hasNext()) {
            ((Class120)iterator.next()).method614(class8654);
        }
        class8654.method29509(Class3679.method11327(class8655));
    }
}
