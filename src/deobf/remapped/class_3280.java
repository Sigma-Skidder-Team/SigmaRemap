package remapped;

import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import javax.imageio.ImageIO;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.IOUtils;

public final class class_3280 extends Thread {
   public class_3280(String var1, String var2) {
      super(var1);
      this.field_16227 = var2;
   }

   @Override
   public void run() {
      Map var3 = class_9539.method_43983(this.field_16227);
      if (var3.containsKey(Type.SKIN)) {
         MinecraftProfileTexture var4 = (MinecraftProfileTexture)var3.get(Type.SKIN);
         String var5 = var4.getUrl();
         HttpURLConnection var6 = null;
         class_3570.method_16605().debug("Downloading http texture from {}", var5);

         try {
            var6 = (HttpURLConnection)new URL(var5).openConnection(MinecraftClient.getInstance().method_8607());
            var6.setDoInput(true);
            var6.setDoOutput(false);
            var6.connect();
            if (var6.getResponseCode() / 100 != 2) {
               class_3570.method_16601().remove(this.field_16227);
            } else {
               BufferedImage var7;
               try {
                  var7 = ImageIO.read(var6.getInputStream());
               } catch (Exception var19) {
                  class_3570.method_16601().remove(this.field_16227);
                  return;
               } finally {
                  IOUtils.closeQuietly(var6.getInputStream());
               }

               var7 = new class_3575().method_16620(var7);
               ByteArrayOutputStream var8 = new ByteArrayOutputStream();
               ImageIO.write(var7, "png", var8);
               class_3570.method_16602().put(this.field_16227, new Base64().encodeToString(var8.toByteArray()));
               class_3570.method_16601().put(this.field_16227, true);
            }
         } catch (Exception var21) {
            class_3570.method_16605().error("Couldn't download http texture", var21);
            class_3570.method_16601().remove(this.field_16227);
         } finally {
            if (var6 != null) {
               var6.disconnect();
            }
         }
      } else {
         class_3570.method_16601().put(this.field_16227, true);
      }
   }
}
