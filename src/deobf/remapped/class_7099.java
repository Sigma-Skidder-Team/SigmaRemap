package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_7099 extends class_2358 implements class_3848, class_3745 {
   private class_2831<ItemStack> field_36619 = class_2831.<ItemStack>method_12872(27, ItemStack.EMPTY);
   public float field_36616;
   public float field_36618;
   public int field_36620;
   private int field_36615;

   public class_7099(class_133<?> var1) {
      super(var1);
   }

   public class_7099() {
      this(class_133.field_361);
   }

   @Override
   public int method_31505() {
      return 27;
   }

   @Override
   public ITextComponent method_38433() {
      return new TranslationTextComponent("container.chest");
   }

   @Override
   public void method_17394(class_2522 var1, CompoundNBT var2) {
      super.method_17394(var1, var2);
      this.field_36619 = class_2831.<ItemStack>method_12872(this.method_31505(), ItemStack.EMPTY);
      if (!this.method_10811(var2)) {
         class_3037.method_13882(var2, this.field_36619);
      }
   }

   @Override
   public CompoundNBT method_17396(CompoundNBT var1) {
      super.method_17396(var1);
      if (!this.method_10815(var1)) {
         class_3037.method_13878(var1, this.field_36619);
      }

      return var1;
   }

   @Override
   public void method_17353() {
      int var3 = this.field_18358.method_12173();
      int var4 = this.field_18358.method_12165();
      int var5 = this.field_18358.method_12185();
      this.field_36615++;
      this.field_36620 = method_32631(this.field_18364, this, this.field_36615, var3, var4, var5, this.field_36620);
      this.field_36618 = this.field_36616;
      float var6 = 0.1F;
      if (this.field_36620 > 0 && this.field_36616 == 0.0F) {
         this.method_32634(class_463.field_2528);
      }

      if (this.field_36620 == 0 && this.field_36616 > 0.0F || this.field_36620 > 0 && this.field_36616 < 1.0F) {
         float var7 = this.field_36616;
         if (this.field_36620 <= 0) {
            this.field_36616 -= 0.1F;
         } else {
            this.field_36616 += 0.1F;
         }

         if (this.field_36616 > 1.0F) {
            this.field_36616 = 1.0F;
         }

         float var8 = 0.5F;
         if (this.field_36616 < 0.5F && var7 >= 0.5F) {
            this.method_32634(class_463.field_2254);
         }

         if (this.field_36616 < 0.0F) {
            this.field_36616 = 0.0F;
         }
      }
   }

   public static int method_32631(World var0, class_8346 var1, int var2, int var3, int var4, int var5, int var6) {
      if (!var0.field_33055 && var6 != 0 && (var2 + var3 + var4 + var5) % 200 == 0) {
         var6 = method_32633(var0, var1, var3, var4, var5);
      }

      return var6;
   }

   public static int method_32633(World var0, class_8346 var1, int var2, int var3, int var4) {
      int var7 = 0;
      float var8 = 5.0F;

      for (class_704 var10 : var0.<class_704>method_25868(
         class_704.class,
         new Box(
            (double)((float)var2 - 5.0F),
            (double)((float)var3 - 5.0F),
            (double)((float)var4 - 5.0F),
            (double)((float)(var2 + 1) + 5.0F),
            (double)((float)(var3 + 1) + 5.0F),
            (double)((float)(var4 + 1) + 5.0F)
         )
      )) {
         if (var10.field_3874 instanceof class_1465) {
            class_6867 var11 = ((class_1465)var10.field_3874).method_6778();
            if (var11 == var1 || var11 instanceof class_8236 && ((class_8236)var11).method_37721(var1)) {
               var7++;
            }
         }
      }

      return var7;
   }

   private void method_32634(class_8461 var1) {
      class_9264 var4 = this.method_17403().<class_9264>method_10313(class_6942.field_35695);
      if (var4 != class_9264.field_47279) {
         double var5 = (double)this.field_18358.method_12173() + 0.5;
         double var7 = (double)this.field_18358.method_12165() + 0.5;
         double var9 = (double)this.field_18358.method_12185() + 0.5;
         if (var4 == class_9264.field_47277) {
            Direction var11 = class_6942.method_31758(this.method_17403());
            var5 += (double)var11.method_1041() * 0.5;
            var9 += (double)var11.method_1034() * 0.5;
         }

         this.field_18364
            .method_29528((class_704)null, var5, var7, var9, var1, class_562.field_3322, 0.5F, this.field_18364.field_33033.nextFloat() * 0.1F + 0.9F);
      }
   }

   @Override
   public boolean method_17408(int var1, int var2) {
      if (var1 != 1) {
         return super.method_17408(var1, var2);
      } else {
         this.field_36620 = var2;
         return true;
      }
   }

   @Override
   public void method_31501(class_704 var1) {
      if (!var1.method_37221()) {
         if (this.field_36620 < 0) {
            this.field_36620 = 0;
         }

         this.field_36620++;
         this.method_32636();
      }
   }

   @Override
   public void method_31499(class_704 var1) {
      if (!var1.method_37221()) {
         this.field_36620--;
         this.method_32636();
      }
   }

   public void method_32636() {
      class_6414 var3 = this.method_17403().method_8360();
      if (var3 instanceof class_6942) {
         this.field_18364.method_29521(this.field_18358, var3, 1, this.field_36620);
         this.field_18364.method_29563(this.field_18358, var3);
      }
   }

   @Override
   public class_2831<ItemStack> method_10814() {
      return this.field_36619;
   }

   @Override
   public void method_10813(class_2831<ItemStack> var1) {
      this.field_36619 = var1;
   }

   @Override
   public float method_17874(float var1) {
      return class_9299.method_42795(var1, this.field_36618, this.field_36616);
   }

   public static int method_32635(class_6163 var0, BlockPos var1) {
      class_2522 var4 = var0.method_28262(var1);
      if (var4.method_8360().method_10802()) {
         class_3757 var5 = var0.method_28260(var1);
         if (var5 instanceof class_7099) {
            return ((class_7099)var5).field_36620;
         }
      }

      return 0;
   }

   public static void method_32632(class_7099 var0, class_7099 var1) {
      class_2831 var4 = var0.method_10814();
      var0.method_10813(var1.method_10814());
      var1.method_10813(var4);
   }

   @Override
   public class_4088 method_38431(int var1, class_7051 var2) {
      return class_1465.method_6776(var1, var2, this);
   }
}
