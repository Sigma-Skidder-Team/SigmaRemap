package remapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;

public abstract class class_4088 {
   private final class_2831<ItemStack> field_19932 = class_2831.<ItemStack>method_12874();
   public final List<class_7934> field_19926 = Lists.newArrayList();
   private final List<class_9332> field_19931 = Lists.newArrayList();
   private final class_4165<?> field_19933;
   public final int field_19925;
   private short field_19924;
   private int field_19929 = -1;
   private int field_19927;
   private final Set<class_7934> field_19934 = Sets.newHashSet();
   private final List<class_117> field_19928 = Lists.newArrayList();
   private final Set<PlayerEntity> field_19930 = Sets.newHashSet();

   public class_4088(class_4165<?> var1, int var2) {
      this.field_19933 = var1;
      this.field_19925 = var2;
   }

   public static boolean method_18872(class_9210 var0, PlayerEntity var1, class_6414 var2) {
      return var0.<Boolean>method_42532(
         (var2x, var3) -> var2x.method_28262(var3).method_8350(var2)
               ? var1.method_37273((double)var3.getX() + 0.5, (double)var3.method_12165() + 0.5, (double)var3.method_12185() + 0.5) <= 64.0
               : false,
         true
      );
   }

   public class_4165<?> method_18891() {
      if (this.field_19933 != null) {
         return this.field_19933;
      } else {
         throw new UnsupportedOperationException("Unable to construct this menu by type");
      }
   }

   public static void method_18858(class_6867 var0, int var1) {
      int var4 = var0.method_31505();
      if (var4 < var1) {
         throw new IllegalArgumentException("Container size " + var4 + " is smaller than expected " + var1);
      }
   }

   public static void method_18867(class_6844 var0, int var1) {
      int var4 = var0.method_31410();
      if (var4 < var1) {
         throw new IllegalArgumentException("Container data count " + var4 + " is smaller than expected " + var1);
      }
   }

   public class_7934 method_18885(class_7934 var1) {
      var1.field_40588 = this.field_19926.size();
      this.field_19926.add(var1);
      this.field_19932.add(ItemStack.EMPTY);
      return var1;
   }

   public class_9332 method_18889(class_9332 var1) {
      this.field_19931.add(var1);
      return var1;
   }

   public void method_18859(class_6844 var1) {
      for (int var4 = 0; var4 < var1.method_31410(); var4++) {
         this.method_18889(class_9332.method_43083(var1, var4));
      }
   }

   public void method_18888(class_117 var1) {
      if (!this.field_19928.contains(var1)) {
         this.field_19928.add(var1);
         var1.method_347(this, this.method_18868());
         this.method_18877();
      }
   }

   public void method_18880(class_117 var1) {
      this.field_19928.remove(var1);
   }

   public class_2831<ItemStack> method_18868() {
      class_2831 var3 = class_2831.method_12874();

      for (int var4 = 0; var4 < this.field_19926.size(); var4++) {
         var3.add(this.field_19926.get(var4).method_35898());
      }

      return var3;
   }

   public void method_18877() {
      for (int var3 = 0; var3 < this.field_19926.size(); var3++) {
         ItemStack var4 = this.field_19926.get(var3).method_35898();
         ItemStack var5 = this.field_19932.get(var3);
         if (!ItemStack.method_27982(var5, var4)) {
            ItemStack var6 = var4.method_27973();
            this.field_19932.set(var3, var6);

            for (class_117 var8 : this.field_19928) {
               var8.method_348(this, var3, var6);
            }
         }
      }

      for (int var9 = 0; var9 < this.field_19931.size(); var9++) {
         class_9332 var10 = this.field_19931.get(var9);
         if (var10.method_43088()) {
            for (class_117 var12 : this.field_19928) {
               var12.method_346(this, var9, var10.method_43085());
            }
         }
      }
   }

   public boolean method_18886(PlayerEntity var1, int var2) {
      return false;
   }

   public class_7934 method_18878(int var1) {
      return this.field_19926.get(var1);
   }

   public ItemStack method_18874(PlayerEntity var1, int var2) {
      class_7934 var5 = this.field_19926.get(var2);
      return var5 == null ? ItemStack.EMPTY : var5.method_35898();
   }

