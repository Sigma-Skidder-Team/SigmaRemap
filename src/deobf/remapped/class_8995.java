package remapped;

import com.google.gson.JsonObject;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;
import java.util.function.Supplier;

public class class_8995 {
   private final String field_46049;
   private final class_9257 field_46052;
   private final String field_46048;
   private final class_9257 field_46051;
   private final class_7063 field_46047;

   private class_8995(String var1, String var2, class_7063 var3) {
      this.field_46049 = var1;
      this.field_46052 = class_795.method_3531(var1);
      this.field_46048 = var2;
      this.field_46051 = class_795.method_3531(var2);
      this.field_46047 = var3;
   }

   public void method_41267(Supplier<class_8406> var1, class_8406 var2) {
      try {
         List var5 = this.field_46052.method_42652(var2);
         if (!var5.isEmpty()) {
            this.field_46047.method_32535((class_8406)var1.get(), this.field_46051, var5);
         }
      } catch (CommandSyntaxException var6) {
      }
   }

   public JsonObject method_41265() {
      JsonObject var3 = new JsonObject();
      var3.addProperty("source", this.field_46049);
      var3.addProperty("target", this.field_46048);
      var3.addProperty("op", class_7063.method_32533(this.field_46047));
      return var3;
   }

   public static class_8995 method_41268(JsonObject var0) {
      String var3 = class_6539.method_29796(var0, "source");
      String var4 = class_6539.method_29796(var0, "target");
      class_7063 var5 = class_7063.method_32534(class_6539.method_29796(var0, "op"));
      return new class_8995(var3, var4, var5);
   }
}
