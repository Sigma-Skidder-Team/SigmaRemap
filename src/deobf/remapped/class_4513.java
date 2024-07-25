package remapped;

import com.google.gson.JsonObject;
import java.util.Date;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

public class class_4513 extends class_4424<String> {
   public class_4513(String var1) {
      this(var1, (Date)null, (String)null, (Date)null, (String)null);
   }

   public class_4513(String var1, Date var2, String var3, Date var4, String var5) {
      super(var1, var2, var3, var4, var5);
   }

   @Override
   public ITextComponent method_20565() {
      return new StringTextComponent(this.method_37661());
   }

   public class_4513(JsonObject var1) {
      super(method_20976(var1), var1);
   }

   private static String method_20976(JsonObject var0) {
      return !var0.has("ip") ? null : var0.get("ip").getAsString();
   }

   @Override
   public void method_37664(JsonObject var1) {
      if (this.method_37661() != null) {
         var1.addProperty("ip", this.method_37661());
         super.method_37664(var1);
      }
   }
}
