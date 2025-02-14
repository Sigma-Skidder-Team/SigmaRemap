package mapped;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;

public class Class2424 implements Serializable {
   private static String[] field16431;
   private static final long field16432 = -2831273345165209113L;
   public String field16433;
   public transient ByteBuffer field16434;

   public Class2424(String var1, ByteBuffer var2) {
      this.field16434 = var2;
      this.field16433 = var1;
   }

   public ByteBuffer method10383() {
      return this.field16434;
   }

   private void method10384(ObjectOutputStream var1) throws IOException {
      var1.defaultWriteObject();
      var1.writeInt(this.field16434.capacity());
      var1.write(this.field16434.array());
   }

   private void method10385(ObjectInputStream var1) throws IOException, ClassNotFoundException {
      var1.defaultReadObject();
      int var4 = var1.readInt();
      byte[] var5 = new byte[var4];
      var1.read(var5, 0, var4);
      this.field16434 = ByteBuffer.wrap(var5, 0, var4);
   }

   public String method10386() {
      return this.field16433;
   }
}
