package mapped;

import java.io.IOException;

public class Class5055 extends Class5041 {
   private long field23057;
   private long field23058;

   public Class5055() {
      super("Pixel Aspect Ratio Box");
   }

   @Override
   public void method15262(MP4InputStream var1) throws IOException {
      this.field23057 = var1.readBits(4);
      this.field23058 = var1.readBits(4);
   }

   public long method15466() {
      return this.field23057;
   }

   public long method15467() {
      return this.field23058;
   }
}
