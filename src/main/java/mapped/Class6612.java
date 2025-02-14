package mapped;

import net.minecraft.crash.CrashReportCategory;
import net.minecraft.world.Difficulty;
import net.minecraft.world.GameRules;

public interface Class6612 {
   int getSpawnX();

   int getSpawnY();

   int getSpawnZ();

   float method20032();

   long getGameTime();

   long getDayTime();

   boolean method20042();

   boolean method20043();

   void method20044(boolean var1);

   boolean isHardcore();

   GameRules getGameRulesInstance();

   Difficulty method20047();

   boolean method20048();

   default void method20049(CrashReportCategory var1) {
      var1.addDetail("Level spawn location", () -> CrashReportCategory.method32805(this.getSpawnX(), this.getSpawnY(), this.getSpawnZ()));
      var1.addDetail("Level time", () -> String.format("%d game time, %d day time", this.getGameTime(), this.getDayTime()));
   }
}
