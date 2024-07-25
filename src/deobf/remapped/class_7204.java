package remapped;

public class class_7204 implements Runnable {
   private static String[] field_37018;

   public class_7204(class_8441 var1, class_8441 var2) {
      this.field_37019 = var1;
      this.field_37020 = var2;
   }

   @Override
   public void run() {
      for (class_7038 var4 : this.field_37020.method_32134()) {
         if (var4 instanceof class_7868) {
            class_7868 var5 = (class_7868)var4;
            var5.method_35615();
         }
      }
   }
}
