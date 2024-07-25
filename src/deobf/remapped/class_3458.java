package remapped;

import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.IOUtils;

public class class_3458 {
   private static final Splitter field_16946 = Splitter.on('=').limit(2);
   private static final Pattern field_16944 = Pattern.compile("%(\\d+\\$)?[\\d\\.]*[df]");

   public static void method_15908() {
      HashMap var2 = new HashMap();
      ArrayList var3 = new ArrayList();
      String var4 = "optifine/lang/";
      String var5 = "en_us";
      String var6 = ".lang";
      var3.add(var4 + var5 + var6);
      if (!Config.method_14310().field_45437.equals(var5)) {
         var3.add(var4 + Config.method_14310().field_45437 + var6);
      }

      String[] var7 = var3.<String>toArray(new String[var3.size()]);
      method_15910(Config.method_14415(), var7, var2);
      class_8169[] var8 = Config.method_14347();

      for (int var9 = 0; var9 < var8.length; var9++) {
         class_8169 var10 = var8[var9];
         method_15910(var10, var7, var2);
      }
   }

   private static void method_15910(class_8169 var0, String[] var1, Map var2) {
      try {
         for (int var5 = 0; var5 < var1.length; var5++) {
            String var6 = var1[var5];
            Identifier var7 = new Identifier(var6);
            if (var0.method_37467(class_3168.field_15844, var7)) {
               InputStream var8 = var0.method_37466(class_3168.field_15844, var7);
               if (var8 != null) {
                  method_15905(var8, var2);
               }
            }
         }
      } catch (IOException var9) {
         var9.printStackTrace();
      }
   }

   public static void method_15905(InputStream var0, Map var1) throws IOException {
      Iterator var4 = IOUtils.readLines(var0, Charsets.UTF_8).iterator();
      var0.close();

      while (var4.hasNext()) {
         String var5 = (String)var4.next();
         if (!var5.isEmpty() && var5.charAt(0) != '#') {
            String[] var6 = (String[])Iterables.toArray(field_16946.split(var5), String.class);
            if (var6 != null && var6.length == 2) {
               String var7 = var6[0];
               String var8 = field_16944.matcher(var6[1]).replaceAll("%$1s");
               var1.put(var7, var8);
            }
         }
      }
   }

   public static void method_15909(class_7832 var0, String var1, Map<String, String> var2) {
      try {
         String var5 = "optifine/lang/" + var1 + ".lang";
         Identifier var6 = new Identifier(var5);
         class_4038 var7 = var0.method_35458(var6);
         InputStream var8 = var7.method_18576();
         method_15905(var8, var2);
      } catch (IOException var9) {
      }
   }

   public static String method_15912(String var0) {
      return class_6956.method_31803(var0);
   }

   public static TranslationTextComponent method_15904(String var0) {
      return new TranslationTextComponent(var0);
   }

   public static String method_15913(String var0, String var1) {
      String var4 = class_6956.method_31803(var0);
      return var4 != null && !var4.equals(var0) ? var4 : var1;
   }

   public static String method_15907() {
      return class_6956.method_31803("options.on");
   }

   public static String method_15902() {
      return class_6956.method_31803("options.off");
   }

   public static String method_15903() {
      return class_6956.method_31803("options.graphics.fast");
   }

   public static String method_15906() {
      return class_6956.method_31803("options.graphics.fancy");
   }

   public static String method_15911() {
      return class_6956.method_31803("generator.default");
   }
}
