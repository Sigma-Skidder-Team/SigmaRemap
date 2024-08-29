package mapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import net.minecraft.util.text.LanguageMap;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.stream.Stream;

public class LanguageManager implements Class215 {
   private static final Logger field1034 = LogManager.getLogger();
   private static final Class2019 field1035 = new Class2019("en_us", "US", "English", false);
   private Map<String, Class2019> field1036 = ImmutableMap.of("en_us", field1035);
   private String field1037;
   private Class2019 field1038 = field1035;

   public LanguageManager(String var1) {
      this.field1037 = var1;
   }

   private static Map<String, Class2019> method963(Stream<IResourcePack> var0) {
      HashMap var3 = Maps.newHashMap();
      var0.forEach(var1 -> {
         try {
            Class9168 var4 = var1.<Class9168>method1227(Class9168.field42086);
            if (var4 != null) {
               for (Class2019 var6 : var4.method34244()) {
                  var3.putIfAbsent(var6.getCode(), var6);
               }
            }
         } catch (RuntimeException | IOException var7) {
            field1034.warn("Unable to parse language metadata section of resourcepack: {}", var1.method1228(), var7);
         }
      });
      return ImmutableMap.copyOf(var3);
   }

   @Override
   public void method737(IResourceManager var1) {
      this.field1036 = method963(var1.method584());
      Class2019 var4 = this.field1036.getOrDefault("en_us", field1035);
      this.field1038 = this.field1036.getOrDefault(this.field1037, var4);
      ArrayList var5 = Lists.newArrayList(new Class2019[]{var4});
      if (this.field1038 != var4) {
         var5.add(this.field1038);
      }

      Class2580 var6 = Class2580.method10782(var1, var5);
      I18n.method33882(var6);
      LanguageMap.func_240594_a_(var6);
   }

   public void method964(Class2019 var1) {
      this.field1037 = var1.getCode();
      this.field1038 = var1;
   }

   public Class2019 getCurrentLanguage() {
      return this.field1038;
   }

   public SortedSet<Class2019> method966() {
      return Sets.newTreeSet(this.field1036.values());
   }

   public Class2019 method967(String var1) {
      return this.field1036.get(var1);
   }
}
