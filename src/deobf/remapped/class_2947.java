package remapped;

import java.util.Iterator;
import javax.annotation.Nullable;

public class class_2947 implements Iterable<class_2522> {
   private static String[] field_14371;
   public static final class_2522 field_14370 = class_4783.field_23184.method_29260();
   private final class_95<class_2522> field_14372 = new class_95<class_2522>(16);
   private int field_14373;

   private class_2947() {
   }

   public int method_13475(class_2522 var1) {
      int var4 = this.field_14372.method_14041(var1);
      if (var4 == -1) {
         var4 = this.field_14373++;
         this.field_14372.method_278(var1, var4);
      }

      return var4;
   }

   @Nullable
   public class_2522 method_13477(int var1) {
      class_2522 var4 = this.field_14372.method_14040(var1);
      return var4 != null ? var4 : field_14370;
   }

   @Override
   public Iterator<class_2522> iterator() {
      return this.field_14372.iterator();
   }

   public void method_13476(class_2522 var1, int var2) {
      this.field_14372.method_278(var1, var2);
   }
}
