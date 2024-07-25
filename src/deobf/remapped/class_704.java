package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Either;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraft.util.text.event.ClickEvent$class_47;

public abstract class class_704 extends class_5834 {
   public static final class_6097 field_3865 = class_6097.method_27938(0.6F, 1.8F);
   private static final Map<class_7653, class_6097> field_3875 = ImmutableMap.builder()
      .put(class_7653.field_38885, field_3865)
      .put(class_7653.field_38886, field_29629)
      .put(class_7653.field_38889, class_6097.method_27938(0.6F, 0.6F))
      .put(class_7653.field_38888, class_6097.method_27938(0.6F, 0.6F))
      .put(class_7653.field_38884, class_6097.method_27938(0.6F, 0.6F))
      .put(class_7653.field_38881, class_6097.method_27938(0.6F, 1.5F))
      .put(class_7653.field_38887, class_6097.method_27941(0.2F, 0.2F))
      .build();
   private static final class_7821<Float> field_3845 = class_8073.<Float>method_36641(class_704.class, class_2734.field_13350);
   private static final class_7821<Integer> field_3863 = class_8073.<Integer>method_36641(class_704.class, class_2734.field_13366);
   public static final class_7821<Byte> field_3873 = class_8073.<Byte>method_36641(class_704.class, class_2734.field_13361);
   public static final class_7821<Byte> field_3852 = class_8073.<Byte>method_36641(class_704.class, class_2734.field_13361);
   public static final class_7821<class_5734> field_3871 = class_8073.<class_5734>method_36641(class_704.class, class_2734.field_13346);
   public static final class_7821<class_5734> field_3870 = class_8073.<class_5734>method_36641(class_704.class, class_2734.field_13346);
   private long field_3861;
   public class_7051 field_3853 = new class_7051(this);
   public class_1031 field_3860 = new class_1031();
   public final class_3683 field_3869;
   public class_4088 field_3874;
   public class_9163 field_3867 = new class_9163();
   public int field_3877;
   public float field_3857;
   public float field_3859;
   public int field_3851;
   public double field_3849;
   public double field_3854;
   public double field_3843;
   public double field_3868;
   public double field_3864;
   public double field_3858;
   private int field_3848;
   public boolean field_3850;
   public final class_964 field_3876 = new class_964();
   public int field_3840;
   public int field_3862;
   public float field_3842;
   public int field_3847;
   public final float field_3856 = 0.02F;
   private int field_3846;
   private final GameProfile field_3872;
   private boolean field_3855;
   private class_6098 field_3844 = class_6098.field_31203;
   private final class_7200 field_3866 = this.method_3229();
   public class_3942 field_3841;

   public class_704(World var1, class_1331 var2, float var3, GameProfile var4) {
      super(class_6629.field_34300, var1);
      this.method_37377(method_3242(var4));
      this.field_3872 = var4;
      this.field_3869 = new class_3683(this.field_3853, !var1.field_33055, this);
      this.field_3874 = this.field_3869;
      this.method_37144((double)var2.method_12173() + 0.5, (double)(var2.method_12165() + 1), (double)var2.method_12185() + 0.5, var3, 0.0F);
      this.field_29648 = 180.0F;
   }

   public boolean method_3228(World var1, class_1331 var2, class_4666 var3) {
      if (!var3.method_21591()) {
         return false;
      } else if (var3 != class_4666.field_22756) {
         if (this.method_3181()) {
            return false;
         } else {
            class_6098 var6 = this.method_26446();
            return var6.method_28022() || !var6.method_28009(var1.method_29600(), new class_9115(var1, var2, false));
         }
      } else {
         return true;
      }
   }

   public static class_1313 method_3230() {
      return class_5834.method_26409()
         .method_5984(class_7331.field_37462, 1.0)
         .method_5984(class_7331.field_37465, 0.1F)
         .method_5983(class_7331.field_37466)
         .method_5983(class_7331.field_37469);
   }

   @Override
   public void method_37329() {
      super.method_37329();
      this.field_41735.method_36634(field_3845, 0.0F);
      this.field_41735.method_36634(field_3863, 0);
      this.field_41735.method_36634(field_3873, (byte)0);
      this.field_41735.method_36634(field_3852, (byte)1);
      this.field_41735.method_36634(field_3871, new class_5734());
      this.field_41735.method_36634(field_3870, new class_5734());
   }

   @Override
   public void method_37123() {
      this.field_41731 = this.method_37221();
      if (this.method_37221()) {
         this.field_41726 = false;
      }

      if (this.field_3851 > 0) {
         this.field_3851--;
      }

      if (!this.method_26507()) {
         if (this.field_3848 > 0) {
            this.field_3848++;
            if (this.field_3848 >= 110) {
               this.field_3848 = 0;
            }
         }
      } else {
         this.field_3848++;
         if (this.field_3848 > 100) {
            this.field_3848 = 100;
         }

         if (!this.field_41768.field_33055 && this.field_41768.method_29602()) {
            this.method_3162(false, true);
         }
      }

      this.method_3192();
      super.method_37123();
      if (!this.field_41768.field_33055 && this.field_3874 != null && !this.field_3874.method_18861(this)) {
         this.method_3207();
         this.field_3874 = this.field_3869;
      }

      this.method_3177();
      if (!this.field_41768.field_33055) {
         this.field_3867.method_42228(this);
         this.method_3209(class_6234.field_31835);
         if (this.method_37330()) {
            this.method_3209(class_6234.field_31889);
         }

         if (this.method_37073()) {
            this.method_3209(class_6234.field_31898);
         }

         if (!this.method_26507()) {
            this.method_3209(class_6234.field_31894);
         }
      }

      double var4 = class_9299.method_42827(this.method_37302(), -2.9999999E7, 2.9999999E7);
      double var6 = class_9299.method_42827(this.method_37156(), -2.9999999E7, 2.9999999E7);
      if (var4 != this.method_37302() || var6 != this.method_37156()) {
         this.method_37256(var4, this.method_37309(), var6);
      }

      this.field_29620++;
      class_6098 var8 = this.method_26446();
      if (!class_6098.method_27982(this.field_3844, var8)) {
         if (!class_6098.method_27984(this.field_3844, var8)) {
            this.method_3164();
         }

         this.field_3844 = var8.method_27973();
      }

      this.method_3182();
      this.field_3866.method_32959();
      this.method_3198();
   }

   public boolean method_3236() {
      return this.method_37252();
   }

   public boolean method_3199() {
      return this.method_37252();
   }

   public boolean method_3178() {
      return this.method_37252();
   }

   public boolean method_3192() {
      this.field_3850 = this.method_37261(class_6503.field_33094);
      return this.field_3850;
   }

   private void method_3182() {
      class_6098 var3 = this.method_26520(class_6943.field_35704);
      if (var3.method_27960() == class_4897.field_25139 && !this.method_37261(class_6503.field_33094)) {
         this.method_26558(new class_2250(Effects.field_19720, 200, 0, false, false, true));
      }
   }

   public class_7200 method_3229() {
      return new class_7200();
   }

   private void method_3177() {
      this.field_3849 = this.field_3868;
      this.field_3854 = this.field_3864;
      this.field_3843 = this.field_3858;
      double var3 = this.method_37302() - this.field_3868;
      double var5 = this.method_37309() - this.field_3864;
      double var7 = this.method_37156() - this.field_3858;
      double var9 = 10.0;
      if (var3 > 10.0) {
         this.field_3868 = this.method_37302();
         this.field_3849 = this.field_3868;
      }

      if (var7 > 10.0) {
         this.field_3858 = this.method_37156();
         this.field_3843 = this.field_3858;
      }

      if (var5 > 10.0) {
         this.field_3864 = this.method_37309();
         this.field_3854 = this.field_3864;
      }

      if (var3 < -10.0) {
         this.field_3868 = this.method_37302();
         this.field_3849 = this.field_3868;
      }

      if (var7 < -10.0) {
         this.field_3858 = this.method_37156();
         this.field_3843 = this.field_3858;
      }

      if (var5 < -10.0) {
         this.field_3864 = this.method_37309();
         this.field_3854 = this.field_3864;
      }

      this.field_3868 += var3 * 0.25;
      this.field_3858 += var7 * 0.25;
      this.field_3864 += var5 * 0.25;
   }

