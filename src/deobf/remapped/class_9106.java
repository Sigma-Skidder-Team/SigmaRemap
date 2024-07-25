package remapped;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public final class class_9106 implements class_7981<class_7110> {
   private static String[] field_46620;

   public class_7110 method_41949(class_8583<class_7110> var1, StringReader var2) throws CommandSyntaxException {
      var2.expect(' ');
      return new class_7110(var1, new class_4104(var2, false).method_18973(false).method_18967());
   }

   public class_7110 method_41948(class_8583<class_7110> var1, class_8248 var2) {
      return new class_7110(var1, class_6414.field_32758.method_14040(var2.method_37778()));
   }
}
