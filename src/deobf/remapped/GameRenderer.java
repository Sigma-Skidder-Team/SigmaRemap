package remapped;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraft.util.text.event.ClickEvent$class_47;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GameRenderer implements class_6491, AutoCloseable {
   private static final class_4639 field_40614 = new class_4639("textures/misc/nausea.png");
   private static final Logger field_40642 = LogManager.getLogger();
   private final MinecraftClient field_40612;
   private final class_7832 field_40604;
   private final Random field_40617 = new Random();
   private float field_40640;
   public final class_9164 field_40622;
   private final class_8451 field_40638;
   private final class_3017 field_40624;
   private int field_40615;
   private float field_40607;
   private float field_40641;
   private float field_40621;
   private float field_40632;
   public boolean field_40627 = true;
   private boolean field_40606 = true;
   private long field_40646;
   private long field_40644 = Util.getMeasuringTimeMs();
   public final class_5778 field_40623;
   private final class_5367 field_40633 = new class_5367();
   private boolean field_40630;
   private float field_40643 = 1.0F;
   private float field_40608;
   private float field_40605;
   private class_6098 field_40636;
   private int field_40634;
   private float field_40629;
   private float field_40637;
   public class_4067 field_40620;
   public static final class_4639[] field_40635 = new class_4639[]{
      new class_4639("shaders/post/notch.json"),
      new class_4639("shaders/post/fxaa.json"),
      new class_4639("shaders/post/art.json"),
      new class_4639("shaders/post/bumpy.json"),
      new class_4639("shaders/post/blobs2.json"),
      new class_4639("shaders/post/pencil.json"),
      new class_4639("shaders/post/color_convolve.json"),
      new class_4639("shaders/post/deconverge.json"),
      new class_4639("shaders/post/flip.json"),
      new class_4639(field_40613[2]),
      new class_4639("shaders/post/ntsc.json"),
      new class_4639("shaders/post/outline.json"),
      new class_4639("shaders/post/phosphor.json"),
      new class_4639("shaders/post/scan_pincushion.json"),
      new class_4639("shaders/post/sobel.json"),
      new class_4639("shaders/post/bits.json"),
      new class_4639("shaders/post/desaturate.json"),
      new class_4639("shaders/post/green.json"),
      new class_4639("shaders/post/blur.json"),
      new class_4639("shaders/post/wobble.json"),
      new class_4639("shaders/post/blobs.json"),
      new class_4639("shaders/post/antialias.json"),
      new class_4639(field_40613[0]),
      new class_4639(field_40613[1])
   };
   public static final int field_40631 = field_40635.length;
   public int field_40626 = field_40631;
   private boolean field_40610;
   private final class_9071 field_40648 = new class_9071();
   private boolean field_40618 = false;
   private class_6486 field_40619 = null;
   private float field_40603 = 128.0F;
   private long field_40639 = 0L;
   private int field_40645 = 0;
   private int field_40611 = 0;
   private int field_40628 = 0;
   private float field_40625 = 0.0F;
   private float field_40647 = 0.0F;
   private class_4067[] field_40609 = new class_4067[10];
   private boolean field_40616 = false;

   public GameRenderer(MinecraftClient var1, class_7832 var2, class_3017 var3) {
      this.field_40612 = var1;
      this.field_40604 = var2;
      this.field_40622 = var1.method_8574();
      this.field_40638 = new class_8451(var1.method_8577());
      this.field_40623 = new class_5778(this, var1);
      this.field_40624 = var3;
      this.field_40620 = null;
   }

   @Override
   public void close() {
      this.field_40623.close();
      this.field_40638.close();
      this.field_40633.close();
      this.method_35922();
   }

   public void method_35922() {
      if (this.field_40620 != null) {
         this.field_40620.close();
      }

      this.field_40620 = null;
      this.field_40626 = field_40631;
   }

   public void method_35948() {
      this.field_40610 = !this.field_40610;
   }

   public void method_35951(class_8145 var1) {
      if (this.field_40620 != null) {
         this.field_40620.close();
      }

      this.field_40620 = null;
      if (!(var1 instanceof class_9490)) {
         if (!(var1 instanceof class_7937)) {
            if (!(var1 instanceof class_912)) {
               if (class_7860.field_40090.method_3596()) {
                  class_7860.method_35556(class_7860.field_40090, var1, this);
               }
            } else {
               this.method_35934(new class_4639("shaders/post/invert.json"));
            }
         } else {
            this.method_35934(new class_4639("shaders/post/spider.json"));
         }
      } else {
         this.method_35934(new class_4639("shaders/post/creeper.json"));
      }
   }

   public void method_35934(class_4639 var1) {
      if (class_3776.method_17487()) {
         if (this.field_40620 != null) {
            this.field_40620.close();
         }

         try {
            this.field_40620 = new class_4067(this.field_40612.method_8577(), this.field_40604, this.field_40612.method_8584(), var1);
            this.field_40620.method_18750(this.field_40612.method_8552().method_43178(), this.field_40612.method_8552().method_43198());
            this.field_40610 = true;
         } catch (IOException var5) {
            field_40642.warn("Failed to load shader: {}", var1, var5);
            this.field_40626 = field_40631;
            this.field_40610 = false;
         } catch (JsonSyntaxException var6) {
            field_40642.warn("Failed to parse shader: {}", var1, var6);
            this.field_40626 = field_40631;
            this.field_40610 = false;
         }
      }
   }

   @Override
   public void method_29609(class_7832 var1) {
      if (this.field_40620 != null) {
         this.field_40620.close();
      }

      this.field_40620 = null;
      if (this.field_40626 != field_40631) {
         this.method_35934(field_40635[this.field_40626]);
      } else {
         this.method_35951(this.field_40612.method_8516());
      }
   }

   public void method_35958() {
      this.method_35937();
      this.field_40623.method_26130();
      if (this.field_40612.method_8516() == null) {
         this.field_40612.method_8550(this.field_40612.field_9632);
      }

      this.field_40648.method_41645();
      this.field_40615++;
      this.field_40622.method_42246();
      this.field_40612.field_9657.method_20011(this.field_40648);
      this.field_40632 = this.field_40621;
      if (!this.field_40612.field_9614.method_13972().method_21872()) {
         if (this.field_40621 > 0.0F) {
            this.field_40621 -= 0.0125F;
         }
      } else {
         this.field_40621 += 0.05F;
         if (this.field_40621 > 1.0F) {
            this.field_40621 = 1.0F;
         }
      }

      if (this.field_40634 > 0) {
         this.field_40634--;
         if (this.field_40634 == 0) {
            this.field_40636 = null;
         }
      }
   }

   @Nullable
   public class_4067 method_35930() {
      return this.field_40620;
   }

   public void method_35943(int var1, int var2) {
      if (this.field_40620 != null) {
         this.field_40620.method_18750(var1, var2);
      }

      this.field_40612.field_9657.method_20060(var1, var2);
   }

   public void method_35938(float var1) {
      class_8145 var4 = this.field_40612.method_8516();
      if (var4 != null && this.field_40612.field_9601 != null) {
         this.field_40612.method_8562().method_16056("pick");
         this.field_40612.field_9662 = null;
         double var5 = (double)this.field_40612.field_9647.method_42146();
         this.field_40612.field_9587 = var4.method_37201(var5, var1, false);
         class_1343 var7 = var4.method_37335(var1);
         boolean var8 = false;
         byte var9 = 3;
         double var10 = var5;
         if (!this.field_40612.field_9647.method_42143()) {
            if (var5 > 3.0) {
               var8 = true;
            }

            var5 = var5;
         } else {
            var10 = 6.0;
            var5 = var10;
         }

         var10 *= var10;
         if (this.field_40612.field_9587 != null) {
            var10 = this.field_40612.field_9587.method_33993().method_6204(var7);
         }

         class_1343 var12 = var4.method_37307(1.0F);
         class_1343 var13 = var7.method_6214(var12.field_7336 * var5, var12.field_7333 * var5, var12.field_7334 * var5);
         float var14 = 1.0F;
         class_4092 var15 = var4.method_37241().method_18929(var12.method_6209(var5)).method_18899(1.0, 1.0, 1.0);
         class_5631 var16 = class_8462.method_38932(var4, var7, var13, var15, var0 -> !var0.method_37221() && var0.method_37167(), var10);
         if (var16 != null) {
            class_8145 var17 = var16.method_25524();
            class_1343 var18 = var16.method_33993();
            double var19 = var7.method_6204(var18);
            if (var8 && var19 > 9.0) {
               this.field_40612.field_9587 = class_9529.method_43958(
                  var18, class_240.method_1044(var12.field_7336, var12.field_7333, var12.field_7334), new class_1331(var18)
               );
            } else if (var19 < var10 || this.field_40612.field_9587 == null) {
               this.field_40612.field_9587 = var16;
               if (var17 instanceof class_5834 || var17 instanceof class_7451) {
                  this.field_40612.field_9662 = var17;
               }
            }
         }

         this.field_40612.method_8562().method_16054();
      }
   }

   private void method_35937() {
      float var3 = 1.0F;
      if (this.field_40612.method_8516() instanceof class_9716) {
         class_9716 var4 = (class_9716)this.field_40612.method_8516();
         var3 = var4.method_44876();
      }

      this.field_40641 = this.field_40607;
      this.field_40607 = this.field_40607 + (var3 - this.field_40607) * 0.5F;
      if (this.field_40607 > 1.5F) {
         this.field_40607 = 1.5F;
      }

      if (this.field_40607 < 0.1F) {
         this.field_40607 = 0.1F;
      }
   }

   private double method_35940(class_9071 var1, float var2, boolean var3) {
      if (!this.field_40630) {
         double var6 = 70.0;
         if (var3) {
            var6 = this.field_40612.field_9577.field_45543;
            if (class_3111.method_14313()) {
               var6 *= (double)class_9299.method_42795(var2, this.field_40641, this.field_40607);
            }
         }

         boolean var8 = false;
         if (this.field_40612.field_9623 == null) {
            var8 = this.field_40612.field_9577.field_45548.method_27060();
         }

         if (!var8) {
            if (class_3111.field_15481) {
               class_3111.field_15481 = false;
               this.field_40612.field_9577.field_45499 = class_3111.field_15466;
               this.field_40612.field_9657.method_20018();
            }
         } else {
            if (!class_3111.field_15481) {
               class_3111.field_15481 = true;
               class_3111.field_15466 = this.field_40612.field_9577.field_45499;
               this.field_40612.field_9577.field_45499 = true;
               this.field_40612.field_9657.method_20018();
            }

            if (class_3111.field_15481) {
               var6 /= 4.0;
            }
         }

         if (var1.method_41633() instanceof class_5834 && ((class_5834)var1.method_41633()).method_26450()) {
            float var9 = Math.min((float)((class_5834)var1.method_41633()).field_29677 + var2, 20.0F);
            var6 /= (double)((1.0F - 500.0F / (var9 + 500.0F)) * 2.0F + 1.0F);
         }

         class_4774 var10 = var1.method_41626();
         if (!var10.method_22001()) {
            var6 = var6 * 60.0 / 70.0;
         }

         return !class_7860.field_39920.method_3596() ? var6 : class_7860.method_35579(class_7860.field_39920, this, var1, var2, var6);
      } else {
         return 90.0;
      }
   }

   private void method_35952(class_7966 var1, float var2) {
      if (this.field_40612.method_8516() instanceof class_5834) {
         class_5834 var5 = (class_5834)this.field_40612.method_8516();
         float var6 = (float)var5.field_29645 - var2;
         if (var5.method_26450()) {
            float var7 = Math.min((float)var5.field_29677 + var2, 20.0F);
            var1.method_36060(class_2426.field_12076.method_11074(40.0F - 8000.0F / (var7 + 200.0F)));
         }

         if (var6 < 0.0F) {
            return;
         }

         var6 /= (float)var5.field_29662;
         var6 = class_9299.method_42818(var6 * var6 * var6 * var6 * (float) Math.PI);
         float var10 = var5.field_29608;
         var1.method_36060(class_2426.field_12074.method_11074(-var10));
         var1.method_36060(class_2426.field_12076.method_11074(-var6 * 14.0F));
         var1.method_36060(class_2426.field_12074.method_11074(var10));
      }
   }

   private void method_35935(class_7966 var1, float var2) {
      if (this.field_40612.method_8516() instanceof class_704) {
         class_704 var5 = (class_704)this.field_40612.method_8516();
         float var6 = var5.field_41695 - var5.field_41705;
         float var7 = -(var5.field_41695 + var6 * var2);
         float var8 = class_9299.method_42795(var2, var5.field_3857, var5.field_3859);
         var1.method_36065(
            (double)(class_9299.method_42818(var7 * (float) Math.PI) * var8 * 0.5F),
            (double)(-Math.abs(class_9299.method_42840(var7 * (float) Math.PI) * var8)),
            0.0
         );
         var1.method_36060(class_2426.field_12076.method_11074(class_9299.method_42818(var7 * (float) Math.PI) * var8 * 3.0F));
         var1.method_36060(class_2426.field_12080.method_11074(Math.abs(class_9299.method_42840(var7 * (float) Math.PI - 0.2F) * var8) * 5.0F));
      }
   }

   private void method_35923(class_7966 var1, class_9071 var2, float var3) {
      this.method_35924(var1, var2, var3, true, true, false);
   }

   public void method_35924(class_7966 var1, class_9071 var2, float var3, boolean var4, boolean var5, boolean var6) {
      if (!this.field_40630) {
         class_6588.method_30276(true);
         this.method_35947(this.method_35931(var2, var3, false));
         class_6279 var9 = var1.method_36058();
         var9.method_28620().method_36817();
         var9.method_28618().method_29888();
         boolean var10 = false;
         if (var4) {
            var1.method_36063();
            this.method_35952(var1, var3);
            if (this.field_40612.field_9577.field_45512) {
               this.method_35935(var1, var3);
            }

            var10 = this.field_40612.method_8516() instanceof class_5834 && ((class_5834)this.field_40612.method_8516()).method_26507();
            if (this.field_40612.field_9577.method_40867().method_42383()
               && !var10
               && !this.field_40612.field_9577.field_45567
               && this.field_40612.field_9647.method_42158() != class_4666.field_22756) {
               this.field_40623.method_26126();
               if (!class_3111.method_14424()) {
                  this.field_40622
                     .method_42243(
                        var3,
                        var1,
                        this.field_40624.method_13796(),
                        this.field_40612.field_9632,
                        this.field_40612.method_8587().method_28120(this.field_40612.field_9632, var3)
                     );
               } else {
                  class_293.method_1301(
                     this.field_40622,
                     var3,
                     var1,
                     this.field_40624.method_13796(),
                     this.field_40612.field_9632,
                     this.field_40612.method_8587().method_28120(this.field_40612.field_9632, var3),
                     var6
                  );
               }

               this.field_40623.method_26122();
            }

            var1.method_36064();
         }

         class_6588.method_30276(false);
         if (!var5) {
            return;
         }

         this.field_40623.method_26122();
         class_9081 var11 = new class_9081();
         SigmaMainClass.method_3328().method_3302().method_7914(var11);
         if (this.field_40612.field_9577.method_40867().method_42383() && !var10 && !var11.method_29716()) {
            class_450.method_2171(this.field_40612, var1);
            this.method_35952(var1, var3);
         }

         if (this.field_40612.field_9577.field_45512) {
            this.method_35935(var1, var3);
         }
      }
   }

   public void method_35947(class_8107 var1) {
      class_3542.method_16463(5889);
      class_3542.method_16476();
      class_3542.method_16358(var1);
      class_3542.method_16463(5888);
   }

   public class_8107 method_35931(class_9071 var1, float var2, boolean var3) {
      class_7966 var6 = new class_7966();
      var6.method_36058().method_28620().method_36817();
      if (class_3111.method_14424() && class_6588.method_30247()) {
         class_6588.method_30197(var6);
      }

      this.field_40603 = this.field_40640 * 2.0F;
      if (this.field_40603 < 173.0F) {
         this.field_40603 = 173.0F;
      }

      if (this.field_40643 != 1.0F) {
         var6.method_36065((double)this.field_40608, (double)(-this.field_40605), 0.0);
         var6.method_36062(this.field_40643, this.field_40643, 1.0F);
      }

      var6.method_36058()
         .method_28620()
         .method_36832(
            class_8107.method_36820(
               this.method_35940(var1, var2, var3),
               (float)this.field_40612.method_8552().method_43178() / (float)this.field_40612.method_8552().method_43198(),
               0.05F,
               this.field_40603
            )
         );
      return var6.method_36058().method_28620();
   }

   public static float method_35954(class_5834 var0, float var1) {
      int var4 = var0.method_26553(class_4054.field_19746).method_10347();
      return var4 <= 200 ? 0.7F + class_9299.method_42818(((float)var4 - var1) * (float) Math.PI * 0.2F) * 0.3F : 1.0F;
   }

   public void method_35945(float var1, long var2, boolean var4) {
      this.method_35933();
      if (!this.field_40612.method_8558()
         && this.field_40612.field_9577.field_45426
         && (!this.field_40612.field_9577.field_45570 || !this.field_40612.field_9625.method_39842())) {
         if (Util.getMeasuringTimeMs() - this.field_40644 > 500L) {
            this.field_40612.method_8597(false);
         }
      } else {
         this.field_40644 = Util.getMeasuringTimeMs();
      }

      if (!this.field_40612.field_9589) {
         int var7 = (int)(
            this.field_40612.field_9625.method_39835()
               * (double)this.field_40612.method_8552().method_43165()
               / (double)this.field_40612.method_8552().method_43166()
         );
         int var8 = (int)(
            this.field_40612.field_9625.method_39832()
               * (double)this.field_40612.method_8552().method_43177()
               / (double)this.field_40612.method_8552().method_43163()
         );
         if (var4 && this.field_40612.field_9601 != null && !class_3111.method_14350()) {
            this.field_40612.method_8562().method_16056("level");
            SigmaMainClass.method_3328().method_3302().method_7914(new class_1711(var1, var2));
            this.method_35950(var1, var2, new class_7966());
            if (this.field_40612.method_8520() && this.field_40646 < Util.getMeasuringTimeMs() - 1000L) {
               this.field_40646 = Util.getMeasuringTimeMs();
               if (!this.field_40612.method_8515().method_1612()) {
                  this.method_35942();
               }
            }

            this.field_40612.field_9657.method_20069();
            if (this.field_40620 != null && this.field_40610) {
               class_3542.method_16448();
               class_3542.method_16491();
               class_3542.method_16458();
               class_3542.method_16432();
               class_3542.method_16463(5890);
               class_3542.method_16438();
               class_3542.method_16476();
               this.field_40620.method_18755(var1);
               class_3542.method_16489();
               class_3542.method_16432();
            }

            this.field_40612.method_8584().method_19717(true);
         } else {
            class_3542.method_16392(0, 0, this.field_40612.method_8552().method_43178(), this.field_40612.method_8552().method_43198());
         }

         class_9352 var9 = this.field_40612.method_8552();
         class_3542.method_16402(256, MinecraftClient.IS_SYSTEM_MAC);
         class_3542.method_16463(5889);
         class_3542.method_16476();
         class_3542.method_16376(0.0, (double)var9.method_43178() / var9.method_43189(), (double)var9.method_43198() / var9.method_43189(), 0.0, 1000.0, 3000.0);
         class_3542.method_16463(5888);
         class_3542.method_16476();
         class_3542.method_16413(0.0F, 0.0F, -2000.0F);
         class_2083.method_9717();
         class_7966 var10 = new class_7966();
         if (this.field_40623.method_26135()) {
            this.field_40623.method_26125(false);
         }

         if (var4 && this.field_40612.field_9601 != null) {
            this.field_40612.method_8562().method_16050("gui");
            if (this.field_40612.field_9632 != null) {
               float var11 = class_9299.method_42795(var1, this.field_40612.field_9632.field_30505, this.field_40612.field_9632.field_30510);
               if (var11 > 0.0F && this.field_40612.field_9632.method_26480(class_4054.field_19732) && this.field_40612.field_9577.field_45469 < 1.0F) {
                  this.method_35941(var11 * (1.0F - this.field_40612.field_9577.field_45469));
               }
            }

            if (!this.field_40612.field_9577.field_45567 || this.field_40612.field_9623 != null) {
               class_3542.method_16433();
               this.method_35921(this.field_40612.method_8552().method_43165(), this.field_40612.method_8552().method_43177(), var1);
               class_2209.field_11030.method_38419();
               this.field_40612.field_9614.method_13997(var10, var1);
               if (this.field_40612.field_9577.field_45385 && !this.field_40612.field_9577.field_45470) {
                  class_3111.method_14343(var10);
               }

               if (this.field_40612.field_9577.field_45470) {
                  class_5099.method_23420(var10, (int)this.field_40612.method_8552().method_43189());
               }

               class_3542.method_16402(256, MinecraftClient.IS_SYSTEM_MAC);
            }

            this.field_40612.method_8562().method_16054();
         }

         class_3542.method_16438();
         SigmaMainClass.method_3328().method_3311();
         class_3542.method_16489();
         if (this.field_40616 != (this.field_40612.field_9610 != null)) {
            if (this.field_40612.field_9610 != null) {
               class_2789.method_12674(this.field_40612);
               if (this.field_40612.field_9610 instanceof class_2789) {
                  class_2789 var16 = (class_2789)this.field_40612.field_9610;
                  var16.method_12679();
               }
            }

            this.field_40616 = this.field_40612.field_9610 != null;
         }

         if (this.field_40612.field_9610 != null) {
            try {
               this.field_40612.field_9610.method_6767(var10, var7, var8, this.field_40612.method_8491());
            } catch (Throwable var15) {
               class_159 var12 = class_159.method_643(var15, "Rendering overlay");
               class_6544 var13 = var12.method_639("Overlay render details");
               var13.method_29851("Overlay name", () -> this.field_40612.field_9610.getClass().getCanonicalName());
               throw new class_3297(var12);
            }
         } else if (this.field_40612.field_9623 != null && SigmaMainClass.method_3328().method_3299().method_31001() == null) {
            try {
               if (class_7860.field_39933.method_3596()) {
                  class_7860.method_35547(class_7860.field_39933, this.field_40612.field_9623, var10, var7, var8, this.field_40612.method_8491());
               } else {
                  this.field_40612.field_9623.method_6767(var10, var7, var8, this.field_40612.method_8491());
                  SigmaMainClass.method_3328().method_3302().method_7914(new class_2532());
               }
            } catch (Throwable var14) {
               class_159 var17 = class_159.method_643(var14, "Rendering screen");
               class_6544 var18 = var17.method_639("Screen render details");
               var18.method_29851("Screen name", () -> this.field_40612.field_9623.getClass().getCanonicalName());
               var18.method_29851(
                  "Mouse location",
                  () -> String.format(
                        Locale.ROOT,
                        "Scaled: (%d, %d). Absolute: (%f, %f)",
                        var7,
                        var8,
                        this.field_40612.field_9625.method_39835(),
                        this.field_40612.field_9625.method_39832()
                     )
               );
               var18.method_29851(
                  "Screen size",
                  () -> String.format(
                        Locale.ROOT,
                        "Scaled: (%d, %d). Absolute: (%d, %d). Scale factor of %f",
                        this.field_40612.method_8552().method_43165(),
                        this.field_40612.method_8552().method_43177(),
                        this.field_40612.method_8552().method_43178(),
                        this.field_40612.method_8552().method_43198(),
                        this.field_40612.method_8552().method_43189()
                     )
               );
               throw new class_3297(var17);
            }
         }

         this.field_40623.method_26125(true);
      }

      this.method_35929();
      this.method_35927();
      class_5849.method_26667();
      class_5099.method_23416();
      if (this.field_40612.field_9577.field_45523) {
         this.field_40612.field_9577.field_45471 = true;
      }
   }

   private void method_35942() {
      if (this.field_40612.field_9657.method_20044() > 10 && this.field_40612.field_9657.method_20019() && !this.field_40612.method_8515().method_1612()) {
         class_5797 var3 = class_5523.method_25038(
            this.field_40612.method_8552().method_43178(), this.field_40612.method_8552().method_43198(), this.field_40612.method_8584()
         );
         Util.getIoWorkerExecutor().execute(() -> {
            int var4 = var3.method_26228();
            int var5 = var3.method_26253();
            int var6 = 0;
            int var7 = 0;
            if (var4 > var5) {
               var6 = (var4 - var5) / 2;
               var4 = var5;
            } else {
               var7 = (var5 - var4) / 2;
               var5 = var4;
            }

            try (class_5797 var8 = new class_5797(64, 64, false)) {
               var3.method_26248(var6, var7, var4, var5, var8);
               var8.method_26237(this.field_40612.method_8515().method_1661());
            } catch (IOException var29) {
               field_40642.warn("Couldn't save auto screenshot", var29);
            } finally {
               var3.close();
            }
         });
      }
   }

   private boolean method_35926() {
      if (!this.field_40606) {
         return false;
      } else {
         class_8145 var3 = this.field_40612.method_8516();
         boolean var4 = var3 instanceof class_704 && !this.field_40612.field_9577.field_45567;
         if (var4 && !((class_704)var3).field_3876.field_4938) {
            class_6098 var5 = ((class_5834)var3).method_26446();
            class_7474 var6 = this.field_40612.field_9587;
            if (var6 != null && var6.method_33990() == class_1430.field_7717) {
               class_1331 var7 = ((class_9529)var6).method_43955();
               class_2522 var8 = this.field_40612.field_9601.method_28262(var7);
               if (this.field_40612.field_9647.method_42158() != class_4666.field_22756) {
                  class_9115 var9 = new class_9115(this.field_40612.field_9601, var7, false);
                  var4 = !var5.method_28022()
                     && (
                        var5.method_28009(this.field_40612.field_9601.method_29600(), var9)
                           || var5.method_28027(this.field_40612.field_9601.method_29600(), var9)
                     );
               } else {
                  var4 = var8.method_8317(this.field_40612.field_9601, var7) != null;
               }
            }
         }

         return var4;
      }
   }

   public void method_35950(float var1, long var2, class_7966 var4) {
      this.field_40623.method_26128(var1);
      if (this.field_40612.method_8516() == null) {
         this.field_40612.method_8550(this.field_40612.field_9632);
      }

      this.method_35938(var1);
      if (class_3111.method_14424()) {
         class_6588.method_30311(this.field_40612, this.field_40648, var1, var2);
      }

      this.field_40612.method_8562().method_16056("center");
      boolean var7 = class_3111.method_14424();
      if (var7) {
         class_6588.method_30139(var1, var2);
      }

      boolean var8 = this.method_35926();
      this.field_40612.method_8562().method_16050("camera");
      class_9071 var9 = this.field_40648;
      this.field_40640 = (float)(this.field_40612.field_9577.field_45537 * 16);
      if (class_3111.method_14324()) {
         this.field_40640 *= 0.95F;
      }

      if (class_3111.method_14296()) {
         this.field_40640 *= 0.83F;
      }

      class_7966 var10 = new class_7966();
      var10.method_36058().method_28620().method_36832(this.method_35931(var9, var1, true));
      class_7966 var11 = var10;
      if (class_6588.method_30132()) {
         var10 = var4;
      }

      this.method_35952(var10, var1);
      if (this.field_40612.field_9577.field_45512) {
         this.method_35935(var10, var1);
      }

      float var12 = class_9299.method_42795(var1, this.field_40612.field_9632.field_30505, this.field_40612.field_9632.field_30510)
         * this.field_40612.field_9577.field_45469
         * this.field_40612.field_9577.field_45469;
      if (var12 > 0.0F) {
         int var13 = !this.field_40612.field_9632.method_26480(class_4054.field_19732) ? 20 : 7;
         float var14 = 5.0F / (var12 * var12 + 5.0F) - var12 * 0.04F;
         var14 *= var14;
         class_2426 var15 = new class_2426(0.0F, class_9299.field_47448 / 2.0F, class_9299.field_47448 / 2.0F);
         var10.method_36060(var15.method_11074(((float)this.field_40615 + var1) * (float)var13));
         var10.method_36062(1.0F / var14, 1.0F, 1.0F);
         float var16 = -((float)this.field_40615 + var1) * (float)var13;
         var10.method_36060(var15.method_11074(var16));
      }

      if (class_6588.method_30132()) {
         var10 = var11;
      }

      class_8107 var18 = var10.method_36058().method_28620();
      this.method_35947(var18);
      var9.method_41643(
         this.field_40612.field_9601,
         (class_8145)(this.field_40612.method_8516() != null ? this.field_40612.method_8516() : this.field_40612.field_9632),
         !this.field_40612.field_9577.method_40867().method_42383(),
         this.field_40612.field_9577.method_40867().method_42384(),
         var1
      );
      if (class_7860.field_40044.method_3596()) {
         Object var20 = class_7860.field_40044.method_3582(this, var9, var1);
         float var21 = class_7860.method_35585(var20, class_7860.field_40063);
         float var22 = class_7860.method_35585(var20, class_7860.field_39841);
         float var17 = class_7860.method_35585(var20, class_7860.field_40004);
         var9.method_41639(var21, var22);
         var4.method_36060(class_2426.field_12076.method_11074(var17));
      }

      var4.method_36060(class_2426.field_12080.method_11074(var9.method_41638()));
      var4.method_36060(class_2426.field_12074.method_11074(var9.method_41640() + 180.0F));
      this.field_40612.field_9657.method_20059(var4, var1, var2, var8, var9, this, this.field_40623, var18);
      if (class_7860.field_40045.method_3596()) {
         this.field_40612.method_8562().method_16050("forge_render_last");
         class_7860.method_35547(class_7860.field_40045, this.field_40612.field_9657, var4, var1, var18, var2);
      }

      this.field_40612.method_8562().method_16050("hand");
      class_3542.method_16438();
      class_3542.method_16358(var4.method_36058().method_28620());
      SigmaMainClass.method_3328().method_3316();
      class_3542.method_16489();
      if (this.field_40627 && !class_6588.field_33945) {
         if (var7) {
            class_293.method_1310(this, var4, var9, var1);
            class_6588.method_30169();
         }

         class_3542.method_16402(256, MinecraftClient.IS_SYSTEM_MAC);
         if (!var7) {
            this.method_35923(var4, var9, var1);
         } else {
            class_293.method_1314(this, var4, var9, var1);
         }
      }

      if (var7) {
         class_6588.method_30103();
      }

      this.field_40612.method_8562().method_16054();
   }

   public void method_35925() {
      this.field_40636 = null;
      this.field_40638.method_38858();
      this.field_40648.method_41641();
   }

   public class_8451 method_35928() {
      return this.field_40638;
   }

   private void method_35927() {
      this.field_40628 = 0;
      if (!class_3111.method_14401() || !class_3111.method_14411()) {
         this.field_40639 = 0L;
         this.field_40645 = 0;
      } else if (this.field_40612.method_8566()) {
         class_7762 var3 = this.field_40612.method_8515();
         if (var3 != null) {
            boolean var4 = this.field_40612.method_8564();
            if (!var4 && !(this.field_40612.field_9623 instanceof class_881)) {
               if (this.field_40611 > 0) {
                  class_5099.field_26293.method_24314();
                  class_3111.method_14399((long)this.field_40611);
                  class_5099.field_26293.method_24313();
                  this.field_40628 = this.field_40611;
               }

               long var5 = System.nanoTime() / 1000000L;
               if (this.field_40639 != 0L && this.field_40645 != 0) {
                  long var7 = var5 - this.field_40639;
                  if (var7 < 0L) {
                     this.field_40639 = var5;
                     var7 = 0L;
                  }

                  if (var7 >= 50L) {
                     this.field_40639 = var5;
                     int var9 = var3.method_1682();
                     int var10 = var9 - this.field_40645;
                     if (var10 < 0) {
                        this.field_40645 = var9;
                        var10 = 0;
                     }

                     if (var10 < 1 && this.field_40611 < 100) {
                        this.field_40611 += 2;
                     }

                     if (var10 > 1 && this.field_40611 > 0) {
                        this.field_40611--;
                     }

                     this.field_40645 = var9;
                  }
               } else {
                  this.field_40639 = var5;
                  this.field_40645 = var3.method_1682();
                  this.field_40647 = 1.0F;
                  this.field_40625 = 50.0F;
               }
            } else {
               if (this.field_40612.field_9623 instanceof class_881) {
                  class_3111.method_14399(20L);
               }

               this.field_40639 = 0L;
               this.field_40645 = 0;
            }
         }
      }
   }

   private void method_35933() {
      class_3111.method_14339();
      class_6941.method_31755();
      if (!this.field_40618) {
         class_9696.method_44802();
         if (class_3111.method_14334() == 64 && class_3111.method_14332() == 32) {
            class_3111.method_14340(true);
         }

         this.field_40618 = true;
      }

      class_174 var3 = this.field_40612.field_9601;
      if (var3 != null) {
         if (class_3111.method_14239() != null) {
            String var4 = "HD_U".replace("HD_U", "HD Ultra").replace("L", "Light");
            String var5 = var4 + " " + class_3111.method_14239();
            StringTextComponent var6 = new StringTextComponent(class_6956.method_31803("of.message.newVersion", "§n" + var5 + "§r"));
            var6.setStyle(Style.EMPTY.setClickEvent(new ClickEvent(ClickEvent$class_47.OPEN_URL, "https://optifine.net/downloads")));
            this.field_40612.field_9614.method_13991().method_18676(var6);
            class_3111.method_14388((String)null);
         }

         if (class_3111.method_14427()) {
            class_3111.method_14340(false);
            StringTextComponent var7 = new StringTextComponent(class_6956.method_31803("of.message.java64Bit"));
            this.field_40612.field_9614.method_13991().method_18676(var7);
         }
      }

      if (this.field_40612.field_9623 instanceof class_1876) {
         this.method_35944((class_1876)this.field_40612.field_9623);
      }

      if (this.field_40619 != var3) {
         class_8192.method_37524(this.field_40619, var3);
         class_3111.method_14430();
         this.field_40639 = 0L;
         this.field_40645 = 0;
         this.field_40619 = var3;
      }

      if (!this.method_35957(class_6588.field_33631)) {
         class_6588.field_33631 = 0;
      }

      if (this.field_40612.field_9623 != null && this.field_40612.field_9623.getClass() == class_5766.class) {
         this.field_40612.method_8609(new class_3779((class_5766)this.field_40612.field_9623));
      }
   }

   private void method_35929() {
      if (this.field_40612.field_9601 != null && class_3111.method_14294() && class_124.method_386("CheckGlErrorFrameFinish", 10000L)) {
         int var3 = class_1920.method_8925();
         if (var3 != 0 && class_6941.method_31754(var3)) {
            String var4 = class_3111.method_14316(var3);
            StringTextComponent var5 = new StringTextComponent(class_6956.method_31803("of.message.openglError", var3, var4));
            this.field_40612.field_9614.method_13991().method_18676(var5);
         }
      }
   }

   private void method_35944(class_1876 var1) {
      try {
         String var4 = null;
         Calendar var5 = Calendar.getInstance();
         var5.setTime(new Date());
         int var6 = var5.get(5);
         int var7 = var5.get(2) + 1;
         if (var6 == 8 && var7 == 4) {
            var4 = "Happy birthday, OptiFine!";
         }

         if (var6 == 14 && var7 == 8) {
            var4 = "Happy birthday, sp614x!";
         }

         if (var4 == null) {
            return;
         }

         class_7860.method_35561(var1, class_7860.field_40022, var4);
      } catch (Throwable var8) {
      }
   }

   public boolean method_35957(int var1) {
      if (class_3776.method_17487()) {
         if (this.field_40620 != null && this.field_40620 != this.field_40609[2] && this.field_40620 != this.field_40609[4]) {
            return true;
         } else if (var1 != 2 && var1 != 4) {
            if (this.field_40620 != null) {
               this.field_40620.close();
               this.field_40620 = null;
               return true;
            } else {
               return true;
            }
         } else if (this.field_40620 != null && this.field_40620 == this.field_40609[var1]) {
            return true;
         } else if (this.field_40612.field_9601 != null) {
            this.method_35934(new class_4639("shaders/post/fxaa_of_" + var1 + "x.json"));
            this.field_40609[var1] = this.field_40620;
            return this.field_40610;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   public class_2645 method_35932() {
      return class_2310.field_11562;
   }

   public void method_35946(class_6098 var1) {
      this.field_40636 = var1;
      this.field_40634 = 40;
      this.field_40629 = this.field_40617.nextFloat() * 2.0F - 1.0F;
      this.field_40637 = this.field_40617.nextFloat() * 2.0F - 1.0F;
   }

   public void method_35921(int var1, int var2, float var3) {
      if (this.field_40636 != null && this.field_40634 > 0) {
         int var6 = 40 - this.field_40634;
         float var7 = ((float)var6 + var3) / 40.0F;
         float var8 = var7 * var7;
         float var9 = var7 * var8;
         float var10 = 10.25F * var9 * var8 - 24.95F * var8 * var8 + 25.5F * var9 - 13.8F * var8 + 4.0F * var7;
         float var11 = var10 * (float) Math.PI;
         float var12 = this.field_40629 * (float)(var1 / 4);
         float var13 = this.field_40637 * (float)(var2 / 4);
         class_3542.method_16374();
         class_3542.method_16438();
         class_3542.method_16451();
         class_3542.method_16428();
         class_3542.method_16393();
         class_7966 var14 = new class_7966();
         var14.method_36063();
         var14.method_36065(
            (double)((float)(var1 / 2) + var12 * class_9299.method_42804(class_9299.method_42818(var11 * 2.0F))),
            (double)((float)(var2 / 2) + var13 * class_9299.method_42804(class_9299.method_42818(var11 * 2.0F))),
            -50.0
         );
         float var15 = 50.0F + 175.0F * class_9299.method_42818(var11);
         var14.method_36062(var15, -var15, var15);
         var14.method_36060(class_2426.field_12074.method_11074(900.0F * class_9299.method_42804(class_9299.method_42818(var11))));
         var14.method_36060(class_2426.field_12080.method_11074(6.0F * class_9299.method_42840(var7 * 8.0F)));
         var14.method_36060(class_2426.field_12076.method_11074(6.0F * class_9299.method_42840(var7 * 8.0F)));
         class_3758 var16 = this.field_40624.method_13796();
         this.field_40612.method_8511().method_40269(this.field_40636, class_5612.field_28495, 15728880, class_5367.field_27381, var14, var16);
         var14.method_36064();
         var16.method_17415();
         class_3542.method_16399();
         class_3542.method_16489();
         class_3542.method_16361();
         class_3542.method_16491();
      }
   }

   private void method_35941(float var1) {
      int var4 = this.field_40612.method_8552().method_43165();
      int var5 = this.field_40612.method_8552().method_43177();
      double var6 = class_9299.method_42794((double)var1, 2.0, 1.0);
      float var8 = 0.2F * var1;
      float var9 = 0.4F * var1;
      float var10 = 0.2F * var1;
      double var11 = (double)var4 * var6;
      double var13 = (double)var5 * var6;
      double var15 = ((double)var4 - var11) / 2.0;
      double var17 = ((double)var5 - var13) / 2.0;
      class_3542.method_16491();
      class_3542.method_16387(false);
      class_3542.method_16488();
      class_3542.method_16425(class_5033.field_26047, class_8535.field_43691, class_5033.field_26047, class_8535.field_43691);
      class_3542.method_16480(var8, var9, var10, 1.0F);
      this.field_40612.method_8577().method_35674(field_40614);
      class_8042 var19 = class_8042.method_36499();
      class_9633 var20 = var19.method_36501();
      var20.method_44471(7, class_7985.field_40912);
      var20.method_35761(var15, var17 + var13, -90.0).method_35745(0.0F, 1.0F).method_35735();
      var20.method_35761(var15 + var11, var17 + var13, -90.0).method_35745(1.0F, 1.0F).method_35735();
      var20.method_35761(var15 + var11, var17, -90.0).method_35745(1.0F, 0.0F).method_35735();
      var20.method_35761(var15, var17, -90.0).method_35745(0.0F, 0.0F).method_35735();
      var19.method_36500();
      class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
      class_3542.method_16437();
      class_3542.method_16448();
      class_3542.method_16387(true);
      class_3542.method_16428();
   }

   public float method_35956(float var1) {
      return class_9299.method_42795(var1, this.field_40632, this.field_40621);
   }

   public float method_35955() {
      return this.field_40640;
   }

   public class_9071 method_35949() {
      return this.field_40648;
   }

   public class_5778 method_35953() {
      return this.field_40623;
   }

   public class_5367 method_35936() {
      return this.field_40633;
   }
}
