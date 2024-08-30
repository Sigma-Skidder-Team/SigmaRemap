package mapped;

public enum AttributeModifierOperation {
   ADDITION(0),
   field13353(1),
   MULTIPLY_TOTAL(2);

   private static final AttributeModifierOperation[] field13355 = new AttributeModifierOperation[]{ADDITION, field13353, MULTIPLY_TOTAL};
   private final int field13356;
   private static final AttributeModifierOperation[] field13357 = new AttributeModifierOperation[]{ADDITION, field13353, MULTIPLY_TOTAL};

   private AttributeModifierOperation(int var3) {
      this.field13356 = var3;
   }

   public int method8685() {
      return this.field13356;
   }

   public static AttributeModifierOperation method8686(int var0) {
      if (var0 >= 0 && var0 < field13355.length) {
         return field13355[var0];
      } else {
         throw new IllegalArgumentException("No operation with value " + var0);
      }
   }
}
