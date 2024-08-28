package mapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;

public abstract class Class5812 {
   private final Class25<ItemStack> field25467 = Class25.<ItemStack>method67();
   public final List<Class5839> field25468 = Lists.newArrayList();
   private final List<Class4923> field25469 = Lists.newArrayList();
   private final Class8298<?> field25470;
   public final int field25471;
   private short field25472;
   private int field25473 = -1;
   private int field25474;
   private final Set<Class5839> field25475 = Sets.newHashSet();
   private final List<Class876> field25476 = Lists.newArrayList();
   private final Set<PlayerEntity> field25477 = Sets.newHashSet();

   public Class5812(Class8298<?> var1, int var2) {
      this.field25470 = var1;
      this.field25471 = var2;
   }

   public static boolean method18121(Class8786 var0, PlayerEntity var1, Block var2) {
      return var0.<Boolean>method31715(
         (var2x, var3) -> var2x.method6738(var3).method23448(var2)
               ? var1.method3276((double)var3.method8304() + 0.5, (double)var3.getY() + 0.5, (double)var3.method8306() + 0.5) <= 64.0
               : false,
         true
      );
   }

   public Class8298<?> method18109() {
      if (this.field25470 != null) {
         return this.field25470;
      } else {
         throw new UnsupportedOperationException("Unable to construct this menu by type");
      }
   }

   public static void method18122(Class920 var0, int var1) {
      int var4 = var0.method3629();
      if (var4 < var1) {
         throw new IllegalArgumentException("Container size " + var4 + " is smaller than expected " + var1);
      }
   }

   public static void method18123(Class8202 var0, int var1) {
      int var4 = var0.method28507();
      if (var4 < var1) {
         throw new IllegalArgumentException("Container data count " + var4 + " is smaller than expected " + var1);
      }
   }

   public Class5839 method18124(Class5839 var1) {
      var1.field25579 = this.field25468.size();
      this.field25468.add(var1);
      this.field25467.add(ItemStack.EMPTY);
      return var1;
   }

   public Class4923 method18125(Class4923 var1) {
      this.field25469.add(var1);
      return var1;
   }

   public void method18126(Class8202 var1) {
      for (int var4 = 0; var4 < var1.method28507(); var4++) {
         this.method18125(Class4923.method15236(var1, var4));
      }
   }

   public void method18127(Class876 var1) {
      if (!this.field25476.contains(var1)) {
         this.field25476.add(var1);
         var1.method2718(this, this.method18129());
         this.method18130();
      }
   }

   public void method18128(Class876 var1) {
      this.field25476.remove(var1);
   }

   public Class25<ItemStack> method18129() {
      Class25 var3 = Class25.method67();

      for (int var4 = 0; var4 < this.field25468.size(); var4++) {
         var3.add(this.field25468.get(var4).method18265());
      }

      return var3;
   }

   public void method18130() {
      for (int var3 = 0; var3 < this.field25468.size(); var3++) {
         ItemStack var4 = this.field25468.get(var3).method18265();
         ItemStack var5 = this.field25467.get(var3);
         if (!ItemStack.method32128(var5, var4)) {
            ItemStack var6 = var4.copy();
            this.field25467.set(var3, var6);

            for (Class876 var8 : this.field25476) {
               var8.method2720(this, var3, var6);
            }
         }
      }

      for (int var9 = 0; var9 < this.field25469.size(); var9++) {
         Class4923 var10 = this.field25469.get(var9);
         if (var10.method15239()) {
            for (Class876 var12 : this.field25476) {
               var12.method2719(this, var9, var10.method15234());
            }
         }
      }
   }

   public boolean method18104(PlayerEntity var1, int var2) {
      return false;
   }

   public Class5839 method18131(int var1) {
      return this.field25468.get(var1);
   }

   public ItemStack method18112(PlayerEntity var1, int var2) {
      Class5839 var5 = this.field25468.get(var2);
      return var5 == null ? ItemStack.EMPTY : var5.method18265();
   }

