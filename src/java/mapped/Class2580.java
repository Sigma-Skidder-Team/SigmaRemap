package mapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextProperties;
import net.minecraft.util.text.LanguageMap;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Class2580 extends LanguageMap {
   private static final Logger field16800 = LogManager.getLogger();
   private final Map<String, String> field16801;
   private final boolean field16802;

   private Class2580(Map<String, String> var1, boolean var2) {
      this.field16801 = var1;
      this.field16802 = var2;
   }

   public static Class2580 method10782(IResourceManager var0, List<Class2019> var1) {
      HashMap var4 = Maps.newHashMap();
      boolean var5 = false;

      for (Class2019 var7 : var1) {
         var5 |= var7.method8551();
         String var8 = String.format("lang/%s.json", var7.getCode());

         for (String var10 : var0.method579()) {
            try {
               ResourceLocation var11 = new ResourceLocation(var10, var8);
               method10783(var0.method582(var11), var4);
               Class8043.method27618(var0, var7.getCode(), var4);
            } catch (FileNotFoundException var12) {
            } catch (Exception var13) {
               field16800.warn("Skipped language file: {}:{} ({})", var10, var8, var13.toString());
            }
         }
      }

      return new Class2580(ImmutableMap.copyOf(var4), var5);
   }

   private static void method10783(List<Class1783> var0, Map<String, String> var1) {
      for (Class1783 var5 : var0) {
         try (InputStream var6 = var5.method7763()) {
            LanguageMap.func_240593_a_(var6, var1::put);
         } catch (IOException var19) {
            field16800.warn("Failed to load translations from {}", var5, var19);
         }
      }
   }

   @Override
   public String func_230503_a_(String var1) {
      return this.field16801.getOrDefault(var1, var1);
   }

   @Override
   public boolean func_230506_b_(String var1) {
      return this.field16801.containsKey(var1);
   }

   @Override
   public boolean func_230505_b_() {
      return this.field16802;
   }

   @Override
   public Class9125 func_241870_a(ITextProperties var1) {
      return Class8343.method29250(var1, this.field16802);
   }

   public Map<String, String> method10784() {
      return this.field16801;
   }
}