   public void method_3198() {
      if (this.method_37115(class_7653.field_38888)) {
         class_7653 var3;
         if (!this.method_26618()) {
            if (!this.method_26507()) {
               if (!this.method_37113()) {
                  if (!this.method_26600()) {
                     if (this.method_37252() && !this.field_3876.field_4942) {
                        var3 = class_7653.field_38881;
                     } else {
                        var3 = class_7653.field_38885;
                     }
                  } else {
                     var3 = class_7653.field_38884;
                  }
               } else {
                  var3 = class_7653.field_38888;
               }
            } else {
               var3 = class_7653.field_38886;
            }
         } else {
            var3 = class_7653.field_38889;
         }

         class_7653 var4;
         if (this.method_37221() || this.method_37070() || this.method_37115(var3)) {
            var4 = var3;
         } else if (!this.method_37115(class_7653.field_38881)) {
            var4 = class_7653.field_38888;
         } else {
            var4 = class_7653.field_38881;
         }

         this.method_37356(var4);
      }
   }

   @Override
   public int method_37244() {
      return !this.field_3876.field_4940 ? 80 : 1;
   }

   @Override
   public class_8461 method_37239() {
      return class_463.field_2304;
   }

   @Override
   public class_8461 method_37133() {
      return class_463.field_2360;
   }

   @Override
   public class_8461 method_37357() {
      return class_463.field_2055;
   }

   @Override
   public int method_37300() {
      return 10;
   }

   @Override
   public void method_37155(class_8461 var1, float var2, float var3) {
      this.field_41768.method_29528(this, this.method_37302(), this.method_37309(), this.method_37156(), var1, this.method_37197(), var2, var3);
   }

   public void method_3172(class_8461 var1, class_562 var2, float var3, float var4) {
   }

   @Override
   public class_562 method_37197() {
      return class_562.field_3335;
   }

   @Override
   public int method_37112() {
      return 20;
   }

   @Override
   public void method_37336(byte var1) {
      if (var1 != 9) {
         if (var1 != 23) {
            if (var1 != 22) {
               if (var1 != 43) {
                  super.method_37336(var1);
               } else {
                  this.method_3250(class_3090.field_15385);
               }
            } else {
               this.field_3855 = true;
            }
         } else {
            this.field_3855 = false;
         }
      } else {
         this.method_26527();
      }
   }

   private void method_3250(class_5079 var1) {
      for (int var4 = 0; var4 < 5; var4++) {
         double var5 = this.field_41717.nextGaussian() * 0.02;
         double var7 = this.field_41717.nextGaussian() * 0.02;
         double var9 = this.field_41717.nextGaussian() * 0.02;
         this.field_41768.method_43361(var1, this.method_37361(1.0), this.method_37255() + 1.0, this.method_37383(1.0), var5, var7, var9);
      }
   }

   public void method_3207() {
      this.field_3874 = this.field_3869;
   }

   @Override
   public void method_37189() {
      if (this.method_3199() && this.method_37070()) {
         this.method_37390();
         this.method_37234(false);
      } else {
         double var3 = this.method_37302();
         double var5 = this.method_37309();
         double var7 = this.method_37156();
         super.method_37189();
         this.field_3857 = this.field_3859;
         this.field_3859 = 0.0F;
         this.method_3196(this.method_37302() - var3, this.method_37309() - var5, this.method_37156() - var7);
      }
   }

   @Override
   public void method_37100() {
      this.method_37356(class_7653.field_38885);
      super.method_37100();
      this.method_26456(this.method_26465());
      this.field_29677 = 0;
   }

   @Override
   public void method_26417() {
      super.method_26417();
      this.method_26489();
      this.field_29618 = this.field_41701;
   }

   @Override
   public void method_26606() {
      if (this.field_3877 > 0) {
         this.field_3877--;
      }

      if (this.field_41768.method_43370() == class_423.field_1790 && this.field_41768.method_29537().method_1285(class_291.field_1049)) {
         if (this.method_26551() < this.method_26465() && this.field_41697 % 20 == 0) {
            this.method_26457(1.0F);
         }

         if (this.field_3867.method_42227() && this.field_41697 % 10 == 0) {
            this.field_3867.method_42235(this.field_3867.method_42238() + 1);
         }
      }

      this.field_3853.method_32429();
      this.field_3857 = this.field_3859;
      super.method_26606();
      this.field_29674 = 0.02F;
      if (this.method_37321()) {
         this.field_29674 = (float)((double)this.field_29674 + 0.005999999865889549);
      }

      this.method_26461((float)this.method_26575(class_7331.field_37465));
      float var3;
      if (this.field_41726 && !this.method_26450() && !this.method_37113()) {
         var3 = Math.min(0.1F, class_9299.method_42842(method_37266(this.method_37098())));
      } else {
         var3 = 0.0F;
      }

      this.field_3859 = this.field_3859 + (var3 - this.field_3859) * 0.4F;
      if (this.method_26551() > 0.0F && !this.method_37221()) {
         class_4092 var4;
         if (this.method_37070() && !this.method_37243().field_41751) {
            var4 = this.method_37241().method_18905(this.method_37243().method_37241()).method_18899(1.0, 0.0, 1.0);
         } else {
            var4 = this.method_37241().method_18899(1.0, 0.5, 1.0);
         }

         List var5 = this.field_41768.method_25870(this, var4);

         for (int var6 = 0; var6 < var5.size(); var6++) {
            Entity var7 = (Entity)var5.get(var6);
            if (!var7.field_41751) {
               this.method_3248(var7);
            }
         }
      }

      this.method_3222(this.method_3160());
      this.method_3222(this.method_3171());
      if (!this.field_41768.field_33055 && (this.field_41706 > 0.5F || this.method_37285()) || this.field_3876.field_4942 || this.method_26507()) {
         this.method_3157();
      }
   }

   private void method_3222(class_5734 var1) {
      if (var1 != null && (!var1.method_25938("Silent") || !var1.method_25933("Silent")) && this.field_41768.field_33033.nextInt(200) == 0) {
         String var4 = var1.method_25965("id");
         class_6629.method_30460(var4)
            .filter(var0 -> var0 == class_6629.field_34228)
            .ifPresent(
               var1x -> {
                  if (!class_107.method_325(this.field_41768, this)) {
                     this.field_41768
                        .method_29528(
                           (class_704)null,
                           this.method_37302(),
                           this.method_37309(),
                           this.method_37156(),
                           class_107.method_322(this.field_41768, this.field_41768.field_33033),
                           this.method_37197(),
                           1.0F,
                           class_107.method_324(this.field_41768.field_33033)
                        );
                  }
               }
            );
      }
   }

   private void method_3248(Entity var1) {
      var1.method_37347(this);
   }

   public int method_3227() {
      return this.field_41735.<Integer>method_36640(field_3863);
   }

   public void method_3215(int var1) {
      this.field_41735.method_36633(field_3863, var1);
   }

   public void method_3176(int var1) {
      int var4 = this.method_3227();
      this.field_41735.method_36633(field_3863, var4 + var1);
   }

   @Override
   public void method_26452(class_6199 var1) {
      super.method_26452(var1);
      this.method_37351();
      if (!this.method_37221()) {
         this.method_26513(var1);
      }

      if (var1 == null) {
         this.method_37214(0.0, 0.1, 0.0);
      } else {
         this.method_37214(
            (double)(-class_9299.method_42840((this.field_29608 + this.field_41701) * (float) (Math.PI / 180.0)) * 0.1F),
            0.1F,
            (double)(-class_9299.method_42818((this.field_29608 + this.field_41701) * (float) (Math.PI / 180.0)) * 0.1F)
         );
      }

      this.method_3209(class_6234.field_31827);
      this.method_3166(class_6234.field_31829.method_43790(class_6234.field_31889));
      this.method_3166(class_6234.field_31829.method_43790(class_6234.field_31894));
      this.method_37136();
      this.method_37220(0, false);
   }

   @Override
   public void method_26522() {
      super.method_26522();
      if (!this.field_41768.method_29537().method_1285(class_291.field_1051)) {
         this.method_3156();
         this.field_3853.method_32411();
      }
   }

