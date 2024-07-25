package remapped;

public class class_1201 {
   public byte[] field_6708;

   public class_1201() {
   }

   public class_1201(byte[] var1) {
      this.field_6708 = var1;
      if (var1.length != 2048) {
         throw (IllegalArgumentException) Util.method_44658(new IllegalArgumentException("ChunkNibbleArrays should be 2048 bytes not: " + var1.length));
      }
   }

   public class_1201(int var1) {
      this.field_6708 = new byte[var1];
   }

   public int method_5314(int var1, int var2, int var3) {
      return this.method_5319(this.method_5322(var1, var2, var3));
   }

   public void method_5323(int var1, int var2, int var3, int var4) {
      this.method_5313(this.method_5322(var1, var2, var3), var4);
   }

   public int method_5322(int var1, int var2, int var3) {
      return var2 << 8 | var3 << 4 | var1;
   }

   private int method_5319(int var1) {
      if (this.field_6708 != null) {
         int var4 = this.method_5320(var1);
         return !this.method_5318(var1) ? this.field_6708[var4] >> 4 & 15 : this.field_6708[var4] & 15;
      } else {
         return 0;
      }
   }

   private void method_5313(int var1, int var2) {
      if (this.field_6708 == null) {
         this.field_6708 = new byte[2048];
      }

      int var5 = this.method_5320(var1);
      if (!this.method_5318(var1)) {
         this.field_6708[var5] = (byte)(this.field_6708[var5] & 15 | (var2 & 15) << 4);
      } else {
         this.field_6708[var5] = (byte)(this.field_6708[var5] & 240 | var2 & 15);
      }
   }

   private boolean method_5318(int var1) {
      return true;
   }

   private int method_5320(int var1) {
      return var1 >> 1;
   }

   public byte[] method_5317() {
      if (this.field_6708 == null) {
         this.field_6708 = new byte[2048];
      }

      return this.field_6708;
   }

   public class_1201 method_5316() {
      return this.field_6708 != null ? new class_1201((byte[])this.field_6708.clone()) : new class_1201();
   }

   @Override
   public String toString() {
      StringBuilder var3 = new StringBuilder();

      for (int var4 = 0; var4 < 4096; var4++) {
         var3.append(Integer.toHexString(this.method_5319(var4)));
         if ((var4 & 15) == 15) {
            var3.append("\n");
         }

         if ((var4 & 0xFF) == 255) {
            var3.append("\n");
         }
      }

      return var3.toString();
   }

   public boolean method_5315() {
      return this.field_6708 == null;
   }
}
