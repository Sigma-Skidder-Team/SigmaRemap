package mapped;

import java.io.IOException;

public class Class5082 extends FullBox {
   private String field23140;

   public Class5082() {
      super("Encoder Box");
   }

   @Override
   public void method15262(MP4InputStream var1) throws IOException {
      if (this.field23026.method15431() != 1768715124L) {
         super.method15262(var1);
         this.field23140 = var1.readString((int)this.method15430(var1));
      } else {
         this.method15441(var1);
      }
   }

   public String method15538() {
      return this.field23140;
   }
}
