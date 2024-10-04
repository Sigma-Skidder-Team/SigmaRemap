package net.minecraft.scoreboard;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import mapped.Class2073;
import mapped.Class8375;
import mapped.Class9411;
import mapped.MinecraftServer;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.network.IPacket;
import net.minecraft.network.play.server.SUpdateScorePacket;
import net.minecraft.network.play.server.STeamsPacket;
import net.minecraft.network.play.server.SDisplayObjectivePacket;
import net.minecraft.network.play.server.SScoreboardObjectivePacket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class ServerScoreboard extends Scoreboard {
   private static String[] field29847;
   private final MinecraftServer field29848;
   private final Set<Class8375> field29849 = Sets.newHashSet();
   private Runnable[] field29850 = new Runnable[0];

   public ServerScoreboard(MinecraftServer var1) {
      this.field29848 = var1;
   }

   @Override
   public void method21002(Class9411 var1) {
      super.method21002(var1);
      if (this.field29849.contains(var1.method36053())) {
         this.field29848
            .getPlayerList()
            .method19456(new SUpdateScorePacket(Class2073.field13503, var1.method36053().method29336(), var1.method36054(), var1.method36050()));
      }

      this.method21022();
   }

   @Override
   public void method21003(String var1) {
      super.method21003(var1);
      this.field29848.getPlayerList().method19456(new SUpdateScorePacket(Class2073.field13504, (String)null, var1, 0));
      this.method21022();
   }

   @Override
   public void method21004(String var1, Class8375 var2) {
      super.method21004(var1, var2);
      if (this.field29849.contains(var2)) {
         this.field29848.getPlayerList().method19456(new SUpdateScorePacket(Class2073.field13504, var2.method29336(), var1, 0));
      }

      this.method21022();
   }

   @Override
   public void method20988(int var1, Class8375 var2) {
      Class8375 var5 = this.method20989(var1);
      super.method20988(var1, var2);
      if (var5 != var2 && var5 != null) {
         if (this.method21027(var5) <= 0) {
            this.method21026(var5);
         } else {
            this.field29848.getPlayerList().method19456(new SDisplayObjectivePacket(var1, var2));
         }
      }

      if (var2 != null) {
         if (!this.field29849.contains(var2)) {
            this.method21024(var2);
         } else {
            this.field29848.getPlayerList().method19456(new SDisplayObjectivePacket(var1, var2));
         }
      }

      this.method21022();
   }

   @Override
   public boolean method20993(String var1, ScorePlayerTeam var2) {
      if (!super.method20993(var1, var2)) {
         return false;
      } else {
         this.field29848.getPlayerList().method19456(new STeamsPacket(var2, Arrays.<String>asList(var1), 3));
         this.method21022();
         return true;
      }
   }

   @Override
   public void method20995(String var1, ScorePlayerTeam var2) {
      super.method20995(var1, var2);
      this.field29848.getPlayerList().method19456(new STeamsPacket(var2, Arrays.<String>asList(var1), 4));
      this.method21022();
   }

   @Override
   public void method20999(Class8375 var1) {
      super.method20999(var1);
      this.method21022();
   }

   @Override
   public void method21000(Class8375 var1) {
      super.method21000(var1);
      if (this.field29849.contains(var1)) {
         this.field29848.getPlayerList().method19456(new SScoreboardObjectivePacket(var1, 2));
      }

      this.method21022();
   }

   @Override
   public void method21001(Class8375 var1) {
      super.method21001(var1);
      if (this.field29849.contains(var1)) {
         this.method21026(var1);
      }

      this.method21022();
   }

   @Override
   public void method21005(ScorePlayerTeam var1) {
      super.method21005(var1);
      this.field29848.getPlayerList().method19456(new STeamsPacket(var1, 0));
      this.method21022();
   }

   @Override
   public void method21006(ScorePlayerTeam var1) {
      super.method21006(var1);
      this.field29848.getPlayerList().method19456(new STeamsPacket(var1, 2));
      this.method21022();
   }

   @Override
   public void method21007(ScorePlayerTeam var1) {
      super.method21007(var1);
      this.field29848.getPlayerList().method19456(new STeamsPacket(var1, 1));
      this.method21022();
   }

   public void method21021(Runnable var1) {
      this.field29850 = Arrays.<Runnable>copyOf(this.field29850, this.field29850.length + 1);
      this.field29850[this.field29850.length - 1] = var1;
   }

   public void method21022() {
      for (Runnable var6 : this.field29850) {
         var6.run();
      }
   }

   public List<IPacket<?>> method21023(Class8375 var1) {
      ArrayList var4 = Lists.newArrayList();
      var4.add(new SScoreboardObjectivePacket(var1, 0));

      for (int var5 = 0; var5 < 19; var5++) {
         if (this.method20989(var5) == var1) {
            var4.add(new SDisplayObjectivePacket(var5, var1));
         }
      }

      for (Class9411 var6 : this.method20981(var1)) {
         var4.add(new SUpdateScorePacket(Class2073.field13503, var6.method36053().method29336(), var6.method36054(), var6.method36050()));
      }

      return var4;
   }

   public void method21024(Class8375 var1) {
      List<IPacket<?>> var4 = this.method21023(var1);

      for (ServerPlayerEntity var6 : this.field29848.getPlayerList().getPlayers()) {
         for (IPacket var8 : var4) {
            var6.connection.sendPacket(var8);
         }
      }

      this.field29849.add(var1);
   }

   public List<IPacket<?>> method21025(Class8375 var1) {
      ArrayList var4 = Lists.newArrayList();
      var4.add(new SScoreboardObjectivePacket(var1, 1));

      for (int var5 = 0; var5 < 19; var5++) {
         if (this.method20989(var5) == var1) {
            var4.add(new SDisplayObjectivePacket(var5, var1));
         }
      }

      return var4;
   }

   public void method21026(Class8375 var1) {
      List<IPacket<?>> var4 = this.method21025(var1);

      for (ServerPlayerEntity var6 : this.field29848.getPlayerList().getPlayers()) {
         for (IPacket var8 : var4) {
            var6.connection.sendPacket(var8);
         }
      }

      this.field29849.remove(var1);
   }

   public int method21027(Class8375 var1) {
      int var4 = 0;

      for (int var5 = 0; var5 < 19; var5++) {
         if (this.method20989(var5) == var1) {
            var4++;
         }
      }

      return var4;
   }
}
