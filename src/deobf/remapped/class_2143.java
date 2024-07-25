package remapped;

import com.google.common.collect.Iterables;
import com.google.common.collect.LinkedHashMultiset;
import com.google.common.collect.Multisets;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public class class_2143 extends class_6249 {
   public class_2143(class_317 var1) {
      super(var1);
   }

   public static ItemStack method_10014(World var0, int var1, int var2, byte var3, boolean var4, boolean var5) {
      ItemStack var8 = new ItemStack(class_4897.field_25262);
      method_10011(var8, var0, var1, var2, var3, var4, var5, var0.method_29545());
      return var8;
   }

   @Nullable
   public static class_2134 method_10012(ItemStack var0, World var1) {
      return var1.method_29533(method_10015(method_10009(var0)));
   }

   @Nullable
   public static class_2134 method_10005(ItemStack var0, World var1) {
      class_2134 var4 = method_10012(var0, var1);
      if (var4 == null && var1 instanceof class_6331) {
         var4 = method_10011(var0, var1, var1.method_43366().method_8654(), var1.method_43366().method_8655(), 3, false, false, var1.method_29545());
      }

      return var4;
   }

   public static int method_10009(ItemStack var0) {
      CompoundNBT var3 = var0.method_27990();
      return var3 != null && var3.contains("map", 99) ? var3.method_25947("map") : 0;
   }

   private static class_2134 method_10011(
           ItemStack var0, World var1, int var2, int var3, int var4, boolean var5, boolean var6, class_5621<World> var7
   ) {
      int var10 = var1.method_29564();
      class_2134 var11 = new class_2134(method_10015(var10));
      var11.method_9965(var2, var3, var4, var5, var6, var7);
      var1.method_29524(var11);
      var0.method_27994().putInt("map", var10);
      return var11;
   }

   public static String method_10015(int var0) {
      return "map_" + var0;
   }

   public void method_10016(World var1, Entity var2, class_2134 var3) {
      if (var1.method_29545() == var3.field_10685 && var2 instanceof PlayerEntity) {
         int var6 = 1 << var3.field_10678;
         int var7 = var3.field_10689;
         int var8 = var3.field_10677;
         int var9 = class_9299.method_42847(var2.getPosX() - (double)var7) / var6 + 64;
         int var10 = class_9299.method_42847(var2.getPosZ() - (double)var8) / var6 + 64;
         int var11 = 128 / var6;
         if (var1.method_22572().method_40244()) {
            var11 /= 2;
         }

         class_4986 var12 = var3.method_9968((PlayerEntity)var2);
         var12.field_25819++;
         boolean var13 = false;

         for (int var14 = var9 - var11 + 1; var14 < var9 + var11; var14++) {
            if ((var14 & 15) == (var12.field_25819 & 15) || var13) {
               var13 = false;
               double var15 = 0.0;

               for (int var17 = var10 - var11 - 1; var17 < var10 + var11; var17++) {
                  if (var14 >= 0 && var17 >= -1 && var14 < 128 && var17 < 128) {
                     int var18 = var14 - var9;
                     int var19 = var17 - var10;
                     boolean var20 = var18 * var18 + var19 * var19 > (var11 - 2) * (var11 - 2);
                     int var21 = (var7 / var6 + var14 - 64) * var6;
                     int var22 = (var8 / var6 + var17 - 64) * var6;
                     LinkedHashMultiset var23 = LinkedHashMultiset.create();
                     class_2654 var24 = var1.method_29542(new BlockPos(var21, 0, var22));
                     if (!var24.method_12003()) {
                        class_2034 var25 = var24.method_27352();
                        int var26 = var21 & 15;
                        int var27 = var22 & 15;
                        int var28 = 0;
                        double var29 = 0.0;
                        if (!var1.method_22572().method_40244()) {
                           class_2921 var31 = new class_2921();
                           class_2921 var32 = new class_2921();

                           for (int var33 = 0; var33 < var6; var33++) {
                              for (int var36 = 0; var36 < var6; var36++) {
                                 int var37 = var24.method_27367(class_3801.field_18592, var33 + var26, var36 + var27) + 1;
                                 class_2522 var38;
                                 if (var37 <= 1) {
                                    var38 = class_4783.field_23433.method_29260();
                                 } else {
                                    do {
                                       var31.method_13362(var25.method_9535() + var33 + var26, --var37, var25.method_9545() + var36 + var27);
                                       var38 = var24.method_28262(var31);
                                    } while (var38.method_8323(var1, var31) == class_1513.field_8018 && var37 > 0);

                                    if (var37 > 0 && !var38.method_8364().method_22001()) {
                                       int var39 = var37 - 1;
                                       var32.method_13364(var31);

                                       class_2522 var40;
                                       do {
                                          var32.method_12184(var39--);
                                          var40 = var24.method_28262(var32);
                                          var28++;
                                       } while (var39 > 0 && !var40.method_8364().method_22001());

                                       var38 = this.method_10010(var1, var38, var31);
                                    }
                                 }

                                 var3.method_9975(var1, var25.method_9535() + var33 + var26, var25.method_9545() + var36 + var27);
                                 var29 += (double)var37 / (double)(var6 * var6);
                                 var23.add(var38.method_8323(var1, var31));
                              }
                           }
                        } else {
                           int var42 = var21 + var22 * 231871;
                           var42 = var42 * var42 * 31287121 + var42 * 11;
                           if ((var42 >> 20 & 1) != 0) {
                              var23.add(class_4783.field_23644.method_29260().method_8323(var1, BlockPos.field_7306), 100);
                           } else {
                              var23.add(class_4783.field_23592.method_29260().method_8323(var1, BlockPos.field_7306), 10);
                           }

                           var29 = 100.0;
                        }

                        var28 /= var6 * var6;
                        double var34 = (var29 - var15) * 4.0 / (double)(var6 + 4) + ((double)(var14 + var17 & 1) - 0.5) * 0.4;
                        byte var44 = 1;
                        if (var34 > 0.6) {
                           var44 = 2;
                        }

                        if (var34 < -0.6) {
                           var44 = 0;
                        }

                        class_1513 var46 = (class_1513)Iterables.getFirst(Multisets.copyHighestCountFirst(var23), class_1513.field_8018);
                        if (var46 == class_1513.field_8028) {
                           var34 = (double)var28 * 0.1 + (double)(var14 + var17 & 1) * 0.2;
                           var44 = 1;
                           if (var34 < 0.5) {
                              var44 = 2;
                           }

                           if (var34 > 0.9) {
                              var44 = 0;
                           }
                        }

                        var15 = var29;
                        if (var17 >= 0 && var18 * var18 + var19 * var19 < var11 * var11 && (!var20 || (var14 + var17 & 1) != 0)) {
                           byte var47 = var3.field_10691[var14 + var17 * 128];
                           byte var48 = (byte)(var46.field_8027 * 4 + var44);
                           if (var47 != var48) {
                              var3.field_10691[var14 + var17 * 128] = var48;
                              var3.method_9966(var14, var17);
                              var13 = true;
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private class_2522 method_10010(World var1, class_2522 var2, BlockPos var3) {
      class_4774 var6 = var2.method_8364();
      return !var6.method_22001() && !var2.method_8308(var1, var3, Direction.field_817) ? var6.method_22006() : var2;
   }

   private static boolean method_10007(class_6325[] var0, int var1, int var2, int var3) {
      return var0[var2 * var1 + var3 * var1 * 128 * var1].method_28868() >= 0.0F;
   }

   public static void method_10013(class_6331 var0, ItemStack var1) {
      class_2134 var4 = method_10005(var1, var0);
      if (var4 != null && var0.method_29545() == var4.field_10685) {
         int var5 = 1 << var4.field_10678;
         int var6 = var4.field_10689;
         int var7 = var4.field_10677;
         class_6325[] var8 = new class_6325[128 * var5 * 128 * var5];

         for (int var9 = 0; var9 < 128 * var5; var9++) {
            for (int var10 = 0; var10 < 128 * var5; var10++) {
               var8[var9 * 128 * var5 + var10] = var0.method_22561(new BlockPos((var6 / var5 - 64) * var5 + var10, 0, (var7 / var5 - 64) * var5 + var9));
            }
         }

         for (int var15 = 0; var15 < 128; var15++) {
            for (int var16 = 0; var16 < 128; var16++) {
               if (var15 > 0 && var16 > 0 && var15 < 127 && var16 < 127) {
                  class_6325 var11 = var8[var15 * var5 + var16 * var5 * 128 * var5];
                  int var12 = 8;
                  if (method_10007(var8, var5, var15 - 1, var16 - 1)) {
                     var12--;
                  }

                  if (method_10007(var8, var5, var15 - 1, var16 + 1)) {
                     var12--;
                  }

                  if (method_10007(var8, var5, var15 - 1, var16)) {
                     var12--;
                  }

                  if (method_10007(var8, var5, var15 + 1, var16 - 1)) {
                     var12--;
                  }

                  if (method_10007(var8, var5, var15 + 1, var16 + 1)) {
                     var12--;
                  }

                  if (method_10007(var8, var5, var15 + 1, var16)) {
                     var12--;
                  }

                  if (method_10007(var8, var5, var15, var16 - 1)) {
                     var12--;
                  }

                  if (method_10007(var8, var5, var15, var16 + 1)) {
                     var12--;
                  }

                  int var13 = 3;
                  class_1513 var14 = class_1513.field_8018;
                  if (!(var11.method_28868() < 0.0F)) {
                     if (var12 > 0) {
                        var14 = class_1513.field_8070;
                        if (var12 <= 3) {
                           var13 = 3;
                        } else {
                           var13 = 1;
                        }
                     }
                  } else {
                     var14 = class_1513.field_8051;
                     if (var12 > 7 && var16 % 2 == 0) {
                        var13 = (var15 + (int)(class_9299.method_42818((float)var16 + 0.0F) * 7.0F)) / 8 % 5;
                        if (var13 != 3) {
                           if (var13 == 4) {
                              var13 = 0;
                           }
                        } else {
                           var13 = 1;
                        }
                     } else if (var12 <= 7) {
                        if (var12 <= 5) {
                           if (var12 <= 3) {
                              if (var12 > 1) {
                                 var13 = 0;
                              }
                           } else {
                              var13 = 0;
                           }
                        } else {
                           var13 = 1;
                        }
                     } else {
                        var14 = class_1513.field_8018;
                     }
                  }

                  if (var14 != class_1513.field_8018) {
                     var4.field_10691[var15 + var16 * 128] = (byte)(var14.field_8027 * 4 + var13);
                     var4.method_9966(var15, var16);
                  }
               }
            }
         }
      }
   }

   @Override
   public void method_11214(ItemStack var1, World var2, Entity var3, int var4, boolean var5) {
      if (!var2.field_33055) {
         class_2134 var8 = method_10005(var1, var2);
         if (var8 != null) {
            if (var3 instanceof PlayerEntity) {
               PlayerEntity var9 = (PlayerEntity)var3;
               var8.method_9970(var9, var1);
            }

            if (!var8.field_10686 && (var5 || var3 instanceof PlayerEntity && ((PlayerEntity)var3).method_26568() == var1)) {
               this.method_10016(var2, var3, var8);
            }
         }
      }
   }

   @Nullable
   @Override
   public Packet<?> method_28525(ItemStack var1, World var2, PlayerEntity var3) {
      return method_10005(var1, var2).method_9973(var1, var2, var3);
   }

   @Override
   public void method_11236(ItemStack var1, World var2, PlayerEntity var3) {
      CompoundNBT var6 = var1.method_27990();
      if (var6 != null && var6.contains("map_scale_direction", 99)) {
         method_10008(var1, var2, var6.method_25947("map_scale_direction"));
         var6.method_25959("map_scale_direction");
      } else if (var6 != null && var6.contains("map_to_lock", 1) && var6.getBoolean("map_to_lock")) {
         method_10006(var2, var1);
         var6.method_25959("map_to_lock");
      }
   }

   public static void method_10008(ItemStack var0, World var1, int var2) {
      class_2134 var5 = method_10005(var0, var1);
      if (var5 != null) {
         method_10011(
            var0,
            var1,
            var5.field_10689,
            var5.field_10677,
            class_9299.method_42829(var5.field_10678 + var2, 0, 4),
            var5.field_10681,
            var5.field_10688,
            var5.field_10685
         );
      }
   }

   public static void method_10006(World var0, ItemStack var1) {
      class_2134 var4 = method_10005(var1, var0);
      if (var4 != null) {
         class_2134 var5 = method_10011(var1, var0, 0, 0, var4.field_10678, var4.field_10681, var4.field_10688, var4.field_10685);
         var5.method_9974(var4);
      }
   }

   @Override
   public void method_11218(ItemStack var1, World var2, List<ITextComponent> var3, class_4605 var4) {
      class_2134 var7 = var2 != null ? method_10005(var1, var2) : null;
      if (var7 != null && var7.field_10686) {
         var3.add(new TranslationTextComponent("filled_map.locked", method_10009(var1)).mergeStyle(TextFormatting.GRAY));
      }

      if (var4.method_21347()) {
         if (var7 == null) {
            var3.add(new TranslationTextComponent("filled_map.unknown").mergeStyle(TextFormatting.GRAY));
         } else {
            var3.add(new TranslationTextComponent("filled_map.id", method_10009(var1)).mergeStyle(TextFormatting.GRAY));
            var3.add(new TranslationTextComponent("filled_map.scale", 1 << var7.field_10678).mergeStyle(TextFormatting.GRAY));
            var3.add(new TranslationTextComponent("filled_map.level", var7.field_10678, 4).mergeStyle(TextFormatting.GRAY));
         }
      }
   }

   public static int method_10017(ItemStack var0) {
      CompoundNBT var3 = var0.method_28021("display");
      if (var3 != null && var3.contains("MapColor", 99)) {
         int var4 = var3.method_25947("MapColor");
         return 0xFF000000 | var4 & 16777215;
      } else {
         return -12173266;
      }
   }

   @Override
   public class_6910 method_11237(class_4734 var1) {
      class_2522 var4 = var1.method_21862().method_28262(var1.method_21858());
      if (!var4.method_8349(class_2351.field_11767)) {
         return super.method_11237(var1);
      } else {
         if (!var1.method_21862().field_33055) {
            class_2134 var5 = method_10005(var1.method_21867(), var1.method_21862());
            var5.method_9971(var1.method_21862(), var1.method_21858());
         }

         return class_6910.method_31659(var1.method_21862().field_33055);
      }
   }
}
