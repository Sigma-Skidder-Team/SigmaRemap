package remapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class class_192 {
   private final List<Pattern> field_643;
   private final List<Pattern> field_644;
   private final List<Pattern> field_642;

   private class_192(List<Pattern> var1, List<Pattern> var2, List<Pattern> var3) {
      this.field_643 = var1;
      this.field_644 = var2;
      this.field_642 = var3;
   }

   private static String method_857(List<Pattern> var0, String var1) {
      ArrayList var4 = Lists.newArrayList();

      for (Pattern var6 : var0) {
         Matcher var7 = var6.matcher(var1);

         while (var7.find()) {
            var4.add(var7.group());
         }
      }

      return String.join(", ", var4);
   }

   private ImmutableMap<String, String> method_856() {
      Builder var3 = new Builder();
      String var4 = method_857(this.field_643, class_6765.method_31016());
      if (!var4.isEmpty()) {
         var3.put("renderer", var4);
      }

      String var5 = method_857(this.field_644, class_6765.method_31018());
      if (!var5.isEmpty()) {
         var3.put("version", var5);
      }

      String var6 = method_857(this.field_642, class_6765.method_31017());
      if (!var6.isEmpty()) {
         var3.put("vendor", var6);
      }

      return var3.build();
   }
}
