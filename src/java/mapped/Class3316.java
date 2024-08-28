package mapped;

import com.google.common.collect.Iterables;
import com.google.common.collect.LinkedHashMultiset;
import com.google.common.collect.Multisets;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public class Class3316 extends Class3314 {
   public Class3316(Class5643 var1) {
      super(var1);
   }

   public static Class8848 method11859(Class1655 var0, int var1, int var2, byte var3, boolean var4, boolean var5) {
      Class8848 var8 = new Class8848(Class8514.field37955);
      method11863(var8, var0, var1, var2, var3, var4, var5, var0.method6813());
      return var8;
   }

   @Nullable
   public static Class7529 method11860(Class8848 var0, Class1655 var1) {
      return var1.method6798(method11864(method11862(var0)));
   }

   @Nullable
   public static Class7529 method11861(Class8848 var0, Class1655 var1) {
      Class7529 var4 = method11860(var0, var1);
      if (var4 == null && var1 instanceof Class1657) {
         var4 = method11863(var0, var1, var1.method6788().method20029(), var1.method6788().method20031(), 3, false, false, var1.method6813());
      }

      return var4;
   }

   public static int method11862(Class8848 var0) {
      Class39 var3 = var0.method32142();
      return var3 != null && var3.method119("map", 99) ? var3.method122("map") : 0;
   }

   private static Class7529 method11863(Class8848 var0, Class1655 var1, int var2, int var3, int var4, boolean var5, boolean var6, Class8705<Class1655> var7) {
      int var10 = var1.method6800();
      Class7529 var11 = new Class7529(method11864(var10));
      var11.method24589(var2, var3, var4, var5, var6, var7);
      var1.method6799(var11);
      var0.method32143().method102("map", var10);
      return var11;
   }

   public static String method11864(int var0) {
      return "map_" + var0;
   }

   public void method11865(Class1655 var1, Entity var2, Class7529 var3) {
      if (var1.method6813() == var3.field32318 && var2 instanceof PlayerEntity) {
         int var6 = 1 << var3.field32321;
         int var7 = var3.field32316;
         int var8 = var3.field32317;
         int var9 = Class9679.method37769(var2.getPosX() - (double)var7) / var6 + 64;
         int var10 = Class9679.method37769(var2.getPosZ() - (double)var8) / var6 + 64;
         int var11 = 128 / var6;
         if (var1.method6812().method36876()) {
            var11 /= 2;
         }

         Class8541 var12 = var3.method24599((PlayerEntity)var2);
         var12.field38397++;
         boolean var13 = false;

         for (int var14 = var9 - var11 + 1; var14 < var9 + var11; var14++) {
            if ((var14 & 15) == (var12.field38397 & 15) || var13) {
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
                     Class1674 var24 = var1.method6722(new BlockPos(var21, 0, var22));
                     if (!var24.method7141()) {
                        Class7481 var25 = var24.method7072();
                        int var26 = var21 & 15;
                        int var27 = var22 & 15;
                        int var28 = 0;
                        double var29 = 0.0;
                        if (!var1.method6812().method36876()) {
                           Mutable var31 = new Mutable();
                           Mutable var32 = new Mutable();

                           for (int var33 = 0; var33 < var6; var33++) {
                              for (int var36 = 0; var36 < var6; var36++) {
                                 int var37 = var24.method7071(Class101.field296, var33 + var26, var36 + var27) + 1;
                                 Class7380 var38;
                                 if (var37 <= 1) {
                                    var38 = Blocks.BEDROCK.method11579();
                                 } else {
                                    do {
                                       var31.method8372(var25.method24356() + var33 + var26, --var37, var25.method24357() + var36 + var27);
                                       var38 = var24.method6738(var31);
                                    } while (var38.method23394(var1, var31) == Class7210.field30947 && var37 > 0);

                                    if (var37 > 0 && !var38.method23449().method23474()) {
                                       int var39 = var37 - 1;
                                       var32.method8374(var31);

                                       Class7380 var40;
                                       do {
                                          var32.method8308(var39--);
                                          var40 = var24.method6738(var32);
                                          var28++;
                                       } while (var39 > 0 && !var40.method23449().method23474());

                                       var38 = this.method11866(var1, var38, var31);
                                    }
                                 }

                                 var3.method24601(var1, var25.method24356() + var33 + var26, var25.method24357() + var36 + var27);
                                 var29 += (double)var37 / (double)(var6 * var6);
                                 var23.add(var38.method23394(var1, var31));
                              }
                           }
                        } else {
                           int var42 = var21 + var22 * 231871;
                           var42 = var42 * var42 * 31287121 + var42 * 11;
                           if ((var42 >> 20 & 1) != 0) {
                              var23.add(Blocks.STONE.method11579().method23394(var1, BlockPos.field13032), 100);
                           } else {
                              var23.add(Blocks.field36396.method11579().method23394(var1, BlockPos.field13032), 10);
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

                        Class7210 var46 = (Class7210)Iterables.getFirst(Multisets.copyHighestCountFirst(var23), Class7210.field30947);
                        if (var46 == Class7210.field30959) {
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
                           byte var47 = var3.field32322[var14 + var17 * 128];
                           byte var48 = (byte)(var46.field31007 * 4 + var44);
                           if (var47 != var48) {
                              var3.field32322[var14 + var17 * 128] = var48;
                              var3.method24598(var14, var17);
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

   private Class7380 method11866(Class1655 var1, Class7380 var2, BlockPos var3) {
      Class7379 var6 = var2.method23449();
      return !var6.method23474() && !var2.method23454(var1, var3, Direction.field673) ? var6.method23484() : var2;
   }

   private static boolean method11867(Class8907[] var0, int var1, int var2, int var3) {
      return var0[var2 * var1 + var3 * var1 * 128 * var1].method32515() >= 0.0F;
   }

   public static void method11868(Class1657 var0, Class8848 var1) {
      Class7529 var4 = method11861(var1, var0);
      if (var4 != null && var0.method6813() == var4.field32318) {
         int var5 = 1 << var4.field32321;
         int var6 = var4.field32316;
         int var7 = var4.field32317;
         Class8907[] var8 = new Class8907[128 * var5 * 128 * var5];

         for (int var9 = 0; var9 < 128 * var5; var9++) {
            for (int var10 = 0; var10 < 128 * var5; var10++) {
               var8[var9 * 128 * var5 + var10] = var0.method7003(new BlockPos((var6 / var5 - 64) * var5 + var10, 0, (var7 / var5 - 64) * var5 + var9));
            }
         }

         for (int var15 = 0; var15 < 128; var15++) {
            for (int var16 = 0; var16 < 128; var16++) {
               if (var15 > 0 && var16 > 0 && var15 < 127 && var16 < 127) {
                  Class8907 var11 = var8[var15 * var5 + var16 * var5 * 128 * var5];
                  int var12 = 8;
                  if (method11867(var8, var5, var15 - 1, var16 - 1)) {
                     var12--;
                  }

                  if (method11867(var8, var5, var15 - 1, var16 + 1)) {
                     var12--;
                  }

                  if (method11867(var8, var5, var15 - 1, var16)) {
                     var12--;
                  }

                  if (method11867(var8, var5, var15 + 1, var16 - 1)) {
                     var12--;
                  }

                  if (method11867(var8, var5, var15 + 1, var16 + 1)) {
                     var12--;
                  }

                  if (method11867(var8, var5, var15 + 1, var16)) {
                     var12--;
                  }

                  if (method11867(var8, var5, var15, var16 - 1)) {
                     var12--;
                  }

                  if (method11867(var8, var5, var15, var16 + 1)) {
                     var12--;
                  }

                  int var13 = 3;
                  Class7210 var14 = Class7210.field30947;
                  if (!(var11.method32515() < 0.0F)) {
                     if (var12 > 0) {
                        var14 = Class7210.field30973;
                        if (var12 <= 3) {
                           var13 = 3;
                        } else {
                           var13 = 1;
                        }
                     }
                  } else {
                     var14 = Class7210.field30962;
                     if (var12 > 7 && var16 % 2 == 0) {
                        var13 = (var15 + (int)(Class9679.method37763((float)var16 + 0.0F) * 7.0F)) / 8 % 5;
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
                        var14 = Class7210.field30947;
                     }
                  }

                  if (var14 != Class7210.field30947) {
                     var4.field32322[var15 + var16 * 128] = (byte)(var14.field31007 * 4 + var13);
                     var4.method24598(var15, var16);
                  }
               }
            }
         }
      }
   }

   @Override
   public void method11724(Class8848 var1, Class1655 var2, Entity var3, int var4, boolean var5) {
      if (!var2.field9020) {
         Class7529 var8 = method11861(var1, var2);
         if (var8 != null) {
            if (var3 instanceof PlayerEntity) {
               PlayerEntity var9 = (PlayerEntity)var3;
               var8.method24594(var9, var1);
            }

            if (!var8.field32323 && (var5 || var3 instanceof PlayerEntity && ((PlayerEntity)var3).method3091() == var1)) {
               this.method11865(var2, var3, var8);
            }
         }
      }
   }

   @Nullable
   @Override
   public Packet<?> method11858(Class8848 var1, Class1655 var2, PlayerEntity var3) {
      return method11861(var1, var2).method24597(var1, var2, var3);
   }

   @Override
   public void method11725(Class8848 var1, Class1655 var2, PlayerEntity var3) {
      Class39 var6 = var1.method32142();
      if (var6 != null && var6.method119("map_scale_direction", 99)) {
         method11869(var1, var2, var6.method122("map_scale_direction"));
         var6.method133("map_scale_direction");
      } else if (var6 != null && var6.method119("map_to_lock", 1) && var6.method132("map_to_lock")) {
         method11870(var2, var1);
         var6.method133("map_to_lock");
      }
   }

   public static void method11869(Class8848 var0, Class1655 var1, int var2) {
      Class7529 var5 = method11861(var0, var1);
      if (var5 != null) {
         method11863(
            var0,
            var1,
            var5.field32316,
            var5.field32317,
            Class9679.method37775(var5.field32321 + var2, 0, 4),
            var5.field32319,
            var5.field32320,
            var5.field32318
         );
      }
   }

   public static void method11870(Class1655 var0, Class8848 var1) {
      Class7529 var4 = method11861(var1, var0);
      if (var4 != null) {
         Class7529 var5 = method11863(var1, var0, 0, 0, var4.field32321, var4.field32319, var4.field32320, var4.field32318);
         var5.method24593(var4);
      }
   }

   @Override
   public void method11730(Class8848 var1, Class1655 var2, List<ITextComponent> var3, Class2216 var4) {
      Class7529 var7 = var2 != null ? method11861(var1, var2) : null;
      if (var7 != null && var7.field32323) {
         var3.add(new TranslationTextComponent("filled_map.locked", method11862(var1)).mergeStyle(TextFormatting.GRAY));
      }

      if (var4.method8944()) {
         if (var7 == null) {
            var3.add(new TranslationTextComponent("filled_map.unknown").mergeStyle(TextFormatting.GRAY));
         } else {
            var3.add(new TranslationTextComponent("filled_map.id", method11862(var1)).mergeStyle(TextFormatting.GRAY));
            var3.add(new TranslationTextComponent("filled_map.scale", 1 << var7.field32321).mergeStyle(TextFormatting.GRAY));
            var3.add(new TranslationTextComponent("filled_map.level", var7.field32321, 4).mergeStyle(TextFormatting.GRAY));
         }
      }
   }

   public static int method11871(Class8848 var0) {
      Class39 var3 = var0.method32145("display");
      if (var3 != null && var3.method119("MapColor", 99)) {
         int var4 = var3.method122("MapColor");
         return 0xFF000000 | var4 & 16777215;
      } else {
         return -12173266;
      }
   }

   @Override
   public Class2274 method11707(Class5911 var1) {
      Class7380 var4 = var1.method18360().method6738(var1.method18345());
      if (!var4.method23446(Class7645.field32760)) {
         return super.method11707(var1);
      } else {
         if (!var1.method18360().field9020) {
            Class7529 var5 = method11861(var1.method18357(), var1.method18360());
            var5.method24600(var1.method18360(), var1.method18345());
         }

         return Class2274.method9002(var1.method18360().field9020);
      }
   }
}
