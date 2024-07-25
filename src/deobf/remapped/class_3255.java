package remapped;

public class class_3255 implements Runnable {
   private static String[] field_16153;

   public class_3255(class_9543 var1, class_3577 var2) {
      this.field_16152 = var1;
      this.field_16154 = var2;
   }

   @Override
   public void run() {
      class_314.method_1431(this.field_16154, true);

      for (int var3 = 0; var3 < 10; var3++) {
         class_9543.method_44020().field_9572.method_43051(this.field_16154, class_3090.field_15322);
      }
   }
}
