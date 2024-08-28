package mapped;

import java.io.PrintStream;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import net.minecraft.util.text.LanguageMap;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class7729 {
   public static final PrintStream field33185 = System.out;
   private static boolean field33186;
   private static final Logger field33187 = LogManager.getLogger();

   public static void method25566() {
      if (!field33186) {
         field33186 = true;
         if (Class2348.field16035.method9190().isEmpty()) {
            throw new IllegalStateException("Unable to load registries");
         }

         Class3399.method12026();
         Class3475.method12162();
         if (Class8992.method33198(Class8992.field41111) == null) {
            throw new IllegalStateException("Failed loading EntityTypes");
         }

         Class7105.method22140();
         Class9748.method38219();
         Class6226.method19200();
         Class8651.method31096();
         Class8384.method29381();
         method25571();
      }
   }

   private static <T> void method25567(Iterable<T> var0, Function<T, String> var1, Set<String> var2) {
      LanguageMap var5 = LanguageMap.getInstance();
      var0.forEach(var3 -> {
         String var6 = (String)var1.apply(var3);
         if (!var5.func_230506_b_(var6)) {
            var2.add(var6);
         }
      });
   }

   private static void method25568(Set<String> var0) {
      LanguageMap var3 = LanguageMap.getInstance();
      Class5462.method17131(new Class7569(var3, var0));
   }

   public static Set<String> method25569() {
      TreeSet var2 = new TreeSet();
      method25567(Class2348.field16087, Class4869::method15032, var2);
      method25567(Class2348.field16074, Class8992::method33210, var2);
      method25567(Class2348.field16071, Class7144::method22294, var2);
      method25567(Class2348.field16075, Class3257::method11719, var2);
      method25567(Class2348.field16073, Class6069::method18819, var2);
      method25567(Class2348.field16072, Class3209::method11566, var2);
      method25567(Class2348.field16080, var0 -> "stat." + var0.toString().replace(':', '.'), var2);
      method25568(var2);
      return var2;
   }

   public static void method25570() {
      if (field33186) {
         if (Class9246.field42545) {
            method25569().forEach(var0 -> field33187.error("Missing translations: " + var0));
            Class6099.method18844();
         }

         Class9614.method37377();
      } else {
         throw new IllegalArgumentException("Not bootstrapped");
      }
   }

   private static void method25571() {
      if (!field33187.isDebugEnabled()) {
         System.setErr(new Class1762("STDERR", System.err));
         System.setOut(new Class1762("STDOUT", field33185));
      } else {
         System.setErr(new Class1763("STDERR", System.err));
         System.setOut(new Class1763("STDOUT", field33185));
      }
   }

   public static void method25572(String var0) {
      field33185.println(var0);
   }
}
