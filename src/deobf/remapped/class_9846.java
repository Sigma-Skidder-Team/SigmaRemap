package remapped;

import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class class_9846 implements class_2053 {
   private static String[] field_49847;
   private final class_8021<class_6414, class_2522> field_49848;
   private final List<class_8023> field_49849;

   public class_9846(class_8021<class_6414, class_2522> var1, List<class_8023> var2) {
      this.field_49848 = var1;
      this.field_49849 = var2;
   }

   public List<class_8023> method_45355() {
      return this.field_49849;
   }

   public Set<class_9798> method_45356() {
      HashSet var3 = Sets.newHashSet();

      for (class_8023 var5 : this.field_49849) {
         var3.add(var5.method_36452());
      }

      return var3;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (!(var1 instanceof class_9846)) {
            return false;
         } else {
            class_9846 var4 = (class_9846)var1;
            return Objects.equals(this.field_49848, var4.field_49848) && Objects.equals(this.field_49849, var4.field_49849);
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.field_49848, this.field_49849);
   }

   @Override
   public Collection<class_4639> method_9589() {
      return this.method_45355().stream().<class_4639>flatMap(var0 -> var0.method_36452().method_9589().stream()).collect(Collectors.<class_4639>toSet());
   }

   @Override
   public Collection<class_2843> method_9591(Function<class_4639, class_2053> var1, Set<Pair<String, String>> var2) {
      return this.method_45355()
         .stream()
         .<class_2843>flatMap(var2x -> var2x.method_36452().method_9591(var1, var2).stream())
         .collect(Collectors.<class_2843>toSet());
   }

   @Nullable
   @Override
   public class_7373 method_9590(class_6560 var1, Function<class_2843, class_5155> var2, class_5598 var3, class_4639 var4) {
      class_6429 var7 = new class_6429();

      for (class_8023 var9 : this.method_45355()) {
         class_7373 var10 = var9.method_36452().method_9590(var1, var2, var3, var4);
         if (var10 != null) {
            var7.method_29372(var9.method_36451(this.field_49848), var10);
         }
      }

      return var7.method_29373();
   }
}
