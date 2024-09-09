package mapped;

import java.util.Optional;

public class Class3161 implements Class2982 {
   private static String[] field18398;
   public final Class3927 field18399;

   public Class3161(Class3927 var1) {
      this.field18399 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      Class5413 var4 = ViaVersion3.method27614().method34424().<Class5413>method31084(Class5413.class);
      Class9695 var5 = var1.<Class9695>method30555(Class4750.field22551, 0);
      Optional var6 = var4.method17002(var1.method30580(), var5);
      if (var6.isPresent()) {
         Class8563 var7 = new Class8563(9, null, var1.method30580());
         var7.method30560(Class4750.field22551, var5);
         var7.method30560(Class4750.field22522, (short)2);
         var7.method30560(Class4750.field22555, (Class72)var6.get());
         var7.method30570(Class6363.class);
      }
   }
}
