package remapped;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import org.lwjgl.opengl.GL11;

public class KillauraModule extends Module {
   public static boolean field_12548 = false;
   private class_8734 field_12561;
   private int field_12546;
   private int field_12553;
   private int field_12545;
   private int field_12570;
   private int field_12565;
   private int field_12557;
   private int field_12555;
   private int field_12552;
   private int field_12559;
   public static Entity field_12558;
   public static class_3357 field_12556;
   private List<class_3357> field_12560;
   public static class_1988 field_12563 = new class_1988(0.0F, 0.0F);
   private class_1988 field_12567;
   private class_1988 field_12569;
   public static int field_12551;
   private double field_12549;
   private float field_12547;
   private float field_12562;
   private float field_12566;
   private boolean field_12564;
   private double[] field_12550;
   public HashMap<Entity, class_2440> field_12568 = new HashMap<Entity, class_2440>();

   public KillauraModule() {
      super(Category.COMBAT, "KillAura", "Automatically attacks entities");
      this.addSetting(new ModeSetting("Mode", "Mode", 0, "Single", "Switch", "Multi", "Multi2"));
      this.addSetting(new ModeSetting("Autoblock Mode", "Autoblock Mode", 0, "None", "NCP", "Basic1", "Basic2", "Vanilla"));
      this.addSetting(new ModeSetting("Sort Mode", "Sort Mode", 0, "Range", "Health", "Angle", "Armor", "Prev Range"));
      this.addSetting(new ModeSetting("Attack Mode", "Attacks after or before sending the movement", 0, "Pre", "Post"));
      this.addSetting(new ModeSetting("Rotation Mode", "The way you will look at entities", 0, "NCP", "AAC", "Smooth", "LockView", "Test", "Test2", "None"));
      this.addSetting(new FloatSetting<Float>("Range", "Range value", 4.0F, Float.class, 2.8F, 8.0F, 0.01F));
      this.addSetting(new FloatSetting<Float>("Block Range", "Block Range value", 4.0F, Float.class, 2.8F, 8.0F, 0.2F));
      this.addSetting(
         new FloatSetting<Float>("Min CPS", "Min CPS value", 8.0F, Float.class, 1.0F, 20.0F, 1.0F).setModeClass(var1 -> this.field_12561.method_40098())
      );
      this.addSetting(
         new FloatSetting<Float>("Max CPS", "Max CPS value", 8.0F, Float.class, 1.0F, 20.0F, 1.0F).setModeClass(var1 -> this.field_12561.method_40098())
      );
      this.addSetting(new FloatSetting<Float>("Hit box expand", "Hit Box expand", 0.05F, Float.class, 0.0F, 1.0F, 0.01F));
      this.addSetting(new FloatSetting<Float>("Hit Chance", "Hit Chance", 100.0F, Float.class, 25.0F, 100.0F, 1.0F));
      this.addSetting(new BooleanSetting("Interact autoblock", "Send interact packet when blocking", true));
      this.addSetting(new BooleanSetting("Players", "Hit players", true));
      this.addSetting(new BooleanSetting("Animals", "Hit animals", false));
      this.addSetting(new BooleanSetting("Monsters", "Hit monsters", false));
      this.addSetting(new BooleanSetting("Invisible", "Hit invisible entites", true));
      this.addSetting(new BooleanSetting("Raytrace", "Helps the aura become more legit", true));
      this.addSetting(new BooleanSetting("Cooldown", "Use attack cooldown (1.9+)", false));
      this.addSetting(new BooleanSetting("No swing", "Hit without swinging", false));
      this.addSetting(new BooleanSetting("Disable on death", "Disable on death", true));
      this.addSetting(new BooleanSetting("Through walls", "Target entities through walls", true));
      this.addSetting(new BooleanSetting("Smart Reach", "Allows you to get more reach (depends on your ping)", true));
      this.addSetting(new BooleanSetting("Silent", "Silent rotations", true));
      this.addSetting(new BooleanSetting("ESP", "ESP on targets", true));
      this.addSetting(new ColorSetting("ESP Color", "The render color", class_1255.field_6918.field_6917));
   }

   @Override
   public void method_42012() {
      this.field_12560 = new ArrayList<class_3357>();
      this.field_12561 = new class_8734(this);
      super.method_42012();
   }

