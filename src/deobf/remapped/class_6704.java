package remapped;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Random;
import javax.annotation.Nullable;

public class class_6704 extends class_5467 implements class_1869, class_9479 {
   private static final class_7821<Boolean> field_34610 = class_8073.<Boolean>method_36641(class_6704.class, class_2734.field_13347);
   private int field_34611;
   private int field_34612 = 0;
   private boolean field_34613 = false;
   public static final ImmutableList<? extends class_3172<? extends class_6127<? super class_6704>>> field_34608 = ImmutableList.of(
      class_3172.field_15861, class_3172.field_15860, class_3172.field_15863, class_3172.field_15873
   );
   public static final ImmutableList<? extends class_6044<?>> field_34609 = ImmutableList.of(
      class_6044.field_30892,
      class_6044.field_30907,
      class_6044.field_30901,
      class_6044.field_30870,
      class_6044.field_30912,
      class_6044.field_30874,
      class_6044.field_30889,
      class_6044.field_30909,
      class_6044.field_30888,
      class_6044.field_30884,
      class_6044.field_30865,
      class_6044.field_30863,
      new class_6044[]{
         class_6044.field_30913,
         class_6044.field_30878,
         class_6044.field_30906,
         class_6044.field_30915,
         class_6044.field_30885,
         class_6044.field_30905,
         class_6044.field_30860
      }
   );

   public class_6704(class_6629<? extends class_6704> var1, World var2) {
      super(var1, var2);
      this.field_29915 = 5;
   }

   @Override
   public boolean method_26887(class_704 var1) {
      return !this.method_26920();
   }

   public static class_1313 method_30713() {
      return class_1173.method_5201()
         .method_5984(class_7331.field_37468, 40.0)
         .method_5984(class_7331.field_37465, 0.3F)
         .method_5984(class_7331.field_37463, 0.6F)
         .method_5984(class_7331.field_37467, 1.0)
         .method_5984(class_7331.field_37462, 6.0);
   }

   @Override
   public boolean method_26442(Entity var1) {
      if (var1 instanceof class_5834) {
         this.field_34611 = 10;
         this.field_41768.method_29587(this, (byte)4);
         this.method_37155(class_463.field_2523, 1.0F, this.method_26547());
         class_6902.method_31606(this, (class_5834)var1);
         return class_9479.method_43797(this, (class_5834)var1);
      } else {
         return false;
      }
   }

   @Override
   public void method_26469(class_5834 var1) {
      if (this.method_30714()) {
         class_9479.method_43796(this, var1);
      }
   }

   @Override
   public boolean method_37181(class_6199 var1, float var2) {
      boolean var5 = super.method_37181(var1, var2);
      if (!this.field_41768.field_33055) {
         if (var5 && var1.method_28372() instanceof class_5834) {
            class_6902.method_31607(this, (class_5834)var1.method_28372());
         }

         return var5;
      } else {
         return false;
      }
   }

   @Override
   public class_1193<class_6704> method_26410() {
      return class_1150.<class_6704>method_5128(field_34609, field_34608);
   }

   @Override
   public class_1150<?> method_26585(Dynamic<?> var1) {
      return class_6902.method_31630(this.method_26410().method_5284(var1));
   }

   @Override
   public class_1150<class_6704> method_26525() {
      return (class_1150<class_6704>)super.method_26525();
   }

   @Override
   public void method_26919() {
      this.field_41768.method_29599().method_16056("hoglinBrain");
      this.method_26525().method_5141((class_6331)this.field_41768, this);
      this.field_41768.method_29599().method_16054();
      class_6902.method_31614(this);
      if (!this.method_30710()) {
         this.field_34612 = 0;
      } else {
         this.field_34612++;
         if (this.field_34612 > 300) {
            this.method_30706(class_463.field_2625);
            this.method_30712((class_6331)this.field_41768);
         }
      }
   }

   @Override
   public void method_26606() {
      if (this.field_34611 > 0) {
         this.field_34611--;
      }

      super.method_26606();
   }

   @Override
   public void method_8637() {
      if (!this.method_26449()) {
         this.field_29915 = 5;
         this.method_26561(class_7331.field_37462).method_45006(6.0);
      } else {
         this.field_29915 = 3;
         this.method_26561(class_7331.field_37462).method_45006(0.5);
      }
   }

   public static boolean method_30705(class_6629<class_6704> var0, class_9379 var1, class_2417 var2, class_1331 var3, Random var4) {
      return !var1.method_28262(var3.method_6100()).method_8350(class_4783.field_23273);
   }

