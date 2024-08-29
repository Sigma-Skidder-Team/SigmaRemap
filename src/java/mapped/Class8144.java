package mapped;

import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.lang3.StringUtils;

public class Class8144 {
   private final Class1853 field35040;
   private final String field35041;
   private final int field35042;
   private int field35043;

   private Class8144(Class1853 var1, int var2, String var3) {
      this.field35040 = var1;
      this.field35042 = var2;
      this.field35041 = var3;
   }

   public void method28247(Class1809 var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      this.field35043++;
      Class7414.method23722(var1.method7944(), this.field35042);
   }

   public void method28248() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      this.field35043--;
      if (this.field35043 <= 0) {
         Class7414.method23723(this.field35042);
         this.field35040.method8097().remove(this.field35041);
      }
   }

   public String method28249() {
      return this.field35041;
   }

   public static Class8144 method28250(Class1853 var0, String var1, InputStream var2, String var3) throws IOException {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      String var6 = Class8535.method30374(var2);
      if (var6 != null) {
         int var7 = Class7414.method23724(Class1853.method8098(var0));
         Class7414.method23725(var7, var6);
         Class7414.method23726(var7);
         if (Class7414.method23727(var7, 35713) != 0) {
            Class8144 var9 = new Class8144(var0, var7, var1);
            var0.method8097().put(var1, var9);
            return var9;
         } else {
            String var8 = StringUtils.trim(Class7414.method23763(var7, 32768));
            throw new IOException("Couldn't compile " + var0.method8094() + " program (" + var3 + ", " + var1 + ") : " + var8);
         }
      } else {
         throw new IOException("Could not load program " + var0.method8094());
      }
   }
}
