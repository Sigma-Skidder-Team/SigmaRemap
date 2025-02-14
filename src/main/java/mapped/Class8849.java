package mapped;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.stream.Collectors;
import joptsimple.AbstractOptionSpec;
import joptsimple.ArgumentAcceptingOptionSpec;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import joptsimple.OptionSpecBuilder;

public class Class8849 {
/*   public static void main(String[] var0) throws IOException {
      OptionParser var3 = new OptionParser();
      AbstractOptionSpec var4 = var3.accepts("help", "Show the help menu").forHelp();
      OptionSpecBuilder var5 = var3.accepts("server", "Include server generators");
      OptionSpecBuilder var6 = var3.accepts("client", "Include client generators");
      OptionSpecBuilder var7 = var3.accepts("dev", "Include development tools");
      OptionSpecBuilder var8 = var3.accepts("reports", "Include data reports");
      OptionSpecBuilder var9 = var3.accepts("validate", "Validate inputs");
      OptionSpecBuilder var10 = var3.accepts("all", "Include all generators");
      ArgumentAcceptingOptionSpec<String> var11 = var3.accepts("output", "Output folder").withRequiredArg().defaultsTo("generated", new String[0]);
      ArgumentAcceptingOptionSpec<String> var12 = var3.accepts("input", "Input folder").withRequiredArg();
      OptionSet var13 = var3.parse(var0);
      if (!var13.has(var4) && var13.hasOptions()) {
         Path var14 = Paths.get((String)var11.value(var13));
         boolean var15 = var13.has(var10);
         boolean var16 = var15 || var13.has(var6);
         boolean var17 = var15 || var13.has(var5);
         boolean var18 = var15 || var13.has(var7);
         boolean var19 = var15 || var13.has(var8);
         boolean var20 = var15 || var13.has(var9);
         Class9068 var21 = method32195(
            var14, var13.valuesOf(var12).stream().map(var0x -> Paths.get((URI) var0x)).collect(Collectors.toList()), var16, var17, var18, var19, var20
         );
         var21.run();
      } else {
         var3.printHelpOn(System.out);
      }
   }*/

   public static Class9068 method32195(Path var0, Collection<Path> var1, boolean var2, boolean var3, boolean var4, boolean var5, boolean var6) {
      Class9068 var9 = new Class9068(var0, var1);
      if (var2 || var3) {
         var9.method33777(new Class4444(var9).method14021(new Class6252()));
      }

      if (var2) {
         var9.method33777(new Class4446(var9));
      }

      if (var3) {
         var9.method33777(new Class4440(var9));
         Class4454 var10 = new Class4454(var9);
         var9.method33777(var10);
         var9.method33777(new Class4455(var9, var10));
         var9.method33777(new Class4453(var9));
         var9.method33777(new Class4447(var9));
         var9.method33777(new Class4450(var9));
         var9.method33777(new Class4445(var9));
      }

      if (var4) {
         var9.method33777(new Class4448(var9));
      }

      if (var5) {
         var9.method33777(new Class4449(var9));
         var9.method33777(new Class4452(var9));
         var9.method33777(new Class4443(var9));
         var9.method33777(new Class4451(var9));
      }

      return var9;
   }
}
