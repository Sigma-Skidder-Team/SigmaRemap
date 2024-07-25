package remapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public final class class_4812 {
   private final Map<class_2034, String> field_24072;
   private final CompletableFuture<Map<class_2034, String>> field_24071;

   private class_4812(class_4537 var1, class_7762 var2, double var3, double var5) {
      this.field_24070 = var1;
      class_174 var9 = class_4537.method_21065(var1).field_9601;
      class_5621 var10 = var9.method_29545();
      int var11 = (int)var3 >> 4;
      int var12 = (int)var5 >> 4;
      Builder var13 = ImmutableMap.builder();
      class_5360 var14 = var9.method_745();

      for (int var15 = var11 - 12; var15 <= var11 + 12; var15++) {
         for (int var16 = var12 - 12; var16 <= var12 + 12; var16++) {
            class_2034 var17 = new class_2034(var15, var16);
            String var18 = "";
            class_2654 var19 = var14.method_14820(var15, var16, false);
            var18 = var18 + "Client: ";
            if (var19 != null) {
               var18 = var18 + (!var19.method_12003() ? "" : " E");
               var18 = var18 + "\n";
            } else {
               var18 = var18 + "0n/a\n";
            }

            var13.put(var17, var18);
         }
      }

      this.field_24072 = var13.build();
      this.field_24071 = var2.<Map<class_2034, String>>method_34452(() -> {
         class_6331 var6 = var2.method_1697(var10);
         if (var6 == null) {
            return ImmutableMap.of();
         } else {
            Builder var7 = ImmutableMap.builder();
            class_2206 var8 = var6.method_28945();

            for (int var9x = var11 - 12; var9x <= var11 + 12; var9x++) {
               for (int var10x = var12 - 12; var10x <= var12 + 12; var10x++) {
                  class_2034 var11x = new class_2034(var9x, var10x);
                  var7.put(var11x, "Server: " + var8.method_10190(var11x));
               }
            }

            return var7.build();
         }
      });
   }
}
