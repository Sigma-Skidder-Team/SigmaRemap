package remapped;

import com.google.common.collect.Maps;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import java.util.Map;

public class class_903 extends class_2255<class_4797> {
   private static final Map<class_558, class_1570> field_4633 = class_9665.<Map<class_558, class_1570>>method_44659(Maps.newHashMap(), var0 -> {
      class_1570 var3 = new class_1570(0, 0, 64, 32);
      class_600 var4 = new class_600();
      class_7840 var5 = new class_7840(0.0F);
      var0.put(class_8469.field_43284, var3);
      var0.put(class_8469.field_43285, var3);
      var0.put(class_8469.field_43283, var4);
      var0.put(class_8469.field_43281, var4);
      var0.put(class_8469.field_43282, var3);
      var0.put(class_8469.field_43286, var5);
   });
   private static final Map<class_558, class_4639> field_4632 = class_9665.<Map<class_558, class_4639>>method_44659(Maps.newHashMap(), var0 -> {
      var0.put(class_8469.field_43284, new class_4639("textures/entity/skeleton/skeleton.png"));
      var0.put(class_8469.field_43285, new class_4639("textures/entity/skeleton/wither_skeleton.png"));
      var0.put(class_8469.field_43281, new class_4639("textures/entity/zombie/zombie.png"));
      var0.put(class_8469.field_43282, new class_4639("textures/entity/creeper/creeper.png"));
      var0.put(class_8469.field_43286, new class_4639("textures/entity/enderdragon/dragon.png"));
      var0.put(class_8469.field_43283, class_1512.method_6922());
   });

   public class_903(class_3569 var1) {
      super(var1);
   }

   public void method_3867(class_4797 var1, float var2, class_7966 var3, class_2565 var4, int var5, int var6) {
      float var9 = var1.method_22110(var2);
      class_2522 var10 = var1.method_17403();
      boolean var11 = var10.method_8360() instanceof class_7011;
      class_240 var12 = !var11 ? null : var10.<class_240>method_10313(class_7011.field_35952);
      float var13 = 22.5F * (float)(!var11 ? var10.<Integer>method_10313(class_3725.field_18230) : (2 + var12.method_1031()) * 4);
      method_3866(var12, var13, ((class_8550)var10.method_8360()).method_39336(), var1.method_22113(), var9, var3, var4, var5);
   }

   public static void method_3866(class_240 var0, float var1, class_558 var2, GameProfile var3, float var4, class_7966 var5, class_2565 var6, int var7) {
      class_1570 var10 = field_4633.get(var2);
      var5.method_36063();
      if (var0 != null) {
         float var11 = 0.25F;
         var5.method_36065((double)(0.5F - (float)var0.method_1041() * 0.25F), 0.25, (double)(0.5F - (float)var0.method_1034() * 0.25F));
      } else {
         var5.method_36065(0.5, 0.0, 0.5);
      }

      var5.method_36062(-1.0F, -1.0F, 1.0F);
      class_7907 var12 = var6.method_11645(method_3868(var2, var3));
      var10.method_7085(var4, var1, 0.0F);
      var10.method_45499(var5, var12, var7, class_5367.field_27381, 1.0F, 1.0F, 1.0F, 1.0F);
      var5.method_36064();
   }

   private static class_3581 method_3868(class_558 var0, GameProfile var1) {
      class_4639 var4 = field_4632.get(var0);
      if (var0 == class_8469.field_43283 && var1 != null) {
         MinecraftClient var5 = MinecraftClient.getInstance();
         Map var6 = var5.method_8557().method_44310(var1);
         return !var6.containsKey(Type.SKIN)
            ? class_3581.method_16755(class_1512.method_6921(class_704.method_3242(var1)))
            : class_3581.method_16705(var5.method_8557().method_44311((MinecraftProfileTexture)var6.get(Type.SKIN), Type.SKIN));
      } else {
         return class_3581.method_16753(var4);
      }
   }
}