   @Override
   public void onEnable() {
      this.field_12560 = new ArrayList<class_3357>();
      field_12558 = null;
      field_12556 = null;
      this.field_12546 = (int)this.field_12561.method_40095(0);
      this.field_12553 = 0;
      this.field_12570 = 0;
      field_12551 = 0;
      this.field_12569 = new class_1988(client.thePlayer.field_30535, client.thePlayer.field_30524);
      this.field_12567 = new class_1988(client.thePlayer.field_41701, client.thePlayer.field_41755);
      field_12563 = new class_1988(client.thePlayer.field_41701, client.thePlayer.field_41755);
      this.field_12562 = -1.0F;
      this.field_12561
         .method_40099(
            client.thePlayer.method_26617(class_2584.field_12791).method_27960() instanceof class_2235
               && client.gameOptions.keyUse.isKeyDown()
         );
      this.field_12564 = false;
      this.field_12552 = -1;
      this.field_12561.field_44743.clear();
      this.field_12568.clear();
      if (client.thePlayer.field_41726) {
         this.field_12545 = 1;
      }

      super.onEnable();
   }

   @Override
   public void onDisable() {
      field_12558 = null;
      field_12556 = null;
      this.field_12560 = null;
      field_12548 = false;
      super.onDisable();
   }

   @EventListen
   public void method_11541(class_717 var1) {
      if (this.method_42015() && this.getBooleanValueByName("Disable on death")) {
         SigmaMainClass.getInstance().getNotificationManager().pushNotification(new Notification("Aura", "Aura disabled due to respawn"));
         this.method_41999();
      }
   }

   @EventListen
   public void method_11558(class_5596 var1) {
      if (this.method_42015()) {
         if (this.field_12562 != -1.0F) {
            this.field_12562++;
         }

         if (this.getBooleanValueByName("Disable on death")) {
            if (!client.thePlayer.method_37330()) {
               this.method_41999();
               SigmaMainClass.getInstance().getNotificationManager().pushNotification(new Notification("Aura", "Aura disabled due to death"));
            }
         }
      }
   }

   @EventListen
   public void method_11535(class_4996 var1) {
      if (this.method_42015()) {
         if (!this.getStringValueByName("Autoblock Mode").equals("None")
            && (client.thePlayer.method_26446().method_27960() instanceof class_2235 || this.field_12565 != client.thePlayer.inventory.field_36404)
            && field_12558 != null) {
            var1.method_29715(true);
         } else if (client.thePlayer.method_26446().method_27960() instanceof class_2235) {
            this.field_12555 = 2;
         }
      }
   }

   @EventListen
   @class_4249
   public void method_11549(class_1393 var1) {
      if (this.method_42015() && client.thePlayer != null) {
         if (!var1.method_6449()) {
            this.field_12565 = client.thePlayer.inventory.field_36404;
            if (field_12558 != null && this.field_12561.method_40097() && this.field_12567 != null) {
               this.field_12561.method_40101(field_12558, this.field_12567.field_10069, this.field_12567.field_10067);
            }
         } else {
            if (this.field_12555 > 0) {
               this.field_12555--;
            }

            if (field_12558 != null && this.field_12561.method_40094() && class_8865.method_40772() && this.getStringValueByName("Autoblock Mode").equals("NCP")) {
               this.field_12561.method_40093();
            }

            if (this.field_12561.method_40094() && (!(client.thePlayer.method_26446().method_27960() instanceof class_2235) || field_12558 == null)) {
               this.field_12561.method_40099(false);
            }

            if (this.field_12552 >= 0) {
               if (this.field_12552 == 0) {
                  this.field_12561.method_40093();
                  this.field_12561.method_40099(true);
               }

               this.field_12552--;
            }

            this.method_11546();
            if (this.field_12560 != null && !this.field_12560.isEmpty()) {
               this.field_12546++;
               float var4 = this.getFloatValueByName("Hit box expand");
               SecondModule var5 = (SecondModule) SigmaMainClass.getInstance().getModuleManager().getModuleByClass(CriticalsModule.class);
               if (var5.method_42015() && var5.getStringValueByName("Type").equalsIgnoreCase("Minis")) {
                  this.method_11542(var1, var5.method_16864().getStringValueByName("Mode"), var5.method_16864().getBooleanValueByName("Avoid Fall Damage"));
               }

               this.method_11545();
               if (var1.method_6442() - client.thePlayer.field_41701 != 0.0F) {
                  this.field_12567.field_10069 = var1.method_6442();
                  this.field_12567.field_10067 = var1.method_6439();
               }

               var1.method_6441(this.field_12567.field_10069);
               var1.method_6448(this.field_12567.field_10067);
               boolean var6 = this.field_12561.method_40090(this.field_12546);
               float var7 = !((double) client.thePlayer.method_3163() < 1.26) && this.getBooleanValueByName("Cooldown")
                  ? client.thePlayer.method_3203(0.0F)
                  : 1.0F;
               boolean var8 = field_12551 == 0 && var6 && var7 >= 1.0F;
               if (var6) {
                  this.field_12561.method_40092();
               }

               if (var8) {
                  KillauraManager var9 = new KillauraManager(this, var4);
                  boolean var10 = this.getStringValueByName("Attack Mode").equals("Pre");
                  if (!var10) {
                     var1.method_6445(var9);
                  } else {
                     var9.run();
                  }

                  this.field_12546 = 0;
               }

               if (field_12551 > 0) {
                  field_12551--;
               }
            }
         }
      }
   }

