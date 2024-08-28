package mapped;

import org.json.JSONException;

public class Class9481 {
   public String field44071;
   public String[] field44072;
   public long field44073;
   public long field44074;

   public Class9481(String var1) throws Class2455 {
      this(new JSONObject(var1));
   }

   public Class9481(JSONObject var1) throws Class2455 {
      Class2344 var4 = var1.method21768("upgrades");
      int var5 = var4.method9134();
      String[] var6 = new String[var5];

      for (int var7 = 0; var7 < var5; var7++) {
         var6[var7] = var4.method9131(var7);
      }

      this.field44071 = var1.method21773("sid");
      this.field44072 = var6;
      this.field44073 = var1.method21770("pingInterval");
      this.field44074 = var1.method21770("pingTimeout");
   }
}
