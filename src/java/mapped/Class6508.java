package mapped;

import com.google.gson.JsonObject;

public class Class6508<T extends Class4844> implements Class6504<T> {
   public final Class5644<T> field28493;

   public Class6508(Class5644<T> var1) {
      this.field28493 = var1;
   }

   public T method19700(ResourceLocation var1, JsonObject var2) {
      String var5 = Class8963.method32764(var2, "group", "");
      Class120 var6;
      if (!Class8963.method32759(var2, "ingredient")) {
         var6 = Class120.method344(Class8963.method32782(var2, "ingredient"));
      } else {
         var6 = Class120.method344(Class8963.method32785(var2, "ingredient"));
      }

      String var7 = Class8963.method32763(var2, "result");
      int var8 = Class8963.method32777(var2, "count");
      Class8848 var9 = new Class8848(Class2348.field16075.method9184(new ResourceLocation(var7)), var8);
      return this.field28493.method17789(var1, var5, var6, var9);
   }

   public T method19699(ResourceLocation var1, PacketBuffer var2) {
      String var5 = var2.method35728(32767);
      Class120 var6 = Class120.method343(var2);
      Class8848 var7 = var2.method35726();
      return this.field28493.method17789(var1, var5, var6, var7);
   }

   public void method19698(PacketBuffer var1, T var2) {
      var1.method35729(var2.field22623);
      var2.field22618.method335(var1);
      var1.method35724(var2.field22619);
   }
}
