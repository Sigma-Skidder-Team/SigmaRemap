package remapped;

public class class_4144 implements Runnable {
   public class_4144(class_6586 var1, Runnable var2) {
      this.field_20160 = var1;
      this.field_20161 = var2;
   }

   @Override
   public void run() {
      class_6586 var3 = this.field_20160;
      class_6586.method_30097(this.field_20160, class_8029.field_41100);
      class_7118 var4 = new class_7118(this, var3);
      if (!class_6586.method_30084(this.field_20160) && this.field_20160.field_11436) {
         var4.run();
      } else {
         int[] var5 = new int[]{0};
         if (class_6586.method_30084(this.field_20160)) {
            class_6586.method_30085().fine("we are currently polling - waiting to pause");
            var5[0]++;
            this.field_20160.method_19331("pollComplete", new class_9004(this, var5, var4));
         }

         if (!this.field_20160.field_11436) {
            class_6586.method_30085().fine("we are currently writing - waiting to pause");
            var5[0]++;
            this.field_20160.method_19331("drain", new class_1835(this, var5, var4));
         }
      }
   }
}
