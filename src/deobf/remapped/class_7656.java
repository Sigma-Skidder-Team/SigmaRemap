package remapped;

import java.util.Random;

public class class_7656 implements class_1517 {
   private static String[] field_38897;
   private int field_38898;

   @Override
   public int method_6937(class_6331 var1, boolean var2, boolean var3) {
      if (!var2) {
         return 0;
      } else if (var1.getGameRules().getBoolean(GameRules.field_1036)) {
         Random var6 = var1.field_33033;
         this.field_38898--;
         if (this.field_38898 > 0) {
            return 0;
         } else {
            this.field_38898 = this.field_38898 + 12000 + var6.nextInt(1200);
            long var7 = var1.method_29584() / 24000L;
            if (var7 < 5L || !var1.method_29602()) {
               return 0;
            } else if (var6.nextInt(5) != 0) {
               return 0;
            } else {
               int var9 = var1.method_25873().size();
               if (var9 < 1) {
                  return 0;
               } else {
                  PlayerEntity var10 = var1.method_25873().get(var6.nextInt(var9));
                  if (var10.method_37221()) {
                     return 0;
                  } else if (var1.method_28981(var10.method_37075(), 2)) {
                     return 0;
                  } else {
                     int var11 = (24 + var6.nextInt(24)) * (!var6.nextBoolean() ? 1 : -1);
                     int var12 = (24 + var6.nextInt(24)) * (!var6.nextBoolean() ? 1 : -1);
                     class_2921 var13 = var10.method_37075().method_6089().method_13367(var11, 0, var12);
                     if (!var1.method_22569(
                        var13.getX() - 10,
                        var13.method_12165() - 10,
                        var13.method_12185() - 10,
                        var13.getX() + 10,
                        var13.method_12165() + 10,
                        var13.method_12185() + 10
                     )) {
                        return 0;
                     } else {
                        class_6325 var14 = var1.method_22561(var13);
                        class_8862 var15 = var14.method_28887();
                        if (var15 == class_8862.field_45296) {
                           return 0;
                        } else {
                           int var16 = 0;
                           int var17 = (int)Math.ceil((double)var1.method_43368(var13).method_44283()) + 1;

                           for (int var18 = 0; var18 < var17; var18++) {
                              var16++;
                              var13.method_12184(var1.method_22563(class_3801.field_18590, var13).method_12165());
                              if (var18 != 0) {
                                 this.method_34656(var1, var13, var6, false);
                              } else if (!this.method_34656(var1, var13, var6, true)) {
                                 break;
                              }

                              var13.method_12167(var13.getX() + var6.nextInt(5) - var6.nextInt(5));
                              var13.method_12172(var13.method_12185() + var6.nextInt(5) - var6.nextInt(5));
                           }

                           return var16;
                        }
                     }
                  }
               }
            }
         }
      } else {
         return 0;
      }
   }

   private boolean method_34656(class_6331 var1, BlockPos var2, Random var3, boolean var4) {
      class_2522 var7 = var1.method_28262(var2);
      if (class_3815.method_17772(var1, var2, var7, var7.method_8364(), EntityType.field_34265)) {
         if (class_4607.method_21355(EntityType.field_34265, var1, class_2417.field_12025, var2, var3)) {
            class_4607 var8 = EntityType.field_34265.method_30484(var1);
            if (var8 == null) {
               return false;
            } else {
               if (var4) {
                  var8.method_21354(true);
                  var8.method_21356();
               }

               var8.method_37256((double)var2.getX(), (double)var2.method_12165(), (double)var2.method_12185());
               var8.method_26864(var1, var1.method_43368(var2), class_2417.field_12025, (class_8733)null, (CompoundNBT)null);
               var1.method_7065(var8);
               return true;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }
}
