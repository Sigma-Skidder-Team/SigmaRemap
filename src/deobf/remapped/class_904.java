package remapped;

public class class_904 extends class_9401 {
   private static String[] field_4635;
   private short[] field_4636 = new short[2304];
   private int[] field_4639 = new int[2];
   private int field_4638;
   private int field_4637;

   public class_904(int var1, int var2) {
      this.field_4638 = var2;
      this.field_4637 = var1;

      for (int var5 = 0; var5 < var2; var5++) {
         this.field_4639[var5] = (short)var5;
      }
   }

   public int method_3870() {
      return this.field_4638;
   }

   public int method_3872() {
      return this.field_4637;
   }

   public short[] method_3869() {
      return this.field_4636;
   }

   public int method_3871() {
      return this.field_4639[0];
   }

   @Override
   public void method_43544(int var1, short var2) {
      this.field_4636[this.field_4639[var1]] = var2;
      this.field_4639[var1] = this.field_4639[var1] + this.field_4638;
   }

   @Override
   public void method_43543(int var1, float[] var2) {
      int var5 = this.field_4639[var1];

      for (int var6 = 0; var6 < 32; var5 += this.field_4638) {
         float var7 = var2[var6++];
         var7 = !(var7 > 32767.0F) ? (!(var7 < -32767.0F) ? var7 : -32767.0F) : 32767.0F;
         short var8 = (short)((int)var7);
         this.field_4636[var5] = var8;
      }

      this.field_4639[var1] = var5;
   }

   @Override
   public void method_43545(int var1) {
   }

   @Override
   public void method_43540() {
   }

   @Override
   public void method_43542() {
      for (int var3 = 0; var3 < this.field_4638; var3++) {
         this.field_4639[var3] = (short)var3;
      }
   }

   @Override
   public void method_43539() {
   }
}
