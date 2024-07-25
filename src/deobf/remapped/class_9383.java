package remapped;

public class class_9383 implements Runnable {
   private static String[] field_47954;

   public class_9383(KeybindManagerMenu var1, KeybindManagerMenu var2) {
      this.field_47953 = var1;
      this.field_47952 = var2;
   }

   @Override
   public void run() {
      for (class_7038 var4 : this.field_47952.method_32134()) {
         if (var4 instanceof class_7868) {
            class_7868 var5 = (class_7868)var4;
            var5.method_35615();
            this.field_47953.field_43178.method_18946();
            var5.method_32187(true);
            var5.method_32162();
            this.field_47952.method_32101(this.field_47953.field_43189);
         }
      }
   }
}
