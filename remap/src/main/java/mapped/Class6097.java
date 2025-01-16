// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.Map;
import com.google.gson.JsonObject;
import net.minecraft.util.NonNullList;

public class Class6097 implements Class6096<Class3664>
{
    public Class3664 method18183(final ResourceLocation class1932, final JsonObject jsonObject) {
        final String method35896 = Class9583.method35896(jsonObject, "group", "");
        final Map method35897 = Class3664.method11314(Class9583.method35914(jsonObject, "key"));
        final String[] method35898 = Class3664.method11307(Class3664.method11315(Class9583.method35917(jsonObject, "pattern")));
        final int length = method35898[0].length();
        final int length2 = method35898.length;
        return new Class3664(class1932, method35896, length, length2, Class3664.method11316(method35898, method35897, length, length2), Class3664.method11312(Class9583.method35914(jsonObject, "result")));
    }
    
    public Class3664 method18184(final ResourceLocation class1932, final PacketBuffer class1933) {
        final int method29501 = class1933.readVarInt();
        final int method29502 = class1933.readVarInt();
        final String method29503 = class1933.method29513(32767);
        final NonNullList<Class120> method29504 = NonNullList.withSize(method29501 * method29502, Class120.field374);
        for (int i = 0; i < method29504.size(); ++i) {
            method29504.set(i, Class120.method621(class1933));
        }
        return new Class3664(class1932, method29503, method29501, method29502, method29504, class1933.method29511());
    }
    
    public void method18185(final PacketBuffer class8654, final Class3664 class8655) {
        class8654.writeVarInt(Class3664.method11317(class8655));
        class8654.writeVarInt(Class3664.method11318(class8655));
        class8654.method29514(Class3664.method11319(class8655));
        final Iterator iterator = Class3664.method11320(class8655).iterator();
        while (iterator.hasNext()) {
            ((Class120)iterator.next()).method614(class8654);
        }
        class8654.method29509(Class3664.method11321(class8655));
    }
}
