package mapped;

import totalcross.json.JSONArray;
import totalcross.json.JSONException;
import totalcross.json.JSONObject;

public class Class9481 {
   public String field44071;
   public String[] field44072;
   public long field44073;
   public long field44074;

   public Class9481(String var1) throws JSONException {
      this(new JSONObject(var1));
   }

   public Class9481(JSONObject var1) throws JSONException {
      JSONArray var4 = var1.getJSONArray("upgrades");
      int var5 = var4.length();
      String[] var6 = new String[var5];

      for (int var7 = 0; var7 < var5; var7++) {
         var6[var7] = var4.getString(var7);
      }

      this.field44071 = var1.method21773("sid");
      this.field44072 = var6;
      this.field44073 = var1.method21770("pingInterval");
      this.field44074 = var1.method21770("pingTimeout");
   }
}