   @EventListen
   public void method_11551(class_3278 var1) {
      if (field_12556 != null && !this.getBooleanValueByName("Silent") && !this.getStringValueByName("Rotation Mode").equals("None")) {
         float var4 = class_9299.method_42810(
            this.field_12569.field_10069 + (this.field_12567.field_10069 - this.field_12569.field_10069) * client.method_8554()
         );
         float var5 = class_9299.method_42810(
            this.field_12569.field_10067 + (this.field_12567.field_10067 - this.field_12569.field_10067) * client.method_8554()
         );
         client.thePlayer.field_41701 = var4;
         client.thePlayer.field_41755 = var5;
      }
   }

   @EventListen
   public void method_11552(class_3368 var1) {
      if (this.field_12560 != null) {
         Iterator var4 = this.field_12568.entrySet().iterator();

         while (var4.hasNext()) {
            Entry var5 = (Entry)var4.next();

            for (class_3357 var7 : this.field_12560) {
               if (!((Entity)var5.getKey()).equals(var7.method_15377())) {
               }
            }

            ((class_2440)var5.getValue()).method_11119(class_4043.field_19618);
            if (((class_2440)var5.getValue()).method_11123() == 0.0F) {
               var4.remove();
            }
         }

         for (class_3357 var10 : this.field_12560) {
            if (var10 != null) {
               if (!this.field_12568.containsKey(var10.method_15377())) {
                  this.field_12568.put(var10.method_15377(), new class_2440(250, 250));
               } else {
                  this.field_12568.get(var10.method_15377()).method_11119(class_4043.field_19620);
               }
            }
         }

         for (Entry var11 : this.field_12568.entrySet()) {
            this.method_11553((Entity)var11.getKey());
         }
      }
   }

   @EventListen
   public void method_11537(PacketEvent var1) {
      Packet var4 = var1.method_557();
      if (!(var4 instanceof class_527)) {
         if (var4 instanceof class_295) {
            class_295 var5 = (class_295)var4;
            if (var5.method_1329() == 3 && this.field_12561.field_44743.containsKey(var5.method_1331(client.field_9601))) {
               this.field_12561.field_44743.remove(var5.method_1331(client.field_9601));
            }
         }
      } else {
         class_527 var11 = (class_527)var4;
         if (var11.method_2565() && (var11.field_3209 != 0 || var11.field_3213 != 0 || var11.field_3207 != 0)) {
            for (Entry var7 : this.field_12561.field_44743.entrySet()) {
               Entity var8 = (Entity)var7.getKey();
               List var9 = (List)var7.getValue();
               if (var11.method_2564(client.field_9601) == var8) {
                  class_1343 var10 = var8.field_41700.method_6209(2.4414062E-4F);
                  var9.add(new class_9097<class_1343, Long>(var10, System.currentTimeMillis()));
               }
            }
         }
      }
   }

