package mapped;

import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public abstract class Class4441<T> implements Class4442 {
   private static final Logger field21597 = LogManager.getLogger();
   private static final Gson field21598 = new GsonBuilder().setPrettyPrinting().create();
   public final Class9068 field21599;
   public final Registry<T> field21600;
   private final Map<ResourceLocation, Class6879> field21601 = Maps.newLinkedHashMap();

   public Class4441(Class9068 var1, Registry<T> var2) {
      this.field21599 = var1;
      this.field21600 = var2;
   }

   public abstract void method14010();

   @Override
   public void method14013(Class8297 var1) {
      this.field21601.clear();
      this.method14010();
      Class7608<T> var4 = Class7609.method24925();

      Function<ResourceLocation, Class7608<T>> var5 = var2 -> !this.field21601.containsKey(var2) ? null : var4;
      Function<ResourceLocation, T> var6 = var1x -> this.field21600.method9187(var1x).orElse(null);
      this.field21601
         .forEach(
            (var4x, var5x) -> {
               List var8 = var5x.method20949(var5, var6).collect(Collectors.toList());
               if (!var8.isEmpty()) {
                  throw new IllegalArgumentException(
                     String.format(
                        "Couldn't define tag %s as it is missing following references: %s",
                        var4x,
                        var8.stream().<CharSequence>map(Objects::toString).collect(Collectors.joining(","))
                     )
                  );
               } else {
                  JsonObject var9 = var5x.method20952();
                  Path var10 = this.method14011(var4x);

                  try {
                     String var11 = field21598.toJson(var9);
                     String var12 = field21602.hashUnencodedChars(var11).toString();
                     if (!Objects.equals(var1.method29001(var10), var12) || !Files.exists(var10)) {
                        Files.createDirectories(var10.getParent());

                        try (BufferedWriter var13 = Files.newBufferedWriter(var10)) {
                           var13.write(var11);
                        }
                     }

                     var1.method29002(var10, var12);
                  } catch (IOException var26) {
                     field21597.error("Couldn't save tags to {}", var10, var26);
                  }
               }
            }
         );
   }

   public abstract Path method14011(ResourceLocation var1);

   public Class8747<T> method14014(Class7610<T> var1) {
      Class6879 var4 = this.method14015(var1);
      return new Class8747<T>(var4, this.field21600, "vanilla");
   }

   public Class6879 method14015(Class7610<T> var1) {
      return this.field21601.computeIfAbsent(var1.method24929(), var0 -> new Class6879());
   }
}
