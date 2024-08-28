package mapped;

import com.mentalfrostbyte.jello.unmapped.Class2314;
import com.mentalfrostbyte.jello.unmapped.Class6001;

import java.util.Arrays;
import java.util.List;

public abstract class Class6006 extends Class6001<Boolean> {
   public List<Class6001> field26189;

   public Class6006(String var1, String var2, Class2314 var3, boolean var4, List<Class6001> var5) {
      super(var1, var2, var3, var4);
      this.field26189 = var5;
   }

   public Class6006(String var1, String var2, Class2314 var3, boolean var4, Class6001... var5) {
      this(var1, var2, var3, var4, Arrays.<Class6001>asList(var5));
   }

   @Override
   public JSONObject method18610(JSONObject var1) {
      Class2344 var4 = Class8000.method27332(var1, this.method18625());
      if (var4 != null) {
         for (int var5 = 0; var5 < var4.method9134(); var5++) {
            JSONObject var6 = var4.method9129(var5);
            String var7 = Class8000.method27330(var1, "name", null);

            for (Class6001 var9 : this.method18635()) {
               if (var9.method18625().equals(var7)) {
                  var9.method18610(var6);
                  break;
               }
            }
         }
      }

      this.field26179 = Class8000.method27324(var1, "value", this.method18624());
      return var1;
   }

   @Override
   public JSONObject method18611(JSONObject var1) {
      Class2344 var4 = new Class2344();

      for (Class6001 var6 : this.method18635()) {
         var4.method9158(var6.method18611(new JSONObject()));
      }

      var1.method21806("children", var4);
      var1.method21806("name", this.method18625());
      return super.method18611(var1);
   }

   public List<Class6001> method18635() {
      return this.field26189;
   }
}
