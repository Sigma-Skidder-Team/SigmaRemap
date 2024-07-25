package remapped;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class class_7401 extends class_9128 {
   private int field_37778;
   private boolean field_37780;
   private float field_37779;
   private List<List<class_4714>> field_37777;
   private Thread field_37781;

   public class_7401() {
      super(class_5664.field_28714, "InfiniteAura", "Basically infinite aura");
      this.method_42010(new class_2748<Float>("Range", "Range value", 4.0F, Float.class, 8.0F, 120.0F, 1.0F));
      this.method_42010(new class_2748<Float>("CPS", "CPS value", 8.0F, Float.class, 1.0F, 20.0F, 1.0F));
      this.method_42010(new class_2748<Float>("Targets", "Number of targets", 4.0F, Float.class, 1.0F, 10.0F, 1.0F));
      this.method_42010(new class_8563("Players", "Hit players", true));
      this.method_42010(new class_8563("Animals/Monsters", "Hit animals and monsters", false));
      this.method_42010(new class_8563("Anti-Bot", "Doesn't hit bots", true));
      this.method_42010(new class_8563("Invisible", "Hit invisible entites", true));
      this.method_42010(new class_8563("No Swing", "Doesn't swing", false));
      this.field_37777 = new ArrayList<List<class_4714>>();
   }

   @Override
   public void method_42006() {
      this.field_37780 = false;
      this.field_37778 = (int)(20.0F / this.method_42017().method_42002("CPS"));
      this.field_37779 = (float)this.field_37778;
   }

   @Override
   public void method_42020() {
      this.field_37777.clear();
      this.field_37780 = false;
      this.field_37781 = null;
   }

   @class_9148
   @class_7664
   public void method_33698(class_5596 var1) {
      if (this.method_42015()) {
         List var4 = this.method_33696((float)((int)this.method_42002("Range")));
         if (var4 != null && var4.size() != 0) {
            if (this.field_37779 < 1.0F) {
               this.field_37779 = this.field_37779 + 20.0F / this.method_42017().method_42002("CPS");
            }

            this.field_37778++;
            if (this.field_37778 >= (int)this.field_37779 && this.field_37781 == null) {
               this.field_37778 = 0;
               this.field_37777.clear();
               this.field_37779 = this.field_37779 - (float)((int)this.field_37779);
               Object var5 = field_46692.field_9632.method_37243() == null ? field_46692.field_9632 : field_46692.field_9632.method_37243();
               this.field_37781 = new Thread(() -> {
                  try {
                     int var5x = 0;

                     for (class_3357 var7 : var4) {
                        class_8145 var8 = var7.method_15377();
                        if ((int)this.method_42002("Targets") < ++var5x) {
                           break;
                        }

                        class_4714 var9 = new class_4714(var5.method_37302(), var5.method_37309(), var5.method_37156());
                        class_4714 var10 = new class_4714(var8.method_37302(), var8.method_37309(), var8.method_37156());
                        ArrayList var11 = class_6306.method_28770(var10, var9);
                        this.field_37777.add(var11);
                        Collections.reverse(var11);
                        this.method_33701(var11, SigmaMainClass.method_3328().method_3298().method_847(class_9801.class).method_42015());
                        class_314.method_1431(var8, !this.method_42007("No Swing"));
                        Collections.reverse(var11);
                        this.method_33701(var11, false);
                     }
                  } catch (Exception var12) {
                     this.field_37781 = null;
                  }

                  this.field_37781 = null;
               });
               this.field_37781.start();
            }
         } else {
            this.field_37780 = false;
            this.field_37777.clear();
         }
      }
   }

   public void method_33701(List<class_4714> var1, boolean var2) {
      class_8145 var5 = field_46692.field_9632.method_37243();
      class_4714 var6 = null;

      for (class_4714 var8 : var1) {
         var6 = var8;
         if (var5 == null) {
            field_46692.method_8614().method_4813(new class_9515(var8.method_21803(), var8.method_21801(), var8.method_21799(), true));
         } else {
            var5.field_41736.field_7336 = var8.method_21803() + 0.5;
            var5.field_41736.field_7333 = var8.method_21801();
            var5.field_41736.field_7334 = var8.method_21799() + 0.5;
            field_46692.method_8614().method_4813(new class_8125(false, false));
            field_46692.method_8614().method_4813(new class_3616(field_46692.field_9632.field_41701, field_46692.field_9632.field_41755, false));
            field_46692.method_8614().method_4813(new class_758(0.0F, 1.0F, false, false));
            class_9149 var9 = new class_9149(field_46692.field_9601, var8.method_21803() + 0.5, var8.method_21801(), var8.method_21799() + 0.5);
            var9.field_41701 = var5.field_41701;
            var9.field_41755 = var5.field_41755;
            field_46692.method_8614().method_4813(new class_4148(var9));
         }
      }

      if (var2 && var6 != null) {
         field_46692.method_8614().method_4813(new class_9515(var6.method_21803(), var6.method_21801() + 1.0E-14, var6.method_21799(), false));
         field_46692.method_8614().method_4813(new class_9515(var6.method_21803(), var6.method_21801(), var6.method_21799(), false));
      }
   }

   @class_9148
   public void method_33699(class_3368 var1) {
      if (this.method_42015() && this.field_37777 != null && this.field_37777.size() != 0) {
         for (List var5 : this.field_37777) {
            GL11.glPushMatrix();
            GL11.glEnable(2848);
            GL11.glBlendFunc(770, 771);
            GL11.glEnable(3042);
            GL11.glDisable(3553);
            GL11.glDisable(2929);
            GL11.glEnable(32925);
            GL11.glLineWidth(1.4F);
            GL11.glColor4d(1.0, 1.0, 1.0, 1.0);
            GL11.glBegin(3);

            for (class_4714 var7 : var5) {
               GL11.glVertex3d(
                  var7.method_21803() - field_46692.field_9590.method_35949().method_41627().method_61(),
                  var7.method_21801() - field_46692.field_9590.method_35949().method_41627().method_60(),
                  var7.method_21799() - field_46692.field_9590.method_35949().method_41627().method_62()
               );
            }

            GL11.glEnd();
            GL11.glPushMatrix();
            GL11.glTranslated(
               field_46692.field_9590.method_35949().method_41627().method_61(),
               field_46692.field_9590.method_35949().method_41627().method_60(),
               field_46692.field_9590.method_35949().method_41627().method_62()
            );
            GL11.glPopMatrix();
            GL11.glDisable(3042);
            GL11.glEnable(3553);
            GL11.glEnable(2929);
            GL11.glDisable(32925);
            GL11.glDisable(2848);
            GL11.glPopMatrix();
         }
      }
   }

   public List<class_3357> method_33696(float var1) {
      ArrayList var4 = new ArrayList();

      for (class_8145 var6 : class_314.method_1440()) {
         var4.add(new class_3357(var6));
      }

      Iterator var7 = var4.iterator();

      while (var7.hasNext()) {
         class_8145 var8 = ((class_3357)var7.next()).method_15377();
         if (var8 != field_46692.field_9632) {
            if (!SigmaMainClass.method_3328().method_3307().method_14460(var8)) {
               if (var8 instanceof class_5834) {
                  if (((class_5834)var8).method_26551() != 0.0F) {
                     if (!(field_46692.field_9632.method_37175(var8) > var1)) {
                        if (field_46692.field_9632.method_26608((class_5834)var8)) {
                           if (!(var8 instanceof class_9399)) {
                              if (!this.method_42007("Players") && var8 instanceof class_704) {
                                 var7.remove();
                              } else if (var8 instanceof class_704 && SigmaMainClass.method_3328().method_3331().method_20495(var8)) {
                                 var7.remove();
                              } else if (!this.method_42007("Invisible") && var8.method_37109()) {
                                 var7.remove();
                              } else if (!this.method_42007("Animals/Monsters") && !(var8 instanceof class_704)) {
                                 var7.remove();
                              } else if (field_46692.field_9632.method_37243() != null && field_46692.field_9632.method_37243().equals(var8)) {
                                 var7.remove();
                              } else if (!var8.method_37367()) {
                                 if (var8 instanceof class_704
                                    && class_5876.method_26760((class_704)var8)
                                    && SigmaMainClass.method_3328().method_3298().method_847(class_3595.class).method_42015()) {
                                    var7.remove();
                                 }
                              } else {
                                 var7.remove();
                              }
                           } else {
                              var7.remove();
                           }
                        } else {
                           var7.remove();
                        }
                     } else {
                        var7.remove();
                     }
                  } else {
                     var7.remove();
                  }
               } else {
                  var7.remove();
               }
            } else {
               var7.remove();
            }
         } else {
            var7.remove();
         }
      }

      Collections.sort(var4, new class_3658(this));
      return var4;
   }

   public boolean method_33702() {
      return this.field_37780
         && MinecraftClient.getInstance().field_9632.method_26446() != null
         && MinecraftClient.getInstance().field_9632.method_26446().method_27960() instanceof class_2235;
   }

   @Override
   public boolean method_42003() {
      return this.method_42015() && this.method_33702() && SigmaMainClass.method_3328().method_3310().method_25294();
   }
}
