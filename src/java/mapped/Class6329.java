package mapped;

import com.google.gson.JsonElement;

public class Class6329 implements Class6326 {
   @Override
   public int method19263(Class7161 var1, Class72 var2) {
      Class61 var5 = var2.<Class61>method235("CustomName");
      if (var5 instanceof Class71) {
         ((Class71)var5).method231(Class2980.method11395(((Class71)var5).method205()));
      }

      Class61 var6 = var2.<Class61>method235("LastOutput");
      if (var6 instanceof Class71) {
         JsonElement var7 = Class9610.method37359().parse(((Class71)var6).method205());
         Class2980.method11397(var7);
         ((Class71)var6).method231(var7.toString());
      }

      return -1;
   }
}
