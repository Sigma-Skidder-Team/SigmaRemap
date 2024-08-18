package remapped;

import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_4816 extends class_2358 implements class_372, class_3745 {
   private static final int[] field_24077 = IntStream.range(0, 27).toArray();
   private class_2831<ItemStack> field_24083 = class_2831.<ItemStack>method_12872(27, ItemStack.EMPTY);
   private int field_24080;
   private class_3639 field_24084 = class_3639.field_17758;
   private float field_24081;
   private float field_24078;
   private class_9077 field_24076;
   private boolean field_24082;

   public class_4816(class_9077 var1) {
      super(class_133.field_378);
      this.field_24076 = var1;
   }

   public class_4816() {
      this((class_9077)null);
      this.field_24082 = true;
   }

   @Override
   public void method_17353() {
      this.method_22197();
      if (this.field_24084 == class_3639.field_17753 || this.field_24084 == class_3639.field_17754) {
         this.method_22201();
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void method_22197() {
      this.field_24078 = this.field_24081;
      switch (this.field_24084) {
         case field_17758:
            this.field_24081 = 0.0F;
            break;
         case field_17753:
            this.field_24081 += 0.1F;
            if (this.field_24081 >= 1.0F) {
               this.method_22201();
               this.field_24084 = class_3639.field_17756;
               this.field_24081 = 1.0F;
               this.method_22196();
            }
            break;
         case field_17754:
            this.field_24081 -= 0.1F;
            if (this.field_24081 <= 0.0F) {
               this.field_24084 = class_3639.field_17758;
               this.field_24081 = 0.0F;
               this.method_22196();
            }
            break;
         case field_17756:
            this.field_24081 = 1.0F;
      }
   }

   public class_3639 method_22203() {
      return this.field_24084;
   }

   public Box method_22195(class_2522 var1) {
      return this.method_22194(var1.<Direction>method_10313(class_3153.field_15681));
   }

   public Box method_22194(Direction var1) {
      float var4 = this.method_22199(1.0F);
      return class_3370.method_15524()
         .method_19483()
         .method_18928(
            (double)(0.5F * var4 * (float)var1.method_1041()),
            (double)(0.5F * var4 * (float)var1.method_1054()),
            (double)(0.5F * var4 * (float)var1.method_1034())
         );
   }

   private Box method_22193(Direction var1) {
      Direction var4 = var1.method_1046();
      return this.method_22194(var1).method_18900((double)var4.method_1041(), (double)var4.method_1054(), (double)var4.method_1034());
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void method_22201() {
      class_2522 var3 = this.field_18364.method_28262(this.method_17399());
      if (var3.method_8360() instanceof class_3153) {
         Direction var4 = var3.<Direction>method_10313(class_3153.field_15681);
         Box var5 = this.method_22193(var4).method_18919(this.field_18358);
         List var6 = this.field_18364.method_25870((Entity)null, var5);
         if (!var6.isEmpty()) {
            for (int var7 = 0; var7 < var6.size(); var7++) {
               Entity var8 = (Entity)var6.get(var7);
               if (var8.method_37132() != class_718.field_3914) {
                  double var9 = 0.0;
                  double var11 = 0.0;
                  double var13 = 0.0;
                  Box var15 = var8.getBoundingBox();
                  switch (var4.method_1029()) {
                     case field_47215:
                        if (var4.method_1049() == class_137.field_405) {
                           var9 = var5.field_19940 - var15.field_19941;
                        } else {
                           var9 = var15.field_19940 - var5.field_19941;
                        }

                        var9 += 0.01;
                        break;
                     case field_47216:
                        if (var4.method_1049() == class_137.field_405) {
                           var11 = var5.field_19939 - var15.field_19937;
                        } else {
                           var11 = var15.field_19939 - var5.field_19937;
                        }

                        var11 += 0.01;
                        break;
                     case field_47219:
                        if (var4.method_1049() == class_137.field_405) {
                           var13 = var5.field_19942 - var15.field_19938;
                        } else {
                           var13 = var15.field_19942 - var5.field_19938;
                        }

                        var13 += 0.01;
                  }

                  var8.method_37226(
                     class_7412.field_37837,
                     new Vector3d(var9 * (double)var4.method_1041(), var11 * (double)var4.method_1054(), var13 * (double)var4.method_1034())
                  );
               }
            }
         }
      }
   }

   @Override
   public int method_31505() {
      return this.field_24083.size();
   }

   @Override
   public boolean method_17408(int var1, int var2) {
      if (var1 != 1) {
         return super.method_17408(var1, var2);
      } else {
         this.field_24080 = var2;
         if (var2 == 0) {
            this.field_24084 = class_3639.field_17754;
            this.method_22196();
         }

         if (var2 == 1) {
            this.field_24084 = class_3639.field_17753;
            this.method_22196();
         }

         return true;
      }
   }

   private void method_22196() {
      this.method_17403().method_8367(this.method_17402(), this.method_17399(), 3);
   }

   @Override
   public void method_31501(PlayerEntity var1) {
      if (!var1.method_37221()) {
         if (this.field_24080 < 0) {
            this.field_24080 = 0;
         }

         this.field_24080++;
         this.field_18364.method_29521(this.field_18358, this.method_17403().method_8360(), 1, this.field_24080);
         if (this.field_24080 == 1) {
            this.field_18364
               .method_43359(
                  (PlayerEntity)null, this.field_18358, SoundEvents.field_2347, class_562.field_3322, 0.5F, this.field_18364.field_33033.nextFloat() * 0.1F + 0.9F
               );
         }
      }
   }

   @Override
   public void method_31499(PlayerEntity var1) {
      if (!var1.method_37221()) {
         this.field_24080--;
         this.field_18364.method_29521(this.field_18358, this.method_17403().method_8360(), 1, this.field_24080);
         if (this.field_24080 <= 0) {
            this.field_18364
               .method_43359(
                  (PlayerEntity)null, this.field_18358, SoundEvents.field_2287, class_562.field_3322, 0.5F, this.field_18364.field_33033.nextFloat() * 0.1F + 0.9F
               );
         }
      }
   }

   @Override
   public ITextComponent method_38433() {
      return new TranslationTextComponent("container.shulkerBox");
   }

   @Override
   public void method_17394(class_2522 var1, CompoundNBT var2) {
      super.method_17394(var1, var2);
      this.method_22198(var2);
   }

   @Override
   public CompoundNBT method_17396(CompoundNBT var1) {
      super.method_17396(var1);
      return this.method_22202(var1);
   }

   public void method_22198(CompoundNBT var1) {
      this.field_24083 = class_2831.<ItemStack>method_12872(this.method_31505(), ItemStack.EMPTY);
      if (!this.method_10811(var1) && var1.contains("Items", 9)) {
         class_3037.method_13882(var1, this.field_24083);
      }
   }

   public CompoundNBT method_22202(CompoundNBT var1) {
      if (!this.method_10815(var1)) {
         class_3037.method_13879(var1, this.field_24083, false);
      }

      return var1;
   }

   @Override
   public class_2831<ItemStack> method_10814() {
      return this.field_24083;
   }

   @Override
   public void method_10813(class_2831<ItemStack> var1) {
      this.field_24083 = var1;
   }

   @Override
   public int[] method_1832(Direction var1) {
      return field_24077;
   }

   @Override
   public boolean method_1834(int var1, ItemStack var2, Direction var3) {
      return !(class_6414.method_29269(var2.method_27960()) instanceof class_3153);
   }

   @Override
   public boolean method_1833(int var1, ItemStack var2, Direction var3) {
      return true;
   }

   public float method_22199(float var1) {
      return MathHelper.lerp(var1, this.field_24078, this.field_24081);
   }

   @Nullable
   public class_9077 method_22192() {
      if (this.field_24082) {
         this.field_24076 = class_3153.method_14551(this.method_17403().method_8360());
         this.field_24082 = false;
      }

      return this.field_24076;
   }

   @Override
   public class_4088 method_38431(int var1, class_7051 var2) {
      return new class_5104(var1, var2, this);
   }

   public boolean method_22200() {
      return this.field_24084 == class_3639.field_17758;
   }
}
