package remapped;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public final class class_6366 implements class_7981<class_8661> {
   private static String[] field_32543;

   public class_8661 method_29143(class_8583<class_8661> var1, StringReader var2) throws CommandSyntaxException {
      var2.expect(' ');
      class_9599 var5 = new class_9599(var2, false).method_44335();
      class_6098 var6 = new class_3238(var5.method_44342(), var5.method_44338()).method_14833(1, false);
      return new class_8661(var1, var6);
   }

   public class_8661 method_29141(class_8583<class_8661> var1, class_8248 var2) {
      return new class_8661(var1, var2.method_37755());
   }
}
