package mapped;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;

public class Class8554 extends Class8550<Integer> {
   private final ImmutableSet<Integer> field38445;

   public Class8554(String var1, int var2, int var3) {
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

         this.field38445 = ImmutableSet.copyOf(var6);
      }
   }

   @Override
   public Collection<Integer> method30474() {
      return this.field38445;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 instanceof Class8554 && super.equals(var1)) {
            Class8554 var4 = (Class8554)var1;
            return this.field38445.equals(var4.field38445);
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int method30477() {
      return 31 * super.method30477() + this.field38445.hashCode();
   }

   public static Class8554 method30488(String var0, int var1, int var2) {
      return new Class8554(var0, var1, var2);
   }

   @Override
   public Optional<Integer> method30476(String var1) {
      try {
         Integer var4 = Integer.valueOf(var1);
         return this.field38445.contains(var4) ? Optional.<Integer>of(var4) : Optional.<Integer>empty();
      } catch (NumberFormatException var5) {
         return Optional.<Integer>empty();
      }
   }

   public String method30475(Integer var1) {
      return var1.toString();
   }
}
