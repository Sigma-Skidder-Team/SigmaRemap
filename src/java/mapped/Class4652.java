package mapped;

import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Objects;

public class Class4652 extends Class4653 {
   public Class4652(Schema var1, boolean var2) {
      super("EntitySkeletonSplitFix", var1, var2);
   }

   @Override
   public Pair<String, Dynamic<?>> method14619(String var1, Dynamic<?> var2) {
      if (Objects.equals(var1, "Skeleton")) {
         int var5 = var2.get("SkeletonType").asInt(0);
         if (var5 != 1) {
            if (var5 == 2) {
               var1 = "Stray";
            }
         } else {
            var1 = "WitherSkeleton";
         }
      }

      return Pair.of(var1, var2);
   }
}
