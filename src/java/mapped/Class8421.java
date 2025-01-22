package mapped;

import com.mojang.brigadier.exceptions.CommandSyntaxException;

@FunctionalInterface
public interface Class8421 extends Class8420 {
   int method29593(int var1, int var2) throws CommandSyntaxException;

   @Override
   default void method29592(Score var1, Score var2) throws CommandSyntaxException {
      var1.setScorePoints(this.method29593(var1.getScorePoints(), var2.getScorePoints()));
   }
}
