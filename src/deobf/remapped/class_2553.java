package remapped;

public class class_2553 extends class_691 {
   private static String[] field_12636;
   public static final class_7044 field_12637 = class_6023.field_30758;
   private final int field_12635;

   public class_2553(int var1, class_3073 var2) {
      super(var2);
      this.method_29284(this.field_32751.method_36446().method_10308(field_12637, Integer.valueOf(0)));
      this.field_12635 = var1;
   }

   @Override
   public int method_3122(World var1, BlockPos var2) {
      int var5 = Math.min(var1.<Entity>method_25868(Entity.class, field_3798.method_18919(var2)).size(), this.field_12635);
      if (var5 <= 0) {
         return 0;
      } else {
         float var6 = (float)Math.min(this.field_12635, var5) / (float)this.field_12635;
         return MathHelper.ceil(var6 * 15.0F);
      }
   }

   @Override
   public void method_3117(class_9379 var1, BlockPos var2) {
      var1.method_43359((PlayerEntity)null, var2, SoundEvents.field_2016, class_562.field_3322, 0.3F, 0.90000004F);
   }

   @Override
   public void method_3120(class_9379 var1, BlockPos var2) {
      var1.method_43359((PlayerEntity)null, var2, SoundEvents.field_2878, class_562.field_3322, 0.3F, 0.75F);
   }

   @Override
   public int method_3119(class_2522 var1) {
      return var1.<Integer>method_10313(field_12637);
   }

   @Override
   public class_2522 method_3116(class_2522 var1, int var2) {
      return var1.method_10308(field_12637, Integer.valueOf(var2));
   }

   @Override
   public int method_3118() {
      return 10;
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_12637);
   }
}
