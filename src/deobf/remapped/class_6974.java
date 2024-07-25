package remapped;

import java.io.InputStream;

public class class_6974 extends InputStream {
   public class_6974(class_7059 var1) {
      this.field_35837 = var1;
   }

   @Override
   public int read() {
      return this.field_35837.field_36433 <= 0L ? -1 : this.field_35837.method_36602() & 0xFF;
   }

   @Override
   public int read(byte[] var1, int var2, int var3) {
      return this.field_35837.method_36578(var1, var2, var3);
   }

   @Override
   public int available() {
      return (int)Math.min(this.field_35837.field_36433, 2147483647L);
   }

   @Override
   public void close() {
   }

   @Override
   public String toString() {
      return this.field_35837 + ".inputStream()";
   }
}
