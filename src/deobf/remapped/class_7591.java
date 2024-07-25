package remapped;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class class_7591 extends class_6127<LivingEntity> {
   private static String[] field_38660;

   @Override
   public Set<class_6044<?>> method_28152() {
      return ImmutableSet.of(class_6044.field_30875);
   }

   @Override
   public void method_28154(class_6331 var1, LivingEntity var2) {
      var2.method_26525().method_5105(class_6044.field_30875, this.method_34495(var2));
   }

   private List<LivingEntity> method_34495(LivingEntity var1) {
      return this.method_34493(var1).stream().filter(this::method_34494).collect(Collectors.<LivingEntity>toList());
   }

   private boolean method_34494(LivingEntity var1) {
      return var1.getType() == EntityType.field_34276 && var1.method_26449();
   }

   private List<LivingEntity> method_34493(LivingEntity var1) {
      return var1.method_26525().<List<LivingEntity>>method_5138(class_6044.field_30901).orElse(Lists.newArrayList());
   }
}
