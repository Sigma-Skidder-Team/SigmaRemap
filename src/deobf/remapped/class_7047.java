package remapped;

public class class_7047 {
   private static String[] field_36386;
   private double field_36390;
   private double field_36391;
   private double field_36389;
   public static MinecraftClient field_36392 = MinecraftClient.getInstance();
   public class_8670 field_36387;
   private static class_8571[] field_36388 = new class_8571[]{
      new class_8571(1.0, 0.0, 0.0),
      new class_8571(-1.0, 0.0, 0.0),
      new class_8571(0.0, 0.0, 1.0),
      new class_8571(0.0, 0.0, -1.0),
      new class_8571(0.0, -1.0, 0.0),
      new class_8571(0.0, 1.0, 0.0)
   };

   public class_7047(double var1, double var3, double var5, class_8670 var7) {
      this.method_32358(var1, var3, var5);
      this.field_36387 = var7;
   }

   public class_7047(double var1, double var3, double var5) {
      this.method_32358(var1, var3, var5);
   }

   public class_7047(BlockPos var1) {
      this.method_32358((double)var1.method_12173(), (double)var1.method_12165(), (double)var1.method_12185());
   }

   public void method_32358(double var1, double var3, double var5) {
      this.field_36390 = var1;
      this.field_36391 = var3;
      this.field_36389 = var5;
   }

   public class_7047 method_32359(double var1, double var3, double var5) {
      return new class_7047(this.field_36390 + var1, this.field_36391 + var3, this.field_36389 + var5);
   }

   public void method_32370(float var1) {
      this.field_36390 = (double)var1;
   }

   public void method_32362(float var1) {
      this.field_36391 = (double)var1;
   }

   public void method_32368(float var1) {
      this.field_36389 = (double)var1;
   }

   public double method_32381() {
      return this.field_36390;
   }

   public double method_32375() {
      return this.field_36391;
   }

   public double method_32382() {
      return this.field_36389;
   }

   public class_1343 method_32363() {
      return new class_1343(this.method_32381(), this.method_32375(), this.method_32382()).method_6214(0.5, 0.0, 0.5);
   }

   public double method_32367(class_1343 var1) {
      double var4 = var1.field_7336 - this.method_32381() - 0.5;
      double var6 = var1.field_7334 - this.method_32382() - 0.5;
      return (double)class_9299.method_42842(var4 * var4 + var6 * var6);
   }

   public float method_32373(Entity var1) {
      double var4 = var1.getPosX() - this.method_32381();
      double var6 = var1.method_37309() - this.method_32375();
      double var8 = var1.getPosZ() - this.method_32382();
      return class_9299.method_42842(var4 * var4 + var6 * var6 + var8 * var8);
   }

   public float method_32372(class_7047 var1) {
      double var4 = var1.method_32381() - this.method_32381();
      double var6 = var1.method_32375() - this.method_32375();
      double var8 = var1.method_32382() - this.method_32382();
      return class_9299.method_42842(var4 * var4 + var6 * var6 + var8 * var8);
   }

   public double method_32376(class_7047 var1) {
      double var4 = var1.method_32381() - this.method_32381();
      double var6 = var1.method_32375() - this.method_32375();
      double var8 = var1.method_32382() - this.method_32382();
      return var4 * var4 + var6 * var6 + var8 * var8;
   }

   public class_7047 method_32377(float var1, float var2, float var3) {
      return new class_7047(this.method_32381() + (double)var1, this.method_32375() + (double)var2, this.method_32382() + (double)var3, this.field_36387);
   }

   public double method_32379(class_7047 var1) {
      double var4 = var1.method_32381() - this.method_32381();
      double var6 = var1.method_32375() - this.method_32375();
      double var8 = var1.method_32382() - this.method_32382();
      return Math.abs(var4) + Math.abs(var8) + Math.abs(var6);
   }

   public BlockPos method_32355() {
      return new BlockPos(this.method_32381(), this.method_32375(), this.method_32382());
   }

   public boolean method_32356() {
      if (field_36392.theWorld.method_28262(this.method_32355()).method_8360() == class_4783.field_23811) {
         return false;
      } else if (field_36392.theWorld.method_28262(this.method_32355()).method_8364().method_22001()) {
         return field_36392.theWorld.method_28262(this.method_32355().method_6100()).method_8360() instanceof class_3821
            ? false
            : this.method_32371(this.method_32355()) && this.method_32371(this.method_32355().method_6081());
      } else {
         return false;
      }
   }

   public boolean method_32378() {
      return this.method_32356() && this.method_32371(this.method_32355().method_6082(2));
   }

   public boolean method_32369() {
      return this.method_32378() && this.method_32371(this.method_32355().method_6082(3));
   }

   public boolean method_32380() {
      return this.method_32356() && this.method_32365(this.method_32355().method_6100());
   }

   public static boolean method_32361(BlockPos var0) {
      for (class_8571 var6 : field_36388) {
         class_2522 var7 = field_36392.theWorld.method_28262(var0.method_6103(var6.field_43941, var6.field_43940, var6.field_43942));
         if (var7.method_8360() == class_4783.field_23900 || var7.method_8360() == class_4783.field_23811) {
            return true;
         }
      }

      return false;
   }

   public static boolean method_32366(BlockPos var0) {
      for (class_8571 var6 : field_36388) {
         class_2522 var7 = field_36392.theWorld.method_28262(var0.method_6103(var6.field_43941, var6.field_43940, var6.field_43942));
         if (var7.method_8345()) {
            return false;
         }
      }

      return true;
   }

   public boolean method_32360() {
      for (class_8571 var6 : field_36388) {
         class_2522 var7 = field_36392.theWorld.method_28262(this.method_32355().method_6103(var6.field_43941, var6.field_43940, var6.field_43942));
         if (var7.method_8360() == class_4783.field_23900 || var7.method_8360() == class_4783.field_23811) {
            return true;
         }
      }

      for (class_8571 var11 : field_36388) {
         class_2522 var12 = field_36392.theWorld.method_28262(this.method_32355().method_6103(var11.field_43941, var11.field_43940 + 1.0, var11.field_43942));
         if (var12.method_8360() == class_4783.field_23900 || var12.method_8360() == class_4783.field_23811) {
            return true;
         }
      }

      return field_36392.theWorld.method_28262(this.method_32355().method_6082(2)).method_8360() instanceof class_305
         && !this.field_36387.field_44466.contains(this.method_32355().method_6082(2).method_6077());
   }

   public boolean method_32357() {
      return this.method_32360()
         || field_36392.theWorld.method_28262(this.method_32355()).method_8360() == class_4783.field_23433
         || field_36392.theWorld.method_28262(this.method_32355().method_6081()).method_8360() == class_4783.field_23433;
   }

   public boolean method_32371(BlockPos var1) {
      return !this.field_36387.field_44466.contains(var1.method_6077())
         ? MinecraftClient.getInstance().theWorld.method_28262(var1).method_8324(field_36392.theWorld, var1).method_19485()
         : true;
   }

   public boolean method_32364() {
      return this.method_32365(this.method_32355());
   }

   public boolean method_32365(BlockPos var1) {
      if (!this.field_36387.field_44466.contains(this.method_32355().method_6077())) {
         class_4190 var4 = MinecraftClient.getInstance().theWorld.method_28262(var1).method_8324(field_36392.theWorld, var1);
         if (var4.method_19485()) {
            return false;
         } else {
            Box var5 = var4.method_19483();
            return var5.method_18901() >= 0.9 && var5.method_18901() <= 1.0;
         }
      } else {
         return false;
      }
   }
}
