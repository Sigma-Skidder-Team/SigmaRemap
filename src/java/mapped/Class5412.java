package mapped;

import java.util.HashMap;
import java.util.Map;

public class Class5412 implements Class5402 {
   private final Map<String, Class6326> field24095 = new HashMap<String, Class6326>();

   public Class5412() {
      this.field24095.put("minecraft:flower_pot", new Class6330());
      this.field24095.put("minecraft:bed", new Class6325());
      this.field24095.put("minecraft:banner", new Class6327());
      this.field24095.put("minecraft:skull", new Class6328());
      this.field24095.put("minecraft:mob_spawner", new Class6331());
      this.field24095.put("minecraft:command_block", new Class6329());
   }

   public int method16999(Class7161 var1, Class9695 var2, Class72 var3, boolean var4) throws Exception {
      Class61 var7 = var3.<Class61>method235("id");
      if (var7 != null) {
         String var8 = (String)var7.method205();
         Class6326 var9 = this.field24095.get(var8);
         if (var9 != null) {
            int var10 = var9.method19263(var1, var3);
            if (var4 && var10 != -1) {
               this.method17000(var1, var2, var10);
            }

            return var10;
         } else {
            if (ViaVersion3.getInstance().method34425()) {
               ViaVersion3.method27613().getLogger().warning("Unhandled BlockEntity " + var8 + " full tag: " + var3);
            }

            return -1;
         }
      } else {
         return -1;
      }
   }

   private void method17000(Class7161 var1, Class9695 var2, int var3) throws Exception {
      Class8563 var6 = new Class8563(11, null, var1);
      var6.method30560(Class4750.field22551, var2);
      var6.method30560(Class4750.field22544, var3);
      var6.method30568(Class6380.class, true, true);
   }
}