   public void method_11553(Entity var1) {
      GL11.glPushMatrix();
      GL11.glEnable(2848);
      GL11.glDisable(3553);
      GL11.glEnable(32925);
      GL11.glEnable(2929);
      GL11.glLineWidth(1.4F);
      double var4 = (double) MinecraftClient.getInstance().theTimer.field_32600;
      if (!var1.method_37330()) {
         var4 = 0.0;
      }

      GL11.glTranslated(
         var1.field_41754 + (var1.method_37302() - var1.field_41754) * var4,
         var1.field_41713 + (var1.method_37309() - var1.field_41713) * var4,
         var1.field_41724 + (var1.method_37156() - var1.field_41724) * var4
      );
      GL11.glTranslated(
         -client.gameRenderer.method_35949().method_41627().method_61(),
         -client.gameRenderer.method_35949().method_41627().method_60(),
         -client.gameRenderer.method_35949().method_41627().method_62()
      );
      GL11.glEnable(32823);
      GL11.glEnable(3008);
      GL11.glEnable(3042);
      GL11.glAlphaFunc(519, 0.0F);
      short var6 = 1800;
      float var7 = (float)(System.currentTimeMillis() % (long)var6) / (float)var6;
      boolean var8 = var7 > 0.5F;
      var7 = !var8 ? var7 * 2.0F : 1.0F - var7 * 2.0F % 1.0F;
      GL11.glTranslatef(0.0F, (var1.method_37074() + 0.4F) * var7, 0.0F);
      float var9 = (float)Math.sin((double)var7 * Math.PI);
      this.method_11554(var8, 0.45F * var9, 0.6F, 0.35F * var9, this.field_12568.get(var1).method_11123());
      GL11.glPushMatrix();
      GL11.glTranslated(
         client.gameRenderer.method_35949().method_41627().method_61(),
         client.gameRenderer.method_35949().method_41627().method_60(),
         client.gameRenderer.method_35949().method_41627().method_62()
      );
      GL11.glPopMatrix();
      GL11.glEnable(3553);
      GL11.glDisable(32925);
      GL11.glDisable(2848);
      GL11.glPopMatrix();
   }

   public void method_11554(boolean var1, float var2, float var3, float var4, float var5) {
      RenderSystem.method_16486(7425);
      GL11.glDisable(32823);
      GL11.glDisable(2929);
      GL11.glBegin(5);
      int var8 = (int)(360.0F / (40.0F * var3));
      Color var9 = new Color(this.getIntValueByName("ESP Color"));
      float var10 = (float)var9.getRed() / 255.0F;
      float var11 = (float)var9.getGreen() / 255.0F;
      float var12 = (float)var9.getBlue() / 255.0F;

      for (int var13 = 0; var13 <= 360 + var8; var13 += var8) {
         int var14 = var13;
         if (var13 > 360) {
            var14 = 0;
         }

         double var15 = Math.sin((double)var14 * Math.PI / 180.0) * (double)var3;
         double var17 = Math.cos((double)var14 * Math.PI / 180.0) * (double)var3;
         GL11.glColor4f(var10, var11, var12, !var1 ? 0.0F : var4 * var5);
         GL11.glVertex3d(var15, 0.0, var17);
         GL11.glColor4f(var10, var11, var12, var1 ? 0.0F : var4 * var5);
         GL11.glVertex3d(var15, (double)var2, var17);
      }

      GL11.glEnd();
      GL11.glLineWidth(2.2F);
      GL11.glBegin(3);

      for (int var19 = 0; var19 <= 360 + var8; var19 += var8) {
         int var20 = var19;
         if (var19 > 360) {
            var20 = 0;
         }

         double var21 = Math.sin((double)var20 * Math.PI / 180.0) * (double)var3;
         double var22 = Math.cos((double)var20 * Math.PI / 180.0) * (double)var3;
         GL11.glColor4f(var10, var11, var12, (0.5F + 0.5F * var4) * var5);
         GL11.glVertex3d(var21, !var1 ? (double)var2 : 0.0, var22);
      }

      GL11.glEnd();
      GL11.glEnable(2929);
      RenderSystem.method_16486(7424);
   }

   public boolean method_11555() {
      return field_12558 != null
         && client.thePlayer.method_26446() != null
         && client.thePlayer.method_26446().method_27960() instanceof class_2235
         && !this.getStringValueByName("Autoblock Mode").equals("None");
   }

