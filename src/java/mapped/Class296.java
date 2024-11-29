package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.NativeImage;
import net.minecraft.resources.VanillaPack;

import java.io.IOException;
import java.io.InputStream;

public class Class296 extends Class293 {
   private static String[] field1151;

   public Class296() {
      super(CustomResourceLoadProgressGui.method6019());
   }

   public Class1805 method1173(IResourceManager var1) {
      Minecraft var4 = Minecraft.getInstance();
      VanillaPack var5 = var4.getPackFinder().getVanillaPack();

      try (InputStream var6 = var5.getResourceStream(ResourcePackType.CLIENT_RESOURCES, CustomResourceLoadProgressGui.method6019())) {
         return new Class1805((Class9620)null, NativeImage.method7879(var6));
      } catch (IOException var21) {
         return new Class1805(var21);
      }
   }
}
