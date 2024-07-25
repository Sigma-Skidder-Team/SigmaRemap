package remapped;

import java.io.IOException;
import java.io.InputStream;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;

public abstract class class_728 extends AudioInputStream implements class_2473 {
   private byte[] field_3985;
   public final class_1111 field_3984 = new class_1111(this);

   public class_728(InputStream var1, AudioFormat var2, long var3) throws IOException {
      super(var1, var2, var3);
   }

   @Override
   public int read() throws IOException {
      int var3 = -1;
      if (this.field_3985 == null) {
         this.field_3985 = new byte[1];
      }

      if (this.field_3984.method_4923(this.field_3985, 0, 1) != -1) {
         var3 = this.field_3985[0] & 255;
      } else {
         var3 = -1;
      }

      return var3;
   }

   @Override
   public int read(byte[] var1) throws IOException {
      return this.field_3984.method_4923(var1, 0, var1.length);
   }

   @Override
   public int read(byte[] var1, int var2, int var3) throws IOException {
      return this.field_3984.method_4923(var1, var2, var3);
   }

   @Override
   public long skip(long var1) throws IOException {
      int var5 = (int)var1;
      byte[] var6 = new byte[var5];

      while (var5 > 0) {
         var5 -= this.field_3984.method_4923(var6, 0, var5);
      }

      return var1;
   }

   @Override
   public int available() throws IOException {
      return this.field_3984.method_4914();
   }

   @Override
   public void close() throws IOException {
      this.field_3984.method_4917();
   }

   @Override
   public boolean markSupported() {
      return false;
   }

   @Override
   public void mark(int var1) {
   }

   @Override
   public void reset() throws IOException {
      throw new IOException("mark not supported");
   }
}