   @Override
   public boolean method_42003() {
      return this.method_42015() && this.method_11555();
   }

   public void method_11542(class_1393 var1, String var2, boolean var3) {
      double var6 = !var2.equals("Hypixel") ? 0.0 : 1.0E-14;
      boolean var8 = true;
      if (this.field_12553 == 0 && this.field_12545 >= 1 && StepModule.field_20352 > 1) {
         if (this.field_12561.method_40089(this.field_12546)) {
            this.field_12553 = 1;
            var8 = var3;
            var6 = !var2.equals("Cubecraft") ? 0.0626 : class_8865.method_40786() / 10.0;
            this.field_12550 = new double[]{var1.method_6450(), var1.method_6454() + var6, var1.method_6438()};
         }
      } else if (this.field_12553 == 1) {
         this.field_12553 = 0;
         var8 = false;
         if (var2.equals("Hypixel") && this.field_12550 != null && client.thePlayer.method_37098().field_7333 < 0.0) {
            client.method_8614().method_4813(new class_9515(this.field_12550[0], this.field_12550[1], this.field_12550[2], false));
            this.field_12550 = null;
         }
      }

      boolean var9 = !JesusModule.method_32081() && (client.thePlayer.field_41726 || class_314.method_1413(client.thePlayer, 0.001F));
      if (!var9) {
         this.field_12545 = 0;
         this.field_12553 = 0;
      } else {
         this.field_12545++;
         if ((
               !SigmaMainClass.getInstance().getModuleManager().getModuleByClass(SpeedModule.class).method_42015()
                  || SigmaMainClass.getInstance().getModuleManager().getModuleByClass(SpeedModule.class).getStringValueByName("Type").equalsIgnoreCase("Cubecraft")
                  || SigmaMainClass.getInstance().getModuleManager().getModuleByClass(SpeedModule.class).getStringValueByName("Type").equalsIgnoreCase("Vanilla")
            )
            && client.thePlayer.field_41774
            && var9
            && !client.thePlayer.field_29654
            && !client.thePlayer.method_37285()
            && !client.gameOptions.keyJump.isKeyDown()) {
            if (!(var6 > 0.001)) {
               field_12548 = false;
            } else {
               field_12548 = true;
            }

            var1.method_6455(client.thePlayer.method_37309() + var6);
            var1.method_6451(var8);
         }
      }
   }

   private Entity method_11557(List<class_3357> var1) {
      var1 = this.field_12561.method_40100(var1);
      return !var1.isEmpty() && ((class_3357)var1.get(0)).method_15377().method_37175(client.thePlayer) <= this.getFloatValueByName("Block Range")
         ? ((class_3357)var1.get(0)).method_15377()
         : null;
   }

