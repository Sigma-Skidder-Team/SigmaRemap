package mapped;

import java.io.InputStream;

public class Class1778 extends InputStream {
   public final Class1734 field9612;

   public Class1778(Class1734 var1) {
      this.field9612 = var1;
   }

   @Override
   public int read() {
      return this.field9612.field9423 <= 0L ? -1 : this.field9612.method7596() & 0xFF;
   }

   @Override
   public int read(byte[] var1, int var2, int var3) {
      return this.field9612.method7625(var1, var2, var3);
   }

   @Override
   public int available() {
      return (int)Math.min(this.field9612.field9423, 2147483647L);
   }

   @Override
   public void close() {
   }

   @Override
   public String toString() {
      return this.field9612 + ".inputStream()";
   }
}
