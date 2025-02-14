package mapped;

import com.mojang.realmsclient.client.RealmsClient;

public class Class756 implements Runnable {
   public final Class9408 field3922;

   public Class756(Class9408 var1) {
      this.field3922 = var1;
   }

   @Override
   public void run() {
      if (Class9408.method36032(this.field3922)) {
         this.method1897();
      }
   }

   private void method1897() {
      try {
         RealmsClient var3 = RealmsClient.method14543();
         Class6131 var4 = null;

         try {
            var4 = var3.method14580();
         } catch (Exception var7) {
         }

         Class6113 var5 = Class8068.method27770();
         if (var4 != null) {
            String var6 = var4.field27474;
            if (var6 != null && !var6.equals(var5.field27378)) {
               var5.field27379 = true;
               var5.field27378 = var6;
               Class8068.method27771(var5);
            }
         }

         Class9408.method36039(this.field3922, var5.field27379);
         Class9408.method36040(this.field3922, var5.field27378);
         Class9408.method36034(this.field3922).put(Class2310.field15838, true);
      } catch (Exception var8) {
         Class9408.method36035().error("Couldn't get unread news", var8);
      }
   }
}