   public ItemStack method_18865(int var1, int var2, class_6269 var3, PlayerEntity var4) {
      try {
         return this.method_18862(var1, var2, var3, var4);
      } catch (Exception var10) {
         class_159 var8 = class_159.method_643(var10, "Container click");
         class_6544 var9 = var8.method_639("Click info");
         var9.method_29851("Menu Type", () -> this.field_19933 == null ? "<no type>" : class_8669.field_44402.method_39797(this.field_19933).toString());
         var9.method_29851("Menu Class", () -> this.getClass().getCanonicalName());
         var9.method_29850("Slot Count", this.field_19926.size());
         var9.method_29850("Slot", var1);
         var9.method_29850("Button", var2);
         var9.method_29850("Type", var3);
         throw new class_3297(var8);
      }
   }

   private ItemStack method_18862(int var1, int var2, class_6269 var3, PlayerEntity var4) {
      ItemStack var7 = ItemStack.EMPTY;
      class_7051 var8 = var4.inventory;
      if (var3 != class_6269.field_32022) {
         if (this.field_19927 != 0) {
            this.method_18866();
         } else if ((var3 == class_6269.field_32027 || var3 == class_6269.field_32019) && (var2 == 0 || var2 == 1)) {
            if (var1 != -999) {
               if (var3 != class_6269.field_32019) {
                  if (var1 < 0) {
                     return ItemStack.EMPTY;
                  }

                  class_7934 var24 = this.field_19926.get(var1);
                  if (var24 != null) {
                     ItemStack var31 = var24.method_35898();
                     ItemStack var36 = var8.method_32424();
                     if (!var31.method_28022()) {
                        var7 = var31.method_27973();
                     }

                     if (!var31.method_28022()) {
                        if (var24.method_35895(var4)) {
                           if (!var36.method_28022()) {
                              if (!var24.method_35889(var36)) {
                                 if (var36.method_28016() > 1 && method_18855(var31, var36) && !var31.method_28022()) {
                                    int var40 = var31.method_27997();
                                    if (var40 + var36.method_27997() <= var36.method_28016()) {
                                       var36.method_28030(var40);
                                       var31 = var24.method_35899(var40);
                                       if (var31.method_28022()) {
                                          var24.method_35896(ItemStack.EMPTY);
                                       }

                                       var24.method_35892(var4, var8.method_32424());
                                    }
                                 }
                              } else if (!method_18855(var31, var36)) {
                                 if (var36.method_27997() <= var24.method_35890(var36)) {
                                    var24.method_35896(var36);
                                    var8.method_32408(var31);
                                 }
                              } else {
                                 int var41 = var2 != 0 ? 1 : var36.method_27997();
                                 if (var41 > var24.method_35890(var36) - var31.method_27997()) {
                                    var41 = var24.method_35890(var36) - var31.method_27997();
                                 }

                                 if (var41 > var36.method_28016() - var31.method_27997()) {
                                    var41 = var36.method_28016() - var31.method_27997();
                                 }

                                 var36.method_27970(var41);
                                 var31.method_28030(var41);
                              }
                           } else if (!var31.method_28022()) {
                              int var42 = var2 != 0 ? (var31.method_27997() + 1) / 2 : var31.method_27997();
                              var8.method_32408(var24.method_35899(var42));
                              if (var31.method_28022()) {
                                 var24.method_35896(ItemStack.EMPTY);
                              }

                              var24.method_35892(var4, var8.method_32424());
                           } else {
                              var24.method_35896(ItemStack.EMPTY);
                              var8.method_32408(ItemStack.EMPTY);
                           }
                        }
                     } else if (!var36.method_28022() && var24.method_35889(var36)) {
                        int var43 = var2 != 0 ? 1 : var36.method_27997();
                        if (var43 > var24.method_35890(var36)) {
                           var43 = var24.method_35890(var36);
                        }

                        var24.method_35896(var36.method_27953(var43));
                     }

                     var24.method_35887();
                  }
               } else {
                  if (var1 < 0) {
                     return ItemStack.EMPTY;
                  }

                  class_7934 var23 = this.field_19926.get(var1);
                  if (var23 == null || !var23.method_35895(var4)) {
                     return ItemStack.EMPTY;
                  }

                  for (ItemStack var30 = this.method_18874(var4, var1);
                       !var30.method_28022() && ItemStack.method_28019(var23.method_35898(), var30);
                       var30 = this.method_18874(var4, var1)
                  ) {
                     var7 = var30.method_27973();
                  }
               }
            } else if (!var8.method_32424().method_28022()) {
               if (var2 == 0) {
                  var4.method_3153(var8.method_32424(), true);
                  var8.method_32408(ItemStack.EMPTY);
               }

               if (var2 == 1) {
                  var4.method_3153(var8.method_32424().method_27953(1), true);
               }
            }
         } else if (var3 != class_6269.field_32026) {
            if (var3 == class_6269.field_32025 && var4.playerAbilities.isCreativeMode && var8.method_32424().method_28022() && var1 >= 0) {
               class_7934 var21 = this.field_19926.get(var1);
               if (var21 != null && var21.method_35884()) {
                  ItemStack var28 = var21.method_35898().method_27973();
                  var28.method_28017(var28.method_28016());
                  var8.method_32408(var28);
               }
            } else if (var3 == class_6269.field_32024 && var8.method_32424().method_28022() && var1 >= 0) {
               class_7934 var20 = this.field_19926.get(var1);
               if (var20 != null && var20.method_35884() && var20.method_35895(var4)) {
                  ItemStack var27 = var20.method_35899(var2 != 0 ? var20.method_35898().method_27997() : 1);
                  var20.method_35892(var4, var27);
                  var4.method_3153(var27, true);
               }
            } else if (var3 == class_6269.field_32023 && var1 >= 0) {
               class_7934 var19 = this.field_19926.get(var1);
               ItemStack var26 = var8.method_32424();
               if (!var26.method_28022() && (var19 == null || !var19.method_35884() || !var19.method_35895(var4))) {
                  int var34 = var2 != 0 ? this.field_19926.size() - 1 : 0;
                  int var37 = var2 != 0 ? -1 : 1;

                  for (int var44 = 0; var44 < 2; var44++) {
                     for (int var45 = var34; var45 >= 0 && var45 < this.field_19926.size() && var26.method_27997() < var26.method_28016(); var45 += var37) {
                        class_7934 var46 = this.field_19926.get(var45);
                        if (var46.method_35884() && method_18856(var46, var26, true) && var46.method_35895(var4) && this.method_18873(var26, var46)) {
                           ItemStack var47 = var46.method_35898();
                           if (var44 != 0 || var47.method_27997() != var47.method_28016()) {
                              int var48 = Math.min(var26.method_28016() - var26.method_27997(), var47.method_27997());
                              ItemStack var18 = var46.method_35899(var48);
                              var26.method_28030(var48);
                              if (var18.method_28022()) {
                                 var46.method_35896(ItemStack.EMPTY);
                              }

                              var46.method_35892(var4, var18);
                           }
                        }
                     }
                  }
               }

               this.method_18877();
            }
         } else {
            class_7934 var22 = this.field_19926.get(var1);
            ItemStack var29 = var8.method_31498(var2);
            ItemStack var35 = var22.method_35898();
            if (!var29.method_28022() || !var35.method_28022()) {
               if (!var29.method_28022()) {
                  if (!var35.method_28022()) {
                     if (var22.method_35895(var4) && var22.method_35889(var29)) {
                        int var38 = var22.method_35890(var29);
                        if (var29.method_27997() <= var38) {
                           var22.method_35896(var29);
                           var8.method_31503(var2, var35);
                           var22.method_35892(var4, var35);
                        } else {
                           var22.method_35896(var29.method_27953(var38));
                           var22.method_35892(var4, var35);
                           if (!var8.method_32414(var35)) {
                              var4.method_3153(var35, true);
                           }
                        }
                     }
                  } else if (var22.method_35889(var29)) {
                     int var39 = var22.method_35890(var29);
                     if (var29.method_27997() <= var39) {
                        var22.method_35896(var29);
                        var8.method_31503(var2, ItemStack.EMPTY);
                     } else {
                        var22.method_35896(var29.method_27953(var39));
                     }
                  }
               } else if (var22.method_35895(var4)) {
                  var8.method_31503(var2, var35);
                  var22.method_35885(var35.method_27997());
                  var22.method_35896(ItemStack.EMPTY);
                  var22.method_35892(var4, var35);
               }
            }
         }
      } else {
         int var9 = this.field_19927;
         this.field_19927 = method_18860(var2);
         if ((var9 != 1 || this.field_19927 != 2) && var9 != this.field_19927) {
            this.method_18866();
         } else if (!var8.method_32424().method_28022()) {
            if (this.field_19927 != 0) {
               if (this.field_19927 != 1) {
                  if (this.field_19927 != 2) {
                     this.method_18866();
                  } else {
                     if (!this.field_19934.isEmpty()) {
                        ItemStack var10 = var8.method_32424().method_27973();
                        int var11 = var8.method_32424().method_27997();

                        for (class_7934 var13 : this.field_19934) {
                           ItemStack var14 = var8.method_32424();
                           if (var13 != null
                              && method_18856(var13, var14, true)
                              && var13.method_35889(var14)
                              && (this.field_19929 == 2 || var14.method_27997() >= this.field_19934.size())
                              && this.method_18857(var13)) {
                              ItemStack var15 = var10.method_27973();
                              int var16 = !var13.method_35884() ? 0 : var13.method_35898().method_27997();
                              method_18875(this.field_19934, this.field_19929, var15, var16);
                              int var17 = Math.min(var15.method_28016(), var13.method_35890(var15));
                              if (var15.method_27997() > var17) {
                                 var15.method_28017(var17);
                              }

                              var11 -= var15.method_27997() - var16;
                              var13.method_35896(var15);
                           }
                        }

                        var10.method_28017(var11);
                        var8.method_32408(var10);
                     }

                     this.method_18866();
                  }
               } else {
                  class_7934 var25 = this.field_19926.get(var1);
                  ItemStack var33 = var8.method_32424();
                  if (var25 != null
                     && method_18856(var25, var33, true)
                     && var25.method_35889(var33)
                     && (this.field_19929 == 2 || var33.method_27997() > this.field_19934.size())
                     && this.method_18857(var25)) {
                     this.field_19934.add(var25);
                  }
               }
            } else {
               this.field_19929 = method_18882(var2);
               if (!method_18864(this.field_19929, var4)) {
                  this.method_18866();
               } else {
                  this.field_19927 = 1;
                  this.field_19934.clear();
               }
            }
         } else {
            this.method_18866();
         }
      }

      return var7;
   }

