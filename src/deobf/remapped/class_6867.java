package remapped;

import java.util.Set;

public interface class_6867 extends class_5507 {
   int method_31505();

   boolean method_31495();

   ItemStack method_31498(int var1);

   ItemStack method_31497(int var1, int var2);

   ItemStack method_31507(int var1);

   void method_31503(int var1, ItemStack var2);

   default int method_31506() {
      return 64;
   }

   void method_17407();

   boolean method_31502(class_704 var1);

   default void method_31501(class_704 var1) {
   }

   default void method_31499(class_704 var1) {
   }

   default boolean method_31500(int var1, ItemStack var2) {
      return true;
   }

   default int method_31504(class_2451 var1) {
      int var4 = 0;

      for (int var5 = 0; var5 < this.method_31505(); var5++) {
         ItemStack var6 = this.method_31498(var5);
         if (var6.method_27960().equals(var1)) {
            var4 += var6.method_27997();
         }
      }

      return var4;
   }

   default boolean method_31496(Set<class_2451> var1) {
      for (int var4 = 0; var4 < this.method_31505(); var4++) {
         ItemStack var5 = this.method_31498(var4);
         if (var1.contains(var5.method_27960()) && var5.method_27997() > 0) {
            return true;
         }
      }

      return false;
   }
}
