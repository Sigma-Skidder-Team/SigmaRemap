package mapped;

import net.minecraft.util.ResourceLocation;

import java.io.ByteArrayOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class Class1780 extends FilterInputStream {
   private final String field9614;
   private boolean field9615;

   public Class1780(InputStream var1, ResourceLocation var2, String var3) {
      super(var1);
      ByteArrayOutputStream var6 = new ByteArrayOutputStream();
      new Exception().printStackTrace(new PrintStream(var6));
      this.field9614 = "Leaked resource: '" + var2 + "' loaded from pack: '" + var3 + "'\n" + var6;
   }

   @Override
   public void close() throws IOException {
      super.close();
      this.field9615 = true;
   }

   @Override
   public void finalize() throws Throwable {
      if (!this.field9615) {
         Class1817.method8067().warn(this.field9614);
      }

      super.finalize();
   }
}