   @Nullable
   @Override
   public class_8733 method_26864(class_1556 var1, class_9589 var2, class_2417 var3, class_8733 var4, class_5734 var5) {
      if (var1.method_43360().nextFloat() < 0.2F) {
         this.method_26910(true);
      }

      return super.method_26864(var1, var2, var3, var4, var5);
   }

   @Override
   public boolean method_26911(double var1) {
      return !this.method_26925();
   }

   @Override
   public float method_21376(class_1331 var1, class_4924 var2) {
      if (!class_6902.method_31615(this, var1)) {
         return !var2.method_28262(var1.method_6100()).method_8350(class_4783.field_23598) ? 0.0F : 10.0F;
      } else {
         return -1.0F;
      }
   }

   @Override
   public double method_37149() {
      return (double)this.method_37074() - (!this.method_26449() ? 0.15 : 0.2);
   }

   @Override
   public class_6910 method_26857(class_704 var1, class_2584 var2) {
      class_6910 var5 = super.method_26857(var1, var2);
      if (var5.method_31662()) {
         this.method_26883();
      }

      return var5;
   }

   @Override
   public void method_37336(byte var1) {
      if (var1 != 4) {
         super.method_37336(var1);
      } else {
         this.field_34611 = 10;
         this.method_37155(class_463.field_2523, 1.0F, this.method_26547());
      }
   }

   @Override
   public int method_43795() {
      return this.field_34611;
   }

   @Override
   public boolean method_26482() {
      return true;
   }

   @Override
   public int method_26427(class_704 var1) {
      return this.field_29915;
   }

   private void method_30712(class_6331 var1) {
      class_3895 var4 = this.<class_3895>method_26898(class_6629.field_34244, true);
      if (var4 != null) {
         var4.method_26558(new class_2250(class_4054.field_19732, 200, 0));
      }
   }

   @Override
   public boolean method_24866(class_6098 var1) {
      return var1.method_27960() == class_4897.field_24379;
   }

   public boolean method_30714() {
      return !this.method_26449();
   }

   @Override
   public void method_37329() {
      super.method_37329();
      this.field_41735.method_36634(field_34610, false);
   }

   @Override
   public void method_37376(class_5734 var1) {
      super.method_37376(var1);
      if (this.method_30709()) {
         var1.method_25934("IsImmuneToZombification", true);
      }

      var1.method_25931("TimeInOverworld", this.field_34612);
      if (this.field_34613) {
         var1.method_25934("CannotBeHunted", true);
      }
   }

   @Override
   public void method_37314(class_5734 var1) {
      super.method_37314(var1);
      this.method_30711(var1.method_25933("IsImmuneToZombification"));
      this.field_34612 = var1.method_25947("TimeInOverworld");
      this.method_30708(var1.method_25933("CannotBeHunted"));
   }

   public void method_30711(boolean var1) {
      this.method_37372().method_36633(field_34610, var1);
   }

   private boolean method_30709() {
      return this.method_37372().<Boolean>method_36640(field_34610);
   }

   public boolean method_30710() {
      return !this.field_41768.method_22572().method_40227() && !this.method_30709() && !this.method_26859();
   }

   private void method_30708(boolean var1) {
      this.field_34613 = var1;
   }

   public boolean method_30707() {
      return this.method_30714() && !this.field_34613;
   }

   @Nullable
   @Override
   public class_1899 method_8638(class_6331 var1, class_1899 var2) {
      class_6704 var5 = class_6629.field_34306.method_30484(var1);
      if (var5 != null) {
         var5.method_26883();
      }

      return var5;
   }

   @Override
   public boolean method_24870() {
      return !class_6902.method_31623(this) && super.method_24870();
   }

   @Override
   public class_562 method_37197() {
      return class_562.field_3332;
   }

   @Override
   public class_8461 method_26918() {
      return !this.field_41768.field_33055 ? class_6902.method_31618(this).orElse((class_8461)null) : null;
   }

   @Override
   public class_8461 method_26541(class_6199 var1) {
      return class_463.field_2463;
   }

   @Override
   public class_8461 method_26599() {
      return class_463.field_2667;
   }

   @Override
   public class_8461 method_37239() {
      return class_463.field_1986;
   }

   @Override
   public class_8461 method_37133() {
      return class_463.field_2384;
   }

   @Override
   public void method_37207(class_1331 var1, class_2522 var2) {
      this.method_37155(class_463.field_2064, 0.15F, 1.0F);
   }

   public void method_30706(class_8461 var1) {
      this.method_37155(var1, this.method_26439(), this.method_26547());
   }

   @Override
   public void method_26929() {
      super.method_26929();
      class_1892.method_8440(this);
   }
}
