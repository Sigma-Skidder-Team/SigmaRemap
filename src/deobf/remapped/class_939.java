package remapped;

public class class_939 extends class_6414 {
   private static String[] field_4786;
   public static final class_7044 field_4787 = class_6023.field_30733;
   private static final class_4190 field_4784 = method_29292(2.0, 4.0, 2.0, 14.0, 16.0, 14.0);
   public static final class_4190 field_4785 = class_3370.method_15533(
      class_3370.method_15524(),
      class_3370.method_15531(
         method_29292(0.0, 0.0, 4.0, 16.0, 3.0, 12.0), method_29292(4.0, 0.0, 0.0, 12.0, 3.0, 16.0), method_29292(2.0, 0.0, 2.0, 14.0, 3.0, 14.0), field_4784
      ),
      class_8529.field_43656
   );

   public class_939(class_3073 var1) {
      super(var1);
      this.method_29284(this.field_32751.method_36446().method_10308(field_4787, Integer.valueOf(0)));
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, class_1331 var3, class_214 var4) {
      return field_4785;
   }

   @Override
   public class_4190 method_10776(class_2522 var1, class_6163 var2, class_1331 var3) {
      return field_4784;
   }

   @Override
   public void method_10784(class_2522 var1, World var2, class_1331 var3, Entity var4) {
      int var7 = var1.<Integer>method_10313(field_4787);
      float var8 = (float)var3.method_12165() + (6.0F + (float)(3 * var7)) / 16.0F;
      if (!var2.field_33055 && var4.method_37264() && var7 > 0 && var4.method_37309() <= (double)var8) {
         var4.method_37136();
         this.method_4060(var2, var3, var1, var7 - 1);
      }
   }

