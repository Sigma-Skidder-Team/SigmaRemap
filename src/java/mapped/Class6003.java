package mapped;

import com.mentalfrostbyte.jello.unmapped.Class2314;
import com.mentalfrostbyte.jello.unmapped.Class6001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Class6003 extends Class6001<List<String>> {
   private boolean field26185;

   public Class6003(String var1, String var2, boolean var3, String... var4) {
      super(var1, var2, Class2314.field15858, Arrays.<String>asList(var4));
      this.method18629(var3);
   }

   @Override
   public JSONObject method18611(JSONObject var1) {
      var1.method21806("name", this.method18625());
      var1.method21806("value", new Class2344(this.field26179));
      return var1;
   }

   @Override
   public JSONObject method18610(JSONObject var1) {
      Class2344 var4 = Class8000.method27332(var1, "value");
      this.field26179 = new ArrayList<String>();
      if (var4 != null) {
         for (int var5 = 0; var5 < var4.method9134(); var5++) {
            this.field26179.add(var4.method9131(var5));
         }
      }

      return var1;
   }

   public boolean method18628() {
      return this.field26185;
   }

   public void method18629(boolean var1) {
      this.field26185 = var1;
   }
}
