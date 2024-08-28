package mapped;

import java.util.concurrent.ThreadLocalRandom;

public class Class3087 implements Class2982 {
   public final Class3945 field18265;

   public Class3087(Class3945 var1) {
      this.field18265 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      Class8563 var4 = var1.method30573(8);
      var4.method30560(Class4750.field22522, (short)var1.method30580().<Class6058>method22438(Class6058.class).method18781());
      var4.method30560(Class4750.field22534, (short)-999);
      var4.method30560(Class4750.field22518, (byte)2);
      var4.method30560(Class4750.field22534, (short)ThreadLocalRandom.current().nextInt());
      var4.method30560(Class4750.field22544, 5);
      Class72 var5 = new Class72("");
      var5.<Class68>method236(new Class68("force_resync", Double.NaN));
      var4.method30560(Class4750.field22569, new Class9738(1, (byte)1, (short)0, var5));
      var4.method30583(Class6371.class, true, false);
   }
}
