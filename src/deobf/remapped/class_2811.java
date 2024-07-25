package remapped;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class class_2811 extends class_1173 {
   private static final UUID field_13815 = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
   private static final class_9343 field_13814 = new class_9343(field_13815, "Baby speed boost", 0.5, class_9342.field_47678);
   private static final class_7821<Boolean> field_13810 = class_8073.<Boolean>method_36641(class_2811.class, class_2734.field_13347);
   private static final class_7821<Integer> field_13806 = class_8073.<Integer>method_36641(class_2811.class, class_2734.field_13366);
   private static final class_7821<Boolean> field_13813 = class_8073.<Boolean>method_36641(class_2811.class, class_2734.field_13347);
   private static final Predicate<class_423> field_13812 = var0 -> var0 == class_423.field_1782;
   private final class_5668 field_13811 = new class_5668(this, field_13812);
   private boolean field_13816;
   private int field_13809;
   private int field_13808;

   public class_2811(class_6629<? extends class_2811> var1, World var2) {
      super(var1, var2);
   }

   public class_2811(World var1) {
      this(class_6629.field_34297, var1);
   }

   @Override
   public void method_26851() {
      this.field_29916.method_3485(4, new class_3607(this, this, 1.0, 3));
      this.field_29916.method_3485(8, new class_4407(this, class_704.class, 8.0F));
      this.field_29916.method_3485(8, new class_9691(this));
      this.method_12800();
   }

   public void method_12800() {
      this.field_29916.method_3485(2, new class_1277(this, 1.0, false));
      this.field_29916.method_3485(6, new class_7302(this, 1.0, true, 4, this::method_12793));
      this.field_29916.method_3485(7, new class_2889(this, 1.0));
      this.field_29908.method_3485(1, new class_8420(this).method_38757(class_1918.class));
      this.field_29908.method_3485(2, new class_4138<class_704>(this, class_704.class, true));
      this.field_29908.method_3485(3, new class_4138<class_405>(this, class_405.class, false));
      this.field_29908.method_3485(3, new class_4138<class_8127>(this, class_8127.class, true));
      this.field_29908.method_3485(5, new class_4138<class_3845>(this, class_3845.class, 10, true, false, class_3845.field_18768));
   }

   public static class_1313 method_12802() {
      return class_1173.method_5201()
         .method_5984(class_7331.field_37471, 35.0)
         .method_5984(class_7331.field_37465, 0.23F)
         .method_5984(class_7331.field_37462, 3.0)
         .method_5984(class_7331.field_37473, 2.0)
         .method_5983(class_7331.field_37470);
   }

   @Override
   public void method_37329() {
      super.method_37329();
      this.method_37372().method_36634(field_13810, false);
      this.method_37372().method_36634(field_13806, 0);
      this.method_37372().method_36634(field_13813, false);
   }

   public boolean method_12797() {
      return this.method_37372().<Boolean>method_36640(field_13813);
   }

   public boolean method_12793() {
      return this.field_13816;
   }

   public void method_12799(boolean var1) {
      if (this.method_12792() && class_3613.method_16840(this)) {
         if (this.field_13816 != var1) {
            this.field_13816 = var1;
            ((class_8985)this.method_26927()).method_41199(var1);
            if (!var1) {
               this.field_29916.method_3488(this.field_13811);
            } else {
               this.field_29916.method_3485(1, this.field_13811);
            }
         }
      } else if (this.field_13816) {
         this.field_29916.method_3488(this.field_13811);
         this.field_13816 = false;
      }
   }

   public boolean method_12792() {
      return true;
   }

   @Override
   public boolean method_26449() {
      return this.method_37372().<Boolean>method_36640(field_13810);
   }

   @Override
   public int method_26427(class_704 var1) {
      if (this.method_26449()) {
         this.field_29915 = (int)((float)this.field_29915 * 2.5F);
      }

      return super.method_26427(var1);
   }

   @Override
   public void method_26910(boolean var1) {
      this.method_37372().method_36633(field_13810, var1);
      if (this.field_41768 != null && !this.field_41768.field_33055) {
         class_9747 var4 = this.method_26561(class_7331.field_37465);
         var4.method_45004(field_13814);
         if (var1) {
            var4.method_45011(field_13814);
         }
      }
   }

   @Override
   public void method_37191(class_7821<?> var1) {
      if (field_13810.equals(var1)) {
         this.method_37187();
      }

      super.method_37191(var1);
   }

   public boolean method_12795() {
      return true;
   }

   @Override
   public void method_37123() {
      if (!this.field_41768.field_33055 && this.method_37330() && !this.method_26859()) {
         if (!this.method_12797()) {
            if (this.method_12795()) {
               if (!this.method_37261(class_6503.field_33094)) {
                  this.field_13809 = -1;
               } else {
                  this.field_13809++;
                  if (this.field_13809 >= 600) {
                     this.method_12794(300);
                  }
               }
            }
         } else {
            this.field_13808--;
            if (this.field_13808 < 0) {
               this.method_12798();
            }
         }
      }

      super.method_37123();
   }

   @Override
   public void method_26606() {
      if (this.method_37330()) {
         boolean var3 = this.method_12803() && this.method_26884();
         if (var3) {
            ItemStack var4 = this.method_26520(class_6943.field_35704);
            if (!var4.method_28022()) {
               if (var4.method_27959()) {
                  var4.method_27999(var4.method_28026() + this.field_41717.nextInt(2));
                  if (var4.method_28026() >= var4.method_27957()) {
                     this.method_26448(class_6943.field_35704);
                     this.method_37349(class_6943.field_35704, ItemStack.EMPTY);
                  }
               }

               var3 = false;
            }

            if (var3) {
               this.method_37178(8);
            }
         }
      }

      super.method_26606();
   }

   private void method_12794(int var1) {
      this.field_13808 = var1;
      this.method_37372().method_36633(field_13813, true);
   }

   public void method_12798() {
      this.method_12791(class_6629.field_34211);
      if (!this.method_37378()) {
         this.field_41768.method_43365((class_704)null, 1040, this.method_37075(), 0);
      }
   }

   public void method_12791(class_6629<? extends class_2811> var1) {
      class_2811 var4 = this.<class_2811>method_26898(var1, true);
      if (var4 != null) {
         var4.method_12790(var4.field_41768.method_43368(var4.method_37075()).method_44284());
         var4.method_12799(var4.method_12792() && this.method_12793());
      }
   }

   public boolean method_12803() {
      return true;
   }

   @Override
   public boolean method_37181(class_6199 var1, float var2) {
      if (!super.method_37181(var1, var2)) {
         return false;
      } else if (this.field_41768 instanceof class_6331) {
         class_6331 var5 = (class_6331)this.field_41768;
         class_5834 var6 = this.method_17809();
         if (var6 == null && var1.method_28372() instanceof class_5834) {
            var6 = (class_5834)var1.method_28372();
         }

         if (var6 != null
            && this.field_41768.method_43370() == class_423.field_1782
            && (double)this.field_41717.nextFloat() < this.method_26575(class_7331.field_37470)
            && this.field_41768.method_29537().method_1285(class_291.field_1028)) {
            int var7 = class_9299.method_42847(this.method_37302());
            int var8 = class_9299.method_42847(this.method_37309());
            int var9 = class_9299.method_42847(this.method_37156());
            class_2811 var10 = new class_2811(this.field_41768);

            for (int var11 = 0; var11 < 50; var11++) {
               int var12 = var7 + class_9299.method_42824(this.field_41717, 7, 40) * class_9299.method_42824(this.field_41717, -1, 1);
               int var13 = var8 + class_9299.method_42824(this.field_41717, 7, 40) * class_9299.method_42824(this.field_41717, -1, 1);
               int var14 = var9 + class_9299.method_42824(this.field_41717, 7, 40) * class_9299.method_42824(this.field_41717, -1, 1);
               class_1331 var15 = new class_1331(var12, var13, var14);
               class_6629 var16 = var10.method_37387();
               class_1257 var17 = class_1136.method_4980(var16);
               if (class_3815.method_17767(var17, this.field_41768, var15, var16)
                  && class_1136.method_4983(var16, var5, class_2417.field_12039, var15, this.field_41768.field_33033)) {
                  var10.method_37256((double)var12, (double)var13, (double)var14);
                  if (!this.field_41768.method_25866((double)var12, (double)var13, (double)var14, 7.0)
                     && this.field_41768.method_6677(var10)
                     && this.field_41768.method_6682(var10)
                     && !this.field_41768.method_22550(var10.method_37241())) {
                     var10.method_26860(var6);
                     var10.method_26864(var5, this.field_41768.method_43368(var10.method_37075()), class_2417.field_12039, (class_8733)null, (CompoundNBT)null);
                     var5.method_7065(var10);
                     this.method_26561(class_7331.field_37470)
                        .method_45005(new class_9343("Zombie reinforcement caller charge", -0.05F, class_9342.field_47679));
                     var10.method_26561(class_7331.field_37470)
                        .method_45005(new class_9343("Zombie reinforcement callee charge", -0.05F, class_9342.field_47679));
                     break;
                  }
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean method_26442(Entity var1) {
      boolean var4 = super.method_26442(var1);
      if (var4) {
         float var5 = this.field_41768.method_43368(this.method_37075()).method_44283();
         if (this.method_26446().method_28022() && this.method_37264() && this.field_41717.nextFloat() < var5 * 0.3F) {
            var1.method_37178(2 * (int)var5);
         }
      }

      return var4;
   }

   @Override
   public class_8461 method_26918() {
      return class_463.field_2693;
   }

   @Override
   public class_8461 method_26541(class_6199 var1) {
      return class_463.field_1998;
   }

   @Override
   public class_8461 method_26599() {
      return class_463.field_2072;
   }

   public class_8461 method_12805() {
      return class_463.field_2082;
   }

   @Override
   public void method_37207(class_1331 var1, class_2522 var2) {
      this.method_37155(this.method_12805(), 0.15F, 1.0F);
   }

   @Override
   public class_2780 method_26550() {
      return class_2780.field_13579;
   }

   @Override
   public void method_26870(class_9589 var1) {
      super.method_26870(var1);
      if (this.field_41717.nextFloat() < (this.field_41768.method_43370() != class_423.field_1782 ? 0.01F : 0.05F)) {
         int var4 = this.field_41717.nextInt(3);
         if (var4 != 0) {
            this.method_37349(class_6943.field_35707, new ItemStack(class_4897.field_24346));
         } else {
            this.method_37349(class_6943.field_35707, new ItemStack(class_4897.field_25277));
         }
      }
   }

   @Override
   public void method_37376(CompoundNBT var1) {
      super.method_37376(var1);
      var1.putBoolean("IsBaby", this.method_26449());
      var1.putBoolean("CanBreakDoors", this.method_12793());
      var1.method_25931("InWaterTime", !this.method_37285() ? -1 : this.field_13809);
      var1.method_25931("DrownedConversionTime", !this.method_12797() ? -1 : this.field_13808);
   }

   @Override
   public void method_37314(CompoundNBT var1) {
      super.method_37314(var1);
      this.method_26910(var1.getBoolean("IsBaby"));
      this.method_12799(var1.getBoolean("CanBreakDoors"));
      this.field_13809 = var1.method_25947("InWaterTime");
      if (var1.contains("DrownedConversionTime", 99) && var1.method_25947("DrownedConversionTime") > -1) {
         this.method_12794(var1.method_25947("DrownedConversionTime"));
      }
   }

   @Override
   public void method_37231(class_6331 var1, class_5834 var2) {
      super.method_37231(var1, var2);
      if ((var1.method_43370() == class_423.field_1789 || var1.method_43370() == class_423.field_1782) && var2 instanceof class_7666) {
         if (var1.method_43370() != class_423.field_1782 && this.field_41717.nextBoolean()) {
            return;
         }

         class_7666 var5 = (class_7666)var2;
         class_9355 var6 = var5.<class_9355>method_26898(class_6629.field_34227, false);
         var6.method_26864(var1, var1.method_43368(var6.method_37075()), class_2417.field_12041, new class_2582(false, true), (CompoundNBT)null);
         var6.method_43207(var5.method_15891());
         var6.method_43205((class_8406)var5.method_34709().method_11515(class_3504.field_17178).getValue());
         var6.method_43206(var5.method_974().method_12711());
         var6.method_43203(var5.method_973());
         if (!this.method_37378()) {
            var1.method_43365((class_704)null, 1026, this.method_37075(), 0);
         }
      }
   }

   @Override
   public float method_26425(class_7653 var1, class_6097 var2) {
      return !this.method_26449() ? 1.74F : 0.93F;
   }

   @Override
   public boolean method_26899(ItemStack var1) {
      return var1.method_27960() == class_4897.field_24962 && this.method_26449() && this.method_37070() ? false : super.method_26899(var1);
   }

   @Nullable
   @Override
   public class_8733 method_26864(class_1556 var1, class_9589 var2, class_2417 var3, class_8733 var4, CompoundNBT var5) {
      var4 = super.method_26864(var1, var2, var3, var4, var5);
      float var8 = var2.method_44284();
      this.method_26871(this.field_41717.nextFloat() < 0.55F * var8);
      if (var4 == null) {
         var4 = new class_2582(method_12789(var1.method_43360()), true);
      }

      if (var4 instanceof class_2582) {
         class_2582 var9 = (class_2582)var4;
         if (var9.field_12781) {
            this.method_26910(true);
            if (var9.field_12782) {
               if (!((double)var1.method_43360().nextFloat() < 0.05)) {
                  if ((double)var1.method_43360().nextFloat() < 0.05) {
                     class_3024 var10 = class_6629.field_34263.method_30484(this.field_41768);
                     var10.method_37144(this.method_37302(), this.method_37309(), this.method_37156(), this.field_41701, 0.0F);
                     var10.method_26864(var1, var2, class_2417.field_12037, (class_8733)null, (CompoundNBT)null);
                     var10.method_13808(true);
                     this.method_37353(var10);
                     var1.method_7509(var10);
                  }
               } else {
                  List var14 = var1.<Entity>method_25869(class_3024.class, this.method_37241().method_18899(5.0, 3.0, 5.0), class_3572.field_17484);
                  if (!var14.isEmpty()) {
                     class_3024 var11 = (class_3024)var14.get(0);
                     var11.method_13808(true);
                     this.method_37353(var11);
                  }
               }
            }
         }

         this.method_12799(this.method_12792() && this.field_41717.nextFloat() < var8 * 0.1F);
         this.method_26870(var2);
         this.method_26893(var2);
      }

      if (this.method_26520(class_6943.field_35704).method_28022()) {
         LocalDate var13 = LocalDate.now();
         int var15 = var13.get(ChronoField.DAY_OF_MONTH);
         int var16 = var13.get(ChronoField.MONTH_OF_YEAR);
         if (var16 == 10 && var15 == 31 && this.field_41717.nextFloat() < 0.25F) {
            this.method_37349(class_6943.field_35704, new ItemStack(!(this.field_41717.nextFloat() < 0.1F) ? class_4783.field_23281 : class_4783.field_23855));
            this.field_29918[class_6943.field_35704.method_31767()] = 0.0F;
         }
      }

      this.method_12790(var8);
      return var4;
   }

   public static boolean method_12789(Random var0) {
      return var0.nextFloat() < 0.05F;
   }

   public void method_12790(float var1) {
      this.method_12801();
      this.method_26561(class_7331.field_37463)
         .method_45005(new class_9343("Random spawn bonus", this.field_41717.nextDouble() * 0.05F, class_9342.field_47679));
      double var4 = this.field_41717.nextDouble() * 1.5 * (double)var1;
      if (var4 > 1.0) {
         this.method_26561(class_7331.field_37471).method_45005(new class_9343("Random zombie-spawn bonus", var4, class_9342.field_47677));
      }

      if (this.field_41717.nextFloat() < var1 * 0.05F) {
         this.method_26561(class_7331.field_37470)
            .method_45005(new class_9343("Leader zombie bonus", this.field_41717.nextDouble() * 0.25 + 0.5, class_9342.field_47679));
         this.method_26561(class_7331.field_37468)
            .method_45005(new class_9343("Leader zombie bonus", this.field_41717.nextDouble() * 3.0 + 1.0, class_9342.field_47677));
         this.method_12799(this.method_12792());
      }
   }

   public void method_12801() {
      this.method_26561(class_7331.field_37470).method_45006(this.field_41717.nextDouble() * 0.1F);
   }

   @Override
   public double method_37106() {
      return !this.method_26449() ? -0.45 : 0.0;
   }

   @Override
   public void method_26614(class_6199 var1, int var2, boolean var3) {
      super.method_26614(var1, var2, var3);
      Entity var6 = var1.method_28372();
      if (var6 instanceof class_9490) {
         class_9490 var7 = (class_9490)var6;
         if (var7.method_43837()) {
            ItemStack var8 = this.method_12796();
            if (!var8.method_28022()) {
               var7.method_43832();
               this.method_37310(var8);
            }
         }
      }
   }

   public ItemStack method_12796() {
      return new ItemStack(class_4897.field_24349);
   }
}
