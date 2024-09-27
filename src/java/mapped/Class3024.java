package mapped;

import java.util.ArrayList;

public class Class3024 implements Class3008 {
   private static String[] field18166;
   public final int field18167;
   public final int field18168;
   public final Class3136 field18169;

   public Class3024(Class3136 var1, int var2, int var3) {
      this.field18169 = var1;
      this.field18167 = var2;
      this.field18168 = var3;
   }

   @Override
   public void method11400(Class8563 var1) throws Exception {
      var1.method30560(BruhMotha.field22544, this.field18167);
      ArrayList var4 = new ArrayList();
      Class9738 var5 = new Class9738(373, (byte)1, (short)this.field18168, null);
      Class8768.method31628(var5);
      Class8656 var6 = new Class8656(5, Class1950.field12635, var5);
      var4.add(var6);
      var1.method30560(Class7593.field32598, var4);
   }
}
