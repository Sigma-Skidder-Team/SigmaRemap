package mapped;

import com.google.common.collect.Lists;
import java.io.File;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class7970 {
   private static final Logger field34261 = LogManager.getLogger();
   private final Minecraft field34262;
   private final List<ServerData> field34263 = Lists.newArrayList();

   public Class7970(Minecraft var1) {
      this.field34262 = var1;
      this.method27094();
   }

   public void method27094() {
      try {
         this.field34263.clear();
         CompoundNBT var3 = Class8799.method31770(new File(this.field34262.gameDir, "servers.dat"));
         if (var3 == null) {
            return;
         }

         ListNBT var4 = var3.method131("servers", 10);

         for (int var5 = 0; var5 < var4.size(); var5++) {
            this.field34263.add(ServerData.method25579(var4.method153(var5)));
         }
      } catch (Exception var6) {
         field34261.error("Couldn't load server list", var6);
      }
   }

   public void method27095() {
      try {
         ListNBT var3 = new ListNBT();

         for (ServerData var5 : this.field34263) {
            var3.add(var5.method25576());
         }

         CompoundNBT var9 = new CompoundNBT();
         var9.put("servers", var3);
         File var10 = File.createTempFile("servers", ".dat", this.field34262.gameDir);
         Class8799.method31769(var9, var10);
         File var6 = new File(this.field34262.gameDir, "servers.dat_old");
         File var7 = new File(this.field34262.gameDir, "servers.dat");
         Util.method38526(var7, var10, var6);
      } catch (Exception var8) {
         field34261.error("Couldn't save server list", var8);
      }
   }

   public ServerData method27096(int var1) {
      return this.field34263.get(var1);
   }

   public void method27097(ServerData var1) {
      this.field34263.remove(var1);
   }

   public void method27098(ServerData var1) {
      this.field34263.add(var1);
   }

   public int method27099() {
      return this.field34263.size();
   }

   public void method27100(int var1, int var2) {
      ServerData var5 = this.method27096(var1);
      this.field34263.set(var1, this.method27096(var2));
      this.field34263.set(var2, var5);
      this.method27095();
   }

   public void method27101(int var1, ServerData var2) {
      this.field34263.set(var1, var2);
   }

   public static void method27102(ServerData var0) {
      Class7970 var3 = new Class7970(Minecraft.getInstance());
      var3.method27094();

      for (int var4 = 0; var4 < var3.method27099(); var4++) {
         ServerData var5 = var3.method27096(var4);
         if (var5.field33188.equals(var0.field33188) && var5.field33189.equals(var0.field33189)) {
            var3.method27101(var4, var0);
            break;
         }
      }

      var3.method27095();
   }
}
