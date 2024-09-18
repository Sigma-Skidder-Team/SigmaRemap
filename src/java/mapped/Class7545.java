package mapped;

import com.google.gson.JsonObject;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;

import java.io.IOException;
import javax.annotation.Nullable;

public class Class7545 implements Class7544 {
   private final ResourceLocation field32363;
   private final String field32364;

   public Class7545(ResourceLocation var1, String var2) {
      this.field32363 = var1;
      this.field32364 = var2;
   }

   public static Class7544 method24665(JsonObject var0) {
      return new Class7545(new ResourceLocation(JSONUtils.getString(var0, "sizes")), JSONUtils.getString(var0, "template"));
   }

   @Nullable
   @Override
   public Class1768 method24664(IResourceManager var1) {
      try (JSonShader var4 = Minecraft.getInstance().getResourceManager().getShader(this.field32363)) {
         byte[] var6 = new byte[65536];
         var4.getFile().read(var6);
         return new Class1770(var1, var6, this.field32364);
      } catch (IOException var19) {
         Class1770.method7747().error("Cannot load {}, unicode glyphs will not render correctly", this.field32363);
         return null;
      }
   }
}
