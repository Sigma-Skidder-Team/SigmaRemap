package remapped;

import java.util.Objects;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.lwjgl.glfw.GLFWVidMode;
import org.lwjgl.glfw.GLFWVidMode.Buffer;

public final class class_5722 {
   private final int field_28910;
   private final int field_28915;
   private final int field_28911;
   private final int field_28912;
   private final int field_28908;
   private final int field_28913;
   private static final Pattern field_28914 = Pattern.compile("(\\d+)x(\\d+)(?:@(\\d+)(?::(\\d+))?)?");

   public class_5722(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.field_28910 = var1;
      this.field_28915 = var2;
      this.field_28911 = var3;
      this.field_28912 = var4;
      this.field_28908 = var5;
      this.field_28913 = var6;
   }

   public class_5722(Buffer var1) {
      this.field_28910 = var1.width();
      this.field_28915 = var1.height();
      this.field_28911 = var1.redBits();
      this.field_28912 = var1.greenBits();
      this.field_28908 = var1.blueBits();
      this.field_28913 = var1.refreshRate();
   }

   public class_5722(GLFWVidMode var1) {
      this.field_28910 = var1.width();
      this.field_28915 = var1.height();
      this.field_28911 = var1.redBits();
      this.field_28912 = var1.greenBits();
      this.field_28908 = var1.blueBits();
      this.field_28913 = var1.refreshRate();
   }

   public int method_25883() {
      return this.field_28910;
   }

   public int method_25885() {
      return this.field_28915;
   }

   public int method_25886() {
      return this.field_28911;
   }

   public int method_25884() {
      return this.field_28912;
   }

   public int method_25890() {
      return this.field_28908;
   }

   public int method_25887() {
      return this.field_28913;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         class_5722 var4 = (class_5722)var1;
         return this.field_28910 == var4.field_28910
            && this.field_28915 == var4.field_28915
            && this.field_28911 == var4.field_28911
            && this.field_28912 == var4.field_28912
            && this.field_28908 == var4.field_28908
            && this.field_28913 == var4.field_28913;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.field_28910, this.field_28915, this.field_28911, this.field_28912, this.field_28908, this.field_28913);
   }

   @Override
   public String toString() {
      return String.format("%sx%s@%s (%sbit)", this.field_28910, this.field_28915, this.field_28913, this.field_28911 + this.field_28912 + this.field_28908);
   }

   public static Optional<class_5722> method_25891(String var0) {
      if (var0 == null) {
         return Optional.<class_5722>empty();
      } else {
         try {
            Matcher var3 = field_28914.matcher(var0);
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
               return Optional.<class_5722>of(new class_5722(var4, var5, var10, var10, var10, var7));
            }
         } catch (Exception var11) {
         }

         return Optional.<class_5722>empty();
      }
   }

   public String method_25889() {
      return String.format("%sx%s@%s:%s", this.field_28910, this.field_28915, this.field_28913, this.field_28911 + this.field_28912 + this.field_28908);
   }
}
