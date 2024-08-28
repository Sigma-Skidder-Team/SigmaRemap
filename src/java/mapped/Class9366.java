package mapped;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class9366 {
   private static final Logger field43467 = LogManager.getLogger();
   private final ResourceLocation field43468;
   private final Class283 field43469;
   private final Gson field43470 = Class8746.method31555().create();

   public Class9366(ResourceLocation var1, Class283 var2) {
      this.field43468 = var1;
      this.field43469 = var2;
   }

   public final Class122[] method35497(JsonArray var1, String var2, Class7538 var3) {
      Class122[] var6 = (Class122[])this.field43470.fromJson(var1, Class122[].class);
      Class8478 var7 = new Class8478(var3, this.field43469::method1052, var0 -> null);

      for (Class122 var11 : var6) {
         var11.method367(var7);
         var7.method29961().forEach((var1x, var2x) -> field43467.warn("Found validation problem in advancement trigger {}/{}: {}", var2, var1x, var2x));
      }

      return var6;
   }

   public ResourceLocation method35498() {
      return this.field43468;
   }
}
