// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonSyntaxException;
import com.google.gson.JsonElement;
import com.google.common.base.Joiner;
import net.minecraft.entity.EntityType;

public abstract class Class8150
{
    public static final Class8150 field33561;
    private static final Joiner field33562;
    
    public abstract boolean method26845(final EntityType<?> p0);
    
    public abstract JsonElement method26846();
    
    public static Class8150 method26847(final JsonElement jsonElement) {
        if (jsonElement == null || jsonElement.isJsonNull()) {
            return Class8150.field33561;
        }
        final String method35894 = Class9583.method35894(jsonElement, "type");
        if (!method35894.startsWith("#")) {
            return new Class8152(Class90.field210.method506(new Class1932(method35894)).orElseThrow(() -> {
                new JsonSyntaxException("Unknown entity type '" + obj + "', valid types are: " + Class8150.field33562.join((Iterable)Class90.field210.method507()));
                return;
            }));
        }
        return new Class8149(Class8039.method26371().method18461(new Class1932(method35894.substring(1))));
    }
    
    public static Class8150 method26848(final EntityType<?> class7499) {
        return new Class8152(class7499);
    }
    
    public static Class8150 method26849(final Class7909<EntityType<?>> class7909) {
        return new Class8149(class7909);
    }
    
    static {
        field33561 = new Class8151();
        field33562 = Joiner.on(", ");
    }
}
