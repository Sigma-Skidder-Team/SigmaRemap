package remapped;

public class class_9180 extends class_3757 implements class_3848, class_3745 {
   private static String[] field_46972;
   public float field_46971;
   public float field_46970;
   public int field_46974;
   private int field_46973;

   public class_9180() {
      super(class_133.field_371);
   }

   @Override
   public void method_17353() {
      if (++this.field_46973 % 20 * 4 == 0) {
         this.field_18364.method_29521(this.field_18358, class_4783.field_23492, 1, this.field_46974);
      }

      this.field_46970 = this.field_46971;
      int var3 = this.field_18358.getX();
      int var4 = this.field_18358.method_12165();
      int var5 = this.field_18358.method_12185();
      float var6 = 0.1F;
      if (this.field_46974 > 0 && this.field_46971 == 0.0F) {
         double var7 = (double)var3 + 0.5;
         double var9 = (double)var5 + 0.5;
         this.field_18364
            .method_29528(
               (PlayerEntity)null,
               var7,
               (double)var4 + 0.5,
               var9,
               SoundEvents.field_2730,
               class_562.field_3322,
               0.5F,
               this.field_18364.field_33033.nextFloat() * 0.1F + 0.9F
            );
      }

      if (this.field_46974 == 0 && this.field_46971 > 0.0F || this.field_46974 > 0 && this.field_46971 < 1.0F) {
         float var11 = this.field_46971;
         if (this.field_46974 <= 0) {
            this.field_46971 -= 0.1F;
         } else {
            this.field_46971 += 0.1F;
         }

         if (this.field_46971 > 1.0F) {
            this.field_46971 = 1.0F;
         }

         float var12 = 0.5F;
         if (this.field_46971 < 0.5F && var11 >= 0.5F) {
            double var15 = (double)var3 + 0.5;
            double var13 = (double)var5 + 0.5;
            this.field_18364
               .method_29528(
                  (PlayerEntity)null,
                  var15,
                  (double)var4 + 0.5,
                  var13,
                  SoundEvents.field_2185,
                  class_562.field_3322,
                  0.5F,
                  this.field_18364.field_33033.nextFloat() * 0.1F + 0.9F
               );
         }

         if (this.field_46971 < 0.0F) {
            this.field_46971 = 0.0F;
         }
      }
   }

   @Override
   public boolean method_17408(int var1, int var2) {
      if (var1 != 1) {
         return super.method_17408(var1, var2);
      } else {
         this.field_46974 = var2;
         return true;
      }
   }

   @Override
   public void method_17406() {
      this.method_17400();
      super.method_17406();
   }

   public void method_42315() {
      this.field_46974++;
      this.field_18364.method_29521(this.field_18358, class_4783.field_23492, 1, this.field_46974);
   }

   public void method_42316() {
      this.field_46974--;
      this.field_18364.method_29521(this.field_18358, class_4783.field_23492, 1, this.field_46974);
   }

   public boolean method_42317(PlayerEntity var1) {
      return this.field_18364.method_28260(this.field_18358) == this
         ? !(
            var1.method_37273(
                  (double)this.field_18358.getX() + 0.5, (double)this.field_18358.method_12165() + 0.5, (double)this.field_18358.method_12185() + 0.5
               )
               > 64.0
         )
         : false;
   }

   @Override
   public float method_17874(float var1) {
      return MathHelper.method_42795(var1, this.field_46970, this.field_46971);
   }
}
