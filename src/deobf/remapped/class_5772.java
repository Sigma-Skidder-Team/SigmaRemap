package remapped;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_5772 extends class_2358 implements class_4511, class_3745 {
   private class_2831<ItemStack> field_29157 = class_2831.<ItemStack>method_12872(5, ItemStack.EMPTY);
   private int field_29158 = -1;
   private long field_29155;

   public class_5772() {
      super(class_133.field_363);
   }

   @Override
   public void method_17394(class_2522 var1, CompoundNBT var2) {
      super.method_17394(var1, var2);
      this.field_29157 = class_2831.<ItemStack>method_12872(this.method_31505(), ItemStack.EMPTY);
      if (!this.method_10811(var2)) {
         class_3037.method_13882(var2, this.field_29157);
      }

      this.field_29158 = var2.method_25947("TransferCooldown");
   }

   @Override
   public CompoundNBT method_17396(CompoundNBT var1) {
      super.method_17396(var1);
      if (!this.method_10815(var1)) {
         class_3037.method_13878(var1, this.field_29157);
      }

      var1.method_25931("TransferCooldown", this.field_29158);
      return var1;
   }

   @Override
   public int method_31505() {
      return this.field_29157.size();
   }

   @Override
   public ItemStack method_31497(int var1, int var2) {
      this.method_10812((PlayerEntity)null);
      return class_3037.method_13881(this.method_10814(), var1, var2);
   }

   @Override
   public void method_31503(int var1, ItemStack var2) {
      this.method_10812((PlayerEntity)null);
      this.method_10814().set(var1, var2);
      if (var2.method_27997() > this.method_31506()) {
         var2.method_28017(this.method_31506());
      }
   }

   @Override
   public ITextComponent method_38433() {
      return new TranslationTextComponent("container.hopper");
   }

   @Override
   public void method_17353() {
      if (this.field_18364 != null && !this.field_18364.field_33055) {
         this.field_29158--;
         this.field_29155 = this.field_18364.method_29546();
         if (!this.method_26087()) {
            this.method_26089(0);
            this.method_26086(() -> method_26101(this));
         }
      }
   }

   private boolean method_26086(Supplier<Boolean> var1) {
      if (this.field_18364 != null && !this.field_18364.field_33055) {
         if (!this.method_26087() && this.method_17403().<Boolean>method_10313(class_9279.field_47330)) {
            boolean var4 = false;
            if (!this.method_31495()) {
               var4 = this.method_26094();
            }

            if (!this.method_26093()) {
               var4 |= var1.get();
            }

            if (var4) {
               this.method_26089(8);
               this.method_17407();
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private boolean method_26093() {
      for (ItemStack var4 : this.field_29157) {
         if (var4.method_28022() || var4.method_27997() != var4.method_28016()) {
            return false;
         }
      }

      return true;
   }

   private boolean method_26094() {
      class_6867 var3 = this.method_26104();
      if (var3 != null) {
         Direction var4 = this.method_17403().<Direction>method_10313(class_9279.field_47337).method_1046();
         if (!this.method_26099(var3, var4)) {
            for (int var5 = 0; var5 < this.method_31505(); var5++) {
               if (!this.method_31498(var5).method_28022()) {
                  ItemStack var6 = this.method_31498(var5).method_27973();
                  ItemStack var7 = method_26103(this, var3, this.method_31497(var5, 1), var4);
                  if (var7.method_28022()) {
                     var3.method_17407();
                     return true;
                  }

                  this.method_31503(var5, var6);
               }
            }

            return false;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private static IntStream method_26091(class_6867 var0, Direction var1) {
      return !(var0 instanceof class_372) ? IntStream.range(0, var0.method_31505()) : IntStream.of(((class_372)var0).method_1832(var1));
   }

   private boolean method_26099(class_6867 var1, Direction var2) {
      return method_26091(var1, var2).allMatch(var1x -> {
         ItemStack var4 = var1.method_31498(var1x);
         return var4.method_27997() >= var4.method_28016();
      });
   }

   private static boolean method_26098(class_6867 var0, Direction var1) {
      return method_26091(var0, var1).allMatch(var1x -> var0.method_31498(var1x).method_28022());
   }

   public static boolean method_26101(class_4511 var0) {
      class_6867 var3 = method_26100(var0);
      if (var3 != null) {
         Direction var6 = Direction.field_802;
         return !method_26098(var3, var6) ? method_26091(var3, var6).anyMatch(var3x -> method_26096(var0, var3, var3x, var6)) : false;
      } else {
         for (class_91 var5 : method_26102(var0)) {
            if (method_26105(var0, var5)) {
               return true;
            }
         }

         return false;
      }
   }

   private static boolean method_26096(class_4511 var0, class_6867 var1, int var2, Direction var3) {
      ItemStack var6 = var1.method_31498(var2);
      if (!var6.method_28022() && method_26090(var1, var6, var2, var3)) {
         ItemStack var7 = var6.method_27973();
         ItemStack var8 = method_26103(var1, var0, var1.method_31497(var2, 1), (Direction)null);
         if (var8.method_28022()) {
            var1.method_17407();
            return true;
         }

         var1.method_31503(var2, var7);
      }

      return false;
   }

   public static boolean method_26105(class_6867 var0, class_91 var1) {
      boolean var4 = false;
      ItemStack var5 = var1.method_264().method_27973();
      ItemStack var6 = method_26103((class_6867)null, var0, var5, (Direction)null);
      if (!var6.method_28022()) {
         var1.method_248(var6);
      } else {
         var4 = true;
         var1.method_37204();
      }

      return var4;
   }

   public static ItemStack method_26103(class_6867 var0, class_6867 var1, ItemStack var2, Direction var3) {
      if (var1 instanceof class_372 && var3 != null) {
         class_372 var9 = (class_372)var1;
         int[] var10 = var9.method_1832(var3);

         for (int var8 = 0; var8 < var10.length && !var2.method_28022(); var8++) {
            var2 = method_26092(var0, var1, var2, var10[var8], var3);
         }
      } else {
         int var6 = var1.method_31505();

         for (int var7 = 0; var7 < var6 && !var2.method_28022(); var7++) {
            var2 = method_26092(var0, var1, var2, var7, var3);
         }
      }

      return var2;
   }

   private static boolean method_26095(class_6867 var0, ItemStack var1, int var2, Direction var3) {
      return !var0.method_31500(var2, var1) ? false : !(var0 instanceof class_372) || ((class_372)var0).method_1834(var2, var1, var3);
   }

   private static boolean method_26090(class_6867 var0, ItemStack var1, int var2, Direction var3) {
      return !(var0 instanceof class_372) || ((class_372)var0).method_1833(var2, var1, var3);
   }

   private static ItemStack method_26092(class_6867 var0, class_6867 var1, ItemStack var2, int var3, Direction var4) {
      ItemStack var7 = var1.method_31498(var3);
      if (method_26095(var1, var2, var3, var4)) {
         boolean var8 = false;
         boolean var9 = var1.method_31495();
         if (!var7.method_28022()) {
            if (method_26106(var7, var2)) {
               int var10 = var2.method_28016() - var7.method_27997();
               int var11 = Math.min(var2.method_27997(), var10);
               var2.method_27970(var11);
               var7.method_28030(var11);
               var8 = var11 > 0;
            }
         } else {
            var1.method_31503(var3, var2);
            var2 = ItemStack.EMPTY;
            var8 = true;
         }

         if (var8) {
            if (var9 && var1 instanceof class_5772) {
               class_5772 var13 = (class_5772)var1;
               if (!var13.method_26097()) {
                  byte var14 = 0;
                  if (var0 instanceof class_5772) {
                     class_5772 var12 = (class_5772)var0;
                     if (var13.field_29155 >= var12.field_29155) {
                        var14 = 1;
                     }
                  }

                  var13.method_26089(8 - var14);
               }
            }

            var1.method_17407();
         }
      }

      return var2;
   }

   @Nullable
   private class_6867 method_26104() {
      Direction var3 = this.method_17403().<Direction>method_10313(class_9279.field_47337);
      return method_26108(this.method_17402(), this.field_18358.method_6098(var3));
   }

   @Nullable
   public static class_6867 method_26100(class_4511 var0) {
      return method_26107(var0.method_17402(), var0.method_20973(), var0.method_20974() + 1.0, var0.method_20975());
   }

   public static List<class_91> method_26102(class_4511 var0) {
      return var0.method_20972()
         .method_19492()
         .stream()
         .<class_91>flatMap(
            var1 -> var0.method_17402()
                  .<Entity>method_25869(
                     class_91.class, var1.method_18918(var0.method_20973() - 0.5, var0.method_20974() - 0.5, var0.method_20975() - 0.5), class_3572.field_17481
                  )
                  .stream()
         )
         .collect(Collectors.<class_91>toList());
   }

   @Nullable
   public static class_6867 method_26108(World var0, BlockPos var1) {
      return method_26107(var0, (double)var1.method_12173() + 0.5, (double)var1.method_12165() + 0.5, (double)var1.method_12185() + 0.5);
   }

   @Nullable
   public static class_6867 method_26107(World var0, double var1, double var3, double var5) {
      Object var9 = null;
      BlockPos var10 = new BlockPos(var1, var3, var5);
      class_2522 var11 = var0.method_28262(var10);
      class_6414 var12 = var11.method_8360();
      if (!(var12 instanceof class_8660)) {
         if (var12.method_10802()) {
            class_3757 var13 = var0.method_28260(var10);
            if (var13 instanceof class_6867) {
               var9 = (class_6867)var13;
               if (var9 instanceof class_7099 && var12 instanceof class_6942) {
                  var9 = class_6942.method_31759((class_6942)var12, var11, var0, var10, true);
               }
            }
         }
      } else {
         var9 = ((class_8660)var12).method_39702(var11, var0, var10);
      }

      if (var9 == null) {
         List var14 = var0.method_25867(
            (Entity)null, new Box(var1 - 0.5, var3 - 0.5, var5 - 0.5, var1 + 0.5, var3 + 0.5, var5 + 0.5), class_3572.field_17485
         );
         if (!var14.isEmpty()) {
            var9 = (class_6867)var14.get(var0.field_33033.nextInt(var14.size()));
         }
      }

      return (class_6867)var9;
   }

   private static boolean method_26106(ItemStack var0, ItemStack var1) {
      if (var0.method_27960() == var1.method_27960()) {
         if (var0.method_28026() == var1.method_28026()) {
            return var0.method_27997() <= var0.method_28016() ? ItemStack.method_27956(var0, var1) : false;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Override
   public double method_20973() {
      return (double)this.field_18358.method_12173() + 0.5;
   }

   @Override
   public double method_20974() {
      return (double)this.field_18358.method_12165() + 0.5;
   }

   @Override
   public double method_20975() {
      return (double)this.field_18358.method_12185() + 0.5;
   }

   private void method_26089(int var1) {
      this.field_29158 = var1;
   }

   private boolean method_26087() {
      return this.field_29158 > 0;
   }

   private boolean method_26097() {
      return this.field_29158 > 8;
   }

   @Override
   public class_2831<ItemStack> method_10814() {
      return this.field_29157;
   }

   @Override
   public void method_10813(class_2831<ItemStack> var1) {
      this.field_29157 = var1;
   }

   public void method_26088(Entity var1) {
      if (var1 instanceof class_91) {
         BlockPos var4 = this.method_17399();
         if (class_3370.method_15537(
            class_3370.method_15523(
               var1.method_37241().method_18918((double)(-var4.method_12173()), (double)(-var4.method_12165()), (double)(-var4.method_12185()))
            ),
            this.method_20972(),
            class_8529.field_43655
         )) {
            this.method_26086(() -> method_26105(this, (class_91)var1));
         }
      }
   }

   @Override
   public class_4088 method_38431(int var1, class_7051 var2) {
      return new class_7952(var1, var2, this);
   }
}
