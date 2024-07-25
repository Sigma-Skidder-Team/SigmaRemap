package remapped;

public abstract class class_3335 extends class_3599 {
   private final class_4931 field_16441;

   private class_3335(class_5542 var1) {
      this.field_16442 = var1;
      class_4931 var10001 = new class_4931().method_22607(12.0).method_22602();
      class_5542 var10004 = this.field_16442;
      this.field_16442.getClass();
      this.field_16441 = var10001.method_22606(new class_335(var10004));
   }

   public boolean method_15298() {
      BlockPos var3 = new BlockPos(this.field_16442.method_37302(), this.field_16442.method_37241().field_19939, this.field_16442.method_37156());
      return !this.field_16442.field_41768.method_25263(var3) && this.field_16442.method_21375(var3) >= 0.0F;
   }

   public boolean method_15297() {
      return !this.field_16442
         .field_41768
         .<class_5834>method_25863(class_5834.class, this.field_16441, this.field_16442, this.field_16442.method_37241().method_18899(12.0, 6.0, 12.0))
         .isEmpty();
   }
}
