package remapped;

import org.json.JSONException;

public class class_8548 {
   public String field_43745;
   public String[] field_43747;
   public long field_43749;
   public long field_43748;

   public class_8548(String var1) throws JSONException {
      this(new JSONObjectImpl(var1));
   }

   public class_8548(JSONObjectImpl var1) throws JSONException {
      JSONArray var4 = var1.method_5849("upgrades");
      int var5 = var4.method_6142();
      String[] var6 = new String[var5];

      for (int var7 = 0; var7 < var5; var7++) {
         var6[var7] = var4.method_6133(var7);
      }

      this.field_43745 = var1.method_5861("sid");
      this.field_43747 = var6;
      this.field_43749 = var1.method_5840("pingInterval");
      this.field_43748 = var1.method_5840("pingTimeout");
   }
}
