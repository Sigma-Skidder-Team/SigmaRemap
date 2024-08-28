package mapped;

import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.ArrayDeque;

public class Class6796 implements Class6797 {
   private static String[] field29603;
   private final ParseResults<Class6619> field29604;

   public Class6796(ParseResults<Class6619> var1) {
      this.field29604 = var1;
   }

   @Override
   public void method20710(Class7268 var1, Class6619 var2, ArrayDeque<Class7159> var3, int var4) throws CommandSyntaxException {
      var1.method22822().execute(new ParseResults(this.field29604.getContext().withSource(var2), this.field29604.getReader(), this.field29604.getExceptions()));
   }

   @Override
   public String toString() {
      return this.field29604.getReader().getString();
   }
}
