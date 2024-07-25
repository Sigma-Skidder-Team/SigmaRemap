package remapped;

public interface class_8932<C extends class_6867> {
   boolean method_41052(C var1, World var2);

   ItemStack method_41042(C var1);

   boolean method_41047(int var1, int var2);

   ItemStack method_41044();

   default class_2831<ItemStack> method_41046(C var1) {
      class_2831 var4 = class_2831.<ItemStack>method_12872(var1.method_31505(), ItemStack.EMPTY);

      for (int var5 = 0; var5 < var4.size(); var5++) {
         class_2451 var6 = var1.method_31498(var5).method_27960();
         if (var6.method_11232()) {
            var4.set(var5, new ItemStack(var6.method_11241()));
         }
      }

      return var4;
   }

   default class_2831<class_8137> method_41043() {
      return class_2831.<class_8137>method_12874();
   }

   default boolean method_41053() {
      return false;
   }

   default String method_41051() {
      return "";
   }

   default ItemStack method_41049() {
      return new ItemStack(class_4783.field_23794);
   }

   Identifier method_41050();

   class_2994<?> method_41048();

   class_1510<?> method_41045();
}
