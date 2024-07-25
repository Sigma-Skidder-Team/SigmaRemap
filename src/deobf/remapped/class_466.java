package remapped;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class class_466 {
   private static final Map<String, Integer> field_2918 = new HashMap<String, Integer>();

   public static void method_2237(List<class_5531> var0, class_1455 var1) {
      for (class_5531 var5 : var0) {
         try {
            if (!var5.method_25125("id")) {
               throw new Exception("NBT tag not handled because the id key is missing");
            }

            String var6 = (String)var5.<class_5287>method_25123("id").method_24129();
            if (!field_2918.containsKey(var6)) {
               throw new Exception("Not handled id: " + var6);
            }

            int var7 = field_2918.get(var6);
            if (var7 != -1) {
               int var8 = (Integer)var5.<class_5287>method_25123("x").method_24129();
               int var9 = (Integer)var5.<class_5287>method_25123("y").method_24129();
               int var10 = (Integer)var5.<class_5287>method_25123("z").method_24129();
               class_9371 var11 = new class_9371(var8, (short)var9, var10);
               method_2238(var11, (short)var7, var5, var1);
            }
         } catch (Exception var12) {
            if (class_3446.method_15883().method_33731()) {
               class_3446.method_15886().method_34617().warning("Block Entity: " + var12.getMessage() + ": " + var5);
            }
         }
      }
   }

   private static void method_2238(class_9371 var0, short var1, class_5531 var2, class_1455 var3) throws Exception {
      class_5051 var6 = new class_5051(9, null, var3);
      var6.method_23236(class_8039.field_41137, var0);
      var6.method_23236(class_8039.field_41175, var1);
      var6.method_23236(class_8039.field_41158, var2);
      var6.method_23234(class_5305.class, false);
   }

   static {
      field_2918.put("MobSpawner", 1);
      field_2918.put("Control", 2);
      field_2918.put("Beacon", 3);
      field_2918.put("Skull", 4);
      field_2918.put("FlowerPot", 5);
      field_2918.put("Banner", 6);
      field_2918.put("UNKNOWN", 7);
      field_2918.put("EndGateway", 8);
      field_2918.put("Sign", 9);
   }
}
