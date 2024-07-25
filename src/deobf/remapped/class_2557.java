package remapped;

import java.io.PrintStream;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import net.minecraft.util.text.LanguageMap;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_2557 {
   public static final PrintStream field_12649 = System.out;
   private static boolean field_12650;
   private static final Logger field_12651 = LogManager.getLogger();

   public static void method_11618() {
      if (!field_12650) {
         field_12650 = true;
         if (class_8669.field_44446.method_39805().isEmpty()) {
            throw new IllegalStateException("Unable to load registries");
         }

         class_1878.method_8405();
         class_7689.method_34842();
         if (EntityType.method_30472(EntityType.field_34300) == null) {
            throw new IllegalStateException("Failed loading EntityTypes");
         }

         class_1387.method_6425();
         class_9558.method_44158();
         class_6191.method_28323();
         class_5398.method_24580();
         TagRegistryManager.method_20599();
         method_11615();
      }
   }

   private static <T> void method_11613(Iterable<T> var0, Function<T, String> var1, Set<String> var2) {
      LanguageMap var5 = LanguageMap.getInstance();
      var0.forEach(var3 -> {
         String var6 = (String)var1.apply(var3);
         if (!var5.func_230506_b_(var6)) {
            var2.add(var6);
         }
      });
   }

   private static void method_11612(Set<String> var0) {
      LanguageMap var3 = LanguageMap.getInstance();
      class_291.method_1289(new class_5186(var3, var0));
   }

   public static Set<String> method_11614() {
      TreeSet var2 = new TreeSet();
      method_11613(class_8669.field_44403, class_225::method_952, var2);
      method_11613(class_8669.field_44400, EntityType::method_30469, var2);
      method_11613(class_8669.field_44436, class_1425::method_6540, var2);
      method_11613(class_8669.field_44382, class_2451::method_11216, var2);
      method_11613(class_8669.field_44445, class_4382::method_20418, var2);
      method_11613(class_8669.field_44462, class_6414::method_29271, var2);
      method_11613(class_8669.field_44373, var0 -> "stat." + var0.toString().replace(':', '.'), var2);
      method_11612(var2);
      return var2;
   }

   public static void method_11617() {
      if (field_12650) {
         if (class_7665.field_38958) {
            method_11614().forEach(var0 -> field_12651.error("Missing translations: " + var0));
            class_465.method_2227();
         }

         class_9030.method_41422();
      } else {
         throw new IllegalArgumentException("Not bootstrapped");
      }
   }

   private static void method_11615() {
      if (!field_12651.isDebugEnabled()) {
         System.setErr(new class_1032("STDERR", System.err));
         System.setOut(new class_1032("STDOUT", field_12649));
      } else {
         System.setErr(new class_5868("STDERR", System.err));
         System.setOut(new class_5868("STDOUT", field_12649));
      }
   }

   public static void method_11619(String var0) {
      field_12649.println(var0);
   }
}
