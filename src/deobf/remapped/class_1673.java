package remapped;

import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class class_1673 {
   private static String[] field_8671;
   private final List<class_4099> field_8672;
   private final Map<class_6414, List<class_4099>> field_8670 = Maps.newHashMap();

   private class_1673(List<class_4099> var1) {
      this.field_8672 = var1;
   }

   public List<class_4099> method_7496() {
      return this.field_8672;
   }

   public List<class_4099> method_7495(class_6414 var1) {
      return this.field_8670
         .computeIfAbsent(
            var1, var1x -> this.field_8672.stream().filter(var1xx -> var1xx.field_19967.method_8350(var1x)).collect(Collectors.<class_4099>toList())
         );
   }
}
