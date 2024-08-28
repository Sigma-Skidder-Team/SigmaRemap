package mapped;

import java.io.IOException;

public class Class5028 extends Class4975 {
   private String field22996;

   public Class5028() {
      super("OMA DRM Content ID Box");
   }

   @Override
   public void method15262(Class8827 var1) throws IOException {
      super.method15262(var1);
      int var4 = (int)var1.method31863(2);
      this.field22996 = var1.method31865(var4);
   }

   public String method15398() {
      return this.field22996;
   }
}
