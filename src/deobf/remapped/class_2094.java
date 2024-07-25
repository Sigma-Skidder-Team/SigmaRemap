package remapped;

public class class_2094 extends class_3599 {
   private static String[] field_10516;
   private int field_10515;

   private class_2094(class_9825 var1) {
      this.field_10517 = var1;
   }

   @Override
   public boolean method_16795() {
      class_5834 var3 = this.field_10517.method_17809();
      return var3 == null ? false : this.field_10517.method_26609(this.field_10517.method_17809(), class_4931.field_25526);
   }

   @Override
   public void method_16796() {
      this.field_10515 = 10;
      class_9825.method_45300(this.field_10517, class_55.field_38);
      this.method_9795();
   }

   @Override
   public void method_16793() {
      class_9825.method_45297(
         this.field_10517,
         this.field_10517
            .field_41768
            .method_22563(class_3801.field_18595, class_9825.method_45298(this.field_10517))
            .method_6082(10 + class_9825.method_45288(this.field_10517).nextInt(20))
      );
   }

   @Override
   public void method_16794() {
      if (class_9825.method_45295(this.field_10517) == class_55.field_38) {
         this.field_10515--;
         if (this.field_10515 <= 0) {
            class_9825.method_45300(this.field_10517, class_55.field_37);
            this.method_9795();
            this.field_10515 = (8 + class_9825.method_45302(this.field_10517).nextInt(4)) * 20;
            this.field_10517.method_37155(class_463.field_2296, 10.0F, 0.95F + class_9825.method_45292(this.field_10517).nextFloat() * 0.1F);
         }
      }
   }

   private void method_9795() {
      class_9825.method_45297(
         this.field_10517, this.field_10517.method_17809().method_37075().method_6082(20 + class_9825.method_45289(this.field_10517).nextInt(20))
      );
      if (class_9825.method_45298(this.field_10517).method_12165() < this.field_10517.field_41768.method_22552()) {
         class_9825.method_45297(
            this.field_10517,
            new BlockPos(
               class_9825.method_45298(this.field_10517).method_12173(),
               this.field_10517.field_41768.method_22552() + 1,
               class_9825.method_45298(this.field_10517).method_12185()
            )
         );
      }
   }
}
