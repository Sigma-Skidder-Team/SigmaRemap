package mapped;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Class6683 extends Class6682 {
   private static final Pattern field29291 = Pattern.compile("^\\s*const\\s*bool\\s*([A-Za-z0-9_]+)\\s*=\\s*(true|false)\\s*;\\s*(//.*)?$");

   public Class6683(String var1, String var2, String var3, String var4) {
      super(var1, var2, var3, var4);
   }

   @Override
   public String method20360() {
      return "const bool " + this.method20366() + " = " + this.method20370() + "; // ShaderGroup option " + this.method20370();
   }

   public static Class6679 method20391(String var0, String var1) {
      Matcher var4 = field29291.matcher(var0);
      if (var4.matches()) {
         String var5 = var4.group(1);
         String var6 = var4.group(2);
         String var7 = var4.group(3);
         if (var5 != null && var5.length() > 0) {
            var1 = Class9402.method35762(var1, "/shaders/");
            Class6683 var8 = new Class6683(var5, var7, var6, var1);
            var8.method20383(false);
            return var8;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   @Override
   public boolean method20363(String var1) {
      Matcher var4 = field29291.matcher(var1);
      if (var4.matches()) {
         String var5 = var4.group(1);
         return var5.matches(this.method20366());
      } else {
         return false;
      }
   }

   @Override
   public boolean method20386() {
      return false;
   }
}
