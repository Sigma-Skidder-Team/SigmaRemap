package remapped;

public class class_3622 {
   private static String[] field_17667;
   public final class_3384 field_17671;
   public final int field_17666;
   private boolean field_17668 = false;
   public final int field_17670 = 25;
   public class_2440 field_17669 = new class_2440(300, 300);
   public final int field_17665 = 7;

   public class_3622(int var1) {
      this.field_17671 = class_3054.field_14990;
      this.field_17666 = var1;
   }

   public int method_16874() {
      return 106;
   }

   public int method_16873() {
      return OtherTabGUIModule.method_1195(this.field_17666);
   }

   public int method_16871() {
      return 30;
   }

   public void method_16876() {
      this.field_17668 = true;
      this.field_17669.method_11119(class_4043.field_19618);
   }

   public boolean method_16868() {
      return this.field_17668;
   }

   public boolean method_16869() {
      return this.field_17668 && this.field_17669.method_11123() == 0.0F;
   }

   public int method_16875() {
      return 100;
   }

   public void method_16877(float var1) {
      float var4 = class_3483.method_15985(this.field_17669.method_11123(), 0.0F, 1.0F, 1.0F);
      if (this.field_17669.method_11128() == class_4043.field_19618) {
         var4 = class_3483.method_15984(this.field_17669.method_11123(), 0.0F, 1.0F, 1.0F);
      }

      class_73.method_135((float)this.method_16873(), (float)this.method_16871(), (float)this.method_16874() * var4, (float)this.method_16875());
      this.method_16870(var1);
      class_73.method_141();
   }

   public void method_16870(float var1) {
   }
}
