package remapped;

import java.io.ByteArrayOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class class_8790 extends FilterInputStream {
   private final String field_44971;
   private boolean field_44972;

   public class_8790(InputStream var1, Identifier var2, String var3) {
      super(var1);
      ByteArrayOutputStream var6 = new ByteArrayOutputStream();
      new Exception().printStackTrace(new PrintStream(var6));
      this.field_44971 = "Leaked resource: '" + var2 + "' loaded from pack: '" + var3 + "'\n" + var6;
   }

   @Override
   public void close() throws IOException {
      super.close();
      this.field_44972 = true;
   }

   @Override
   public void finalize() throws Throwable {
      if (!this.field_44972) {
         class_3797.method_17633().warn(this.field_44971);
      }

      super.finalize();
   }
}
