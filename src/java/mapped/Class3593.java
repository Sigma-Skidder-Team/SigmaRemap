package mapped;

import java.util.Comparator;

public class Class3593 implements Comparator<BlockPos> {
   private static String[] field19539;
   public final Class5235 field19540;

   public Class3593(Class5235 var1) {
      this.field19540 = var1;
   }

   public int compare(BlockPos var1, BlockPos var2) {
      return !(
            Math.sqrt(
                  Class5235.method16322()
                     .field1339
                     .method3276((double)var1.method8304() + 0.5, (double)var1.getY() + 0.5, (double)var1.method8306() + 0.5)
               )
               > Math.sqrt(
                  Class5235.method16323()
                     .field1339
                     .method3276((double)var2.method8304() + 0.5, (double)var2.getY() + 0.5, (double)var2.method8306() + 0.5)
               )
         )
         ? -1
         : 1;
   }
}
