package remapped;

import java.util.ArrayList;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class class_5937 {
   private MinecraftClient field_30282 = MinecraftClient.getInstance();
   private List<class_8670> field_30284 = new ArrayList<class_8670>();
   public float field_30289 = -999.0F;
   public float field_30287 = -999.0F;
   private class_1331 field_30285;
   private boolean field_30283 = true;
   public class_8670 field_30286 = null;

   public void method_27158() {
      SigmaMainClass.method_3328().method_3302().method_7908(this);
   }

   public void method_27144() {
      this.field_30284.clear();
      this.field_30289 = -999.0F;
      this.field_30287 = -999.0F;
      SigmaMainClass.method_3328().method_3298().method_847(class_3709.class).method_42023(false);
      SigmaMainClass.method_3328().method_3298().method_847(class_2368.class).method_42023(false);
   }

   public void method_27153(List<class_8670> var1) {
      this.method_27144();
      this.method_27145(false);
      if (var1 == null || this.field_30284.isEmpty()) {
         this.field_30286 = null;
      }

      this.field_30284 = var1;
   }

   public void method_27145(boolean var1) {
      this.field_30283 = var1;
   }

   public boolean method_27151() {
      return this.field_30283;
   }

   public boolean method_27149() {
      return this.field_30284 != null && !this.field_30284.isEmpty();
   }

   private boolean method_27159() {
      return this.method_27149() && !this.method_27151();
   }

   public float method_27147() {
      return this.method_27159() ? this.field_30289 : -999.0F;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @class_9148
   private void method_27156(class_4218 var1) {
      if (this.method_27159()) {
         if (this.field_30285 == null) {
            double var4 = Math.sqrt(
               this.field_30282.field_9632.method_37098().field_7336 * this.field_30282.field_9632.method_37098().field_7336
                  + this.field_30282.field_9632.method_37098().field_7334 * this.field_30282.field_9632.method_37098().field_7334
            );
            boolean var6 = class_314.method_1413(this.field_30282.field_9632, 0.02F);
            int var7 = this.field_30284.size() - 1;
            class_8670 var8 = this.field_30284.get(var7);
            class_4748 var9 = var8.field_44477;
            double var10 = var8.field_44468.method_32367(this.field_30282.field_9632.method_37245());
            double var12 = 0.25;
            boolean var14 = false;
            if (this.field_30286 != null) {
               var14 = var8.field_44468.method_32375() - this.field_30286.field_44468.method_32375() != 0.0;
               var14 |= var9 == class_4748.field_23004 || var9 == class_4748.field_23008;
            }

            class_1331 var15 = this.field_30282.field_9632.method_37075();
            if (this.field_30282.field_9632.field_41736.field_7333 % 1.0 >= 0.93) {
               var15 = var15.method_6081();
            }

            boolean var16 = var8.field_44468.method_32355().equals(var15);
            if (var14 && this.field_30282.field_9632.field_41706 < 2.0F) {
               var16 |= var8.field_44468.method_32355().method_6081().equals(var15);
            }

            if (this.field_30282.field_9632.field_41726 || this.field_30286 != null && this.field_30286.field_44477 == class_4748.field_23004) {
               if (this.method_27160() != null && this.method_27160().field_44478.size() > 0) {
                  var16 &= var10 < 0.1;
               }

               if (this.method_27146() == class_4748.field_23008 && this.method_27160().field_44468.method_32376(var8.field_44468) > 16.0) {
                  var16 &= var10 < 0.1;
               } else if (var9 == class_4748.field_23004 && this.method_27146() == class_4748.field_23006) {
                  var16 &= var10 < 0.4;
               } else {
                  var16 &= var10 < var12;
               }
            }

            if (var9 == class_4748.field_23009 && this.field_30282.field_9601.method_28262(var8.field_44468.method_32355().method_6100()).method_8345()) {
               var16 = false;
            }

            boolean var17 = (
                  this.method_27146() == class_4748.field_23004
                     || this.method_27146() == class_4748.field_23008
                     || this.method_27146() == class_4748.field_23009
               )
               && !var6;
            if (var16 && !var17) {
               this.field_30286 = this.field_30284.get(var7);
               this.field_30284.remove(var7);
               if (this.field_30284.size() == 0) {
                  class_314.method_1463(this.field_30282.field_9632.method_37098().field_7336 * 0.5);
                  class_314.method_1405(this.field_30282.field_9632.method_37098().field_7334 * 0.5);
                  this.method_27144();
                  return;
               }

               var7 = this.field_30284.size() - 1;
               var8 = this.field_30284.get(var7);
               var9 = var8.field_44477;
               float var18 = class_7211.method_33007(this.field_30282.field_9632.method_37245(), var8.field_44468.method_32363())[0];
               float var19 = class_7211.method_33007(new class_1343(0.0, 0.0, 0.0), this.field_30282.field_9632.method_37098().method_6213())[0];
               float var20 = Math.abs(class_314.method_1422(var19, var18));
               if (!this.field_30282.field_9632.field_41726 && var20 > 60.0F
                  || !this.field_30282.field_9632.field_41726 && var20 > 45.0F && this.field_30282.field_9632.method_37098().method_6217() > 0.24
                  || var20 > 110.0F) {
                  class_314.method_1463(this.field_30282.field_9632.method_37098().field_7336 * 0.25);
                  class_314.method_1405(this.field_30282.field_9632.method_37098().field_7334 * 0.25);
               }
            }

            if (var10 < var12
               && (var14 || var8.field_44472.size() > 0 && (double)this.field_30282.field_9632.field_41702.field_13230 > var8.field_44468.method_32375())) {
               class_314.method_1463(this.field_30282.field_9632.method_37098().field_7336 * 0.5);
               class_314.method_1405(this.field_30282.field_9632.method_37098().field_7334 * 0.5);
            }

            float var43 = class_7211.method_33007(this.field_30282.field_9632.method_37245(), var8.field_44468.method_32363())[0];
            this.field_30289 = var43;
            double var21 = Math.cos(Math.toRadians((double)(this.field_30282.field_9632.field_41701 - var43)));
            double var23 = Math.sin(Math.toRadians((double)(this.field_30282.field_9632.field_41701 - var43)));
            boolean var25 = class_5286.method_24123(var8);
            this.field_30282.field_9632.method_37140(var8.field_44472.isEmpty());
            double var26 = Math.min(1.0 / Math.abs(var21), 1.0 / Math.abs(var23));
            boolean var28 = !this.field_30282.field_9632.field_41726 && this.field_30282.field_9632.field_41744 && var9 == class_4748.field_23004;
            if (!var28) {
               this.field_30282.field_9632.field_29673 = (float)(var21 * var26);
               this.field_30282.field_9632.field_29676 = (float)(var23 * var26);
            } else {
               if (this.field_30282.field_9632.method_37321()) {
                  class_314.method_1463(this.field_30282.field_9632.method_37098().field_7336 * 0.9);
                  class_314.method_1405(this.field_30282.field_9632.method_37098().field_7334 * 0.9);
               }

               this.field_30282.field_9632.field_29673 = 0.0F;
               this.field_30282.field_9632.field_29676 = 0.0F;
            }

            double var29 = Math.cos(Math.toRadians((double)(var43 + 90.0F))) * var4;
            double var31 = Math.sin(Math.toRadians((double)(var43 + 90.0F))) * var4;
            boolean var33 = class_5286.method_24125();
            boolean var34 = this.field_30282
                  .field_9601
                  .method_6680(this.field_30282.field_9632, this.field_30282.field_9632.method_37241().method_18918(var29, -1.0, var31))
                  .count()
               == 0L;
            boolean var35 = false;
            boolean var36 = false;
            float var37 = this.field_30282.field_9632.field_41701;
            this.field_30282.field_9632.field_41701 = var43;
            switch (var9) {
               case field_23004:
                  boolean var38 = true;
                  if (var8.field_44469 == class_8104.field_41502) {
                     var38 = var10 < 1.14;
                     if (this.field_30286 != null) {
                        var38 &= (double)this.field_30282.field_9632.field_41702.field_13230 - var8.field_44468.method_32375() != 0.0;
                     }
                  }

                  if (var25 && var33 && var10 > 0.75 && var38) {
                     if (this.field_30282.field_9601.method_28262(var8.field_44468.method_32355().method_6100()).method_8360() instanceof class_3049
                        && var10 < 1.1) {
                        class_314.method_1443("YA" + var10);
                     } else {
                        this.field_30282.field_9632.method_26595();
                     }

                     var9 = class_4748.field_23006;
                  }
                  break;
               case field_23008:
                  this.field_30282.field_9632.method_37140(true);
                  if (var25 && var33 && var34) {
                     this.field_30282.field_9632.method_26595();
                     var9 = class_4748.field_23006;
                  }
                  break;
               case field_23007:
                  var36 = true;
                  break;
               case field_23009:
                  var35 = true;
               case field_23006:
            }

            this.field_30282.field_9632.field_41701 = var37;
            if (var36 && !this.field_30282.field_9632.field_41726 && !SigmaMainClass.method_3328().method_3298().method_847(class_2368.class).method_42015()) {
               class_314.method_1463(0.0);
               class_314.method_1405(0.0);
            } else {
               if (SigmaMainClass.method_3328().method_3298().method_847(class_2368.class).method_42015()
                  && !class_314.method_1413(this.field_30282.field_9632, 5.0F)) {
                  var36 = true;
               }

               SigmaMainClass.method_3328().method_3298().method_847(class_3709.class).method_42023(var35);
               SigmaMainClass.method_3328().method_3298().method_847(class_2368.class).method_42023(var36);
               if (!var17 || !var16) {
                  if (var8.field_44468.method_32363().method_6195(this.field_30282.field_9632.method_37245()) > 10.0) {
                     this.method_27144();
                  }
               }
            }
         }
      }
   }

   public boolean method_27148(class_1331 var1) {
      float var4 = (float)var1.method_12173() + 0.5F;
      float var5 = (float)var1.method_12185() + 0.5F;
      double var6 = this.field_30282.field_9632.method_37098().field_7336;
      double var8 = this.field_30282.field_9632.method_37098().field_7334;
      double var10 = this.field_30282.field_9632.method_37302();
      double var12 = this.field_30282.field_9632.method_37156();

      while (Math.abs(var6) + Math.abs(var8) > 0.05) {
         var6 *= 0.9F;
         var8 *= 0.9F;
         var10 += var6;
         var12 += var8;
         double var14 = Math.abs(var10 - (double)var4);
         double var16 = Math.abs(var12 - (double)var5);
         double var18 = Math.sqrt(var14 + var16);
         if (var14 <= 0.3 && var16 <= 0.3) {
            return true;
         }
      }

      return false;
   }

   @class_9148
   private void method_27155(class_1393 var1) {
      if (var1.method_6449()) {
         if (this.method_27159()) {
            ArrayList var4 = new ArrayList();
            int var5 = this.field_30284.size() - 1;
            class_8670 var6 = this.field_30284.get(var5);
            if (this.field_30287 != -999.0F && var6.field_44477 == class_4748.field_23009) {
            }

            for (long var8 : var6.field_44472) {
               class_1331 var10 = class_1331.method_6088(var8);
               if (this.field_30282
                        .field_9632
                        .method_37245()
                        .method_6203((double)var10.method_12173(), (double)var10.method_12165(), (double)var10.method_12185())
                     < 9.0
                  && !class_7047.method_32366(var10)
                  && !this.field_30282.field_9601.method_28262(var10).method_8345()) {
                  var4.add(var10);
               }
            }

            class_7494.method_34085(var4);
            if (var4.isEmpty()) {
               this.field_30285 = null;
            } else if (this.field_30285 != null) {
               if (this.field_30282.field_9601.method_28262(this.field_30285).method_8345()
                  || Math.sqrt(
                        this.field_30282
                           .field_9632
                           .method_37273(
                              (double)this.field_30285.method_12173() + 0.5,
                              (double)this.field_30285.method_12165() + 0.5,
                              (double)this.field_30285.method_12185() + 0.5
                           )
                     )
                     > 6.0) {
                  this.field_30285 = (class_1331)var4.get(0);
               }

               Direction var13 = class_7494.method_34113(this.field_30285);
               float[] var11 = class_7494.method_34077(this.field_30285, var13);
               var1.method_6441(var11[0]);
               var1.method_6448(var11[1]);
               this.field_30282.field_9632.method_26597(class_2584.field_12791);
               this.field_30282.field_9647.method_42163(this.field_30285, class_7494.method_34113(this.field_30285));
            } else {
               this.field_30285 = (class_1331)var4.get(0);
               Direction var14 = class_7494.method_34113(this.field_30285);
               float[] var15 = class_7494.method_34077(this.field_30285, var14);
               var1.method_6441(var15[0]);
               var1.method_6448(var15[1]);
               class_6435 var12 = new class_6435(0, false, this.field_30285);
               SigmaMainClass.method_3328().method_3302().method_7914(var12);
            }

            if (var6.field_44477 != class_4748.field_23009) {
               this.field_30287 = var1.method_6439();
               this.field_30289 = var1.method_6442();
            }
         }
      }
   }

   @class_9148
   public void method_27154(class_5243 var1) {
      if (this.method_27159()) {
         int var4 = this.field_30284.size() - 1;
         class_8670 var5 = this.field_30284.get(var4);
         if (var5 != null && var5.field_44478.contains(var1.method_23989().method_6077())) {
            class_4190 var6 = class_3370.method_15522(0.0, 0.0, 0.0, 1.0, 0.1, 1.0);
            var1.method_23986(var6);
         }
      }
   }

   @class_9148
   public void method_27157(class_7982 var1) {
      if (this.method_27159() && this.field_30282.field_9632.field_41726) {
         int var4 = this.field_30284.size() - 1;
         class_8670 var5 = this.field_30284.get(var4);
         if (var5.field_44477 == class_4748.field_23009) {
            var1.method_36186(true);
         }
      }
   }

   public class_4748 method_27146() {
      class_8670 var3 = this.method_27160();
      return var3 == null ? class_4748.field_23006 : var3.field_44477;
   }

   public class_8670 method_27160() {
      return this.field_30284.size() <= 1 ? null : this.field_30284.get(this.field_30284.size() - 2);
   }

   @class_9148
   public void method_27150(class_3368 var1) {
      if (this.method_27159()) {
         if (this.field_30284 != null) {
            for (class_8670 var5 : this.field_30284) {
               this.method_27161(
                  var5.field_44468.method_32381(), var5.field_44468.method_32375(), var5.field_44468.method_32382(), var5.field_44477 + " " + var5.field_44480
               );
            }
         }

         class_1331 var17 = class_7494.method_34083(this.field_30282.field_9632.field_41701, this.field_30282.field_9632.field_41755, 100.0F);
         if (var17 != null) {
            if (this.field_30284 != null && this.field_30284.size() > 0) {
               int var18 = class_314.method_1444(class_1255.field_6922.field_6917, 0.02F);
               int var6 = class_314.method_1444(class_1255.field_6932.field_6917, 0.02F);
               GL11.glPushMatrix();
               GL11.glDisable(2929);

               for (Long var8 : this.field_30284.get(0).field_44466) {
                  class_1331 var9 = class_1331.method_6088(var8);
                  if (!this.field_30282.field_9601.method_28262(var9).method_8345()) {
                     double var10 = (double)var9.method_12173() - this.field_30282.gameRenderer.method_35949().method_41627().method_61();
                     double var12 = (double)var9.method_12165() - this.field_30282.gameRenderer.method_35949().method_41627().method_60();
                     double var14 = (double)var9.method_12185() - this.field_30282.gameRenderer.method_35949().method_41627().method_62();
                     class_8194 var16 = new class_8194(var10, var12, var14, var10 + 1.0, var12 + 1.0, var14 + 1.0);
                     class_73.method_83(var16, var18);
                  }
               }

               for (Long var20 : this.field_30284.get(0).field_44470) {
                  class_1331 var21 = class_1331.method_6088(var20);
                  if (this.field_30282.field_9601.method_28262(var21).method_8345()) {
                     double var22 = (double)var21.method_12173() - this.field_30282.gameRenderer.method_35949().method_41627().method_61();
                     double var23 = (double)var21.method_12165() - this.field_30282.gameRenderer.method_35949().method_41627().method_60();
                     double var24 = (double)var21.method_12185() - this.field_30282.gameRenderer.method_35949().method_41627().method_62();
                     class_8194 var25 = new class_8194(var22, var23, var24, var22 + 1.0, var23 + 1.0, var24 + 1.0);
                     class_73.method_83(var25, var6);
                  }
               }

               GL11.glEnable(2929);
               GL11.glPopMatrix();
            }
         }
      }
   }

   public void method_27161(double var1, double var3, double var5, String var7) {
      GL11.glBlendFunc(770, 771);
      GL11.glEnable(3042);
      GL11.glEnable(2848);
      GL11.glDisable(3553);
      GL11.glDisable(2929);
      GL11.glDisable(2896);
      GL11.glDepthMask(false);
      GL11.glAlphaFunc(519, 0.0F);
      GL11.glPushMatrix();
      GL11.glTranslated(
         var1 - this.field_30282.gameRenderer.method_35949().method_41627().method_61() + 0.5,
         var3 - this.field_30282.gameRenderer.method_35949().method_41627().method_60(),
         var5 - this.field_30282.gameRenderer.method_35949().method_41627().method_62() + 0.5
      );
      GL11.glAlphaFunc(519, 0.0F);
      GL11.glRotatef(this.field_30282.gameRenderer.method_35949().method_41640(), 0.0F, -1.0F, 0.0F);
      GL11.glRotatef(this.field_30282.gameRenderer.method_35949().method_41638(), 1.0F, 0.0F, 0.0F);
      class_3384 var10 = class_5320.field_27141;
      GL11.glPushMatrix();
      GL11.glScalef(-0.01F, -0.01F, -0.01F);
      class_73.method_94(
         (float)(-var10.method_18547(var7) / 2 - 10),
         0.0F,
         (float)(var10.method_18547(var7) / 2 + 10),
         (float)(var10.method_15654() + 2),
         class_314.method_1444(class_1255.field_6929.field_6917, 0.1F)
      );
      GL11.glTranslated((double)(-var10.method_18547(var7) / 2), 0.0, 0.0);
      class_73.method_87(var10, 0.0F, 0.0F, var7, class_314.method_1444(class_1255.field_6918.field_6917, 0.3F));
      GL11.glPopMatrix();
      GL11.glPopMatrix();
      GL11.glEnable(3553);
      GL11.glEnable(2929);
      GL11.glDisable(2848);
      GL11.glDepthMask(true);
      GL11.glDisable(3042);
   }
}
