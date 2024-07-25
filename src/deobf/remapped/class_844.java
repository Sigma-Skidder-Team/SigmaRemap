package remapped;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

public class class_844 extends ByteArrayOutputStream {
   private static String[] field_4413;
   private final class_2034 field_4415;

   public class_844(class_1209 var1, class_2034 var2) {
      super(8096);
      this.field_4414 = var1;
      super.write(0);
      super.write(0);
      super.write(0);
      super.write(0);
      super.write(class_1209.method_5342(var1).method_39165());
      this.field_4415 = var2;
   }

   @Override
   public void close() throws IOException {
      ByteBuffer var3 = ByteBuffer.wrap(this.buf, 0, this.count);
      var3.putInt(0, this.count - 5 + 1);
      this.field_4414.method_5341(this.field_4415, var3);
   }
}
