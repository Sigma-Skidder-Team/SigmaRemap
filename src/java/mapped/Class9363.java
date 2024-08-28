package mapped;

import com.google.common.collect.Lists;
import java.util.List;

public class Class9363 {
   private final Class1006 field43441;
   private final List<Entity> field43442 = Lists.newArrayList();
   private final List<Entity> field43443 = Lists.newArrayList();

   public Class9363(Class1006 var1) {
      this.field43441 = var1;
   }

   public void method35459() {
      this.field43442.clear();
      this.field43443.clear();
   }

   public boolean method35460(Entity var1) {
      if (!this.field43442.contains(var1)) {
         if (!this.field43443.contains(var1)) {
            this.field43441.field5024.method6820().startSection("canSee");
            boolean var4 = this.field43441.method3135(var1);
            this.field43441.field5024.method6820().endSection();
            if (!var4) {
               this.field43443.add(var1);
            } else {
               this.field43442.add(var1);
            }

            return var4;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }
}
