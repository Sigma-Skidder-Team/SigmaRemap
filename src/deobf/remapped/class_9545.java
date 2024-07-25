package remapped;

import com.google.common.collect.Lists;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class class_9545 extends class_2840<List<String>> {
   private static final Identifier field_48562 = new Identifier("texts/splashes.txt");
   private static final Random field_48564 = new Random();
   private final List<String> field_48561 = Lists.newArrayList();
   private final Session field_48563;

   public class_9545(Session var1) {
      this.field_48563 = var1;
   }

   public List<String> method_44058(class_7832 var1, class_3492 var2) {
      try (
              class_4038 var5 = MinecraftClient.getInstance().method_8498().method_35458(field_48562);
              BufferedReader var7 = new BufferedReader(new InputStreamReader(var5.method_18576(), StandardCharsets.UTF_8));
      ) {
         return var7.lines().<String>map(String::trim).filter(var0 -> var0.hashCode() != 125780783).collect(Collectors.<String>toList());
      } catch (IOException var38) {
         return Collections.<String>emptyList();
      }
   }

   public void method_44057(List<String> var1, class_7832 var2, class_3492 var3) {
      this.field_48561.clear();
      this.field_48561.addAll(var1);
   }

   @Nullable
   public String method_44056() {
      Calendar var3 = Calendar.getInstance();
      var3.setTime(new Date());
      if (var3.get(2) + 1 == 12 && var3.get(5) == 24) {
         return "Merry X-mas!";
      } else if (var3.get(2) + 1 == 1 && var3.get(5) == 1) {
         return "Happy new year!";
      } else if (var3.get(2) + 1 == 10 && var3.get(5) == 31) {
         return "OOoooOOOoooo! Spooky!";
      } else if (this.field_48561.isEmpty()) {
         return null;
      } else {
         return this.field_48563 != null && field_48564.nextInt(this.field_48561.size()) == 42
            ? this.field_48563.method_5366().toUpperCase(Locale.ROOT) + " IS YOU"
            : this.field_48561.get(field_48564.nextInt(this.field_48561.size()));
      }
   }
}
