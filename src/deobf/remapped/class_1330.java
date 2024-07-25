package remapped;

import java.util.Random;
import net.minecraft.util.text.ITextComponent;

public class class_1330 extends class_2451 {
   private static String[] field_7301;

   public class_1330(class_317 var1) {
      super(var1);
   }

   @Override
   public class_6910 method_11237(class_4734 var1) {
      Direction var4 = var1.method_21857();
      if (var4 != Direction.field_802) {
         World var5 = var1.method_21862();
         class_353 var6 = new class_353(var1);
         BlockPos var7 = var6.method_21858();
         ItemStack var8 = var1.method_21867();
         class_1343 var9 = class_1343.method_6200(var7);
         Box var10 = EntityType.field_34289.method_30473().method_27940(var9.method_61(), var9.method_60(), var9.method_62());
         if (var5.method_6672((Entity)null, var10, var0 -> true) && var5.method_25870((Entity)null, var10).isEmpty()) {
            if (var5 instanceof class_6331) {
               class_6331 var11 = (class_6331)var5;
               class_9399 var12 = EntityType.field_34289
                  .method_30483(var11, var8.method_27990(), (ITextComponent)null, var1.method_21868(), var7, class_2417.field_12030, true, true);
               if (var12 == null) {
                  return class_6910.field_35517;
               }

               var11.method_7065(var12);
               float var13 = (float)class_9299.method_42848((class_9299.method_42810(var1.method_21861() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               var12.method_37144(var12.getPosX(), var12.method_37309(), var12.getPosZ(), var13, 0.0F);
               this.method_6059(var12, var5.field_33033);
               var5.method_7509(var12);
               var5.method_29528(
                  (class_704)null, var12.getPosX(), var12.method_37309(), var12.getPosZ(), class_463.field_2444, class_562.field_3322, 0.75F, 0.8F
               );
            }

            var8.method_27970(1);
            return class_6910.method_31659(var5.field_33055);
         } else {
            return class_6910.field_35517;
         }
      } else {
         return class_6910.field_35517;
      }
   }

   private void method_6059(class_9399 var1, Random var2) {
      class_1366 var5 = var1.method_43488();
      float var6 = var2.nextFloat() * 5.0F;
      float var7 = var2.nextFloat() * 20.0F - 10.0F;
      class_1366 var8 = new class_1366(var5.method_6280() + var6, var5.method_6284() + var7, var5.method_6281());
      var1.method_43509(var8);
      var5 = var1.method_43517();
      var6 = var2.nextFloat() * 10.0F - 5.0F;
      var8 = new class_1366(var5.method_6280(), var5.method_6284() + var6, var5.method_6281());
      var1.method_43489(var8);
   }
}
