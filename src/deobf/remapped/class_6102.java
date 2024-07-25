package remapped;

import java.io.IOException;
import java.net.ProtocolException;

public final class class_6102 implements class_9833 {
   private final boolean field_31227;

   public class_6102(boolean var1) {
      this.field_31227 = var1;
   }

   @Override
   public class_7839 method_45321(class_8047 var1) throws IOException {
      class_3805 var4 = (class_3805)var1;
      class_9328 var5 = var4.method_17720();
      class_327 var6 = var4.method_17718();
      class_1617 var7 = (class_1617)var4.method_36515();
      class_3918 var8 = var4.method_36516();
      long var9 = System.currentTimeMillis();
      var5.method_43066(var8);
      class_7775 var11 = null;
      if (class_3493.method_16060(var8.method_18137()) && var8.method_18133() != null) {
         if ("100-continue".equalsIgnoreCase(var8.method_18135("Expect"))) {
            var5.method_43069();
            var11 = var5.method_43068(true);
         }

         if (var11 != null) {
            if (!var7.method_7214()) {
               var6.method_1527();
            }
         } else {
            class_4131 var12 = var5.method_43067(var8, var8.method_18133().method_41288());
            class_3947 var13 = class_1259.method_5670(var12);
            var8.method_18133().method_41289(var13);
            var13.close();
         }
      }

      var5.method_43064();
      if (var11 == null) {
         var11 = var5.method_43068(false);
      }

      class_7839 var14 = var11.method_35283(var8)
         .method_35272(var6.method_1522().method_21596())
         .method_35276(var9)
         .method_35278(System.currentTimeMillis())
         .method_35268();
      int var16 = var14.method_35490();
      if (this.field_31227 && var16 == 101) {
         var14 = var14.method_35485().method_35282(class_8515.field_43594).method_35268();
      } else {
         var14 = var14.method_35485().method_35282(var5.method_43063(var14)).method_35268();
      }

      if ("close".equalsIgnoreCase(var14.method_35474().method_18135("Connection")) || "close".equalsIgnoreCase(var14.method_35472("Connection"))) {
         var6.method_1527();
      }

      if ((var16 == 204 || var16 == 205) && var14.method_35481().method_40730() > 0L) {
         throw new ProtocolException("HTTP " + var16 + " had non-zero Content-Length: " + var14.method_35481().method_40730());
      } else {
         return var14;
      }
   }
}
