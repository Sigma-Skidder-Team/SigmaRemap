package mapped;

import java.io.DataInput;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Class1781 extends FilterInputStream implements DataInput {
   public Class1781(InputStream var1) {
      super(var1);
   }

   @Override
   public int read(byte[] var1) throws IOException {
      return this.in.read(var1, 0, var1.length);
   }

   @Override
   public int read(byte[] var1, int var2, int var3) throws IOException {
      return this.in.read(var1, var2, var3);
   }

   @Override
   public void readFully(byte[] var1) throws IOException {
      this.readFully(var1, 0, var1.length);
   }

   @Override
   public void readFully(byte[] var1, int var2, int var3) throws IOException {
      if (var3 < 0) {
         throw new IndexOutOfBoundsException();
      } else {
         int var6 = 0;

         while (var6 < var3) {
            int var7 = this.in.read(var1, var2 + var6, var3 - var6);
            if (var7 < 0) {
               throw new EOFException();
            }

            var6 += var7;
         }
      }
   }

   @Override
   public int skipBytes(int var1) throws IOException {
      int var4 = 0;
      int var5 = 0;

      while (var4 < var1 && (var5 = (int)this.in.skip((long)(var1 - var4))) > 0) {
         var4 += var5;
      }

      return var4;
   }

   @Override
   public boolean readBoolean() throws IOException {
      int var3 = this.in.read();
      if (var3 >= 0) {
         return var3 != 0;
      } else {
         throw new EOFException();
      }
   }

   @Override
   public byte readByte() throws IOException {
      int var3 = this.in.read();
      if (var3 >= 0) {
         return (byte)var3;
      } else {
         throw new EOFException();
      }
   }

   @Override
   public int readUnsignedByte() throws IOException {
      int var3 = this.in.read();
      if (var3 >= 0) {
         return var3;
      } else {
         throw new EOFException();
      }
   }

   @Override
   public short readShort() throws IOException {
      int var3 = this.in.read();
      int var4 = this.in.read();
      if ((var3 | var4) >= 0) {
         return (short)(var3 | var4 << 8);
      } else {
         throw new EOFException();
      }
   }

   @Override
   public int readUnsignedShort() throws IOException {
      int var3 = this.in.read();
      int var4 = this.in.read();
      if ((var3 | var4) >= 0) {
         return var3 | var4 << 8;
      } else {
         throw new EOFException();
      }
   }

   @Override
   public char readChar() throws IOException {
      int var3 = this.in.read();
      int var4 = this.in.read();
      if ((var3 | var4) >= 0) {
         return (char)(var3 | var4 << 8);
      } else {
         throw new EOFException();
      }
   }

   @Override
   public int readInt() throws IOException {
      int var3 = this.in.read();
      int var4 = this.in.read();
      int var5 = this.in.read();
      int var6 = this.in.read();
      if ((var3 | var4 | var5 | var6) >= 0) {
         return var3 | var4 << 8 | var5 << 16 | var6 << 24;
      } else {
         throw new EOFException();
      }
   }

   @Override
   public long readLong() throws IOException {
      long var3 = (long)this.in.read();
      long var5 = (long)this.in.read();
      long var7 = (long)this.in.read();
      long var9 = (long)this.in.read();
      long var11 = (long)this.in.read();
      long var13 = (long)this.in.read();
      long var15 = (long)this.in.read();
      long var17 = (long)this.in.read();
      if ((var3 | var5 | var7 | var9 | var11 | var13 | var15 | var17) >= 0L) {
         return var3 | var5 << 8 | var7 << 16 | var9 << 24 | var11 << 32 | var13 << 40 | var15 << 48 | var17 << 56;
      } else {
         throw new EOFException();
      }
   }

   @Override
   public float readFloat() throws IOException {
      return Float.intBitsToFloat(this.readInt());
   }

   @Override
   public double readDouble() throws IOException {
      return Double.longBitsToDouble(this.readLong());
   }

   @Override
   public String readLine() throws IOException {
      throw new UnsupportedOperationException("Use readUTF.");
   }

   @Override
   public String readUTF() throws IOException {
      byte[] var3 = new byte[this.readUnsignedShort()];
      this.readFully(var3);
      return new String(var3, "UTF-8");
   }
}
