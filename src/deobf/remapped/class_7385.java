package remapped;

import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent$class_40;
import net.minecraft.util.text.TextFormatting;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_7385 extends class_7186 {
   private static final Logger field_37715 = LogManager.getLogger();
   private class_1097 field_37713;
   private CompoundNBT field_37716;

   public class_7385() {
      super("scoreboard");
   }

   public void method_33639(class_1097 var1) {
      this.field_37713 = var1;
      if (this.field_37716 != null) {
         this.method_32924(this.field_37716);
      }
   }

   @Override
   public void method_32924(CompoundNBT var1) {
      if (this.field_37713 != null) {
         this.method_33641(var1.method_25927("Objectives", 10));
         this.field_37713.method_4856(var1.method_25927("PlayerScores", 10));
         if (var1.method_25939("DisplaySlots", 10)) {
            this.method_33635(var1.method_25937("DisplaySlots"));
         }

         if (var1.method_25939("Teams", 9)) {
            this.method_33637(var1.method_25927("Teams", 10));
         }
      } else {
         this.field_37716 = var1;
      }
   }

   public void method_33637(class_3416 var1) {
      for (int var4 = 0; var4 < var1.size(); var4++) {
         CompoundNBT var5 = var1.method_15764(var4);
         String var6 = var5.method_25965("Name");
         if (var6.length() > 16) {
            var6 = var6.substring(0, 16);
         }

         class_3903 var7 = this.field_37713.method_4865(var6);
         IFormattableTextComponent var8 = ITextComponent$class_40.func_240643_a_(var5.method_25965("DisplayName"));
         if (var8 != null) {
            var7.method_18059(var8);
         }

         if (var5.method_25939("TeamColor", 8)) {
            var7.method_18060(TextFormatting.getValueByName(var5.method_25965("TeamColor")));
         }

         if (var5.method_25939("AllowFriendlyFire", 99)) {
            var7.method_18062(var5.method_25933("AllowFriendlyFire"));
         }

         if (var5.method_25939("SeeFriendlyInvisibles", 99)) {
            var7.method_18070(var5.method_25933("SeeFriendlyInvisibles"));
         }

         if (var5.method_25939("MemberNamePrefix", 8)) {
            IFormattableTextComponent var9 = ITextComponent$class_40.func_240643_a_(var5.method_25965("MemberNamePrefix"));
            if (var9 != null) {
               var7.method_18064(var9);
            }
         }

         if (var5.method_25939("MemberNameSuffix", 8)) {
            IFormattableTextComponent var10 = ITextComponent$class_40.func_240643_a_(var5.method_25965("MemberNameSuffix"));
            if (var10 != null) {
               var7.method_18068(var10);
            }
         }

         if (var5.method_25939("NameTagVisibility", 8)) {
            class_1014 var11 = class_1014.method_4496(var5.method_25965("NameTagVisibility"));
            if (var11 != null) {
               var7.method_18061(var11);
            }
         }

         if (var5.method_25939("DeathMessageVisibility", 8)) {
            class_1014 var12 = class_1014.method_4496(var5.method_25965("DeathMessageVisibility"));
            if (var12 != null) {
               var7.method_18057(var12);
            }
         }

         if (var5.method_25939("CollisionRule", 8)) {
            class_5006 var13 = class_5006.method_23049(var5.method_25965("CollisionRule"));
            if (var13 != null) {
               var7.method_18071(var13);
            }
         }

         this.method_33642(var7, var5.method_25927("Players", 8));
      }
   }

   public void method_33642(class_3903 var1, class_3416 var2) {
      for (int var5 = 0; var5 < var2.size(); var5++) {
         this.field_37713.method_4842(var2.method_15770(var5), var1);
      }
   }

   public void method_33635(CompoundNBT var1) {
      for (int var4 = 0; var4 < 19; var4++) {
         if (var1.method_25939("slot_" + var4, 8)) {
            String var5 = var1.method_25965("slot_" + var4);
            class_4399 var6 = this.field_37713.method_4858(var5);
            this.field_37713.method_4831(var4, var6);
         }
      }
   }

   public void method_33641(class_3416 var1) {
      for (int var4 = 0; var4 < var1.size(); var4++) {
         CompoundNBT var5 = var1.method_15764(var4);
         class_6810.method_31260(var5.method_25965("CriteriaName")).ifPresent(var2 -> {
            String var5x = var5.method_25965("Name");
            if (var5x.length() > 16) {
               var5x = var5x.substring(0, 16);
            }

            IFormattableTextComponent var6 = ITextComponent$class_40.func_240643_a_(var5.method_25965("DisplayName"));
            class_8792 var7 = class_8792.method_40389(var5.method_25965("RenderType"));
            this.field_37713.method_4830(var5x, var2, var6, var7);
         });
      }
   }

   @Override
   public CompoundNBT method_32920(CompoundNBT var1) {
      if (this.field_37713 != null) {
         var1.method_25946("Objectives", this.method_33638());
         var1.method_25946("PlayerScores", this.field_37713.method_4837());
         var1.method_25946("Teams", this.method_33640());
         this.method_33636(var1);
         return var1;
      } else {
         field_37715.warn("Tried to save scoreboard without having a scoreboard...");
         return var1;
      }
   }

   public class_3416 method_33640() {
      class_3416 var3 = new class_3416();

      for (class_3903 var5 : this.field_37713.method_4841()) {
         CompoundNBT var6 = new CompoundNBT();
         var6.method_25941("Name", var5.method_23383());
         var6.method_25941("DisplayName", ITextComponent$class_40.toJson(var5.method_18066()));
         if (var5.method_23381().getColorIndex() >= 0) {
            var6.method_25941("TeamColor", var5.method_23381().getFriendlyName());
         }

         var6.method_25934("AllowFriendlyFire", var5.method_23376());
         var6.method_25934("SeeFriendlyInvisibles", var5.method_23377());
         var6.method_25941("MemberNamePrefix", ITextComponent$class_40.toJson(var5.method_18058()));
         var6.method_25941("MemberNameSuffix", ITextComponent$class_40.toJson(var5.method_18065()));
         var6.method_25941("NameTagVisibility", var5.method_23379().field_5324);
         var6.method_25941("DeathMessageVisibility", var5.method_23374().field_5324);
         var6.method_25941("CollisionRule", var5.method_23382().field_25895);
         class_3416 var7 = new class_3416();

         for (String var9 : var5.method_23378()) {
            var7.add(class_473.method_2261(var9));
         }

         var6.method_25946("Players", var7);
         var3.add(var6);
      }

      return var3;
   }

   public void method_33636(CompoundNBT var1) {
      CompoundNBT var4 = new CompoundNBT();
      boolean var5 = false;

      for (int var6 = 0; var6 < 19; var6++) {
         class_4399 var7 = this.field_37713.method_4833(var6);
         if (var7 != null) {
            var4.method_25941("slot_" + var6, var7.method_20490());
            var5 = true;
         }
      }

      if (var5) {
         var1.method_25946("DisplaySlots", var4);
      }
   }

   public class_3416 method_33638() {
      class_3416 var3 = new class_3416();

      for (class_4399 var5 : this.field_37713.method_4836()) {
         if (var5.method_20491() != null) {
            CompoundNBT var6 = new CompoundNBT();
            var6.method_25941("Name", var5.method_20490());
            var6.method_25941("CriteriaName", var5.method_20491().method_31262());
            var6.method_25941("DisplayName", ITextComponent$class_40.toJson(var5.method_20488()));
            var6.method_25941("RenderType", var5.method_20483().method_40390());
            var3.add(var6);
         }
      }

      return var3;
   }
}
