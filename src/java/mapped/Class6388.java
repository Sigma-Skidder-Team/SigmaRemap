package mapped;

import com.google.common.collect.Lists;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class Class6388 {
   private String field27968;
   private final List<String> field27969 = Lists.newArrayList();

   public Class6388() {
   }

   private void method19416(String var1) {
      this.field27969.add(0, var1);
   }

   public String method19417() {
      return StringUtils.join(this.field27969, "->");
   }

   @Override
   public String toString() {
      if (this.field27968 == null) {
         return !this.field27969.isEmpty() ? "(Unknown file) " + this.method19417() : "(Unknown file)";
      } else {
         return !this.field27969.isEmpty() ? this.field27968 + " " + this.method19417() : this.field27968;
      }
   }

   // $VF: synthetic method
   public static void method19418(Class6388 var0, String var1) {
      var0.method19416(var1);
   }

   // $VF: synthetic method
   public static String method19419(Class6388 var0, String var1) {
      return var0.field27968 = var1;
   }
}
