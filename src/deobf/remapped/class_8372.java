package remapped;

import java.util.List;
import java.util.Random;

public class class_8372 extends class_4088 {
   private static String[] field_42868;
   private final class_6867 field_42869 = new class_4813(this, 2);
   private final class_9210 field_42865;
   private final Random field_42866 = new Random();
   private final class_9332 field_42863 = class_9332.method_43089();
   public final int[] field_42870 = new int[3];
   public final int[] field_42867 = new int[]{-1, -1, -1};
   public final int[] field_42864 = new int[]{-1, -1, -1};

   public class_8372(int var1, class_7051 var2) {
      this(var1, var2, class_9210.field_47106);
   }

   public class_8372(int var1, class_7051 var2, class_9210 var3) {
      super(class_4165.field_20243, var1);
      this.field_42865 = var3;
      this.method_18885(new class_2542(this, this.field_42869, 0, 15, 47));
      this.method_18885(new class_3919(this, this.field_42869, 1, 35, 47));

      for (int var6 = 0; var6 < 3; var6++) {
         for (int var7 = 0; var7 < 9; var7++) {
            this.method_18885(new class_7934(var2, var7 + var6 * 9 + 9, 8 + var7 * 18, 84 + var6 * 18));
         }
      }

      for (int var8 = 0; var8 < 9; var8++) {
         this.method_18885(new class_7934(var2, var8, 8 + var8 * 18, 142));
      }

      this.method_18889(class_9332.method_43084(this.field_42870, 0));
      this.method_18889(class_9332.method_43084(this.field_42870, 1));
      this.method_18889(class_9332.method_43084(this.field_42870, 2));
      this.method_18889(this.field_42863).method_43087(var2.field_36409.method_3221());
      this.method_18889(class_9332.method_43084(this.field_42867, 0));
      this.method_18889(class_9332.method_43084(this.field_42867, 1));
      this.method_18889(class_9332.method_43084(this.field_42867, 2));
      this.method_18889(class_9332.method_43084(this.field_42864, 0));
      this.method_18889(class_9332.method_43084(this.field_42864, 1));
      this.method_18889(class_9332.method_43084(this.field_42864, 2));
   }

   @Override
   public void method_18853(class_6867 var1) {
      if (var1 == this.field_42869) {
         ItemStack var4 = var1.method_31498(0);
         if (!var4.method_28022() && var4.method_27985()) {
            this.field_42865.method_42533((var2, var3) -> {
               int var6 = 0;

               for (int var7 = -1; var7 <= 1; var7++) {
                  for (int var8 = -1; var8 <= 1; var8++) {
                     if ((var7 != 0 || var8 != 0) && var2.method_22548(var3.method_6104(var8, 0, var7)) && var2.method_22548(var3.method_6104(var8, 1, var7))) {
                        if (var2.method_28262(var3.method_6104(var8 * 2, 0, var7 * 2)).method_8350(class_4783.field_23313)) {
                           var6++;
                        }

                        if (var2.method_28262(var3.method_6104(var8 * 2, 1, var7 * 2)).method_8350(class_4783.field_23313)) {
                           var6++;
                        }

                        if (var8 != 0 && var7 != 0) {
                           if (var2.method_28262(var3.method_6104(var8 * 2, 0, var7)).method_8350(class_4783.field_23313)) {
                              var6++;
                           }

                           if (var2.method_28262(var3.method_6104(var8 * 2, 1, var7)).method_8350(class_4783.field_23313)) {
                              var6++;
                           }

                           if (var2.method_28262(var3.method_6104(var8, 0, var7 * 2)).method_8350(class_4783.field_23313)) {
                              var6++;
                           }

                           if (var2.method_28262(var3.method_6104(var8, 1, var7 * 2)).method_8350(class_4783.field_23313)) {
                              var6++;
                           }
                        }
                     }
                  }
               }

               this.field_42866.setSeed((long)this.field_42863.method_43085());

               for (int var10 = 0; var10 < 3; var10++) {
                  this.field_42870[var10] = class_2931.method_13432(this.field_42866, var10, var6, var4);
                  this.field_42867[var10] = -1;
                  this.field_42864[var10] = -1;
                  if (this.field_42870[var10] < var10 + 1) {
                     this.field_42870[var10] = 0;
                  }
               }

               for (int var11 = 0; var11 < 3; var11++) {
                  if (this.field_42870[var11] > 0) {
                     List var12 = this.method_38580(var4, var11, this.field_42870[var11]);
                     if (var12 != null && !var12.isEmpty()) {
                        class_9693 var9 = (class_9693)var12.get(this.field_42866.nextInt(var12.size()));
                        this.field_42867[var11] = class_8669.field_44445.method_14041(var9.field_49312);
                        this.field_42864[var11] = var9.field_49313;
                     }
                  }
               }

               this.method_18877();
            });
         } else {
            for (int var5 = 0; var5 < 3; var5++) {
               this.field_42870[var5] = 0;
               this.field_42867[var5] = -1;
               this.field_42864[var5] = -1;
            }
         }
      }
   }

