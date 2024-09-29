package mapped;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Class6685 extends Class6678 {
   private String field29296 = null;
   private static final Pattern field29297 = Pattern.compile("^\\s*const\\s*(float|int)\\s*([A-Za-z0-9_]+)\\s*=\\s*(-?[0-9\\.]+f?F?)\\s*;\\s*(//.*)?$");

   public Class6685(String var1, String var2, String var3, String var4, String[] var5, String var6) {
      super(var1, var3, var4, var5, var6);
      this.field29296 = var2;
   }

   @Override
   public String method20360() {
      return "const " + this.field29296 + " " + this.method20366() + " = " + this.method20370() + "; // ShaderGroup option " + this.method20370();
   }

   @Override
   public boolean method20363(String var1) {
      Matcher var4 = field29297.matcher(var1);
      if (var4.matches()) {
         String var5 = var4.group(2);
         return var5.matches(this.method20366());
      } else {
         return false;
      }
   }

   public static Class6679 method20364(String var0, String var1) {
      Matcher var4 = field29297.matcher(var0);
      if (var4.matches()) {
         String var5 = var4.group(1);
         String var6 = var4.group(2);
         String var7 = var4.group(3);
         String var8 = var4.group(4);
         String var9 = Class9402.method35773(var8, "[", "]");
         if (var9 != null && var9.length() > 0) {
            var8 = var8.replace(var9, "").trim();
         }

         String[] var10 = method20365(var7, var9);
         if (var6 != null && var6.length() > 0) {
            var1 = Class9402.method35762(var1, "/shaders/");
            return new Class6685(var6, var5, var8, var7, var10, var1);
         } else {
            return null;
         }
      } else {
         return null;
      }
   }
}
