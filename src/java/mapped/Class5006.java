package mapped;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Class5006 extends Class4975 {
   private Map<Long, Long> field22943 = new HashMap<Long, Long>();

   public Class5006() {
      super("Progressive Download Information Box");
   }

   @Override
   public void method15262(Class8827 var1) throws IOException {
      super.method15262(var1);

      while (this.method15430(var1) > 0L) {
         long var4 = var1.method31863(4);
         long var6 = var1.method31863(4);
         this.field22943.put(var4, var6);
      }
   }

   public Map<Long, Long> method15358() {
      return this.field22943;
   }
}
