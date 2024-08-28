package mapped;

import totalcross.json.JSONObject;

import java.util.Date;
import java.util.TreeMap;

public class Class8499 {
   public TreeMap<Date, String> field37176 = new TreeMap<Date, String>();

   public Class8499() {
      System.out.println("new");
   }

   public void method30090(Long var1, String var2) {
      while (this.field37176.containsKey(new Date(var1))) {
         var1 = var1 + 1L;
      }

      this.field37176.put(new Date(var1), var2);
   }

   public JSONObject method30091() {
      return new JSONObject(this.field37176);
   }
}
