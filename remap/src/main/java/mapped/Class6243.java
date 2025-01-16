// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonObject;

public class Class6243 extends Class6227<Class142>
{
    public Class6243() {
        super(new ResourceLocation("set_nbt"), Class142.class);
    }
    
    public void method18575(final JsonObject jsonObject, final Class142 class142, final JsonSerializationContext jsonSerializationContext) {
        super.method18536(jsonObject, class142, jsonSerializationContext);
        jsonObject.addProperty("tag", Class142.method695(class142).toString());
    }
    
    public Class142 method18576(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext, final Class122[] array) {
        try {
            return new Class142(array, Class5704.method16938(Class9583.method35895(jsonObject, "tag")), null);
        }
        catch (final CommandSyntaxException ex) {
            throw new JsonSyntaxException(ex.getMessage());
        }
    }
}
