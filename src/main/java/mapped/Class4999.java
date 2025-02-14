package mapped;

import java.io.IOException;

public class Class4999 extends FullBox {
   private boolean field22935;
   private String field22936;

   public Class4999() {
      super("Data Entry Url Box");
   }

   @Override
   public void method15262(MP4InputStream var1) throws IOException {
      super.method15262(var1);
      this.field22935 = (this.field22851 & 1) == 1;
      if (!this.field22935) {
         this.field22936 = var1.method31866((int)this.method15430(var1), "UTF-8");
      }
   }

   public boolean method15350() {
      return this.field22935;
   }

   public String method15351() {
      return this.field22936;
   }
}
