package remapped;

import java.util.Random;

public class class_2667 extends class_1173 {
   private int field_13118;
   private boolean field_13119;

   public class_2667(class_6629<? extends class_2667> var1, World var2) {
      super(var1, var2);
      this.field_29915 = 3;
   }

   @Override
   public void method_26851() {
      this.field_29916.method_3485(1, new class_787(this));
      this.field_29916.method_3485(2, new class_9037(this, 1.0, false));
      this.field_29916.method_3485(3, new class_2889(this, 1.0));
      this.field_29916.method_3485(7, new class_4407(this, class_704.class, 8.0F));
      this.field_29916.method_3485(8, new class_9691(this));
      this.field_29908.method_3485(1, new class_8420(this).method_38757());
      this.field_29908.method_3485(2, new class_4138<class_704>(this, class_704.class, true));
   }

   @Override
   public float method_26425(class_7653 var1, class_6097 var2) {
      return 0.13F;
   }

   public static class_1313 method_12023() {
      return class_1173.method_5201()
         .method_5984(class_7331.field_37468, 8.0)
         .method_5984(class_7331.field_37465, 0.25)
         .method_5984(class_7331.field_37462, 2.0);
   }

   @Override
   public boolean method_37126() {
      return false;
   }

   @Override
   public class_8461 method_26918() {
      return class_463.field_2844;
   }

   @Override
   public class_8461 method_26541(class_6199 var1) {
      return class_463.field_2324;
   }

   @Override
   public class_8461 method_26599() {
      return class_463.field_2756;
   }

   @Override
   public void method_37207(class_1331 var1, class_2522 var2) {
      this.method_37155(class_463.field_2103, 0.15F, 1.0F);
   }

   @Override
   public void method_37314(CompoundNBT var1) {
      super.method_37314(var1);
      this.field_13118 = var1.method_25947("Lifetime");
      this.field_13119 = var1.getBoolean("PlayerSpawned");
   }

   @Override
   public void method_37376(CompoundNBT var1) {
      super.method_37376(var1);
      var1.method_25931("Lifetime", this.field_13118);
      var1.putBoolean("PlayerSpawned", this.field_13119);
   }

   @Override
   public void method_37123() {
      this.field_29605 = this.field_41701;
      super.method_37123();
   }

   @Override
   public void method_37090(float var1) {
      this.field_41701 = var1;
      super.method_37090(var1);
   }

   @Override
   public double method_37106() {
      return 0.1;
   }

   public boolean method_12022() {
      return this.field_13119;
   }

   public void method_12025(boolean var1) {
      this.field_13119 = var1;
   }

   @Override
   public void method_26606() {
      super.method_26606();
      if (!this.field_41768.field_33055) {
         if (!this.method_26925()) {
            this.field_13118++;
         }

         if (this.field_13118 >= 2400) {
            this.method_37204();
         }
      } else {
         for (int var3 = 0; var3 < 2; var3++) {
            this.field_41768
               .method_43361(
                  class_3090.field_15356,
                  this.method_37361(0.5),
                  this.method_37255(),
                  this.method_37383(0.5),
                  (this.field_41717.nextDouble() - 0.5) * 2.0,
                  -this.field_41717.nextDouble(),
                  (this.field_41717.nextDouble() - 0.5) * 2.0
               );
         }
      }
   }

   public static boolean method_12024(class_6629<class_2667> var0, class_9379 var1, class_2417 var2, class_1331 var3, Random var4) {
      if (!method_5198(var0, var1, var2, var3, var4)) {
         return false;
      } else {
         class_704 var7 = var1.method_25857((double)var3.method_12173() + 0.5, (double)var3.method_12165() + 0.5, (double)var3.method_12185() + 0.5, 5.0, true);
         return var7 == null;
      }
   }

   @Override
   public class_2780 method_26550() {
      return class_2780.field_13575;
   }
}
