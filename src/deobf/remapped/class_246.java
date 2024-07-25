package remapped;

public class class_246 extends class_8715 {
   private static String[] field_862;
   public final class_6571 field_864;
   private final float field_865;
   private float field_863 = 0.91F;
   private float field_867;
   private float field_866;
   private float field_868;
   private boolean field_869;

   public class_246(class_174 var1, double var2, double var4, double var6, class_6571 var8, float var9) {
      super(var1, var2, var4, var6);
      this.field_864 = var8;
      this.field_865 = var9;
   }

   public void method_1081(int var1) {
      float var4 = (float)((var1 & 0xFF0000) >> 16) / 255.0F;
      float var5 = (float)((var1 & 0xFF00) >> 8) / 255.0F;
      float var6 = (float)((var1 & 0xFF) >> 0) / 255.0F;
      float var7 = 1.0F;
      this.method_44953(var4 * 1.0F, var5 * 1.0F, var6 * 1.0F);
   }

   public void method_1082(int var1) {
      this.field_867 = (float)((var1 & 0xFF0000) >> 16) / 255.0F;
      this.field_866 = (float)((var1 & 0xFF00) >> 8) / 255.0F;
      this.field_868 = (float)((var1 & 0xFF) >> 0) / 255.0F;
      this.field_869 = true;
   }

   @Override
   public class_7154 method_44957() {
      return class_7154.field_36847;
   }

   @Override
   public void method_44949() {
      this.field_49459 = this.field_49462;
      this.field_49480 = this.field_49473;
      this.field_49479 = this.field_49465;
      if (this.field_49475++ < this.field_49476) {
         this.method_40054(this.field_864);
         if (this.field_49475 > this.field_49476 / 2) {
            this.method_44956(1.0F - ((float)this.field_49475 - (float)(this.field_49476 / 2)) / (float)this.field_49476);
            if (this.field_869) {
               this.field_49485 = this.field_49485 + (this.field_867 - this.field_49485) * 0.2F;
               this.field_49468 = this.field_49468 + (this.field_866 - this.field_49468) * 0.2F;
               this.field_49487 = this.field_49487 + (this.field_868 - this.field_49487) * 0.2F;
            }
         }

         this.field_49486 = this.field_49486 + (double)this.field_865;
         this.method_44962(this.field_49481, this.field_49486, this.field_49471);
         this.field_49481 = this.field_49481 * (double)this.field_863;
         this.field_49486 = this.field_49486 * (double)this.field_863;
         this.field_49471 = this.field_49471 * (double)this.field_863;
         if (this.field_49482) {
            this.field_49481 *= 0.7F;
            this.field_49471 *= 0.7F;
         }
      } else {
         this.method_44948();
      }
   }

   @Override
   public int method_44952(float var1) {
      return 15728880;
   }

   public void method_1083(float var1) {
      this.field_863 = var1;
   }
}
