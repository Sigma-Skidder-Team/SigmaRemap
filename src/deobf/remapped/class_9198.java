package remapped;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class class_9198 {
   private static final int field_47054 = 44;
   private static final int field_47051 = 1380533830;
   private static final long field_47049 = 6287401410857104416L;
   private static final int field_47048 = 1684108385;
   private static final int field_47052 = 255;
   private final RandomAccessFile field_47055;
   private final int field_47056;
   private final int field_47057;
   private final int field_47050;
   private int field_47053;

   public class_9198(File var1, int var2, int var3, int var4) throws IOException {
      this.field_47056 = var2;
      this.field_47057 = var3;
      this.field_47050 = var4;
      this.field_47053 = 0;
      this.field_47055 = new RandomAccessFile(var1, "rw");
      this.field_47055.write(new byte[44]);
   }

   public void method_42398(byte[] var1) throws IOException {
      this.method_42399(var1, 0, var1.length);
   }

   public void method_42399(byte[] var1, int var2, int var3) throws IOException {
      for (int var6 = var2; var6 < var2 + var1.length; var6 += 2) {
         byte var7 = var1[var6 + 1];
         var1[var6 + 1] = var1[var6];
         var1[var6] = var7;
      }

      this.field_47055.write(var1, var2, var3);
      this.field_47053 += var1.length;
   }

   public void method_42400(short[] var1) throws IOException {
      this.method_42401(var1, 0, var1.length);
   }

   public void method_42401(short[] var1, int var2, int var3) throws IOException {
      for (int var6 = var2; var6 < var2 + var1.length; var6++) {
         this.field_47055.write(var1[var6] & 255);
         this.field_47055.write(var1[var6] >> 8 & 0xFF);
         this.field_47053 += 2;
      }
   }

   public void method_42402() throws IOException {
      this.method_42396();
      this.field_47055.close();
   }

   private void method_42396() throws IOException {
      this.field_47055.seek(0L);
      int var3 = (this.field_47050 + 7) / 8;
      this.field_47055.writeInt(1380533830);
      this.field_47055.writeInt(Integer.reverseBytes(this.field_47053 + 36));
      this.field_47055.writeLong(6287401410857104416L);
      this.field_47055.writeInt(Integer.reverseBytes(16));
      this.field_47055.writeShort(Short.reverseBytes((short)1));
      this.field_47055.writeShort(Short.reverseBytes((short)this.field_47057));
      this.field_47055.writeInt(Integer.reverseBytes(this.field_47056));
      this.field_47055.writeInt(Integer.reverseBytes(this.field_47056 * this.field_47057 * var3));
      this.field_47055.writeShort(Short.reverseBytes((short)(this.field_47057 * var3)));
      this.field_47055.writeShort(Short.reverseBytes((short)this.field_47050));
      this.field_47055.writeInt(1684108385);
      this.field_47055.writeInt(Integer.reverseBytes(this.field_47053));
   }
}
