package mapped;

import io.netty.channel.ChannelFuture;

public class Class3157 implements Class2982 {
   private static String[] field18390;
   public final Class3788 field18391;

   public Class3157(Class3788 var1) {
      this.field18391 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      int var4 = var1.method30580().method22465().method18675();
      if (Class8042.method27612().method21942().contains(var4)) {
         if (!var1.method30580().method22464().isOpen()) {
            return;
         }

         if (!var1.method30580().method22489()) {
            return;
         }

         Class8563 var5 = new Class8563(0, null, var1.method30580());
         Class6363.field27929.method11399(var5, Class2307.method9078('&', Class8042.method27612().method21917()));
         var1.method30578();
         ChannelFuture var6 = var5.method30571(Class6377.class);
         var6.addListener(var1x -> var1.method30580().method22464().close());
      }
   }
}
