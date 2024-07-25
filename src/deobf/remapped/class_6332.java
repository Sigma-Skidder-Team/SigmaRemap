package remapped;

public class class_6332 implements class_7279 {
   private static String[] field_32350;
   private final float field_32351;

   private class_6332(float var1) {
      this.field_32351 = var1;
   }

   @Override
   public class_2190 method_33269() {
      return class_5110.field_26358;
   }

   public boolean test(class_2792 var1) {
      return var1.method_12693().nextFloat() < this.field_32351;
   }

   public static class_5704 method_29003(float var0) {
      return () -> new class_6332(var0);
   }
}
