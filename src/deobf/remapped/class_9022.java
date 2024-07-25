package remapped;

public enum class_9022 {
   field_46145(class_8336.field_42691),
   field_46148(class_8336.field_42701),
   field_46144(class_8336.field_42708);

   private final class_8336 field_46147;

   private class_9022(class_8336 var3) {
      this.field_46147 = var3;
   }

   public int method_41389(int var1, int var2) {
      int var5 = var2 / 2;
      int var6 = var1 > var5 ? var1 - var2 : var1;
      switch (this) {
         case field_46144:
            return (var2 - var6) % var2;
         case field_46148:
            return (var5 - var6 + var2) % var2;
         default:
            return var1;
      }
   }

   public class_6631 method_41390(Direction var1) {
      class_9249 var4 = var1.method_1029();
      return this == field_46148 && var4 == class_9249.field_47219 || this == field_46144 && var4 == class_9249.field_47215
         ? class_6631.field_34338
         : class_6631.field_34340;
   }

   public Direction method_41392(Direction var1) {
      if (this == field_46144 && var1.method_1029() == class_9249.field_47215) {
         return var1.method_1046();
      } else {
         return this == field_46148 && var1.method_1029() == class_9249.field_47219 ? var1.method_1046() : var1;
      }
   }

   public class_8336 method_41388() {
      return this.field_46147;
   }
}
