package mapped;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Class5044 extends Class5041 {
   private final Map<String, String> field23032 = new HashMap<String, String>();

   public Class5044() {
      super("Nero Metadata Tags Box");
   }

   @Override
   public void method15262(Class8827 var1) throws IOException {
      var1.method31870(12L);

      while (this.method15430(var1) > 0L && var1.method31861() == 128) {
         var1.method31870(2L);
         String var4 = var1.method31866((int)this.method15430(var1), "UTF-8");
         var1.method31870(4L);
         int var5 = var1.method31861();
         String var6 = var1.method31865(var5);
         this.field23032.put(var4, var6);
      }
   }

   public Map<String, String> method15447() {
      return this.field23032;
   }
}
