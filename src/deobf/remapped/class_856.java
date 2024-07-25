package remapped;

import java.util.Random;

public class class_856 implements class_6491 {
   private final class_9524 field_4456;
   private final class_2174 field_4455;
   private final class_212 field_4452;
   private final Random field_4454 = new Random();
   private final class_4468 field_4453;

   public class_856(class_9524 var1, class_4468 var2) {
      this.field_4456 = var1;
      this.field_4453 = var2;
      if (!class_7860.field_39870.method_22501()) {
         this.field_4455 = new class_2174(this.field_4453);
      } else {
         this.field_4455 = (class_2174)class_7860.method_35574(class_7860.field_39870, this.field_4453);
      }

      this.field_4452 = new class_212();
   }

   public class_9524 method_3716() {
      return this.field_4456;
   }

   public void method_3711(class_2522 var1, BlockPos var2, class_5561 var3, class_7966 var4, class_7907 var5) {
      this.method_3712(var1, var2, var3, var4, var5, class_6652.field_34420);
   }

   public void method_3712(class_2522 var1, BlockPos var2, class_5561 var3, class_7966 var4, class_7907 var5, class_1488 var6) {
      if (var1.method_8352() == class_7537.field_38469) {
         class_7373 var9 = this.field_4456.method_43946(var1);
         long var10 = var1.method_8371(var2);
         this.field_4455.method_10104(var3, var9, var1, var2, var4, var5, true, this.field_4454, var10, class_5367.field_27381, var6);
      }
   }

   public boolean method_3719(class_2522 var1, BlockPos var2, class_5561 var3, class_7966 var4, class_7907 var5, boolean var6, Random var7) {
      return this.method_3720(var1, var2, var3, var4, var5, var6, var7, class_6652.field_34420);
   }

   public boolean method_3720(class_2522 var1, BlockPos var2, class_5561 var3, class_7966 var4, class_7907 var5, boolean var6, Random var7, class_1488 var8) {
      try {
         class_7537 var11 = var1.method_8352();
         return var11 != class_7537.field_38469
            ? false
            : this.field_4455
               .method_10104(var3, this.method_3715(var1), var1, var2, var4, var5, var6, var7, var1.method_8371(var2), class_5367.field_27381, var8);
      } catch (Throwable var14) {
         class_159 var12 = class_159.method_643(var14, "Tesselating block in world");
         class_6544 var13 = var12.method_639("Block being tesselated");
         class_6544.method_29843(var13, var2, var1);
         throw new class_3297(var12);
      }
   }

   public boolean method_3721(BlockPos var1, class_5561 var2, class_7907 var3, class_4774 var4) {
      try {
         return this.field_4452.method_905(var2, var1, var3, var4);
      } catch (Throwable var10) {
         class_159 var8 = class_159.method_643(var10, "Tesselating liquid in world");
         class_6544 var9 = var8.method_639("Block being tesselated");
         class_6544.method_29843(var9, var1, (class_2522)null);
         throw new class_3297(var8);
      }
   }

   public class_2174 method_3717() {
      return this.field_4455;
   }

   public class_7373 method_3715(class_2522 var1) {
      return this.field_4456.method_43946(var1);
   }

   public void method_3713(class_2522 var1, class_7966 var2, class_2565 var3, int var4, int var5) {
      this.method_3714(var1, var2, var3, var4, var5, class_6652.field_34420);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void method_3714(class_2522 var1, class_7966 var2, class_2565 var3, int var4, int var5, class_1488 var6) {
      class_7537 var9 = var1.method_8352();
      if (var9 != class_7537.field_38470) {
         switch (var9) {
            case field_38469:
               class_7373 var10 = this.method_3715(var1);
               int var11 = this.field_4453.method_20749(var1, (class_5561)null, (BlockPos)null, 0);
               float var12 = (float)(var11 >> 16 & 0xFF) / 255.0F;
               float var13 = (float)(var11 >> 8 & 0xFF) / 255.0F;
               float var14 = (float)(var11 & 0xFF) / 255.0F;
               this.field_4455
                  .method_10105(
                     var2.method_36058(), var3.method_11645(class_6416.method_29327(var1, false)), var1, var10, var12, var13, var14, var4, var5, var6
                  );
               break;
            case field_38467:
               if (class_7860.field_39949.method_3596()) {
                  ItemStack var15 = new ItemStack(var1.method_8360());
                  class_9762 var16 = (class_9762)class_7860.method_35555(var15.method_27960(), class_7860.field_39949);
                  var16.method_45049(var15, class_5612.field_28494, var2, var3, var4, var5);
               } else {
                  class_9762.field_49579.method_45049(new ItemStack(var1.method_8360()), class_5612.field_28494, var2, var3, var4, var5);
               }
         }
      }
   }

   @Override
   public void method_29609(class_7832 var1) {
      this.field_4452.method_896();
   }

   public class_2645 method_3718() {
      return class_2310.field_11561;
   }
}