   private void method_11546() {
      float var3 = this.getFloatValueByName("Block Range");
      float var4 = this.getFloatValueByName("Range");
      String var5 = this.getStringValueByName("Mode");
      List var6 = this.field_12561.method_40091(Math.max(var3, var4));
      var6 = this.field_12561.method_40100(var6);
      if (this.field_12567 == null) {
         this.onEnable();
      }

      if (var6 != null && var6.size() != 0 && !client.gameOptions.keyAttack.isPressed()) {
         field_12558 = this.method_11557(var6);
         var6 = this.field_12561.method_40091(var4);
         if (var5.equals("Single") || var5.equals("Multi")) {
            var6 = this.field_12561.method_40100(var6);
         }

         if (var6.size() == 0) {
            field_12556 = null;
            this.field_12560.clear();
            this.field_12546 = (int)this.field_12561.method_40095(0);
            this.field_12553 = 0;
            field_12548 = false;
            this.field_12567.field_10069 = client.thePlayer.field_41701;
            this.field_12567.field_10067 = client.thePlayer.field_41755;
            field_12563.field_10069 = this.field_12567.field_10069;
            field_12563.field_10067 = this.field_12567.field_10067;
            this.field_12562 = -1.0F;
            this.field_12549 = Math.random();
            this.field_12552 = -1;
         } else {
            if (this.field_12562 == -1.0F) {
               float var7 = class_7211.method_33015(class_314.method_1429(((class_3357)var6.get(0)).method_15377())).field_10069;
               float var8 = Math.abs(class_314.method_1422(var7, field_12563.field_10069));
               this.field_12547 = var8 * 1.95F / 50.0F;
               this.field_12562++;
               this.field_12549 = Math.random();
            }

            this.field_12560 = var6;
            float var12 = class_7211.method_33015(class_314.method_1429(this.field_12560.get(0).method_15377())).field_10069;
            if (!this.field_12560.isEmpty() & !var5.equals("Switch")) {
               if (field_12556 != null && field_12556.method_15377() != this.field_12560.get(0).method_15377()) {
                  float var13 = Math.abs(class_314.method_1422(var12, field_12563.field_10069));
                  this.field_12547 = var13 * 1.95F / 50.0F;
                  this.field_12549 = Math.random();
               }

               field_12556 = this.field_12560.get(0);
            }

            if (!var5.equals("Switch")) {
               if (!var5.equals("Multi2")) {
                  if (var5.equals("Single")
                     && !this.field_12560.isEmpty()
                     && (field_12556 == null || field_12556.method_15377() != this.field_12560.get(0).method_15377())) {
                     field_12556 = this.field_12560.get(0);
                  }
               } else {
                  if (this.field_12570 >= this.field_12560.size()) {
                     this.field_12570 = 0;
                  }

                  field_12556 = this.field_12560.get(this.field_12570);
               }
            } else if ((
                  field_12556 == null
                     || field_12556.method_15378() == null
                     || field_12556.method_15375()
                     || !this.field_12560.contains(field_12556)
                     || client.thePlayer.method_37175(field_12556.method_15377()) > var4
               )
               && this.field_12560.size() > 0) {
               if (this.field_12570 + 1 < this.field_12560.size()) {
                  if (field_12556 != null && !SigmaMainClass.getInstance().method_3307().method_14469(this.field_12560.get(this.field_12570).method_15377())) {
                     this.field_12570++;
                  }
               } else {
                  this.field_12570 = 0;
               }

               class_1343 var14 = class_314.method_1429(this.field_12560.get(this.field_12570).method_15377());
               float var9 = Math.abs(class_314.method_1422(class_7211.method_33015(var14).field_10069, field_12563.field_10069));
               this.field_12547 = var9 * 1.95F / 50.0F;
               this.field_12549 = Math.random();
               field_12556 = new class_3357(
                  this.field_12560.get(this.field_12570).method_15377(), new class_8594(!this.getStringValueByName("Rotation Mode").equals("NCP") ? 500L : 270L)
               );
            }

            if (this.field_12570 >= this.field_12560.size()) {
               this.field_12570 = 0;
            }

            if (!var5.equals("Multi")) {
               this.field_12560.clear();
               this.field_12560.add(field_12556);
            }
         }
      } else {
         field_12556 = null;
         field_12558 = null;
         if (this.field_12560 != null) {
            this.field_12560.clear();
         }

         this.field_12546 = (int)this.field_12561.method_40095(0);
         this.field_12553 = 0;
         field_12548 = false;
         this.field_12567.field_10069 = client.thePlayer.field_41701;
         this.field_12567.field_10067 = client.thePlayer.field_41755;
         field_12563.field_10069 = this.field_12567.field_10069;
         field_12563.field_10067 = this.field_12567.field_10067;
         this.field_12562 = -1.0F;
         this.field_12549 = Math.random();
         this.field_12552 = -1;
      }
   }

