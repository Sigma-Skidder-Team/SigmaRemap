package remapped;

import java.io.IOException;

public class class_1905 extends class_3809 {
   private static String[] field_9725;

   public class_1905(class_3034 var1, class_4131 var2) {
      super(var2);
      this.field_9727 = var1;
   }

   @Override
   public void method_17750(IOException var1) {
      if (!field_9726 && !Thread.holdsLock(this.field_9727)) {
         throw new AssertionError();
      } else {
         this.field_9727.field_14877 = true;
      }
   }
}
