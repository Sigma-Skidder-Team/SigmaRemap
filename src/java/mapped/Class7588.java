package mapped;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class7588 {
   private static String[] field32572;
   private final ByteArrayOutputStream field32573;
   private final DataOutputStream field32574;

   public Class7588(int var1) {
      this.field32573 = new ByteArrayOutputStream(var1);
      this.field32574 = new DataOutputStream(this.field32573);
   }

   public void method24839(byte[] var1) throws IOException {
      this.field32574.write(var1, 0, var1.length);
   }

   public void method24840(String var1) throws IOException {
      this.field32574.writeBytes(var1);
      this.field32574.write(0);
   }

   public void method24841(int var1) throws IOException {
      this.field32574.write(var1);
   }

   public void method24842(short var1) throws IOException {
      this.field32574.writeShort(Short.reverseBytes(var1));
   }

   public byte[] method24843() {
      return this.field32573.toByteArray();
   }

   public void method24844() {
      this.field32573.reset();
   }
}
