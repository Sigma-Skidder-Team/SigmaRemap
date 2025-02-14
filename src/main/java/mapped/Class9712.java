package mapped;

import java.lang.reflect.Array;
import java.util.ArrayDeque;

public class Class9712 {
   private Class field45376 = null;
   private int field45377 = 0;
   private ArrayDeque field45378 = new ArrayDeque();

   public Class9712(Class var1, int var2) {
      this.field45376 = var1;
      this.field45377 = var2;
   }

   public synchronized Object method38051(int var1) {
      Object var4 = this.field45378.pollLast();
      if (var4 == null || Array.getLength(var4) < var1) {
         var4 = Array.newInstance(this.field45376, var1);
      }

      return var4;
   }

   public synchronized void method38052(Object var1) {
      if (var1 != null) {
         Class var4 = var1.getClass();
         if (var4.getComponentType() != this.field45376) {
            throw new IllegalArgumentException("Wrong component type");
         }

         if (this.field45378.size() < this.field45377) {
            this.field45378.add(var1);
         }
      }
   }
}
