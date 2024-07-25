package remapped;

public class class_9182 {
   private static String[] field_46982;
   private int field_46984 = 18;
   private int field_46978 = 128;
   private int field_46983 = 18;
   private int field_46981 = 0;
   private int field_46986 = 0;
   private int field_46979 = 0;
   private byte[][][] field_46985 = (byte[][][])null;
   private byte[] field_46987 = null;
   private int field_46980 = 0;

   public class_9182(int var1, int var2, int var3) {
      this.field_46984 = var1;
      this.field_46978 = var2;
      this.field_46983 = var3;
      this.field_46985 = new byte[var1][var2][var3];
      this.method_42322();
   }

   public void method_42322() {
      for (int var3 = 0; var3 < this.field_46984; var3++) {
         byte[][] var4 = this.field_46985[var3];

         for (int var5 = 0; var5 < this.field_46978; var5++) {
            byte[] var6 = var4[var5];

            for (int var7 = 0; var7 < this.field_46983; var7++) {
               var6[var7] = -1;
            }
         }
      }
   }

   public void method_42320(int var1, int var2, int var3) {
      this.field_46981 = var1;
      this.field_46986 = var2;
      this.field_46979 = var3;
      this.method_42322();
   }

   public byte method_42318(int var1, int var2, int var3) {
      try {
         this.field_46987 = this.field_46985[var1 - this.field_46981][var2 - this.field_46986];
         this.field_46980 = var3 - this.field_46979;
         return this.field_46987[this.field_46980];
      } catch (ArrayIndexOutOfBoundsException var7) {
         var7.printStackTrace();
         return -1;
      }
   }

   public void method_42319(byte var1) {
      try {
         this.field_46987[this.field_46980] = var1;
      } catch (Exception var5) {
         var5.printStackTrace();
      }
   }
}
