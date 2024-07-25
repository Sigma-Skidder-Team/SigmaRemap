package remapped;

import java.util.List;
import java.util.Random;

public class class_8270 implements class_1517 {
   private static String[] field_42423;
   private int field_42422;

   @Override
   public int method_6937(class_6331 var1, boolean var2, boolean var3) {
      if (var3 && var1.getGameRules().getBoolean(GameRules.field_1028)) {
         this.field_42422--;
         if (this.field_42422 <= 0) {
            this.field_42422 = 1200;
            class_9359 var6 = var1.method_28948();
            if (var6 != null) {
               Random var7 = var1.field_33033;
               int var8 = (8 + var7.nextInt(24)) * (!var7.nextBoolean() ? 1 : -1);
               int var9 = (8 + var7.nextInt(24)) * (!var7.nextBoolean() ? 1 : -1);
               BlockPos var10 = var6.method_37075().method_6104(var8, 0, var9);
               if (var1.method_22569(
                  var10.getX() - 10,
                  var10.getY() - 10,
                  var10.getZ() - 10,
                  var10.getX() + 10,
                  var10.getY() + 10,
                  var10.getZ() + 10
               )) {
                  if (class_3815.method_17767(class_1257.field_6935, var1, var10, EntityType.field_34249)) {
                     if (var1.method_28981(var10, 2)) {
                        return this.method_38122(var1, var10);
                     }

                     if (var1.method_28991().method_9525(var10, true, class_5390.field_27515).method_14731()) {
                        return this.method_38125(var1, var10);
                     }
                  }

                  return 0;
               } else {
                  return 0;
               }
            } else {
               return 0;
            }
         } else {
            return 0;
         }
      } else {
         return 0;
      }
   }

   private int method_38122(class_6331 var1, BlockPos var2) {
      byte var5 = 48;
      if (var1.method_28969().method_6866(class_236.field_778.method_1007(), var2, 48, class_8122.field_41618) > 4L) {
         List var6 = var1.<class_5583>method_25868(class_5583.class, new Box(var2).method_18899(48.0, 8.0, 48.0));
         if (var6.size() < 5) {
            return this.method_38124(var2, var1);
         }
      }

      return 0;
   }

   private int method_38125(class_6331 var1, BlockPos var2) {
      byte var5 = 16;
      List var6 = var1.<class_5583>method_25868(class_5583.class, new Box(var2).method_18899(16.0, 8.0, 16.0));
      return var6.size() >= 1 ? 0 : this.method_38124(var2, var1);
   }

   private int method_38124(BlockPos var1, class_6331 var2) {
      class_5583 var5 = EntityType.field_34249.method_30484(var2);
      if (var5 != null) {
         var5.method_26864(var2, var2.method_43368(var1), class_2417.field_12031, (class_8733)null, (CompoundNBT)null);
         var5.method_37253(var1, 0.0F, 0.0F);
         var2.method_7065(var5);
         return 1;
      } else {
         return 0;
      }
   }
}
