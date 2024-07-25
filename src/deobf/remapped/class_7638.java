package remapped;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import javax.sound.sampled.AudioFormat;

public class class_7638 implements class_2613 {
   private static String[] field_38851;
   private final class_6445 field_38850;
   private class_2613 field_38852;
   private final BufferedInputStream field_38853;

   public class_7638(class_6445 var1, InputStream var2) throws IOException {
      this.field_38850 = var1;
      this.field_38853 = new BufferedInputStream(var2);
      this.field_38853.mark(Integer.MAX_VALUE);
      this.field_38852 = var1.method_29404(new class_8991(this.field_38853, null));
   }

   @Override
   public AudioFormat method_11855() {
      return this.field_38852.method_11855();
   }

   @Override
   public ByteBuffer method_11856(int var1) throws IOException {
      ByteBuffer var4 = this.field_38852.method_11856(var1);
      if (!var4.hasRemaining()) {
         this.field_38852.close();
         this.field_38853.reset();
         this.field_38852 = this.field_38850.method_29404(new class_8991(this.field_38853, null));
         var4 = this.field_38852.method_11856(var1);
      }

      return var4;
   }

   @Override
   public void close() throws IOException {
      this.field_38852.close();
      this.field_38853.close();
   }
}
