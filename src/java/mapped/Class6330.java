package mapped;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Class6330 implements Class6326 {
   private static final Map<Class9284<?, Byte>, Integer> field27842 = new ConcurrentHashMap<Class9284<?, Byte>, Integer>();

   public static void method19267(String var0, byte var1, byte var2, int var3) {
      field27842.put(new Class9284<String, Byte>(var0, var2), var3);
      field27842.put(new Class9284<Byte, Byte>(var1, var2), var3);
   }

   @Override
   public int method19263(Class7161 var1, Class72 var2) {
      Object var5 = !var2.method234("Item") ? null : var2.<Class61>method235("Item").method205();
      Object var6 = !var2.method234("Data") ? null : var2.<Class61>method235("Data").method205();
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

      Integer var7 = field27842.get(new Class9284<Object, Byte>(var5, (Byte)var6));
      if (var7 == null) {
         var7 = field27842.get(new Class9284<Object, Byte>(var5, (byte)0));
         return var7 == null ? 5265 : var7;
      } else {
         return var7;
      }
   }

   static {
      method19267("air", (byte)0, (byte)0, 5265);
      method19267("sapling", (byte)6, (byte)0, 5266);
      method19267("sapling", (byte)6, (byte)1, 5267);
      method19267("sapling", (byte)6, (byte)2, 5268);
      method19267("sapling", (byte)6, (byte)3, 5269);
      method19267("sapling", (byte)6, (byte)4, 5270);
      method19267("sapling", (byte)6, (byte)5, 5271);
      method19267("tallgrass", (byte)31, (byte)2, 5272);
      method19267("yellow_flower", (byte)37, (byte)0, 5273);
      method19267("red_flower", (byte)38, (byte)0, 5274);
      method19267("red_flower", (byte)38, (byte)1, 5275);
      method19267("red_flower", (byte)38, (byte)2, 5276);
      method19267("red_flower", (byte)38, (byte)3, 5277);
      method19267("red_flower", (byte)38, (byte)4, 5278);
      method19267("red_flower", (byte)38, (byte)5, 5279);
      method19267("red_flower", (byte)38, (byte)6, 5280);
      method19267("red_flower", (byte)38, (byte)7, 5281);
      method19267("red_flower", (byte)38, (byte)8, 5282);
      method19267("red_mushroom", (byte)40, (byte)0, 5283);
      method19267("brown_mushroom", (byte)39, (byte)0, 5284);
      method19267("deadbush", (byte)32, (byte)0, 5285);
      method19267("cactus", (byte)81, (byte)0, 5286);
   }
}
