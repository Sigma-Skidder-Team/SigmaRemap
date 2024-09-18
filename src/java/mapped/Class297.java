package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.resources.VanillaPack;

import java.io.IOException;
import java.io.InputStream;

public class Class297 extends Class293 {
   private static String[] field1135;

   public Class297() {
      super(ResourceLoadProgressGui.method5683());
   }

   @Override
   public Class1805 method1146(IResourceManager var1) {
      Minecraft var4 = Minecraft.getInstance();
      VanillaPack var5 = var4.getPackFinder().getVanillaPack();

      try (InputStream var6 = method1174(var1, var5)) {
         return new Class1805(new Class9620(true, true), Class1806.method7879(var6));
      } catch (IOException var20) {
         return new Class1805(var20);
      }
   }

   private static InputStream method1174(IResourceManager var0, VanillaPack var1) throws IOException {
      return !var0.method581(ResourceLoadProgressGui.method5683())
         ? var1.getResourceStream(ResourcePackType.CLIENT_RESOURCES, ResourceLoadProgressGui.method5683())
         : var0.getShader(ResourceLoadProgressGui.method5683()).getFile();
   }
}
