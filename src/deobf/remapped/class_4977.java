package remapped;

import com.google.common.collect.Maps;
import java.util.EnumMap;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_4977 {
   private static String[] field_25765;
   private static final Logger field_25764 = LogManager.getLogger();
   public static final EnumMap<class_240, class_1221> field_25762 = Util.<EnumMap<class_240, class_1221>>method_44659(
      Maps.newEnumMap(class_240.class),
      var0 -> {
         var0.put(class_240.field_800, class_1221.method_5406());
         var0.put(
            class_240.field_804,
            new class_1221((class_2426)null, new class_5422(new class_2426(0.0F, 1.0F, 0.0F), 90.0F, true), (class_2426)null, (class_5422)null)
         );
         var0.put(
            class_240.field_809,
            new class_1221((class_2426)null, new class_5422(new class_2426(0.0F, 1.0F, 0.0F), -90.0F, true), (class_2426)null, (class_5422)null)
         );
         var0.put(
            class_240.field_818,
            new class_1221((class_2426)null, new class_5422(new class_2426(0.0F, 1.0F, 0.0F), 180.0F, true), (class_2426)null, (class_5422)null)
         );
         var0.put(
            class_240.field_817,
            new class_1221((class_2426)null, new class_5422(new class_2426(1.0F, 0.0F, 0.0F), -90.0F, true), (class_2426)null, (class_5422)null)
         );
         var0.put(
            class_240.field_802,
            new class_1221((class_2426)null, new class_5422(new class_2426(1.0F, 0.0F, 0.0F), 90.0F, true), (class_2426)null, (class_5422)null)
         );
      }
   );
   public static final EnumMap<class_240, class_1221> field_25763 = Util.<EnumMap<class_240, class_1221>>method_44659(
      Maps.newEnumMap(class_240.class), var0 -> {
         for (class_240 var6 : class_240.values()) {
            var0.put(var6, field_25762.get(var6).method_5403());
         }
      }
   );

   public static class_1221 method_22875(class_1221 var0) {
      class_8107 var3 = class_8107.method_36813(0.5F, 0.5F, 0.5F);
      var3.method_36832(var0.method_5410());
      var3.method_36832(class_8107.method_36813(-0.5F, -0.5F, -0.5F));
      return new class_1221(var3);
   }

   public static class_1221 method_22874(class_1221 var0, class_240 var1, Supplier<String> var2) {
      class_240 var5 = class_240.method_1048(var0.method_5410(), var1);
      class_1221 var6 = var0.method_5403();
      if (var6 != null) {
         class_1221 var7 = field_25763.get(var1).method_5404(var6).method_5404(field_25762.get(var5));
         return method_22875(var7);
      } else {
         field_25764.warn((String)var2.get());
         return new class_1221((class_2426)null, (class_5422)null, new class_2426(0.0F, 0.0F, 0.0F), (class_5422)null);
      }
   }
}
