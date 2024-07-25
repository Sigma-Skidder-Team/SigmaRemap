package remapped;

import com.mojang.bridge.Bridge;
import com.mojang.bridge.game.GameSession;
import com.mojang.bridge.game.GameVersion;
import com.mojang.bridge.game.Language;
import com.mojang.bridge.game.PerformanceMetrics;
import com.mojang.bridge.game.RunningGame;
import com.mojang.bridge.launcher.Launcher;
import com.mojang.bridge.launcher.SessionEventListener;
import javax.annotation.Nullable;

public class class_4128 implements RunningGame {
   private static String[] field_20107;
   private final MinecraftClient field_20105;
   private final Launcher field_20104;
   private SessionEventListener field_20106 = SessionEventListener.NONE;

   public class_4128(MinecraftClient var1) {
      this.field_20105 = var1;
      this.field_20104 = Bridge.getLauncher();
      if (this.field_20104 != null) {
         this.field_20104.registerGame(this);
      }
   }

   public GameVersion getVersion() {
      return class_7665.method_34674();
   }

   public Language getSelectedLanguage() {
      return this.field_20105.method_8561().method_11096();
   }

   @Nullable
   public GameSession getCurrentSession() {
      ClientWorld var3 = this.field_20105.theWorld;
      return var3 != null ? new class_7491(var3, this.field_20105.thePlayer, this.field_20105.thePlayer.field_30532) : null;
   }

   public PerformanceMetrics getPerformanceMetrics() {
      class_9703 var3 = this.field_20105.method_8592();
      long var4 = 2147483647L;
      long var6 = -2147483648L;
      long var8 = 0L;

      for (long var13 : var3.method_44838()) {
         var4 = Math.min(var4, var13);
         var6 = Math.max(var6, var13);
         var8 += var13;
      }

      return new class_1940((int)var4, (int)var6, (int)(var8 / (long)var3.method_44838().length), var3.method_44838().length);
   }

   public void setSessionEventListener(SessionEventListener var1) {
      this.field_20106 = var1;
   }

   public void method_19174() {
      this.field_20106.onStartGameSession(this.getCurrentSession());
   }

   public void method_19172() {
      this.field_20106.onLeaveGameSession(this.getCurrentSession());
   }
}
