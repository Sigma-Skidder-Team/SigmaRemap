package mapped;

import com.google.gson.JsonObject;
import java.util.Map;

public class Class6507 implements Class6504<Class4852> {
   public Class4852 method19700(ResourceLocation var1, JsonObject var2) {
      String var5 = Class8963.method32764(var2, "group", "");
      Map var6 = Class4852.method14989(Class8963.method32782(var2, "key"));
      String[] var7 = Class4852.method14982(Class4852.method14990(Class8963.method32785(var2, "pattern")));
      int var8 = var7[0].length();
      int var9 = var7.length;
      Class25 var10 = Class4852.method14991(var7, var6, var8, var9);
      ItemStack var11 = Class4852.method14987(Class8963.method32782(var2, "result"));
      return new Class4852(var1, var5, var8, var9, var10, var11);
   }

   public Class4852 method19699(ResourceLocation var1, PacketBuffer var2) {
      int var5 = var2.method35714();
      int var6 = var2.method35714();
      String var7 = var2.method35728(32767);
      Class25 var8 = Class25.<Class120>method68(var5 * var6, Class120.field427);

      for (int var9 = 0; var9 < var8.size(); var9++) {
         var8.set(var9, Class120.method343(var2));
      }

      ItemStack var10 = var2.method35726();
      return new Class4852(var1, var7, var5, var6, var8, var10);
   }

   public void method19698(PacketBuffer var1, Class4852 var2) {
      var1.writeVarInt(Class4852.method14992(var2));
      var1.writeVarInt(Class4852.method14993(var2));
      var1.method35729(Class4852.method14994(var2));

      for (Class120 var6 : Class4852.method14995(var2)) {
         var6.method335(var1);
      }

      var1.method35724(Class4852.method14996(var2));
   }
}