   @Override
   public boolean method_18886(class_704 var1, int var2) {
      ItemStack var5 = this.field_42869.method_31498(0);
      ItemStack var6 = this.field_42869.method_31498(1);
      int var7 = var2 + 1;
      if ((var6.method_28022() || var6.method_27997() < var7) && !var1.playerAbilities.isCreativeMode) {
         return false;
      } else if (this.field_42870[var2] > 0
         && !var5.method_28022()
         && (var1.field_3840 >= var7 && var1.field_3840 >= this.field_42870[var2] || var1.playerAbilities.isCreativeMode)) {
         this.field_42865.method_42533((var6x, var7x) -> {
            ItemStack var10 = var5;
            List var11 = this.method_38580(var5, var2, this.field_42870[var2]);
            if (!var11.isEmpty()) {
               var1.method_3175(var5, var7);
               boolean var12 = var5.method_27960() == class_4897.field_24551;
               if (var12) {
                  var10 = new ItemStack(class_4897.field_24879);
                  CompoundNBT var13 = var5.method_27990();
                  if (var13 != null) {
                     var10.method_27965(var13.method_25944());
                  }

                  this.field_42869.method_31503(0, var10);
               }

               for (int var15 = 0; var15 < var11.size(); var15++) {
                  class_9693 var14 = (class_9693)var11.get(var15);
                  if (!var12) {
                     var10.method_28031(var14.field_49312, var14.field_49313);
                  } else {
                     class_7597.method_34503(var10, var14);
                  }
               }

               if (!var1.playerAbilities.isCreativeMode) {
                  var6.method_27970(var7);
                  if (var6.method_28022()) {
                     this.field_42869.method_31503(1, ItemStack.EMPTY);
                  }
               }

               var1.method_3209(class_6234.field_31877);
               if (var1 instanceof class_9359) {
                  class_8807.field_45073.method_26281((class_9359)var1, var10, var7);
               }

               this.field_42869.method_17407();
               this.field_42863.method_43087(var1.method_3221());
               this.method_18853(this.field_42869);
               var6x.method_43359((class_704)null, var7x, class_463.field_2423, class_562.field_3322, 1.0F, var6x.field_33033.nextFloat() * 0.1F + 0.9F);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   private List<class_9693> method_38580(ItemStack var1, int var2, int var3) {
      this.field_42866.setSeed((long)(this.field_42863.method_43085() + var2));
      List var6 = class_2931.method_13420(this.field_42866, var1, var3, false);
      if (var1.method_27960() == class_4897.field_24551 && var6.size() > 1) {
         var6.remove(this.field_42866.nextInt(var6.size()));
      }

      return var6;
   }

   public int method_38582() {
      ItemStack var3 = this.field_42869.method_31498(1);
      return !var3.method_28022() ? var3.method_27997() : 0;
   }

   public int method_38581() {
      return this.field_42863.method_43085();
   }

   @Override
   public void method_18876(class_704 var1) {
      super.method_18876(var1);
      this.field_42865.method_42533((var2, var3) -> this.method_18887(var1, var1.world, this.field_42869));
   }

   @Override
   public boolean method_18861(class_704 var1) {
      return method_18872(this.field_42865, var1, class_4783.field_23815);
   }

   @Override
   public ItemStack method_18874(class_704 var1, int var2) {
      ItemStack var5 = ItemStack.EMPTY;
      class_7934 var6 = this.field_19926.get(var2);
      if (var6 != null && var6.method_35884()) {
         ItemStack var7 = var6.method_35898();
         var5 = var7.method_27973();
         if (var2 != 0) {
            if (var2 != 1) {
               if (var7.method_27960() != class_4897.field_25047) {
                  if (this.field_19926.get(0).method_35884() || !this.field_19926.get(0).method_35889(var7)) {
                     return ItemStack.EMPTY;
                  }

                  ItemStack var8 = var7.method_27973();
                  var8.method_28017(1);
                  var7.method_27970(1);
                  this.field_19926.get(0).method_35896(var8);
               } else if (!this.method_18892(var7, 1, 2, true)) {
                  return ItemStack.EMPTY;
               }
            } else if (!this.method_18892(var7, 2, 38, true)) {
               return ItemStack.EMPTY;
            }
         } else if (!this.method_18892(var7, 2, 38, true)) {
            return ItemStack.EMPTY;
         }

         if (!var7.method_28022()) {
            var6.method_35887();
         } else {
            var6.method_35896(ItemStack.EMPTY);
         }

         if (var7.method_27997() == var5.method_27997()) {
            return ItemStack.EMPTY;
         }

         var6.method_35892(var1, var7);
      }

      return var5;
   }
}
