package mapped;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import javax.sound.sampled.AudioFormat;

public class Class1800 implements Class1798 {
   private static String[] field9699;
   private final Class8937 field9700;
   private Class1798 field9701;
   private final BufferedInputStream field9702;

   public Class1800(Class8937 var1, InputStream var2) throws IOException {
      this.field9700 = var1;
      this.field9702 = new BufferedInputStream(var2);
      this.field9702.mark(Integer.MAX_VALUE);
      this.field9701 = var1.method32665(new Class1779(this.field9702));
   }

   @Override
   public AudioFormat method7865() {
      return this.field9701.method7865();
   }

   @Override
   public ByteBuffer method7866(int var1) throws IOException {
      ByteBuffer var4 = this.field9701.method7866(var1);
      if (!var4.hasRemaining()) {
         this.field9701.close();
         this.field9702.reset();
         this.field9701 = this.field9700.method32665(new Class1779(this.field9702));
         var4 = this.field9701.method7866(var1);
      }

      return var4;
   }

   @Override
   public void close() throws IOException {
      this.field9701.close();
      this.field9702.close();
   }
}
