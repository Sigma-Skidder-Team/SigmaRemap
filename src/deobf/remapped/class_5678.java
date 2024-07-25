package remapped;

import java.util.Arrays;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_5678 extends class_8346 implements class_372, class_3745 {
   private static final int[] field_28778 = new int[]{3};
   private static final int[] field_28782 = new int[]{0, 1, 2, 3};
   private static final int[] field_28781 = new int[]{0, 1, 2, 4};
   private class_2831<ItemStack> field_28776 = class_2831.<ItemStack>method_12872(5, ItemStack.EMPTY);
   private int field_28779;
   private boolean[] field_28783;
   private class_2451 field_28780;
   private int field_28775;
   public final class_6844 field_28774 = new class_6880(this);

   public class_5678() {
      super(class_133.field_351);
   }

   @Override
   public ITextComponent method_38433() {
      return new TranslationTextComponent("container.brewing");
   }

   @Override
   public int method_31505() {
      return this.field_28776.size();
   }

   @Override
   public boolean method_31495() {
      for (ItemStack var4 : this.field_28776) {
         if (!var4.method_28022()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void method_17353() {
      ItemStack var3 = this.field_28776.get(4);
      if (this.field_28775 <= 0 && var3.method_27960() == class_4897.field_24348) {
         this.field_28775 = 20;
         var3.method_27970(1);
         this.method_17407();
      }

      boolean var4 = this.method_25684();
      boolean var5 = this.field_28779 > 0;
      ItemStack var6 = this.field_28776.get(3);
      if (!var5) {
         if (var4 && this.field_28775 > 0) {
            this.field_28775--;
            this.field_28779 = 400;
            this.field_28780 = var6.method_27960();
            this.method_17407();
         }
      } else {
         this.field_28779--;
         boolean var7 = this.field_28779 == 0;
         if (var7 && var4) {
            this.method_25682();
            this.method_17407();
         } else if (var4) {
            if (this.field_28780 != var6.method_27960()) {
               this.field_28779 = 0;
               this.method_17407();
            }
         } else {
            this.field_28779 = 0;
            this.method_17407();
         }
      }

      if (!this.field_18364.field_33055) {
         boolean[] var10 = this.method_25679();
         if (!Arrays.equals(var10, this.field_28783)) {
            this.field_28783 = var10;
            class_2522 var8 = this.field_18364.method_28262(this.method_17399());
            if (!(var8.method_8360() instanceof class_6050)) {
               return;
            }

            for (int var9 = 0; var9 < class_6050.field_30943.length; var9++) {
               var8 = var8.method_10308(class_6050.field_30943[var9], Boolean.valueOf(var10[var9]));
            }

            this.field_18364.method_7513(this.field_18358, var8, 2);
         }
      }
   }

   public boolean[] method_25679() {
      boolean[] var3 = new boolean[3];

      for (int var4 = 0; var4 < 3; var4++) {
         if (!this.field_28776.get(var4).method_28022()) {
            var3[var4] = true;
         }
      }

      return var3;
   }

   private boolean method_25684() {
      ItemStack var3 = this.field_28776.get(3);
      if (!var3.method_28022()) {
         if (class_1387.method_6428(var3)) {
            for (int var4 = 0; var4 < 3; var4++) {
               ItemStack var5 = this.field_28776.get(var4);
               if (!var5.method_28022() && class_1387.method_6426(var5, var3)) {
                  return true;
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

   private void method_25682() {
      ItemStack var3 = this.field_28776.get(3);

      for (int var4 = 0; var4 < 3; var4++) {
         this.field_28776.set(var4, class_1387.method_6422(var3, this.field_28776.get(var4)));
      }

      var3.method_27970(1);
      BlockPos var6 = this.method_17399();
      if (var3.method_27960().method_11232()) {
         ItemStack var5 = new ItemStack(var3.method_27960().method_11241());
         if (!var3.method_28022()) {
            if (!this.field_18364.field_33055) {
               class_1573.method_7100(this.field_18364, (double)var6.method_12173(), (double)var6.method_12165(), (double)var6.method_12185(), var5);
            }
         } else {
            var3 = var5;
         }
      }

      this.field_28776.set(3, var3);
      this.field_18364.method_43364(1035, var6, 0);
   }

   @Override
   public void method_17394(class_2522 var1, CompoundNBT var2) {
      super.method_17394(var1, var2);
      this.field_28776 = class_2831.<ItemStack>method_12872(this.method_31505(), ItemStack.EMPTY);
      class_3037.method_13882(var2, this.field_28776);
      this.field_28779 = var2.method_25956("BrewTime");
      this.field_28775 = var2.method_25950("Fuel");
   }

   @Override
   public CompoundNBT method_17396(CompoundNBT var1) {
      super.method_17396(var1);
      var1.method_25958("BrewTime", (short)this.field_28779);
      class_3037.method_13878(var1, this.field_28776);
      var1.method_25921("Fuel", (byte)this.field_28775);
      return var1;
   }

   @Override
   public ItemStack method_31498(int var1) {
      return var1 >= 0 && var1 < this.field_28776.size() ? this.field_28776.get(var1) : ItemStack.EMPTY;
   }

   @Override
   public ItemStack method_31497(int var1, int var2) {
      return class_3037.method_13881(this.field_28776, var1, var2);
   }

   @Override
   public ItemStack method_31507(int var1) {
      return class_3037.method_13880(this.field_28776, var1);
   }

   @Override
   public void method_31503(int var1, ItemStack var2) {
      if (var1 >= 0 && var1 < this.field_28776.size()) {
         this.field_28776.set(var1, var2);
      }
   }

   @Override
   public boolean method_31502(class_704 var1) {
      return this.field_18364.method_28260(this.field_18358) == this
         ? !(
            var1.method_37273(
                  (double)this.field_18358.method_12173() + 0.5, (double)this.field_18358.method_12165() + 0.5, (double)this.field_18358.method_12185() + 0.5
               )
               > 64.0
         )
         : false;
   }

   @Override
   public boolean method_31500(int var1, ItemStack var2) {
      if (var1 != 3) {
         class_2451 var5 = var2.method_27960();
         return var1 == 4
            ? var5 == class_4897.field_24348
            : (var5 == class_4897.field_25157 || var5 == class_4897.field_25226 || var5 == class_4897.field_24444 || var5 == class_4897.field_24812)
               && this.method_31498(var1).method_28022();
      } else {
         return class_1387.method_6428(var2);
      }
   }

   @Override
   public int[] method_1832(Direction var1) {
      if (var1 != Direction.field_817) {
         return var1 != Direction.field_802 ? field_28781 : field_28782;
      } else {
         return field_28778;
      }
   }

   @Override
   public boolean method_1834(int var1, ItemStack var2, Direction var3) {
      return this.method_31500(var1, var2);
   }

   @Override
   public boolean method_1833(int var1, ItemStack var2, Direction var3) {
      return var1 != 3 ? true : var2.method_27960() == class_4897.field_24812;
   }

   @Override
   public void method_24975() {
      this.field_28776.clear();
   }

   @Override
   public class_4088 method_38431(int var1, class_7051 var2) {
      return new class_9449(var1, var2, this, this.field_28774);
   }
}
