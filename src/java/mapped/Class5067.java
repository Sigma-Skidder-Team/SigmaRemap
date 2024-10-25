package mapped;

import net.sourceforge.jaad.mp4.MP4InputStream;

import java.io.IOException;

public class Class5067 extends Class5041 {
   private long field23093;

   public Class5067() {
      super("Original Format Box");
   }

   @Override
   public void method15262(MP4InputStream var1) throws IOException {
      this.field23093 = var1.readBits(4);
   }

   public long method15503() {
      return this.field23093;
   }
}
