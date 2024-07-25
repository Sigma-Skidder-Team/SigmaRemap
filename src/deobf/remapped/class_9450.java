package remapped;

public class class_9450 {
   private static String[] field_48231;
   private float field_48229;
   private class_5794 field_48228 = new class_5794();
   private class_6294 field_48233 = new class_6294(this);
   private long field_48232;
   private boolean field_48227 = false;
   private float field_48230 = -1.0F;

   public class_9450() {
      this.field_48233.method_28724();
      this.field_48232 = (long)this.field_48228.nextInt(8000, 10000);
      this.field_48229 = this.field_48228.nextFloat();
   }

   public void method_43704() {
      if (this.field_48233.method_28723() > this.field_48232) {
         this.field_48232 = (long)this.field_48228.nextInt(8000, 10000);
         this.field_48227 = true;
         this.field_48230 = this.field_48228.nextFloat() + 0.75F;
         boolean var3 = this.field_48228.nextBoolean();
         if (var3) {
            this.field_48230 *= -1.0F;
         }

         this.field_48233.method_28728();
      }

      if (this.field_48227 && this.field_48230 != -1.0F && this.field_48233.method_28723() % 10L == 0L) {
         if (!(this.field_48230 > this.field_48229)) {
            this.field_48229 -= 0.02F;
            if (this.field_48230 > this.field_48229) {
               this.field_48229 = this.field_48230;
               this.field_48227 = false;
               this.field_48230 = -1.0F;
            }
         } else {
            this.field_48229 += 0.02F;
            if (this.field_48230 < this.field_48229) {
               this.field_48229 = this.field_48230;
               this.field_48227 = false;
               this.field_48230 = -1.0F;
            }
         }
      }
   }

   public float method_43702() {
      return this.field_48229;
   }
}
