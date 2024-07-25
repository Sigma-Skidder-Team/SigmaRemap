package remapped;

import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class class_4485<T> implements class_5998 {
   private static final Logger field_21864 = LogManager.getLogger();
   private static final Gson field_21861 = new GsonBuilder().setPrettyPrinting().create();
   public final class_6901 field_21862;
   public final class_8669<T> field_21860;
   private final Map<class_4639, class_1079> field_21863 = Maps.newLinkedHashMap();

   public class_4485(class_6901 var1, class_8669<T> var2) {
      this.field_21862 = var1;
      this.field_21860 = var2;
   }

   public abstract void method_20835();

   @Override
   public void method_27389(class_4162 var1) {
      this.field_21863.clear();
      this.method_20835();
      class_7520 var4 = class_7520.method_34261();
      Function var5 = var2 -> !this.field_21863.containsKey(var2) ? null : var4;
      Function var6 = var1x -> this.field_21860.method_39794(var1x).orElse(null);
      this.field_21863
         .forEach(
            (var4x, var5x) -> {
               List var8 = var5x.method_4727(var5, var6).collect(Collectors.toList());
               if (!var8.isEmpty()) {
                  throw new IllegalArgumentException(
                     String.format(
                        "Couldn't define tag %s as it is missing following references: %s",
                        var4x,
                        var8.stream().<CharSequence>map(Objects::toString).collect(Collectors.joining(","))
                     )
                  );
               } else {
                  JsonObject var9 = var5x.method_4721();
                  Path var10 = this.method_20832(var4x);

                  try {
                     String var11 = field_21861.toJson(var9);
                     String var12 = field_30556.hashUnencodedChars(var11).toString();
                     if (!Objects.equals(var1.method_19313(var10), var12) || !Files.exists(var10)) {
                        Files.createDirectories(var10.getParent());

                        try (BufferedWriter var13 = Files.newBufferedWriter(var10)) {
                           var13.write(var11);
                        }
                     }

                     var1.method_19317(var10, var12);
                  } catch (IOException var26) {
                     field_21864.error("Couldn't save tags to {}", var10, var26);
                  }
               }
            }
         );
   }

   public abstract Path method_20832(class_4639 var1);

   public class_5748<T> method_20834(class_8813<T> var1) {
      class_1079 var4 = this.method_20833(var1);
      return new class_5748<T>(var4, this.field_21860, "vanilla", null);
   }

   public class_1079 method_20833(class_8813<T> var1) {
      return this.field_21863.computeIfAbsent(var1.method_40487(), var0 -> new class_1079());
   }
}