   public void method_3156() {
      for (int var3 = 0; var3 < this.field_3853.method_31505(); var3++) {
         class_6098 var4 = this.field_3853.method_31498(var3);
         if (!var4.method_28022() && class_2931.method_13408(var4)) {
            this.field_3853.method_31507(var3);
         }
      }
   }

   @Override
   public class_8461 method_26541(class_6199 var1) {
      if (var1 != class_6199.field_31665) {
         if (var1 != class_6199.field_31671) {
            return var1 != class_6199.field_31687 ? class_463.field_2537 : class_463.field_2514;
         } else {
            return class_463.field_2475;
         }
      } else {
         return class_463.field_2169;
      }
   }

   @Override
   public class_8461 method_26599() {
      return class_463.field_2701;
   }

   public boolean method_3235(boolean var1) {
      return this.method_3154(
            this.field_3853
               .method_31497(
                  this.field_3853.field_36404, var1 && !this.field_3853.method_32403().method_28022() ? this.field_3853.method_32403().method_27997() : 1
               ),
            false,
            true
         )
         != null;
   }

   @Nullable
   public class_91 method_3153(class_6098 var1, boolean var2) {
      return this.method_3154(var1, false, var2);
   }

   @Nullable
   public class_91 method_3154(class_6098 var1, boolean var2, boolean var3) {
      if (!var1.method_28022()) {
         if (this.field_41768.field_33055 && class_3347.method_15348().method_2055() >= class_412.field_1742.method_2055()) {
            this.method_26597(class_2584.field_12791);
         }

         double var6 = this.method_37388() - 0.3F;
         class_91 var8 = new class_91(this.field_41768, this.method_37302(), var6, this.method_37156(), var1);
         var8.method_254(40);
         if (var3) {
            var8.method_265(this.method_37328());
         }

         if (!var2) {
            float var9 = 0.3F;
            float var10 = class_9299.method_42818(this.field_41755 * (float) (Math.PI / 180.0));
            float var11 = class_9299.method_42840(this.field_41755 * (float) (Math.PI / 180.0));
            float var12 = class_9299.method_42818(this.field_41701 * (float) (Math.PI / 180.0));
            float var13 = class_9299.method_42840(this.field_41701 * (float) (Math.PI / 180.0));
            float var14 = this.field_41717.nextFloat() * (float) (Math.PI * 2);
            float var15 = 0.02F * this.field_41717.nextFloat();
            var8.method_37214(
               (double)(-var12 * var11 * 0.3F) + Math.cos((double)var14) * (double)var15,
               (double)(-var10 * 0.3F + 0.1F + (this.field_41717.nextFloat() - this.field_41717.nextFloat()) * 0.1F),
               (double)(var13 * var11 * 0.3F) + Math.sin((double)var14) * (double)var15
            );
         } else {
            float var16 = this.field_41717.nextFloat() * 0.5F;
            float var17 = this.field_41717.nextFloat() * (float) (Math.PI * 2);
            var8.method_37214((double)(-class_9299.method_42818(var17) * var16), 0.2F, (double)(class_9299.method_42840(var17) * var16));
         }

         return var8;
      } else {
         return null;
      }
   }

   public float method_3239(class_2522 var1) {
      float var4 = this.field_3853.method_32413(var1);
      if (var4 > 1.0F) {
         int var5 = class_2931.method_13414(this);
         class_6098 var6 = this.method_26446();
         if (var5 > 0 && !var6.method_28022()) {
            var4 += (float)(var5 * var5 + 1);
         }
      }

      if (class_1493.method_6892(this)) {
         var4 *= 1.0F + (float)(class_1493.method_6888(this) + 1) * 0.2F;
      }

      if (this.method_26480(Effects.field_19748)) {
         float var7;
         switch (this.method_26553(Effects.field_19748).method_10333()) {
            case 0:
               var7 = 0.3F;
               break;
            case 1:
               var7 = 0.09F;
               break;
            case 2:
               var7 = 0.0027F;
               break;
            case 3:
            default:
               var7 = 8.1E-4F;
         }

         var4 *= var7;
      }

      if (this.method_37261(class_6503.field_33094) && !class_2931.method_13403(this)) {
         var4 /= 5.0F;
      }

      if (!this.field_41726) {
         var4 /= 5.0F;
      }

      return var4;
   }

   public boolean method_3232(class_2522 var1) {
      return !var1.method_8376() || this.field_3853.method_32403().method_28025(var1);
   }

   @Override
   public void method_37314(class_5734 var1) {
      super.method_37314(var1);
      this.method_37377(method_3242(this.field_3872));
      class_3416 var4 = var1.method_25927("Inventory", 10);
      this.field_3853.method_32423(var4);
      this.field_3853.field_36404 = var1.method_25947("SelectedItemSlot");
      this.field_3848 = var1.method_25956("SleepTimer");
      this.field_3842 = var1.method_25955("XpP");
      this.field_3840 = var1.method_25947("XpLevel");
      this.field_3862 = var1.method_25947("XpTotal");
      this.field_3847 = var1.method_25947("XpSeed");
      if (this.field_3847 == 0) {
         this.field_3847 = this.field_41717.nextInt();
      }

      this.method_3215(var1.method_25947("Score"));
      this.field_3867.method_42230(var1);
      this.field_3876.method_4232(var1);
      this.method_26561(class_7331.field_37465).method_45006((double)this.field_3876.method_4229());
      if (var1.method_25939("EnderItems", 9)) {
         this.field_3860.method_21549(var1.method_25927("EnderItems", 10));
      }

      if (var1.method_25939("ShoulderEntityLeft", 10)) {
         this.method_3241(var1.method_25937("ShoulderEntityLeft"));
      }

      if (var1.method_25939("ShoulderEntityRight", 10)) {
         this.method_3165(var1.method_25937("ShoulderEntityRight"));
      }
   }

   @Override
   public void method_37376(class_5734 var1) {
      super.method_37376(var1);
      var1.method_25931("DataVersion", class_7665.method_34674().getWorldVersion());
      var1.method_25946("Inventory", this.field_3853.method_32396(new class_3416()));
      var1.method_25931("SelectedItemSlot", this.field_3853.field_36404);
      var1.method_25958("SleepTimer", (short)this.field_3848);
      var1.method_25920("XpP", this.field_3842);
      var1.method_25931("XpLevel", this.field_3840);
      var1.method_25931("XpTotal", this.field_3862);
      var1.method_25931("XpSeed", this.field_3847);
      var1.method_25931("Score", this.method_3227());
      this.field_3867.method_42233(var1);
      this.field_3876.method_4234(var1);
      var1.method_25946("EnderItems", this.field_3860.method_21552());
      if (!this.method_3160().method_25940()) {
         var1.method_25946("ShoulderEntityLeft", this.method_3160());
      }

      if (!this.method_3171().method_25940()) {
         var1.method_25946("ShoulderEntityRight", this.method_3171());
      }
   }

   @Override
   public boolean method_37180(class_6199 var1) {
      if (!super.method_37180(var1)) {
         if (var1 != class_6199.field_31671) {
            if (var1 != class_6199.field_31684) {
               return !var1.method_28360() ? false : !this.field_41768.method_29537().method_1285(class_291.field_1032);
            } else {
               return !this.field_41768.method_29537().method_1285(class_291.field_1044);
            }
         } else {
            return !this.field_41768.method_29537().method_1285(class_291.field_1048);
         }
      } else {
         return true;
      }
   }

   @Override
   public boolean method_37181(class_6199 var1, float var2) {
      if (!this.method_37180(var1)) {
         if (this.field_3876.field_4940 && !var1.method_28346()) {
            return false;
         } else {
            this.field_29658 = 0;
            if (!this.method_26450()) {
               this.method_3157();
               if (var1.method_28374()) {
                  if (this.field_41768.method_43370() == class_423.field_1790) {
                     var2 = 0.0F;
                  }

                  if (this.field_41768.method_43370() == class_423.field_1784) {
                     var2 = Math.min(var2 / 2.0F + 1.0F, var2);
                  }

                  if (this.field_41768.method_43370() == class_423.field_1782) {
                     var2 = var2 * 3.0F / 2.0F;
                  }
               }

               return var2 != 0.0F ? super.method_37181(var1, var2) : false;
            } else {
               return false;
            }
         }
      } else {
         return false;
      }
   }

