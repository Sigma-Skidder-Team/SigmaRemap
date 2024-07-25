package remapped;

import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.ArrayDeque;

public class class_960 implements class_3315 {
   private static String[] field_4933;
   private final ParseResults<class_9155> field_4932;

   public class_960(ParseResults<class_9155> var1) {
      this.field_4932 = var1;
   }

   public void 骰揩ኞᔎ陬댠(class_1626 var1, class_9155 var2, ArrayDeque<class_1446> var3, int var4) throws CommandSyntaxException {
      var1.method_7254().execute(new ParseResults(this.field_4932.getContext().withSource(var2), this.field_4932.getReader(), this.field_4932.getExceptions()));
   }

   @Override
   public String toString() {
      return this.field_4932.getReader().getString();
   }
}
