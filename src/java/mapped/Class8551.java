package mapped;

import com.google.common.collect.ImmutableSet;
import java.util.Collection;
import java.util.Optional;

public class Class8551 extends Class8550<Boolean> {
   private final ImmutableSet<Boolean> field38441 = ImmutableSet.of(true, false);

   public Class8551(String var1) {
      super(var1, Boolean.class);
   }

   @Override
   public Collection<Boolean> method30474() {
      return this.field38441;
   }

   public static Class8551 method30480(String var0) {
      return new Class8551(var0);
   }

   @Override
   public Optional<Boolean> method30476(String var1) {
      return !"true".equals(var1) && !"false".equals(var1) ? Optional.<Boolean>empty() : Optional.<Boolean>of(Boolean.valueOf(var1));
   }

   public String method30475(Boolean var1) {
      return var1.toString();
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 instanceof Class8551 && super.equals(var1)) {
            Class8551 var4 = (Class8551)var1;
            return this.field38441.equals(var4.field38441);
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int method30477() {
      return 31 * super.method30477() + this.field38441.hashCode();
   }
}
