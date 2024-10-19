package net.minecraft.client.multiplayer;

import com.google.common.collect.Lists;
import java.io.File;
import java.util.List;

import net.minecraft.nbt.ListNBT;
import net.minecraft.client.Minecraft;
import net.minecraft.client.util.Util;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.CompressedStreamTools;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ServerList {
   private static final Logger field34261 = LogManager.getLogger();
   private final Minecraft field34262;
   private final List<ServerData> field34263 = Lists.newArrayList();

   public ServerList(Minecraft var1) {
      this.field34262 = var1;
      this.loadServerList();
   }

   public void loadServerList() {
      try {
         this.field34263.clear();
         CompoundNBT var3 = CompressedStreamTools.method31770(new File(this.field34262.gameDir, "servers.dat"));
         if (var3 == null) {
            return;
         }

         ListNBT var4 = var3.getList("servers", 10);

         for (int var5 = 0; var5 < var4.size(); var5++) {
            this.field34263.add(ServerData.method25579(var4.getCompound(var5)));
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
         CompressedStreamTools.write(var9, var10);
         File var6 = new File(this.field34262.gameDir, "servers.dat_old");
         File var7 = new File(this.field34262.gameDir, "servers.dat");
         Util.method38526(var7, var10, var6);
      } catch (Exception var8) {
         field34261.error("Couldn't save server list", var8);
      }
   }

   public ServerData getServerData(int var1) {
      return this.field34263.get(var1);
   }

   public void method27097(ServerData var1) {
      this.field34263.remove(var1);
   }

   public void method27098(ServerData var1) {
      this.field34263.add(var1);
   }

   public int countServers() {
      return this.field34263.size();
   }

   public void method27100(int var1, int var2) {
      ServerData var5 = this.getServerData(var1);
      this.field34263.set(var1, this.getServerData(var2));
      this.field34263.set(var2, var5);
      this.method27095();
   }

   public void method27101(int var1, ServerData var2) {
      this.field34263.set(var1, var2);
   }

   public static void method27102(ServerData var0) {
      ServerList var3 = new ServerList(Minecraft.getInstance());
      var3.loadServerList();

      for (int var4 = 0; var4 < var3.countServers(); var4++) {
         ServerData var5 = var3.getServerData(var4);
         if (var5.serverName.equals(var0.serverName) && var5.serverIP.equals(var0.serverIP)) {
            var3.method27101(var4, var0);
            break;
         }
      }

      var3.method27095();
   }
}
