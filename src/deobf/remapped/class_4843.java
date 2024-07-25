package remapped;

import java.util.List;
import java.util.Optional;

public class class_4843 implements class_7835 {
   private final Entity field_24168;
   private final boolean field_24169;

   public class_4843(Entity var1, boolean var2) {
      this.field_24168 = var1;
      this.field_24169 = var2;
   }

   @Override
   public class_1343 method_35464() {
      return !this.field_24169
         ? this.field_24168.method_37245()
         : this.field_24168.method_37245().method_6214(0.0, (double)this.field_24168.method_37277(), 0.0);
   }

   @Override
   public BlockPos method_35462() {
      return this.field_24168.method_37075();
   }

   @Override
   public boolean method_35463(class_5834 var1) {
      if (!(this.field_24168 instanceof class_5834)) {
         return true;
      } else {
         Optional var4 = var1.method_26525().<List<class_5834>>method_5138(class_6044.field_30901);
         return this.field_24168.isAlive() && var4.isPresent() && ((List)var4.get()).contains(this.field_24168);
      }
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.field_24168;
   }
}
