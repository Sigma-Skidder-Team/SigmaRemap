package mapped;

import net.minecraft.client.util.Util;

public class Class6785 {
   public byte[] field29578;

   public Class6785() {
   }

   public Class6785(byte[] var1) {
      this.field29578 = var1;
      if (var1.length != 2048) {
         throw (IllegalArgumentException) Util.pauseDevMode(new IllegalArgumentException("ChunkNibbleArrays should be 2048 bytes not: " + var1.length));
      }
   }

   public Class6785(int var1) {
      this.field29578 = new byte[var1];
   }

   public int method20670(int var1, int var2, int var3) {
      return this.method20672(this.method20668(var1, var2, var3));
   }

   public void method20671(int var1, int var2, int var3, int var4) {
      this.method20673(this.method20668(var1, var2, var3), var4);
   }

   public int method20668(int var1, int var2, int var3) {
      return var2 << 8 | var3 << 4 | var1;
   }

   private int method20672(int var1) {
      if (this.field29578 != null) {
         int var4 = this.method20675(var1);
         return !this.method20674(var1) ? this.field29578[var4] >> 4 & 15 : this.field29578[var4] & 15;
      } else {
         return 0;
      }
   }

   private void method20673(int var1, int var2) {
      if (this.field29578 == null) {
         this.field29578 = new byte[2048];
      }

      int var5 = this.method20675(var1);
      if (!this.method20674(var1)) {
         this.field29578[var5] = (byte)(this.field29578[var5] & 15 | (var2 & 15) << 4);
      } else {
         this.field29578[var5] = (byte)(this.field29578[var5] & 240 | var2 & 15);
      }
   }

   private boolean method20674(int var1) {
      return true;
   }

   private int method20675(int var1) {
      return var1 >> 1;
   }

   public byte[] method20669() {
      if (this.field29578 == null) {
         this.field29578 = new byte[2048];
      }

      return this.field29578;
   }

   public Class6785 method20676() {
      return this.field29578 != null ? new Class6785((byte[])this.field29578.clone()) : new Class6785();
   }

   @Override
   public String toString() {
      StringBuilder var3 = new StringBuilder();

      for (int var4 = 0; var4 < 4096; var4++) {
         var3.append(Integer.toHexString(this.method20672(var4)));
         if ((var4 & 15) == 15) {
            var3.append("\n");
         }

         if ((var4 & 0xFF) == 255) {
            var3.append("\n");
         }
      }

      return var3.toString();
   }

   public boolean method20677() {
      return this.field29578 == null;
   }
}
