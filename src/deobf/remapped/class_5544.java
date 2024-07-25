package remapped;

import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;

public class class_5544 implements class_1654 {
   private final int field_28254;
   private final Set<class_4850> field_28253 = Sets.newIdentityHashSet();

   public class_5544(int var1) {
      this.field_28254 = var1;
   }

   @Nullable
   @Override
   public class_4850 method_7383() {
      if (this.field_28253.size() < this.field_28254) {
         class_4850 var3 = class_4850.method_22347();
         if (var3 != null) {
            this.field_28253.add(var3);
         }

         return var3;
      } else {
         class_3301.method_15147().warn("Maximum sound pool size {} reached", this.field_28254);
         return null;
      }
   }

   @Override
   public boolean method_7382(class_4850 var1) {
      if (this.field_28253.remove(var1)) {
         var1.method_22341();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void method_7379() {
      this.field_28253.forEach(class_4850::method_22341);
      this.field_28253.clear();
   }

   @Override
   public int method_7381() {
      return this.field_28254;
   }

   @Override
   public int method_7380() {
      return this.field_28253.size();
   }
}
