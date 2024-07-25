package remapped;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class class_4691 implements class_5041 {
   private static final Map<class_7794<?, Byte>, Integer> field_22829 = new ConcurrentHashMap<class_7794<?, Byte>, Integer>();

   public static void method_21663(String var0, byte var1, byte var2, int var3) {
      field_22829.put(new class_7794<String, Byte>(var0, var2), var3);
      field_22829.put(new class_7794<Byte, Byte>(var1, var2), var3);
   }

   @Override
   public int method_23214(class_1455 var1, class_5531 var2) {
      Object var5 = !var2.method_25125("Item") ? null : var2.<class_5287>method_25123("Item").method_24129();
      Object var6 = !var2.method_25125("Data") ? null : var2.<class_5287>method_25123("Data").method_24129();
      if (!(var5 instanceof String)) {
         if (!(var5 instanceof Number)) {
            var5 = (byte)0;
         } else {
            var5 = ((Number)var5).byteValue();
         }
      } else {
         var5 = ((String)var5).replace("minecraft:", "");
      }

      if (!(var6 instanceof Number)) {
         var6 = (byte)0;
      } else {
         var6 = ((Number)var6).byteValue();
      }

      Integer var7 = field_22829.get(new class_7794<Object, Byte>(var5, (Byte)var6));
      if (var7 == null) {
         var7 = field_22829.get(new class_7794<Object, Byte>(var5, (byte)0));
         return var7 == null ? 5265 : var7;
      } else {
         return var7;
      }
   }

   static {
      method_21663("air", (byte)0, (byte)0, 5265);
      method_21663("sapling", (byte)6, (byte)0, 5266);
      method_21663("sapling", (byte)6, (byte)1, 5267);
      method_21663("sapling", (byte)6, (byte)2, 5268);
      method_21663("sapling", (byte)6, (byte)3, 5269);
      method_21663("sapling", (byte)6, (byte)4, 5270);
      method_21663("sapling", (byte)6, (byte)5, 5271);
      method_21663("tallgrass", (byte)31, (byte)2, 5272);
      method_21663("yellow_flower", (byte)37, (byte)0, 5273);
      method_21663("red_flower", (byte)38, (byte)0, 5274);
      method_21663("red_flower", (byte)38, (byte)1, 5275);
      method_21663("red_flower", (byte)38, (byte)2, 5276);
      method_21663("red_flower", (byte)38, (byte)3, 5277);
      method_21663("red_flower", (byte)38, (byte)4, 5278);
      method_21663("red_flower", (byte)38, (byte)5, 5279);
      method_21663("red_flower", (byte)38, (byte)6, 5280);
      method_21663("red_flower", (byte)38, (byte)7, 5281);
      method_21663("red_flower", (byte)38, (byte)8, 5282);
      method_21663("red_mushroom", (byte)40, (byte)0, 5283);
      method_21663("brown_mushroom", (byte)39, (byte)0, 5284);
      method_21663("deadbush", (byte)32, (byte)0, 5285);
      method_21663("cactus", (byte)81, (byte)0, 5286);
   }
}
