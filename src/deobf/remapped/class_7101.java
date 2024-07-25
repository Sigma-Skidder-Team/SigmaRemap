package remapped;

import com.google.common.collect.ObjectArrays;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class class_7101 {
   public static final String[] field_36627 = new String[0];
   public static Map<String, String[]> field_36626;
   public static Map<String, String[]> field_36630;
   public static Int2ObjectMap<String> field_36628;

   public static void method_32639() {
      InputStream var2 = class_9333.class.getClassLoader().getResourceAsStream("assets/viaversion/data/blockIds1.12to1.13.json");

      try (InputStreamReader var3 = new InputStreamReader(var2)) {
         Map var5 = (Map)class_9012.method_41350().fromJson(var3, new class_4299().getType());
         field_36626 = new HashMap<String, String[]>(var5);
         field_36630 = new HashMap<String, String[]>();

         for (Entry var7 : field_36626.entrySet()) {
            for (String var11 : (String[])var7.getValue()) {
               String[] var12 = field_36630.get(var11);
               if (var12 == null) {
                  var12 = field_36627;
               }

               field_36630.put(var11, ObjectArrays.concat(var12, var7.getKey()));
            }
         }
      } catch (IOException var43) {
         var43.printStackTrace();
      }

      InputStream var44 = class_9333.class.getClassLoader().getResourceAsStream("assets/viaversion/data/blockNumberToString1.12.json");

      try (InputStreamReader var45 = new InputStreamReader(var44)) {
         Map var47 = (Map)class_9012.method_41350().fromJson(var45, new class_2286().getType());
         field_36628 = new Int2ObjectOpenHashMap(var47);
      } catch (IOException var40) {
         var40.printStackTrace();
      }
   }
}
