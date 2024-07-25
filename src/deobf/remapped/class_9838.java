package remapped;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Random;

public class class_9838 implements class_6571 {
   private static String[] field_49823;
   private List<class_5155> field_49822;

   private class_9838(class_9326 var1) {
      this.field_49821 = var1;
   }

   public class_5155 觯䴂欫鼒汌瀳(int var1, int var2) {
      return this.field_49822.get(var1 * (this.field_49822.size() - 1) / var2);
   }

   public class_5155 觯䴂欫鼒汌瀳(Random var1) {
      return this.field_49822.get(var1.nextInt(this.field_49822.size()));
   }

   public void method_45331(List<class_5155> var1) {
      this.field_49822 = ImmutableList.copyOf(var1);
   }
}
