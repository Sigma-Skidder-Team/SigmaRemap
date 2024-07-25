package remapped;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import org.lwjgl.opengl.GL11;

public class class_9543 extends class_367 {
   private class_3223 field_48556 = new class_3223();
   private static float field_48553;
   private static float field_48549;
   private static boolean field_48558;
   private class_1331 field_48552;
   private Entity field_48550;
   private static boolean field_48555 = false;
   private Runnable field_48554 = null;
   private int field_48557;
   private List<class_1331> field_48551 = new ArrayList<class_1331>();

   public class_9543() {
      super("AutoCrystal", "Automatically detonates crystals", class_5664.field_28718);
      this.method_42010(new class_2826("Mode", "Mode", 0, "Single", "Switch"));
      this.method_42010(new class_2748<Float>("Range", "Range value", 4.0F, Float.class, 2.8F, 8.0F, 0.01F));
      this.method_42010(new class_2748<Float>("CPS", "Click per seconds", 9.0F, Float.class, 1.0F, 20.0F, 1.0F));
      this.method_42010(new class_8563("Players", "Hit players", true));
      this.method_42010(new class_8563("Animals/Monsters", "Hit animals and monsters", false));
      this.method_42010(new class_8563("Invisible", "Hit invisible entites", true));
   }

   @Override
   public void method_42006() {
      this.field_48556.method_14773();
      this.field_48556.method_14776();
      this.field_48554 = null;
   }

   @class_9148
   public void method_44021(class_1393 var1) {
      if (!var1.method_6449()) {
         if (this.field_48554 != null) {
            this.field_48554.run();
            this.field_48554 = null;
         }
      } else {
         this.field_48557++;
         List var4 = this.method_44031(20.0F);
         if (var4 == null || var4.isEmpty()) {
            this.field_48550 = null;
            return;
         }

         this.field_48550 = (Entity)var4.get(0);
         if ((float)this.field_48557 >= 20.0F / this.method_42002("CPS")) {
            class_3577 var5 = field_46692.field_9601
               .<Entity>method_25869(
                  Entity.class, this.field_48550.field_41712.method_18928(2.0, 4.0, 2.0).method_18928(-2.0, -3.0, -2.0), var0 -> var0 instanceof class_3577
               )
               .stream()
               .<class_3577>map(var0 -> (class_3577)var0)
               .filter(var0 -> var0.method_37175(field_46692.field_9632) < 6.0F)
               .filter(var1x -> (double)var1x.method_37175(this.field_48550) < 3.6)
               .min(Comparator.comparing(var1x -> method_44033(var1x.method_37302(), var1x.method_37309(), var1x.method_37156(), this.field_48550)))
               .orElse(null);
            if (var5 != null) {
               class_1988 var9 = class_7211.method_33015(var5.field_41736);
               var1.method_6441(var9.field_10069);
               var1.method_6448(var9.field_10067);
               this.field_48557 = 0;
               this.field_48554 = new class_3255(this, var5);
               return;
            }
         }

         int var8 = this.method_44018();
         if (var8 < 0) {
            return;
         }

         this.field_48551 = this.method_44022();
         this.field_48551
            .sort(Comparator.comparing(var1x -> this.field_48550.method_37273((double)var1x.field_13231, (double)var1x.field_13230, (double)var1x.field_13229)));
         if (this.field_48551 != null && !this.field_48551.isEmpty()) {
            class_1331 var6 = this.field_48551
               .stream()
               .max(
                  Comparator.comparing(
                     var1x -> method_44033((double)var1x.method_12173(), (double)var1x.method_12165(), (double)var1x.method_12185(), this.field_48550)
                  )
               )
               .orElse(null);
            if (var6 != null) {
               class_1988 var7 = class_7211.method_33015(
                  new class_1343((double)var6.field_13231 + 0.5, (double)var6.field_13230 + 0.5, (double)var6.field_13229 + 0.5)
               );
               var1.method_6441(var7.field_10069);
               var1.method_6448(var7.field_10067);
               this.field_48554 = new class_7589(this, var6, var8);
            }
         }
      }
   }

