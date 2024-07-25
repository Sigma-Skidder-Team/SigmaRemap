package remapped;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class class_9024 extends Module {
   private static final int field_46184 = 3;
   private Color[] field_46174 = new Color[3];
   private Color[] field_46173 = new Color[3];
   private Color[] field_46169 = new Color[3];
   private Color[] field_46171 = new Color[3];
   private Color[] field_46168 = new Color[3];
   private int field_46182 = 10;
   private int field_46185 = 90;
   private int field_46158 = 150;
   private int field_46178 = 150;
   public List<Category> field_46170 = new ArrayList<Category>();
   public HashMap<Category, Float> field_46155 = new HashMap<Category, Float>();
   public HashMap<Module, Float> field_46167 = new HashMap<Module, Float>();
   private int field_46179 = 0;
   private int field_46180 = 0;
   private int field_46177 = 0;
   private int field_46159 = 30;
   private int field_46163 = 4;
   private float field_46165 = 1.0F;
   public boolean field_46166 = false;
   private Category field_46172;
   private int field_46160 = 0;
   private int field_46176;
   private Module field_46187;
   private int field_46161 = 170;
   private float field_46175 = 0.0F;
   public static class_9024 field_46156;
   public ArrayList<class_3922> field_46164 = new ArrayList<class_3922>();
   public int field_46162 = class_314.method_1444(class_1255.field_6929.field_6917, 0.0625F);
   public int field_46186 = class_314.method_1444(class_1255.field_6918.field_6917, 0.3F);
   public List<Category> field_46183 = this.method_41402();
   public int field_46157 = class_314.method_1444(class_1255.field_6920.field_6917, 0.05F);

   public class_9024() {
      super(Category.GUI, "TabGUI", "Manage mods without opening the ClickGUI");
      this.method_42011(false);
      field_46156 = this;
   }

   @EventListen
   @class_5355
   private void method_41399(class_1711 var1) {
      if (this.method_42015() && mcInstance.field_9632 != null) {
         if (SigmaMainClass.getInstance().method_3299().method_30987()) {
            if (!MinecraftClient.getInstance().gameOptions.field_45470) {
               if (!MinecraftClient.getInstance().gameOptions.field_45567) {
                  class_4746.method_21925(this.field_46182, this.field_46185, this.field_46158, this.field_46178);
                  if (this.field_46166) {
                     class_4746.method_21925(170, this.field_46185, this.field_46161, this.field_46160);
                  }
               }
            }
         }
      }
   }

   @EventListen
   @class_5355
   private void method_41401(class_3278 var1) {
      if (this.method_42015() && mcInstance.field_9632 != null && mcInstance.field_9601 != null) {
         if (!MinecraftClient.getInstance().gameOptions.field_45470) {
            if (!MinecraftClient.getInstance().gameOptions.field_45567) {
               this.field_46178 = 5 * this.field_46159 + this.field_46163;
               float var4 = Math.abs((float)this.method_41397() - this.field_46175);
               boolean var5 = (float)this.method_41397() - this.field_46175 < 0.0F;
               this.field_46175 = this.field_46175 + Math.min(var4, var4 * 0.14F * this.field_46165) * (float)(!var5 ? 1 : -1);
               this.field_46185 = var1.method_14966();
               this.method_41406(this.field_46182, this.field_46185, this.field_46158, this.field_46178, this.field_46174, null, this.field_46173, 1.0F);
               class_73.method_135((float)this.field_46182, (float)this.field_46185, (float)this.field_46158, (float)this.field_46178);
               this.method_41403(
                  this.field_46182,
                  this.field_46185 - Math.round(this.field_46175),
                  this.field_46183.size() * this.field_46159 + this.field_46163,
                  this.field_46158,
                  this.field_46179,
                  false,
                  1.0F
               );
               this.method_41395(this.field_46182, this.field_46185 - Math.round(this.field_46175), this.field_46183);
               class_73.method_141();
               if (this.field_46166) {
                  this.field_46160 = this.method_41400(this.field_46172).size() * this.field_46159 + this.field_46163;
                  this.method_41406(170, this.field_46185, this.field_46161, this.field_46160, this.field_46169, this.field_46168, this.field_46171, 1.0F);
                  this.method_41403(170, this.field_46185, this.field_46160, this.field_46161, this.field_46176, true, 1.0F);
                  this.method_41394(170, this.field_46185, this.method_41400(this.field_46172), 1.0F);
               }

               var1.method_14968(this.field_46178 + 10);
            }
         }
      }
   }

   private int method_41397() {
      return Math.max(this.field_46179 * this.field_46159 - 4 * this.field_46159, 0);
   }

   private List<Module> method_41400(Category var1) {
      ArrayList var4 = new ArrayList();

      for (Module var6 : SigmaMainClass.getInstance().getModuleManager().method_844(var1)) {
         var4.add(var6);
      }

      return var4;
   }

   private void method_41394(int var1, int var2, List<Module> var3, float var4) {
      int var7 = 0;

      for (Module var9 : var3) {
         if (this.field_46176 == var7) {
            this.field_46187 = var9;
         }

         if (!this.field_46167.containsKey(var9)) {
            this.field_46167.put(var9, 0.0F);
         }

         if (this.field_46176 == var7 && this.field_46167.get(var9) < 14.0F) {
            this.field_46167.put(var9, this.field_46167.get(var9) + this.field_46165);
         } else if (this.field_46176 != var7 && this.field_46167.get(var9) > 0.0F) {
            this.field_46167.put(var9, this.field_46167.get(var9) - this.field_46165);
         }

         if (var9.method_42015()) {
            class_73.method_87(
               class_5320.field_27161,
               (float)(var1 + 11) + this.field_46167.get(var9),
               (float)(var2 + this.field_46159 / 2 - class_5320.field_27161.method_15654() / 2 + 3 + var7 * this.field_46159),
               var9.getName(),
               class_1255.field_6918.field_6917
            );
         } else {
            class_73.method_87(
               class_5320.field_27152,
               (float)(var1 + 11) + this.field_46167.get(var9),
               (float)(var2 + this.field_46159 / 2 - class_5320.field_27152.method_15654() / 2 + 2 + var7 * this.field_46159),
               var9.getName(),
               class_1255.field_6918.field_6917
            );
         }

         var7++;
      }
   }

   private void method_41395(int var1, int var2, List<Category> var3) {
      int var6 = 0;

      for (Category var8 : var3) {
         if (this.field_46179 == var6) {
            this.field_46172 = var8;
         }

         if (!this.field_46155.containsKey(var8)) {
            this.field_46155.put(var8, 0.0F);
         }

         if (this.field_46179 == var6 && this.field_46155.get(var8) < 14.0F) {
            this.field_46155.put(var8, this.field_46155.get(var8) + this.field_46165);
         } else if (this.field_46179 != var6 && this.field_46155.get(var8) > 0.0F) {
            this.field_46155.put(var8, this.field_46155.get(var8) - this.field_46165);
         }

         class_73.method_87(
            class_5320.field_27152,
            (float)(var1 + 11) + this.field_46155.get(var8),
            (float)(var2 + this.field_46159 / 2 - class_5320.field_27152.method_15654() / 2 + 2 + var6 * this.field_46159),
            var8.toString(),
            -1
         );
         var6++;
      }
   }

   private void method_41403(int var1, int var2, int var3, int var4, int var5, boolean var6, float var7) {
      int var10 = 0;
      if (var6) {
         if (var6) {
            float var11 = (float)(var5 * this.field_46159 - this.field_46177);
            if (this.field_46177 > var5 * this.field_46159) {
               this.field_46177 = (int)(
                  (float)this.field_46177 + (!(var11 * 0.14F * this.field_46165 >= 1.0F) ? var11 * 0.14F * this.field_46165 : -this.field_46165)
               );
            }

            if (this.field_46177 < var5 * this.field_46159) {
               this.field_46177 = (int)(
                  (float)this.field_46177 + (!(var11 * 0.14F * this.field_46165 <= 1.0F) ? var11 * 0.14F * this.field_46165 : this.field_46165)
               );
            }

            if (var11 > 0.0F && this.field_46177 > var5 * this.field_46159) {
               this.field_46177 = var5 * this.field_46159;
            }

            if (var11 < 0.0F && this.field_46177 < var5 * this.field_46159) {
               this.field_46177 = var5 * this.field_46159;
            }

            var10 = this.field_46177;
         }
      } else {
         float var15 = (float)(var5 * this.field_46159 - this.field_46180);
         if (this.field_46180 > var5 * this.field_46159) {
            this.field_46180 = (int)(
               (float)this.field_46180 + (!(var15 * 0.14F * this.field_46165 >= 1.0F) ? var15 * 0.14F * this.field_46165 : -this.field_46165)
            );
         }

         if (this.field_46180 < var5 * this.field_46159) {
            this.field_46180 = (int)(
               (float)this.field_46180 + (!(var15 * 0.14F * this.field_46165 <= 1.0F) ? var15 * 0.14F * this.field_46165 : this.field_46165)
            );
         }

         if (var15 > 0.0F && this.field_46180 > var5 * this.field_46159) {
            this.field_46180 = var5 * this.field_46159;
         }

         if (var15 < 0.0F && this.field_46180 < var5 * this.field_46159) {
            this.field_46180 = var5 * this.field_46159;
         }

         var10 = this.field_46180;
      }

      if (Math.round(this.field_46175) > 0 && this.field_46180 > 120) {
         this.field_46180 = Math.max(this.field_46180, 120 + Math.round(this.field_46175));
      }

      class_73.method_94(
         (float)var1,
         var10 >= 0 ? (float)(var10 + var2) : (float)var2,
         (float)(var1 + var4),
         var10 + this.field_46163 + this.field_46159 <= var3
            ? (float)(var10 + var2 + this.field_46159 + this.field_46163)
            : (float)(var2 + var3 + this.field_46163),
         this.field_46162
      );
      class_73.method_99(
         (float)var1,
         var10 + this.field_46163 + this.field_46159 <= var3 ? (float)(var10 + var2 + this.field_46159 - 10) : (float)(var2 + var3 - 10),
         (float)var4,
         14.0F,
         NotificationIcons.field_10997,
         this.field_46186
      );
      class_73.method_99((float)var1, var10 >= 0 ? (float)(var10 + var2) : (float)var2, (float)var4, 14.0F, NotificationIcons.field_10992, this.field_46186);
      class_73.method_149(
         var1,
         var10 >= 0 ? var10 + var2 : var2,
         var1 + var4,
         var10 + this.field_46163 + this.field_46159 <= var3 ? var10 + var2 + this.field_46159 + this.field_46163 : var2 + var3 + this.field_46163
      );
      Iterator var16 = this.field_46164.iterator();

      while (var16.hasNext()) {
         class_3922 var12 = (class_3922)var16.next();
         if (var12.field_19050 == var6) {
            float var13 = var12.field_19052.method_11123();
            int var14 = class_314.method_1444(-5658199, (1.0F - var13 * (0.5F + var13 * 0.5F)) * 0.8F);
            if (SigmaMainClass.getInstance().method_3299().method_30987()) {
               var14 = class_314.method_1444(-1, (1.0F - var13) * 0.14F);
            }

            class_73.method_124(
               (float)var1, var10 >= 0 ? (float)(var10 + var2 + 14) : (float)var2, (float)var4 * class_9681.method_44756(var13, 0.0F, 1.0F, 1.0F) + 4.0F, var14
            );
            if (var12.field_19052.method_11123() == 1.0F) {
               var16.remove();
            }
         }
      }

      class_73.method_141();
   }

   private List<Category> method_41402() {
      ArrayList var3 = new ArrayList();
      var3.add(Category.MOVEMENT);
      var3.add(Category.PLAYER);
      var3.add(Category.COMBAT);
      var3.add(Category.ITEM);
      var3.add(Category.RENDER);
      var3.add(Category.WORLD);
      var3.add(Category.MISC);
      return var3;
   }

   @EventListen
   private void method_41396(class_3368 var1) {
      if (this.method_42015() && mcInstance.field_9632 != null) {
         this.method_41405();
         this.field_46165 = (float)Math.max(Math.round(6.0F - (float) MinecraftClient.method_8501() / 10.0F), 1);
      }
   }

   @EventListen
   private void method_41404(class_6435 var1) {
      if (this.method_42015()) {
         switch (var1.method_29384()) {
            case 257:
               if (this.field_46166) {
                  this.field_46187.method_41999();
                  this.field_46164.add(new class_3922(this, this.field_46166));
               }
               break;
            case 258:
            case 259:
            case 260:
            case 261:
            default:
               return;
            case 262:
               this.field_46164.add(new class_3922(this, this.field_46166));
               if (this.field_46166) {
                  this.field_46187.method_41999();
               }

               this.field_46166 = true;
               break;
            case 263:
               this.field_46166 = false;
               break;
            case 264:
               if (!this.field_46166) {
                  this.field_46179++;
                  this.field_46176 = 0;
               } else {
                  this.field_46176++;
               }
               break;
            case 265:
               if (!this.field_46166) {
                  this.field_46179--;
                  this.field_46176 = 0;
               } else {
                  this.field_46176--;
               }
         }

         if (this.field_46179 >= this.field_46183.size()) {
            this.field_46179 = 0;
            this.field_46180 = this.field_46179 * this.field_46159 - this.field_46159;
         } else if (this.field_46179 < 0) {
            this.field_46179 = this.field_46183.size() - 1;
            this.field_46180 = this.field_46179 * this.field_46159 + this.field_46159;
         }

         if (this.field_46176 >= this.method_41400(this.field_46172).size()) {
            this.field_46176 = this.method_41400(this.field_46172).size() - 1;
         } else if (this.field_46176 < 0) {
            this.field_46176 = 0;
         }
      }
   }

   private void method_41406(int var1, int var2, int var3, int var4, Color[] var5, Color[] var6, Color[] var7, float var8) {
      boolean var11 = SigmaMainClass.getInstance().method_3299().method_30987();
      Object var12 = null;
      byte var13 = 20;
      int var14 = class_314.method_1389(var5).getRGB();
      int var15 = class_314.method_1389(var7).getRGB();
      if (var6 != null) {
         int var16 = class_314.method_1389(var6).getRGB();
         var14 = class_314.method_1442(var14, var16, 0.75F);
         var15 = class_314.method_1442(var15, var16, 0.75F);
      }

      if (!var11) {
         class_73.method_81(var1, var2, var1 + var3, var2 + var4, var14, var15);
      } else {
         class_73.method_135((float)var1, (float)var2, (float)var3, (float)var4);
         class_4746.method_21924();
         class_73.method_141();
         class_73.method_94((float)var1, (float)var2, (float)(var1 + var3), (float)(var2 + var4), this.field_46157);
      }

      class_73.method_128((float)var1, (float)var2, (float)var3, (float)var4, 8.0F, 0.7F * var8);
   }

   private void method_41405() {
      byte var3 = 3;
      if (!SigmaMainClass.getInstance().method_3299().method_30987()) {
         if (!MinecraftClient.getInstance().gameOptions.field_45470) {
            if (!MinecraftClient.getInstance().gameOptions.field_45567) {
               for (int var4 = 0; var4 < 3; var4++) {
                  this.field_46174[var4] = this.method_41398(this.field_46182 + this.field_46158 / 3 * var4, this.field_46185, this.field_46174[var4]);
                  this.field_46173[var4] = this.method_41398(
                     this.field_46182 + this.field_46158 / 3 * var4, this.field_46185 + this.field_46178, this.field_46173[var4]
                  );
                  this.field_46169[var4] = this.method_41398(this.field_46182 + this.field_46158 + 56 * var4, this.field_46185, this.field_46169[var4]);
                  this.field_46171[var4] = this.method_41398(
                     this.field_46182 + this.field_46158 + 56 * var4, this.field_46185 + this.field_46160, this.field_46171[var4]
                  );
                  this.field_46168[var4] = this.method_41398(
                     this.field_46182 + this.field_46158 + 56 * var4, this.field_46185 + this.field_46160 / 2, this.field_46168[var4]
                  );
               }
            }
         }
      }
   }

   private Color method_41398(int var1, int var2, Color var3) {
      Color var6 = class_73.method_114(var1, var2, var3);
      if (var3 != null) {
         var6 = class_314.method_1388(var6, var3, 0.08F * this.field_46165);
      }

      return var6;
   }
}
