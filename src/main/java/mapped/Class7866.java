package mapped;

import java.util.ArrayDeque;
import java.util.Deque;

public class Class7866 {
   private Deque<Class7906> field33679 = new ArrayDeque<Class7906>();

   public void method26359(Class7906 var1) {
      this.field33679.addLast(var1);
      if (this.field33679.size() > 100) {
         throw new RuntimeException("Program stack overflow: " + this.field33679.size());
      }
   }

   public Class7906 method26360() {
      if (!this.field33679.isEmpty()) {
         return this.field33679.pollLast();
      } else {
         throw new RuntimeException("Program stack empty");
      }
   }
}
