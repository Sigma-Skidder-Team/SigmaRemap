package mapped;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Class9650 {
   private static final int field45117 = 44;
   private static final int field45118 = 1380533830;
   private static final long field45119 = 6287401410857104416L;
   private static final int field45120 = 1684108385;
   private static final int field45121 = 255;
   private final RandomAccessFile field45122;
   private final int field45123;
   private final int field45124;
   private final int field45125;
   private int field45126;

   public Class9650(File var1, int var2, int var3, int var4) throws IOException {
      this.field45123 = var2;
      this.field45124 = var3;
      this.field45125 = var4;
      this.field45126 = 0;
      this.field45122 = new RandomAccessFile(var1, "rw");
      this.field45122.write(new byte[44]);
   }

   public void method37638(byte[] var1) throws IOException {
      this.method37639(var1, 0, var1.length);
   }

   public void method37639(byte[] var1, int var2, int var3) throws IOException {
      for (int var6 = var2; var6 < var2 + var1.length; var6 += 2) {
         byte var7 = var1[var6 + 1];
         var1[var6 + 1] = var1[var6];
         var1[var6] = var7;
      }

      this.field45122.write(var1, var2, var3);
      this.field45126 += var1.length;
   }

   public void method37640(short[] var1) throws IOException {
      this.method37641(var1, 0, var1.length);
   }

   public void method37641(short[] var1, int var2, int var3) throws IOException {
      for (int var6 = var2; var6 < var2 + var1.length; var6++) {
         this.field45122.write(var1[var6] & 255);
         this.field45122.write(var1[var6] >> 8 & 0xFF);
         this.field45126 += 2;
      }
   }

   public void method37642() throws IOException {
      this.method37643();
      this.field45122.close();
   }

   private void method37643() throws IOException {
      this.field45122.seek(0L);
      int var3 = (this.field45125 + 7) / 8;
      this.field45122.writeInt(1380533830);
      this.field45122.writeInt(Integer.reverseBytes(this.field45126 + 36));
      this.field45122.writeLong(6287401410857104416L);
      this.field45122.writeInt(Integer.reverseBytes(16));
      this.field45122.writeShort(Short.reverseBytes((short)1));
      this.field45122.writeShort(Short.reverseBytes((short)this.field45124));
      this.field45122.writeInt(Integer.reverseBytes(this.field45123));
      this.field45122.writeInt(Integer.reverseBytes(this.field45123 * this.field45124 * var3));
      this.field45122.writeShort(Short.reverseBytes((short)(this.field45124 * var3)));
      this.field45122.writeShort(Short.reverseBytes((short)this.field45125));
      this.field45122.writeInt(1684108385);
      this.field45122.writeInt(Integer.reverseBytes(this.field45126));
   }
}
