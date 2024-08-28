package mapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public final class Class8497 {
   private final Map<Class7481, String> field37169;
   private final CompletableFuture<Map<Class7481, String>> field37170;
   public final Class5126 field37171;

   public Class8497(Class5126 var1, Class1644 var2, double var3, double var5) {
      this.field37171 = var1;
      Class1656 var9 = Class5126.method15862(var1).world;
      Class8705 var10 = var9.method6813();
      int var11 = (int)var3 >> 4;
      int var12 = (int)var5 >> 4;
      Builder var13 = ImmutableMap.builder();
      Class1705 var14 = var9.method6883();

      for (int var15 = var11 - 12; var15 <= var11 + 12; var15++) {
         for (int var16 = var12 - 12; var16 <= var12 + 12; var16++) {
            Class7481 var17 = new Class7481(var15, var16);
            String var18 = "";
            Class1674 var19 = var14.method7342(var15, var16, false);
            var18 = var18 + "Client: ";
            if (var19 != null) {
               var18 = var18 + (!var19.method7141() ? "" : " E");
               var18 = var18 + "\n";
            } else {
               var18 = var18 + "0n/a\n";
            }

            var13.put(var17, var18);
         }
      }

      this.field37169 = var13.build();
      this.field37170 = var2.<Map<Class7481, String>>method1632(() -> {
         ServerWorld var6 = var2.method1318(var10);
         if (var6 == null) {
            return ImmutableMap.of();
         } else {
            Builder var7 = ImmutableMap.builder();
            Class1703 var8 = var6.method6883();

            for (int var9x = var11 - 12; var9x <= var11 + 12; var9x++) {
               for (int var10x = var12 - 12; var10x <= var12 + 12; var10x++) {
                  Class7481 var11x = new Class7481(var9x, var10x);
                  var7.put(var11x, "Server: " + var8.method7382(var11x));
               }
            }

            return var7.build();
         }
      });
   }

   // $VF: synthetic method
   public static CompletableFuture method30086(Class8497 var0) {
      return var0.field37170;
   }

   // $VF: synthetic method
   public static Map<Class7481, String> method30087(Class8497 var0) {
      return var0.field37169;
   }
}
