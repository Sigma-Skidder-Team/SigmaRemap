package remapped;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public final class class_1064 implements class_7981<class_5727> {
   private static String[] field_5831;

   public class_5727 method_4671(class_8583<class_5727> var1, StringReader var2) throws CommandSyntaxException {
      var2.expect(' ');
      float var5 = (float)var2.readDouble();
      var2.expect(' ');
      float var6 = (float)var2.readDouble();
      var2.expect(' ');
      float var7 = (float)var2.readDouble();
      var2.expect(' ');
      float var8 = (float)var2.readDouble();
      return new class_5727(var5, var6, var7, var8);
   }

   public class_5727 method_4669(class_8583<class_5727> var1, class_8248 var2) {
      return new class_5727(var2.readFloat(), var2.readFloat(), var2.readFloat(), var2.readFloat());
   }
}
