package net.minecraft.scoreboard;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

import mapped.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.ListNBT;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;

public class Scoreboard {
   private final Map<String, ScoreObjective> field29840 = Maps.newHashMap();
   private final Map<Class9008, List<ScoreObjective>> field29841 = Maps.newHashMap();
   private final Map<String, Map<ScoreObjective, Score>> field29842 = Maps.newHashMap();
   private final ScoreObjective[] field29843 = new ScoreObjective[19];
   private final Map<String, ScorePlayerTeam> field29844 = Maps.newHashMap();
   private final Map<String, ScorePlayerTeam> field29845 = Maps.newHashMap();
   private static String[] field29846;

   public boolean method20974(String var1) {
      return this.field29840.containsKey(var1);
   }

   public ScoreObjective method20975(String var1) {
      return this.field29840.get(var1);
   }

   @Nullable
   public ScoreObjective method20976(String var1) {
      return this.field29840.get(var1);
   }

   public ScoreObjective method20977(String var1, Class9008 var2, ITextComponent var3, Class2316 var4) {
      if (var1.length() <= 16) {
         if (!this.field29840.containsKey(var1)) {
            ScoreObjective var7 = new ScoreObjective(this, var1, var2, var3, var4);
            this.field29841.computeIfAbsent(var2, var0 -> Lists.newArrayList()).add(var7);
            this.field29840.put(var1, var7);
            this.method20999(var7);
            return var7;
         } else {
            throw new IllegalArgumentException("An objective with the name '" + var1 + "' already exists!");
         }
      } else {
         throw new IllegalArgumentException("The objective name '" + var1 + "' is too long!");
      }
   }

   public final void method20978(Class9008 var1, String var2, Consumer<Score> var3) {
      this.field29841.getOrDefault(var1, Collections.<ScoreObjective>emptyList()).forEach(var3x -> var3.accept(this.method20980(var2, var3x)));
   }

   public boolean method20979(String var1, ScoreObjective var2) {
      Map var5 = this.field29842.get(var1);
      if (var5 != null) {
         Score var6 = (Score)var5.get(var2);
         return var6 != null;
      } else {
         return false;
      }
   }

   public Score method20980(String var1, ScoreObjective var2) {
      if (var1.length() <= 40) {
         Map<ScoreObjective, Score> var5 = this.field29842.computeIfAbsent(var1, var0 -> Maps.newHashMap());
         return var5.computeIfAbsent(var2, var2x -> {
            Score var5x = new Score(this, var2x, var1);
            var5x.setScorePoints(0);
            return var5x;
         });
      } else {
         throw new IllegalArgumentException("The player name '" + var1 + "' is too long!");
      }
   }

   public Collection<Score> getSortedScores(ScoreObjective var1) {
      ArrayList var4 = Lists.newArrayList();

      for (Map var6 : this.field29842.values()) {
         Score var7 = (Score)var6.get(var1);
         if (var7 != null) {
            var4.add(var7);
         }
      }

      var4.sort(Score.SCORE_COMPARATOR);
      return var4;
   }

   public Collection<ScoreObjective> method20982() {
      return this.field29840.values();
   }

   public Collection<String> method20983() {
      return this.field29840.keySet();
   }

   public Collection<String> method20984() {
      return Lists.newArrayList(this.field29842.keySet());
   }

   public void method20985(String var1, ScoreObjective var2) {
      if (var2 != null) {
         Map var5 = this.field29842.get(var1);
         if (var5 != null) {
            Score var6 = (Score)var5.remove(var2);
            if (var5.size() >= 1) {
               if (var6 != null) {
                  this.method21004(var1, var2);
               }
            } else {
               Map var7 = this.field29842.remove(var1);
               if (var7 != null) {
                  this.method21003(var1);
               }
            }
         }
      } else {
         Map var8 = this.field29842.remove(var1);
         if (var8 != null) {
            this.method21003(var1);
         }
      }
   }

   public Map<ScoreObjective, Score> method20986(String var1) {
      Object var4 = this.field29842.get(var1);
      if (var4 == null) {
         var4 = Maps.newHashMap();
      }

      return (Map<ScoreObjective, Score>)var4;
   }

   public void method20987(ScoreObjective var1) {
      this.field29840.remove(var1.method29336());

      for (int var4 = 0; var4 < 19; var4++) {
         if (this.getObjectiveInDisplaySlot(var4) == var1) {
            this.method20988(var4, (ScoreObjective)null);
         }
      }

      List var7 = this.field29841.get(var1.getCriteria());
      if (var7 != null) {
         var7.remove(var1);
      }

      for (Map var6 : this.field29842.values()) {
         var6.remove(var1);
      }

      this.method21001(var1);
   }

   public void method20988(int var1, ScoreObjective var2) {
      this.field29843[var1] = var2;
   }

   @Nullable
   public ScoreObjective getObjectiveInDisplaySlot(int var1) {
      return this.field29843[var1];
   }

   public ScorePlayerTeam getTeam(String var1) {
      return this.field29844.get(var1);
   }

