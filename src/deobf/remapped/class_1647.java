package remapped;

public class class_1647 implements Runnable {
   private static String[] field_8575;

   public class_1647(class_4993 var1, int var2, int var3, int var4, int var5, float[] var6, boolean var7) {
      this.field_8570 = var1;
      this.field_8571 = var2;
      this.field_8568 = var3;
      this.field_8574 = var4;
      this.field_8573 = var5;
      this.field_8572 = var6;
      this.field_8569 = var7;
   }

   @Override
   public void run() {
      if (this.field_8571 != 0) {
         if (this.field_8568 != 1) {
            for (int var3 = this.field_8574; var3 < class_4993.method_22973(this.field_8570); var3 += this.field_8573) {
               class_4993.method_22998(this.field_8570).method_24207(this.field_8572, var3 * class_4993.method_22972(this.field_8570), this.field_8569);
            }
         } else {
            for (int var4 = this.field_8574; var4 < class_4993.method_22973(this.field_8570); var4 += this.field_8573) {
               class_4993.method_22998(this.field_8570).method_24205(this.field_8572, var4 * class_4993.method_22972(this.field_8570));
            }
         }
      } else if (this.field_8568 != -1) {
         for (int var5 = this.field_8574; var5 < class_4993.method_22973(this.field_8570); var5 += this.field_8573) {
            class_4993.method_22998(this.field_8570).method_24215(this.field_8572, var5 * class_4993.method_22972(this.field_8570), this.field_8569);
         }
      } else {
         for (int var6 = this.field_8574; var6 < class_4993.method_22973(this.field_8570); var6 += this.field_8573) {
            class_4993.method_22998(this.field_8570).method_24186(this.field_8572, var6 * class_4993.method_22972(this.field_8570));
         }
      }
   }
}