   @Override
   public void method_26548(class_5834 var1) {
      super.method_26548(var1);
      if (var1.method_26446().method_27960() instanceof class_7938) {
         this.method_3185(true);
      }
   }

   public boolean method_3213(class_704 var1) {
      class_5086 var4 = this.method_37095();
      class_5086 var5 = var1.method_37095();
      if (var4 != null) {
         return var4.method_23384(var5) ? var4.method_23376() : true;
      } else {
         return true;
      }
   }

   @Override
   public void method_26524(class_6199 var1, float var2) {
      this.field_3853.method_32400(var1, var2);
   }

   @Override
   public void method_26451(float var1) {
      if (this.field_29668.method_27960() == class_4897.field_24840) {
         if (!this.field_41768.field_33055) {
            this.method_3211(class_6234.field_31907.method_43790(this.field_29668.method_27960()));
         }

         if (var1 >= 3.0F) {
            int var4 = 1 + class_9299.method_42848(var1);
            class_2584 var5 = this.method_26500();
            this.field_29668.method_28003(var4, this, var1x -> var1x.method_26447(var5));
            if (this.field_29668.method_28022()) {
               if (var5 != class_2584.field_12791) {
                  this.method_37349(class_6943.field_35701, class_6098.field_31203);
               } else {
                  this.method_37349(class_6943.field_35707, class_6098.field_31203);
               }

               this.field_29668 = class_6098.field_31203;
               this.method_37155(class_463.field_2764, 0.8F, 0.8F + this.field_41768.field_33033.nextFloat() * 0.4F);
            }
         }
      }
   }

   @Override
   public void method_26574(class_6199 var1, float var2) {
      if (!this.method_37180(var1)) {
         var2 = this.method_26555(var1, var2);
         var2 = this.method_26477(var1, var2);
         float var5 = Math.max(var2 - this.method_26493(), 0.0F);
         this.method_26460(this.method_26493() - (var2 - var5));
         float var6 = var2 - var5;
         if (var6 > 0.0F && var6 < 3.4028235E37F) {
            this.method_3210(class_6234.field_31853, Math.round(var6 * 10.0F));
         }

         if (var5 != 0.0F) {
            this.method_3170(var1.method_28381());
            float var7 = this.method_26551();
            this.method_26456(this.method_26551() - var5);
            this.method_26476().method_15875(var1, var7, var5);
            if (var5 < 3.4028235E37F) {
               this.method_3210(class_6234.field_31901, Math.round(var5 * 10.0F));
            }
         }
      }
   }

   @Override
   public boolean method_26444() {
      return !this.field_3876.field_4942 && super.method_26444();
   }

   public void method_3244(class_8398 var1) {
   }

   public void method_3243(class_8116 var1) {
   }

   public void method_3193(class_7454 var1) {
   }

   public void method_3218(class_945 var1) {
   }

   public void method_3201(class_6786 var1) {
   }

   public void method_3191(class_4109 var1, class_6867 var2) {
   }

   public OptionalInt method_3152(class_4259 var1) {
      return OptionalInt.empty();
   }

   public void method_3169(int var1, class_2795 var2, int var3, int var4, boolean var5, boolean var6) {
   }

   public void method_3174(class_6098 var1, class_2584 var2) {
   }

   public class_6910 method_3204(Entity var1, class_2584 var2) {
      if (!this.method_37221()) {
         class_6098 var5 = this.method_26617(var2);
         class_6098 var6 = var5.method_27973();
         class_6910 var7 = var1.method_37128(this, var2);
         if (!var7.method_31662()) {
            if (!var5.method_28022() && var1 instanceof class_5834) {
               if (this.field_3876.field_4944) {
                  var5 = var6;
               }

               class_6910 var8 = var5.method_28000(this, (class_5834)var1, var2);
               if (var8.method_31662()) {
                  if (var5.method_28022() && !this.field_3876.field_4944) {
                     this.method_26615(var2, class_6098.field_31203);
                  }

                  return var8;
               }
            }

            return class_6910.field_35521;
         } else {
            if (this.field_3876.field_4944 && var5 == this.method_26617(var2) && var5.method_27997() < var6.method_27997()) {
               var5.method_28017(var6.method_27997());
            }

            return var7;
         }
      } else {
         if (var1 instanceof class_4259) {
            this.method_3152((class_4259)var1);
         }

         return class_6910.field_35521;
      }
   }

   @Override
   public double method_37106() {
      return -0.35;
   }

   @Override
   public void method_37389() {
      super.method_37389();
      this.field_41773 = 0;
   }

   @Override
   public boolean method_26468() {
      return super.method_26468() || this.method_26507();
   }

   @Override
   public boolean method_26498() {
      return !this.field_3876.field_4942;
   }

   @Override
   public class_1343 method_37295(class_1343 var1, class_7412 var2) {
      class_7982 var5 = new class_7982(true);
      SigmaMainClass.method_3328().method_3302().method_7914(var5);
      if (var5.method_36185() == class_9528.field_48495
         || !this.field_3876.field_4942 && (var2 == class_7412.field_37839 || var2 == class_7412.field_37842) && this.method_3178() && this.method_3217()) {
         double var6 = var1.field_7336;
         double var8 = var1.field_7334;
         double var10 = 0.05;

         while (var6 != 0.0 && this.field_41768.method_6683(this, this.method_37241().method_18918(var6, (double)(-this.field_41733), 0.0))) {
            if (var6 < 0.05 && var6 >= -0.05) {
               var6 = 0.0;
            } else if (!(var6 > 0.0)) {
               var6 += 0.05;
            } else {
               var6 -= 0.05;
            }
         }

         while (var8 != 0.0 && this.field_41768.method_6683(this, this.method_37241().method_18918(0.0, (double)(-this.field_41733), var8))) {
            if (var8 < 0.05 && var8 >= -0.05) {
               var8 = 0.0;
            } else if (!(var8 > 0.0)) {
               var8 += 0.05;
            } else {
               var8 -= 0.05;
            }
         }

         while (var6 != 0.0 && var8 != 0.0 && this.field_41768.method_6683(this, this.method_37241().method_18918(var6, (double)(-this.field_41733), var8))) {
            if (var6 < 0.05 && var6 >= -0.05) {
               var6 = 0.0;
            } else if (!(var6 > 0.0)) {
               var6 += 0.05;
            } else {
               var6 -= 0.05;
            }

            if (var8 < 0.05 && var8 >= -0.05) {
               var8 = 0.0;
            } else if (!(var8 > 0.0)) {
               var8 += 0.05;
            } else {
               var8 -= 0.05;
            }
         }

         var1 = new class_1343(var6, var1.field_7333, var8);
      }

      class_7982 var12 = new class_7982(false);
      SigmaMainClass.method_3328().method_3302().method_7914(var12);
      return var1;
   }

   private boolean method_3217() {
      return this.field_41726
         || this.field_41706 < this.field_41733
            && !this.field_41768.method_6683(this, this.method_37241().method_18918(0.0, (double)(this.field_41706 - this.field_41733), 0.0));
   }