   @class_9148
   public void method_44030(class_3368 var1) {
      int var4 = class_314.method_1444(100000000, 0.2F);
      GL11.glPushMatrix();
      GL11.glDisable(2929);

      for (class_1331 var6 : this.field_48551) {
         double var7 = (double)var6.method_12173() - field_46692.gameRenderer.method_35949().method_41627().method_61();
         double var9 = (double)var6.method_12165() - field_46692.gameRenderer.method_35949().method_41627().method_60();
         double var11 = (double)var6.method_12185() - field_46692.gameRenderer.method_35949().method_41627().method_62();
         class_8194 var13 = new class_8194(var7, var9 + 1.0, var11, var7 + 1.0, var9 + 1.0, var11 + 1.0);
         class_73.method_83(var13, var4);
      }

      var4 = class_314.method_1444(9000000, 1.0F);
      if (this.field_48550 != null) {
         double var14 = this.field_48550.method_37302() - field_46692.gameRenderer.method_35949().method_41627().method_61();
         double var19 = this.field_48550.method_37309() - field_46692.gameRenderer.method_35949().method_41627().method_60() + 0.5;
         double var20 = this.field_48550.method_37156() - field_46692.gameRenderer.method_35949().method_41627().method_62();
         float var16 = 0.3F;
         class_8194 var17 = new class_8194(var14 - (double)var16, var19 + 0.9, var20 - (double)var16, var14 + (double)var16, var19 + 1.0, var20 + (double)var16);
         class_73.method_83(var17, var4);
      }

      GL11.glEnable(2929);
      GL11.glPopMatrix();
   }

   public static class_1331 method_44011() {
      return new class_1331(
         Math.floor(field_46692.field_9632.method_37302()),
         Math.floor(field_46692.field_9632.method_37309()),
         Math.floor(field_46692.field_9632.method_37156())
      );
   }

   private List<class_1331> method_44022() {
      class_2831 var3 = class_2831.method_12874();
      var3.addAll(this.method_44015(method_44011(), 6.0F, 6, false, true, 0).stream().filter(this::method_44012).collect(Collectors.toList()));
      return var3;
   }

   private boolean method_44012(class_1331 var1) {
      class_1331 var4 = var1.method_6104(0, 1, 0);
      class_1331 var5 = var1.method_6104(0, 2, 0);
      return (
            field_46692.field_9601.method_28262(var1).method_8360() == class_4783.field_23433
               || field_46692.field_9601.method_28262(var1).method_8360() == class_4783.field_23881
         )
         && field_46692.field_9601.method_28262(var4).method_8360() == class_4783.field_23184
         && field_46692.field_9601.method_28262(var5).method_8360() == class_4783.field_23184
         && field_46692.field_9601.<Entity>method_25868(Entity.class, new class_4092(var4)).isEmpty();
   }

   public List<class_1331> method_44015(class_1331 var1, float var2, int var3, boolean var4, boolean var5, int var6) {
      ArrayList var9 = new ArrayList();
      int var10 = var1.method_12173();
      int var11 = var1.method_12165();
      int var12 = var1.method_12185();

      for (int var13 = var10 - (int)var2; (float)var13 <= (float)var10 + var2; var13++) {
         for (int var14 = var12 - (int)var2; (float)var14 <= (float)var12 + var2; var14++) {
            for (int var15 = !var5 ? var11 : var11 - (int)var2; (float)var15 < (!var5 ? (float)(var11 + var3) : (float)var11 + var2); var15++) {
               double var16 = (double)((var10 - var13) * (var10 - var13) + (var12 - var14) * (var12 - var14) + (!var5 ? 0 : (var11 - var15) * (var11 - var15)));
               if (var16 < (double)(var2 * var2) && (!var4 || !(var16 < (double)((var2 - 1.0F) * (var2 - 1.0F))))) {
                  class_1331 var18 = new class_1331(var13, var15 + var6, var14);
                  var9.add(var18);
               }
            }
         }
      }

      return var9;
   }

   public static float method_44033(double var0, double var2, double var4, Entity var6) {
      float var9 = 12.0F;
      double var10 = Math.sqrt(var6.method_37273(var0, var2, var4)) / (double)var9;
      class_1343 var12 = new class_1343(var0, var2, var4);
      double var13 = (double)class_2730.method_12265(var12, var6);
      double var15 = (1.0 - var10) * var13;
      float var17 = (float)((int)((var15 * var15 + var15) / 2.0 * 7.0 * (double)var9 + 1.0));
      double var18 = 1.0;
      if (var6 instanceof class_5834) {
         var18 = (double)method_44023(
            (class_5834)var6,
            method_44028(var17),
            new class_2730(field_46692.field_9601, null, null, null, var0, var2, var4, 6.0F, false, class_7298.field_37309)
         );
      }

      return (float)var18;
   }

