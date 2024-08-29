package mapped;

import java.util.Objects;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.lwjgl.glfw.GLFWVidMode;
import org.lwjgl.glfw.GLFWVidMode.Buffer;

public final class VideoMode {
   private final int field39389;
   private final int field39390;
   private final int field39391;
   private final int field39392;
   private final int field39393;
   private final int field39394;
   private static final Pattern field39395 = Pattern.compile("(\\d+)x(\\d+)(?:@(\\d+)(?::(\\d+))?)?");

   public VideoMode(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.field39389 = var1;
      this.field39390 = var2;
      this.field39391 = var3;
      this.field39392 = var4;
      this.field39393 = var5;
      this.field39394 = var6;
   }

   public VideoMode(Buffer var1) {
      this.field39389 = var1.width();
      this.field39390 = var1.height();
      this.field39391 = var1.redBits();
      this.field39392 = var1.greenBits();
      this.field39393 = var1.blueBits();
      this.field39394 = var1.refreshRate();
   }

   public VideoMode(GLFWVidMode var1) {
      this.field39389 = var1.width();
      this.field39390 = var1.height();
      this.field39391 = var1.redBits();
      this.field39392 = var1.greenBits();
      this.field39393 = var1.blueBits();
      this.field39394 = var1.refreshRate();
   }

   public int getWidth() {
      return this.field39389;
   }

   public int getHeight() {
      return this.field39390;
   }

   public int method31531() {
      return this.field39391;
   }

   public int method31532() {
      return this.field39392;
   }

   public int method31533() {
      return this.field39393;
   }

   public int getRefreshRate() {
      return this.field39394;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         VideoMode var4 = (VideoMode)var1;
         return this.field39389 == var4.field39389
            && this.field39390 == var4.field39390
            && this.field39391 == var4.field39391
            && this.field39392 == var4.field39392
            && this.field39393 == var4.field39393
            && this.field39394 == var4.field39394;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.field39389, this.field39390, this.field39391, this.field39392, this.field39393, this.field39394);
   }

   @Override
   public String toString() {
      return String.format("%sx%s@%s (%sbit)", this.field39389, this.field39390, this.field39394, this.field39391 + this.field39392 + this.field39393);
   }

   public static Optional<VideoMode> method31535(String var0) {
      if (var0 == null) {
         return Optional.<VideoMode>empty();
      } else {
         try {
            Matcher var3 = field39395.matcher(var0);
            if (var3.matches()) {
               int var4 = Integer.parseInt(var3.group(1));
               int var5 = Integer.parseInt(var3.group(2));
               String var6 = var3.group(3);
               int var7;
               if (var6 == null) {
                  var7 = 60;
               } else {
                  var7 = Integer.parseInt(var6);
               }

               String var8 = var3.group(4);
               int var9;
               if (var8 == null) {
                  var9 = 24;
               } else {
                  var9 = Integer.parseInt(var8);
               }

               int var10 = var9 / 3;
               return Optional.<VideoMode>of(new VideoMode(var4, var5, var10, var10, var10, var7));
            }
         } catch (Exception var11) {
         }

         return Optional.<VideoMode>empty();
      }
   }

   public String method31536() {
      return String.format("%sx%s@%s:%s", this.field39389, this.field39390, this.field39394, this.field39391 + this.field39392 + this.field39393);
   }
}
