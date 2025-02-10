package mapped;

import java.io.IOException;

public class Class5023 extends FullBox {
   private static String[] field22982;
   private String field22983;
   private String field22984;

   public Class5023(String var1) {
      super(var1);
   }

   @Override
   public void method15262(MP4InputStream var1) throws IOException {
      this.method15384(var1);
      this.field22984 = var1.method31867((int)this.method15430(var1));
   }

   public void method15384(MP4InputStream var1) throws IOException {
      super.method15262(var1);
      this.field22983 = Class6170.method19068(var1.readBits(2));
   }

   public String method15385() {
      return this.field22983;
   }

   public String method15386() {
      return this.field22984;
   }
}
