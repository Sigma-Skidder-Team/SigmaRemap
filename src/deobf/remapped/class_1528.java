package remapped;

public class class_1528 implements Runnable {
   private class_1528(class_8264 var1) {
      this.field_8118 = var1;
   }

   @Override
   public void run() {
      if (class_8264.method_38100(this.field_8118)) {
         this.method_6964();
      }
   }

   private void method_6964() {
      try {
         class_176 var3 = class_176.method_777();
         class_7788 var4 = null;

         try {
            var4 = var3.method_774();
         } catch (Exception var7) {
         }

         class_8974 var5 = class_3524.method_16270();
         if (var4 != null) {
            String var6 = var4.field_39466;
            if (var6 != null && !var6.equals(var5.field_45983)) {
               var5.field_45982 = true;
               var5.field_45983 = var6;
               class_3524.method_16271(var5);
            }
         }

         class_8264.method_38096(this.field_8118, var5.field_45982);
         class_8264.method_38111(this.field_8118, var5.field_45983);
         class_8264.method_38088(this.field_8118).put(class_2845.field_13949, true);
      } catch (Exception var8) {
         class_8264.method_38092().error("Couldn't get unread news", var8);
      }
   }
}
