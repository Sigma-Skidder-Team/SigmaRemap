package remapped;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.datafixers.DataFixer;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Proxy;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import net.minecraft.util.text.filter.ChatFilterClient;
import net.minecraft.util.text.filter.IChatFilter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_4497 extends class_341 implements class_8685 {
   private static final Logger field_21994 = LogManager.getLogger();
   private static final Pattern field_21992 = Pattern.compile("^[a-fA-F0-9]{40}$");
   private final List<class_7973> field_21987 = Collections.<class_7973>synchronizedList(Lists.newArrayList());
   private class_9852 field_21986;
   private final class_4224 field_21990;
   private class_7453 field_21995;
   private final class_991 field_21991;
   private class_7990 field_21988;
   private final ChatFilterClient field_21989;

   public class_4497(
      Thread var1,
      class_7522 var2,
      class_3676 var3,
      class_6354 var4,
      class_6298 var5,
      class_5684 var6,
      class_991 var7,
      DataFixer var8,
      MinecraftSessionService var9,
      GameProfileRepository var10,
      class_5969 var11,
      class_3897 var12
   ) {
      super(var1, var2, var3, var6, var4, Proxy.NO_PROXY, var8, var5, var9, var10, var11, var12);
      this.field_21991 = var7;
      this.field_21990 = new class_4224(this);
      this.field_21989 = null;
   }

   @Override
   public boolean method_1608() throws IOException {
      class_5997 var3 = new class_5997(this, "Server console handler");
      var3.setDaemon(true);
      var3.setUncaughtExceptionHandler(new class_447(field_21994));
      var3.start();
      field_21994.info("Starting minecraft server version " + class_7665.method_34674().getName());
      if (Runtime.getRuntime().maxMemory() / 1024L / 1024L < 512L) {
         field_21994.warn("To start the server with more ram, launch it as \"java -Xmx1024M -Xms1024M -jar minecraft_server.jar\"");
      }

      field_21994.info("Loading properties");
      class_9882 var4 = this.field_21991.method_4319();
      if (this.method_1689()) {
         this.method_1665("127.0.0.1");
      } else {
         this.method_1605(var4.field_50091);
         this.method_1746(var4.field_50094);
         this.method_1665(var4.field_50124);
      }

      this.method_1667(var4.field_50101);
      this.method_1640(var4.field_50119);
      this.method_1614(var4.field_50099, this.method_20892());
      this.method_1628(var4.field_50111);
      this.method_1755(var4.field_50132);
      super.method_1731((Integer)var4.field_50113.get());
      this.method_1622(var4.field_50131);
      this.field_1300.method_25711(var4.field_50117);
      field_21994.info("Default game type: {}", var4.field_50117);
      InetAddress var5 = null;
      if (!this.method_1644().isEmpty()) {
         var5 = InetAddress.getByName(this.method_1644());
      }

      if (this.method_1650() < 0) {
         this.method_1723(var4.field_50092);
      }

      this.method_1653();
      field_21994.info("Starting Minecraft server on {}:{}", this.method_1644().isEmpty() ? "*" : this.method_1644(), this.method_1650());

      try {
         this.method_1679().method_30822(var5, this.method_1650());
      } catch (IOException var13) {
         field_21994.warn("**** FAILED TO BIND TO PORT!");
         field_21994.warn("The exception was: {}", var13.toString());
         field_21994.warn("Perhaps a server is already running on that port?");
         return false;
      }

      if (!this.method_1657()) {
         field_21994.warn("**** SERVER IS RUNNING IN OFFLINE/INSECURE MODE!");
         field_21994.warn("The server will make no attempt to authenticate usernames. Beware.");
         field_21994.warn(
            "While this makes the game possible to play without internet access, it also opens up the ability for hackers to connect with any username they choose."
         );
         field_21994.warn("To change this, set \"online-mode\" to \"true\" in the server.properties file.");
      }

      if (this.method_20893()) {
         this.method_1647().method_27264();
      }

      if (!class_6860.method_31474(this)) {
         return false;
      } else {
         this.method_1616(new class_619(this, this.field_1342, this.field_1337));
         long var7 = Util.getMeasuringTimeNano();
         this.method_1744(var4.field_50108);
         class_4797.method_22114(this.method_1647());
         class_4797.method_22111(this.method_1639());
         class_5969.method_27263(this.method_1657());
         field_21994.info("Preparing level \"{}\"", this.method_39873());
         this.method_1738();
         long var9 = Util.getMeasuringTimeNano() - var7;
         String var11 = String.format(Locale.ROOT, "%.3fs", (double)var9 / 1.0E9);
         field_21994.info("Done ({})! For help, type \"help\"", var11);
         if (var4.field_50107 != null) {
            this.method_1683().<class_5850>method_1287(class_291.field_1053).method_26684(var4.field_50107, this);
         }

         if (var4.field_50090) {
            field_21994.info("Starting GS4 status listener");
            this.field_21986 = class_9852.method_45368(this);
         }

         if (var4.field_50089) {
            field_21994.info("Starting remote control listener");
            this.field_21995 = class_7453.method_33921(this);
         }

         if (this.method_20895() > 0L) {
            Thread var12 = new Thread(new class_7636(this));
            var12.setUncaughtExceptionHandler(new class_5416(field_21994));
            var12.setName("Server Watchdog");
            var12.setDaemon(true);
            var12.start();
         }

         class_4897.field_25302.method_11239(class_8230.field_42264, class_2831.<ItemStack>method_12874());
         if (var4.field_50128) {
            class_7116.method_32712(this);
         }

         return true;
      }
   }

   @Override
   public boolean method_1702() {
      return this.method_39878().field_50118 && super.method_1702();
   }

   @Override
   public boolean method_1706() {
      return this.field_21991.method_4319().field_50109 && super.method_1706();
   }

   @Override
   public boolean method_1734() {
      return this.field_21991.method_4319().field_50126 && super.method_1734();
   }

   public String method_20892() {
      class_9882 var3 = this.field_21991.method_4319();
      String var4;
      if (var3.field_50083.isEmpty()) {
         if (Strings.isNullOrEmpty(var3.field_50127)) {
            var4 = "";
         } else {
            field_21994.warn("resource-pack-hash is deprecated. Please use resource-pack-sha1 instead.");
            var4 = var3.field_50127;
         }
      } else {
         var4 = var3.field_50083;
         if (!Strings.isNullOrEmpty(var3.field_50127)) {
            field_21994.warn("resource-pack-hash is deprecated and found along side resource-pack-sha1. resource-pack-hash will be ignored.");
         }
      }

      if (!var4.isEmpty() && !field_21992.matcher(var4).matches()) {
         field_21994.warn("Invalid sha1 for ressource-pack-sha1");
      }

      if (!var3.field_50099.isEmpty() && var4.isEmpty()) {
         field_21994.warn(
            "You specified a resource pack without providing a sha1 hash. Pack will be updated on the client only if you change the name of the pack."
         );
      }

      return var4;
   }

   @Override
   public class_9882 method_39878() {
      return this.field_21991.method_4319();
   }

   @Override
   public void method_1708() {
      this.method_1753(this.method_39878().field_50123, true);
   }

   @Override
   public boolean method_1634() {
      return this.method_39878().field_50096;
   }

   @Override
   public class_159 method_1725(class_159 var1) {
      var1 = super.method_1725(var1);
      var1.method_629().method_29851("Is Modded", () -> this.method_1606().orElse("Unknown (can't tell)"));
      var1.method_629().method_29851("Type", () -> "Dedicated Server (map_server.txt)");
      return var1;
   }

   @Override
   public Optional<String> method_1606() {
      String var3 = this.method_1728();
      return "vanilla".equals(var3) ? Optional.<String>empty() : Optional.<String>of("Definitely; Server brand changed to '" + var3 + "'");
   }

   @Override
   public void method_1604() {
      if (this.field_21989 != null) {
         this.field_21989.close();
      }

      if (this.field_21988 != null) {
         this.field_21988.method_36257();
      }

      if (this.field_21995 != null) {
         this.field_21995.method_38623();
      }

      if (this.field_21986 != null) {
         this.field_21986.method_38623();
      }
   }

   @Override
   public void method_1630(BooleanSupplier var1) {
      super.method_1630(var1);
      this.method_20891();
   }

   @Override
   public boolean method_1741() {
      return this.method_39878().field_50120;
   }

   @Override
   public void addSnooperInfo(Snooper var1) {
      var1.method_15252("whitelist_enabled", this.method_20890().method_39997());
      var1.method_15252("whitelist_count", this.method_20890().method_39994().length);
      super.addSnooperInfo(var1);
   }

   public void method_20898(String var1, class_9155 var2) {
      this.field_21987.add(new class_7973(var1, var2));
   }

   public void method_20891() {
      while (!this.field_21987.isEmpty()) {
         class_7973 var3 = this.field_21987.remove(0);
         this.method_1631().method_2232(var3.field_40828, var3.field_40829);
      }
   }

   @Override
   public boolean method_1718() {
      return true;
   }

   @Override
   public int method_1700() {
      return this.method_39878().field_50100;
   }

   @Override
   public boolean method_1727() {
      return this.method_39878().field_50088;
   }

   public class_619 method_20890() {
      return (class_619)super.method_1600();
   }

   @Override
   public boolean method_1624() {
      return true;
   }

   @Override
   public String method_39875() {
      return this.method_1644();
   }

   @Override
   public int method_39879() {
      return this.method_1650();
   }

   @Override
   public String method_39876() {
      return this.method_1748();
   }

   public void method_20897() {
      if (this.field_21988 == null) {
         this.field_21988 = class_7990.method_36255(this);
      }
   }

   @Override
   public boolean method_1695() {
      return this.field_21988 != null;
   }

   @Override
   public boolean method_1625(GameType var1, boolean var2, int var3) {
      return false;
   }

   @Override
   public boolean method_1726() {
      return this.method_39878().field_50112;
   }

   @Override
   public int method_1680() {
      return this.method_39878().field_50115;
   }

   @Override
   public boolean method_1618(class_6331 var1, BlockPos var2, PlayerEntity var3) {
      if (var1.method_29545() == World.field_33048) {
         if (!this.method_20890().method_39947().method_19931()) {
            if (!this.method_20890().method_39962(var3.method_3247())) {
               if (this.method_1680() > 0) {
                  BlockPos var6 = var1.method_28998();
                  int var7 = class_9299.method_42805(var2.method_12173() - var6.method_12173());
                  int var8 = class_9299.method_42805(var2.method_12185() - var6.method_12185());
                  int var9 = Math.max(var7, var8);
                  return var9 <= this.method_1680();
               } else {
                  return false;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean method_1654() {
      return this.method_39878().field_50087;
   }

   @Override
   public int method_1675() {
      return this.method_39878().field_50103;
   }

   @Override
   public int method_1620() {
      return this.method_39878().field_50086;
   }

   @Override
   public void method_1731(int var1) {
      super.method_1731(var1);
      this.field_21991.method_4317(var2 -> (class_9882)var2.field_50113.method_36703(this.method_1735(), var1));
   }

   @Override
   public boolean method_1626() {
      return this.method_39878().field_50093;
   }

   @Override
   public boolean method_26284() {
      return this.method_39878().field_50130;
   }

   @Override
   public int method_1742() {
      return this.method_39878().field_50106;
   }

   @Override
   public int method_1611() {
      return this.method_39878().field_50084;
   }

   public boolean method_20893() {
      boolean var3 = false;

      for (int var4 = 0; !var3 && var4 <= 2; var4++) {
         if (var4 > 0) {
            field_21994.warn("Encountered a problem while converting the user banlist, retrying in a few seconds");
            this.method_20894();
         }

         var3 = class_6860.method_31471(this);
      }

      boolean var9 = false;

      for (int var5 = 0; !var9 && var5 <= 2; var5++) {
         if (var5 > 0) {
            field_21994.warn("Encountered a problem while converting the ip banlist, retrying in a few seconds");
            this.method_20894();
         }

         var9 = class_6860.method_31472(this);
      }

      boolean var10 = false;

      for (int var6 = 0; !var10 && var6 <= 2; var6++) {
         if (var6 > 0) {
            field_21994.warn("Encountered a problem while converting the op list, retrying in a few seconds");
            this.method_20894();
         }

         var10 = class_6860.method_31466(this);
      }

      boolean var11 = false;

      for (int var7 = 0; !var11 && var7 <= 2; var7++) {
         if (var7 > 0) {
            field_21994.warn("Encountered a problem while converting the whitelist, retrying in a few seconds");
            this.method_20894();
         }

         var11 = class_6860.method_31459(this);
      }

      boolean var12 = false;

      for (int var8 = 0; !var12 && var8 <= 2; var8++) {
         if (var8 > 0) {
            field_21994.warn("Encountered a problem while converting the player save files, retrying in a few seconds");
            this.method_20894();
         }

         var12 = class_6860.method_31468(this);
      }

      return var3 || var9 || var10 || var11 || var12;
   }

   private void method_20894() {
      try {
         Thread.sleep(5000L);
      } catch (InterruptedException var4) {
      }
   }

   public long method_20895() {
      return this.method_39878().field_50121;
   }

   @Override
   public String method_39874() {
      return "";
   }

   @Override
   public String method_39877(String var1) {
      this.field_21990.method_19671();
      this.method_34465(() -> this.method_1631().method_2232(this.field_21990.method_19669(), var1));
      return this.field_21990.method_19670();
   }

   public void method_20896(boolean var1) {
      this.field_21991.method_4317(var2 -> (class_9882)var2.field_50098.method_36703(this.method_1735(), var1));
   }

   @Override
   public void method_1651() {
      super.method_1651();
      Util.shutdownExecutors();
   }

   @Override
   public boolean method_1610(GameProfile var1) {
      return false;
   }

   @Override
   public int method_1638(int var1) {
      return this.method_39878().field_50110 * var1 / 100;
   }

   @Override
   public String method_39873() {
      return this.field_1339.method_17070();
   }

   @Override
   public boolean method_1709() {
      return this.field_21991.method_4319().field_50105;
   }

   @Nullable
   @Override
   public IChatFilter method_1684(class_9359 var1) {
      return this.field_21989 == null ? null : this.field_21989.func_244566_a(var1.method_3247());
   }
}
