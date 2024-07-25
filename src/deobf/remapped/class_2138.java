package remapped;

public class class_2138 implements class_4650 {
   private static String[] field_10717;

   public class_2138(class_8200 var1) {
      this.field_10718 = var1;
   }

   @Override
   public class_1621 method_21502(Object var1) {
      class_9592 var4 = new class_9592((Class<? extends Object>)var1.getClass());
      return this.field_10718.method_589(this.field_10718.method_37561(var1.getClass(), var4), ((Enum)var1).name());
   }
}
