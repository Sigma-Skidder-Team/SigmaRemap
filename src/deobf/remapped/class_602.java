package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class class_602 {
   private static String[] field_3455;
   public static final class_602 field_3453 = new class_602();
   private final List<class_2729> field_3454 = Lists.newArrayList();
   private final List<class_7373> field_3458;
   private class_2469 field_3457;
   public static Identifier field_3456 = null;

   private class_602() {
      this.field_3458 = Collections.<class_7373>emptyList();
   }

   public class_602(class_6560 var1, class_9403 var2, Function<Identifier, class_2053> var3, List<class_2729> var4) {
      this(var1, var2, var3, var1.method_29943()::method_31568, var4);
   }

   public class_602(class_6560 var1, class_2053 var2, Function<Identifier, class_2053> var3, Function<class_2843, class_5155> var4, List<class_2729> var5) {
      this.field_3458 = var5.stream().<class_7373>map(var4x -> {
         class_2053 var7 = (class_2053)var3.apply(var4x.method_12263());
         return !Objects.equals(var7, var2) ? var1.method_29949(var4x.method_12263(), class_7507.field_38322, var4) : null;
      }).collect(Collectors.<class_7373>toList());
      Collections.reverse(this.field_3458);

      for (int var8 = var5.size() - 1; var8 >= 0; var8--) {
         this.field_3454.add((class_2729)var5.get(var8));
      }

      if (this.field_3454.size() > 65) {
         this.field_3457 = class_2469.method_11358(this.field_3454);
      }
   }

   @Nullable
   public class_7373 method_2816(class_7373 var1, ItemStack var2, class_174 var3, class_5834 var4) {
      boolean var7 = Config.method_14390();
      if (var7) {
         field_3456 = null;
      }

      if (!this.field_3454.isEmpty()) {
         if (this.field_3457 != null) {
            Integer var8 = this.field_3457.method_11357(var2, var3, var4);
            if (var8 != null) {
               int var12 = var8;
               if (var12 >= 0 && var12 < this.field_3458.size()) {
                  if (var7) {
                     field_3456 = this.field_3454.get(var12).method_12263();
                  }

                  class_7373 var13 = this.field_3458.get(var12);
                  if (var13 != null) {
                     return var13;
                  }
               }

               return var1;
            }
         }

         for (int var11 = 0; var11 < this.field_3454.size(); var11++) {
            class_2729 var9 = this.field_3454.get(var11);
            if (var9.method_12261(var2, var3, var4)) {
               class_7373 var10 = this.field_3458.get(var11);
               if (var7) {
                  field_3456 = var9.method_12263();
               }

               if (this.field_3457 != null) {
                  this.field_3457.method_11360(var2, var3, var4, var11);
               }

               if (var10 != null) {
                  return var10;
               }

               return var1;
            }
         }

         if (this.field_3457 != null) {
            this.field_3457.method_11360(var2, var3, var4, class_2469.field_12339);
         }
      }

      return var1;
   }

   public ImmutableList<class_2729> method_2817() {
      return ImmutableList.copyOf(this.field_3454);
   }
}
