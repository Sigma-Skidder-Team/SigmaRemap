package mapped;

import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent$Serializer;

public class Class7173 implements Class7170<Class6811> {
   public Class6811 method22519(JsonObject var1) {
      IFormattableTextComponent var4 = ITextComponent$Serializer.func_240641_a_(var1.get("description"));
      if (var4 != null) {
         int var5 = JSONUtils.method32777(var1, "pack_format");
         return new Class6811(var4, var5);
      } else {
         throw new JsonParseException("Invalid/missing description!");
      }
   }

   @Override
   public String method22518() {
      return "pack";
   }
}
