package mapped;

import com.google.gson.JsonElement;

public class Class2995 implements Class2982 {
   public final Class3772 field18116;

   public Class2995(Class3772 var1) {
      this.field18116 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      Class9695 var4 = var1.<Class9695>method30559(BruhMotha.field22551);
      JsonElement[] var5 = new JsonElement[4];

      for (int var6 = 0; var6 < 4; var6++) {
         var5[var6] = var1.<JsonElement>method30559(BruhMotha.field22538);
      }

      var1.method30564();
      var1.method30587(9);
      var1.method30560(BruhMotha.field22551, var4);
      var1.method30560(BruhMotha.field22522, (short)9);
      Class72 var8 = new Class72("");
      var8.<Class71>method236(new Class71("id", "Sign"));
      var8.<Class66>method236(new Class66("x", var4.method37962()));
      var8.<Class66>method236(new Class66("y", var4.method37963()));
      var8.<Class66>method236(new Class66("z", var4.method37964()));

      for (int var7 = 0; var7 < var5.length; var7++) {
         var8.<Class71>method236(new Class71("Text" + (var7 + 1), var5[var7].toString()));
      }

      var1.method30560(BruhMotha.field22555, var8);
   }
}
