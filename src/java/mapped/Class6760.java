package mapped;

import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;

public class Class6760 implements Class6759 {
   private final int field29466;
   private final Set<Class8506> field29467 = Sets.newIdentityHashSet();

   public Class6760(int var1) {
      this.field29466 = var1;
   }

   @Nullable
   @Override
   public Class8506 method20608() {
      if (this.field29467.size() < this.field29466) {
         Class8506 var3 = Class8506.method30112();
         if (var3 != null) {
            this.field29467.add(var3);
         }

         return var3;
      } else {
         Class7993.method27291().warn("Maximum sound pool size {} reached", this.field29466);
         return null;
      }
   }

   @Override
   public boolean method20609(Class8506 var1) {
      if (this.field29467.remove(var1)) {
         var1.method30113();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void method20610() {
      this.field29467.forEach(Class8506::method30113);
      this.field29467.clear();
   }

   @Override
   public int method20611() {
      return this.field29466;
   }

   @Override
   public int method20612() {
      return this.field29467.size();
   }
}