   private static float method_44028(float var0) {
      int var3 = field_46692.field_9601.method_43370().method_2097();
      return var0 * (var3 != 0 ? (var3 != 2 ? (var3 != 1 ? 1.5F : 0.5F) : 1.0F) : 0.0F);
   }

   public static float method_44023(class_5834 var0, float var1, class_2730 var2) {
      if (!(var0 instanceof class_704)) {
         return class_6357.method_29129(var1, (float)var0.method_26565(), (float)var0.method_26575(class_7331.field_37472));
      } else {
         class_704 var5 = (class_704)var0;
         class_6199 var6 = class_6199.method_28350(var2);
         var1 = class_6357.method_29129(var1, (float)var5.method_26565(), (float)var5.method_26575(class_7331.field_37472));
         int var7 = class_2931.method_13427(var5.method_37262(), var6);
         float var8 = class_9299.method_42828((float)var7, 0.0F, 20.0F);
         var1 *= 1.0F - var8 / 25.0F;
         if (var0.method_26480(class_1425.method_6538(11))) {
            var1 -= var1 / 4.0F;
         }

         return Math.max(var1 - var5.method_26493(), 0.0F);
      }
   }

   private static void method_44027() {
      if (field_48558) {
         field_48553 = field_46692.field_9632.field_41701;
         field_48549 = field_46692.field_9632.field_41755;
         field_48558 = false;
      }
   }

   private void method_44017(class_1343 var1) {
      class_1988 var4 = class_7211.method_33015(var1);
      field_48553 = var4.field_10069;
      field_48549 = var4.field_10067;
      field_48558 = true;
   }

   public List<Entity> method_44031(float var1) {
      List var4 = class_314.method_1440();
      Iterator var5 = var4.iterator();

      while (var5.hasNext()) {
         Entity var6 = (Entity)var5.next();
         if (var6 != field_46692.field_9632) {
            if (!SigmaMainClass.method_3328().method_3307().method_14460(var6)) {
               if (var6 instanceof class_5834) {
                  if (((class_5834)var6).method_26551() != 0.0F) {
                     if (!(field_46692.field_9632.method_37175(var6) > var1)) {
                        if (field_46692.field_9632.method_26608((class_5834)var6)) {
                           if (!(var6 instanceof class_9399)) {
                              if (!this.method_42007("Players") && var6 instanceof class_704) {
                                 var5.remove();
                              } else if (var6 instanceof class_704 && SigmaMainClass.method_3328().method_3331().method_20495(var6)) {
                                 var5.remove();
                              } else if (!this.method_42007("Invisible") && var6.method_37109()) {
                                 var5.remove();
                              } else if (!this.method_42007("Animals/Monsters") && !(var6 instanceof class_704)) {
                                 var5.remove();
                              } else if (field_46692.field_9632.method_37243() != null && field_46692.field_9632.method_37243().equals(var6)) {
                                 var5.remove();
                              } else if (!var6.method_37367()) {
                                 if (var6 instanceof class_704
                                    && class_5876.method_26760((class_704)var6)
                                    && SigmaMainClass.method_3328().method_3298().method_847(class_3595.class).method_42015()) {
                                    var5.remove();
                                 }
                              } else {
                                 var5.remove();
                              }
                           } else {
                              var5.remove();
                           }
                        } else {
                           var5.remove();
                        }
                     } else {
                        var5.remove();
                     }
                  } else {
                     var5.remove();
                  }
               } else {
                  var5.remove();
               }
            } else {
               var5.remove();
            }
         } else {
            var5.remove();
         }
      }

      Collections.sort(var4, new class_401(this));
      return var4;
   }

   public int method_44018() {
      for (int var3 = 36; var3 < 45; var3++) {
         if (field_46692.field_9632.field_3869.method_18878(var3).method_35884()) {
            class_6098 var4 = field_46692.field_9632.field_3869.method_18878(var3).method_35898();
            if (var4.method_27960() == class_4897.field_24665) {
               return var3 - 36;
            }
         }
      }

      for (int var5 = 9; var5 < 36; var5++) {
         if (field_46692.field_9632.field_3869.method_18878(var5).method_35884()) {
            class_6098 var6 = field_46692.field_9632.field_3869.method_18878(var5).method_35898();
            if (var6.method_27960() == class_4897.field_24665) {
               if (class_3347.method_15349() <= class_412.field_1752.method_2055()) {
                  field_46692.method_8614().method_4813(new class_8559(class_2105.field_10551));
               }

               class_2740.method_12312(var5, 8);
               field_46692.method_8614().method_4813(new class_1194(-1));
               return 5;
            }
         }
      }

      return -1;
   }
}
