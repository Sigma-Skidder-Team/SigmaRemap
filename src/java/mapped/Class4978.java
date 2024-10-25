package mapped;

import net.sourceforge.jaad.mp4.MP4InputStream;

import java.io.IOException;

public class Class4978 extends Class4975 {
   private String field22862;
   private String field22863;

   public Class4978() {
      super("Genre Box");
   }

   @Override
   public void method15262(MP4InputStream var1) throws IOException {
      if (this.field23026.method15431() != 1969517665L) {
         this.method15441(var1);
      } else {
         super.method15262(var1);
         this.field22862 = Class6170.method19068(var1.readBits(2));
         byte[] var4 = var1.method31868((int)this.method15430(var1), 0);
         this.field22863 = new String(var4, "UTF-8");
      }
   }

   public String method15273() {
      return this.field22862;
   }

   public String method15274() {
      return this.field22863;
   }
}
