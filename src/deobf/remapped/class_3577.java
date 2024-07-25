package remapped;

import java.util.Optional;
import javax.annotation.Nullable;

public class class_3577 extends Entity {
   private static final class_7821<Optional<class_1331>> field_17509 = class_8073.<Optional<class_1331>>method_36641(class_3577.class, class_2734.field_13352);
   private static final class_7821<Boolean> field_17507 = class_8073.<Boolean>method_36641(class_3577.class, class_2734.field_13347);
   public int field_17510;

   public class_3577(class_6629<? extends class_3577> var1, World var2) {
      super(var1, var2);
      this.field_41759 = true;
      this.field_17510 = this.field_41717.nextInt(100000);
   }

   public class_3577(World var1, double var2, double var4, double var6) {
      this(class_6629.field_34273, var1);
      this.method_37256(var2, var4, var6);
   }

   @Override
   public boolean method_37126() {
      return false;
   }

   @Override
   public void method_37329() {
      this.method_37372().method_36634(field_17509, Optional.<class_1331>empty());
      this.method_37372().method_36634(field_17507, true);
   }

   @Override
   public void method_37123() {
      this.field_17510++;
      if (this.field_41768 instanceof class_6331) {
         class_1331 var3 = this.method_37075();
         if (((class_6331)this.field_41768).method_28967() != null && this.field_41768.method_28262(var3).method_8345()) {
            this.field_41768.method_29594(var3, class_9476.method_43768(this.field_41768, var3));
         }
      }
   }

   @Override
   public void method_37376(CompoundNBT var1) {
      if (this.method_16624() != null) {
         var1.put("BeamTarget", class_4338.method_20190(this.method_16624()));
      }

      var1.putBoolean("ShowBottom", this.method_16626());
   }

   @Override
   public void method_37314(CompoundNBT var1) {
      if (var1.contains("BeamTarget", 10)) {
         this.method_16625(class_4338.method_20189(var1.getCompound("BeamTarget")));
      }

      if (var1.contains("ShowBottom", 1)) {
         this.method_16627(var1.getBoolean("ShowBottom"));
      }
   }

   @Override
   public boolean method_37167() {
      return true;
   }

   @Override
   public boolean method_37181(class_6199 var1, float var2) {
      if (!this.method_37180(var1)) {
         if (!(var1.method_28372() instanceof class_2770)) {
            if (!this.field_41751 && !this.field_41768.field_33055) {
               this.method_37204();
               if (!var1.method_28367()) {
                  this.field_41768.method_29573((Entity)null, this.method_37302(), this.method_37309(), this.method_37156(), 6.0F, class_7298.field_37311);
               }

               this.method_16628(var1);
            }

            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Override
   public void method_37250() {
      this.method_16628(class_6199.field_31664);
      super.method_37250();
   }

   private void method_16628(class_6199 var1) {
      if (this.field_41768 instanceof class_6331) {
         class_2810 var4 = ((class_6331)this.field_41768).method_28967();
         if (var4 != null) {
            var4.method_12775(this, var1);
         }
      }
   }

   public void method_16625(class_1331 var1) {
      this.method_37372().method_36633(field_17509, Optional.<class_1331>ofNullable(var1));
   }

   @Nullable
   public class_1331 method_16624() {
      return this.method_37372().<Optional<class_1331>>method_36640(field_17509).orElse((class_1331)null);
   }

   public void method_16627(boolean var1) {
      this.method_37372().method_36633(field_17507, var1);
   }

   public boolean method_16626() {
      return this.method_37372().<Boolean>method_36640(field_17507);
   }

   @Override
   public boolean method_37176(double var1) {
      return super.method_37176(var1) || this.method_16624() != null;
   }

   @Override
   public Packet<?> method_37142() {
      return new class_6589(this);
   }
}
