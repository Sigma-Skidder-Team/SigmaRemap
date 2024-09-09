package mapped;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Class6100 {
   private static final Map<String, Integer> field27346 = new HashMap<String, Integer>();

   public static void method18854(List<Class72> var0, Class7161 var1) {
      for (Class72 var5 : var0) {
         try {
            if (!var5.method234("id")) {
               throw new Exception("NBT tag not handled because the id key is missing");
            }

            String var6 = (String)var5.<Class61>method235("id").method205();
            if (!field27346.containsKey(var6)) {
               throw new Exception("Not handled id: " + var6);
            }

            int var7 = field27346.get(var6);
            if (var7 != -1) {
               int var8 = (Integer)var5.<Class61>method235("x").method205();
               int var9 = (Integer)var5.<Class61>method235("y").method205();
               int var10 = (Integer)var5.<Class61>method235("z").method205();
               Class9695 var11 = new Class9695(var8, (short)var9, var10);
               method18855(var11, (short)var7, var5, var1);
            }
         } catch (Exception var12) {
            if (ViaVersion3.method27614().method34425()) {
               ViaVersion3.method27613().method27366().warning("Block Entity: " + var12.getMessage() + ": " + var5);
            }
         }
      }
   }

   private static void method18855(Class9695 var0, short var1, Class72 var2, Class7161 var3) throws Exception {
      Class8563 var6 = new Class8563(9, null, var3);
      var6.method30560(Class4750.field22551, var0);
      var6.method30560(Class4750.field22522, var1);
      var6.method30560(Class4750.field22555, var2);
      var6.method30567(Class6366.class, false);
   }

   static {
      field27346.put("MobSpawner", 1);
      field27346.put("Control", 2);
      field27346.put("Beacon", 3);
      field27346.put("Skull", 4);
      field27346.put("FlowerPot", 5);
      field27346.put("Banner", 6);
      field27346.put("UNKNOWN", 7);
      field27346.put("EndGateway", 8);
      field27346.put("Sign", 9);
   }
}
