package mapped;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

public class Class6506 implements Class6504<Class4854> {
   public Class4854 method19700(ResourceLocation var1, JsonObject var2) {
      String var5 = Class8963.method32764(var2, "group", "");
      Class25 var6 = method19703(Class8963.method32785(var2, "ingredients"));
      if (!var6.isEmpty()) {
         if (var6.size() <= 9) {
            Class8848 var7 = Class4852.method14987(Class8963.method32782(var2, "result"));
            return new Class4854(var1, var5, var7, var6);
         } else {
            throw new JsonParseException("Too many ingredients for shapeless recipe");
         }
      } else {
         throw new JsonParseException("No ingredients for shapeless recipe");
      }
   }

   private static Class25<Class120> method19703(JsonArray var0) {
      Class25 var3 = Class25.method67();

      for (int var4 = 0; var4 < var0.size(); var4++) {
         Class120 var5 = Class120.method344(var0.get(var4));
         if (!var5.method337()) {
            var3.add(var5);
         }
      }

      return var3;
   }

   public Class4854  method19699(ResourceLocation var1, PacketBuffer var2) {
      String var5 = var2.method35728(32767);
      int var6 = var2.method35714();
      Class25 var7 = Class25.<Class120>method68(var6, Class120.field427);

      for (int var8 = 0; var8 < var7.size(); var8++) {
         var7.set(var8, Class120.method343(var2));
      }

      Class8848 var9 = var2.method35726();
      return new Class4854(var1, var5, var9, var7);
   }

   public void method19698(PacketBuffer var1, Class4854 var2) {
      var1.method35729(Class4854.method14998(var2));
      var1.writeVarInt(Class4854.method14999(var2).size());

      for (Class120 var6 : Class4854.method14999(var2)) {
         var6.method335(var1);
      }

      var1.method35724(Class4854.method15000(var2));
   }
}
