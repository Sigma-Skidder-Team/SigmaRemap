package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mojang.datafixers.util.Pair;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_4959 implements class_5998 {
   private static final Logger field_25651 = LogManager.getLogger();
   private static final Gson field_25653 = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final class_6901 field_25654;
   private final List<Pair<Supplier<Consumer<BiConsumer<Identifier, class_8843>>>, class_2144>> field_25652 = ImmutableList.of(
      Pair.of(class_3234::new, class_4933.field_25570),
      Pair.of(class_1531::new, class_4933.field_25565),
      Pair.of(class_770::new, class_4933.field_25566),
      Pair.of(class_4370::new, class_4933.field_25572),
      Pair.of(class_3309::new, class_4933.field_25567),
      Pair.of(class_1707::new, class_4933.field_25575)
   );

   public class_4959(class_6901 var1) {
      this.field_25654 = var1;
   }

   @Override
   public void method_27389(class_4162 var1) {
      Path var4 = this.field_25654.method_31600();
      HashMap var5 = Maps.newHashMap();
      this.field_25652.forEach(var1x -> ((Consumer)((Supplier)var1x.getFirst()).get()).accept((var2, var3) -> {
            if (var5.put(var2, var3.method_40681((class_2144)var1x.getSecond()).method_40679()) != null) {
               throw new IllegalStateException("Duplicate loot table " + var2);
            }
         }));
      class_4737 var6 = new class_4737(class_4933.field_25571, var0 -> null, var5::get);
      UnmodifiableIterator var7 = Sets.difference(class_5931.method_27116(), var5.keySet()).iterator();

      while (var7.hasNext()) {
         Identifier var8 = (Identifier)var7.next();
         var6.method_21892("Missing built-in table: " + var8);
      }

      var5.forEach((var1x, var2) -> class_1040.method_4605(var6, var1x, var2));
      Multimap var9 = var6.method_21883();
      if (var9.isEmpty()) {
         var5.forEach((var2, var3) -> {
            Path var6x = method_22715(var4, var2);

            try {
               class_5998.method_27388(field_25653, var1, class_1040.method_4608(var3), var6x);
            } catch (IOException var8x) {
               field_25651.error("Couldn't save loot table {}", var6x, var8x);
            }
         });
      } else {
         var9.forEach((var0, var1x) -> field_25651.warn("Found validation problem in " + var0 + ": " + var1x));
         throw new IllegalStateException("Failed to validate loot tables, see logs");
      }
   }

   private static Path method_22715(Path var0, Identifier var1) {
      return var0.resolve("data/" + var1.method_21461() + "/loot_tables/" + var1.method_21456() + ".json");
   }

   @Override
   public String method_27387() {
      return "LootTables";
   }
}
