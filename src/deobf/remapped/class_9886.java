package remapped;

import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class class_9886 extends class_6127<class_5834> {
   private static String[] field_50138;

   public class_9886() {
      this(200);
   }

   public class_9886(int var1) {
      super(var1);
   }

   @Override
   public void method_28154(class_6331 var1, class_5834 var2) {
      method_45544(var2);
   }

   @Override
   public Set<class_6044<?>> method_28152() {
      return ImmutableSet.of(class_6044.field_30907);
   }

   public static void method_45544(class_5834 var0) {
      Optional var3 = var0.method_26525().<List<class_5834>>method_5138(class_6044.field_30907);
      if (var3.isPresent()) {
         boolean var4 = ((List)var3.get()).stream().anyMatch(var0x -> var0x.method_37387().equals(EntityType.field_34298));
         if (var4) {
            method_45543(var0);
         }
      }
   }

   public static void method_45543(class_5834 var0) {
      var0.method_26525().method_5107(class_6044.field_30877, true, 600L);
   }
}