   private void method_11545() {
      Entity var3 = field_12556.method_15377();
      class_1988 var4 = class_7211.method_33010(var3, !this.getBooleanValueByName("Through walls"));
      float var5 = class_7211.method_33009(this.field_12567.field_10069, var4.field_10069);
      float var6 = var4.field_10067 - this.field_12567.field_10067;
      String var7 = this.getStringValueByName("Rotation Mode");
      switch (var7) {
         case "Test":
            this.field_12569.field_10069 = this.field_12567.field_10069;
            this.field_12569.field_10067 = this.field_12567.field_10067;
            if (Math.abs(var5) > 80.0F) {
               float var9 = (float)this.method_11543(-10.2, 10.2);
               float var30 = var5 * var5 * 1.13F / 2.0F + var9;
               this.field_12567.field_10069 += var30;
               this.field_12566 = var30;
            } else if (Math.abs(var5) > 30.0F) {
               float var26 = (float)this.method_11543(-10.2, 10.2);
               float var31 = var5 * 1.03F / 2.0F + var26;
               this.field_12567.field_10069 += var31;
               this.field_12566 = var31;
            } else if (Math.abs(var5) > 10.0F) {
               Entity var27 = class_314.method_1458(
                  this.field_12567.field_10067, this.field_12567.field_10069, this.getFloatValueByName("Range"), (double)this.getFloatValueByName("Hit box expand")
               );
               double var11 = var27 == null ? 13.4 : 1.4;
               this.field_12566 = (float)((double)this.field_12566 * 0.5296666666666666);
               if (Math.abs(var5) < 20.0F) {
                  this.field_12566 = var5 * 0.5F;
               }

               this.field_12567.field_10069 = this.field_12567.field_10069 + var5 + this.field_12566 + (float)this.method_11543(-var11, var11);
            } else {
               this.field_12566 = (float)((double)this.field_12566 * 0.05);
               double var13 = 0.0;
               this.field_12567.field_10069 = this.field_12567.field_10069 + this.field_12566 + (float)this.method_11543(-var13, var13);
            }

            if (client.thePlayer.field_41697 % 5 == 0) {
               double var32 = 10.0;
               this.field_12567.field_10069 = this.field_12567.field_10069
                  + (float)this.method_11543(-var32, var32) / (client.thePlayer.method_37175(var3) + 1.0F);
               this.field_12567.field_10067 = this.field_12567.field_10067
                  + (float)this.method_11543(-var32, var32) / (client.thePlayer.method_37175(var3) + 1.0F);
            }

            if (Math.abs(var6) > 10.0F) {
               this.field_12567.field_10067 = (float)((double)this.field_12567.field_10067 + (double)var6 * 0.81 + this.method_11543(-2.0, 2.0));
            }

            Entity var28 = class_314.method_1458(
               this.field_12569.field_10067, this.field_12569.field_10069, this.getFloatValueByName("Range"), (double)this.getFloatValueByName("Hit box expand")
            );
            if (var28 != null && (double)this.field_12559 > this.method_11543(2.0, 5.0)) {
               this.field_12559 = 0;
               class_314.method_1431(var28, true);
            }
            break;
         case "NCP":
            this.field_12569.field_10069 = this.field_12567.field_10069;
            this.field_12569.field_10067 = this.field_12567.field_10067;
            this.field_12567 = var4;
            break;
         case "AAC":
            if (!class_7211.method_32997(
               new class_1343(var3.method_37302(), var3.method_37309() - 1.6 - this.field_12549 + (double)var3.method_37277(), var3.method_37156())
            )) {
            }

            float var29 = this.field_12562 / Math.max(1.0F, this.field_12547);
            double var33 = var3.method_37302() - var3.field_41754;
            double var34 = var3.method_37156() - var3.field_41724;
            float var35 = (float)Math.sqrt(var33 * var33 + var34 * var34);
            float var36 = class_5181.method_23766(var29, 0.57, -0.135, 0.095, -0.3);
            float var37 = Math.min(1.0F, class_5181.method_23766(var29, 0.57, -0.135, 0.095, -0.3));
            if (this.field_12564) {
               var36 = class_5181.method_23766(var29, 0.18, 0.13, 1.0, 1.046);
               var37 = Math.min(1.0F, class_5181.method_23766(var29, 0.18, 0.13, 1.0, 1.04));
            }

            float var38 = class_314.method_1422(field_12563.field_10069, var4.field_10069);
            float var39 = var4.field_10067 - field_12563.field_10067;
            this.field_12569.field_10069 = this.field_12567.field_10069;
            this.field_12569.field_10067 = this.field_12567.field_10067;
            this.field_12567.field_10069 = field_12563.field_10069 + var36 * var38;
            this.field_12567.field_10067 = (field_12563.field_10067 + var37 * var39) % 90.0F;
            if (var29 == 0.0F || var29 >= 1.0F || (double)var35 > 0.1 && this.field_12547 < 4.0F) {
               float var41 = Math.abs(class_314.method_1422(var4.field_10069, field_12563.field_10069));
               this.field_12547 = (float)Math.round(var41 * 1.8F / 50.0F);
               if (this.field_12547 <= 1.0F && Math.abs(class_314.method_1422(var4.field_10069, this.field_12567.field_10069)) > 10.0F) {
               }

               this.field_12562 = 0.0F;
               if (client.field_9662 == null && var29 != 1.0F) {
                  this.field_12549 = Math.random() * 0.5 + 0.25;
               }

               field_12563.field_10069 = this.field_12567.field_10069;
               field_12563.field_10067 = this.field_12567.field_10067;
            }
            break;
         case "Smooth":
            this.field_12569.field_10069 = this.field_12567.field_10069;
            this.field_12569.field_10067 = this.field_12567.field_10067;
            this.field_12567.field_10069 = (float)((double)this.field_12567.field_10069 + (double)(var5 * 2.0F) / 5.0);
            this.field_12567.field_10067 = (float)((double)this.field_12567.field_10067 + (double)(var6 * 2.0F) / 5.0);
            break;
         case "None":
            this.field_12569.field_10069 = this.field_12567.field_10069;
            this.field_12569.field_10067 = this.field_12567.field_10067;
            this.field_12567.field_10069 = client.thePlayer.field_41701;
            this.field_12567.field_10067 = client.thePlayer.field_41755;
            break;
         case "LockView":
            this.field_12569.field_10069 = this.field_12567.field_10069;
            this.field_12569.field_10067 = this.field_12567.field_10067;
            class_5631 var40 = class_314.method_1410(
               var3, this.field_12567.field_10069, this.field_12567.field_10067, var0 -> true, (double)this.getFloatValueByName("Range")
            );
            if (var40 == null || var40.method_25524() != var3) {
               this.field_12567 = var4;
            }
            break;
         case "Test2":
            class_5631 var24 = class_314.method_1410(
               var3, this.field_12567.field_10069, this.field_12567.field_10067, var0 -> true, (double)this.getFloatValueByName("Range")
            );
            if (var24 != null && var24.method_25524() == var3) {
               this.field_12569.field_10069 = this.field_12567.field_10069;
               this.field_12569.field_10067 = this.field_12567.field_10067;
               this.field_12567.field_10069 = (float)((double)this.field_12567.field_10069 + (Math.random() - 0.5) * 2.0 + (double)(var5 * 1.0F / 10.0F));
               this.field_12567.field_10067 = (float)((double)this.field_12567.field_10067 + (Math.random() - 0.5) * 2.0 + (double)(var6 * 1.0F / 10.0F));
               this.field_12562 = 0.0F;
               this.field_12547 = 3.0F;
               return;
            }

            float var10 = this.field_12562 / Math.max(1.0F, this.field_12547);
            double var15 = var3.method_37302() - var3.field_41754;
            double var17 = var3.method_37156() - var3.field_41724;
            float var19 = (float)Math.sqrt(var15 * var15 + var17 * var17);
            float var20 = class_5181.method_23766(var10, 0.57, -0.135, 0.095, -0.3);
            float var21 = Math.min(1.0F, class_5181.method_23766(var10, 0.57, -0.135, 0.095, -0.3));
            float var22 = class_314.method_1422(field_12563.field_10069, var4.field_10069);
            float var23 = var4.field_10067 - field_12563.field_10067;
            this.field_12569.field_10069 = this.field_12567.field_10069;
            this.field_12569.field_10067 = this.field_12567.field_10067;
            this.field_12567.field_10069 = field_12563.field_10069 + var20 * var22;
            this.field_12567.field_10067 = (field_12563.field_10067 + var21 * var23) % 90.0F;
            if (var10 == 0.0F || var10 >= 1.0F || (double)var19 > 0.1 && this.field_12547 < 4.0F) {
               float var25 = Math.abs(class_314.method_1422(var4.field_10069, field_12563.field_10069));
               this.field_12547 = (float)Math.round(var25 * 1.8F / 50.0F);
               if (this.field_12547 < 3.0F) {
                  this.field_12547 = 3.0F;
               }

               this.field_12562 = 0.0F;
               if (client.field_9662 == null && var10 != 1.0F) {
                  this.field_12549 = Math.random() * 0.5 + 0.25;
               }

               field_12563.field_10069 = this.field_12567.field_10069;
               field_12563.field_10067 = this.field_12567.field_10067;
            }
      }
   }

   private double method_11543(double var1, double var3) {
      return var1 + Math.random() * (var3 - var1);
   }
}
