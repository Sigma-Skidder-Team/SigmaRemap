package mapped;

import java.io.DataOutput;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Class1758 extends FilterOutputStream implements DataOutput {
   public Class1758(OutputStream var1) {
      super(var1);
   }

   @Override
   public synchronized void write(int var1) throws IOException {
      this.out.write(var1);
   }

   @Override
   public synchronized void write(byte[] var1, int var2, int var3) throws IOException {
      this.out.write(var1, var2, var3);
   }

   @Override
   public void flush() throws IOException {
      this.out.flush();
   }

   @Override
   public void writeBoolean(boolean var1) throws IOException {
      this.out.write(!var1 ? 0 : 1);
   }

   @Override
   public void writeByte(int var1) throws IOException {
      this.out.write(var1);
   }

   @Override
   public void writeShort(int var1) throws IOException {
      this.out.write(var1 & 0xFF);
      this.out.write(var1 >>> 8 & 0xFF);
   }

   @Override
   public void writeChar(int var1) throws IOException {
      this.out.write(var1 & 0xFF);
      this.out.write(var1 >>> 8 & 0xFF);
   }

   @Override
   public void writeInt(int var1) throws IOException {
      this.out.write(var1 & 0xFF);
      this.out.write(var1 >>> 8 & 0xFF);
      this.out.write(var1 >>> 16 & 0xFF);
      this.out.write(var1 >>> 24 & 0xFF);
   }

   @Override
   public void writeLong(long var1) throws IOException {
      this.out.write((int)(var1 & 255L));
      this.out.write((int)(var1 >>> 8 & 255L));
      this.out.write((int)(var1 >>> 16 & 255L));
      this.out.write((int)(var1 >>> 24 & 255L));
      this.out.write((int)(var1 >>> 32 & 255L));
      this.out.write((int)(var1 >>> 40 & 255L));
      this.out.write((int)(var1 >>> 48 & 255L));
      this.out.write((int)(var1 >>> 56 & 255L));
   }

   @Override
   public void writeFloat(float var1) throws IOException {
      this.writeInt(Float.floatToIntBits(var1));
   }

   @Override
   public void writeDouble(double var1) throws IOException {
      this.writeLong(Double.doubleToLongBits(var1));
   }

   @Override
   public void writeBytes(String var1) throws IOException {
      int var4 = var1.length();

      for (int var5 = 0; var5 < var4; var5++) {
         this.out.write((byte)var1.charAt(var5));
      }
   }

   @Override
   public void writeChars(String var1) throws IOException {
      int var4 = var1.length();

      for (int var5 = 0; var5 < var4; var5++) {
         char var6 = var1.charAt(var5);
         this.out.write(var6 & 255);
         this.out.write(var6 >>> '\b' & 0xFF);
      }
   }

   @Override
   public void writeUTF(String var1) throws IOException {
      byte[] var4 = var1.getBytes("UTF-8");
      this.writeShort(var4.length);
      this.write(var4);
   }
}
