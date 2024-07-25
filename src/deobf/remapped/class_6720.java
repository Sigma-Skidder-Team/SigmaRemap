package remapped;

import com.google.common.collect.ImmutableSet;
import java.util.Collection;
import java.util.Optional;

public class class_6720 extends class_5019<Boolean> {
   private final ImmutableSet<Boolean> field_34703 = ImmutableSet.of(true, false);

   public class_6720(String var1) {
      super(var1, Boolean.class);
   }

   @Override
   public Collection<Boolean> method_23105() {
      return this.field_34703;
   }

   public static class_6720 method_30845(String var0) {
      return new class_6720(var0);
   }

   @Override
   public Optional<Boolean> method_23108(String var1) {
      return !"true".equals(var1) && !"false".equals(var1) ? Optional.<Boolean>empty() : Optional.<Boolean>of(Boolean.valueOf(var1));
   }

   public String method_30846(Boolean var1) {
      return var1.toString();
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 instanceof class_6720 && super.equals(var1)) {
            class_6720 var4 = (class_6720)var1;
            return this.field_34703.equals(var4.field_34703);
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int method_23106() {
      return 31 * super.method_23106() + this.field_34703.hashCode();
   }
}
