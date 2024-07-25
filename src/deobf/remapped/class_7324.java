package remapped;

import java.util.Random;

public class class_7324 implements class_1517 {
   private static String[] field_37436;
   private int field_37437;

   @Override
   public int method_6937(class_6331 var1, boolean var2, boolean var3) {
      if (!var2) {
         return 0;
      } else if (!var1.getGameRules().getBoolean(GameRules.field_1052)) {
         return 0;
      } else {
         Random var6 = var1.field_33033;
         this.field_37437--;
         if (this.field_37437 > 0) {
            return 0;
         } else {
            this.field_37437 = this.field_37437 + (60 + var6.nextInt(60)) * 20;
            if (var1.method_22557() < 5 && var1.method_22572().method_40229()) {
               return 0;
            } else {
               int var7 = 0;

               for (PlayerEntity var9 : var1.method_25873()) {
                  if (!var9.method_37221()) {
                     BlockPos var10 = var9.method_37075();
                     if (!var1.method_22572().method_40229() || var10.method_12165() >= var1.method_22552() && var1.method_25263(var10)) {
                        class_9589 var11 = var1.method_43368(var10);
                        if (var11.method_44286(var6.nextFloat() * 3.0F)) {
                           class_7909 var12 = ((class_9359)var9).method_43271();
                           int var13 = MathHelper.clamp(
                              var12.method_19276(class_6234.field_31829.method_43790(class_6234.field_31894)), 1, Integer.MAX_VALUE
                           );
                           short var14 = 24000;
                           if (var6.nextInt(var13) >= 72000) {
                              BlockPos var15 = var10.method_6082(20 + var6.nextInt(15))
                                 .method_6091(-10 + var6.nextInt(21))
                                 .method_6074(-10 + var6.nextInt(21));
                              class_2522 var16 = var1.method_28262(var15);
                              class_4774 var17 = var1.method_28258(var15);
                              if (class_3815.method_17772(var1, var15, var16, var17, EntityType.field_34246)) {
                                 class_8733 var18 = null;
                                 int var19 = 1 + var6.nextInt(var11.method_44287().method_2097() + 1);

                                 for (int var20 = 0; var20 < var19; var20++) {
                                    class_9825 var21 = EntityType.field_34246.method_30484(var1);
                                    var21.method_37253(var15, 0.0F, 0.0F);
                                    var18 = var21.method_26864(var1, var11, class_2417.field_12031, var18, (CompoundNBT)null);
                                    var1.method_7065(var21);
                                 }

                                 var7 += var19;
                              }
                           }
                        }
                     }
                  }
               }

               return var7;
            }
         }
      }
   }
}
