package remapped;

import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class class_3474<E extends LivingEntity> extends class_5920<E> {
   private final Set<class_6044<?>> field_17034;
   private final class_6681 field_17035;
   private final class_5351 field_17036;
   private final class_1634<class_5920<? super E>> field_17037 = new class_1634<class_5920<? super E>>();

   public class_3474(
      Map<class_6044<?>, class_561> var1, Set<class_6044<?>> var2, class_6681 var3, class_5351 var4, List<Pair<class_5920<? super E>, Integer>> var5
   ) {
      super(var1);
      this.field_17034 = var2;
      this.field_17035 = var3;
      this.field_17036 = var4;
      var5.forEach(var1x -> this.field_17037.method_7281((class_5920<? super E>)var1x.getFirst(), (Integer)var1x.getSecond()));
   }

   @Override
   public boolean method_27086(class_6331 var1, E var2, long var3) {
      return this.field_17037
         .method_7286()
         .filter(var0 -> var0.method_27087() == class_1494.field_7948)
         .anyMatch(var4 -> var4.method_27086(var1, (E)var2, var3));
   }

   @Override
   public boolean method_27085(long var1) {
      return false;
   }

   @Override
   public void method_27080(class_6331 var1, E var2, long var3) {
      this.field_17035.method_30653(this.field_17037);
      this.field_17036.method_24431(this.field_17037, var1, (E)var2, var3);
   }

   @Override
   public void method_27078(class_6331 var1, E var2, long var3) {
      this.field_17037.method_7286().filter(var0 -> var0.method_27087() == class_1494.field_7948).forEach(var4 -> var4.method_27082(var1, (E)var2, var3));
   }

   @Override
   public void method_27081(class_6331 var1, E var2, long var3) {
      this.field_17037.method_7286().filter(var0 -> var0.method_27087() == class_1494.field_7948).forEach(var4 -> var4.method_27079(var1, (E)var2, var3));
      this.field_17034.forEach(var2.method_26525()::method_5127);
   }

   @Override
   public String toString() {
      Set var3 = this.field_17037.method_7286().filter(var0 -> var0.method_27087() == class_1494.field_7948).collect(Collectors.toSet());
      return "(" + this.getClass().getSimpleName() + "): " + var3;
   }
}
