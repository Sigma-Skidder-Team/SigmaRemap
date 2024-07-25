package remapped;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.stream.Collectors;
import joptsimple.AbstractOptionSpec;
import joptsimple.ArgumentAcceptingOptionSpec;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import joptsimple.OptionSpecBuilder;

public class class_6103 {
   public static void main(String[] var0) throws IOException {
      OptionParser var3 = new OptionParser();
      AbstractOptionSpec var4 = var3.accepts("help", "Show the help menu").forHelp();
      OptionSpecBuilder var5 = var3.accepts("server", "Include server generators");
      OptionSpecBuilder var6 = var3.accepts("client", "Include client generators");
      OptionSpecBuilder var7 = var3.accepts("dev", "Include development tools");
      OptionSpecBuilder var8 = var3.accepts("reports", "Include data reports");
      OptionSpecBuilder var9 = var3.accepts("validate", "Validate inputs");
      OptionSpecBuilder var10 = var3.accepts("all", "Include all generators");
      ArgumentAcceptingOptionSpec var11 = var3.accepts("output", "Output folder").withRequiredArg().defaultsTo("generated", new String[0]);
      ArgumentAcceptingOptionSpec var12 = var3.accepts("input", "Input folder").withRequiredArg();
      OptionSet var13 = var3.parse(var0);
      if (!var13.has(var4) && var13.hasOptions()) {
         Path var14 = Paths.get((String)var11.value(var13));
         boolean var15 = var13.has(var10);
         boolean var16 = var15 || var13.has(var6);
         boolean var17 = var15 || var13.has(var5);
         boolean var18 = var15 || var13.has(var7);
         boolean var19 = var15 || var13.has(var8);
         boolean var20 = var15 || var13.has(var9);
         class_6901 var21 = method_28042(
            var14, var13.valuesOf(var12).stream().<Path>map(var0x -> Paths.get(var0x)).collect(Collectors.<Path>toList()), var16, var17, var18, var19, var20
         );
         var21.run();
      } else {
         var3.printHelpOn(System.out);
      }
   }

   public static class_6901 method_28042(Path var0, Collection<Path> var1, boolean var2, boolean var3, boolean var4, boolean var5, boolean var6) {
      class_6901 var9 = new class_6901(var0, var1);
      if (var2 || var3) {
         var9.method_31599(new class_6940(var9).method_31753(new class_548()));
      }

      if (var2) {
         var9.method_31599(new class_2304(var9));
      }

      if (var3) {
         var9.method_31599(new class_144(var9));
         class_8805 var10 = new class_8805(var9);
         var9.method_31599(var10);
         var9.method_31599(new class_4614(var9, var10));
         var9.method_31599(new class_2992(var9));
         var9.method_31599(new class_5575(var9));
         var9.method_31599(new class_2169(var9));
         var9.method_31599(new class_4959(var9));
      }

      if (var4) {
         var9.method_31599(new class_3916(var9));
      }

      if (var5) {
         var9.method_31599(new class_6016(var9));
         var9.method_31599(new class_6564(var9));
         var9.method_31599(new class_1499(var9));
         var9.method_31599(new class_5441(var9));
      }

      return var9;
   }
}
