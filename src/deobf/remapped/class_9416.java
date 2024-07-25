package remapped;

import com.mojang.brigadier.exceptions.CommandSyntaxException;

@FunctionalInterface
public interface class_9416 extends class_4533 {
   int method_43600(int var1, int var2) throws CommandSyntaxException;

   @Override
   default void method_21052(class_8274 var1, class_8274 var2) throws CommandSyntaxException {
      var1.method_38140(this.method_43600(var1.method_38146(), var2.method_38146()));
   }
}
