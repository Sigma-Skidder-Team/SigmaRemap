package mapped;

public class Class3170 implements Class2982 {
   private static String[] field18415;
   public final Class3808 field18416;

   public Class3170(Class3808 var1) {
      this.field18416 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      Class9695 var4 = var1.<Class9695>method30555(Class4750.field22551, 0);
      int var5 = Class7795.method25886(var1.<Integer>method30555(Class4750.field22544, 0));
      Class7161 var6 = var1.method30580();
      if (Class8042.method27612().method21925()) {
         Class9322.method35225(var6, var4.method37962(), var4.method37963(), var4.method37964(), var5);
         var5 = Class9322.method35232(var6, var4, var5);
      }

      var1.method30558(Class4750.field22544, 0, Class7795.method25888(var1.method30580(), var4, var5));
      if (Class8042.method27612().method21925()) {
         var1.method30568(Class6380.class, true, true);
         var1.method30578();
         Class9322.method35222(var6, var4);
      }
   }
}
