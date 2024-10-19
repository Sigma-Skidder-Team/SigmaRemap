package mapped;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.ListNBT;
import net.minecraft.scoreboard.ScorePlayerTeam;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.Team;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent$Serializer;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.storage.WorldSavedData;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class7535 extends WorldSavedData {
   private static final Logger field32340 = LogManager.getLogger();
   private Scoreboard field32341;
   private CompoundNBT field32342;

   public Class7535() {
      super("scoreboard");
   }

   public void method24629(Scoreboard var1) {
      this.field32341 = var1;
      if (this.field32342 != null) {
         this.read(this.field32342);
      }
   }

   @Override
   public void read(CompoundNBT compoundNBT) {
      if (this.field32341 != null) {
         this.method24633(compoundNBT.getList("Objectives", 10));
         this.field32341.method21013(compoundNBT.getList("PlayerScores", 10));
         if (compoundNBT.contains("DisplaySlots", 10)) {
            this.method24632(compoundNBT.getCompound("DisplaySlots"));
         }

         if (compoundNBT.contains("Teams", 9)) {
            this.method24630(compoundNBT.getList("Teams", 10));
         }
      } else {
         this.field32342 = compoundNBT;
      }
   }

   public void method24630(ListNBT var1) {
      for (int var4 = 0; var4 < var1.size(); var4++) {
         CompoundNBT var5 = var1.getCompound(var4);
         String var6 = var5.getString("Name");
         if (var6.length() > 16) {
            var6 = var6.substring(0, 16);
         }

         ScorePlayerTeam var7 = this.field32341.method20991(var6);
         IFormattableTextComponent var8 = ITextComponent$Serializer.getComponentFromJson(var5.getString("DisplayName"));
         if (var8 != null) {
            var7.method28570(var8);
         }

         if (var5.contains("TeamColor", 8)) {
            var7.method28590(TextFormatting.getValueByName(var5.getString("TeamColor")));
         }

         if (var5.contains("AllowFriendlyFire", 99)) {
            var7.method28579(var5.getBoolean("AllowFriendlyFire"));
         }

         if (var5.contains("SeeFriendlyInvisibles", 99)) {
            var7.method28581(var5.getBoolean("SeeFriendlyInvisibles"));
         }

         if (var5.contains("MemberNamePrefix", 8)) {
            IFormattableTextComponent var9 = ITextComponent$Serializer.getComponentFromJson(var5.getString("MemberNamePrefix"));
            if (var9 != null) {
               var7.method28571(var9);
            }
         }

         if (var5.contains("MemberNameSuffix", 8)) {
            IFormattableTextComponent var10 = ITextComponent$Serializer.getComponentFromJson(var5.getString("MemberNameSuffix"));
            if (var10 != null) {
               var7.method28573(var10);
            }
         }

         if (var5.contains("NameTagVisibility", 8)) {
            Team.Visible var11 = Team.Visible.getByName(var5.getString("NameTagVisibility"));
            if (var11 != null) {
               var7.method28584(var11);
            }
         }

         if (var5.contains("DeathMessageVisibility", 8)) {
            Team.Visible var12 = Team.Visible.getByName(var5.getString("DeathMessageVisibility"));
            if (var12 != null) {
               var7.method28585(var12);
            }
         }

         if (var5.contains("CollisionRule", 8)) {
            Team.CollisionRule var13 = Team.CollisionRule.getByName(var5.getString("CollisionRule"));
            if (var13 != null) {
               var7.method28587(var13);
            }
         }

         this.method24631(var7, var5.getList("Players", 8));
      }
   }

   public void method24631(ScorePlayerTeam var1, ListNBT var2) {
      for (int var5 = 0; var5 < var2.size(); var5++) {
         this.field32341.method20993(var2.getString(var5), var1);
      }
   }

   public void method24632(CompoundNBT var1) {
      for (int var4 = 0; var4 < 19; var4++) {
         if (var1.contains("slot_" + var4, 8)) {
            String var5 = var1.getString("slot_" + var4);
            Class8375 var6 = this.field32341.method20976(var5);
            this.field32341.method20988(var4, var6);
         }
      }
   }

   public void method24633(ListNBT var1) {
      for (int var4 = 0; var4 < var1.size(); var4++) {
         CompoundNBT var5 = var1.getCompound(var4);
         Class9008.method33278(var5.getString("CriteriaName")).ifPresent(var2 -> {
            String var5x = var5.getString("Name");
            if (var5x.length() > 16) {
               var5x = var5x.substring(0, 16);
            }

            IFormattableTextComponent var6 = ITextComponent$Serializer.getComponentFromJson(var5.getString("DisplayName"));
            Class2316 var7 = Class2316.method9089(var5.getString("RenderType"));
            this.field32341.method20977(var5x, var2, var6, var7);
         });
      }
   }

   @Override
   public CompoundNBT write(CompoundNBT compoundNBT) {
      if (this.field32341 != null) {
         compoundNBT.put("Objectives", this.method24636());
         compoundNBT.put("PlayerScores", this.field32341.method21012());
         compoundNBT.put("Teams", this.method24634());
         this.method24635(compoundNBT);
         return compoundNBT;
      } else {
         field32340.warn("Tried to save scoreboard without having a scoreboard...");
         return compoundNBT;
      }
   }

   public ListNBT method24634() {
      ListNBT var3 = new ListNBT();

      for (ScorePlayerTeam var5 : this.field32341.method20997()) {
         CompoundNBT var6 = new CompoundNBT();
         var6.putString("Name", var5.method28567());
         var6.putString("DisplayName", ITextComponent$Serializer.toJson(var5.method28568()));
         if (var5.getColor().getColorIndex() >= 0) {
            var6.putString("TeamColor", var5.getColor().getFriendlyName());
         }

         var6.putBoolean("AllowFriendlyFire", var5.method28578());
         var6.putBoolean("SeeFriendlyInvisibles", var5.method28580());
         var6.putString("MemberNamePrefix", ITextComponent$Serializer.toJson(var5.method28572()));
         var6.putString("MemberNameSuffix", ITextComponent$Serializer.toJson(var5.method28574()));
         var6.putString("NameTagVisibility", var5.method28582().internalName);
         var6.putString("DeathMessageVisibility", var5.method28583().internalName);
         var6.putString("CollisionRule", var5.method28586().name);
         ListNBT var7 = new ListNBT();

         for (String var9 : var5.method28575()) {
            var7.add(StringNBT.valueOf(var9));
         }

         var6.put("Players", var7);
         var3.add(var6);
      }

      return var3;
   }

   public void method24635(CompoundNBT var1) {
      CompoundNBT var4 = new CompoundNBT();
      boolean var5 = false;

      for (int var6 = 0; var6 < 19; var6++) {
         Class8375 var7 = this.field32341.method20989(var6);
         if (var7 != null) {
            var4.putString("slot_" + var6, var7.method29336());
            var5 = true;
         }
      }

      if (var5) {
         var1.put("DisplaySlots", var4);
      }
   }

   public ListNBT method24636() {
      ListNBT var3 = new ListNBT();

      for (Class8375 var5 : this.field32341.method20982()) {
         if (var5.method29337() != null) {
            CompoundNBT var6 = new CompoundNBT();
            var6.putString("Name", var5.method29336());
            var6.putString("CriteriaName", var5.method29337().method33280());
            var6.putString("DisplayName", ITextComponent$Serializer.toJson(var5.method29338()));
            var6.putString("RenderType", var5.method29342().method9088());
            var3.add(var6);
         }
      }

      return var3;
   }
}
