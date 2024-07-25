package remapped;

import java.util.ArrayDeque;
import java.util.Deque;

public class class_2935 {
   private Deque<class_3009> field_14283 = new ArrayDeque<class_3009>();

   public void method_13439(class_3009 var1) {
      this.field_14283.addLast(var1);
      if (this.field_14283.size() > 100) {
         throw new RuntimeException("Program stack overflow: " + this.field_14283.size());
      }
   }

   public class_3009 method_13441() {
      if (!this.field_14283.isEmpty()) {
         return this.field_14283.pollLast();
      } else {
         throw new RuntimeException("Program stack empty");
      }
   }
}
