package mapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Class4678 {
   private final List<Pattern> field22250;
   private final List<Pattern> field22251;
   private final List<Pattern> field22252;

   public Class4678(List<Pattern> var1, List<Pattern> var2, List<Pattern> var3) {
      this.field22250 = var1;
      this.field22251 = var2;
      this.field22252 = var3;
   }

   private static String method14669(List<Pattern> var0, String var1) {
      ArrayList var4 = Lists.newArrayList();

      for (Pattern var6 : var0) {
         Matcher var7 = var6.matcher(var1);

         while (var7.find()) {
            var4.add(var7.group());
         }
      }

      return String.join(", ", var4);
   }

   private ImmutableMap<String, String> method14670() {
      Builder var3 = new Builder();
      String var4 = method14669(this.field22250, Class9036.method33487());
      if (!var4.isEmpty()) {
         var3.put("renderer", var4);
      }

      String var5 = method14669(this.field22251, Class9036.method33488());
      if (!var5.isEmpty()) {
         var3.put("version", var5);
      }

      String var6 = method14669(this.field22252, Class9036.method33485());
      if (!var6.isEmpty()) {
         var3.put("vendor", var6);
      }

      return var3.build();
   }

   // $VF: synthetic method
   public static ImmutableMap method14671(Class4678 var0) {
      return var0.method14670();
   }
}
