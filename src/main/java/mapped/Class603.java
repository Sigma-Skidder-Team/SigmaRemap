package mapped;

import com.mojang.realmsclient.client.RealmsClient;
import net.minecraft.client.Minecraft;

import java.util.List;

public class Class603 implements Runnable {
   public final Class9408 field2978;

   public Class603(Class9408 var1) {
      this.field2978 = var1;
   }

   @Override
   public void run() {
      if (Class9408.method36032(this.field2978)) {
         this.method1896();
      }
   }

   private void method1896() {
      try {
         RealmsClient var3 = RealmsClient.method14543();
         List var4 = var3.method14547().field27398;
         if (var4 != null) {
            var4.sort(new Class3575(Minecraft.getInstance().getSession().getUsername()));
            Class9408.method36037(this.field2978, var4);
            Class9408.method36034(this.field2978).put(Class2310.field15834, true);
         } else {
            Class9408.method36035().warn("Realms server list was null or empty");
         }
      } catch (Exception var5) {
         Class9408.method36034(this.field2978).put(Class2310.field15834, true);
         Class9408.method36035().error("Couldn't get server list", var5);
      }
   }
}
