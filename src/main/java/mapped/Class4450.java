package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.minecraft.advancements.Advancement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class Class4450 implements Class4442 {
   private static final Logger field21623 = LogManager.getLogger();
   private static final Gson field21624 = new GsonBuilder().setPrettyPrinting().create();
   private final Class9068 field21625;
   private final List<Consumer<Consumer<Advancement>>> field21626 = ImmutableList.of(
      new Class2841(), new Class2833(), new Class2831(), new Class2835(), new Class2839()
   );

   public Class4450(Class9068 var1) {
      this.field21625 = var1;
   }

   @Override
   public void method14013(Class8297 var1) throws IOException {
      Path var4 = this.field21625.method33776();
      Set var5 = Sets.newHashSet();
      Consumer<Advancement> var6 = var3 -> {
         if (!var5.add(var3.getId())) {
            throw new IllegalStateException("Duplicate advancement " + var3.getId());
         } else {
            Path var6x = method14083(var4, var3);

            try {
               Class4442.method14020(field21624, var1, var3.method27025().method27318(), var6x);
            } catch (IOException var8x) {
               field21623.error("Couldn't save advancement {}", var6x, var8x);
            }
         }
      };

      for (Consumer var8 : this.field21626) {
         var8.accept(var6);
      }
   }

   private static Path method14083(Path var0, Advancement var1) {
      return var0.resolve("data/" + var1.getId().getNamespace() + "/advancements/" + var1.getId().getPath() + ".json");
   }

   @Override
   public String method14012() {
      return "Advancements";
   }
}
