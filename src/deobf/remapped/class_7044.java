package remapped;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;

public class class_7044 extends class_5019<Integer> {
   private final ImmutableSet<Integer> field_36382;

   public class_7044(String var1, int var2, int var3) {
      super(var1, Integer.class);
      if (var2 < 0) {
         throw new IllegalArgumentException("Min value of " + var1 + " must be 0 or greater");
      } else if (var3 <= var2) {
         throw new IllegalArgumentException("Max value of " + var1 + " must be greater than min (" + var2 + ")");
      } else {
         HashSet var6 = Sets.newHashSet();

         for (int var7 = var2; var7 <= var3; var7++) {
            var6.add(var7);
         }

         this.field_36382 = ImmutableSet.copyOf(var6);
      }
   }

   @Override
   public Collection<Integer> method_23105() {
      return this.field_36382;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 instanceof class_7044 && super.equals(var1)) {
            class_7044 var4 = (class_7044)var1;
            return this.field_36382.equals(var4.field_36382);
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int method_23106() {
      return 31 * super.method_23106() + this.field_36382.hashCode();
   }

   public static class_7044 method_32354(String var0, int var1, int var2) {
      return new class_7044(var0, var1, var2);
   }

   @Override
   public Optional<Integer> method_23108(String var1) {
      try {
         Integer var4 = Integer.valueOf(var1);
         return this.field_36382.contains(var4) ? Optional.<Integer>of(var4) : Optional.<Integer>empty();
      } catch (NumberFormatException var5) {
         return Optional.<Integer>empty();
      }
   }

   public String method_32353(Integer var1) {
      return var1.toString();
   }
}