   public ItemStack method18132(int var1, int var2, Class2259 var3, PlayerEntity var4) {
      try {
         return this.method18133(var1, var2, var3, var4);
      } catch (Exception var10) {
         Class4526 var8 = Class4526.method14413(var10, "Container click");
         Class8965 var9 = var8.method14410("Click info");
         var9.method32806("Menu Type", () -> this.field25470 == null ? "<no type>" : Class2348.field16084.method9181(this.field25470).toString());
         var9.method32806("Menu Class", () -> this.getClass().getCanonicalName());
         var9.method32807("Slot Count", this.field25468.size());
         var9.method32807("Slot", var1);
         var9.method32807("Button", var2);
         var9.method32807("Type", var3);
         throw new Class2506(var8);
      }
   }

   private ItemStack method18133(int var1, int var2, Class2259 var3, PlayerEntity var4) {
      ItemStack var7 = ItemStack.EMPTY;
      Class974 var8 = var4.field4902;
      if (var3 != Class2259.field14699) {
         if (this.field25474 != 0) {
            this.method18147();
         } else if ((var3 == Class2259.field14694 || var3 == Class2259.field14695) && (var2 == 0 || var2 == 1)) {
            if (var1 != -999) {
               if (var3 != Class2259.field14695) {
                  if (var1 < 0) {
                     return ItemStack.EMPTY;
                  }

                  Class5839 var24 = this.field25468.get(var1);
                  if (var24 != null) {
                     ItemStack var31 = var24.method18265();
                     ItemStack var36 = var8.method4057();
                     if (!var31.method32105()) {
                        var7 = var31.copy();
                     }

                     if (!var31.method32105()) {
                        if (var24.method18273(var4)) {
                           if (!var36.method32105()) {
                              if (!var24.method18259(var36)) {
                                 if (var36.method32113() > 1 && method18134(var31, var36) && !var31.method32105()) {
                                    int var40 = var31.method32179();
                                    if (var40 + var36.method32179() <= var36.method32113()) {
                                       var36.method32181(var40);
                                       var31 = var24.method18272(var40);
                                       if (var31.method32105()) {
                                          var24.method18267(ItemStack.EMPTY);
                                       }

                                       var24.method18264(var4, var8.method4057());
                                    }
                                 }
                              } else if (!method18134(var31, var36)) {
                                 if (var36.method32179() <= var24.method18270(var36)) {
                                    var24.method18267(var36);
                                    var8.method4056(var31);
                                 }
                              } else {
                                 int var41 = var2 != 0 ? 1 : var36.method32179();
                                 if (var41 > var24.method18270(var36) - var31.method32179()) {
                                    var41 = var24.method18270(var36) - var31.method32179();
                                 }

                                 if (var41 > var36.method32113() - var31.method32179()) {
                                    var41 = var36.method32113() - var31.method32179();
                                 }

                                 var36.method32182(var41);
                                 var31.method32181(var41);
                              }
                           } else if (!var31.method32105()) {
                              int var42 = var2 != 0 ? (var31.method32179() + 1) / 2 : var31.method32179();
                              var8.method4056(var24.method18272(var42));
                              if (var31.method32105()) {
                                 var24.method18267(ItemStack.EMPTY);
                              }

                              var24.method18264(var4, var8.method4057());
                           } else {
                              var24.method18267(ItemStack.EMPTY);
                              var8.method4056(ItemStack.EMPTY);
                           }
                        }
                     } else if (!var36.method32105() && var24.method18259(var36)) {
                        int var43 = var2 != 0 ? 1 : var36.method32179();
                        if (var43 > var24.method18270(var36)) {
                           var43 = var24.method18270(var36);
                        }

                        var24.method18267(var36.method32106(var43));
                     }

                     var24.method18268();
                  }
               } else {
                  if (var1 < 0) {
                     return ItemStack.EMPTY;
                  }

                  Class5839 var23 = this.field25468.get(var1);
                  if (var23 == null || !var23.method18273(var4)) {
                     return ItemStack.EMPTY;
                  }

                  for (ItemStack var30 = this.method18112(var4, var1);
                       !var30.method32105() && ItemStack.method32130(var23.method18265(), var30);
                       var30 = this.method18112(var4, var1)
                  ) {
                     var7 = var30.copy();
                  }
               }
            } else if (!var8.method4057().method32105()) {
               if (var2 == 0) {
                  var4.method2882(var8.method4057(), true);
                  var8.method4056(ItemStack.EMPTY);
               }

               if (var2 == 1) {
                  var4.method2882(var8.method4057().method32106(1), true);
               }
            }
         } else if (var3 != Class2259.field14696) {
            if (var3 == Class2259.field14697 && var4.field4919.field29609 && var8.method4057().method32105() && var1 >= 0) {
               Class5839 var21 = this.field25468.get(var1);
               if (var21 != null && var21.method18266()) {
                  ItemStack var28 = var21.method18265().copy();
                  var28.method32180(var28.method32113());
                  var8.method4056(var28);
               }
            } else if (var3 == Class2259.field14698 && var8.method4057().method32105() && var1 >= 0) {
               Class5839 var20 = this.field25468.get(var1);
               if (var20 != null && var20.method18266() && var20.method18273(var4)) {
                  ItemStack var27 = var20.method18272(var2 != 0 ? var20.method18265().method32179() : 1);
                  var20.method18264(var4, var27);
                  var4.method2882(var27, true);
               }
            } else if (var3 == Class2259.field14700 && var1 >= 0) {
               Class5839 var19 = this.field25468.get(var1);
               ItemStack var26 = var8.method4057();
               if (!var26.method32105() && (var19 == null || !var19.method18266() || !var19.method18273(var4))) {
                  int var34 = var2 != 0 ? this.field25468.size() - 1 : 0;
                  int var37 = var2 != 0 ? -1 : 1;

                  for (int var44 = 0; var44 < 2; var44++) {
                     for (int var45 = var34; var45 >= 0 && var45 < this.field25468.size() && var26.method32179() < var26.method32113(); var45 += var37) {
                        Class5839 var46 = this.field25468.get(var45);
                        if (var46.method18266() && method18148(var46, var26, true) && var46.method18273(var4) && this.method18111(var26, var46)) {
                           ItemStack var47 = var46.method18265();
                           if (var44 != 0 || var47.method32179() != var47.method32113()) {
                              int var48 = Math.min(var26.method32113() - var26.method32179(), var47.method32179());
                              ItemStack var18 = var46.method18272(var48);
                              var26.method32181(var48);
                              if (var18.method32105()) {
                                 var46.method18267(ItemStack.EMPTY);
                              }

                              var46.method18264(var4, var18);
                           }
                        }
                     }
                  }
               }

               this.method18130();
            }
         } else {
            Class5839 var22 = this.field25468.get(var1);
            ItemStack var29 = var8.method3618(var2);
            ItemStack var35 = var22.method18265();
            if (!var29.method32105() || !var35.method32105()) {
               if (!var29.method32105()) {
                  if (!var35.method32105()) {
                     if (var22.method18273(var4) && var22.method18259(var29)) {
                        int var38 = var22.method18270(var29);
                        if (var29.method32179() <= var38) {
                           var22.method18267(var29);
                           var8.method3621(var2, var35);
                           var22.method18264(var4, var35);
                        } else {
                           var22.method18267(var29.method32106(var38));
                           var22.method18264(var4, var35);
                           if (!var8.method4045(var35)) {
                              var4.method2882(var35, true);
                           }
                        }
                     }
                  } else if (var22.method18259(var29)) {
                     int var39 = var22.method18270(var29);
                     if (var29.method32179() <= var39) {
                        var22.method18267(var29);
                        var8.method3621(var2, ItemStack.EMPTY);
                     } else {
                        var22.method18267(var29.method32106(var39));
                     }
                  }
               } else if (var22.method18273(var4)) {
                  var8.method3621(var2, var35);
                  var22.method18262(var35.method32179());
                  var22.method18267(ItemStack.EMPTY);
                  var22.method18264(var4, var35);
               }
            }
         }
      } else {
         int var9 = this.field25474;
         this.field25474 = method18144(var2);
         if ((var9 != 1 || this.field25474 != 2) && var9 != this.field25474) {
            this.method18147();
         } else if (!var8.method4057().method32105()) {
            if (this.field25474 != 0) {
               if (this.field25474 != 1) {
                  if (this.field25474 != 2) {
                     this.method18147();
                  } else {
                     if (!this.field25475.isEmpty()) {
                        ItemStack var10 = var8.method4057().copy();
                        int var11 = var8.method4057().method32179();

                        for (Class5839 var13 : this.field25475) {
                           ItemStack var14 = var8.method4057();
                           if (var13 != null
                              && method18148(var13, var14, true)
                              && var13.method18259(var14)
                              && (this.field25473 == 2 || var14.method32179() >= this.field25475.size())
                              && this.method18150(var13)) {
                              ItemStack var15 = var10.copy();
                              int var16 = !var13.method18266() ? 0 : var13.method18265().method32179();
                              method18149(this.field25475, this.field25473, var15, var16);
                              int var17 = Math.min(var15.method32113(), var13.method18270(var15));
                              if (var15.method32179() > var17) {
                                 var15.method32180(var17);
                              }

                              var11 -= var15.method32179() - var16;
                              var13.method18267(var15);
                           }
                        }

                        var10.method32180(var11);
                        var8.method4056(var10);
                     }

                     this.method18147();
                  }
               } else {
                  Class5839 var25 = this.field25468.get(var1);
                  ItemStack var33 = var8.method4057();
                  if (var25 != null
                     && method18148(var25, var33, true)
                     && var25.method18259(var33)
                     && (this.field25473 == 2 || var33.method32179() > this.field25475.size())
                     && this.method18150(var25)) {
                     this.field25475.add(var25);
                  }
               }
            } else {
               this.field25473 = method18143(var2);
               if (!method18146(this.field25473, var4)) {
                  this.method18147();
               } else {
                  this.field25474 = 1;
                  this.field25475.clear();
               }
            }
         } else {
            this.method18147();
         }
      }

      return var7;
   }

