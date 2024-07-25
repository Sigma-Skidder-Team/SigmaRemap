package remapped;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class class_2275 {
   private static String[] field_11295;
   private final ByteArrayOutputStream field_11296;
   private final DataOutputStream field_11297;

   public class_2275(int var1) {
      this.field_11296 = new ByteArrayOutputStream(var1);
      this.field_11297 = new DataOutputStream(this.field_11296);
   }

   public void method_10488(byte[] var1) throws IOException {
      this.field_11297.write(var1, 0, var1.length);
   }

   public void method_10490(String var1) throws IOException {
      this.field_11297.writeBytes(var1);
      this.field_11297.write(0);
   }

   public void method_10489(int var1) throws IOException {
      this.field_11297.write(var1);
   }

   public void method_10487(short var1) throws IOException {
      this.field_11297.writeShort(Short.reverseBytes(var1));
   }

   public byte[] method_10493() {
      return this.field_11296.toByteArray();
   }

   public void method_10491() {
      this.field_11296.reset();
   }
}
