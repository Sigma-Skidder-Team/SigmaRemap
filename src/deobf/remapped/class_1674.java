package remapped;

public class class_1674 implements Runnable {
   public class_1674(class_3484 var1) {
      this.field_8674 = var1;
   }

   @Override
   public void run() {
      if (!class_3484.method_16008(this.field_8674)) {
         class_3484.method_15994(this.field_8674);
         class_3484.method_16007(this.field_8674).method_5744();
         if (class_8916.field_45719 == class_3484.method_16007(this.field_8674).field_7086) {
            class_3484.method_16000(this.field_8674);
         }

         this.field_8674.method_19325("connecting");
      }
   }
}
