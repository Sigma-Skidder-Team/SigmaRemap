package mapped;

import com.mojang.bridge.Bridge;
import com.mojang.bridge.game.GameSession;
import com.mojang.bridge.game.GameVersion;
import com.mojang.bridge.game.Language;
import com.mojang.bridge.game.PerformanceMetrics;
import com.mojang.bridge.game.RunningGame;
import com.mojang.bridge.launcher.Launcher;
import com.mojang.bridge.launcher.SessionEventListener;
import javax.annotation.Nullable;

public class Class8274 implements RunningGame {
   private static String[] field35561;
   private final Minecraft field35562;
   private final Launcher field35563;
   private SessionEventListener field35564 = SessionEventListener.NONE;

   public Class8274(Minecraft var1) {
      this.field35562 = var1;
      this.field35563 = Bridge.getLauncher();
      if (this.field35563 != null) {
         this.field35563.registerGame(this);
      }
   }

   public GameVersion getVersion() {
      return SharedConstants.method34773();
   }

   public Language getSelectedLanguage() {
      return this.field35562.method1541().method965();
   }

   @Nullable
   public GameSession getCurrentSession() {
      Class1656 var3 = this.field35562.world;
      return var3 != null ? new Class9214(var3, this.field35562.player, this.field35562.player.connection) : null;
   }

   public PerformanceMetrics getPerformanceMetrics() {
      Class9789 var3 = this.field35562.method1558();
      long var4 = 2147483647L;
      long var6 = -2147483648L;
      long var8 = 0L;

      for (long var13 : var3.method38597()) {
         var4 = Math.min(var4, var13);
         var6 = Math.max(var6, var13);
         var8 += var13;
      }

      return new Class7425((int)var4, (int)var6, (int)(var8 / (long)var3.method38597().length), var3.method38597().length);
   }

   public void setSessionEventListener(SessionEventListener var1) {
      this.field35564 = var1;
   }

   public void method28908() {
      this.field35564.onStartGameSession(this.getCurrentSession());
   }

   public void method28909() {
      this.field35564.onLeaveGameSession(this.getCurrentSession());
   }
}
