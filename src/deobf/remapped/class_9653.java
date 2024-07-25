package remapped;

public class class_9653 extends class_9883 {
   private static String[] field_49162;
   private float field_49159;
   private float field_49163;
   private float field_49161;
   private float field_49160;

   private class_9653(class_9825 var1) {
      super(var1);
      this.field_49164 = var1;
   }

   @Override
   public boolean method_16795() {
      return this.field_49164.method_17809() == null || class_9825.method_45295(this.field_49164) == class_55.field_38;
   }

   @Override
   public void method_16796() {
      this.field_49163 = 5.0F + class_9825.method_45294(this.field_49164).nextFloat() * 10.0F;
      this.field_49161 = -4.0F + class_9825.method_45287(this.field_49164).nextFloat() * 9.0F;
      this.field_49160 = !class_9825.method_45285(this.field_49164).nextBoolean() ? -1.0F : 1.0F;
      this.method_44534();
   }

   @Override
   public void method_16794() {
      if (class_9825.method_45304(this.field_49164).nextInt(350) == 0) {
         this.field_49161 = -4.0F + class_9825.method_45290(this.field_49164).nextFloat() * 9.0F;
      }

      if (class_9825.method_45291(this.field_49164).nextInt(250) == 0) {
         this.field_49163++;
         if (this.field_49163 > 15.0F) {
            this.field_49163 = 5.0F;
            this.field_49160 = -this.field_49160;
         }
      }

      if (class_9825.method_45301(this.field_49164).nextInt(450) == 0) {
         this.field_49159 = class_9825.method_45303(this.field_49164).nextFloat() * 2.0F * (float) Math.PI;
         this.method_44534();
      }

      if (this.method_45532()) {
         this.method_44534();
      }

      if (class_9825.method_45284(this.field_49164).field_7333 < this.field_49164.method_37309()
         && !this.field_49164.field_41768.method_22548(this.field_49164.method_37075().method_6101(1))) {
         this.field_49161 = Math.max(1.0F, this.field_49161);
         this.method_44534();
      }

      if (class_9825.method_45284(this.field_49164).field_7333 > this.field_49164.method_37309()
         && !this.field_49164.field_41768.method_22548(this.field_49164.method_37075().method_6082(1))) {
         this.field_49161 = Math.min(-1.0F, this.field_49161);
         this.method_44534();
      }
   }

   private void method_44534() {
      if (class_1331.field_7306.equals(class_9825.method_45298(this.field_49164))) {
         class_9825.method_45297(this.field_49164, this.field_49164.method_37075());
      }

      this.field_49159 = this.field_49159 + this.field_49160 * 15.0F * (float) (Math.PI / 180.0);
      class_9825.method_45286(
         this.field_49164,
         class_1343.method_6205(class_9825.method_45298(this.field_49164))
            .method_6214(
               (double)(this.field_49163 * class_9299.method_42840(this.field_49159)),
               (double)(-4.0F + this.field_49161),
               (double)(this.field_49163 * class_9299.method_42818(this.field_49159))
            )
      );
   }
}
