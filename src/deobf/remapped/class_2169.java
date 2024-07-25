package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.List;
import java.util.function.Consumer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_2169 implements class_5998 {
   private static final Logger field_10814 = LogManager.getLogger();
   private static final Gson field_10812 = new GsonBuilder().setPrettyPrinting().create();
   private final class_6901 field_10815;
   private final List<Consumer<Consumer<class_3139>>> field_10811 = ImmutableList.of(
      new class_3664(), new class_8855(), new class_2699(), new class_5080(), new class_9516()
   );

   public class_2169(class_6901 var1) {
      this.field_10815 = var1;
   }

   @Override
   public void method_27389(class_4162 var1) throws IOException {
      Path var4 = this.field_10815.method_31600();
      HashSet var5 = Sets.newHashSet();
      Consumer var6 = var3 -> {
         if (!var5.add(var3.method_14520())) {
            throw new IllegalStateException("Duplicate advancement " + var3.method_14520());
         } else {
            Path var6x = method_10080(var4, var3);

            try {
               class_5998.method_27388(field_10812, var1, var3.method_14514().method_15265(), var6x);
            } catch (IOException var8x) {
               field_10814.error("Couldn't save advancement {}", var6x, var8x);
            }
         }
      };

      for (Consumer var8 : this.field_10811) {
         var8.accept(var6);
      }
   }

   private static Path method_10080(Path var0, class_3139 var1) {
      return var0.resolve("data/" + var1.method_14520().method_21461() + "/advancements/" + var1.method_14520().method_21456() + ".json");
   }

   @Override
   public String method_27387() {
      return "Advancements";
   }
}
