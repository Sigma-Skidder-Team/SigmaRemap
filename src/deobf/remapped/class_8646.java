package remapped;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

public class class_8646 {
   private String field_44303;
   private boolean field_44302;
   private long field_44307 = System.currentTimeMillis();
   private boolean field_44304 = true;
   private String field_44305 = "";
   private BufferedImage field_44301;
   private class_8343 field_44306;

   public class_8646(String var1, boolean var2) {
      this.field_44303 = var1;
      this.field_44302 = var2;
      if (var2) {
         new Thread(() -> {
            try {
               URL var4 = new URL("https://jelloprg.sigmaclient.info/captcha/" + var1 + ".png");
               this.field_44301 = ImageIO.read(var4);
            } catch (IOException var5) {
            }
         }).start();
      }
   }

   @Override
   public void finalize() throws Throwable {
      try {
         if (this.field_44306 != null) {
            SigmaMainClass.getInstance().method_3329(this.field_44306);
         }
      } finally {
         super.finalize();
      }
   }

   public class_8343 method_39654() {
      if (this.field_44306 == null && this.field_44301 != null) {
         try {
            this.field_44306 = class_6568.method_30015("", this.field_44301);
         } catch (IOException var4) {
            var4.printStackTrace();
         }
      }

      return this.field_44306;
   }

   public boolean method_39653() {
      return this.field_44302;
   }

   public boolean method_39658() {
      return this.field_44304 && this.field_44307 > System.currentTimeMillis() - 300000L;
   }

   public void method_39655(boolean var1) {
      this.field_44304 = var1;
   }

   public String method_39660() {
      return this.field_44305;
   }

   public void method_39656(String var1) {
      this.field_44305 = var1;
   }

   public String method_39657() {
      return this.field_44303;
   }
}
