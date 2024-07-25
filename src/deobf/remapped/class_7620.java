package remapped;

public class class_7620 implements Runnable {
   public class_7620(class_7975 var1, long var2, long var4, long var6) {
      this.field_38778 = var1;
      this.field_38777 = var2;
      this.field_38775 = var4;
      this.field_38776 = var6;
   }

   @Override
   public void run() {
      switch (this.field_38778.field_40836) {
         case field_25344:
         case field_25349:
         case field_25346:
         case field_25345:
         case field_25348:
            for (long var9 = this.field_38777; var9 < this.field_38775; var9++) {
               class_3685.field_18064.putByte(this.field_38776 + this.field_38778.field_40844 * var9, (byte)0);
            }
            break;
         case field_25343:
            for (long var8 = this.field_38777; var8 < this.field_38775; var8++) {
               class_3685.field_18064.putShort(this.field_38776 + this.field_38778.field_40844 * var8, (short)0);
            }
            break;
         case field_25342:
            for (long var7 = this.field_38777; var7 < this.field_38775; var7++) {
               class_3685.field_18064.putInt(this.field_38776 + this.field_38778.field_40844 * var7, 0);
            }
            break;
         case field_25350:
            for (long var6 = this.field_38777; var6 < this.field_38775; var6++) {
               class_3685.field_18064.putLong(this.field_38776 + this.field_38778.field_40844 * var6, 0L);
            }
            break;
         case field_25353:
            for (long var5 = this.field_38777; var5 < this.field_38775; var5++) {
               class_3685.field_18064.putFloat(this.field_38776 + this.field_38778.field_40844 * var5, 0.0F);
            }
            break;
         case field_25351:
            for (long var3 = this.field_38777; var3 < this.field_38775; var3++) {
               class_3685.field_18064.putDouble(this.field_38776 + this.field_38778.field_40844 * var3, 0.0);
            }
            break;
         default:
            throw new IllegalArgumentException("Invalid array type.");
      }
   }
}
