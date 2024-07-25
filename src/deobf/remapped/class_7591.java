package remapped;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class class_7591 extends class_6127<class_5834> {
   private static String[] field_38660;

   @Override
   public Set<class_6044<?>> method_28152() {
      return ImmutableSet.of(class_6044.field_30875);
   }

   @Override
   public void method_28154(class_6331 var1, class_5834 var2) {
      var2.method_26525().method_5105(class_6044.field_30875, this.method_34495(var2));
   }

   private List<class_5834> method_34495(class_5834 var1) {
      return this.method_34493(var1).stream().filter(this::method_34494).collect(Collectors.<class_5834>toList());
   }

   private boolean method_34494(class_5834 var1) {
      return var1.method_37387() == class_6629.field_34276 && var1.method_26449();
   }

   private List<class_5834> method_34493(class_5834 var1) {
      return var1.method_26525().<List<class_5834>>method_5138(class_6044.field_30901).orElse(Lists.newArrayList());
   }
}