   public static boolean method18134(ItemStack var0, ItemStack var1) {
      return var0.method32107() == var1.method32107() && ItemStack.method32127(var0, var1);
   }

   public boolean method18111(ItemStack var1, Class5839 var2) {
      return true;
   }

   public void method18113(PlayerEntity var1) {
      Class974 var4 = var1.field4902;
      if (!var4.method4057().method32105()) {
         var1.method2882(var4.method4057(), false);
         var4.method4056(ItemStack.EMPTY);
      }
   }

   public void method18135(PlayerEntity var1, Class1655 var2, Class920 var3) {
      if (!var1.method3066() || var1 instanceof Class878 && ((Class878)var1).method2783()) {
         for (int var7 = 0; var7 < var3.method3629(); var7++) {
            var1.method2882(var3.method3620(var7), false);
         }
      } else {
         for (int var6 = 0; var6 < var3.method3629(); var6++) {
            var1.field4902.method4047(var2, var3.method3620(var6));
         }
      }
   }

   public void method18106(Class920 var1) {
      this.method18130();
   }

   public void method18136(int var1, ItemStack var2) {
      this.method18131(var1).method18267(var2);
   }

   public void method18137(List<ItemStack> var1) {
      for (int var4 = 0; var4 < var1.size(); var4++) {
         this.method18131(var4).method18267((ItemStack)var1.get(var4));
      }
   }

