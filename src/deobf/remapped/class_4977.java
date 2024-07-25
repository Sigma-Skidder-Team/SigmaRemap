package remapped;

import com.google.common.collect.Maps;
import java.util.EnumMap;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_4977 {
   private static String[] field_25765;
   private static final Logger field_25764 = LogManager.getLogger();
   public static final EnumMap<Direction, class_1221> field_25762 = Util.<EnumMap<Direction, class_1221>>make(
      Maps.newEnumMap(Direction.class),
      var0 -> {
         var0.put(Direction.field_800, class_1221.method_5406());
         var0.put(
            Direction.field_804,
            new class_1221((class_2426)null, new Quaternion(new class_2426(0.0F, 1.0F, 0.0F), 90.0F, true), (class_2426)null, (Quaternion)null)
         );
         var0.put(
            Direction.field_809,
            new class_1221((class_2426)null, new Quaternion(new class_2426(0.0F, 1.0F, 0.0F), -90.0F, true), (class_2426)null, (Quaternion)null)
         );
         var0.put(
            Direction.field_818,
            new class_1221((class_2426)null, new Quaternion(new class_2426(0.0F, 1.0F, 0.0F), 180.0F, true), (class_2426)null, (Quaternion)null)
         );
         var0.put(
            Direction.field_817,
            new class_1221((class_2426)null, new Quaternion(new class_2426(1.0F, 0.0F, 0.0F), -90.0F, true), (class_2426)null, (Quaternion)null)
         );
         var0.put(
            Direction.field_802,
            new class_1221((class_2426)null, new Quaternion(new class_2426(1.0F, 0.0F, 0.0F), 90.0F, true), (class_2426)null, (Quaternion)null)
         );
      }
   );
   public static final EnumMap<Direction, class_1221> field_25763 = Util.<EnumMap<Direction, class_1221>>make(
      Maps.newEnumMap(Direction.class), var0 -> {
         for (Direction var6 : Direction.values()) {
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

   public static class_1221 method_22874(class_1221 var0, Direction var1, Supplier<String> var2) {
      Direction var5 = Direction.method_1048(var0.method_5410(), var1);
      class_1221 var6 = var0.method_5403();
      if (var6 != null) {
         class_1221 var7 = field_25763.get(var1).method_5404(var6).method_5404(field_25762.get(var5));
         return method_22875(var7);
      } else {
         field_25764.warn((String)var2.get());
         return new class_1221((class_2426)null, (Quaternion)null, new class_2426(0.0F, 0.0F, 0.0F), (Quaternion)null);
      }
   }
}
