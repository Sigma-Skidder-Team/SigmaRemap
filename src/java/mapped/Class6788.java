package mapped;

import com.google.gson.JsonObject;
import java.util.Date;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

public class Class6788 extends Class6787<String> {
   public Class6788(String var1) {
      this(var1, (Date)null, (String)null, (Date)null, (String)null);
   }

   public Class6788(String var1, Date var2, String var3, Date var4, String var5) {
      super(var1, var2, var3, var4, var5);
   }

   @Override
   public ITextComponent method20679() {
      return new StringTextComponent(this.method20686());
   }

   public Class6788(JsonObject var1) {
      super(method20685(var1), var1);
   }

   private static String method20685(JsonObject var0) {
      return !var0.has("ip") ? null : var0.get("ip").getAsString();
   }

   @Override
   public void method20678(JsonObject var1) {
      if (this.method20686() != null) {
         var1.addProperty("ip", this.method20686());
         super.method20678(var1);
      }
   }
}
