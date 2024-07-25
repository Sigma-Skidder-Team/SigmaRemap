package remapped;

public class class_6382 extends class_5837 {
   private static String[] field_32594;
   private final class_5734 field_32593;

   private class_6382(class_7279[] var1, class_5734 var2) {
      super(var1);
      this.field_32593 = var2;
   }

   @Override
   public class_1404 method_13321() {
      return class_5116.field_26385;
   }

   @Override
   public class_6098 method_26627(class_6098 var1, class_2792 var2) {
      var1.method_27994().method_25925(this.field_32593);
      return var1;
   }

   public static class_5363<?> method_29169(class_5734 var0) {
      return method_26628(var1 -> new class_6382(var1, var0));
   }
}
