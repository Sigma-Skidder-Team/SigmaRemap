package remapped;

import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent$class_40;

public class class_4821 implements class_6146<class_975> {
   public class_975 method_22212(JsonObject var1) {
      IFormattableTextComponent var4 = ITextComponent$class_40.func_240641_a_(var1.get("description"));
      if (var4 != null) {
         int var5 = class_6539.method_29767(var1, "pack_format");
         return new class_975(var4, var5);
      } else {
         throw new JsonParseException("Invalid/missing description!");
      }
   }

   @Override
   public String method_28196() {
      return "pack";
   }
}
