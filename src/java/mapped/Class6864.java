package mapped;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public final class Class6864 implements Class6865<Class7437> {
   private static String[] field29790;

   public Class7437 method20913(Class7434<Class7437> var1, StringReader var2) throws CommandSyntaxException {
      var2.expect(' ');
      float var5 = (float)var2.readDouble();
      var2.expect(' ');
      float var6 = (float)var2.readDouble();
      var2.expect(' ');
      float var7 = (float)var2.readDouble();
      var2.expect(' ');
      float var8 = (float)var2.readDouble();
      return new Class7437(var5, var6, var7, var8);
   }

   public Class7437 method20912(Class7434<Class7437> var1, PacketBuffer var2) {
      return new Class7437(var2.readFloat(), var2.readFloat(), var2.readFloat(), var2.readFloat());
   }
}
