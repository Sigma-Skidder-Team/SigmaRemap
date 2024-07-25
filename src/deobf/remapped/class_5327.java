package remapped;

import java.util.function.Predicate;

public class class_5327<T extends class_5834> extends class_4138<T> {
   private static String[] field_27178;
   private final class_8990 field_27177;

   public class_5327(class_8990 var1, Class<T> var2, boolean var3, Predicate<class_5834> var4) {
      super(var1, var2, 10, var3, false, var4);
      this.field_27177 = var1;
   }

   @Override
   public boolean method_16795() {
      return !this.field_27177.method_41215() && super.method_16795();
   }

   @Override
   public boolean method_16799() {
      return this.field_20144 == null ? super.method_16799() : this.field_20144.method_22604(this.field_4915, this.field_20146);
   }
}