   @Override
   public class_6910 method_10777(class_2522 var1, World var2, class_1331 var3, class_704 var4, class_2584 var5, class_9529 var6) {
      ItemStack var9 = var4.method_26617(var5);
      if (!var9.method_28022()) {
         int var10 = var1.<Integer>method_10313(field_4787);
         class_2451 var11 = var9.method_27960();
         if (var11 != class_4897.field_24999) {
            if (var11 != class_4897.field_24548) {
               if (var11 != class_4897.field_24812) {
                  if (var11 == class_4897.field_25157 && class_9541.method_43990(var9) == class_3697.field_18108) {
                     if (var10 < 3 && !var2.field_33055) {
                        if (!var4.playerAbilities.isCreativeMode) {
                           ItemStack var17 = new ItemStack(class_4897.field_24812);
                           var4.method_3209(class_6234.field_31841);
                           var4.method_26615(var5, var17);
                           if (var4 instanceof class_9359) {
                              ((class_9359)var4).method_43264(var4.field_3869);
                           }
                        }

                        var2.method_43359((class_704)null, var3, class_463.field_2720, class_562.field_3322, 1.0F, 1.0F);
                        this.method_4060(var2, var3, var1, var10 + 1);
                     }

                     return class_6910.method_31659(var2.field_33055);
                  } else {
                     if (var10 > 0 && var11 instanceof class_9168) {
                        class_9168 var14 = (class_9168)var11;
                        if (var14.method_42263(var9) && !var2.field_33055) {
                           var14.method_42260(var9);
                           this.method_4060(var2, var3, var1, var10 - 1);
                           var4.method_3209(class_6234.field_31875);
                           return class_6910.field_35520;
                        }
                     }

                     if (var10 > 0 && var11 instanceof class_1967) {
                        if (class_8837.method_40660(var9) > 0 && !var2.field_33055) {
                           ItemStack var16 = var9.method_27973();
                           var16.method_28017(1);
                           class_8837.method_40661(var16);
                           var4.method_3209(class_6234.field_31888);
                           if (!var4.playerAbilities.isCreativeMode) {
                              var9.method_27970(1);
                              this.method_4060(var2, var3, var1, var10 - 1);
                           }

                           if (!var9.method_28022()) {
                              if (var4.inventory.method_32414(var16)) {
                                 if (var4 instanceof class_9359) {
                                    ((class_9359)var4).method_43264(var4.field_3869);
                                 }
                              } else {
                                 var4.method_3153(var16, false);
                              }
                           } else {
                              var4.method_26615(var5, var16);
                           }
                        }

                        return class_6910.method_31659(var2.field_33055);
                     } else if (var10 > 0 && var11 instanceof class_6201) {
                        class_6414 var15 = ((class_6201)var11).method_28392();
                        if (var15 instanceof class_3153 && !var2.method_22567()) {
                           ItemStack var13 = new ItemStack(class_4783.field_23761, 1);
                           if (var9.method_28002()) {
                              var13.method_27965(var9.method_27990().method_25944());
                           }

                           var4.method_26615(var5, var13);
                           this.method_4060(var2, var3, var1, var10 - 1);
                           var4.method_3209(class_6234.field_31844);
                           return class_6910.field_35520;
                        } else {
                           return class_6910.field_35518;
                        }
                     } else {
                        return class_6910.field_35521;
                     }
                  }
               } else {
                  if (var10 > 0 && !var2.field_33055) {
                     if (!var4.playerAbilities.isCreativeMode) {
                        ItemStack var12 = class_9541.method_43999(new ItemStack(class_4897.field_25157), class_3697.field_18108);
                        var4.method_3209(class_6234.field_31841);
                        var9.method_27970(1);
                        if (!var9.method_28022()) {
                           if (var4.inventory.method_32414(var12)) {
                              if (var4 instanceof class_9359) {
                                 ((class_9359)var4).method_43264(var4.field_3869);
                              }
                           } else {
                              var4.method_3153(var12, false);
                           }
                        } else {
                           var4.method_26615(var5, var12);
                        }
                     }

                     var2.method_43359((class_704)null, var3, class_463.field_2054, class_562.field_3322, 1.0F, 1.0F);
                     this.method_4060(var2, var3, var1, var10 - 1);
                  }

                  return class_6910.method_31659(var2.field_33055);
               }
            } else {
               if (var10 == 3 && !var2.field_33055) {
                  if (!var4.playerAbilities.isCreativeMode) {
                     var9.method_27970(1);
                     if (!var9.method_28022()) {
                        if (!var4.inventory.method_32414(new ItemStack(class_4897.field_24999))) {
                           var4.method_3153(new ItemStack(class_4897.field_24999), false);
                        }
                     } else {
                        var4.method_26615(var5, new ItemStack(class_4897.field_24999));
                     }
                  }

                  var4.method_3209(class_6234.field_31841);
                  this.method_4060(var2, var3, var1, 0);
                  var2.method_43359((class_704)null, var3, class_463.field_2142, class_562.field_3322, 1.0F, 1.0F);
               }

               return class_6910.method_31659(var2.field_33055);
            }
         } else {
            if (var10 < 3 && !var2.field_33055) {
               if (!var4.playerAbilities.isCreativeMode) {
                  var4.method_26615(var5, new ItemStack(class_4897.field_24548));
               }

               var4.method_3209(class_6234.field_31900);
               this.method_4060(var2, var3, var1, 3);
               var2.method_43359((class_704)null, var3, class_463.field_2168, class_562.field_3322, 1.0F, 1.0F);
            }

            return class_6910.method_31659(var2.field_33055);
         }
      } else {
         return class_6910.field_35521;
      }
   }

   public void method_4060(World var1, class_1331 var2, class_2522 var3, int var4) {
      var1.method_7513(var2, var3.method_10308(field_4787, Integer.valueOf(class_9299.method_42829(var4, 0, 3))), 2);
      var1.method_29523(var2, this);
   }

   @Override
   public void method_29259(World var1, class_1331 var2) {
      if (var1.field_33033.nextInt(20) == 1) {
         float var5 = var1.method_22561(var2).method_28865(var2);
         if (!(var5 < 0.15F)) {
            class_2522 var6 = var1.method_28262(var2);
            if (var6.<Integer>method_10313(field_4787) < 3) {
               var1.method_7513(var2, var6.method_10317(field_4787), 2);
            }
         }
      }
   }

   @Override
   public boolean method_10770(class_2522 var1) {
      return true;
   }

   @Override
   public int method_10795(class_2522 var1, World var2, class_1331 var3) {
      return var1.<Integer>method_10313(field_4787);
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_4787);
   }

   @Override
   public boolean method_10793(class_2522 var1, class_6163 var2, class_1331 var3, class_2929 var4) {
      return false;
   }
}
