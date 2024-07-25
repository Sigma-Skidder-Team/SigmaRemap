package remapped;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.lwjgl.opengl.GL11;

public class class_4972 extends Module {
   public List<class_522> field_25751 = new ArrayList<class_522>();
   public Set<class_2034> field_25748 = new HashSet<class_2034>();
   public class_9806 field_25755;
   public Thread field_25750;
   private class_1331 field_25747;
   public int field_25749;
   public List<class_7047> field_25752 = new ArrayList<class_7047>();
   public List<class_7047> field_25753 = new ArrayList<class_7047>();

   public class_4972() {
      super(class_5664.field_28718, "AutoMiner", "Automatically mines blocks");
   }

   @class_9148
   public void method_22860(class_139 var1) {
      if (this.method_42015()) {
         if (var1.method_557() instanceof class_4267) {
            class_4267 var4 = (class_4267)var1.method_557();
            this.method_22854(field_46692.field_9601.method_29542(var4.method_19867()).method_27352());
         }

         if (var1.method_557() instanceof class_4467) {
            class_4467 var5 = (class_4467)var1.method_557();
            this.method_22854(new class_2034(var5.field_21788.field_13231, var5.field_21788.field_13229));
         }

         if (var1.method_557() instanceof class_4808 && MinecraftClient.getInstance().field_9601 != null) {
            class_4808 var6 = (class_4808)var1.method_557();
            this.method_22854(new class_2034(var6.method_22149(), var6.method_22151()));
         }
      }
   }

   public void method_22854(class_2034 var1) {
      for (class_522 var5 : this.field_25751) {
         if (var5.method_2541(var1)) {
            this.field_25748.add(var5.method_2544());
         }
      }
   }

   @class_9148
   public void method_22855(class_717 var1) {
      this.field_25751.clear();
      this.field_25748.clear();
   }

   public List<class_1331> method_22864(class_2034 var1) {
      ArrayList var4 = new ArrayList();
      int var5 = var1.field_10328 * 16;
      int var6 = var1.field_10327 * 16;
      byte var7 = 1;
      int var8 = var5 + 15;
      int var9 = var6 + 15;
      short var10 = 255;

      for (float var11 = (float)var7; var11 <= (float)var10 && !(var11 > 100.0F); var11++) {
         for (float var12 = (float)var5; var12 <= (float)var8; var12++) {
            for (float var13 = (float)var6; var13 <= (float)var9; var13++) {
               class_1331 var14 = new class_1331((double)var12, (double)var11, (double)var13);
               if (field_46692.field_9601.method_28262(var14).method_8360() == class_4783.field_23681) {
                  var4.add(var14);
               }
            }
         }
      }

      return var4;
   }

