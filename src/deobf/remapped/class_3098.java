package remapped;

public class class_3098 extends class_5837 {
   private static String[] field_15411;
   private final class_595 field_15410;

   private class_3098(class_7279[] var1, class_595 var2) {
      super(var1);
      this.field_15410 = var2;
   }

   @Override
   public class_1404 method_13321() {
      return class_5116.field_26397;
   }

   @Override
   public class_6098 method_26627(class_6098 var1, class_2792 var2) {
      int var5 = this.field_15410.applyAsInt(var1.method_27997());
      var1.method_28017(var5);
      return var1;
   }

   public static class_5363<?> method_14180(class_595 var0) {
      return method_26628(var1 -> new class_3098(var1, var0));
   }
}
