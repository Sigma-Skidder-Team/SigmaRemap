package remapped;

import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import java.util.HashMap;
import java.util.UUID;

public class class_5869<T extends Entity> extends class_6353<AbstractClientPlayerEntity, class_3169<AbstractClientPlayerEntity>> {
   public static HashMap<UUID, Identifier> field_29802 = new HashMap<UUID, Identifier>();

   public class_5869(EntityRenderDispatcher var1) {
      this(var1, false);
   }

   public class_5869(EntityRenderDispatcher var1, boolean var2) {
      super(var1, new class_3169<AbstractClientPlayerEntity>(0.0F, var2), 0.5F);
      this.method_29100(new class_8386<AbstractClientPlayerEntity, class_3169<AbstractClientPlayerEntity>>(this));
   }

   public void method_26732(AbstractClientPlayerEntity var1, float var2, float var3, class_7966 var4, class_2565 var5, int var6, float var7, float var8) {
      class_2344 var11 = this.field_32487;
      var11.method_10741(false);
      var11.field_11696.field_8200 = true;
      float var12 = var1.field_29618;
      float var13 = var1.rotationPitch;
      float var14 = class_5181.method_23766(var8, 0.15, 0.84, 0.34, 1.0);
      float var15 = ((float) MinecraftClient.getInstance().thePlayer.field_41697 + MinecraftClient.getInstance().method_8554()) * 3.0F + var14 * 160.0F;
      var1.field_29618 = var15;
      var1.rotationPitch = -10.0F;
      this.field_32479 = var7;
      super.method_29107(var1, var2, 1.0F, var4, var5, var6);
      var1.field_29618 = var12;
      var1.rotationPitch = var13;
   }

   public Vector3d method_26733(AbstractClientPlayerEntity var1, float var2) {
      return super.method_32555(var1, var2);
   }

   public Identifier method_26731(AbstractClientPlayerEntity var1) {
      boolean var4 = field_29802.containsKey(var1.method_3247().getId()) && field_29802.get(var1.method_3247().getId()).equals(new Identifier(""));
      if (!var4 && field_29802.containsKey(var1.method_3247().getId())) {
         return field_29802.get(var1.method_3247().getId());
      } else {
         if (!var1.method_44885() && !var4) {
            field_29802.put(var1.method_3247().getId(), new Identifier(""));
            MinecraftClient.getInstance().method_8557().method_44309(var1.method_3247(), (var1x, var2, var3) -> {
               if (var1x == Type.SKIN) {
                  field_29802.put(var1.method_3247().getId(), var2);
               }
            }, true);
         }

         return var1.method_44889();
      }
   }
}
