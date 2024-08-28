package mapped;

import com.google.common.collect.ObjectArrays;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Class9123 {
   public static final String[] field41924 = new String[0];
   public static Map<String, String[]> field41925;
   public static Map<String, String[]> field41926;
   public static Int2ObjectMap<String> field41927;

   public static void method34035() {
      InputStream var2 = Class5980.class.getClassLoader().getResourceAsStream("assets/viaversion/data/blockIds1.12to1.13.json");

      try (InputStreamReader var3 = new InputStreamReader(var2)) {
         Map<String, String[]> var5 = Class9610.method37357().fromJson(var3, new Class5800().getType());
         field41925 = new HashMap<>(var5);
         field41926 = new HashMap<>();

         for (Entry<String, String[]> var7 : field41925.entrySet()) {
            for (String var11 : var7.getValue()) {
               String[] var12 = field41926.get(var11);
               if (var12 == null) {
                  var12 = field41924;
               }

               field41926.put(var11, ObjectArrays.concat(var12, var7.getKey()));
            }
         }
      } catch (IOException var43) {
         var43.printStackTrace();
      }

      InputStream var44 = Class5980.class.getClassLoader().getResourceAsStream("assets/viaversion/data/blockNumberToString1.12.json");

      try (InputStreamReader var45 = new InputStreamReader(var44)) {
         Map var47 = (Map)Class9610.method37357().fromJson(var45, new Class5802().getType());
         field41927 = new Int2ObjectOpenHashMap(var47);
      } catch (IOException var40) {
         var40.printStackTrace();
      }
   }
}
