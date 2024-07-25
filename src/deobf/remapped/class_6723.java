package remapped;

import java.io.OutputStream;

public class class_6723 extends OutputStream {
   public class_6723(class_7059 var1) {
      this.field_34724 = var1;
   }

   @Override
   public void write(int var1) {
      this.field_34724.method_32494((byte)var1);
   }

   @Override
   public void write(byte[] var1, int var2, int var3) {
      this.field_34724.method_32489(var1, var2, var3);
   }

   @Override
   public void flush() {
   }

   @Override
   public void close() {
   }

   @Override
   public String toString() {
      return this.field_34724 + ".outputStream()";
   }
}
