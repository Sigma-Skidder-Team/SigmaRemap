package remapped;

public class class_4143 implements Runnable {
   public class_4143(class_2291 var1, class_8970[] var2) {
      this.field_20157 = var1;
      this.field_20158 = var2;
   }

   @Override
   public void run() {
      if (this.field_20157.field_11435 == class_8029.field_41101) {
         try {
            this.field_20157.method_10543(this.field_20158);
         } catch (class_4819 var4) {
            throw new RuntimeException(var4);
         }
      } else {
         throw new RuntimeException("Transport not open");
      }
   }
}
