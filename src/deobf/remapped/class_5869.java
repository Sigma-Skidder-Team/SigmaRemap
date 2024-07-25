package remapped;

import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import java.util.HashMap;
import java.util.UUID;

public class class_5869<T extends class_8145> extends class_6353<class_9716, class_3169<class_9716>> {
   public static HashMap<UUID, class_4639> field_29802 = new HashMap<UUID, class_4639>();

   public class_5869(class_6122 var1) {
      this(var1, false);
   }

   public class_5869(class_6122 var1, boolean var2) {
      super(var1, new class_3169<class_9716>(0.0F, var2), 0.5F);
      this.method_29100(new class_8386<class_9716, class_3169<class_9716>>(this));
   }

   public void method_26732(class_9716 var1, float var2, float var3, class_7966 var4, class_2565 var5, int var6, float var7, float var8) {
      class_2344 var11 = this.field_32487;
      var11.method_10741(false);
      var11.field_11696.field_8200 = true;
      float var12 = var1.field_29618;
      float var13 = var1.field_41755;
      float var14 = class_5181.method_23766(var8, 0.15, 0.84, 0.34, 1.0);
      float var15 = ((float) MinecraftClient.method_8510().field_9632.field_41697 + MinecraftClient.method_8510().method_8554()) * 3.0F + var14 * 160.0F;
      var1.field_29618 = var15;
      var1.field_41755 = -10.0F;
      this.field_32479 = var7;
      super.method_29107(var1, var2, 1.0F, var4, var5, var6);
      var1.field_29618 = var12;
      var1.field_41755 = var13;
   }

   public class_1343 method_26733(class_9716 var1, float var2) {
      return super.method_32555(var1, var2);
   }

   public class_4639 method_26731(class_9716 var1) {
      boolean var4 = field_29802.containsKey(var1.method_3247().getId()) && field_29802.get(var1.method_3247().getId()).equals(new class_4639(""));
      if (!var4 && field_29802.containsKey(var1.method_3247().getId())) {
         return field_29802.get(var1.method_3247().getId());
      } else {
         if (!var1.method_44885() && !var4) {
            field_29802.put(var1.method_3247().getId(), new class_4639(""));
            MinecraftClient.method_8510().method_8557().method_44309(var1.method_3247(), (var1x, var2, var3) -> {
               if (var1x == Type.SKIN) {
                  field_29802.put(var1.method_3247().getId(), var2);
               }
            }, true);
         }

         return var1.method_44889();
      }
   }
}
