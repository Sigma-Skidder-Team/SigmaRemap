package remapped;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;

public class class_1377 implements Serializable {
   private static String[] field_7478;
   private static final long field_7479 = -2831273345165209113L;
   public String field_7480;
   public transient ByteBuffer field_7477;

   public class_1377(String var1, ByteBuffer var2) {
      this.field_7477 = var2;
      this.field_7480 = var1;
   }

   public ByteBuffer method_6361() {
      return this.field_7477;
   }

   private void method_6365(ObjectOutputStream var1) throws IOException {
      var1.defaultWriteObject();
      var1.writeInt(this.field_7477.capacity());
      var1.write(this.field_7477.array());
   }

   private void method_6362(ObjectInputStream var1) throws IOException, ClassNotFoundException {
      var1.defaultReadObject();
      int var4 = var1.readInt();
      byte[] var5 = new byte[var4];
      var1.read(var5, 0, var4);
      this.field_7477 = ByteBuffer.wrap(var5, 0, var4);
   }

   public String method_6363() {
      return this.field_7480;
   }
}
