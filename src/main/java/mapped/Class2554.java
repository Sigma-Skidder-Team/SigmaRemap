package mapped;

import com.google.gson.*;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

import java.lang.reflect.Type;

public final class Class2554 implements JsonDeserializer<ITextComponent> {
   public IFormattableTextComponent deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      if (!var1.isJsonPrimitive()) {
         if (!var1.isJsonArray()) {
            throw new JsonParseException("Don't know how to turn " + var1 + " into a Component");
         } else {
            JsonArray var6 = var1.getAsJsonArray();
            IFormattableTextComponent var7 = null;

            for (JsonElement var9 : var6) {
               IFormattableTextComponent var10 = this.deserialize(var9, var9.getClass(), var3);
               if (var7 != null) {
                  var7.append(var10);
               } else {
                  var7 = var10;
               }
            }

            return var7;
         }
      } else {
         return new StringTextComponent(var1.getAsString());
      }
   }
}
