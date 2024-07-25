package remapped;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_8096 {
   private static final Logger field_41481 = LogManager.getLogger();
   private final Identifier field_41480;
   private final class_264 field_41482;
   private final Gson field_41484 = class_5746.method_26000().create();

   public class_8096(Identifier var1, class_264 var2) {
      this.field_41480 = var1;
      this.field_41482 = var2;
   }

   public final class_7279[] method_36782(JsonArray var1, String var2, class_2144 var3) {
      class_7279[] var6 = (class_7279[])this.field_41484.fromJson(var1, class_7279[].class);
      class_4737 var7 = new class_4737(var3, this.field_41482::method_1146, var0 -> null);

      for (class_7279 var11 : var6) {
         var11.method_12680(var7);
         var7.method_21883().forEach((var1x, var2x) -> field_41481.warn("Found validation problem in advancement trigger {}/{}: {}", var2, var1x, var2x));
      }

      return var6;
   }

   public Identifier method_36783() {
      return this.field_41480;
   }
}
