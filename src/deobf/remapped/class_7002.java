package remapped;

public class class_7002 implements Runnable {
   public class_7002(KeybindManagerMenu var1, KeybindManagerMenu var2) {
      this.field_35931 = var1;
      this.field_35929 = var2;
   }

   @Override
   public void run() {
      this.field_35929
         .method_32148(
            this.field_35931.field_43189 = new class_8914(
               this.field_35929, "mods", 0, 0, KeybindManagerMenu.method_38834(this.field_35931), KeybindManagerMenu.method_38832(this.field_35931)
            )
         );
      this.field_35931.field_43189.method_41002((var1, var2) -> {
         if (var2 != null) {
            var2.method_5462(this.field_35931.field_43178.field_19975);
         }

         KeybindManagerMenu.method_38829(this.field_35931);
      });
      this.field_35931.field_43189.method_32187(true);
   }
}
