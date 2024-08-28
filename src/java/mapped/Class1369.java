package mapped;

public class Class1369 implements Runnable {
   public final long field7311;
   public final long field7312;
   public final long field7313;
   public final Class2373 field7314;

   public Class1369(Class2373 var1, long var2, long var4, long var6) {
      this.field7314 = var1;
      this.field7311 = var2;
      this.field7312 = var4;
      this.field7313 = var6;
   }

   @Override
   public void run() {
      switch (Class9124.field41929[this.field7314.field16233.ordinal()]) {
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
            for (long var9 = this.field7311; var9 < this.field7312; var9++) {
               Class8133.field34961.putByte(this.field7313 + this.field7314.field16235 * var9, (byte)0);
            }
            break;
         case 6:
            for (long var8 = this.field7311; var8 < this.field7312; var8++) {
               Class8133.field34961.putShort(this.field7313 + this.field7314.field16235 * var8, (short)0);
            }
            break;
         case 7:
            for (long var7 = this.field7311; var7 < this.field7312; var7++) {
               Class8133.field34961.putInt(this.field7313 + this.field7314.field16235 * var7, 0);
            }
            break;
         case 8:
            for (long var6 = this.field7311; var6 < this.field7312; var6++) {
               Class8133.field34961.putLong(this.field7313 + this.field7314.field16235 * var6, 0L);
            }
            break;
         case 9:
            for (long var5 = this.field7311; var5 < this.field7312; var5++) {
               Class8133.field34961.putFloat(this.field7313 + this.field7314.field16235 * var5, 0.0F);
            }
            break;
         case 10:
            for (long var3 = this.field7311; var3 < this.field7312; var3++) {
               Class8133.field34961.putDouble(this.field7313 + this.field7314.field16235 * var3, 0.0);
            }
            break;
         default:
            throw new IllegalArgumentException("Invalid array type.");
      }
   }
}
