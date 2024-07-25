package remapped;

public class class_8568 extends class_6017 {
   private static String[] field_43913;
   private int field_43914;

   public class_8568(class_2770 var1) {
      super(var1);
   }

   @Override
   public void method_23466() {
      this.field_9479
         .world
         .method_29527(
            this.field_9479.method_37302(),
            this.field_9479.method_37309(),
            this.field_9479.method_37156(),
            class_463.field_1942,
            this.field_9479.method_37197(),
            2.5F,
            0.8F + this.field_9479.method_26594().nextFloat() * 0.3F,
            false
         );
   }

   @Override
   public void method_23473() {
      if (this.field_43914++ >= 40) {
         this.field_9479.method_12611().method_29422(class_8978.field_45997);
      }
   }

   @Override
   public void method_23469() {
      this.field_43914 = 0;
   }

   @Override
   public class_8978<class_8568> method_23464() {
      return class_8978.field_46001;
   }
}
