package remapped;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public class class_2142 {
   private static String[] field_10730;
   private final class_3975 field_10732;
   private final List<class_2741> field_10731 = Lists.newArrayList();

   public class_2142(class_3975 var1) {
      this.field_10732 = var1;
   }

   public class_2142 method_10003(int var1, class_6275 var2) {
      this.field_10731.add(new class_2741(var1, var2));
      return this;
   }

   public class_3975 method_10004() {
      this.field_10731.stream().<class_6275>map(class_2741::method_12372).collect(Collectors.toSet()).forEach(this.field_10732::method_18354);
      this.field_10731.forEach(var1 -> {
         class_6275 var4 = var1.method_12372();
         this.field_10732.method_18351(var4).forEach(var1x -> var1x.method_8144(var1.method_12373(), 0.0F));
         this.field_10732.method_18350(var4).method_8144(var1.method_12373(), 1.0F);
      });
      return this.field_10732;
   }
}