   @class_9148
   public void method_22861(class_5596 var1) {
      if (this.method_42015()) {
         if (field_46692.field_9632.field_41697 < 20) {
            this.field_25751.clear();
         } else {
            int var4 = (int)this.method_42002("Chunk Range");
            ArrayList var5 = new ArrayList();

            for (int var6 = -4; var6 < 4; var6++) {
               for (int var7 = -4; var7 < 4; var7++) {
                  var5.add(new class_2034(field_46692.field_9632.field_41742 + var6, field_46692.field_9632.field_41714 + var7));
               }
            }

            Iterator var12 = this.field_25751.iterator();

            while (var12.hasNext()) {
               class_522 var13 = (class_522)var12.next();
               if (var13.method_2543(new class_2034(field_46692.field_9632.field_41742, field_46692.field_9632.field_41714)) > 7
                  || this.field_25748.contains(var13.method_2544())) {
                  var12.remove();
               }
            }

            this.field_25748.clear();
            boolean var14 = false;

            label90:
            for (class_2034 var9 : var5) {
               for (class_522 var11 : this.field_25751) {
                  if (var11.method_2541(var9)) {
                     continue label90;
                  }
               }

               this.field_25751.add(new class_522(var9.field_10328, var9.field_10327, this.method_22864(var9)));
               var14 = true;
               break;
            }

            if (!var14 && field_46692.field_9632.field_41726 && !SigmaMainClass.method_3328().method_3301().method_27149() && this.field_25750 == null) {
               List var15 = this.method_22863();
               SigmaMainClass.method_3328().method_3335().method_27841(new class_8235("AutoMiner", "Computing...", class_2209.field_10993));
               this.field_25750 = new Thread(
                  () -> {
                     boolean var4x = false;

                     for (class_1331 var6x : var15) {
                        try {
                           this.field_25755 = new class_9806();
                           class_8670 var7x = new class_8670(new class_7047(field_46692.field_9632.method_37075()));
                           class_8670 var8 = new class_8670(new class_7047(var6x));
                           double var9x = (double)var8.field_44468.method_32372(var7x.field_44468);
                           int var11x = (int)Math.min(30000.0, 5000.0 + var9x * 100.0);
                           class_1623 var12x = new class_1623(var7x, var8);
                           var12x.field_8448 = var11x;
                           var12x.field_8450 = true;
                           var12x.field_8451 = 14;
                           var12x.field_8453 = true;
                           List var13x = this.field_25755.method_45226(var12x);
                           if (var13x.size() > 1) {
                              SigmaMainClass.method_3328().method_3301().method_27153(var13x);
                              SigmaMainClass.method_3328()
                                 .method_3335()
                                 .method_27841(
                                    new class_8235(
                                       "AutoMiner",
                                       "Solved in " + var13x.size() + " steps! (" + this.field_25755.field_49718 + ":" + var11x + ")",
                                       class_2209.field_10993
                                    )
                                 );
                              var4x = true;
                              break;
                           }
                        } catch (Exception var15x) {
                           var15x.printStackTrace();
                        }
                     }

                     try {
                        if (!var4x) {
                           SigmaMainClass.method_3328()
                              .method_3335()
                              .method_27841(new class_8235("AutoMiner", "Could not fin any safe path. (" + var15.size() + ")", class_2209.field_10993));
                           Thread.sleep(1000L);
                        }
                     } catch (InterruptedException var14x) {
                     }

                     this.field_25750 = null;
                  }
               );
               this.field_25750.start();
            }

            if (this.method_42015() && this.field_25755 != null && this.field_25750 != null) {
               if (field_46692.field_9632.field_41697 % 20 == 0) {
                  this.field_25753 = this.field_25752;
                  this.field_25752 = this.method_22856();
               }

               SigmaMainClass.method_3328()
                  .method_3335()
                  .method_27841(new class_8235("AutoMiner", "Computing... (" + this.field_25755.field_49718 + ")", class_2209.field_10993));
            }
         }
      }
   }

   public class_1331 method_22859(float var1) {
      ArrayList var4 = new ArrayList();

      for (class_522 var6 : this.field_25751) {
         var4.addAll(var6.field_3185);
      }

      class_7494.method_34085(var4);
      return var4.size() <= 0 ? null : (class_1331)var4.get(0);
   }

   public List<class_1331> method_22863() {
      ArrayList var3 = new ArrayList();

      for (class_522 var5 : this.field_25751) {
         var3.addAll(var5.field_3185);
      }

      class_7494.method_34085(var3);
      if (var3.size() > 1) {
         ArrayList var10 = new ArrayList();
         var10.add(var3.get(0));

         for (class_1331 var6 : var3) {
            class_1331 var7 = (class_1331)var10.get(var10.size() - 1);
            double var8 = Math.sqrt(var6.method_12180(var7));
            if (var8 > 4.0 && !class_7047.method_32361(var6)) {
               var10.add(var6);
            }
         }

         return var10;
      } else {
         return var3;
      }
   }

   @Override
   public void method_42006() {
      if (this.field_25750 != null) {
         this.field_25750.interrupt();
      }

      this.field_25750 = null;
      this.field_25751.clear();
      this.field_25748.clear();
      SigmaMainClass.method_3328().method_3301().method_27144();
      SigmaMainClass.method_3328().method_3335().method_27841(new class_8235("AutoMiner", "Scanning Terrain..."));
   }

   @Override
   public void method_42020() {
      if (this.field_25750 != null) {
         this.field_25750.interrupt();
      }

      this.field_25750 = null;
      this.field_25751.clear();
      this.field_25748.clear();
      SigmaMainClass.method_3328().method_3301().method_27144();
   }