   public ScorePlayerTeam method20991(String var1) {
      if (var1.length() <= 16) {
         ScorePlayerTeam var4 = this.getTeam(var1);
         if (var4 == null) {
            var4 = new ScorePlayerTeam(this, var1);
            this.field29844.put(var1, var4);
            this.method21005(var4);
            return var4;
         } else {
            throw new IllegalArgumentException("A team with the name '" + var1 + "' already exists!");
         }
      } else {
         throw new IllegalArgumentException("The team name '" + var1 + "' is too long!");
      }
   }

   public void method20992(ScorePlayerTeam var1) {
      this.field29844.remove(var1.method28567());

      for (String var5 : var1.method28575()) {
         this.field29845.remove(var5);
      }

      this.method21007(var1);
   }

   public boolean addPlayerToTeam(String var1, ScorePlayerTeam var2) {
      if (var1.length() <= 40) {
         if (this.getPlayersTeam(var1) != null) {
            this.method20994(var1);
         }

         this.field29845.put(var1, var2);
         return var2.method28575().add(var1);
      } else {
         throw new IllegalArgumentException("The player name '" + var1 + "' is too long!");
      }
   }

   public boolean method20994(String var1) {
      ScorePlayerTeam var4 = this.getPlayersTeam(var1);
      if (var4 == null) {
         return false;
      } else {
         this.method20995(var1, var4);
         return true;
      }
   }

   public void method20995(String var1, ScorePlayerTeam var2) {
      if (this.getPlayersTeam(var1) == var2) {
         this.field29845.remove(var1);
         var2.method28575().remove(var1);
      } else {
         System.out.println("Player is either on another team or not on any team. Cannot remove from team '" + var2.method28567() + "'.");
      }
   }

   public Collection<String> method20996() {
      return this.field29844.keySet();
   }

   public Collection<ScorePlayerTeam> method20997() {
      return this.field29844.values();
   }

   @Nullable
   public ScorePlayerTeam getPlayersTeam(String var1) {
      return this.field29845.get(var1);
   }

   public void method20999(ScoreObjective var1) {
   }

   public void method21000(ScoreObjective var1) {
   }

   public void method21001(ScoreObjective var1) {
   }

   public void onScoreChanged(Score var1) {
   }

   public void method21003(String var1) {
   }

   public void method21004(String var1, ScoreObjective var2) {
   }

   public void method21005(ScorePlayerTeam var1) {
   }

   public void method21006(ScorePlayerTeam var1) {
   }

   public void method21007(ScorePlayerTeam var1) {
   }

   public static String method21008(int var0) {
      switch (var0) {
         case 0:
            return "list";
         case 1:
            return "sidebar";
         case 2:
            return "belowName";
         default:
            if (var0 >= 3 && var0 <= 18) {
               TextFormatting var3 = TextFormatting.fromColorIndex(var0 - 3);
               if (var3 != null && var3 != TextFormatting.RESET) {
                  return "sidebar.team." + var3.getFriendlyName();
               }
            }

            return null;
      }
   }

   public static int method21009(String var0) {
      if (!"list".equalsIgnoreCase(var0)) {
         if (!"sidebar".equalsIgnoreCase(var0)) {
            if (!"belowName".equalsIgnoreCase(var0)) {
               if (var0.startsWith("sidebar.team.")) {
                  String var3 = var0.substring("sidebar.team.".length());
                  TextFormatting var4 = TextFormatting.getValueByName(var3);
                  if (var4 != null && var4.getColorIndex() >= 0) {
                     return var4.getColorIndex() + 3;
                  }
               }

               return -1;
            } else {
               return 2;
            }
         } else {
            return 1;
         }
      } else {
         return 0;
      }
   }

   public static String[] method21010() {
      if (field29846 == null) {
         field29846 = new String[19];

         for (int var2 = 0; var2 < 19; var2++) {
            field29846[var2] = method21008(var2);
         }
      }

      return field29846;
   }

   public void method21011(Entity var1) {
      if (var1 != null && !(var1 instanceof PlayerEntity) && !var1.isAlive()) {
         String var4 = var1.getCachedUniqueIdString();
         this.method20985(var4, (ScoreObjective)null);
         this.method20994(var4);
      }
   }

   public ListNBT method21012() {
      ListNBT var3 = new ListNBT();
      this.field29842
         .values()
         .stream()
         .map(Map::values)
         .forEach(var1 -> var1.stream().filter(var0x -> var0x.getObjective() != null).forEach(var1x -> {
               CompoundNBT var4 = new CompoundNBT();
               var4.putString("Name", var1x.getPlayerName());
               var4.putString("Objective", var1x.getObjective().method29336());
               var4.putInt("Score", var1x.getScorePoints());
               var4.putBoolean("Locked", var1x.isLocked());
               var3.add(var4);
            }));
      return var3;
   }

   public void method21013(ListNBT var1) {
      for (int var4 = 0; var4 < var1.size(); var4++) {
         CompoundNBT var5 = var1.getCompound(var4);
         ScoreObjective var6 = this.method20975(var5.getString("Objective"));
         String var7 = var5.getString("Name");
         if (var7.length() > 40) {
            var7 = var7.substring(0, 40);
         }

         Score var8 = this.method20980(var7, var6);
         var8.setScorePoints(var5.getInt("Score"));
         if (var5.contains("Locked")) {
            var8.setLocked(var5.getBoolean("Locked"));
         }
      }
   }
}
