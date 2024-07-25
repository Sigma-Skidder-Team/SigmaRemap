package remapped;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class class_8198 {
   private static String[] field_41959;
   private final List<class_2053> field_41957;
   private final List<Object> field_41958;

   public class_8198(List<class_2053> var1, List<Object> var2) {
      this.field_41957 = var1;
      this.field_41958 = var2;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (!(var1 instanceof class_8198)) {
            return false;
         } else {
            class_8198 var4 = (class_8198)var1;
            return Objects.equals(this.field_41957, var4.field_41957) && Objects.equals(this.field_41958, var4.field_41958);
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      return 31 * this.field_41957.hashCode() + this.field_41958.hashCode();
   }

   public static class_8198 method_37556(class_2522 var0, class_9846 var1, Collection<class_5019<?>> var2) {
      class_8021 var5 = var0.method_8360().method_29306();
      List var6 = var1.method_45355()
         .stream()
         .filter(var2x -> var2x.method_36451(var5).test(var0))
         .<class_9798>map(class_8023::method_36452)
         .collect(ImmutableList.toImmutableList());
      List var7 = method_37554(var0, var2);
      return new class_8198(var6, var7);
   }

   public static class_8198 method_37555(class_2522 var0, class_2053 var1, Collection<class_5019<?>> var2) {
      List var5 = method_37554(var0, var2);
      return new class_8198(ImmutableList.of(var1), var5);
   }

   private static List<Object> method_37554(class_2522 var0, Collection<class_5019<?>> var1) {
      return var1.stream().map(var0::method_10313).collect(ImmutableList.toImmutableList());
   }
}
