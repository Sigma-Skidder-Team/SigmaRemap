package remapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

public class class_6911 {
   private final List<class_5024> field_35523 = Lists.newArrayList();
   private final Map<Direction, List<class_5024>> field_35524 = Maps.newEnumMap(Direction.class);
   private final class_602 field_35528;
   private final boolean field_35526;
   private class_5155 field_35530;
   private final boolean field_35527;
   private final boolean field_35525;
   private final class_7729 field_35529;

   public class_6911(class_9403 var1, class_602 var2, boolean var3) {
      this(var1.method_43551(), var1.method_43552().method_3100(), var3, var1.method_43563(), var2);
   }

   private class_6911(boolean var1, boolean var2, boolean var3, class_7729 var4, class_602 var5) {
      for (Direction var11 : Direction.values()) {
         this.field_35524.put(var11, Lists.newArrayList());
      }

      this.field_35528 = var5;
      this.field_35526 = var1;
      this.field_35527 = var2;
      this.field_35525 = var3;
      this.field_35529 = var4;
   }

   public class_6911 method_31667(Direction var1, class_5024 var2) {
      this.field_35524.get(var1).add(var2);
      return this;
   }

   public class_6911 method_31666(class_5024 var1) {
      this.field_35523.add(var1);
      return this;
   }

   public class_6911 method_31664(class_5155 var1) {
      this.field_35530 = var1;
      return this;
   }

   public class_7373 method_31665() {
      if (this.field_35530 != null) {
         return new class_6221(
            this.field_35523, this.field_35524, this.field_35526, this.field_35527, this.field_35525, this.field_35530, this.field_35529, this.field_35528
         );
      } else {
         throw new RuntimeException("Missing particle!");
      }
   }
}
