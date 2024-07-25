package remapped;

import java.util.UUID;
import javax.annotation.Nullable;

public class class_3551 extends class_4109 {
   private static final UUID field_17373 = UUID.fromString("556E1665-8B10-40C8-8F9D-CF9B1667F295");
   private static final class_7821<Integer> field_17374 = class_8073.<Integer>method_36641(class_3551.class, class_2734.field_13366);

   public class_3551(class_6629<? extends class_3551> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public void method_19084() {
      this.method_26561(class_7331.field_37468).method_45006((double)this.method_19082());
      this.method_26561(class_7331.field_37465).method_45006(this.method_19087());
      this.method_26561(class_7331.field_37464).method_45006(this.method_19046());
   }

   @Override
   public void method_37329() {
      super.method_37329();
      this.field_41735.method_36634(field_17374, 0);
   }

   @Override
   public void method_37376(CompoundNBT var1) {
      super.method_37376(var1);
      var1.method_25931("Variant", this.method_16529());
      if (!this.field_20021.method_31498(1).method_28022()) {
         var1.method_25946("ArmorItem", this.field_20021.method_31498(1).method_27998(new CompoundNBT()));
      }
   }

   public ItemStack method_16523() {
      return this.method_26520(class_6943.field_35708);
   }

   private void method_16527(ItemStack var1) {
      this.method_37349(class_6943.field_35708, var1);
      this.method_26861(class_6943.field_35708, 0.0F);
   }

   @Override
   public void method_37314(CompoundNBT var1) {
      super.method_37314(var1);
      this.method_16525(var1.method_25947("Variant"));
      if (var1.method_25939("ArmorItem", 10)) {
         ItemStack var4 = ItemStack.method_28015(var1.method_25937("ArmorItem"));
         if (!var4.method_28022() && this.method_19069(var4)) {
            this.field_20021.method_31503(1, var4);
         }
      }

      this.method_19070();
   }

   private void method_16525(int var1) {
      this.field_41735.method_36633(field_17374, var1);
   }

   private int method_16529() {
      return this.field_41735.<Integer>method_36640(field_17374);
   }

   private void method_16528(class_2185 var1, class_180 var2) {
      this.method_16525(var1.method_10146() & 0xFF | var2.method_810() << 8 & 0xFF00);
   }

   public class_2185 method_16524() {
      return class_2185.method_10145(this.method_16529() & 0xFF);
   }

   public class_180 method_16526() {
      return class_180.method_811((this.method_16529() & 0xFF00) >> 8);
   }

   @Override
   public void method_19070() {
      if (!this.field_41768.field_33055) {
         super.method_19070();
         this.method_16522(this.field_20021.method_31498(1));
         this.method_26861(class_6943.field_35708, 0.0F);
      }
   }

   private void method_16522(ItemStack var1) {
      this.method_16527(var1);
      if (!this.field_41768.field_33055) {
         this.method_26561(class_7331.field_37473).method_45003(field_17373);
         if (this.method_19069(var1)) {
            int var4 = ((class_2706)var1.method_27960()).method_12198();
            if (var4 != 0) {
               this.method_26561(class_7331.field_37473).method_45011(new class_9343(field_17373, "Horse armor bonus", (double)var4, class_9342.field_47679));
            }
         }
      }
   }

   @Override
   public void method_36982(class_6867 var1) {
      ItemStack var4 = this.method_16523();
      super.method_36982(var1);
      ItemStack var5 = this.method_16523();
      if (this.field_41697 > 20 && this.method_19069(var5) && var4 != var5) {
         this.method_37155(class_463.field_2183, 0.5F, 1.0F);
      }
   }

   @Override
   public void method_19053(class_4618 var1) {
      super.method_19053(var1);
      if (this.field_41717.nextInt(10) == 0) {
         this.method_37155(class_463.field_2148, var1.method_21395() * 0.6F, var1.method_21393());
      }
   }

   @Override
   public class_8461 method_26918() {
      super.method_26918();
      return class_463.field_2496;
   }

   @Override
   public class_8461 method_26599() {
      super.method_26599();
      return class_463.field_2149;
   }

   @Nullable
   @Override
   public class_8461 method_19083() {
      return class_463.field_2153;
   }

   @Override
   public class_8461 method_26541(class_6199 var1) {
      super.method_26541(var1);
      return class_463.field_2451;
   }

   @Override
   public class_8461 method_19056() {
      super.method_19056();
      return class_463.field_2113;
   }

   @Override
   public class_6910 method_26857(class_704 var1, class_2584 var2) {
      ItemStack var5 = var1.method_26617(var2);
      if (!this.method_26449()) {
         if (this.method_19043() && var1.method_3236()) {
            this.method_19076(var1);
            return class_6910.method_31659(this.field_41768.field_33055);
         }

         if (this.method_37151()) {
            return super.method_26857(var1, var2);
         }
      }

      if (!var5.method_28022()) {
         if (this.method_24866(var5)) {
            return this.method_19079(var1, var5);
         }

         class_6910 var6 = var5.method_28000(var1, this, var2);
         if (var6.method_31662()) {
            return var6;
         }

         if (!this.method_19043()) {
            this.method_19037();
            return class_6910.method_31659(this.field_41768.field_33055);
         }

         boolean var7 = !this.method_26449() && !this.method_43357() && var5.method_27960() == class_4897.field_24836;
         if (this.method_19069(var5) || var7) {
            this.method_19076(var1);
            return class_6910.method_31659(this.field_41768.field_33055);
         }
      }

      if (!this.method_26449()) {
         this.method_19039(var1);
         return class_6910.method_31659(this.field_41768.field_33055);
      } else {
         return super.method_26857(var1, var2);
      }
   }

   @Override
   public boolean method_24873(class_5467 var1) {
      if (var1 != this) {
         return !(var1 instanceof class_141) && !(var1 instanceof class_3551) ? false : this.method_19058() && ((class_4109)var1).method_19058();
      } else {
         return false;
      }
   }

   @Override
   public class_1899 method_8638(class_6331 var1, class_1899 var2) {
      class_4109 var6;
      if (!(var2 instanceof class_141)) {
         class_3551 var5 = (class_3551)var2;
         var6 = class_6629.field_34286.method_30484(var1);
         int var7 = this.field_41717.nextInt(9);
         class_2185 var8;
         if (var7 >= 4) {
            if (var7 >= 8) {
               var8 = Util.<class_2185>method_44697(class_2185.values(), this.field_41717);
            } else {
               var8 = var5.method_16524();
            }
         } else {
            var8 = this.method_16524();
         }

         int var9 = this.field_41717.nextInt(5);
         class_180 var10;
         if (var9 >= 2) {
            if (var9 >= 4) {
               var10 = Util.<class_180>method_44697(class_180.values(), this.field_41717);
            } else {
               var10 = var5.method_16526();
            }
         } else {
            var10 = this.method_16526();
         }

         ((class_3551)var6).method_16528(var8, var10);
      } else {
         var6 = class_6629.field_34218.method_30484(var1);
      }

      this.method_19055(var2, var6);
      return var6;
   }

   @Override
   public boolean method_19052() {
      return true;
   }

   @Override
   public boolean method_19069(ItemStack var1) {
      return var1.method_27960() instanceof class_2706;
   }

   @Nullable
   @Override
   public class_8733 method_26864(class_1556 var1, class_9589 var2, class_2417 var3, class_8733 var4, CompoundNBT var5) {
      class_2185 var8;
      if (!(var4 instanceof class_3075)) {
         var8 = Util.<class_2185>method_44697(class_2185.values(), this.field_41717);
         var4 = new class_3075(var8);
      } else {
         var8 = ((class_3075)var4).field_15116;
      }

      this.method_16528(var8, Util.<class_180>method_44697(class_180.values(), this.field_41717));
      return super.method_26864(var1, var2, var3, (class_8733)var4, var5);
   }
}
