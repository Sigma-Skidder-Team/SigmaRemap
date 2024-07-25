package remapped;

import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class class_2779 implements class_2995 {
   private static String[] field_13573;
   private final MinecraftClient field_13571;
   private final Map<class_8760, Map<String, class_9616>> field_13570 = Maps.newIdentityHashMap();
   private final Map<class_8760, Map<String, class_9616>> field_13569 = Maps.newIdentityHashMap();
   private final Map<class_8760, Map<String, Boolean>> field_13572 = Maps.newIdentityHashMap();

   public class_2779(MinecraftClient var1) {
      this.field_13571 = var1;
   }

   @Override
   public void method_13698(class_7966 var1, class_2565 var2, double var3, double var5, double var7) {
      Camera var11 = this.field_13571.gameRenderer.method_35949();
      ClientWorld var12 = this.field_13571.theWorld;
      class_8760 var13 = var12.method_22572();
      BlockPos var14 = new BlockPos(var11.method_41627().field_7336, 0.0, var11.method_41627().field_7334);
      class_7907 var15 = var2.method_11645(RenderLayer.method_16744());
      if (this.field_13570.containsKey(var13)) {
         for (class_9616 var17 : this.field_13570.get(var13).values()) {
            if (var14.method_12171(var17.method_44396(), 500.0)) {
               WorldRenderer.method_20013(
                  var1,
                  var15,
                  (double)var17.field_48996 - var3,
                  (double)var17.field_48995 - var5,
                  (double)var17.field_48992 - var7,
                  (double)(var17.field_48991 + 1) - var3,
                  (double)(var17.field_48993 + 1) - var5,
                  (double)(var17.field_48994 + 1) - var7,
                  1.0F,
                  1.0F,
                  1.0F,
                  1.0F,
                  1.0F,
                  1.0F,
                  1.0F
               );
            }
         }
      }

      if (this.field_13569.containsKey(var13)) {
         for (Entry var22 : this.field_13569.get(var13).entrySet()) {
            String var18 = (String)var22.getKey();
            class_9616 var19 = (class_9616)var22.getValue();
            Boolean var20 = this.field_13572.get(var13).get(var18);
            if (var14.method_12171(var19.method_44396(), 500.0)) {
               if (!var20) {
                  WorldRenderer.method_20013(
                     var1,
                     var15,
                     (double)var19.field_48996 - var3,
                     (double)var19.field_48995 - var5,
                     (double)var19.field_48992 - var7,
                     (double)(var19.field_48991 + 1) - var3,
                     (double)(var19.field_48993 + 1) - var5,
                     (double)(var19.field_48994 + 1) - var7,
                     0.0F,
                     0.0F,
                     1.0F,
                     1.0F,
                     0.0F,
                     0.0F,
                     1.0F
                  );
               } else {
                  WorldRenderer.method_20013(
                     var1,
                     var15,
                     (double)var19.field_48996 - var3,
                     (double)var19.field_48995 - var5,
                     (double)var19.field_48992 - var7,
                     (double)(var19.field_48991 + 1) - var3,
                     (double)(var19.field_48993 + 1) - var5,
                     (double)(var19.field_48994 + 1) - var7,
                     0.0F,
                     1.0F,
                     0.0F,
                     1.0F,
                     0.0F,
                     1.0F,
                     0.0F
                  );
               }
            }
         }
      }
   }

   public void method_12649(class_9616 var1, List<class_9616> var2, List<Boolean> var3, class_8760 var4) {
      if (!this.field_13570.containsKey(var4)) {
         this.field_13570.put(var4, Maps.newHashMap());
      }

      if (!this.field_13569.containsKey(var4)) {
         this.field_13569.put(var4, Maps.newHashMap());
         this.field_13572.put(var4, Maps.newHashMap());
      }

      this.field_13570.get(var4).put(var1.toString(), var1);

      for (int var7 = 0; var7 < var2.size(); var7++) {
         class_9616 var8 = (class_9616)var2.get(var7);
         Boolean var9 = (Boolean)var3.get(var7);
         this.field_13569.get(var4).put(var8.toString(), var8);
         this.field_13572.get(var4).put(var8.toString(), var9);
      }
   }

   @Override
   public void method_13699() {
      this.field_13570.clear();
      this.field_13569.clear();
      this.field_13572.clear();
   }
}
