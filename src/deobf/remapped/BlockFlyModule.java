package remapped;

import java.util.Arrays;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class BlockFlyModule extends SecondModule {
   public static List<class_6414> field_18195;
   public int field_18196;
   public class_2440 field_18194 = new class_2440(114, 114, class_4043.field_19618);
   public int field_18193 = 0;

   public BlockFlyModule() {
      super(Category.MOVEMENT, "BlockFly", "Allows you to automatically bridge", new class_6049(), new class_2461(), new BlockFlyPartModule(), new class_6205());
      this.addSetting(new ModeSetting("ItemSpoof", "Item spoofing mode", 2, "None", "Switch", "Spoof", "LiteSpoof"));
      this.addSetting(new ModeSetting("Tower Mode", "Tower mode", 1, "None", "NCP", "AAC", "Vanilla"));
      this.addSetting(new ModeSetting("Picking mode", "The way it will move blocks in your inventory.", 0, "Basic", "FakeInv", "OpenInv"));
      this.addSetting(new BooleanSetting("Tower while moving", "Allows you to tower while moving.", false));
      this.addSetting(new BooleanSetting("Show Block Amount", "Shows the amount of blocks in your inventory.", true));
      this.addSetting(new BooleanSetting("NoSwing", "Removes the swing animation.", true));
      this.addSetting(new BooleanSetting("Intelligent Block Picker", "Always get the biggest blocks stack.", true));
      this.addSetting(new BooleanSetting("No Sprint", "Disable sprint.", false));
      field_18195 = Arrays.<class_6414>asList(
         class_4783.field_23184,
         class_4783.field_23900,
         class_4783.field_23811,
         class_4783.field_23815,
         class_4783.field_23656,
         class_4783.field_23786,
         class_4783.field_23817,
         class_4783.field_23496,
         class_4783.field_23829,
         class_4783.field_23471,
         class_4783.field_23739,
         class_4783.field_23521,
         class_4783.field_23796,
         class_4783.field_23739,
         class_4783.field_23472,
         class_4783.field_23312,
         class_4783.field_23252,
         class_4783.field_23349,
         class_4783.field_23806,
         class_4783.field_23406,
         class_4783.field_23778,
         class_4783.field_23247,
         class_4783.field_23460,
         class_4783.field_23812,
         class_4783.field_23540,
         class_4783.field_23860,
         class_4783.field_23594,
         class_4783.field_23729,
         class_4783.field_23323,
         class_4783.field_23513,
         class_4783.field_23748,
         class_4783.field_23883,
         class_4783.field_23216,
         class_4783.field_23500,
         class_4783.field_23304,
         class_4783.field_23914,
         class_4783.field_23794,
         class_4783.field_23718,
         class_4783.field_23871,
         class_4783.field_23221
      );
   }

   public boolean method_17212() {
      return this.method_42007("No Sprint") && this.method_42015();
   }

   public static boolean method_17216(class_2451 var0) {
      if (!(var0 instanceof class_6201)) {
         return false;
      } else {
         class_6414 var3 = ((class_6201)var0).method_28392();
         return !field_18195.contains(var3)
            && !(var3 instanceof class_7812)
            && !(var3 instanceof class_2830)
            && !(var3 instanceof class_7502)
            && !(var3 instanceof class_691)
            && !(var3 instanceof class_7288)
            && !(var3 instanceof class_285)
            && !(var3 instanceof class_3725)
            && !(var3 instanceof class_3633)
            && !(var3 instanceof class_4314)
            && !(var3 instanceof class_6942)
            && !(var3 instanceof class_4115);
      }
   }

   public void method_17211() {
      try {
         for (int var3 = 36; var3 < 45; var3++) {
            int var4 = var3 - 36;
            if (mcInstance.field_9632.field_3869.method_18878(var3).method_35884()
               && method_17216(mcInstance.field_9632.field_3869.method_18878(var3).method_35898().method_27960())
               && mcInstance.field_9632.field_3869.method_18878(var3).method_35898().field_31206 != 0) {
               if (mcInstance.field_9632.field_3853.field_36404 == var4) {
                  return;
               }

               mcInstance.field_9632.field_3853.field_36404 = var4;
               if (this.method_42016("ItemSpoof").equals("LiteSpoof") && (this.field_18196 < 0 || this.field_18196 != var4)) {
                  mcInstance.method_8614().method_9091().method_23485(new class_7371(var4));
                  this.field_18196 = var4;
               }
               break;
            }
         }
      } catch (Exception var5) {
      }
   }

   public int method_17219() {
      int var3 = 0;

      for (int var4 = 0; var4 < 45; var4++) {
         if (mcInstance.field_9632.field_3869.method_18878(var4).method_35884()) {
            class_6098 var5 = mcInstance.field_9632.field_3869.method_18878(var4).method_35898();
            class_2451 var6 = var5.method_27960();
            if (method_17216(var6)) {
               var3 += var5.field_31206;
            }
         }
      }

      return var3;
   }

   public void method_17215() {
      String var3 = this.method_42016("Picking mode");
      if ((!var3.equals("OpenInv") || mcInstance.field_9623 instanceof class_3431) && this.method_17219() != 0) {
         int var4 = 43;
         if (!this.method_42007("Intelligent Block Picker")) {
            if (!this.method_17217()) {
               int var5 = -1;

               for (int var6 = 9; var6 < 36; var6++) {
                  if (mcInstance.field_9632.field_3869.method_18878(var6).method_35884()) {
                     class_2451 var7 = mcInstance.field_9632.field_3869.method_18878(var6).method_35898().method_27960();
                     if (method_17216(var7)) {
                        var5 = var6;
                        break;
                     }
                  }
               }

               for (int var9 = 36; var9 < 45; var9++) {
                  if (!mcInstance.field_9632.field_3869.method_18878(var9).method_35884()) {
                     var4 = var9;
                     break;
                  }
               }

               if (var5 >= 0) {
                  if (!(mcInstance.field_9623 instanceof class_3431) && var3.equals("FakeInv")) {
                     mcInstance.method_8614().method_4813(new class_8559(class_2105.field_10551));
                  }

                  this.method_17221(var5, var4 - 36);
                  if (!(mcInstance.field_9623 instanceof class_3431) && var3.equals("FakeInv")) {
                     mcInstance.method_8614().method_4813(new class_1194(-1));
                  }
               }
            }
         } else {
            int var8 = this.method_17214();
            if (!this.method_17217()) {
               for (int var11 = 36; var11 < 45; var11++) {
                  if (!mcInstance.field_9632.field_3869.method_18878(var11).method_35884()) {
                     var4 = var11;
                     break;
                  }
               }
            } else {
               for (int var10 = 36; var10 < 45; var10++) {
                  if (mcInstance.field_9632.field_3869.method_18878(var10).method_35884()) {
                     class_2451 var12 = mcInstance.field_9632.field_3869.method_18878(var10).method_35898().method_27960();
                     if (method_17216(var12)) {
                        var4 = var10;
                        if (mcInstance.field_9632.field_3869.method_18878(var10).method_35898().field_31206
                           == mcInstance.field_9632.field_3869.method_18878(var8).method_35898().field_31206) {
                           var4 = -1;
                        }
                        break;
                     }
                  }
               }
            }

            if (var4 >= 0 && mcInstance.field_9632.field_3869.method_18878(var4).field_40588 != var8) {
               if (!(mcInstance.field_9623 instanceof class_3431) && var3.equals("FakeInv") && class_3347.method_15349() <= class_412.field_1752.method_2055()
                  )
                {
                  mcInstance.method_8614().method_4813(new class_8559(class_2105.field_10551));
               }

               this.method_17221(var8, var4 - 36);
               if (!(mcInstance.field_9623 instanceof class_3431) && var3.equals("FakeInv")) {
                  mcInstance.method_8614().method_4813(new class_1194(-1));
               }
            }
         }
      }
   }

   public int method_17214() {
      int var3 = -1;
      int var4 = 0;
      if (this.method_17219() != 0) {
         for (int var5 = 9; var5 < 45; var5++) {
            if (mcInstance.field_9632.field_3869.method_18878(var5).method_35884()) {
               class_2451 var6 = mcInstance.field_9632.field_3869.method_18878(var5).method_35898().method_27960();
               class_6098 var7 = mcInstance.field_9632.field_3869.method_18878(var5).method_35898();
               if (method_17216(var6) && var7.field_31206 > var4) {
                  var4 = var7.field_31206;
                  var3 = var5;
               }
            }
         }

         return var3;
      } else {
         return -1;
      }
   }

   public boolean method_17217() {
      for (int var3 = 36; var3 < 45; var3++) {
         if (mcInstance.field_9632.field_3869.method_18878(var3).method_35884()) {
            class_2451 var4 = mcInstance.field_9632.field_3869.method_18878(var3).method_35898().method_27960();
            if (method_17216(var4)) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean method_17224(class_2584 var1) {
      if (!this.method_42017().method_42016("ItemSpoof").equals("None")) {
         if (this.method_17219() == 0) {
            return false;
         }
      } else if (!method_17216(mcInstance.field_9632.method_26617(var1).method_27960())) {
         return false;
      }

      return true;
   }

   public void method_17221(int var1, int var2) {
      mcInstance.field_9647.method_42134(mcInstance.field_9632.field_3869.field_19925, var1, var2, class_6269.field_32026, mcInstance.field_9632);
   }

   public void method_17220(class_7767 var1) {
      if (mcInstance.field_9616.field_32603 == 0.8038576F) {
         mcInstance.field_9616.field_32603 = 1.0F;
      }

      if (this.method_17219() != 0 && (!mcInstance.field_9632.field_41774 || this.method_42016("Tower Mode").equalsIgnoreCase("Vanilla"))) {
         if (!class_314.method_1434() || this.method_42007("Tower while moving")) {
            String var4 = this.method_42016("Tower Mode");
            switch (var4) {
               case "NCP":
                  if (var1.method_35236() > 0.0) {
                     if (class_8865.method_40769() == 0) {
                        if (var1.method_35236() > 0.247 && var1.method_35236() < 0.249) {
                           var1.method_35235(
                              (double)((int)(mcInstance.field_9632.method_37309() + var1.method_35236())) - mcInstance.field_9632.method_37309()
                           );
                        }
                     } else {
                        double var6 = (double)((int)(mcInstance.field_9632.method_37309() + var1.method_35236()));
                        if (var6 != (double)((int) mcInstance.field_9632.method_37309())
                           && mcInstance.field_9632.method_37309() + var1.method_35236() - var6 < 0.15) {
                           var1.method_35235(var6 - mcInstance.field_9632.method_37309());
                        }
                     }
                  }

                  if (mcInstance.field_9632.method_37309() == (double)((int) mcInstance.field_9632.method_37309())
                     && class_314.method_1413(mcInstance.field_9632, 0.001F)) {
                     if (mcInstance.field_9577.field_45450.field_30024) {
                        if (!class_314.method_1434()) {
                           class_8865.method_40776(0.0);
                           class_8865.method_40777(var1, 0.0);
                        }

                        var1.method_35235(class_8865.method_40786());
                     } else {
                        var1.method_35235(-1.0E-5);
                     }
                  }
                  break;
               case "AAC":
                  if (var1.method_35236() > 0.247 && var1.method_35236() < 0.249) {
                     var1.method_35235((double)((int)(mcInstance.field_9632.method_37309() + var1.method_35236())) - mcInstance.field_9632.method_37309());
                     if (mcInstance.field_9577.field_45450.field_30024 && !class_314.method_1434()) {
                        class_8865.method_40776(0.0);
                        class_8865.method_40777(var1, 0.0);
                     }
                  } else if (mcInstance.field_9632.method_37309() == (double)((int) mcInstance.field_9632.method_37309())
                     && class_314.method_1413(mcInstance.field_9632, 0.001F)) {
                     var1.method_35235(-1.0E-10);
                  }
                  break;
               case "Vanilla":
                  if (mcInstance.field_9577.field_45450.field_30024
                     && class_314.method_1413(mcInstance.field_9632, 0.001F)
                     && mcInstance.field_9601.method_6680(mcInstance.field_9632, mcInstance.field_9632.field_41712.method_18918(0.0, 1.0, 0.0)).count()
                        == 0L) {
                     mcInstance.field_9632
                        .method_37256(mcInstance.field_9632.method_37302(), mcInstance.field_9632.method_37309() + 1.0, mcInstance.field_9632.method_37156());
                     var1.method_35235(0.0);
                     class_8865.method_40777(var1, 0.0);
                     mcInstance.field_9616.field_32603 = 0.8038576F;
                  }
            }
         }
      } else if (!this.method_42016("Tower Mode").equals("AAC")
         || !class_314.method_1413(mcInstance.field_9632, 0.001F)
         || !mcInstance.field_9577.field_45450.field_30024) {
         if (!this.method_42016("Tower Mode").equals("NCP")
            && !this.method_42016("Tower Mode").equals("Vanilla")
            && class_314.method_1413(mcInstance.field_9632, 0.001F)
            && mcInstance.field_9577.field_45450.field_30024) {
            mcInstance.field_9632.field_29600 = 20;
            var1.method_35235(class_8865.method_40786());
         }
      } else if (!class_314.method_1434() || this.method_42007("Tower while moving")) {
         mcInstance.field_9632.field_29600 = 0;
         mcInstance.field_9632.method_26595();
         class_8865.method_40777(var1, class_8865.method_40775());
         class_8865.method_40776(class_8865.method_40775());
      }

      if (!this.method_42016("Tower Mode").equalsIgnoreCase("Vanilla")) {
         class_314.method_1408(var1.method_35236());
      }
   }

   @Override
   public String method_41987() {
      return SigmaMainClass.method_3328().method_3312() != class_6015.field_30644 ? super.method_41987() : "Scaffold";
   }

   @class_9148
   public void method_17218(class_5596 var1) {
      if (this.method_42015()) {
         if (this.method_42007("Show Block Amount")) {
            this.field_18193 = this.method_17219();
         }
      }
   }

   @Override
   public void method_42020() {
      this.field_18194.method_11119(class_4043.field_19618);
      super.method_42020();
   }

   @class_9148
   public void method_17213(class_3278 var1) {
      this.field_18194.method_11119(class_4043.field_19620);
      if (this.field_18194.method_11123() != 0.0F) {
         if (this.method_42007("Show Block Amount")) {
            if (SigmaMainClass.method_3328().method_3312() != class_6015.field_30645) {
               this.method_17222(
                  mcInstance.window.method_43166() / 2,
                  mcInstance.window.method_43163() / 2 + 15 - (int)(10.0F * this.field_18194.method_11123()),
                  this.field_18194.method_11123()
               );
            } else {
               this.method_17223(
                  mcInstance.window.method_43166() / 2,
                  mcInstance.window.method_43163() - 138 - (int)(25.0F * class_3483.method_15985(this.field_18194.method_11123(), 0.0F, 1.0F, 1.0F)),
                  this.field_18194.method_11123()
               );
            }
         }
      }
   }

   public void method_17222(int var1, int var2, float var3) {
      var3 = (float)(0.5 + 0.5 * (double)var3);
      GL11.glAlphaFunc(518, 0.1F);
      class_73.method_87(
         class_3054.field_14997,
         (float)(var1 + 10),
         (float)(var2 + 5),
         this.field_18193 + " Blocks",
         class_314.method_1444(class_1255.field_6929.field_6917, var3 * 0.3F)
      );
      class_73.method_87(
         class_3054.field_14997,
         (float)(var1 + 10),
         (float)(var2 + 4),
         this.field_18193 + " Blocks",
         class_314.method_1444(class_1255.field_6918.field_6917, var3 * 0.8F)
      );
      GL11.glAlphaFunc(519, 0.0F);
   }

   public void method_17223(int var1, int var2, float var3) {
      int var6 = 0;
      int var7 = class_5320.field_27139.method_18547(this.field_18193 + "") + 3;
      var6 += var7;
      var6 += class_5320.field_27138.method_18547("Blocks");
      int var8 = var6 + 20;
      byte var9 = 32;
      var1 -= var8 / 2;
      GL11.glPushMatrix();
      class_73.method_115(var1, var2, var8, var9, class_314.method_1444(-15461356, 0.8F * var3));
      class_73.method_87(
         class_5320.field_27139, (float)(var1 + 10), (float)(var2 + 4), this.field_18193 + "", class_314.method_1444(class_1255.field_6918.field_6917, var3)
      );
      class_73.method_87(
         class_5320.field_27138, (float)(var1 + 10 + var7), (float)(var2 + 8), "Blocks", class_314.method_1444(class_1255.field_6918.field_6917, 0.6F * var3)
      );
      var1 += 11 + var8 / 2;
      var2 += var9;
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var1, (float)var2, 0.0F);
      GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
      GL11.glTranslatef((float)(-var1), (float)(-var2), 0.0F);
      class_73.method_99((float)var1, (float)var2, 9.0F, 23.0F, class_2209.field_11022, class_314.method_1444(-15461356, 0.8F * var3));
      GL11.glPopMatrix();
      GL11.glPopMatrix();
   }
}
