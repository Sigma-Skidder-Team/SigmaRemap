package mapped;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Class8950 {
   private static final Pattern field40458 = Pattern.compile("(<name>.*) \\((<count>\\d*)\\)", 66);
   private static final Pattern field40459 = Pattern.compile(".*\\.|(?:COM|CLOCK\\$|CON|PRN|AUX|NUL|COM[1-9]|LPT[1-9])(?:\\..*)?", 2);

   public static String method32695(Path var0, String var1, String var2) throws IOException {
      for (char var8 : Class9246.field42546) {
         var1 = var1.replace(var8, '_');
      }

      var1 = var1.replaceAll("[./\"]", "_");
      if (field40459.matcher(var1).matches()) {
         var1 = "_" + var1 + "_";
      }

      Matcher var12 = field40458.matcher(var1);
      int var13 = 0;
      if (var12.matches()) {
         var1 = var12.group("name");
         var13 = Integer.parseInt(var12.group("count"));
      }

      if (var1.length() > 255 - var2.length()) {
         var1 = var1.substring(0, 255 - var2.length());
      }

      while (true) {
         String var14 = var1;
         if (var13 != 0) {
            String var16 = " (" + var13 + ")";
            int var9 = 255 - var16.length();
            if (var1.length() > var9) {
               var14 = var1.substring(0, var9);
            }

            var14 = var14 + var16;
         }

         var14 = var14 + var2;
         Path var17 = var0.resolve(var14);

         try {
            Path var18 = Files.createDirectory(var17);
            Files.deleteIfExists(var18);
            return var0.relativize(var18).toString();
         } catch (FileAlreadyExistsException var10) {
            var13++;
         }
      }
   }

   public static boolean method32696(Path var0) {
      Path var3 = var0.normalize();
      return var3.equals(var0);
   }

   public static boolean method32697(Path var0) {
      for (Path var4 : var0) {
         if (field40459.matcher(var4.toString()).matches()) {
            return false;
         }
      }

      return true;
   }

   public static Path method32698(Path var0, String var1, String var2) {
      String var5 = var1 + var2;
      Path var6 = Paths.get(var5);
      if (!var6.endsWith(var2)) {
         return var0.resolve(var6);
      } else {
         throw new InvalidPathException(var5, "empty resource name");
      }
   }
}
