package mapped;

import java.io.PrintStream;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.text.LanguageMap;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Bootstrap {
   public static final PrintStream field33185 = System.out;
   private static boolean field33186;
   private static final Logger field33187 = LogManager.getLogger();

   public static void method25566() {
      if (!field33186) {
         field33186 = true;
         if (Registry.field16035.method9190().isEmpty()) {
            throw new IllegalStateException("Unable to load registries");
         }

         Class3399.method12026();
         Class3475.method12162();
         if (EntityType.method33198(EntityType.PLAYER) == null) {
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
      method25567(Registry.ATTRIBUTE, Attribute::method15032, var2);
      method25567(Registry.ENTITY_TYPE, EntityType::method33210, var2);
      method25567(Registry.EFFECTS, Effect::getName, var2);
      method25567(Registry.ITEM, Item::getTranslationKey, var2);
      method25567(Registry.field16073, Enchantment::method18819, var2);
      method25567(Registry.BLOCK, Block::getTranslationKey, var2);
      method25567(Registry.field16080, var0 -> "stat." + var0.toString().replace(':', '.'), var2);
      method25568(var2);
      return var2;
   }

   public static void method25570() {
      if (field33186) {
         if (SharedConstants.developmentMode) {
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

   public static void printToSYSOUT(String var0) {
      field33185.println(var0);
   }
}
