package mapped;

import net.sourceforge.jaad.mp4.MP4InputStream;

import java.io.IOException;

public class Class5017 extends Class4975 {
   private String field22974;
   private String field22975;

   public Class5017() {
      super("Copyright Box");
   }

   @Override
   public void method15262(MP4InputStream var1) throws IOException {
      if (this.field23026.method15431() != 1969517665L) {
         if (this.field23026.method15431() == 1768715124L) {
            this.method15441(var1);
         }
      } else {
         super.method15262(var1);
         this.field22974 = Class6170.method19068(var1.readBits(2));
         this.field22975 = var1.method31867((int)this.method15430(var1));
      }
   }

   public String method15376() {
      return this.field22974;
   }

   public String method15377() {
      return this.field22975;
   }
}