   public static boolean method_18855(ItemStack var0, ItemStack var1) {
      return var0.method_27960() == var1.method_27960() && ItemStack.method_27956(var0, var1);
   }

   public boolean method_18873(ItemStack var1, class_7934 var2) {
      return true;
   }

   public void method_18876(PlayerEntity var1) {
      class_7051 var4 = var1.inventory;
      if (!var4.method_32424().method_28022()) {
         var1.method_3153(var4.method_32424(), false);
         var4.method_32408(ItemStack.EMPTY);
      }
   }

   public void method_18887(PlayerEntity var1, World var2, class_6867 var3) {
      if (!var1.isAlive() || var1 instanceof class_9359 && ((class_9359)var1).method_43252()) {
         for (int var7 = 0; var7 < var3.method_31505(); var7++) {
            var1.method_3153(var3.method_31507(var7), false);
         }
      } else {
         for (int var6 = 0; var6 < var3.method_31505(); var6++) {
            var1.inventory.method_32395(var2, var3.method_31507(var6));
         }
      }
   }

   public void method_18853(class_6867 var1) {
      this.method_18877();
   }

   public void method_18871(int var1, ItemStack var2) {
      this.method_18878(var1).method_35896(var2);
   }

   public void method_18854(List<ItemStack> var1) {
      for (int var4 = 0; var4 < var1.size(); var4++) {
         this.method_18878(var4).method_35896((ItemStack)var1.get(var4));
      }
   }

