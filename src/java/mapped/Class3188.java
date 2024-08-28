package mapped;

public class Class3188 implements Class2982 {
   private static String[] field18448;
   public final Class3958 field18449;

   public Class3188(Class3958 var1) {
      this.field18449 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      Class9738 var4 = var1.<Class9738>method30555(Class4750.field22561, 0);
      if (!Class8042.method27612().method21916()) {
         Class8417.method29573(var4);
      } else {
         byte var5 = var1.<Byte>method30555(Class4750.field22518, 0);
         int var6 = var1.<Integer>method30555(Class4750.field22544, 0);
         if (var6 == 1 && var5 == 0 && var4 == null) {
            short var7 = var1.<Short>method30555(Class4750.field22522, 0);
            short var8 = var1.<Short>method30555(Class4750.field22534, 0);
            short var9 = var1.<Short>method30555(Class4750.field22534, 1);
            Class5414 var10 = Class8042.method27614().method34424().<Class5414>method31084(Class5414.class);
            boolean var11 = var10.method17009(var7, var8, var9, var1.method30580());
            if (var11) {
               var1.method30578();
            }
         } else {
            Class8417.method29573(var4);
         }
      }
   }
}
