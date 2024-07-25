package remapped;

import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.util.text.TextFormatting;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class class_6353<T extends class_5834, M extends class_6521<T>> extends class_7067<T> implements class_2514<T, M> {
   private static final Logger field_32478 = LogManager.getLogger();
   public M field_32487;
   public final List<class_4171<T, M>> field_32480 = Lists.newArrayList();
   public class_5834 field_32481;
   public float field_32485;
   public float field_32484;
   public float field_32482;
   public float field_32486;
   public float field_32489;
   public float field_32488;
   public static final boolean field_32483 = Boolean.getBoolean("animate.model.living");
   public float field_32479 = 1.0F;

   public class_6353(class_6122 var1, M var2, float var3) {
      super(var1);
      this.field_32487 = (M)var2;
      this.field_36492 = var3;
   }

   public final boolean method_29100(class_4171<T, M> var1) {
      return this.field_32480.add(var1);
   }

   @Override
   public M method_11447() {
      return this.field_32487;
   }

   public void method_29107(T var1, float var2, float var3, class_7966 var4, class_2565 var5, int var6) {
      if (!class_7860.field_40097.method_22501() || !class_7860.method_35568(class_7860.field_40097, var1, this, var3, var4, var5, var6)) {
         if (field_32483) {
            var1.field_29643 = 1.0F;
         }

         var4.method_36063();
         this.field_32487.field_33202 = this.method_29101((T)var1, var3);
         this.field_32487.field_33203 = var1.method_37070();
         if (class_7860.field_40084.method_3596()) {
            this.field_32487.field_33203 = var1.method_37070()
               && var1.method_37243() != null
               && class_7860.method_35565(var1.method_37243(), class_7860.field_40084);
         }

         this.field_32487.field_33204 = var1.method_26449();
         float var9 = class_9299.method_42837(var3, var1.field_29611, var1.field_29605);
         float var10 = class_9299.method_42837(var3, var1.field_29657, var1.field_29618);
         float var11 = var10 - var9;
         if (this.field_32487.field_33203 && var1.method_37243() instanceof class_5834) {
            class_5834 var12 = (class_5834)var1.method_37243();
            var9 = class_9299.method_42837(var3, var12.field_29611, var12.field_29605);
            var11 = var10 - var9;
            float var13 = class_9299.method_42810(var11);
            if (var13 < -85.0F) {
               var13 = -85.0F;
            }

            if (var13 >= 85.0F) {
               var13 = 85.0F;
            }

            var9 = var10 - var13;
            if (var13 * var13 > 2500.0F) {
               var9 += var13 * 0.2F;
            }

            var11 = var10 - var9;
         }

         float var31 = class_9299.method_42795(var3, var1.field_41762, var1.field_41755);
         class_5278 var33 = new class_5278(var9, var10, var11, var31, var3, var1);
         SigmaMainClass.method_3328().method_3302().method_7914(var33);
         if (var33.method_29716()) {
            var4.method_36064();
            return;
         }

         var9 = var33.method_24091();
         var10 = var33.method_24092();
         var11 = var33.method_24093();
         var31 = var33.method_24087();
         if (var1.method_37102() == class_7653.field_38886) {
            class_240 var14 = var1.method_26408();
            if (var14 != null) {
               float var15 = var1.method_37278(class_7653.field_38885) - 0.1F;
               var4.method_36065((double)((float)(-var14.method_1041()) * var15), 0.0, (double)((float)(-var14.method_1034()) * var15));
            }
         }

         float var34 = this.method_29109((T)var1, var3);
         this.method_29099((T)var1, var4, var34, var9, var3);
         var4.method_36062(-1.0F, -1.0F, 1.0F);
         this.method_29112((T)var1, var4, var3);
         var4.method_36065(0.0, -1.501F, 0.0);
         float var35 = 0.0F;
         float var16 = 0.0F;
         if (!var1.method_37070() && var1.method_37330()) {
            var35 = class_9299.method_42795(var3, var1.field_29598, var1.field_29643);
            var16 = var1.field_29671 - var1.field_29643 * (1.0F - var3);
            if (var1.method_26449()) {
               var16 *= 3.0F;
            }

            if (var35 > 1.0F) {
               var35 = 1.0F;
            }
         }

         var33.method_24089(class_8817.field_45103);
         SigmaMainClass.method_3328().method_3302().method_7914(var33);
         this.field_32487.method_29702((T)var1, var16, var35, var3);
         this.field_32487.method_29700((T)var1, var16, var35, var34, var11, var31);
         if (class_9763.method_45055()) {
            this.field_32481 = var1;
            this.field_32485 = var16;
            this.field_32484 = var35;
            this.field_32482 = var34;
            this.field_32486 = var11;
            this.field_32489 = var31;
            this.field_32488 = var3;
         }

         boolean var17 = class_3111.method_14424();
         class_1893 var18 = class_1893.method_8510();
         boolean var19 = this.method_29105((T)var1);
         boolean var20 = !var19 && !var1.method_37077(var18.field_9632);
         boolean var21 = var18.method_8563(var1);
         class_3581 var22 = this.method_29108((T)var1, var19, var20, var21);
         if (var22 != null) {
            class_7907 var23 = var5.method_11645(var22);
            float var24 = this.method_29106((T)var1, var3);
            if (var17) {
               if (var1.field_29645 > 0 || var1.field_29677 > 0) {
                  class_6588.method_30135(1.0F, 0.0F, 0.0F, 0.3F);
               }

               if (var24 > 0.0F) {
                  class_6588.method_30135(var24, var24, var24, 0.5F);
               }
            }

            int var25 = method_29110(var1, var24);
            this.field_32487.method_45499(var4, var23, var6, var25, 1.0F, 1.0F, 1.0F, (!var20 ? 1.0F : 0.15F) * this.field_32479);
         }

         if (!var1.method_37221() && var33.method_24097()) {
            for (class_4171 var37 : this.field_32480) {
               var37.method_19344(var4, var5, var6, var1, var16, var35, var3, var34, var11, var31);
            }
         }

         if (class_3111.method_14424()) {
            class_6588.method_30135(0.0F, 0.0F, 0.0F, 0.0F);
         }

         if (class_9763.method_45055()) {
            this.field_32481 = null;
         }

         var33.method_24089(class_8817.field_45102);
         SigmaMainClass.method_3328().method_3302().method_7914(var33);
         var4.method_36064();
         super.method_32551((T)var1, var2, var3, var4, var5, var6);
         if (class_7860.field_40037.method_22501()) {
            class_7860.method_35568(class_7860.field_40037, var1, this, var3, var4, var5, var6);
         }
      }
   }

   @Nullable
   public class_3581 method_29108(T var1, boolean var2, boolean var3, boolean var4) {
      class_4639 var7 = this.method_11446((T)var1);
      if (this.method_32556() != null) {
         var7 = this.method_32556();
      }

      if (!var3) {
         if (!var2) {
            if (var1.method_37116() && !class_3111.method_14327().field_9657.method_20036()) {
               return this.field_32487.method_45498(var7);
            } else {
               return !var4 ? null : class_3581.method_16773(var7);
            }
         } else {
            return this.field_32487.method_45498(var7);
         }
      } else {
         return class_3581.method_16766(var7);
      }
   }

   public static int method_29110(class_5834 var0, float var1) {
      return class_5367.method_24487(class_5367.method_24485(var1), class_5367.method_24483(var0.field_29645 > 0 || var0.field_29677 > 0));
   }

   public boolean method_29105(T var1) {
      return !var1.method_37109();
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static float method_29111(class_240 var0) {
      switch (var0) {
         case field_800:
            return 90.0F;
         case field_809:
            return 0.0F;
         case field_818:
            return 270.0F;
         case field_804:
            return 180.0F;
         default:
            return 0.0F;
      }
   }

   public boolean method_29104(T var1) {
      return false;
   }

   public void method_29099(T var1, class_7966 var2, float var3, float var4, float var5) {
      if (this.method_29104((T)var1)) {
         var4 += (float)(Math.cos((double)var1.field_41697 * 3.25) * Math.PI * 0.4F);
      }

      class_7653 var8 = var1.method_37102();
      if (var8 != class_7653.field_38886) {
         var2.method_36060(class_2426.field_12074.method_11074(180.0F - var4));
      }

      if (var1.field_29677 <= 0) {
         if (!var1.method_26600()) {
            if (var8 != class_7653.field_38886) {
               if (var1.method_45507() || var1 instanceof class_704) {
                  String var9 = TextFormatting.getTextWithoutFormattingCodes(var1.method_45509().getString());
                  if (("Dinnerbone".equals(var9) || "Grumm".equals(var9))
                     && (!(var1 instanceof class_704) || ((class_704)var1).method_3168(class_7742.field_39260))) {
                     var2.method_36065(0.0, (double)(var1.method_37074() + 0.1F), 0.0);
                     var2.method_36060(class_2426.field_12076.method_11074(180.0F));
                  }
               }
            } else {
               class_240 var11 = var1.method_26408();
               float var10 = var11 == null ? var4 : method_29111(var11);
               var2.method_36060(class_2426.field_12074.method_11074(var10));
               var2.method_36060(class_2426.field_12076.method_11074(this.method_29098((T)var1)));
               var2.method_36060(class_2426.field_12074.method_11074(270.0F));
            }
         } else {
            var2.method_36060(class_2426.field_12080.method_11074(-90.0F - var1.field_41755));
            var2.method_36060(class_2426.field_12074.method_11074(((float)var1.field_41697 + var5) * -75.0F));
         }
      } else {
         float var12 = ((float)var1.field_29677 + var5 - 1.0F) / 20.0F * 1.6F;
         var12 = class_9299.method_42843(var12);
         if (var12 > 1.0F) {
            var12 = 1.0F;
         }

         var2.method_36060(class_2426.field_12076.method_11074(var12 * this.method_29098((T)var1)));
      }
   }

   public float method_29101(T var1, float var2) {
      return var1.method_26533(var2);
   }

   public float method_29109(T var1, float var2) {
      return (float)var1.field_41697 + var2;
   }

   public float method_29098(T var1) {
      return 90.0F;
   }

   public float method_29106(T var1, float var2) {
      return 0.0F;
   }

   public void method_29112(T var1, class_7966 var2, float var3) {
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean method_29103(T var1) {
      class_2563 var4 = new class_2563(var1);
      SigmaMainClass.method_3328().method_3302().method_7914(var4);
      if (var4.method_29716()) {
         return false;
      } else {
         double var5 = this.field_36493.method_28129(var1);
         float var7 = var1.method_37073() ? 32.0F : 64.0F;
         if (var5 >= (double)(var7 * var7)) {
            return false;
         } else {
            class_1893 var8 = class_1893.method_8510();
            class_5989 var9 = var8.field_9632;
            boolean var10 = !var1.method_37077(var9);
            if (var1 != var9) {
               class_5086 var11 = var1.method_37095();
               class_5086 var12 = var9.method_37095();
               if (var11 != null) {
                  class_1014 var13 = var11.method_23379();
                  switch (var13) {
                     case field_5325:
                        return var10;
                     case field_5326:
                        return false;
                     case field_5327:
                        return var12 == null ? var10 : var11.method_23384(var12) && (var11.method_23377() || var10);
                     case field_5328:
                        return var12 == null ? var10 : !var11.method_23384(var12) && var10;
                     default:
                        return true;
                  }
               }
            }

            return class_1893.method_8616() && var1 != var8.method_8516() && var10 && !var1.method_37151();
         }
      }
   }

   public List<class_4171<T, M>> method_29102() {
      return this.field_32480;
   }
}
