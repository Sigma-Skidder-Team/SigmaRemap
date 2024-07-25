package remapped;

import com.mojang.authlib.GameProfile;
import java.util.UUID;
import org.apache.commons.lang3.StringUtils;

public class class_8386<T extends LivingEntity, M extends class_6521<T> & class_8667> extends class_4171<T, M> {
   private final float field_42904;
   private final float field_42903;
   private final float field_42902;

   public class_8386(class_2514<T, M> var1) {
      this(var1, 1.0F, 1.0F, 1.0F);
   }

   public class_8386(class_2514<T, M> var1, float var2, float var3, float var4) {
      super(var1);
      this.field_42904 = var2;
      this.field_42903 = var3;
      this.field_42902 = var4;
   }

   public void method_38642(class_7966 var1, class_2565 var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      ItemStack var13 = var4.method_26520(class_6943.field_35704);
      if (!var13.method_28022()) {
         class_2451 var14 = var13.method_27960();
         var1.method_36063();
         var1.method_36062(this.field_42904, this.field_42903, this.field_42902);
         boolean var15 = var4 instanceof class_7666 || var4 instanceof class_9355;
         if (var4.method_26449() && !(var4 instanceof class_7666)) {
            float var16 = 2.0F;
            float var17 = 1.4F;
            var1.method_36065(0.0, 0.03125, 0.0);
            var1.method_36062(0.7F, 0.7F, 0.7F);
            var1.method_36065(0.0, 1.0, 0.0);
         }

         this.method_19347().method_39733().method_7057(var1);
         if (var14 instanceof class_6201 && ((class_6201)var14).method_28392() instanceof class_8550) {
            float var21 = 1.1875F;
            var1.method_36062(1.1875F, -1.1875F, -1.1875F);
            if (var15) {
               var1.method_36065(0.0, 0.0625, 0.0);
            }

            GameProfile var22 = null;
            if (var13.method_28002()) {
               CompoundNBT var18 = var13.method_27990();
               if (!var18.contains("SkullOwner", 10)) {
                  if (var18.contains("SkullOwner", 8)) {
                     String var19 = var18.method_25965("SkullOwner");
                     if (!StringUtils.isBlank(var19)) {
                        var22 = class_4797.method_22108(new GameProfile((UUID)null, var19));
                        var18.put("SkullOwner", class_4338.method_20177(new CompoundNBT(), var22));
                     }
                  }
               } else {
                  var22 = class_4338.method_20184(var18.getCompound("SkullOwner"));
               }
            }

            var1.method_36065(-0.5, 0.0, -0.5);
            class_903.method_3866((Direction)null, 180.0F, ((class_8550)((class_6201)var14).method_28392()).method_39336(), var22, var5, var1, var2, var3);
         } else if (!(var14 instanceof class_8228) || ((class_8228)var14).method_37669() != class_6943.field_35704) {
            float var20 = 0.625F;
            var1.method_36065(0.0, -0.25, 0.0);
            var1.method_36060(class_2426.field_12074.method_11074(180.0F));
            var1.method_36062(0.625F, -0.625F, -0.625F);
            if (var15) {
               var1.method_36065(0.0, 0.1875, 0.0);
            }

            MinecraftClient.getInstance().method_8574().method_42248(var4, var13, class_5612.field_28497, false, var1, var2, var3);
         }

         var1.method_36064();
      }
   }
}
