package mapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;

public class Class6363 extends ViaVersion7<Class1933, Class1935, Class1923, Class1928> {
   public static final Class3032<String, JsonElement> field27929 = new Class3046(BruhMotha.field22538);

   public Class6363() {
      super(Class1933.class, Class1935.class, Class1923.class, Class1928.class);
   }

   public static JsonElement method19381(String var0) {
      if (var0 != null && !var0.equalsIgnoreCase("null")) {
         if ((!var0.startsWith("\"") || !var0.endsWith("\"")) && (!var0.startsWith("{") || !var0.endsWith("}"))) {
            return method19382(var0);
         }

         if (var0.startsWith("\"") && var0.endsWith("\"")) {
            var0 = "{\"text\":" + var0 + "}";
         }
      } else {
         var0 = "{\"text\":\"\"}";
      }

      try {
         return (JsonElement)Class9610.method37357().fromJson(var0, JsonObject.class);
      } catch (Exception var4) {
         if (ViaVersion3.method27612().method21914()) {
            return method19382(var0);
         } else {
            ViaVersion3.method27613()
               .getLogger()
               .warning("Invalid JSON String: \"" + var0 + "\" Please report this issue to the ViaVersion Github: " + var4.getMessage());
            return (JsonElement)Class9610.method37357().fromJson("{\"text\":\"\"}", JsonObject.class);
         }
      }
   }

   private static JsonElement method19382(String var0) {
      JsonObject var3 = new JsonObject();
      var3.addProperty("text", var0);
      return var3;
   }

   public static Class9738 method19383(Class7161 var0) {
      return ViaVersion3.getInstance().method34424().<Class5408>method31084(Class5408.class).method16994(var0);
   }

   public static boolean method19384(int var0) {
      if (var0 != 267) {
         if (var0 != 268) {
            if (var0 != 272) {
               return var0 != 276 ? var0 == 283 : true;
            } else {
               return true;
            }
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   @Override
   public void method19341() {
      new Class6912(this);
      this.method19356(Class187.field701, 0, 0, new Class3801(this));
      Class8607.method30846(this);
      Class8669.method31207(this);
      Class8966.method32816(this);
      Class8416.method29571(this);
      Class7766.method25743(this);
   }

   @Override
   public void method19349(ViaVersion6 var1) {
      var1.method31082(Class5408.class, new Class5408());
      var1.method31082(Class5419.class, new Class5419());
      var1.method31082(Class5413.class, new Class5413());
      var1.method31082(Class5401.class, new Class5401());
      var1.method31082(Class5415.class, new Class5415());
      var1.method31082(Class5407.class, new Class5407());
      var1.method31081(Class5410.class);
   }

   @Override
   public boolean method19345(Class var1) {
      return ViaVersion3.getInstance().method34424().<Class5419>method31084(Class5419.class).method17014(var1);
   }

   @Override
   public void method19346(Class7161 var1, Object var2, List var3) throws Exception {
      var3.addAll(var1.<Class6051>method22438(Class6051.class).method18737(var2));
   }

   @Override
   public void method19342(Class7161 var1) {
      var1.method22440(new Class6057(var1));
      var1.method22440(new Class6051(var1));
      var1.method22440(new Class6042(var1));
      var1.method22440(new Class6049(var1));
      var1.method22440(new Class6044(var1));
      var1.method22440(new Class6045(var1));
   }
}
