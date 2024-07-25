package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.Set;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class class_2136 extends class_3498 {
   public static final Codec<class_2136> field_10714 = class_6325.field_32303.fieldOf("biome").xmap(class_2136::new, var0 -> var0.field_10712).stable().codec();
   private final Supplier<class_6325> field_10712;

   public class_2136(class_6325 var1) {
      this(() -> var1);
   }

   public class_2136(Supplier<class_6325> var1) {
      super(ImmutableList.of(var1.get()));
      this.field_10712 = var1;
   }

   @Override
   public Codec<? extends class_3498> method_16088() {
      return field_10714;
   }

   @Override
   public class_3498 method_16083(long var1) {
      return this;
   }

   @Override
   public class_6325 method_28192(int var1, int var2, int var3) {
      return this.field_10712.get();
   }

   @Nullable
   @Override
   public class_1331 method_16084(int var1, int var2, int var3, int var4, int var5, Predicate<class_6325> var6, Random var7, boolean var8) {
      if (!var6.test(this.field_10712.get())) {
         return null;
      } else {
         return !var8
            ? new class_1331(var1 - var4 + var7.nextInt(var4 * 2 + 1), var2, var3 - var4 + var7.nextInt(var4 * 2 + 1))
            : new class_1331(var1, var2, var3);
      }
   }

   @Override
   public Set<class_6325> method_16087(int var1, int var2, int var3, int var4) {
      return Sets.newHashSet(new class_6325[]{this.field_10712.get()});
   }
}
