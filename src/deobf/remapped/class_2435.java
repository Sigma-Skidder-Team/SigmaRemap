package remapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.stream.Stream;
import net.minecraft.util.text.LanguageMap;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_2435 implements class_6491 {
   private static final Logger field_12100 = LogManager.getLogger();
   private static final class_7395 field_12099 = new class_7395(field_12103[0], "US", "English", false);
   private Map<String, class_7395> field_12102 = ImmutableMap.of("en_us", field_12099);
   private String field_12101;
   private class_7395 field_12104 = field_12099;

   public class_2435(String var1) {
      this.field_12101 = var1;
   }

   private static Map<String, class_7395> method_11098(Stream<class_8169> var0) {
      HashMap var3 = Maps.newHashMap();
      var0.forEach(var1 -> {
         try {
            class_7317 var4 = var1.<class_7317>method_37469(class_7317.field_37404);
            if (var4 != null) {
               for (class_7395 var6 : var4.method_33361()) {
                  var3.putIfAbsent(var6.getCode(), var6);
               }
            }
         } catch (RuntimeException | IOException var7) {
            field_12100.warn("Unable to parse language metadata section of resourcepack: {}", var1.method_37470(), var7);
         }
      });
      return ImmutableMap.copyOf(var3);
   }

   @Override
   public void method_29609(class_7832 var1) {
      this.field_12102 = method_11098(var1.method_35459());
      class_7395 var4 = this.field_12102.getOrDefault("en_us", field_12099);
      this.field_12104 = this.field_12102.getOrDefault(this.field_12101, var4);
      ArrayList var5 = Lists.newArrayList(new class_7395[]{var4});
      if (this.field_12104 != var4) {
         var5.add(this.field_12104);
      }

      class_9648 var6 = class_9648.method_44523(var1, var5);
      class_6956.method_31806(var6);
      LanguageMap.func_240594_a_(var6);
   }

   public void method_11097(class_7395 var1) {
      this.field_12101 = var1.getCode();
      this.field_12104 = var1;
   }

   public class_7395 method_11096() {
      return this.field_12104;
   }

   public SortedSet<class_7395> method_11094() {
      return Sets.newTreeSet(this.field_12102.values());
   }

   public class_7395 method_11095(String var1) {
      return this.field_12102.get(var1);
   }
}