   private void method_22862() {
      Color[] var3 = new Color[]{
         new Color(136, 217, 72),
         new Color(124, 189, 72),
         new Color(103, 181, 75),
         new Color(136, 217, 72),
         new Color(124, 189, 72),
         new Color(103, 181, 75),
         new Color(136, 217, 72),
         new Color(103, 181, 75),
         null,
         null
      };

      for (byte var4 = 0; var4 <= 315; var4 += 45) {
         GL11.glPushMatrix();
         GL11.glRotatef((float)var4, 0.0F, 1.0F, 0.0F);
         int var5 = var4 / 45;
         this.method_22853((float)var3[var5].getRed() / 255.0F, (float)var3[var5].getGreen() / 255.0F, (float)var3[var5].getBlue() / 255.0F);
         GL11.glPopMatrix();
      }

      GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);

      for (byte var7 = 0; var7 <= 315; var7 += 45) {
         GL11.glPushMatrix();
         GL11.glRotatef((float)var7, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
         int var8 = var7 / 45;
         Color var6 = new Color(class_314.method_1401(var3[var8].getRGB(), 0.2F), false);
         this.method_22853((float)var6.getRed() / 255.0F, (float)var6.getGreen() / 255.0F, (float)var6.getBlue() / 255.0F);
         GL11.glPopMatrix();
      }
   }

   private void method_22853(float var1, float var2, float var3) {
      GL11.glColor3f(var1, var2, var3);
      GL11.glTranslatef(0.0F, 0.0F, 0.25F);
      GL11.glNormal3f(0.0F, 0.0F, 1.0F);
      GL11.glRotated(-30.0, 1.0, 0.0, 0.0);
      GL11.glBegin(6);
      GL11.glVertex2f(0.0F, 0.5F);
      GL11.glVertex2f(-0.105F, 0.0F);
      GL11.glVertex2f(0.105F, 0.0F);
      GL11.glEnd();
   }

   @class_9148
   public void method_22858(class_3368 var1) {
      if (this.method_42015()) {
         this.method_22857();
      }
   }

   private List<class_7047> method_22856() {
      ArrayList var3 = new ArrayList();

      for (class_8670 var4 = this.field_25755.field_49716; var4 != null; var4 = var4.field_44476) {
         var3.add(var4.field_44468);
      }

      Collections.reverse(var3);
      return var3;
   }

   public void method_22857() {
      if (this.method_42015() && this.field_25755 != null && this.field_25750 != null) {
         GL11.glPushMatrix();
         GL11.glEnable(2848);
         GL11.glBlendFunc(770, 771);
         GL11.glEnable(3042);
         GL11.glDisable(3553);
         GL11.glDisable(2929);
         GL11.glEnable(32925);
         GL11.glLineWidth(1.4F);
         GL11.glColor4d(1.0, 1.0, 1.0, 0.44F);
         GL11.glBegin(3);
         float var3 = Math.min(1.0F, ((float)(field_46692.field_9632.field_41697 % 20) + field_46692.field_9616.field_32600) / 20.0F);

         for (int var4 = 0; var4 < (int)((float)this.field_25752.size() * var3); var4++) {
            class_7047 var5 = this.field_25752.get(var4);
            class_7047 var6 = null;
            if (this.field_25753.size() - 1 >= var4) {
               var6 = this.field_25753.get(var4);
            } else {
               var6 = var5;
            }

            double var7 = var6.method_32381() + (var5.method_32381() - var6.method_32381());
            double var9 = var6.method_32375() + (var5.method_32375() - var6.method_32375());
            double var11 = var6.method_32382() + (var5.method_32382() - var6.method_32382());
            GL11.glVertex3d(
               var7 - field_46692.gameRenderer.method_35949().method_41627().method_61() + 0.5,
               var9 - field_46692.gameRenderer.method_35949().method_41627().method_60(),
               var11 - field_46692.gameRenderer.method_35949().method_41627().method_62() + 0.5
            );
         }

         GL11.glEnd();
         GL11.glPushMatrix();
         GL11.glTranslated(
            field_46692.gameRenderer.method_35949().method_41627().method_61(),
            field_46692.gameRenderer.method_35949().method_41627().method_60(),
            field_46692.gameRenderer.method_35949().method_41627().method_62()
         );
         GL11.glPopMatrix();
         GL11.glDisable(3042);
         GL11.glEnable(3553);
         GL11.glEnable(2929);
         GL11.glDisable(32925);
         GL11.glDisable(2848);
         GL11.glPopMatrix();
      } else {
         this.field_25752.clear();
      }
   }
}
