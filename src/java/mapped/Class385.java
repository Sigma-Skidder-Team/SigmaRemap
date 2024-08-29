package mapped;

import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import net.minecraft.client.Minecraft;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.IOUtils;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

public final class Class385 extends Thread {
   public final String field1650;

   public Class385(String var1, String var2) {
      super(var1);
      this.field1650 = var2;
   }

   @Override
   public void run() {
      Map var3 = Class9740.method38172(this.field1650);
      if (var3.containsKey(Type.SKIN)) {
         MinecraftProfileTexture var4 = (MinecraftProfileTexture)var3.get(Type.SKIN);
         String var5 = var4.getUrl();
         HttpURLConnection var6 = null;
         Class8087.method27977().debug("Downloading http texture from {}", var5);

         try {
            var6 = (HttpURLConnection)new URL(var5).openConnection(Minecraft.getInstance().getProxy());
            var6.setDoInput(true);
            var6.setDoOutput(false);
            var6.connect();
            if (var6.getResponseCode() / 100 != 2) {
               Class8087.method27978().remove(this.field1650);
            } else {
               BufferedImage var7;
               try {
                  var7 = ImageIO.read(var6.getInputStream());
               } catch (Exception var19) {
                  Class8087.method27978().remove(this.field1650);
                  return;
               } finally {
                  IOUtils.closeQuietly(var6.getInputStream());
               }

               var7 = new Class8089().method27991(var7);
               ByteArrayOutputStream var8 = new ByteArrayOutputStream();
               ImageIO.write(var7, "png", var8);
               Class8087.method27979().put(this.field1650, new Base64().encodeToString(var8.toByteArray()));
               Class8087.method27978().put(this.field1650, true);
            }
         } catch (Exception var21) {
            Class8087.method27977().error("Couldn't download http texture", var21);
            Class8087.method27978().remove(this.field1650);
         } finally {
            if (var6 != null) {
               var6.disconnect();
            }
         }
      } else {
         Class8087.method27978().put(this.field1650, true);
      }
   }
}
