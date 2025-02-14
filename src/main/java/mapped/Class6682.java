package mapped;

import net.optifine.Config;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Class6682 extends Class6679 {
   private static final Pattern field29289 = Pattern.compile("^\\s*(//)?\\s*#define\\s+([A-Za-z0-9_]+)\\s*(//.*)?$");
   private static final Pattern field29290 = Pattern.compile("^\\s*#if(n)?def\\s+([A-Za-z0-9_]+)(\\s*)?$");

   public Class6682(String var1, String var2, String var3, String var4) {
      super(var1, var2, var3, new String[]{"false", "true"}, var3, var4);
   }

   @Override
   public String method20360() {
      return !method20392(this.method20370())
         ? "//#define " + this.method20366() + " // ShaderGroup option OFF"
         : "#define " + this.method20366() + " // ShaderGroup option ON";
   }

   @Override
   public String method20361(String var1) {
      String var4 = super.method20361(var1);
      if (var4 == var1) {
         return !method20392(var1) ? Class8043.method27623() : Class8043.method27622();
      } else {
         return var4;
      }
   }

   @Override
   public String method20362(String var1) {
      return !method20392(var1) ? "§c" : "§a";
   }

   public static Class6679 method20391(String var0, String var1) {
      Matcher var4 = field29289.matcher(var0);
      if (var4.matches()) {
         String var5 = var4.group(1);
         String var6 = var4.group(2);
         String var7 = var4.group(3);
         if (var6 != null && var6.length() > 0) {
            boolean var8 = Config.equals(var5, "//");
            boolean var9 = !var8;
            var1 = Class9402.method35762(var1, "/shaders/");
            return new Class6682(var6, var7, String.valueOf(var9), var1);
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   @Override
   public boolean method20363(String var1) {
      Matcher var4 = field29289.matcher(var1);
      if (var4.matches()) {
         String var5 = var4.group(2);
         return var5.matches(this.method20366());
      } else {
         return false;
      }
   }

   @Override
   public boolean method20386() {
      return true;
   }

   @Override
   public boolean method20387(String var1) {
      Matcher var4 = field29290.matcher(var1);
      if (var4.matches()) {
         String var5 = var4.group(2);
         if (var5.equals(this.method20366())) {
            return true;
         }
      }

      return false;
   }

   public static boolean method20392(String var0) {
      return Boolean.valueOf(var0);
   }
}