   public void method_18869(int var1, int var2) {
      this.field_19931.get(var1).method_43087(var2);
   }

   public short method_18884(class_7051 var1) {
      this.field_19924++;
      return this.field_19924;
   }

   public boolean method_18879(PlayerEntity var1) {
      return !this.field_19930.contains(var1);
   }

   public void method_18883(PlayerEntity var1, boolean var2) {
      if (!var2) {
         this.field_19930.add(var1);
      } else {
         this.field_19930.remove(var1);
      }
   }

   public abstract boolean method_18861(PlayerEntity var1);

   public boolean method_18892(ItemStack var1, int var2, int var3, boolean var4) {
      boolean var7 = false;
      int var8 = var2;
      if (var4) {
         var8 = var3 - 1;
      }

      if (var1.method_28005()) {
         while (!var1.method_28022() && (!var4 ? var8 < var3 : var8 >= var2)) {
            class_7934 var9 = this.field_19926.get(var8);
            ItemStack var10 = var9.method_35898();
            if (!var10.method_28022() && method_18855(var1, var10)) {
               int var11 = var10.method_27997() + var1.method_27997();
               if (var11 > var1.method_28016()) {
                  if (var10.method_27997() < var1.method_28016()) {
                     var1.method_27970(var1.method_28016() - var10.method_27997());
                     var10.method_28017(var1.method_28016());
                     var9.method_35887();
                     var7 = true;
                  }
               } else {
                  var1.method_28017(0);
                  var10.method_28017(var11);
                  var9.method_35887();
                  var7 = true;
               }
            }

            if (!var4) {
               var8++;
            } else {
               var8--;
            }
         }
      }

      if (!var1.method_28022()) {
         if (!var4) {
            var8 = var2;
         } else {
            var8 = var3 - 1;
         }

         while (!var4 ? var8 < var3 : var8 >= var2) {
            class_7934 var13 = this.field_19926.get(var8);
            ItemStack var14 = var13.method_35898();
            if (var14.method_28022() && var13.method_35889(var1)) {
               if (var1.method_27997() <= var13.method_35897()) {
                  var13.method_35896(var1.method_27953(var1.method_27997()));
               } else {
                  var13.method_35896(var1.method_27953(var13.method_35897()));
               }

               var13.method_35887();
               var7 = true;
               break;
            }

            if (!var4) {
               var8++;
            } else {
               var8--;
            }
         }
      }

      return var7;
   }