   public void method_3158(Entity var1) {
      if (var1.method_37394() && !var1.method_37296(this)) {
         float var4 = (float)this.method_26575(class_7331.field_37462);
         float var5;
         if (!(var1 instanceof class_5834)) {
            var5 = class_2931.method_13425(this.method_26446(), class_2780.field_13574);
         } else {
            var5 = class_2931.method_13425(this.method_26446(), ((class_5834)var1).method_26550());
         }

         float var6 = this.method_3203(0.5F);
         var4 *= 0.2F + var6 * var6 * 0.8F;
         var5 *= var6;
         this.method_3164();
         if (var4 > 0.0F || var5 > 0.0F) {
            boolean var7 = var6 > 0.9F;
            boolean var8 = false;
            int var9 = 0;
            var9 += class_2931.method_13433(this);
            if (this.method_37321() && var7) {
               this.field_41768
                  .method_29528(
                     (class_704)null, this.method_37302(), this.method_37309(), this.method_37156(), class_463.field_2608, this.method_37197(), 1.0F, 1.0F
                  );
               var9++;
               var8 = true;
            }

            boolean var10 = var7
               && this.field_41706 > 0.0F
               && !this.field_41726
               && !this.method_26505()
               && !this.method_37285()
               && !this.method_26480(Effects.field_19736)
               && !this.method_37070()
               && var1 instanceof class_5834;
            var10 = var10 && !this.method_37321();
            if (var10) {
               var4 *= 1.5F;
            }

            var4 += var5;
            boolean var11 = false;
            double var12 = (double)(this.field_41695 - this.field_41705);
            if (var7 && !var10 && !var8 && this.field_41726 && var12 < (double)this.method_26423()) {
               class_6098 var14 = this.method_26617(class_2584.field_12791);
               if (var14.method_27960() instanceof class_2235) {
                  var11 = true;
               }
            }

            float var28 = 0.0F;
            boolean var15 = false;
            int var16 = class_2931.method_13410(this);
            if (var1 instanceof class_5834) {
               var28 = ((class_5834)var1).method_26551();
               if (var16 > 0 && !var1.method_37264()) {
                  var15 = true;
                  var1.method_37178(1);
               }
            }

            class_1343 var17 = var1.method_37098();
            boolean var18 = var1.method_37181(class_6199.method_28344(this), var4);
            if (!var18) {
               this.field_41768
                  .method_29528(
                     (class_704)null, this.method_37302(), this.method_37309(), this.method_37156(), class_463.field_2415, this.method_37197(), 1.0F, 1.0F
                  );
               if (var15) {
                  var1.method_37136();
               }
            } else {
               if (var9 > 0) {
                  if (!(var1 instanceof class_5834)) {
                     var1.method_37186(
                        (double)(-class_9299.method_42818(this.field_41701 * (float) (Math.PI / 180.0)) * (float)var9 * 0.5F),
                        0.1,
                        (double)(class_9299.method_42840(this.field_41701 * (float) (Math.PI / 180.0)) * (float)var9 * 0.5F)
                     );
                  } else {
                     ((class_5834)var1)
                        .method_26567(
                           (float)var9 * 0.5F,
                           (double)class_9299.method_42818(this.field_41701 * (float) (Math.PI / 180.0)),
                           (double)(-class_9299.method_42840(this.field_41701 * (float) (Math.PI / 180.0)))
                        );
                  }

                  this.method_37215(this.method_37098().method_6210(0.6, 1.0, 0.6));
                  this.method_37140(false);
               }

               if (var11) {
                  float var19 = 1.0F + class_2931.method_13405(this) * var4;

                  for (class_5834 var21 : this.field_41768.<class_5834>method_25868(class_5834.class, var1.method_37241().method_18899(1.0, 0.25, 1.0))) {
                     if (var21 != this
                        && var21 != var1
                        && !this.method_37344(var21)
                        && (!(var21 instanceof class_9399) || !((class_9399)var21).method_43493())
                        && this.method_37275(var21) < 9.0) {
                        var21.method_26567(
                           0.4F,
                           (double)class_9299.method_42818(this.field_41701 * (float) (Math.PI / 180.0)),
                           (double)(-class_9299.method_42840(this.field_41701 * (float) (Math.PI / 180.0)))
                        );
                        var21.method_37181(class_6199.method_28344(this), var19);
                     }
                  }

                  this.field_41768
                     .method_29528(
                        (class_704)null, this.method_37302(), this.method_37309(), this.method_37156(), class_463.field_2422, this.method_37197(), 1.0F, 1.0F
                     );
                  this.method_3188();
               }

               if (var1 instanceof class_9359 && var1.field_41743) {
                  ((class_9359)var1).field_47794.method_4156(new class_4548(var1));
                  var1.field_41743 = false;
                  var1.method_37215(var17);
               }

               if (var10) {
                  this.field_41768
                     .method_29528(
                        (class_704)null, this.method_37302(), this.method_37309(), this.method_37156(), class_463.field_2527, this.method_37197(), 1.0F, 1.0F
                     );
                  this.method_3233(var1);
               }

               if (!var10 && !var11) {
                  if (!var7) {
                     this.field_41768
                        .method_29528(
                           (class_704)null,
                           this.method_37302(),
                           this.method_37309(),
                           this.method_37156(),
                           class_463.field_2069,
                           this.method_37197(),
                           1.0F,
                           1.0F
                        );
                  } else {
                     this.field_41768
                        .method_29528(
                           (class_704)null,
                           this.method_37302(),
                           this.method_37309(),
                           this.method_37156(),
                           class_463.field_2035,
                           this.method_37197(),
                           1.0F,
                           1.0F
                        );
                  }
               }

               if (var5 > 0.0F) {
                  this.method_3226(var1);
               }

               this.method_26510(var1);
               if (var1 instanceof class_5834) {
                  class_2931.method_13429((class_5834)var1, this);
               }

               class_2931.method_13406(this, var1);
               class_6098 var29 = this.method_26446();
               Object var30 = var1;
               if (var1 instanceof class_5708) {
                  var30 = ((class_5708)var1).field_28882;
               }

               if (!this.field_41768.field_33055 && !var29.method_28022() && var30 instanceof class_5834) {
                  var29.method_27974((class_5834)var30, this);
                  if (var29.method_28022()) {
                     this.method_26615(class_2584.field_12791, class_6098.field_31203);
                  }
               }

               if (var1 instanceof class_5834) {
                  float var31 = var28 - ((class_5834)var1).method_26551();
                  this.method_3210(class_6234.field_31831, Math.round(var31 * 10.0F));
                  if (var16 > 0) {
                     var1.method_37178(var16 * 4);
                  }

                  if (this.field_41768 instanceof class_6331 && var31 > 2.0F) {
                     int var22 = (int)((double)var31 * 0.5);
                     ((class_6331)this.field_41768)
                        .method_28957(class_3090.field_15323, var1.method_37302(), var1.method_37080(0.5), var1.method_37156(), var22, 0.1, 0.0, 0.1, 0.2);
                  }
               }

               this.method_3170(0.1F);
            }
         }
      }
   }

   @Override
   public void method_26539(class_5834 var1) {
      this.method_3158(var1);
   }

   public void method_3185(boolean var1) {
      float var4 = 0.25F + (float)class_2931.method_13414(this) * 0.05F;
      if (var1) {
         var4 += 0.75F;
      }

      if (this.field_41717.nextFloat() < var4) {
         this.method_3173().method_32957(class_4897.field_24840, 100);
         this.method_26529();
         this.field_41768.method_29587(this, (byte)30);
      }
   }

   public void method_3233(Entity var1) {
   }

   public void method_3226(Entity var1) {
   }

   public void method_3188() {
      double var3 = (double)(-class_9299.method_42818(this.field_41701 * (float) (Math.PI / 180.0)));
      double var5 = (double)class_9299.method_42840(this.field_41701 * (float) (Math.PI / 180.0));
      if (this.field_41768 instanceof class_6331) {
         ((class_6331)this.field_41768)
            .method_28957(class_3090.field_15362, this.method_37302() + var3, this.method_37080(0.5), this.method_37156() + var5, 0, var3, 0.0, var5, 0.0);
      }
   }

   public void method_3205() {
   }

   @Override
   public void method_37204() {
      super.method_37204();
      this.field_3869.method_18876(this);
      if (this.field_3874 != null) {
         this.field_3874.method_18876(this);
      }
   }

   public boolean method_3183() {
      return false;
   }

   public GameProfile method_3247() {
      return this.field_3872;
   }

   public Either<class_8614, Unit> method_3200(class_1331 var1) {
      this.method_26470(var1);
      this.field_3848 = 0;
      return Either.right(Unit.INSTANCE);
   }

   public void method_3162(boolean var1, boolean var2) {
      super.method_26557();
      if (this.field_41768 instanceof class_6331 && var2) {
         ((class_6331)this.field_41768).method_28928();
      }

      this.field_3848 = !var1 ? 100 : 0;
   }

   @Override
   public void method_26557() {
      this.method_3162(true, true);
   }

