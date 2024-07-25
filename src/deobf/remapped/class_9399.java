package remapped;

import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class class_9399 extends class_5834 {
   private static final class_1366 field_48039 = new class_1366(0.0F, 0.0F, 0.0F);
   private static final class_1366 field_48053 = new class_1366(0.0F, 0.0F, 0.0F);
   private static final class_1366 field_48034 = new class_1366(-10.0F, 0.0F, -10.0F);
   private static final class_1366 field_48056 = new class_1366(-15.0F, 0.0F, 10.0F);
   private static final class_1366 field_48061 = new class_1366(-1.0F, 0.0F, -1.0F);
   private static final class_1366 field_48043 = new class_1366(1.0F, 0.0F, 1.0F);
   private static final class_6097 field_48060 = new class_6097(0.0F, 0.0F, true);
   private static final class_6097 field_48038 = class_6629.field_34289.method_30473().method_27942(0.5F);
   public static final class_7821<Byte> field_48042 = class_8073.<Byte>method_36641(class_9399.class, class_2734.field_13361);
   public static final class_7821<class_1366> field_48059 = class_8073.<class_1366>method_36641(class_9399.class, class_2734.field_13363);
   public static final class_7821<class_1366> field_48047 = class_8073.<class_1366>method_36641(class_9399.class, class_2734.field_13363);
   public static final class_7821<class_1366> field_48057 = class_8073.<class_1366>method_36641(class_9399.class, class_2734.field_13363);
   public static final class_7821<class_1366> field_48049 = class_8073.<class_1366>method_36641(class_9399.class, class_2734.field_13363);
   public static final class_7821<class_1366> field_48046 = class_8073.<class_1366>method_36641(class_9399.class, class_2734.field_13363);
   public static final class_7821<class_1366> field_48045 = class_8073.<class_1366>method_36641(class_9399.class, class_2734.field_13363);
   private static final Predicate<Entity> field_48052 = var0 -> var0 instanceof class_1080 && ((class_1080)var0).method_4737() == class_3481.field_17066;
   private final class_2831<ItemStack> field_48058 = class_2831.<ItemStack>method_12872(2, ItemStack.EMPTY);
   private final class_2831<ItemStack> field_48054 = class_2831.<ItemStack>method_12872(4, ItemStack.EMPTY);
   private boolean field_48048;
   public long field_48050;
   private int field_48051;
   private class_1366 field_48044 = field_48039;
   private class_1366 field_48040 = field_48053;
   private class_1366 field_48041 = field_48034;
   private class_1366 field_48035 = field_48056;
   private class_1366 field_48055 = field_48061;
   private class_1366 field_48037 = field_48043;

   public class_9399(class_6629<? extends class_9399> var1, World var2) {
      super(var1, var2);
      this.field_41733 = 0.0F;
   }

   public class_9399(World var1, double var2, double var4, double var6) {
      this(class_6629.field_34289, var1);
      this.method_37256(var2, var4, var6);
   }

   @Override
   public void method_37187() {
      double var3 = this.method_37302();
      double var5 = this.method_37309();
      double var7 = this.method_37156();
      super.method_37187();
      this.method_37256(var3, var5, var7);
   }

   private boolean method_43497() {
      return !this.method_43493() && !this.method_37078();
   }

   @Override
   public boolean method_26530() {
      return super.method_26530() && this.method_43497();
   }

   @Override
   public void method_37329() {
      super.method_37329();
      this.field_41735.method_36634(field_48042, (byte)0);
      this.field_41735.method_36634(field_48059, field_48039);
      this.field_41735.method_36634(field_48047, field_48053);
      this.field_41735.method_36634(field_48057, field_48034);
      this.field_41735.method_36634(field_48049, field_48056);
      this.field_41735.method_36634(field_48046, field_48061);
      this.field_41735.method_36634(field_48045, field_48043);
   }

   @Override
   public Iterable<ItemStack> method_37294() {
      return this.field_48058;
   }

   @Override
   public Iterable<ItemStack> method_37262() {
      return this.field_48054;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public ItemStack method_26520(class_6943 var1) {
      switch (var1.method_31772()) {
         case field_37218:
            return this.field_48058.get(var1.method_31767());
         case field_37219:
            return this.field_48054.get(var1.method_31767());
         default:
            return ItemStack.EMPTY;
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void method_37349(class_6943 var1, ItemStack var2) {
      switch (var1.method_31772()) {
         case field_37218:
            this.method_26620(var2);
            this.field_48058.set(var1.method_31767(), var2);
            break;
         case field_37219:
            this.method_26620(var2);
            this.field_48054.set(var1.method_31767(), var2);
      }
   }

   @Override
   public boolean method_37166(int var1, ItemStack var2) {
      class_6943 var5;
      if (var1 != 98) {
         if (var1 != 99) {
            if (var1 != 100 + class_6943.field_35704.method_31767()) {
               if (var1 != 100 + class_6943.field_35708.method_31767()) {
                  if (var1 != 100 + class_6943.field_35698.method_31767()) {
                     if (var1 != 100 + class_6943.field_35700.method_31767()) {
                        return false;
                     }

                     var5 = class_6943.field_35700;
                  } else {
                     var5 = class_6943.field_35698;
                  }
               } else {
                  var5 = class_6943.field_35708;
               }
            } else {
               var5 = class_6943.field_35704;
            }
         } else {
            var5 = class_6943.field_35701;
         }
      } else {
         var5 = class_6943.field_35707;
      }

      if (!var2.method_28022() && !class_5886.method_26868(var5, var2) && var5 != class_6943.field_35704) {
         return false;
      } else {
         this.method_37349(var5, var2);
         return true;
      }
   }

   @Override
   public boolean method_26612(ItemStack var1) {
      class_6943 var4 = class_5886.method_26896(var1);
      return this.method_26520(var4).method_28022() && !this.method_43504(var4);
   }

   @Override
   public void method_37376(CompoundNBT var1) {
      super.method_37376(var1);
      class_3416 var4 = new class_3416();

      for (ItemStack var6 : this.field_48054) {
         CompoundNBT var7 = new CompoundNBT();
         if (!var6.method_28022()) {
            var6.method_27998(var7);
         }

         var4.add(var7);
      }

      var1.method_25946("ArmorItems", var4);
      class_3416 var9 = new class_3416();

      for (ItemStack var11 : this.field_48058) {
         CompoundNBT var8 = new CompoundNBT();
         if (!var11.method_28022()) {
            var11.method_27998(var8);
         }

         var9.add(var8);
      }

      var1.method_25946("HandItems", var9);
      var1.method_25934("Invisible", this.method_37109());
      var1.method_25934("Small", this.method_43503());
      var1.method_25934("ShowArms", this.method_43499());
      var1.method_25931("DisabledSlots", this.field_48051);
      var1.method_25934("NoBasePlate", this.method_43495());
      if (this.method_43493()) {
         var1.method_25934("Marker", this.method_43493());
      }

      var1.method_25946("Pose", this.method_43518());
   }

   @Override
   public void method_37314(CompoundNBT var1) {
      super.method_37314(var1);
      if (var1.method_25939("ArmorItems", 9)) {
         class_3416 var4 = var1.method_25927("ArmorItems", 10);

         for (int var5 = 0; var5 < this.field_48054.size(); var5++) {
            this.field_48054.set(var5, ItemStack.method_28015(var4.method_15764(var5)));
         }
      }

      if (var1.method_25939("HandItems", 9)) {
         class_3416 var6 = var1.method_25927("HandItems", 10);

         for (int var8 = 0; var8 < this.field_48058.size(); var8++) {
            this.field_48058.set(var8, ItemStack.method_28015(var6.method_15764(var8)));
         }
      }

      this.method_37333(var1.method_25933("Invisible"));
      this.method_43490(var1.method_25933("Small"));
      this.method_43511(var1.method_25933("ShowArms"));
      this.field_48051 = var1.method_25947("DisabledSlots");
      this.method_43519(var1.method_25933("NoBasePlate"));
      this.method_43515(var1.method_25933("Marker"));
      this.field_41731 = !this.method_43497();
      CompoundNBT var7 = var1.method_25937("Pose");
      this.method_43506(var7);
   }

   private void method_43506(CompoundNBT var1) {
      class_3416 var4 = var1.method_25927("Head", 5);
      this.method_43509(!var4.isEmpty() ? new class_1366(var4) : field_48039);
      class_3416 var5 = var1.method_25927("Body", 5);
      this.method_43489(!var5.isEmpty() ? new class_1366(var5) : field_48053);
      class_3416 var6 = var1.method_25927("LeftArm", 5);
      this.method_43514(!var6.isEmpty() ? new class_1366(var6) : field_48034);
      class_3416 var7 = var1.method_25927("RightArm", 5);
      this.method_43501(!var7.isEmpty() ? new class_1366(var7) : field_48056);
      class_3416 var8 = var1.method_25927("LeftLeg", 5);
      this.method_43507(!var8.isEmpty() ? new class_1366(var8) : field_48061);
      class_3416 var9 = var1.method_25927("RightLeg", 5);
      this.method_43494(!var9.isEmpty() ? new class_1366(var9) : field_48043);
   }

   private CompoundNBT method_43518() {
      CompoundNBT var3 = new CompoundNBT();
      if (!field_48039.equals(this.field_48044)) {
         var3.method_25946("Head", this.field_48044.method_6282());
      }

      if (!field_48053.equals(this.field_48040)) {
         var3.method_25946("Body", this.field_48040.method_6282());
      }

      if (!field_48034.equals(this.field_48041)) {
         var3.method_25946("LeftArm", this.field_48041.method_6282());
      }

      if (!field_48056.equals(this.field_48035)) {
         var3.method_25946("RightArm", this.field_48035.method_6282());
      }

      if (!field_48061.equals(this.field_48055)) {
         var3.method_25946("LeftLeg", this.field_48055.method_6282());
      }

      if (!field_48043.equals(this.field_48037)) {
         var3.method_25946("RightLeg", this.field_48037.method_6282());
      }

      return var3;
   }

   @Override
   public boolean method_37177() {
      return false;
   }

   @Override
   public void method_26596(Entity var1) {
   }

   @Override
   public void method_26428() {
      List var3 = this.field_41768.method_25867(this, this.method_37241(), field_48052);

      for (int var4 = 0; var4 < var3.size(); var4++) {
         Entity var5 = (Entity)var3.get(var4);
         if (this.method_37275(var5) <= 0.2) {
            var5.method_37183(this);
         }
      }
   }

   @Override
   public class_6910 method_37227(class_704 var1, class_1343 var2, class_2584 var3) {
      ItemStack var6 = var1.method_26617(var3);
      if (this.method_43493() || var6.method_27960() == class_4897.field_24948) {
         return class_6910.field_35521;
      } else if (var1.method_37221()) {
         return class_6910.field_35520;
      } else if (!var1.field_41768.field_33055) {
         class_6943 var7 = class_5886.method_26896(var6);
         if (!var6.method_28022()) {
            if (this.method_43504(var7)) {
               return class_6910.field_35517;
            }

            if (var7.method_31772() == class_7268.field_37218 && !this.method_43499()) {
               return class_6910.field_35517;
            }

            if (this.method_43492(var1, var7, var6, var3)) {
               return class_6910.field_35520;
            }
         } else {
            class_6943 var8 = this.method_43512(var2);
            class_6943 var9 = !this.method_43504(var8) ? var8 : var7;
            if (this.method_26521(var9) && this.method_43492(var1, var9, var6, var3)) {
               return class_6910.field_35520;
            }
         }

         return class_6910.field_35521;
      } else {
         return class_6910.field_35518;
      }
   }

   private class_6943 method_43512(class_1343 var1) {
      class_6943 var4 = class_6943.field_35707;
      boolean var5 = this.method_43503();
      double var6 = !var5 ? var1.field_7333 : var1.field_7333 * 2.0;
      class_6943 var8 = class_6943.field_35700;
      if (var6 >= 0.1 && var6 < 0.1 + (!var5 ? 0.45 : 0.8) && this.method_26521(var8)) {
         var4 = class_6943.field_35700;
      } else if (var6 >= 0.9 + (!var5 ? 0.0 : 0.3) && var6 < 0.9 + (!var5 ? 0.7 : 1.0) && this.method_26521(class_6943.field_35708)) {
         var4 = class_6943.field_35708;
      } else if (var6 >= 0.4 && var6 < 0.4 + (!var5 ? 0.8 : 1.0) && this.method_26521(class_6943.field_35698)) {
         var4 = class_6943.field_35698;
      } else if (var6 >= 1.6 && this.method_26521(class_6943.field_35704)) {
         var4 = class_6943.field_35704;
      } else if (!this.method_26521(class_6943.field_35707) && this.method_26521(class_6943.field_35701)) {
         var4 = class_6943.field_35701;
      }

      return var4;
   }

   private boolean method_43504(class_6943 var1) {
      return (this.field_48051 & 1 << var1.method_31773()) != 0 || var1.method_31772() == class_7268.field_37218 && !this.method_43499();
   }

   private boolean method_43492(class_704 var1, class_6943 var2, ItemStack var3, class_2584 var4) {
      ItemStack var7 = this.method_26520(var2);
      if (!var7.method_28022() && (this.field_48051 & 1 << var2.method_31773() + 8) != 0) {
         return false;
      } else if (var7.method_28022() && (this.field_48051 & 1 << var2.method_31773() + 16) != 0) {
         return false;
      } else if (var1.field_3876.isCreativeMode && var7.method_28022() && !var3.method_28022()) {
         ItemStack var9 = var3.method_27973();
         var9.method_28017(1);
         this.method_37349(var2, var9);
         return true;
      } else if (var3.method_28022() || var3.method_27997() <= 1) {
         this.method_37349(var2, var3);
         var1.method_26615(var4, var7);
         return true;
      } else if (var7.method_28022()) {
         ItemStack var8 = var3.method_27973();
         var8.method_28017(1);
         this.method_37349(var2, var8);
         var3.method_27970(1);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean method_37181(class_6199 var1, float var2) {
      if (this.field_41768.field_33055 || this.field_41751) {
         return false;
      } else if (class_6199.field_31685.equals(var1)) {
         this.method_37204();
         return false;
      } else if (this.method_37180(var1) || this.field_48048 || this.method_43493()) {
         return false;
      } else if (var1.method_28367()) {
         this.method_43513(var1);
         this.method_37204();
         return false;
      } else if (!class_6199.field_31678.equals(var1)) {
         if (class_6199.field_31665.equals(var1) && this.method_26551() > 0.5F) {
            this.method_43505(var1, 4.0F);
            return false;
         } else {
            boolean var5 = var1.method_28353() instanceof class_6749;
            boolean var6 = var5 && ((class_6749)var1.method_28353()).method_30936() > 0;
            boolean var7 = "player".equals(var1.method_28347());
            if (!var7 && !var5) {
               return false;
            } else if (var1.method_28372() instanceof class_704 && !((class_704)var1.method_28372()).field_3876.allowEdit) {
               return false;
            } else if (var1.method_28349()) {
               this.method_43496();
               this.method_43498();
               this.method_37204();
               return var6;
            } else {
               long var8 = this.field_41768.method_29546();
               if (var8 - this.field_48050 > 5L && !var5) {
                  this.field_41768.method_29587(this, (byte)32);
                  this.field_48050 = var8;
               } else {
                  this.method_43500(var1);
                  this.method_43498();
                  this.method_37204();
               }

               return true;
            }
         }
      } else {
         if (!this.method_37264()) {
            this.method_37178(5);
         } else {
            this.method_43505(var1, 0.15F);
         }

         return false;
      }
   }

   @Override
   public void method_37336(byte var1) {
      if (var1 != 32) {
         super.method_37336(var1);
      } else if (this.field_41768.field_33055) {
         this.field_41768
            .method_29527(this.method_37302(), this.method_37309(), this.method_37156(), class_463.field_2551, this.method_37197(), 0.3F, 1.0F, false);
         this.field_48050 = this.field_41768.method_29546();
      }
   }

   @Override
   public boolean method_37176(double var1) {
      double var5 = this.method_37241().method_18906() * 4.0;
      if (Double.isNaN(var5) || var5 == 0.0) {
         var5 = 4.0;
      }

      var5 *= 64.0;
      return var1 < var5 * var5;
   }

   private void method_43498() {
      if (this.field_41768 instanceof class_6331) {
         ((class_6331)this.field_41768)
            .method_28957(
               new class_7110(class_3090.field_15325, class_4783.field_23893.method_29260()),
               this.method_37302(),
               this.method_37080(0.6666666666666666),
               this.method_37156(),
               10,
               (double)(this.method_37086() / 4.0F),
               (double)(this.method_37074() / 4.0F),
               (double)(this.method_37086() / 4.0F),
               0.05
            );
      }
   }

   private void method_43505(class_6199 var1, float var2) {
      float var5 = this.method_26551();
      var5 -= var2;
      if (!(var5 <= 0.5F)) {
         this.method_26456(var5);
      } else {
         this.method_43513(var1);
         this.method_37204();
      }
   }

   private void method_43500(class_6199 var1) {
      class_6414.method_29267(this.field_41768, this.method_37075(), new ItemStack(class_4897.field_24960));
      this.method_43513(var1);
   }

   private void method_43513(class_6199 var1) {
      this.method_43496();
      this.method_26513(var1);

      for (int var4 = 0; var4 < this.field_48058.size(); var4++) {
         ItemStack var5 = this.field_48058.get(var4);
         if (!var5.method_28022()) {
            class_6414.method_29267(this.field_41768, this.method_37075().method_6081(), var5);
            this.field_48058.set(var4, ItemStack.EMPTY);
         }
      }

      for (int var6 = 0; var6 < this.field_48054.size(); var6++) {
         ItemStack var7 = this.field_48054.get(var6);
         if (!var7.method_28022()) {
            class_6414.method_29267(this.field_41768, this.method_37075().method_6081(), var7);
            this.field_48054.set(var6, ItemStack.EMPTY);
         }
      }
   }

   private void method_43496() {
      this.field_41768
         .method_29528((class_704)null, this.method_37302(), this.method_37309(), this.method_37156(), class_463.field_2298, this.method_37197(), 1.0F, 1.0F);
   }

   @Override
   public float method_26582(float var1, float var2) {
      this.field_29611 = this.field_41711;
      this.field_29605 = this.field_41701;
      return 0.0F;
   }

   @Override
   public float method_26425(class_7653 var1, class_6097 var2) {
      return var2.field_31200 * (!this.method_26449() ? 0.9F : 0.5F);
   }

   @Override
   public double method_37106() {
      return !this.method_43493() ? 0.1F : 0.0;
   }

   @Override
   public void method_26431(class_1343 var1) {
      if (this.method_43497()) {
         super.method_26431(var1);
      }
   }

   @Override
   public void method_37090(float var1) {
      this.field_29611 = this.field_41711 = var1;
      this.field_29657 = this.field_29618 = var1;
   }

   @Override
   public void method_37161(float var1) {
      this.field_29611 = this.field_41711 = var1;
      this.field_29657 = this.field_29618 = var1;
   }

   @Override
   public void method_37123() {
      super.method_37123();
      class_1366 var3 = this.field_41735.<class_1366>method_36640(field_48059);
      if (!this.field_48044.equals(var3)) {
         this.method_43509(var3);
      }

      class_1366 var4 = this.field_41735.<class_1366>method_36640(field_48047);
      if (!this.field_48040.equals(var4)) {
         this.method_43489(var4);
      }

      class_1366 var5 = this.field_41735.<class_1366>method_36640(field_48057);
      if (!this.field_48041.equals(var5)) {
         this.method_43514(var5);
      }

      class_1366 var6 = this.field_41735.<class_1366>method_36640(field_48049);
      if (!this.field_48035.equals(var6)) {
         this.method_43501(var6);
      }

      class_1366 var7 = this.field_41735.<class_1366>method_36640(field_48046);
      if (!this.field_48055.equals(var7)) {
         this.method_43507(var7);
      }

      class_1366 var8 = this.field_41735.<class_1366>method_36640(field_48045);
      if (!this.field_48037.equals(var8)) {
         this.method_43494(var8);
      }
   }

   @Override
   public void method_26414() {
      this.method_37333(this.field_48048);
   }

   @Override
   public void method_37333(boolean var1) {
      this.field_48048 = var1;
      super.method_37333(var1);
   }

   @Override
   public boolean method_26449() {
      return this.method_43503();
   }

   @Override
   public void method_37250() {
      this.method_37204();
   }

   @Override
   public boolean method_37085() {
      return this.method_37109();
   }

   @Override
   public class_718 method_37132() {
      return !this.method_43493() ? super.method_37132() : class_718.field_3914;
   }

   private void method_43490(boolean var1) {
      this.field_41735.method_36633(field_48042, this.method_43502(this.field_41735.<Byte>method_36640(field_48042), 1, var1));
   }

   public boolean method_43503() {
      return (this.field_41735.<Byte>method_36640(field_48042) & 1) != 0;
   }

   private void method_43511(boolean var1) {
      this.field_41735.method_36633(field_48042, this.method_43502(this.field_41735.<Byte>method_36640(field_48042), 4, var1));
   }

   public boolean method_43499() {
      return (this.field_41735.<Byte>method_36640(field_48042) & 4) != 0;
   }

   private void method_43519(boolean var1) {
      this.field_41735.method_36633(field_48042, this.method_43502(this.field_41735.<Byte>method_36640(field_48042), 8, var1));
   }

   public boolean method_43495() {
      return (this.field_41735.<Byte>method_36640(field_48042) & 8) != 0;
   }

   private void method_43515(boolean var1) {
      this.field_41735.method_36633(field_48042, this.method_43502(this.field_41735.<Byte>method_36640(field_48042), 16, var1));
   }

   public boolean method_43493() {
      return (this.field_41735.<Byte>method_36640(field_48042) & 16) != 0;
   }

   private byte method_43502(byte var1, int var2, boolean var3) {
      if (!var3) {
         var1 = (byte)(var1 & ~var2);
      } else {
         var1 = (byte)(var1 | var2);
      }

      return var1;
   }

   public void method_43509(class_1366 var1) {
      this.field_48044 = var1;
      this.field_41735.method_36633(field_48059, var1);
   }

   public void method_43489(class_1366 var1) {
      this.field_48040 = var1;
      this.field_41735.method_36633(field_48047, var1);
   }

   public void method_43514(class_1366 var1) {
      this.field_48041 = var1;
      this.field_41735.method_36633(field_48057, var1);
   }

   public void method_43501(class_1366 var1) {
      this.field_48035 = var1;
      this.field_41735.method_36633(field_48049, var1);
   }

   public void method_43507(class_1366 var1) {
      this.field_48055 = var1;
      this.field_41735.method_36633(field_48046, var1);
   }

   public void method_43494(class_1366 var1) {
      this.field_48037 = var1;
      this.field_41735.method_36633(field_48045, var1);
   }

   public class_1366 method_43488() {
      return this.field_48044;
   }

   public class_1366 method_43517() {
      return this.field_48040;
   }

   public class_1366 method_43516() {
      return this.field_48041;
   }

   public class_1366 method_43487() {
      return this.field_48035;
   }

   public class_1366 method_43510() {
      return this.field_48055;
   }

   public class_1366 method_43491() {
      return this.field_48037;
   }

   @Override
   public boolean method_37167() {
      return super.method_37167() && !this.method_43493();
   }

   @Override
   public boolean method_37296(Entity var1) {
      return var1 instanceof class_704 && !this.field_41768.method_29538((class_704)var1, this.method_37075());
   }

   @Override
   public class_1736 method_26432() {
      return class_1736.field_8943;
   }

   @Override
   public class_8461 method_26587(int var1) {
      return class_463.field_2697;
   }

   @Nullable
   @Override
   public class_8461 method_26541(class_6199 var1) {
      return class_463.field_2551;
   }

   @Nullable
   @Override
   public class_8461 method_26599() {
      return class_463.field_2298;
   }

   @Override
   public void method_37384(class_6331 var1, class_900 var2) {
   }

   @Override
   public boolean method_26611() {
      return false;
   }

   @Override
   public void method_37191(class_7821<?> var1) {
      if (field_48042.equals(var1)) {
         this.method_37187();
         this.field_41759 = !this.method_43493();
      }

      super.method_37191(var1);
   }

   @Override
   public boolean method_26556() {
      return false;
   }

   @Override
   public class_6097 method_37190(class_7653 var1) {
      return this.method_43508(this.method_43493());
   }

   private class_6097 method_43508(boolean var1) {
      if (!var1) {
         return !this.method_26449() ? this.method_37387().method_30473() : field_48038;
      } else {
         return field_48060;
      }
   }

   @Override
   public class_1343 method_37339(float var1) {
      if (!this.method_43493()) {
         return super.method_37339(var1);
      } else {
         class_4092 var4 = this.method_43508(false).method_27939(this.method_37245());
         class_1331 var5 = this.method_37075();
         int var6 = Integer.MIN_VALUE;

         for (class_1331 var8 : class_1331.method_6076(
            new class_1331(var4.field_19941, var4.field_19937, var4.field_19938), new class_1331(var4.field_19940, var4.field_19939, var4.field_19942)
         )) {
            int var9 = Math.max(this.field_41768.method_25266(class_2957.field_14440, var8), this.field_41768.method_25266(class_2957.field_14437, var8));
            if (var9 == 15) {
               return class_1343.method_6216(var8);
            }

            if (var9 > var6) {
               var6 = var9;
               var5 = var8.method_6072();
            }
         }

         return class_1343.method_6216(var5);
      }
   }
}
