package remapped;

public class class_8569 implements Runnable {
   private static String[] field_43916;

   public class_8569(class_6819 var1, long var2, long var4, long var6, class_1702 var8) {
      this.field_43918 = var1;
      this.field_43917 = var2;
      this.field_43920 = var4;
      this.field_43915 = var6;
      this.field_43919 = var8;
   }

   @Override
   public void run() {
      long var3 = this.field_43917 + class_6819.method_31290(this.field_43918) - 1L;

      for (long var5 = this.field_43920; var5 < this.field_43915; var5++) {
         long var7 = this.field_43917 + var5;
         double var9 = this.field_43919.method_36107(var7);
         long var11 = var3 - var5;
         this.field_43919.method_36114(var7, this.field_43919.method_36107(var11));
         this.field_43919.method_36114(var11, var9);
      }
   }
}
