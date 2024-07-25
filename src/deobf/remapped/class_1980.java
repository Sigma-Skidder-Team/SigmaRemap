package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_1980 extends class_1094 {
   private static final Logger field_10043 = LogManager.getLogger();
   private static final Identifier field_10023 = new Identifier("realms", "textures/gui/realms/op_icon.png");
   private static final Identifier field_10039 = new Identifier("realms", "textures/gui/realms/user_icon.png");
   private static final Identifier field_10032 = new Identifier("realms", "textures/gui/realms/cross_player_icon.png");
   private static final Identifier field_10019 = new Identifier("minecraft", "textures/gui/options_background.png");
   private static final ITextComponent field_10031 = new TranslationTextComponent("mco.configure.world.invites.normal.tooltip");
   private static final ITextComponent field_10037 = new TranslationTextComponent(field_10024[2]);
   private static final ITextComponent field_10036 = new TranslationTextComponent(field_10024[1]);
   private static final ITextComponent field_10042 = new TranslationTextComponent("mco.configure.world.invited");
   private ITextComponent field_10029;
   private final class_2866 field_10033;
   private final class_7675 field_10035;
   private class_5468 field_10022;
   private int field_10030;
   private int field_10021;
   private int field_10027;
   private class_9521 field_10038;
   private class_9521 field_10040;
   private int field_10026 = -1;
   private String field_10025;
   private int field_10020 = -1;
   private boolean field_10041;
   private class_8949 field_10034;
   private class_7179 field_10028 = class_7179.field_36918;

   public class_1980(class_2866 var1, class_7675 var2) {
      this.field_10033 = var1;
      this.field_10035 = var2;
   }

   @Override
   public void method_1163() {
      this.field_10030 = this.field_941 / 2 - 160;
      this.field_10021 = 150;
      this.field_10027 = this.field_941 / 2 + 12;
      this.field_943.field_9600.method_38887(true);
      this.field_10022 = new class_5468(this);
      this.field_10022.method_36212(this.field_10030);
      this.<class_5468>method_1159(this.field_10022);

      for (class_7407 var4 : this.field_10035.field_39019) {
         this.field_10022.method_24880(var4);
      }

      this.<class_9521>method_1186(
         new class_9521(
            this.field_10027,
            method_4819(1),
            this.field_10021 + 10,
            20,
            new TranslationTextComponent("mco.configure.world.buttons.invite"),
            var1 -> this.field_943.method_8609(new class_7352(this.field_10033, this, this.field_10035))
         )
      );
      this.field_10038 = this.<class_9521>method_1186(
         new class_9521(
            this.field_10027,
            method_4819(7),
            this.field_10021 + 10,
            20,
            new TranslationTextComponent("mco.configure.world.invites.remove.tooltip"),
            var1 -> this.method_9105(this.field_10020)
         )
      );
      this.field_10040 = this.<class_9521>method_1186(
         new class_9521(
            this.field_10027, method_4819(9), this.field_10021 + 10, 20, new TranslationTextComponent("mco.configure.world.invites.ops.tooltip"), var1 -> {
               if (!this.field_10035.field_39019.get(this.field_10020).method_33753()) {
                  this.method_9124(this.field_10020);
               } else {
                  this.method_9114(this.field_10020);
               }
            }
         )
      );
      this.<class_9521>method_1186(
         new class_9521(
            this.field_10027 + this.field_10021 / 2 + 2, method_4819(12), this.field_10021 / 2 + 10 - 2, 20, class_1402.field_7632, var1 -> this.method_9127()
         )
      );
      this.field_10034 = this.<class_8949>method_1159(
         new class_8949(new TranslationTextComponent("mco.configure.world.players.title"), this.field_941 / 2, 17, 16777215)
      );
      this.method_4820();
      this.method_9108();
   }

   private void method_9108() {
      this.field_10038.field_36677 = this.method_9130(this.field_10020);
      this.field_10040.field_36677 = this.method_9130(this.field_10020);
   }

   private boolean method_9130(int var1) {
      return var1 != -1;
   }

   @Override
   public void method_1162() {
      this.field_943.field_9600.method_38887(false);
   }

   @Override
   public boolean method_26946(int var1, int var2, int var3) {
      if (var1 != 256) {
         return super.method_26946(var1, var2, var3);
      } else {
         this.method_9127();
         return true;
      }
   }

   private void method_9127() {
      if (!this.field_10041) {
         this.field_943.method_8609(this.field_10033);
      } else {
         this.field_943.method_8609(this.field_10033.method_13136());
      }
   }

   private void method_9124(int var1) {
      this.method_9108();
      class_176 var4 = class_176.method_777();
      String var5 = this.field_10035.field_39019.get(var1).method_33748();

      try {
         this.method_9118(var4.method_765(this.field_10035.field_39016, var5));
      } catch (class_3900 var7) {
         field_10043.error("Couldn't op the user");
      }
   }

   private void method_9114(int var1) {
      this.method_9108();
      class_176 var4 = class_176.method_777();
      String var5 = this.field_10035.field_39019.get(var1).method_33748();

      try {
         this.method_9118(var4.method_790(this.field_10035.field_39016, var5));
      } catch (class_3900 var7) {
         field_10043.error("Couldn't deop the user");
      }
   }

   private void method_9118(class_3746 var1) {
      for (class_7407 var5 : this.field_10035.field_39019) {
         var5.method_33752(var1.field_18320.contains(var5.method_33746()));
      }
   }

   private void method_9105(int var1) {
      this.method_9108();
      if (var1 >= 0 && var1 < this.field_10035.field_39019.size()) {
         class_7407 var4 = this.field_10035.field_39019.get(var1);
         this.field_10025 = var4.method_33748();
         this.field_10026 = var1;
         class_2517 var5 = new class_2517(
            var1x -> {
               if (var1x) {
                  class_176 var4x = class_176.method_777();

                  try {
                     var4x.method_785(this.field_10035.field_39016, this.field_10025);
                  } catch (class_3900 var6) {
                     field_10043.error("Couldn't uninvite user");
                  }

                  this.method_9117(this.field_10026);
                  this.field_10020 = -1;
                  this.method_9108();
               }

               this.field_10041 = true;
               this.field_943.method_8609(this);
            },
            new StringTextComponent("Question"),
            new TranslationTextComponent("mco.configure.world.uninvite.question").appendString(" '").appendString(var4.method_33746()).appendString("' ?")
         );
         this.field_943.method_8609(var5);
      }
   }

   private void method_9117(int var1) {
      this.field_10035.field_39019.remove(var1);
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.field_10029 = null;
      this.field_10028 = class_7179.field_36918;
      this.method_1183(var1);
      if (this.field_10022 != null) {
         this.field_10022.method_6767(var1, var2, var3, var4);
      }

      int var7 = method_4819(12) + 20;
      class_8042 var8 = class_8042.method_36499();
      class_9633 var9 = var8.method_36501();
      this.field_943.getTextureManager().bindTexture(field_10019);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      float var10 = 32.0F;
      var9.method_44471(7, class_7985.field_40905);
      var9.method_35761(0.0, (double)this.field_940, 0.0)
         .method_35745(0.0F, (float)(this.field_940 - var7) / 32.0F + 0.0F)
         .method_35743(64, 64, 64, 255)
         .method_35735();
      var9.method_35761((double)this.field_941, (double)this.field_940, 0.0)
         .method_35745((float)this.field_941 / 32.0F, (float)(this.field_940 - var7) / 32.0F + 0.0F)
         .method_35743(64, 64, 64, 255)
         .method_35735();
      var9.method_35761((double)this.field_941, (double)var7, 0.0)
         .method_35745((float)this.field_941 / 32.0F, 0.0F)
         .method_35743(64, 64, 64, 255)
         .method_35735();
      var9.method_35761(0.0, (double)var7, 0.0).method_35745(0.0F, 0.0F).method_35743(64, 64, 64, 255).method_35735();
      var8.method_36500();
      this.field_10034.method_41093(this, var1);
      if (this.field_10035 != null && this.field_10035.field_39019 != null) {
         this.field_948
            .method_45378(
               var1,
               new StringTextComponent("")
                  .append(field_10042)
                  .appendString(" (")
                  .appendString(Integer.toString(this.field_10035.field_39019.size()))
                  .appendString(")"),
               (float)this.field_10030,
               (float)method_4819(0),
               10526880
            );
      } else {
         this.field_948.method_45378(var1, field_10042, (float)this.field_10030, (float)method_4819(0), 10526880);
      }

      super.method_6767(var1, var2, var3, var4);
      if (this.field_10035 != null) {
         this.method_9122(var1, this.field_10029, var2, var3);
      }
   }

   public void method_9122(class_7966 var1, ITextComponent var2, int var3, int var4) {
      if (var2 != null) {
         int var7 = var3 + 12;
         int var8 = var4 - 12;
         int var9 = this.field_948.method_45379(var2);
         this.method_9772(var1, var7 - 3, var8 - 3, var7 + var9 + 3, var8 + 8 + 3, -1073741824, -1073741824);
         this.field_948.method_45392(var1, var2, (float)var7, (float)var8, 16777215);
      }
   }

   private void method_9115(class_7966 var1, int var2, int var3, int var4, int var5) {
      boolean var8 = var4 >= var2 && var4 <= var2 + 9 && var5 >= var3 && var5 <= var3 + 9 && var5 < method_4819(12) + 20 && var5 > method_4819(1);
      this.field_943.getTextureManager().bindTexture(field_10032);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      float var9 = !var8 ? 0.0F : 7.0F;
      AbstractGui.method_9778(var1, var2, var3, 0.0F, var9, 8, 7, 8, 14);
      if (var8) {
         this.field_10029 = field_10036;
         this.field_10028 = class_7179.field_36921;
      }
   }

   private void method_9103(class_7966 var1, int var2, int var3, int var4, int var5) {
      boolean var8 = var4 >= var2 && var4 <= var2 + 9 && var5 >= var3 && var5 <= var3 + 9 && var5 < method_4819(12) + 20 && var5 > method_4819(1);
      this.field_943.getTextureManager().bindTexture(field_10023);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      float var9 = !var8 ? 0.0F : 8.0F;
      AbstractGui.method_9778(var1, var2, var3, 0.0F, var9, 8, 8, 8, 16);
      if (var8) {
         this.field_10029 = field_10037;
         this.field_10028 = class_7179.field_36917;
      }
   }

   private void method_9120(class_7966 var1, int var2, int var3, int var4, int var5) {
      boolean var8 = var4 >= var2 && var4 <= var2 + 9 && var5 >= var3 && var5 <= var3 + 9 && var5 < method_4819(12) + 20 && var5 > method_4819(1);
      this.field_943.getTextureManager().bindTexture(field_10039);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      float var9 = !var8 ? 0.0F : 8.0F;
      AbstractGui.method_9778(var1, var2, var3, 0.0F, var9, 8, 8, 8, 16);
      if (var8) {
         this.field_10029 = field_10031;
         this.field_10028 = class_7179.field_36917;
      }
   }
}
