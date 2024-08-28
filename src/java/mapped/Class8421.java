package mapped;

import com.mojang.brigadier.exceptions.CommandSyntaxException;

@FunctionalInterface
public interface Class8421 extends Class8420 {
   int method29593(int var1, int var2) throws CommandSyntaxException;

   @Override
   default void method29592(Class9411 var1, Class9411 var2) throws CommandSyntaxException {
      var1.method36052(this.method29593(var1.method36050(), var2.method36050()));
   }
}
