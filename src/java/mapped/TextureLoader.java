package mapped;

import java.io.IOException;
import java.io.InputStream;

public class TextureLoader {
   public static Texture getTexture(String var0, InputStream var1) throws IOException {
      return method25481(var0, var1, false, 9729);
   }

   public static Texture method25479(String var0, InputStream var1, boolean var2) throws IOException {
      return method25481(var0, var1, var2, 9729);
   }

   public static Texture method25480(String var0, InputStream var1, int var2) throws IOException {
      return method25481(var0, var1, false, var2);
   }

   public static Texture method25481(String var0, InputStream var1, boolean var2, int var3) throws IOException {
      return InternalTextureLoader.get().getTexture(var1, var1.toString() + "." + var0, var2, var3);
   }
}
