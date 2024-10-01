package mapped;

import java.io.IOException;

public class Class5003 extends Class4975 {
   private boolean field22939;
   private String field22940;
   private String field22941;

   public Class5003() {
      super("Data Entry Urn Box");
   }

   @Override
   public void method15262(DataStreamReader var1) throws IOException {
      super.method15262(var1);
      this.field22939 = (this.field22851 & 1) == 1;
      if (!this.field22939) {
         this.field22940 = var1.method31866((int)this.method15430(var1), "UTF-8");
         if (this.method15430(var1) > 0L) {
            this.field22941 = var1.method31866((int)this.method15430(var1), "UTF-8");
         }
      }
   }

   public boolean method15354() {
      return this.field22939;
   }

   public String method15355() {
      return this.field22940;
   }

   public String method15356() {
      return this.field22941;
   }
}