   public static Optional<class_1343> method_3167(class_6331 var0, class_1331 var1, float var2, boolean var3, boolean var4) {
      class_2522 var7 = var0.method_28262(var1);
      class_6414 var8 = var7.method_8360();
      if (var8 instanceof class_545 && var7.<Integer>method_10313(class_545.field_3268) > 0 && class_545.method_2640(var0)) {
         Optional var11 = class_545.method_2633(class_6629.field_34300, var0, var1);
         if (!var4 && var11.isPresent()) {
            var0.method_7513(var1, var7.method_10308(class_545.field_3268, Integer.valueOf(var7.<Integer>method_10313(class_545.field_3268) - 1)), 3);
         }

         return var11;
      } else if (var8 instanceof class_3633 && class_3633.method_16930(var0)) {
         return class_3633.method_16932(class_6629.field_34300, var0, var1, var2);
      } else if (!var3) {
         return Optional.<class_1343>empty();
      } else {
         boolean var9 = var8.method_29278();
         boolean var10 = var0.method_28262(var1.method_6081()).method_8360().method_29278();
         return var9 && var10
            ? Optional.<class_1343>of(new class_1343((double)var1.method_12173() + 0.5, (double)var1.method_12165() + 0.1, (double)var1.method_12185() + 0.5))
            : Optional.<class_1343>empty();
      }
   }

   public boolean method_3195() {
      return this.method_26507() && this.field_3848 >= 100;
   }

   public int method_3202() {
      return this.field_3848;
   }

   public void method_3251(ITextComponent var1, boolean var2) {
   }

   public void method_3209(Identifier var1) {
      this.method_3211(class_6234.field_31829.method_43790(var1));
   }

   public void method_3210(Identifier var1, int var2) {
      this.method_3212(class_6234.field_31829.method_43790(var1), var2);
   }

   public void method_3211(class_6676<?> var1) {
      this.method_3212(var1, 1);
   }

   public void method_3212(class_6676<?> var1, int var2) {
   }

   public void method_3166(class_6676<?> var1) {
   }

   public int method_3223(Collection<class_8932<?>> var1) {
      return 0;
   }

   public void method_3224(Identifier[] var1) {
   }

   public int method_3197(Collection<class_8932<?>> var1) {
      return 0;
   }

   @Override
   public void method_26595() {
      super.method_26595();
      this.method_3209(class_6234.field_31856);
      if (!this.method_37321()) {
         this.method_3170(0.05F);
      } else {
         this.method_3170(0.2F);
      }
   }

   @Override
   public void method_26431(class_1343 var1) {
      double var4 = this.method_37302();
      double var6 = this.method_37309();
      double var8 = this.method_37156();
      if (this.method_37113() && !this.method_37070()) {
         double var10 = this.method_37246().field_7333;
         double var12 = !(var10 < -0.2) ? 0.06 : 0.085;
         if (var10 <= 0.0
            || this.field_29654
            || !this.field_41768
               .method_28262(new class_1331(this.method_37302(), this.method_37309() + 1.0 - 0.1, this.method_37156()))
               .method_8364()
               .method_22001()) {
            class_1343 var14 = this.method_37098();
            this.method_37215(var14.method_6214(0.0, (var10 - var14.field_7333) * var12, 0.0));
         }
      }

      if (this.field_3876.field_4942 && !this.method_37070()) {
         double var17 = this.method_37098().field_7333;
         float var15 = this.field_29674;
         this.field_29674 = this.field_3876.method_4230() * (float)(!this.method_37321() ? 1 : 2);
         super.method_26431(var1);
         class_1343 var16 = this.method_37098();
         this.method_37214(var16.field_7336, var17 * 0.6, var16.field_7334);
         this.field_29674 = var15;
         this.field_41706 = 0.0F;
         this.method_37220(7, false);
      } else {
         super.method_26431(var1);
      }

      this.method_3214(this.method_37302() - var4, this.method_37309() - var6, this.method_37156() - var8);
   }

   @Override
   public void method_37337() {
      if (!this.field_3876.field_4942) {
         super.method_37337();
      } else {
         this.method_37260(false);
      }
   }

   public boolean method_3240(class_1331 var1) {
      return !this.field_41768.method_28262(var1).method_8313(this.field_41768, var1);
   }

   @Override
   public float method_26423() {
      return (float)this.method_26575(class_7331.field_37465);
   }

   public void method_3214(double var1, double var3, double var5) {
      if (!this.method_37070()) {
         if (!this.method_37113()) {
            if (!this.method_37261(class_6503.field_33094)) {
               if (!this.method_37285()) {
                  if (!this.method_26505()) {
                     if (!this.field_41726) {
                        if (!this.method_26618()) {
                           int var9 = Math.round(class_9299.method_42842(var1 * var1 + var5 * var5) * 100.0F);
                           if (var9 > 25) {
                              this.method_3210(class_6234.field_31868, var9);
                           }
                        } else {
                           int var10 = Math.round(class_9299.method_42842(var1 * var1 + var3 * var3 + var5 * var5) * 100.0F);
                           this.method_3210(class_6234.field_31890, var10);
                        }
                     } else {
                        int var11 = Math.round(class_9299.method_42842(var1 * var1 + var5 * var5) * 100.0F);
                        if (var11 > 0) {
                           if (!this.method_37321()) {
                              if (!this.method_37382()) {
                                 this.method_3210(class_6234.field_31857, var11);
                                 this.method_3170(0.0F * (float)var11 * 0.01F);
                              } else {
                                 this.method_3210(class_6234.field_31843, var11);
                                 this.method_3170(0.0F * (float)var11 * 0.01F);
                              }
                           } else {
                              this.method_3210(class_6234.field_31899, var11);
                              this.method_3170(0.1F * (float)var11 * 0.01F);
                           }
                        }
                     }
                  } else if (var3 > 0.0) {
                     this.method_3210(class_6234.field_31845, (int)Math.round(var3 * 100.0));
                  }
               } else {
                  int var12 = Math.round(class_9299.method_42842(var1 * var1 + var5 * var5) * 100.0F);
                  if (var12 > 0) {
                     this.method_3210(class_6234.field_31828, var12);
                     this.method_3170(0.01F * (float)var12 * 0.01F);
                  }
               }
            } else {
               int var13 = Math.round(class_9299.method_42842(var1 * var1 + var3 * var3 + var5 * var5) * 100.0F);
               if (var13 > 0) {
                  this.method_3210(class_6234.field_31846, var13);
                  this.method_3170(0.01F * (float)var13 * 0.01F);
               }
            }
         } else {
            int var14 = Math.round(class_9299.method_42842(var1 * var1 + var3 * var3 + var5 * var5) * 100.0F);
            if (var14 > 0) {
               this.method_3210(class_6234.field_31882, var14);
               this.method_3170(0.01F * (float)var14 * 0.01F);
            }
         }
      }
   }

   private void method_3196(double var1, double var3, double var5) {
      if (this.method_37070()) {
         int var9 = Math.round(class_9299.method_42842(var1 * var1 + var3 * var3 + var5 * var5) * 100.0F);
         if (var9 > 0) {
            Entity var10 = this.method_37243();
            if (!(var10 instanceof class_1080)) {
               if (!(var10 instanceof class_9149)) {
                  if (!(var10 instanceof class_9405)) {
                     if (!(var10 instanceof class_4109)) {
                        if (var10 instanceof class_1775) {
                           this.method_3210(class_6234.field_31897, var9);
                        }
                     } else {
                        this.method_3210(class_6234.field_31887, var9);
                     }
                  } else {
                     this.method_3210(class_6234.field_31904, var9);
                  }
               } else {
                  this.method_3210(class_6234.field_31874, var9);
               }
            } else {
               this.method_3210(class_6234.field_31855, var9);
            }
         }
      }
   }

   @Override
   public boolean method_37270(float var1, float var2) {
      if (!this.field_3876.field_4941) {
         if (var1 >= 2.0F) {
            this.method_3210(class_6234.field_31902, (int)Math.round((double)var1 * 100.0));
         }

         return super.method_37270(var1, var2);
      } else {
         return false;
      }
   }

   public boolean method_3190() {
      if (!this.field_41726 && !this.method_26618() && !this.method_37285() && !this.method_26480(Effects.LevitationEffect)) {
         class_6098 var3 = this.method_26520(class_6943.field_35708);
         if (var3.method_27960() == class_4897.field_24503 && class_3286.method_15061(var3)) {
            this.method_3180();
            return true;
         }
      }

      return false;
   }

   public void method_3180() {
      this.method_37220(7, true);
   }

   public void method_3238() {
      this.method_37220(7, true);
      this.method_37220(7, false);
   }

   @Override
   public void method_37101() {
      if (!this.method_37221()) {
         super.method_37101();
      }
   }

   @Override
   public class_8461 method_26587(int var1) {
      return var1 <= 4 ? class_463.field_2281 : class_463.field_2028;
   }

