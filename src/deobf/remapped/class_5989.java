package remapped;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;

public class class_5989 extends class_9716 {
   private static String[] field_30536;
   public final class_1092 field_30532;
   private final class_4156 field_30519;
   private final class_2716 field_30508;
   private final List<class_3753> field_30530 = Lists.newArrayList();
   private int field_30527 = 0;
   public double field_30525;
   public double field_30502;
   public double field_30507;
   public float field_30535;
   public float field_30524;
   public boolean field_30537;
   private boolean field_30517;
   private boolean field_30509;
   private boolean field_30513;
   private int field_30516;
   private boolean field_30506;
   private String field_30528;
   public class_8859 field_30533;
   public final MinecraftClient field_30523;
   public int field_30526;
   public int field_30522;
   public float field_30531;
   public float field_30529;
   public float field_30520;
   public float field_30515;
   private int field_30514;
   public float field_30501;
   public float field_30510;
   public float field_30505;
   private boolean field_30518;
   private class_2584 field_30511;
   private boolean field_30538;
   private boolean field_30521 = true;
   private int field_30503;
   private boolean field_30504;
   private int field_30534;
   private boolean field_30512 = true;

   public class_5989(MinecraftClient var1, class_174 var2, class_1092 var3, class_4156 var4, class_2716 var5, boolean var6, boolean var7) {
      super(var2, var3.method_4810());
      this.field_30523 = var1;
      this.field_30532 = var3;
      this.field_30519 = var4;
      this.field_30508 = var5;
      this.field_30509 = var6;
      this.field_30513 = var7;
      this.field_30530.add(new class_3554(this, var1.method_8590()));
      this.field_30530.add(new class_7509(this));
      this.field_30530.add(new class_6776(this, var1.method_8590(), var2.method_22564()));
   }

   @Override
   public boolean method_37181(class_6199 var1, float var2) {
      return false;
   }

   @Override
   public void method_26457(float var1) {
   }

