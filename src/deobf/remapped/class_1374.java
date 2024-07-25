package remapped;

import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.Map;

public class class_1374 extends class_2103 {
   private static String[] field_7457;
   public static final Codec<class_1374> field_7458 = Codec.unit(() -> class_1374.field_7456);
   public static final class_1374 field_7456 = new class_1374();
   private final Map<class_6414, class_6414> field_7455 = Util.<Map<class_6414, class_6414>>method_44659(Maps.newHashMap(), var0 -> {
      var0.put(class_4783.field_23808, class_4783.field_23785);
      var0.put(class_4783.field_23774, class_4783.field_23785);
      var0.put(class_4783.field_23644, class_4783.field_23534);
      var0.put(class_4783.field_23355, class_4783.field_23549);
      var0.put(class_4783.field_23657, class_4783.field_23549);
      var0.put(class_4783.field_23364, class_4783.field_23361);
      var0.put(class_4783.field_23675, class_4783.field_23361);
      var0.put(class_4783.field_23502, class_4783.field_23314);
      var0.put(class_4783.field_23712, class_4783.field_23214);
      var0.put(class_4783.field_23276, class_4783.field_23214);
      var0.put(class_4783.field_23351, class_4783.field_23726);
      var0.put(class_4783.field_23550, class_4783.field_23726);
      var0.put(class_4783.field_23547, class_4783.field_23395);
      var0.put(class_4783.field_23326, class_4783.field_23395);
      var0.put(class_4783.field_23449, class_4783.field_23512);
      var0.put(class_4783.field_23869, class_4783.field_23512);
      var0.put(class_4783.field_23333, class_4783.field_23388);
      var0.put(class_4783.field_23561, class_4783.field_23388);
      var0.put(class_4783.field_23406, class_4783.field_23884);
      var0.put(class_4783.field_23755, class_4783.field_23884);
      var0.put(class_4783.field_23543, class_4783.field_23751);
      var0.put(class_4783.field_23262, class_4783.field_23787);
      var0.put(class_4783.field_23817, class_4783.field_23708);
   });

   private class_1374() {
   }

   @Override
   public class_4099 method_9859(class_4924 var1, class_1331 var2, class_1331 var3, class_4099 var4, class_4099 var5, class_8478 var6) {
      class_6414 var9 = this.field_7455.get(var5.field_19967.method_8360());
      if (var9 != null) {
         class_2522 var10 = var5.field_19967;
         class_2522 var11 = var9.method_29260();
         if (var10.method_10307(class_3049.field_14946)) {
            var11 = var11.method_10308(class_3049.field_14946, var10.<Direction>method_10313(class_3049.field_14946));
         }

         if (var10.method_10307(class_3049.field_14955)) {
            var11 = var11.method_10308(class_3049.field_14955, var10.<class_5122>method_10313(class_3049.field_14955));
         }

         if (var10.method_10307(class_6344.field_32395)) {
            var11 = var11.method_10308(class_6344.field_32395, var10.<class_6666>method_10313(class_6344.field_32395));
         }

         return new class_4099(var5.field_19965, var11, var5.field_19968);
      } else {
         return var5;
      }
   }

   @Override
   public class_2111<?> method_9858() {
      return class_2111.field_10587;
   }
}
