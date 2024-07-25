package remapped;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class class_2366<T> {
   private static String[] field_11858;
   private class_9349<T> field_11857 = class_9349.<T>method_43146();
   private final List<class_8658<T>> field_11855 = Lists.newArrayList();
   private final Function<class_6437, class_9349<T>> field_11856;

   public class_2366(Function<class_6437, class_9349<T>> var1) {
      this.field_11856 = var1;
   }

   public class_8813<T> method_10843(String var1) {
      class_8658 var4 = new class_8658(new class_4639(var1), null);
      this.field_11855.add(var4);
      return var4;
   }

   public void method_10844() {
      this.field_11857 = class_9349.<T>method_43146();
      class_7520 var3 = class_7520.method_34261();
      this.field_11855.forEach(var1 -> var1.method_39699(var1x -> var3));
   }

   public void method_10840(class_6437 var1) {
      class_9349 var4 = this.field_11856.apply(var1);
      this.field_11857 = var4;
      this.field_11855.forEach(var1x -> var1x.method_39699(var4::method_43140));
   }

   public class_9349<T> method_10842() {
      return this.field_11857;
   }

   public List<? extends class_8813<T>> method_10838() {
      return this.field_11855;
   }

   public Set<class_4639> method_10841(class_6437 var1) {
      class_9349 var4 = this.field_11856.apply(var1);
      Set var5 = this.field_11855.stream().<class_4639>map(class_8658::method_40487).collect(Collectors.toSet());
      ImmutableSet var6 = ImmutableSet.copyOf(var4.method_43141());
      return Sets.difference(var5, var6);
   }
}
