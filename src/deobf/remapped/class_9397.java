package remapped;

import java.util.function.Function;

public enum class_9397 {
   field_48021("this", class_8712.field_44676, class_795.method_3529()),
   field_48023("killer", class_8712.field_44678, class_795.method_3529()),
   field_48025("killer_player", class_8712.field_44675, class_795.method_3529()),
   field_48027("block_entity", class_8712.field_44673, class_795.method_3528());

   public final String field_48024;
   public final class_9791<?> field_48022;
   public final Function<class_2792, class_8406> field_48020;

   private <T> class_9397(String var3, class_9791<T> var4, Function<? super T, class_8406> var5) {
      this.field_48024 = var3;
      this.field_48022 = var4;
      this.field_48020 = var2x -> {
         Object var5x = var2x.method_12698(var4);
         return var5x == null ? null : (class_8406)var5.apply(var5x);
      };
   }

   public static class_9397 method_43480(String var0) {
      for (class_9397 var6 : values()) {
         if (var6.field_48024.equals(var0)) {
            return var6;
         }
      }

      throw new IllegalArgumentException("Invalid tag source " + var0);
   }
}
