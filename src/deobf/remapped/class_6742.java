package remapped;

import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

public class class_6742 implements class_2995 {
   private static String[] field_34797;
   private final class_1893 field_34796;
   private final Map<Integer, List<class_118>> field_34795 = Maps.newHashMap();

   @Override
   public void method_13699() {
      this.field_34795.clear();
   }

   public void method_30887(int var1, List<class_118> var2) {
      this.field_34795.put(var1, var2);
   }

   public class_6742(class_1893 var1) {
      this.field_34796 = var1;
   }

   @Override
   public void method_13698(class_7966 var1, class_2565 var2, double var3, double var5, double var7) {
      class_9071 var11 = this.field_34796.field_9590.method_35949();
      class_3542.method_16438();
      class_3542.method_16488();
      class_3542.method_16437();
      class_3542.method_16354();
      class_1331 var12 = new class_1331(var11.method_41627().field_7336, 0.0, var11.method_41627().field_7334);
      this.field_34795.forEach((var1x, var2x) -> {
         for (int var5x = 0; var5x < var2x.size(); var5x++) {
            class_118 var6 = var2x.get(var5x);
            if (var12.method_12171(var6.field_290, 160.0)) {
               double var7x = (double)var6.field_290.method_12173() + 0.5;
               double var9 = (double)var6.field_290.method_12165() + 2.0 + (double)var5x * 0.25;
               double var11x = (double)var6.field_290.method_12185() + 0.5;
               int var13 = !var6.field_287 ? -3355444 : -16711936;
               class_3372.method_15553(var6.field_289, var7x, var9, var11x, var13);
            }
         }
      });
      class_3542.method_16428();
      class_3542.method_16432();
      class_3542.method_16489();
   }
}
