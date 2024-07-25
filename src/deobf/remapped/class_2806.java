package remapped;

public class class_2806 extends class_1173 {
   private static String[] field_13772;
   private float field_13774 = 0.5F;
   private int field_13771;
   private static final class_7821<Byte> field_13773 = class_8073.<Byte>method_36641(class_2806.class, class_2734.field_13361);

   public class_2806(EntityType<? extends class_2806> var1, World var2) {
      super(var1, var2);
      this.method_26895(class_1108.field_6359, -1.0F);
      this.method_26895(class_1108.field_6360, 8.0F);
      this.method_26895(class_1108.field_6357, 0.0F);
      this.method_26895(class_1108.field_6352, 0.0F);
      this.field_29915 = 10;
   }

   @Override
   public void registerGoals() {
      this.field_29916.method_3485(4, new class_666(this));
      this.field_29916.method_3485(5, new class_3537(this, 1.0));
      this.field_29916.method_3485(7, new class_2889(this, 1.0, 0.0F));
      this.field_29916.method_3485(8, new class_4407(this, class_704.class, 8.0F));
      this.field_29916.method_3485(8, new class_9691(this));
      this.field_29908.method_3485(1, new class_8420(this).method_38757());
      this.field_29908.method_3485(2, new class_4138<class_704>(this, class_704.class, true));
   }

   public static class_1313 method_12757() {
      return class_1173.method_5201()
         .method_5984(class_7331.field_37462, 6.0)
         .method_5984(class_7331.field_37465, 0.23F)
         .method_5984(class_7331.field_37471, 48.0);
   }

   @Override
   public void method_37329() {
      super.method_37329();
      this.field_41735.method_36634(field_13773, (byte)0);
   }

   @Override
   public class_8461 method_26918() {
      return class_463.field_2105;
   }

   @Override
   public class_8461 method_26541(DamageSource var1) {
      return class_463.field_2725;
   }

   @Override
   public class_8461 method_26599() {
      return class_463.field_2572;
   }

   @Override
   public float method_37193() {
      return 1.0F;
   }

   @Override
   public void method_26606() {
      if (!this.onGround && this.method_37098().field_7333 < 0.0) {
         this.method_37215(this.method_37098().method_6210(1.0, 0.6, 1.0));
      }

      if (this.world.field_33055) {
         if (this.field_41717.nextInt(24) == 0 && !this.method_37378()) {
            this.world
               .method_29527(
                  this.getPosX() + 0.5,
                  this.method_37309() + 0.5,
                  this.getPosZ() + 0.5,
                  class_463.field_2019,
                  this.method_37197(),
                  1.0F + this.field_41717.nextFloat(),
                  this.field_41717.nextFloat() * 0.7F + 0.3F,
                  false
               );
         }

         for (int var3 = 0; var3 < 2; var3++) {
            this.world.method_43361(class_3090.field_15319, this.method_37361(0.5), this.method_37255(), this.method_37383(0.5), 0.0, 0.0, 0.0);
         }
      }

      super.method_26606();
   }

   @Override
   public boolean method_26537() {
      return true;
   }

   @Override
   public void method_26919() {
      this.field_13771--;
      if (this.field_13771 <= 0) {
         this.field_13771 = 100;
         this.field_13774 = 0.5F + (float)this.field_41717.nextGaussian() * 3.0F;
      }

      class_5834 var3 = this.method_17809();
      if (var3 != null && var3.method_37388() > this.method_37388() + (double)this.field_13774 && this.method_26608(var3)) {
         class_1343 var4 = this.method_37098();
         this.method_37215(this.method_37098().method_6214(0.0, (0.3F - var4.field_7333) * 0.3F, 0.0));
         this.field_41763 = true;
      }

      super.method_26919();
   }

   @Override
   public boolean method_37270(float var1, float var2) {
      return false;
   }

   @Override
   public boolean method_37264() {
      return this.method_12756();
   }

   private boolean method_12756() {
      return (this.field_41735.<Byte>method_36640(field_13773) & 1) != 0;
   }

   private void method_12759(boolean var1) {
      byte var4 = this.field_41735.<Byte>method_36640(field_13773);
      if (!var1) {
         var4 = (byte)(var4 & -2);
      } else {
         var4 = (byte)(var4 | 1);
      }

      this.field_41735.method_36633(field_13773, var4);
   }
}