   public static int method_18882(int var0) {
      return var0 >> 2 & 3;
   }

   public static int method_18860(int var0) {
      return var0 & 3;
   }

   public static int method_18881(int var0, int var1) {
      return var0 & 3 | (var1 & 3) << 2;
   }

   public static boolean method_18864(int var0, PlayerEntity var1) {
      if (var0 != 0) {
         return var0 == 1 ? true : var0 == 2 && var1.playerAbilities.isCreativeMode;
      } else {
         return true;
      }
   }

   public void method_18866() {
      this.field_19927 = 0;
      this.field_19934.clear();
   }

   public static boolean method_18856(class_7934 var0, ItemStack var1, boolean var2) {
      boolean var5 = var0 == null || !var0.method_35884();
      return !var5 && var1.method_27991(var0.method_35898()) && ItemStack.method_27956(var0.method_35898(), var1)
         ? var0.method_35898().method_27997() + (!var2 ? var1.method_27997() : 0) <= var1.method_28016()
         : var5;
   }

   public static void method_18875(Set<class_7934> var0, int var1, ItemStack var2, int var3) {
      switch (var1) {
         case 0:
            var2.method_28017(MathHelper.floor((float)var2.method_27997() / (float)var0.size()));
            break;
         case 1:
            var2.method_28017(1);
            break;
         case 2:
            var2.method_28017(var2.method_27960().method_11245());
      }

      var2.method_28030(var3);
   }

   public boolean method_18857(class_7934 var1) {
      return true;
   }

   public static int method_18863(class_3757 var0) {
      return !(var0 instanceof class_6867) ? 0 : method_18870((class_6867)var0);
   }

   public static int method_18870(class_6867 var0) {
      if (var0 != null) {
         int var3 = 0;
         float var4 = 0.0F;

         for (int var5 = 0; var5 < var0.method_31505(); var5++) {
            ItemStack var6 = var0.method_31498(var5);
            if (!var6.method_28022()) {
               var4 += (float)var6.method_27997() / (float)Math.min(var0.method_31506(), var6.method_28016());
               var3++;
            }
         }

         var4 /= (float)var0.method_31505();
         return MathHelper.floor(var4 * 14.0F) + (var3 <= 0 ? 0 : 1);
      } else {
         return 0;
      }
   }
}
