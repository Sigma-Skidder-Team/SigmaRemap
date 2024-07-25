package remapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.util.text.ITextProperties;
import net.minecraft.util.text.LanguageMap;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_9648 extends LanguageMap {
   private static final Logger field_49146 = LogManager.getLogger();
   private final Map<String, String> field_49145;
   private final boolean field_49144;

   private class_9648(Map<String, String> var1, boolean var2) {
      this.field_49145 = var1;
      this.field_49144 = var2;
   }

   public static class_9648 method_44523(class_7832 var0, List<class_7395> var1) {
      HashMap var4 = Maps.newHashMap();
      boolean var5 = false;

      for (class_7395 var7 : var1) {
         var5 |= var7.method_33675();
         String var8 = String.format("lang/%s.json", var7.getCode());

         for (String var10 : var0.method_35455()) {
            try {
               class_4639 var11 = new class_4639(var10, var8);
               method_44524(var0.method_35457(var11), var4);
               class_3458.method_15909(var0, var7.getCode(), var4);
            } catch (FileNotFoundException var12) {
            } catch (Exception var13) {
               field_49146.warn("Skipped language file: {}:{} ({})", var10, var8, var13.toString());
            }
         }
      }

      return new class_9648(ImmutableMap.copyOf(var4), var5);
   }

   private static void method_44524(List<class_4038> var0, Map<String, String> var1) {
      for (class_4038 var5 : var0) {
         try (InputStream var6 = var5.method_18576()) {
            LanguageMap.func_240593_a_(var6, var1::put);
         } catch (IOException var19) {
            field_49146.warn("Failed to load translations from {}", var5, var19);
         }
      }
   }

   @Override
   public String func_230503_a_(String var1) {
      return this.field_49145.getOrDefault(var1, var1);
   }

   @Override
   public boolean func_230506_b_(String var1) {
      return this.field_49145.containsKey(var1);
   }

   @Override
   public boolean func_230505_b_() {
      return this.field_49144;
   }

   @Override
   public class_7107 func_241870_a(ITextProperties var1) {
      return class_4320.method_20104(var1, this.field_49144);
   }

   public Map<String, String> method_44526() {
      return this.field_49145;
   }
}