   @Override
   public void method_37231(class_6331 var1, class_5834 var2) {
      this.method_3211(class_6234.field_31832.method_43790(var2.method_37387()));
   }

   @Override
   public void method_37130(class_2522 var1, class_1343 var2) {
      if (!this.field_3876.field_4942) {
         super.method_37130(var1, var2);
      }
   }

   public void method_3159(int var1) {
      this.method_3176(var1);
      this.field_3842 = this.field_3842 + (float)var1 / (float)this.method_3194();
      this.field_3862 = class_9299.method_42829(this.field_3862 + var1, 0, Integer.MAX_VALUE);

      while (this.field_3842 < 0.0F) {
         float var4 = this.field_3842 * (float)this.method_3194();
         if (this.field_3840 <= 0) {
            this.method_3220(-1);
            this.field_3842 = 0.0F;
         } else {
            this.method_3220(-1);
            this.field_3842 = 1.0F + var4 / (float)this.method_3194();
         }
      }

      while (this.field_3842 >= 1.0F) {
         this.field_3842 = (this.field_3842 - 1.0F) * (float)this.method_3194();
         this.method_3220(1);
         this.field_3842 = this.field_3842 / (float)this.method_3194();
      }
   }

   public int method_3221() {
      return this.field_3847;
   }

   public void method_3175(class_6098 var1, int var2) {
      this.field_3840 -= var2;
      if (this.field_3840 < 0) {
         this.field_3840 = 0;
         this.field_3842 = 0.0F;
         this.field_3862 = 0;
      }

      this.field_3847 = this.field_41717.nextInt();
   }

   public void method_3220(int var1) {
      this.field_3840 += var1;
      if (this.field_3840 < 0) {
         this.field_3840 = 0;
         this.field_3842 = 0.0F;
         this.field_3862 = 0;
      }

      if (var1 > 0 && this.field_3840 % 5 == 0 && (float)this.field_3846 < (float)this.field_41697 - 100.0F) {
         float var4 = this.field_3840 <= 30 ? (float)this.field_3840 / 30.0F : 1.0F;
         this.field_41768
            .method_29528(
               (class_704)null, this.method_37302(), this.method_37309(), this.method_37156(), class_463.field_1982, this.method_37197(), var4 * 0.75F, 1.0F
            );
         this.field_3846 = this.field_41697;
      }
   }

   public int method_3194() {
      if (this.field_3840 < 30) {
         return this.field_3840 < 15 ? 7 + this.field_3840 * 2 : 37 + (this.field_3840 - 15) * 5;
      } else {
         return 112 + (this.field_3840 - 30) * 9;
      }
   }

   public void method_3170(float var1) {
      if (!this.field_3876.field_4940 && !this.field_41768.field_33055) {
         this.field_3867.method_42229(var1);
      }
   }

   public class_9163 method_3161() {
      return this.field_3867;
   }

   public boolean method_3231(boolean var1) {
      return this.field_3876.field_4940 || var1 || this.field_3867.method_42227();
   }

   public boolean method_3246() {
      return this.method_26551() > 0.0F && this.method_26551() < this.method_26465();
   }

   public boolean method_3181() {
      return this.field_3876.field_4938;
   }

   public boolean method_3208(class_1331 var1, Direction var2, class_6098 var3) {
      if (!this.field_3876.field_4938) {
         class_1331 var6 = var1.method_6098(var2.method_1046());
         class_9115 var7 = new class_9115(this.field_41768, var6, false);
         return var3.method_28027(this.field_41768.method_29600(), var7);
      } else {
         return true;
      }
   }

   @Override
   public int method_26427(class_704 var1) {
      if (!this.field_41768.method_29537().method_1285(class_291.field_1051) && !this.method_37221()) {
         int var4 = this.field_3840 * 7;
         return var4 <= 100 ? var4 : 100;
      } else {
         return 0;
      }
   }

   @Override
   public boolean method_26586() {
      return true;
   }

   @Override
   public boolean method_37141() {
      return true;
   }

   @Override
   public boolean method_37126() {
      return !this.field_3876.field_4942 && (!this.field_41726 || !this.method_37073());
   }

   public void method_3216() {
   }

   public void method_3155(class_4666 var1) {
   }

   @Override
   public ITextComponent method_45509() {
      return new StringTextComponent(this.field_3872.getName());
   }

   public class_1031 method_3237() {
      return this.field_3860;
   }

   @Override
   public class_6098 method_26520(class_6943 var1) {
      if (var1 != class_6943.field_35707) {
         if (var1 != class_6943.field_35701) {
            return var1.method_31772() != class_7268.field_37219 ? class_6098.field_31203 : this.field_3853.field_36405.get(var1.method_31767());
         } else {
            return this.field_3853.field_36406.get(0);
         }
      } else {
         return this.field_3853.method_32403();
      }
   }

   @Override
   public void method_37349(class_6943 var1, class_6098 var2) {
      if (var1 != class_6943.field_35707) {
         if (var1 != class_6943.field_35701) {
            if (var1.method_31772() == class_7268.field_37219) {
               this.method_26620(var2);
               this.field_3853.field_36405.set(var1.method_31767(), var2);
            }
         } else {
            this.method_26620(var2);
            this.field_3853.field_36406.set(0, var2);
         }
      } else {
         this.method_26620(var2);
         this.field_3853.field_36401.set(this.field_3853.field_36404, var2);
      }
   }

   public boolean method_3245(class_6098 var1) {
      this.method_26620(var1);
      return this.field_3853.method_32414(var1);
   }

   @Override
   public Iterable<class_6098> method_37294() {
      return Lists.newArrayList(new class_6098[]{this.method_26446(), this.method_26568()});
   }

   @Override
   public Iterable<class_6098> method_37262() {
      return this.field_3853.field_36405;
   }

   public boolean method_3225(class_5734 var1) {
      if (this.method_37070() || !this.field_41726 || this.method_37285()) {
         return false;
      } else if (this.method_3160().method_25940()) {
         this.method_3241(var1);
         this.field_3861 = this.field_41768.method_29546();
         return true;
      } else if (!this.method_3171().method_25940()) {
         return false;
      } else {
         this.method_3165(var1);
         this.field_3861 = this.field_41768.method_29546();
         return true;
      }
   }

   public void method_3157() {
      if (this.field_3861 + 20L < this.field_41768.method_29546()) {
         this.method_3189(this.method_3160());
         this.method_3241(new class_5734());
         this.method_3189(this.method_3171());
         this.method_3165(new class_5734());
      }
   }

   private void method_3189(class_5734 var1) {
      if (!this.field_41768.field_33055 && !var1.method_25940()) {
         class_6629.method_30475(var1, this.field_41768).ifPresent(var1x -> {
            if (var1x instanceof class_8990) {
               ((class_8990)var1x).method_41218(this.field_41738);
            }

            var1x.method_37256(this.method_37302(), this.method_37309() + 0.7F, this.method_37156());
            ((class_6331)this.field_41768).method_28972(var1x);
         });
      }
   }

   @Override
   public abstract boolean method_37221();

   @Override
   public boolean method_37113() {
      return !this.field_3876.field_4942 && !this.method_37221() && super.method_37113();
   }

   public abstract boolean method_3186();

   @Override
   public boolean method_37107() {
      return !this.field_3876.field_4942;
   }

   public class_1097 method_3219() {
      return this.field_41768.method_29562();
   }

   @Override
   public ITextComponent method_19839() {
      IFormattableTextComponent var3 = class_3903.method_18063(this.method_37095(), this.method_45509());
      return this.method_3187(var3);
   }

   private IFormattableTextComponent method_3187(IFormattableTextComponent var1) {
      String var4 = this.method_3247().getName();
      return var1.modifyStyle(
         var2 -> var2.setClickEvent(new ClickEvent(ClickEvent$class_47.SUGGEST_COMMAND, "/tell " + var4 + " "))
               .setHoverEvent(this.method_37248())
               .setInsertion(var4)
      );
   }

   @Override
   public String method_37206() {
      return this.method_3247().getName();
   }

   @Override
   public float method_26425(class_7653 var1, class_6097 var2) {
      switch (var1) {
         case field_38888:
         case field_38889:
         case field_38884:
            return 0.4F;
         case field_38881:
            return 1.27F;
         default:
            return 1.62F;
      }
   }

