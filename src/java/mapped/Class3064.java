package mapped;

import java.util.List;

public class Class3064 implements Class2982 {
   public final Class3975 field18230;

   public Class3064(Class3975 var1) {
      this.field18230 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      List var4 = var1.method30555(Class7593.field32598, 0);
      int var5 = var1.<Integer>method30555(Class4750.field22544, 0);
      Class6057 var6 = var1.method30580().<Class6057>method22438(Class6057.class);
      if (!var6.method18667(var5)) {
         ViaVersion3.method27613().method27366().warning("Unable to find entity for metadata, entity ID: " + var5);
         var4.clear();
      } else {
         this.field18230.field20269.<Class6912>method19373(Class6912.class).method21090(var5, var4, var1.method30580());
      }
   }
}
