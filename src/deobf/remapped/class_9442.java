package remapped;

import java.lang.reflect.Array;
import java.util.ArrayDeque;

public class class_9442 {
   private Class field_48190 = null;
   private int field_48191 = 0;
   private ArrayDeque field_48189 = new ArrayDeque();

   public class_9442(Class var1, int var2) {
      this.field_48190 = var1;
      this.field_48191 = var2;
   }

   public synchronized Object method_43674(int var1) {
      Object var4 = this.field_48189.pollLast();
      if (var4 == null || Array.getLength(var4) < var1) {
         var4 = Array.newInstance(this.field_48190, var1);
      }

      return var4;
   }

   public synchronized void method_43676(Object var1) {
      if (var1 != null) {
         Class var4 = var1.getClass();
         if (var4.getComponentType() != this.field_48190) {
            throw new IllegalArgumentException("Wrong component type");
         }

         if (this.field_48189.size() < this.field_48191) {
            this.field_48189.add(var1);
         }
      }
   }
}