   @Override
   public boolean method_37354(Entity var1, boolean var2) {
      if (super.method_37354(var1, var2)) {
         if (var1 instanceof class_1080) {
            this.field_30523.method_8590().method_16345(new class_8946(this, (class_1080)var1));
         }

         if (var1 instanceof class_9149) {
            this.field_41711 = var1.field_41701;
            this.field_41701 = var1.field_41701;
            this.method_37161(var1.field_41701);
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public void method_37389() {
      super.method_37389();
      this.field_30538 = false;
   }

   @Override
   public float method_37184(float var1) {
      return this.field_41755;
   }

   @Override
   public float method_37291(float var1) {
      return !this.method_37070() ? this.field_41701 : super.method_37291(var1);
   }

   @Override
   public void method_37123() {
      if (this.field_41768.method_22559(new class_1331(this.method_37302(), 0.0, this.method_37156()))) {
         super.method_37123();
         if (!this.method_37070()) {
            this.method_27305();
         } else {
            this.field_30532.method_4813(new class_3616(this.field_41701, this.field_41755, this.field_41726));
            this.field_30532.method_4813(new class_758(this.field_29676, this.field_29673, this.field_30533.field_45284, this.field_30533.field_45289));
            Entity var3 = this.method_37240();
            if (var3 != this && var3.method_37069()) {
               this.field_30532.method_4813(new class_4148(var3));
            }
         }

         for (class_3753 var4 : this.field_30530) {
            var4.method_17366();
         }
      }
   }

   public float method_27306() {
      for (class_3753 var4 : this.field_30530) {
         if (var4 instanceof class_6776) {
            return ((class_6776)var4).method_31088();
         }
      }

      return 0.0F;
   }

   public void method_27305() {
      class_4092 var3 = this.method_37241();
      class_1393 var4 = new class_1393(this.method_37302(), var3.field_19937, this.method_37156(), this.field_41755, this.field_41701, this.field_41726);
      SigmaMainClass.method_3328().method_3302().method_7914(var4);
      if (!var4.method_29716()) {
         boolean var5 = this.method_37321();
         if (var5 != this.field_30513) {
            class_4127 var6 = !var5 ? class_4127.field_20100 : class_4127.field_20099;
            this.field_30532.method_4813(new class_2317(this, var6));
            this.field_30513 = var5;
         }

         boolean var31 = this.method_37252();
         if (var31 != this.field_30509) {
            class_4127 var7 = !var31 ? class_4127.field_20097 : class_4127.field_20098;
            this.field_30532.method_4813(new class_2317(this, var7));
            this.field_30509 = var31;
         }

         if (this.method_27308()) {
            double var8 = var4.method_6450();
            double var10 = var4.method_6454();
            double var12 = var4.method_6438();
            float var14 = var4.method_6439();
            float var15 = var4.method_6442() % 360.0F;
            boolean var16 = var4.method_6446();
            double var17 = var8 - this.field_30525;
            double var19 = var10 - this.field_30502;
            double var21 = var12 - this.field_30507;
            double var23 = (double)(var15 - this.field_30535 % 360.0F);
            double var25 = (double)(var14 - this.field_30524);
            this.field_30516++;
            boolean var27 = var4.method_6452() || var17 * var17 + var19 * var19 + var21 * var21 > 9.0E-4 || this.field_30516 >= 20;
            boolean var28 = var23 != 0.0 || var25 != 0.0;
            if (!this.method_37070()) {
               if (var27 && var28) {
                  this.field_30532.method_4813(new class_1514(var8, var10, var12, var15, var14, var16));
               } else if (!var27) {
                  if (!var28) {
                     if (this.field_30537 != this.field_41726 || class_3347.method_15348() == class_412.field_1747) {
                        this.field_30532.method_4813(new class_4609(var16));
                     }
                  } else {
                     this.field_30532.method_4813(new class_3616(var15, var14, var16));
                  }
               } else {
                  this.field_30532.method_4813(new class_9515(var8, var10, var12, var16));
               }
            } else {
               class_1343 var29 = this.method_37098();
               this.field_30532.method_4813(new class_1514(var29.field_7336, -999.0, var29.field_7334, var15, var14, var16));
               var27 = false;
            }

            if (var27) {
               this.field_30525 = var8;
               this.field_30502 = var10;
               this.field_30507 = var12;
               this.field_30516 = 0;
            }

            if (var28) {
               this.field_30535 = var15;
               this.field_30524 = var14;
            }

            this.field_30537 = this.field_41726;
            this.field_30521 = this.field_30523.field_9577.field_45412;
         }

         for (Runnable var30 : var4.method_6447()) {
            var30.run();
         }

         var4.method_6440();
         SigmaMainClass.method_3328().method_3302().method_7914(var4);
      }
   }

   @Override
   public boolean method_3235(boolean var1) {
      class_7500 var4 = !var1 ? class_7500.field_38266 : class_7500.field_38265;
      this.field_30532.method_4813(new class_1586(var4, class_1331.field_7306, Direction.field_802));
      return this.field_3853
            .method_31497(
               this.field_3853.field_36404, var1 && !this.field_3853.method_32403().method_28022() ? this.field_3853.method_32403().method_27997() : 1
            )
         != class_6098.field_31203;
   }

   public void method_27307(String var1) {
      this.field_30532.method_4813(new class_3211(var1));
   }

   @Override
   public void method_26597(class_2584 var1) {
      super.method_26597(var1);
      this.field_30532.method_4813(new class_3195(var1));
   }

   @Override
   public void method_3205() {
      this.field_30532.method_4813(new class_8559(class_2105.field_10549));
   }

   @Override
   public void method_26574(class_6199 var1, float var2) {
      if (!this.method_37180(var1)) {
         this.method_26456(this.method_26551() - var2);
      }
   }

   @Override
   public void method_3207() {
      this.field_30532.method_4813(new class_1194(this.field_3874.field_19925));
      this.method_27327();
   }

   public void method_27327() {
      this.field_3853.method_32408(class_6098.field_31203);
      super.method_3207();
      this.field_30523.method_8609((class_266)null);
   }

   public void method_27310(float var1) {
      if (!this.field_30506) {
         this.method_26456(var1);
         this.field_30506 = true;
      } else {
         float var4 = this.method_26551() - var1;
         if (!(var4 <= 0.0F)) {
            this.field_29601 = var4;
            this.method_26456(this.method_26551());
            this.field_41749 = 20;
            this.method_26574(class_6199.field_31664, var4);
            this.field_29662 = 10;
            this.field_29645 = this.field_29662;
         } else {
            this.method_26456(var1);
            if (var4 < 0.0F) {
               this.field_41749 = 10;
            }
         }
      }
   }

   @Override
   public void method_3216() {
      this.field_30532.method_4813(new class_9808(this.field_3876));
   }

   @Override
   public boolean method_3183() {
      return true;
   }

   @Override
   public boolean method_26492() {
      return !this.field_3876.field_4942 && super.method_26492();
   }

   @Override
   public boolean method_37374() {
      return !this.field_3876.field_4942 && super.method_37374();
   }

   @Override
   public boolean method_26412() {
      return !this.field_3876.field_4942 && super.method_26412();
   }

   public void method_27321() {
      this.field_30532.method_4813(new class_2317(this, class_4127.field_20103, class_9299.method_42848(this.method_27313() * 100.0F)));
   }

   public void method_27311() {
      this.field_30532.method_4813(new class_2317(this, class_4127.field_20101));
   }

   public void method_27315(String var1) {
      this.field_30528 = var1;
   }

   public String method_27309() {
      return this.field_30528;
   }

   public class_4156 method_27331() {
      return this.field_30519;
   }

   public class_2716 method_27334() {
      return this.field_30508;
   }

   public void method_27326(class_8932<?> var1) {
      if (this.field_30508.method_5081(var1)) {
         this.field_30508.method_5088(var1);
         this.field_30532.method_4813(new class_6074(var1));
      }
   }

   @Override
   public int method_37352() {
      return this.field_30527;
   }

   public void method_27330(int var1) {
      this.field_30527 = var1;
   }

   @Override
   public void method_3251(ITextComponent var1, boolean var2) {
      if (!var2) {
         this.field_30523.field_9614.method_13991().method_18676(var1);
      } else {
         this.field_30523.field_9614.method_13982(var1, false);
      }
   }

   private void method_27324(double var1, double var3) {
      class_1331 var7 = new class_1331(var1, this.method_37309(), var3);
      if (this.method_27312(var7)) {
         double var8 = var1 - (double)var7.method_12173();
         double var10 = var3 - (double)var7.method_12185();
         Direction var12 = null;
         double var13 = Double.MAX_VALUE;
         Direction[] var15 = new Direction[]{Direction.field_809, Direction.field_804, Direction.field_818, Direction.field_800};

         for (Direction var19 : var15) {
            double var20 = var19.method_1029().method_42630(var8, 0.0, var10);
            double var22 = var19.method_1049() != class_137.field_405 ? var20 : 1.0 - var20;
            if (var22 < var13 && !this.method_27312(var7.method_6098(var19))) {
               var13 = var22;
               var12 = var19;
            }
         }

         if (var12 != null) {
            class_1343 var24 = this.method_37098();
            if (var12.method_1029() != class_9249.field_47215) {
               this.method_37214(var24.field_7336, var24.field_7333, 0.1 * (double)var12.method_1034());
            } else {
               this.method_37214(0.1 * (double)var12.method_1041(), var24.field_7333, var24.field_7334);
            }
         }
      }
   }

   private boolean method_27312(class_1331 var1) {
      class_4092 var4 = this.method_37241();
      class_4092 var5 = new class_4092(
            (double)var1.method_12173(),
            var4.field_19937,
            (double)var1.method_12185(),
            (double)var1.method_12173() + 1.0,
            var4.field_19939,
            (double)var1.method_12185() + 1.0
         )
         .method_18924(1.0E-7);
      return !this.field_41768.method_6670(this, var5, (var1x, var2) -> var1x.method_8313(this.field_41768, var2));
   }

   @Override
   public void method_37140(boolean var1) {
      super.method_37140(var1);
      this.field_30522 = 0;
   }

   public void method_27314(float var1, int var2, int var3) {
      this.field_3842 = var1;
      this.field_3862 = var2;
      this.field_3840 = var3;
   }

   @Override
   public void method_26286(ITextComponent var1, UUID var2) {
      this.field_30523.field_9614.method_13991().method_18676(var1);
   }

   @Override
   public void method_37336(byte var1) {
      if (var1 >= 24 && var1 <= 28) {
         this.method_27330(var1 - 24);
      } else {
         super.method_37336(var1);
      }
   }

   public void method_27333(boolean var1) {
      this.field_30512 = var1;
   }

   public boolean method_27329() {
      return this.field_30512;
   }

   @Override
   public void method_37155(class_8461 var1, float var2, float var3) {
      this.field_41768.method_29527(this.method_37302(), this.method_37309(), this.method_37156(), var1, this.method_37197(), var2, var3, false);
   }

   @Override
   public void method_3172(class_8461 var1, class_562 var2, float var3, float var4) {
      this.field_41768.method_29527(this.method_37302(), this.method_37309(), this.method_37156(), var1, var2, var3, var4, false);
   }

   @Override
   public boolean method_26530() {
      return true;
   }

   @Override
   public void method_26462(class_2584 var1) {
      class_6098 var4 = this.method_26617(var1);
      if (!var4.method_28022() && !this.method_26554()) {
         super.method_26462(var1);
         this.field_30518 = true;
         this.field_30511 = var1;
      }
   }

   @Override
   public boolean method_26554() {
      return this.field_30518;
   }

   @Override
   public void method_26529() {
      super.method_26529();
      this.field_30518 = false;
   }

   @Override
   public class_2584 method_26500() {
      return this.field_30511;
   }

   @Override
   public void method_37191(class_7821<?> var1) {
      super.method_37191(var1);
      if (field_29638.equals(var1)) {
         boolean var4 = (this.field_41735.<Byte>method_36640(field_29638) & 1) > 0;
         class_2584 var5 = (this.field_41735.<Byte>method_36640(field_29638) & 2) <= 0 ? class_2584.field_12791 : class_2584.field_12794;
         if (var4 && !this.field_30518) {
            this.method_26462(var5);
         } else if (!var4 && this.field_30518) {
            this.method_26529();
         }
      }

      if (field_41770.equals(var1) && this.method_26618() && !this.field_30504) {
         this.field_30523.method_8590().method_16345(new class_7854(this));
      }
   }

   public boolean method_27317() {
      Entity var3 = this.method_37243();
      return this.method_37070() && var3 instanceof class_9766 && ((class_9766)var3).method_45066();
   }

   public float method_27313() {
      return this.field_30501;
   }

   @Override
   public void method_3244(class_8398 var1) {
      this.field_30523.method_8609(new class_5904(var1));
   }

   @Override
   public void method_3243(class_8116 var1) {
      this.field_30523.method_8609(new class_4348(var1));
   }

   @Override
   public void method_3193(class_7454 var1) {
      this.field_30523.method_8609(new class_7808(var1));
   }

   @Override
   public void method_3218(class_945 var1) {
      this.field_30523.method_8609(new class_5445(var1));
   }

   @Override
   public void method_3201(class_6786 var1) {
      this.field_30523.method_8609(new class_3391(var1));
   }

   @Override
   public void method_3174(class_6098 var1, class_2584 var2) {
      class_2451 var5 = var1.method_27960();
      if (var5 == class_4897.field_24805) {
         this.field_30523.method_8609(new class_4047(this, var1, var2));
      }
   }

   @Override
   public void method_3233(Entity var1) {
      this.field_30523.field_9572.method_43051(var1, class_3090.field_15322);
   }

   @Override
   public void method_3226(Entity var1) {
      this.field_30523.field_9572.method_43051(var1, class_3090.field_15360);
   }

   @Override
   public boolean method_37252() {
      return this.field_30533 != null && this.field_30533.field_45289;
   }

   @Override
   public boolean method_37382() {
      return this.field_30517;
   }

   public boolean method_27323() {
      return this.method_37382() || this.method_37290();
   }

   @Override
   public void method_26417() {
      super.method_26417();
      if (this.method_27308()) {
         this.field_29676 = this.field_30533.field_45282;
         this.field_29673 = this.field_30533.field_45287;
         this.field_29654 = this.field_30533.field_45284;
         this.field_30520 = this.field_30531;
         this.field_30515 = this.field_30529;
         this.field_30529 = (float)((double)this.field_30529 + (double)(this.field_41755 - this.field_30529) * 0.5);
         this.field_30531 = (float)((double)this.field_30531 + (double)(this.field_41701 - this.field_30531) * 0.5);
      }
   }

   public boolean method_27308() {
      return this.field_30523.method_8516() == this;
   }

   @Override
   public void method_26606() {
      this.field_30522++;
      if (this.field_30526 > 0) {
         this.field_30526--;
      }

      this.method_27318();
      boolean var3 = this.field_30533.field_45284;
      boolean var4 = this.field_30533.field_45289;
      boolean var5 = this.method_27319();
      this.field_30517 = !this.field_3876.field_4942
         && !this.method_37113()
         && this.method_37115(class_7653.field_38881)
         && (this.method_37252() || !this.method_26507() && !this.method_37115(class_7653.field_38885));
      this.field_30533.method_40743(this.method_27323());
      this.field_30523.method_8531().method_40529(this.field_30533);
      if (this.method_26554() && !this.method_37070()) {
         class_3920 var6 = new class_3920(0.2F);
         SigmaMainClass.method_3328().method_3302().method_7914(var6);
         if (!var6.method_29716()) {
            this.field_30533.field_45282 = this.field_30533.field_45282 * var6.method_18145();
            this.field_30533.field_45287 = this.field_30533.field_45287 * var6.method_18145();
            this.field_30526 = 0;
         }
      }

      boolean var10 = false;
      if (this.field_30503 > 0) {
         this.field_30503--;
         var10 = true;
         this.field_30533.field_45284 = true;
      }

      if (!this.field_41731) {
         this.method_27324(this.method_37302() - (double)this.method_37086() * 0.35, this.method_37156() + (double)this.method_37086() * 0.35);
         this.method_27324(this.method_37302() - (double)this.method_37086() * 0.35, this.method_37156() - (double)this.method_37086() * 0.35);
         this.method_27324(this.method_37302() + (double)this.method_37086() * 0.35, this.method_37156() - (double)this.method_37086() * 0.35);
         this.method_27324(this.method_37302() + (double)this.method_37086() * 0.35, this.method_37156() + (double)this.method_37086() * 0.35);
      }

      if (var4) {
         this.field_30526 = 0;
      }

      boolean var7 = (float)this.method_3161().method_42238() > 6.0F || this.field_3876.field_4941;
      if ((this.field_41726 || this.method_37179())
         && !var4
         && !var5
         && this.method_27319()
         && !this.method_37321()
         && var7
         && !this.method_26554()
         && !this.method_26480(class_4054.field_19736)) {
         if (this.field_30526 <= 0 && !this.field_30523.field_9577.field_45444.method_27060()) {
            this.field_30526 = 7;
         } else {
            this.method_37140(true);
         }
      }

      if (!this.method_37321()
         && (!this.method_37285() || this.method_37179())
         && this.method_27319()
         && var7
         && !this.method_26554()
         && !this.method_26480(class_4054.field_19736)
         && this.field_30523.field_9577.field_45444.method_27060()) {
         this.method_37140(true);
      }

      if (this.method_37321()) {
         boolean var8 = !this.field_30533.method_40744() || !var7;
         boolean var9 = var8 || this.field_41744 || this.method_37285() && !this.method_37179();
         if (!this.method_37113()) {
            if (var9) {
               this.method_37140(false);
            }
         } else if (!this.field_41726 && !this.field_30533.field_45289 && var8 || !this.method_37285()) {
            this.method_37140(false);
         }
      }

      boolean var11 = false;
      if (this.field_3876.field_4941) {
         if (!this.field_30523.field_9647.method_42153()) {
            if (!var3 && this.field_30533.field_45284 && !var10) {
               if (this.field_3877 != 0) {
                  if (!this.method_37113()) {
                     this.field_3876.field_4942 = !this.field_3876.field_4942;
                     var11 = true;
                     this.method_3216();
                     this.field_3877 = 0;
                  }
               } else {
                  this.field_3877 = 7;
               }
            }
         } else if (!this.field_3876.field_4942) {
            this.field_3876.field_4942 = true;
            var11 = true;
            this.method_3216();
         }
      }

      if (this.field_30533.field_45284 && !var11 && !var3 && !this.field_3876.field_4942 && !this.method_37070() && !this.method_26505()) {
         class_6098 var12 = this.method_26520(class_6943.field_35708);
         if (var12.method_27960() == class_4897.field_24503 && class_3286.method_15061(var12) && this.method_3190()) {
            this.field_30532.method_4813(new class_2317(this, class_4127.field_20093));
         }
      }

      this.field_30504 = this.method_26618();
      if (this.method_37285() && this.field_30533.field_45289 && this.method_26498()) {
         this.method_26411();
      }

      if (!this.method_37261(class_6503.field_33094)) {
         if (this.field_30534 > 0) {
            this.method_37261(class_6503.field_33094);
            this.field_30534 = class_9299.method_42829(this.field_30534 - 10, 0, 600);
         }
      } else {
         int var13 = !this.method_37221() ? 1 : 10;
         this.field_30534 = class_9299.method_42829(this.field_30534 + var13, 0, 600);
      }

      if (this.field_3876.field_4942 && this.method_27308()) {
         int var14 = 0;
         if (this.field_30533.field_45289) {
            var14--;
         }

         if (this.field_30533.field_45284) {
            var14++;
         }

         if (var14 != 0) {
            this.method_37215(this.method_37098().method_6214(0.0, (double)((float)var14 * this.field_3876.method_4230() * 3.0F), 0.0));
         }
      }

      if (!this.method_27317()) {
         this.field_30501 = 0.0F;
      } else {
         class_9766 var15 = (class_9766)this.method_37243();
         if (this.field_30514 < 0) {
            this.field_30514++;
            if (this.field_30514 == 0) {
               this.field_30501 = 0.0F;
            }
         }

         if (var3 && !this.field_30533.field_45284) {
            this.field_30514 = -10;
            var15.method_45069(class_9299.method_42848(this.method_27313() * 100.0F));
            this.method_27321();
         } else if (!var3 && this.field_30533.field_45284) {
            this.field_30514 = 0;
            this.field_30501 = 0.0F;
         } else if (var3) {
            this.field_30514++;
            if (this.field_30514 >= 10) {
               this.field_30501 = 0.8F + 2.0F / (float)(this.field_30514 - 9) * 0.1F;
            } else {
               this.field_30501 = (float)this.field_30514 * 0.1F;
            }
         }
      }

      super.method_26606();
      if (this.field_41726 && this.field_3876.field_4942 && !this.field_30523.field_9647.method_42153()) {
         this.field_3876.field_4942 = false;
         this.method_3216();
      }
   }

   private void method_27318() {
      this.field_30505 = this.field_30510;
      if (!this.field_41772) {
         if (this.method_26480(class_4054.field_19732) && this.method_26553(class_4054.field_19732).method_10347() > 60) {
            this.field_30510 += 0.006666667F;
            if (this.field_30510 > 1.0F) {
               this.field_30510 = 1.0F;
            }
         } else {
            if (this.field_30510 > 0.0F) {
               this.field_30510 -= 0.05F;
            }

            if (this.field_30510 < 0.0F) {
               this.field_30510 = 0.0F;
            }
         }
      } else {
         if (this.field_30523.field_9623 != null && !this.field_30523.field_9623.method_1161()) {
            if (this.field_30523.field_9623 instanceof class_2208) {
               this.method_3207();
            }

            this.field_30523.method_8609((class_266)null);
         }

         if (this.field_30510 == 0.0F) {
            this.field_30523.method_8590().method_16345(class_4949.method_22680(class_463.field_2846, this.field_41717.nextFloat() * 0.4F + 0.8F, 0.25F));
         }

         this.field_30510 += 0.0125F;
         if (this.field_30510 >= 1.0F) {
            this.field_30510 = 1.0F;
         }

         this.field_41772 = false;
      }

      this.method_37263();
   }

   @Override
   public void method_37189() {
      super.method_37189();
      this.field_30538 = false;
      if (this.method_37243() instanceof class_9149) {
         class_9149 var3 = (class_9149)this.method_37243();
         var3.method_42093(this.field_30533.field_45283, this.field_30533.field_45286, this.field_30533.field_45288, this.field_30533.field_45290);
         this.field_30538 = this.field_30538
            | (this.field_30533.field_45283 || this.field_30533.field_45286 || this.field_30533.field_45288 || this.field_30533.field_45290);
      }
   }

   public boolean method_27320() {
      return this.field_30538;
   }

   @Nullable
   @Override
   public class_2250 method_26421(class_1425 var1) {
      if (var1 == class_4054.field_19732) {
         this.field_30505 = 0.0F;
         this.field_30510 = 0.0F;
      }

      return super.method_26421(var1);
   }

   @Override
   public void method_37226(class_7412 var1, class_1343 var2) {
      double var5 = this.method_37302();
      double var7 = this.method_37156();
      super.method_37226(var1, var2);
      this.method_27316((float)(this.method_37302() - var5), (float)(this.method_37156() - var7));
   }

   public boolean method_27322() {
      return this.field_30521;
   }

   public void method_27316(float var1, float var2) {
      if (this.method_27325()) {
         class_1343 var5 = this.method_37245();
         class_1343 var6 = var5.method_6214((double)var1, 0.0, (double)var2);
         class_1343 var7 = new class_1343((double)var1, 0.0, (double)var2);
         float var8 = this.method_26423();
         float var9 = (float)var7.method_6221();
         if (var9 <= 0.001F) {
            class_4895 var10 = this.field_30533.method_40746();
            float var11 = var8 * var10.field_24326;
            float var12 = var8 * var10.field_24329;
            float var13 = class_9299.method_42818(this.field_41701 * (float) (Math.PI / 180.0));
            float var14 = class_9299.method_42840(this.field_41701 * (float) (Math.PI / 180.0));
            var7 = new class_1343((double)(var11 * var14 - var12 * var13), var7.field_7333, (double)(var12 * var14 + var11 * var13));
            var9 = (float)var7.method_6221();
            if (var9 <= 0.001F) {
               return;
            }
         }

         float var42 = class_9299.method_42836(var9);
         class_1343 var43 = var7.method_6209((double)var42);
         class_1343 var44 = this.method_37129();
         float var45 = (float)(var44.field_7336 * var43.field_7336 + var44.field_7334 * var43.field_7334);
         if (!(var45 < -0.15F)) {
            class_214 var46 = class_214.method_926(this);
            class_1331 var15 = new class_1331(this.method_37302(), this.method_37241().field_19939, this.method_37156());
            class_2522 var16 = this.field_41768.method_28262(var15);
            if (var16.method_8325(this.field_41768, var15, var46).method_19485()) {
               var15 = var15.method_6081();
               class_2522 var17 = this.field_41768.method_28262(var15);
               if (var17.method_8325(this.field_41768, var15, var46).method_19485()) {
                  float var18 = 7.0F;
                  float var19 = 1.2F;
                  if (this.method_26480(class_4054.field_19730)) {
                     var19 += (float)(this.method_26553(class_4054.field_19730).method_10333() + 1) * 0.75F;
                  }

                  float var20 = Math.max(var8 * 7.0F, 1.0F / var42);
                  class_1343 var21 = var6.method_6215(var43.method_6209((double)var20));
                  float var22 = this.method_37086();
                  float var23 = this.method_37074();
                  class_4092 var24 = new class_4092(var5, var21.method_6214(0.0, (double)var23, 0.0)).method_18899((double)var22, 0.0, (double)var22);
                  class_1343 var25 = var5.method_6214(0.0, 0.51F, 0.0);
                  var21 = var21.method_6214(0.0, 0.51F, 0.0);
                  class_1343 var26 = var43.method_6196(new class_1343(0.0, 1.0, 0.0));
                  class_1343 var27 = var26.method_6209((double)(var22 * 0.5F));
                  class_1343 var28 = var25.method_6194(var27);
                  class_1343 var29 = var21.method_6194(var27);
                  class_1343 var30 = var25.method_6215(var27);
                  class_1343 var31 = var21.method_6215(var27);
                  Iterator var32 = this.field_41768.method_6676(this, var24, var0 -> true).<class_4092>flatMap(var0 -> var0.method_19492().stream()).iterator();
                  float var33 = Float.MIN_VALUE;

                  while (var32.hasNext()) {
                     class_4092 var34 = (class_4092)var32.next();
                     if (var34.method_18908(var28, var29) || var34.method_18908(var30, var31)) {
                        var33 = (float)var34.field_19939;
                        class_1343 var35 = var34.method_18926();
                        class_1331 var36 = new class_1331(var35);

                        for (int var37 = 1; (float)var37 < var19; var37++) {
                           class_1331 var38 = var36.method_6082(var37);
                           class_2522 var39 = this.field_41768.method_28262(var38);
                           class_4190 var40;
                           if (!(var40 = var39.method_8325(this.field_41768, var38, var46)).method_19485()) {
                              var33 = (float)var40.method_19495(class_9249.field_47216) + (float)var38.method_12165();
                              if ((double)var33 - this.method_37309() > (double)var19) {
                                 return;
                              }
                           }

                           if (var37 > 1) {
                              var15 = var15.method_6081();
                              class_2522 var41 = this.field_41768.method_28262(var15);
                              if (!var41.method_8325(this.field_41768, var15, var46).method_19485()) {
                                 return;
                              }
                           }
                        }
                        break;
                     }
                  }

                  if (var33 != Float.MIN_VALUE) {
                     float var49 = (float)((double)var33 - this.method_37309());
                     if (!(var49 <= 0.5F) && !(var49 > var19)) {
                        this.field_30503 = 1;
                     }
                  }
               }
            }
         }
      }
   }

   private boolean method_27325() {
      return this.method_27322()
         && this.field_30503 <= 0
         && this.field_41726
         && !this.method_3178()
         && !this.method_37070()
         && this.method_27332()
         && (double)this.method_37281() >= 1.0;
   }

   private boolean method_27332() {
      class_4895 var3 = this.field_30533.method_40746();
      return var3.field_24326 != 0.0F || var3.field_24329 != 0.0F;
   }

   private boolean method_27319() {
      double var3 = 0.8;
      return !this.method_37179() ? (double)this.field_30533.field_45287 >= 0.8 : this.field_30533.method_40744();
   }

   public float method_27328() {
      if (this.method_37261(class_6503.field_33094)) {
         float var3 = 600.0F;
         float var4 = 100.0F;
         if (!((float)this.field_30534 >= 600.0F)) {
            float var5 = class_9299.method_42828((float)this.field_30534 / 100.0F, 0.0F, 1.0F);
            float var6 = !((float)this.field_30534 < 100.0F) ? class_9299.method_42828(((float)this.field_30534 - 100.0F) / 500.0F, 0.0F, 1.0F) : 0.0F;
            return var5 * 0.6F + var6 * 0.39999998F;
         } else {
            return 1.0F;
         }
      } else {
         return 0.0F;
      }
   }

   @Override
   public boolean method_37179() {
      return this.field_3850;
   }

   @Override
   public boolean method_3192() {
      boolean var3 = this.field_3850;
      boolean var4 = super.method_3192();
      if (!this.method_37221()) {
         if (!var3 && var4) {
            this.field_41768
               .method_29527(this.method_37302(), this.method_37309(), this.method_37156(), class_463.field_2053, class_562.field_3325, 1.0F, 1.0F, false);
            this.field_30523.method_8590().method_16345(new class_5211(this));
         }

         if (var3 && !var4) {
            this.field_41768
               .method_29527(this.method_37302(), this.method_37309(), this.method_37156(), class_463.field_2030, class_562.field_3325, 1.0F, 1.0F, false);
         }

         return this.field_3850;
      } else {
         return this.field_3850;
      }
   }

   @Override
   public class_1343 method_37202(float var1) {
      if (!this.field_30523.field_9577.method_40867().method_42383()) {
         return super.method_37202(var1);
      } else {
         float var4 = class_9299.method_42795(var1 * 0.5F, this.field_41701, this.field_41711) * (float) (Math.PI / 180.0);
         float var5 = class_9299.method_42795(var1 * 0.5F, this.field_41755, this.field_41762) * (float) (Math.PI / 180.0);
         double var6 = this.method_26432() != class_1736.field_8943 ? 1.0 : -1.0;
         class_1343 var8 = new class_1343(0.39 * var6, -0.6, 0.3);
         return var8.method_6212(-var5).method_6192(-var4).method_6215(this.method_37335(var1));
      }
   }
}
