// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.minecraft.item.ItemStack;

public class Class6100<T extends Class3685> implements Class6096<T>
{
    public final Class9358<T> field24755;
    
    public Class6100(final Class9358<T> field24755) {
        this.field24755 = field24755;
    }
    
    public T method18194(final ResourceLocation class1932, final JsonObject jsonObject) {
        final String method35896 = Class9583.method35896(jsonObject, "group", "");
        Class120 class1933;
        if (!Class9583.method35891(jsonObject, "ingredient")) {
            class1933 = Class120.method622((JsonElement)Class9583.method35914(jsonObject, "ingredient"));
        }
        else {
            class1933 = Class120.method622((JsonElement)Class9583.method35917(jsonObject, "ingredient"));
        }
        return this.field24755.method34696(class1932, method35896, class1933, new ItemStack(Registry.field211.getOrDefault(new ResourceLocation(Class9583.method35895(jsonObject, "result"))), Class9583.method35909(jsonObject, "count")));
    }
    
    public T method18195(final ResourceLocation class1932, final PacketBuffer class1933) {
        return this.field24755.method34696(class1932, class1933.method29513(32767), Class120.method621(class1933), class1933.method29511());
    }
    
    public void method18196(final PacketBuffer class8654, final T t) {
        class8654.method29514(t.field16990);
        t.field16985.method614(class8654);
        class8654.method29509(t.field16986);
    }
}
