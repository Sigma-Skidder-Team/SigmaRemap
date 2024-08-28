package mapped;

import java.io.IOException;

public class Class4993 extends Class4975 {
   private String field22912;

   public Class4993(String var1) {
      super(var1);
   }

   @Override
   public void method15262(Class8827 var1) throws IOException {
      super.method15262(var1);
      byte[] var4 = new byte[(int)this.method15430(var1)];
      var1.method31864(var4);
      this.field22912 = new String(var4, "UTF-8");
   }

   public String method15326() {
      return this.field22912;
   }
}
