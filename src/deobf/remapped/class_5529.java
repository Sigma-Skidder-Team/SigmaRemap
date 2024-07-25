package remapped;

public class class_5529 extends class_8374<class_514> {
   private static String[] field_28183;

   public class_5529(class_6420 var1, MinecraftClient var2) {
      super(var2, var1.field_941, var1.field_940, 32, var1.field_940 - 64, 36);
      this.field_28182 = var1;
      this.method_36188(false);
      if (class_6420.method_29340(var1).field_45903 != null) {
         class_6420.method_29340(var1).field_45903.forEach((var1x, var2x) -> {
            class_6420 var10003 = this.field_28182;
            this.field_28182.getClass();
            this.method_36202(new class_514(var10003, var1x, var2x));
         });
      }
   }
}