   @Override
   public void method_26460(float var1) {
      if (var1 < 0.0F) {
         var1 = 0.0F;
      }

      this.method_37372().method_36633(field_3845, var1);
   }

   @Override
   public float method_26493() {
      return this.method_37372().<Float>method_36640(field_3845);
   }

   public static UUID method_3242(GameProfile var0) {
      UUID var3 = var0.getId();
      if (var3 == null) {
         var3 = method_3249(var0.getName());
      }

      return var3;
   }

   public static UUID method_3249(String var0) {
      return UUID.nameUUIDFromBytes(("OfflinePlayer:" + var0).getBytes(StandardCharsets.UTF_8));
   }

   public boolean method_3168(class_7742 var1) {
      return (this.method_37372().<Byte>method_36640(field_3873) & var1.method_35037()) == var1.method_35037();
   }

   @Override
   public boolean method_37166(int var1, class_6098 var2) {
      if (var1 >= 0 && var1 < this.field_3853.field_36401.size()) {
         this.field_3853.method_31503(var1, var2);
         return true;
      } else {
         class_6943 var5;
         if (var1 != 100 + class_6943.field_35704.method_31767()) {
            if (var1 != 100 + class_6943.field_35708.method_31767()) {
               if (var1 != 100 + class_6943.field_35698.method_31767()) {
                  if (var1 != 100 + class_6943.field_35700.method_31767()) {
                     var5 = null;
                  } else {
                     var5 = class_6943.field_35700;
                  }
               } else {
                  var5 = class_6943.field_35698;
               }
            } else {
               var5 = class_6943.field_35708;
            }
         } else {
            var5 = class_6943.field_35704;
         }

         if (var1 == 98) {
            this.method_37349(class_6943.field_35707, var2);
            return true;
         } else if (var1 != 99) {
            if (var5 == null) {
               int var6 = var1 - 200;
               if (var6 >= 0 && var6 < this.field_3860.method_31505()) {
                  this.field_3860.method_31503(var6, var2);
                  return true;
               } else {
                  return false;
               }
            } else {
               if (!var2.method_28022()) {
                  if (!(var2.method_27960() instanceof class_8228) && !(var2.method_27960() instanceof class_3286)) {
                     if (var5 != class_6943.field_35704) {
                        return false;
                     }
                  } else if (class_5886.method_26896(var2) != var5) {
                     return false;
                  }
               }

               this.field_3853.method_31503(var5.method_31767() + this.field_3853.field_36401.size(), var2);
               return true;
            }
         } else {
            this.method_37349(class_6943.field_35701, var2);
            return true;
         }
      }
   }

   public boolean method_3179() {
      return this.field_3855;
   }

   public void method_3151(boolean var1) {
      this.field_3855 = var1;
   }

   @Override
   public void method_37164(int var1) {
      super.method_37164(!this.field_3876.field_4940 ? var1 : Math.min(var1, 1));
   }

   @Override
   public class_1736 method_26432() {
      return this.field_41735.<Byte>method_36640(field_3852) != 0 ? class_1736.field_8943 : class_1736.field_8940;
   }

   public void method_3206(class_1736 var1) {
      this.field_41735.method_36633(field_3852, (byte)(var1 != class_1736.field_8940 ? 1 : 0));
   }

   public class_5734 method_3160() {
      return this.field_41735.<class_5734>method_36640(field_3871);
   }

   public void method_3241(class_5734 var1) {
      this.field_41735.method_36633(field_3871, var1);
   }

   public class_5734 method_3171() {
      return this.field_41735.<class_5734>method_36640(field_3870);
   }

   public void method_3165(class_5734 var1) {
      this.field_41735.method_36633(field_3870, var1);
   }

   public float method_3163() {
      return (float)(1.0 / this.method_26575(class_7331.field_37466) * 20.0);
   }

   public float method_3203(float var1) {
      return class_9299.method_42828(((float)this.field_29620 + var1) / this.method_3163(), 0.0F, 1.0F);
   }

   public void method_3164() {
      this.field_29620 = 0;
   }

   public class_7200 method_3173() {
      return this.field_3866;
   }

   @Override
   public float method_37364() {
      return !this.field_3876.field_4942 && !this.method_26618() ? super.method_37364() : 1.0F;
   }

   public float method_3234() {
      return (float)this.method_26575(class_7331.field_37469);
   }

   public boolean method_3184() {
      return this.field_3876.field_4944 && this.method_37352() >= 2;
   }

   @Override
   public boolean method_26612(class_6098 var1) {
      class_6943 var4 = class_5886.method_26896(var1);
      return this.method_26520(var4).method_28022();
   }

   @Override
   public class_6097 method_37190(class_7653 var1) {
      return field_3875.getOrDefault(var1, field_3865);
   }

   @Override
   public ImmutableList<class_7653> method_26454() {
      return ImmutableList.of(class_7653.field_38885, class_7653.field_38881, class_7653.field_38888);
   }

   @Override
   public class_6098 method_26475(class_6098 var1) {
      if (!(var1.method_27960() instanceof class_551)) {
         return class_6098.field_31203;
      } else {
         Predicate var4 = ((class_551)var1.method_27960()).method_2653();
         class_6098 var5 = class_551.method_2656(this, var4);
         if (!var5.method_28022()) {
            return var5;
         } else {
            var4 = ((class_551)var1.method_27960()).method_2655();

            for (int var6 = 0; var6 < this.field_3853.method_31505(); var6++) {
               class_6098 var7 = this.field_3853.method_31498(var6);
               if (var4.test(var7)) {
                  return var7;
               }
            }

            return !this.field_3876.field_4944 ? class_6098.field_31203 : new class_6098(class_4897.field_25024);
         }
      }
   }

   @Override
   public class_6098 method_26426(World var1, class_6098 var2) {
      this.method_3161().method_42234(var2.method_27960(), var2);
      this.method_3211(class_6234.field_31907.method_43790(var2.method_27960()));
      var1.method_29528(
         (class_704)null,
         this.method_37302(),
         this.method_37309(),
         this.method_37156(),
         class_463.field_2059,
         class_562.field_3335,
         0.5F,
         var1.field_33033.nextFloat() * 0.1F + 0.9F
      );
      if (this instanceof class_9359) {
         class_8807.field_45081.method_43401((class_9359)this, var2);
      }

      return super.method_26426(var1, var2);
   }

   @Override
   public boolean method_26485(class_2522 var1) {
      return this.field_3876.field_4942 || super.method_26485(var1);
   }

   @Override
   public class_1343 method_37202(float var1) {
      double var4 = 0.22 * (this.method_26432() != class_1736.field_8943 ? 1.0 : -1.0);
      float var6 = class_9299.method_42795(var1 * 0.5F, this.field_41755, this.field_41762) * (float) (Math.PI / 180.0);
      float var7 = class_9299.method_42795(var1, this.field_29611, this.field_29605) * (float) (Math.PI / 180.0);
      if (this.method_26618() || this.method_26600()) {
         class_1343 var8 = this.method_37307(var1);
         class_1343 var9 = this.method_37098();
         double var21 = Entity.method_37266(var9);
         double var12 = Entity.method_37266(var8);
         float var14;
         if (var21 > 0.0 && var12 > 0.0) {
            double var17 = (var9.field_7336 * var8.field_7336 + var9.field_7334 * var8.field_7334) / Math.sqrt(var21 * var12);
            double var19 = var9.field_7336 * var8.field_7334 - var9.field_7334 * var8.field_7336;
            var14 = (float)(Math.signum(var19) * Math.acos(var17));
         } else {
            var14 = 0.0F;
         }

         return this.method_37280(var1).method_6215(new class_1343(var4, -0.11, 0.85).method_6218(-var14).method_6212(-var6).method_6192(-var7));
      } else if (!this.method_37297()) {
         double var15 = this.method_37241().method_18901() - 1.0;
         double var10 = !this.method_37382() ? 0.07 : -0.2;
         return this.method_37280(var1).method_6215(new class_1343(var4, var15, var10).method_6192(-var7));
      } else {
         return this.method_37280(var1).method_6215(new class_1343(var4, 0.2, -0.15).method_6212(-var6).method_6192(-var7));
      }
   }
}
