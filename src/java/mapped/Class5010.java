package mapped;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Class5010 extends Class4975 {
   private final Map<Long, String> field22962 = new HashMap<Long, String>();

   public Class5010() {
      super("Chapter Box");
   }

   @Override
   public void method15262(Class8827 var1) throws IOException {
      super.method15262(var1);
      var1.method31870(4L);
      int var4 = var1.method31861();

      for (int var5 = 0; var5 < var4; var5++) {
         long var6 = var1.method31863(8);
         int var8 = var1.method31861();
         String var9 = var1.method31865(var8);
         this.field22962.put(var6, var9);
      }
   }

   public Map<Long, String> method15365() {
      return this.field22962;
   }
}
