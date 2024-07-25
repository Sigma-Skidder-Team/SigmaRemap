package remapped;

public class class_9867 extends class_8420 {
   private static String[] field_49917;

   public class_9867(class_9668 var1) {
      super(var1);
      this.field_49916 = var1;
   }

   @Override
   public void method_16796() {
      super.method_16796();
      if (this.field_49916.method_26449()) {
         this.method_38755();
         this.method_16793();
      }
   }

   @Override
   public void method_38756(class_5886 var1, class_5834 var2) {
      if (var1 instanceof class_9668 && !var1.method_26449()) {
         super.method_38756(var1, var2);
      }
   }
}
