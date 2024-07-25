package remapped;

import java.util.function.Predicate;

public class class_2978<T extends class_5834> extends class_4138<T> {
   private static String[] field_14667;
   private boolean field_14666 = true;

   public class_2978(class_4040 var1, Class<T> var2, int var3, boolean var4, boolean var5, Predicate<class_5834> var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   public void method_13645(boolean var1) {
      this.field_14666 = var1;
   }

   @Override
   public boolean method_16795() {
      return this.field_14666 && super.method_16795();
   }
}
