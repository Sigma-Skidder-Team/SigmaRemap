package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_3820 extends class_4285<class_1941> {
   private static final Logger field_18684 = LogManager.getLogger();
   private static final EntityType<?>[] field_18683 = new EntityType[]{
      EntityType.field_34241, EntityType.field_34297, EntityType.field_34297, EntityType.field_34223
   };
   private static final class_2522 field_18685 = class_4783.field_23765.method_29260();

   public class_3820(Codec<class_1941> var1) {
      super(var1);
   }

   public boolean method_17795(class_700 var1, class_6541 var2, Random var3, BlockPos var4, class_1941 var5) {
      byte var8 = 3;
      int var9 = var3.nextInt(2) + 2;
      int var10 = -var9 - 1;
      int var11 = var9 + 1;
      byte var12 = -1;
      byte var13 = 4;
      int var14 = var3.nextInt(2) + 2;
      int var15 = -var14 - 1;
      int var16 = var14 + 1;
      int var17 = 0;

      for (int var18 = var10; var18 <= var11; var18++) {
         for (int var19 = -1; var19 <= 4; var19++) {
            for (int var20 = var15; var20 <= var16; var20++) {
               BlockPos var21 = var4.method_6104(var18, var19, var20);
               class_5371 var22 = var1.method_28262(var21).method_8362();
               boolean var23 = var22.method_24499();
               if (var19 == -1 && !var23) {
                  return false;
               }

               if (var19 == 4 && !var23) {
                  return false;
               }

               if ((var18 == var10 || var18 == var11 || var20 == var15 || var20 == var16)
                  && var19 == 0
                  && var1.method_22548(var21)
                  && var1.method_22548(var21.method_6081())) {
                  var17++;
               }
            }
         }
      }

      if (var17 >= 1 && var17 <= 5) {
         for (int var27 = var10; var27 <= var11; var27++) {
            for (int var30 = 3; var30 >= -1; var30--) {
               for (int var32 = var15; var32 <= var16; var32++) {
                  BlockPos var34 = var4.method_6104(var27, var30, var32);
                  class_2522 var36 = var1.method_28262(var34);
                  if (var27 != var10 && var30 != -1 && var32 != var15 && var27 != var11 && var30 != 4 && var32 != var16) {
                     if (!var36.method_8350(class_4783.field_23471) && !var36.method_8350(class_4783.field_23617)) {
                        var1.method_7513(var34, field_18685, 2);
                     }
                  } else if (var34.getY() >= 0 && !var1.method_28262(var34.method_6100()).method_8362().method_24499()) {
                     var1.method_7513(var34, field_18685, 2);
                  } else if (var36.method_8362().method_24499() && !var36.method_8350(class_4783.field_23471)) {
                     if (var30 == -1 && var3.nextInt(4) != 0) {
                        var1.method_7513(var34, class_4783.field_23774.method_29260(), 2);
                     } else {
                        var1.method_7513(var34, class_4783.field_23808.method_29260(), 2);
                     }
                  }
               }
            }
         }

         for (int var28 = 0; var28 < 2; var28++) {
            for (int var31 = 0; var31 < 3; var31++) {
               int var33 = var4.getX() + var3.nextInt(var9 * 2 + 1) - var9;
               int var35 = var4.getY();
               int var37 = var4.getZ() + var3.nextInt(var14 * 2 + 1) - var14;
               BlockPos var38 = new BlockPos(var33, var35, var37);
               if (var1.method_22548(var38)) {
                  int var24 = 0;

                  for (Direction var26 : class_9594.field_48893) {
                     if (var1.method_28262(var38.method_6098(var26)).method_8362().method_24499()) {
                        var24++;
                     }
                  }

                  if (var24 == 1) {
                     var1.method_7513(var38, class_7060.method_32509(var1, var38, class_4783.field_23471.method_29260()), 2);
                     class_2358.method_10817(var1, var3, var38, class_5931.field_30150);
                     break;
                  }
               }
            }
         }

         var1.method_7513(var4, class_4783.field_23617.method_29260(), 2);
         class_3757 var29 = var1.method_28260(var4);
         if (!(var29 instanceof class_1896)) {
            field_18684.error("Failed to fetch mob spawner entity at ({}, {}, {})", var4.getX(), var4.getY(), var4.getZ());
         } else {
            ((class_1896)var29).method_8621().method_16253(this.method_17796(var3));
         }

         return true;
      } else {
         return false;
      }
   }

   private EntityType<?> method_17796(Random var1) {
      return Util.<EntityType<?>>method_44697(field_18683, var1);
   }
}
