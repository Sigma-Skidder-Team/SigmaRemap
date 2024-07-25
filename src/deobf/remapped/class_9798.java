package remapped;

import com.mojang.datafixers.util.Pair;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class class_9798 implements class_2053 {
   private static String[] field_49694;
   private final List<class_8338> field_49695;

   public class_9798(List<class_8338> var1) {
      this.field_49695 = var1;
   }

   public List<class_8338> method_45207() {
      return this.field_49695;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (!(var1 instanceof class_9798)) {
            return false;
         } else {
            class_9798 var4 = (class_9798)var1;
            return this.field_49695.equals(var4.field_49695);
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      return this.field_49695.hashCode();
   }

   @Override
   public Collection<class_4639> method_9589() {
      return this.method_45207().stream().<class_4639>map(class_8338::method_38399).collect(Collectors.<class_4639>toSet());
   }

   @Override
   public Collection<class_2843> method_9591(Function<class_4639, class_2053> var1, Set<Pair<String, String>> var2) {
      return this.method_45207()
         .stream()
         .<class_4639>map(class_8338::method_38399)
         .distinct()
         .<class_2843>flatMap(var2x -> ((class_2053)var1.apply(var2x)).method_9591(var1, var2).stream())
         .collect(Collectors.<class_2843>toSet());
   }

   @Nullable
   @Override
   public class_7373 method_9590(class_6560 var1, Function<class_2843, class_5155> var2, class_5598 var3, class_4639 var4) {
      if (this.method_45207().isEmpty()) {
         return null;
      } else {
         class_7213 var7 = new class_7213();

         for (class_8338 var9 : this.method_45207()) {
            class_7373 var10 = var1.method_29939(var9.method_38399(), var9);
            var7.method_33045(var10, var9.method_38398());
         }

         return var7.method_33047();
      }
   }
}
