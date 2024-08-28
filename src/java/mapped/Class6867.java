package mapped;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public final class Class6867 implements Class6865<Class7439> {
   private static String[] field29792;

   public Class7439 method20913(Class7434<Class7439> var1, StringReader var2) throws CommandSyntaxException {
      var2.expect(' ');
      return new Class7439(var1, new Class8268(var2, false).method28840(false).method28837());
   }

   public Class7439 method20912(Class7434<Class7439> var1, PacketBuffer var2) {
      return new Class7439(var1, Class3209.field18610.method9172(var2.method35714()));
   }
}