   public void method18138(int var1, int var2) {
      this.field25469.get(var1).method15235(var2);
   }

   public short method18139(Class974 var1) {
      this.field25472++;
      return this.field25472;
   }

   public boolean method18140(PlayerEntity var1) {
      return !this.field25477.contains(var1);
   }

   public void method18141(PlayerEntity var1, boolean var2) {
      if (!var2) {
         this.field25477.add(var1);
      } else {
         this.field25477.remove(var1);
      }
   }

   public abstract boolean method18103(PlayerEntity var1);

   public boolean method18142(ItemStack var1, int var2, int var3, boolean var4) {
      boolean var7 = false;
      int var8 = var2;
      if (var4) {
         var8 = var3 - 1;
      }

      if (var1.method32114()) {
         while (!var1.method32105() && (!var4 ? var8 < var3 : var8 >= var2)) {
            Class5839 var9 = this.field25468.get(var8);
            ItemStack var10 = var9.method18265();
            if (!var10.method32105() && method18134(var1, var10)) {
               int var11 = var10.method32179() + var1.method32179();
               if (var11 > var1.method32113()) {
                  if (var10.method32179() < var1.method32113()) {
                     var1.method32182(var1.method32113() - var10.method32179());
                     var10.method32180(var1.method32113());
                     var9.method18268();
                     var7 = true;
                  }
               } else {
                  var1.method32180(0);
                  var10.method32180(var11);
                  var9.method18268();
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

      if (!var1.method32105()) {
         if (!var4) {
            var8 = var2;
         } else {
            var8 = var3 - 1;
         }

         while (!var4 ? var8 < var3 : var8 >= var2) {
            Class5839 var13 = this.field25468.get(var8);
            ItemStack var14 = var13.method18265();
            if (var14.method32105() && var13.method18259(var1)) {
               if (var1.method32179() <= var13.method18269()) {
                  var13.method18267(var1.method32106(var1.method32179()));
               } else {
                  var13.method18267(var1.method32106(var13.method18269()));
               }

               var13.method18268();
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

   public static int method18143(int var0) {
      return var0 >> 2 & 3;
   }

   public static int method18144(int var0) {
      return var0 & 3;
   }

   public static int method18145(int var0, int var1) {
      return var0 & 3 | (var1 & 3) << 2;
   }

   public static boolean method18146(int var0, PlayerEntity var1) {
      if (var0 != 0) {
         return var0 == 1 ? true : var0 == 2 && var1.field4919.field29609;
      } else {
         return true;
      }
   }

   public void method18147() {
      this.field25474 = 0;
      this.field25475.clear();
   }

   public static boolean method18148(Class5839 var0, ItemStack var1, boolean var2) {
      boolean var5 = var0 == null || !var0.method18266();
      return !var5 && var1.method32132(var0.method18265()) && ItemStack.method32127(var0.method18265(), var1)
         ? var0.method18265().method32179() + (!var2 ? var1.method32179() : 0) <= var1.method32113()
         : var5;
   }

   public static void method18149(Set<Class5839> var0, int var1, ItemStack var2, int var3) {
      switch (var1) {
         case 0:
            var2.method32180(MathHelper.method37767((float)var2.method32179() / (float)var0.size()));
            break;
         case 1:
            var2.method32180(1);
            break;
         case 2:
            var2.method32180(var2.method32107().method11710());
      }

      var2.method32181(var3);
   }

   public boolean method18150(Class5839 var1) {
      return true;
   }

   public static int method18151(Class944 var0) {
      return !(var0 instanceof Class920) ? 0 : method18152((Class920)var0);
   }

   public static int method18152(Class920 var0) {
      if (var0 != null) {
         int var3 = 0;
         float var4 = 0.0F;

         for (int var5 = 0; var5 < var0.method3629(); var5++) {
            ItemStack var6 = var0.method3618(var5);
            if (!var6.method32105()) {
               var4 += (float)var6.method32179() / (float)Math.min(var0.method3630(), var6.method32113());
               var3++;
            }
         }

         var4 /= (float)var0.method3629();
         return MathHelper.method37767(var4 * 14.0F) + (var3 <= 0 ? 0 : 1);
      } else {
         return 0;
      }
   }
}
