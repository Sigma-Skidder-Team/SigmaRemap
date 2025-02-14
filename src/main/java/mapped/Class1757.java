package mapped;

import java.io.OutputStream;

public class Class1757 extends OutputStream {
   public final Class1734 field9528;

   public Class1757(Class1734 var1) {
      this.field9528 = var1;
   }

   @Override
   public void write(int var1) {
      this.field9528.method7570((byte)var1);
   }

   @Override
   public void write(byte[] var1, int var2, int var3) {
      this.field9528.method7631(var1, var2, var3);
   }

   @Override
   public void flush() {
   }

   @Override
   public void close() {
   }

   @Override
   public String toString() {
      return this.field9528 + ".outputStream()";
   }
}
