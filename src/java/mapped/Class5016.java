package mapped;

import java.io.IOException;

public class Class5016 extends Class4975 {
   private String field22973;

   public Class5016() {
      super("OMA DRM Discrete Media Headers Box");
   }

   @Override
   public void method15262(DataStreamReader var1) throws IOException {
      super.method15262(var1);
      int var4 = var1.readInt();
      this.field22973 = var1.readString(var4);
      this.method15441(var1);
   }

   public String method15375() {
      return this.field22973;
   }
}
