package remapped;

import com.google.common.collect.Lists;
import java.util.List;
import org.apache.commons.lang3.tuple.Pair;

public class class_1697 {
   private final List<Pair<class_8427, class_9077>> field_8771 = Lists.newArrayList();

   public class_1697 method_7624(class_8427 var1, class_9077 var2) {
      this.field_8771.add(Pair.of(var1, var2));
      return this;
   }

   public class_3416 method_7625() {
      class_3416 var3 = new class_3416();

      for (Pair var5 : this.field_8771) {
         class_5734 var6 = new class_5734();
         var6.method_25941("Pattern", class_8427.method_38786((class_8427)var5.getLeft()));
         var6.method_25931("Color", ((class_9077)var5.getRight()).method_41794());
         var3.add(var6);
      }

      return var3;
   }
}
