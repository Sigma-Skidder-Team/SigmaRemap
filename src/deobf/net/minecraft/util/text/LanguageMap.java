package net.minecraft.util.text;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.regex.Pattern;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import remapped.class_6539;
import remapped.class_7107;

public abstract class LanguageMap {
   private static final Logger LOGGER = LogManager.getLogger();
   private static final Gson field_240591_b_ = new Gson();
   private static final Pattern NUMERIC_VARIABLE_PATTERN = Pattern.compile("%(\\d+\\$)?[\\d.]*[df]");
   private static volatile LanguageMap field_240592_d_ = func_240595_c_();

   private static LanguageMap func_240595_c_() {
      Builder biconsumer = ImmutableMap.builder();
      BiConsumer map = biconsumer::put;

      try (InputStream var4 = LanguageMap.class.getResourceAsStream("/assets/minecraft/lang/en_us.json")) {
         func_240593_a_(var4, map);
      } catch (IOException | JsonParseException var17) {
         LOGGER.error("Couldn't read strings from /assets/minecraft/lang/en_us.json", var17);
      }

      ImmutableMap var18 = biconsumer.build();
      return new LanguageMap$1(var18);
   }

   public static void func_240593_a_(InputStream p_240593_0_, BiConsumer<String, String> p_240593_1_) {
      JsonObject var4 = (JsonObject)field_240591_b_.fromJson(new InputStreamReader(p_240593_0_, StandardCharsets.UTF_8), JsonObject.class);

      for (Entry s : var4.entrySet()) {
         String var7 = NUMERIC_VARIABLE_PATTERN.matcher(class_6539.method_29795((JsonElement)s.getValue(), (String)s.getKey())).replaceAll("%$1s");
         p_240593_1_.accept((String)s.getKey(), var7);
      }
   }

   public static LanguageMap getInstance() {
      return field_240592_d_;
   }

   public static void func_240594_a_(LanguageMap p_240594_0_) {
      field_240592_d_ = p_240594_0_;
   }

   public abstract String func_230503_a_(String var1);

   public abstract boolean func_230506_b_(String var1);

   public abstract boolean func_230505_b_();

   public abstract class_7107 func_241870_a(ITextProperties var1);

   public List<class_7107> func_244260_a(List<ITextProperties> p_244260_1_) {
      return p_244260_1_.stream().<class_7107>map(getInstance()::func_241870_a).collect(ImmutableList.toImmutableList());
   }
}
