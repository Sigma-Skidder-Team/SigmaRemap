package remapped;

import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.LinkedHashSet;
import java.util.Random;
import javax.annotation.Nullable;

public class class_1775 extends class_5467 implements class_8190, class_9378 {
   private static String[] field_9092;
   private static final class_8137 field_9091 = class_8137.method_37019(class_4897.field_24963);
   private static final class_8137 field_9089 = class_8137.method_37019(class_4897.field_24963, class_4897.field_24651);
   private static final class_7821<Integer> field_9090 = class_8073.<Integer>method_36641(class_1775.class, class_2734.field_13366);
   private static final class_7821<Boolean> field_9094 = class_8073.<Boolean>method_36641(class_1775.class, class_2734.field_13347);
   private static final class_7821<Boolean> field_9088 = class_8073.<Boolean>method_36641(class_1775.class, class_2734.field_13347);
   private final class_686 field_9086 = new class_686(this.field_41735, field_9090, field_9088);
   private class_7228 field_9093;
   private class_518 field_9087;

   public class_1775(class_6629<? extends class_1775> var1, World var2) {
      super(var1, var2);
      this.field_41759 = true;
      this.method_26895(class_1108.field_6359, -1.0F);
      this.method_26895(class_1108.field_6360, 0.0F);
      this.method_26895(class_1108.field_6357, 0.0F);
      this.method_26895(class_1108.field_6352, 0.0F);
   }

   public static boolean method_7926(class_6629<class_1775> var0, class_9379 var1, class_2417 var2, class_1331 var3, Random var4) {
      class_2921 var7 = var3.method_6089();

      do {
         var7.method_13368(Direction.field_817);
      } while (var1.method_28258(var7).method_22007(class_6503.field_33095));

      return var1.method_28262(var7).method_8345();
   }

   @Override
   public void method_37191(class_7821<?> var1) {
      if (field_9090.equals(var1) && this.field_41768.field_33055) {
         this.field_9086.method_3108();
      }

      super.method_37191(var1);
   }

   @Override
   public void method_37329() {
      super.method_37329();
      this.field_41735.method_36634(field_9090, 0);
      this.field_41735.method_36634(field_9094, false);
      this.field_41735.method_36634(field_9088, false);
   }

   @Override
   public void method_37376(class_5734 var1) {
      super.method_37376(var1);
      this.field_9086.method_3111(var1);
   }

   @Override
   public void method_37314(class_5734 var1) {
      super.method_37314(var1);
      this.field_9086.method_3106(var1);
   }

   @Override
   public boolean method_43357() {
      return this.field_9086.method_3110();
   }

   @Override
   public boolean method_43356() {
      return this.method_37330() && !this.method_26449();
   }

   @Override
   public void method_43358(class_562 var1) {
      this.field_9086.method_3112(true);
      if (var1 != null) {
         this.field_41768.method_29540((class_704)null, this, class_463.field_2057, var1, 0.5F, 1.0F);
      }
   }

   @Override
   public void method_26851() {
      this.field_9087 = new class_518(this, 1.65);
      this.field_29916.method_3485(1, this.field_9087);
      this.field_29916.method_3485(2, new class_9513(this, 1.0));
      this.field_9093 = new class_7228(this, 1.4, false, field_9089);
      this.field_29916.method_3485(3, this.field_9093);
      this.field_29916.method_3485(4, new class_1476(this, 1.5, null));
      this.field_29916.method_3485(5, new class_8676(this, 1.1));
      this.field_29916.method_3485(7, new class_8285(this, 1.0, 60));
      this.field_29916.method_3485(8, new class_4407(this, class_704.class, 8.0F));
      this.field_29916.method_3485(8, new class_9691(this));
      this.field_29916.method_3485(9, new class_4407(this, class_1775.class, 8.0F));
   }

   public void method_7921(boolean var1) {
      this.field_41735.method_36633(field_9094, var1);
   }

   public boolean method_7924() {
      return !(this.method_37243() instanceof class_1775)
         ? this.field_41735.<Boolean>method_36640(field_9094)
         : ((class_1775)this.method_37243()).method_7924();
   }

   @Override
   public boolean method_26496(class_2340 var1) {
      return var1.method_10724(class_6503.field_33095);
   }

   @Override
   public double method_37149() {
      float var3 = Math.min(0.25F, this.field_29643);
      float var4 = this.field_29671;
      return (double)this.method_37074() - 0.19 + (double)(0.12F * class_9299.method_42840(var4 * 1.5F) * 2.0F * var3);
   }

   @Override
   public boolean method_26863() {
      Entity var3 = this.method_37259();
      if (!(var3 instanceof class_704)) {
         return false;
      } else {
         class_704 var4 = (class_704)var3;
         return var4.method_26446().method_27960() == class_4897.field_24651 || var4.method_26568().method_27960() == class_4897.field_24651;
      }
   }

   @Override
   public boolean method_26855(class_4924 var1) {
      return var1.method_6677(this);
   }

   @Nullable
   @Override
   public Entity method_37259() {
      return !this.method_37114().isEmpty() ? this.method_37114().get(0) : null;
   }

   @Override
   public class_1343 method_37282(class_5834 var1) {
      class_1343[] var4 = new class_1343[]{
         method_37373((double)this.method_37086(), (double)var1.method_37086(), var1.field_41701),
         method_37373((double)this.method_37086(), (double)var1.method_37086(), var1.field_41701 - 22.5F),
         method_37373((double)this.method_37086(), (double)var1.method_37086(), var1.field_41701 + 22.5F),
         method_37373((double)this.method_37086(), (double)var1.method_37086(), var1.field_41701 - 45.0F),
         method_37373((double)this.method_37086(), (double)var1.method_37086(), var1.field_41701 + 45.0F)
      };
      LinkedHashSet var5 = Sets.newLinkedHashSet();
      double var6 = this.method_37241().field_19939;
      double var8 = this.method_37241().field_19937 - 0.5;
      class_2921 var10 = new class_2921();

      for (class_1343 var14 : var4) {
         var10.method_13361(this.method_37302() + var14.field_7336, var6, this.method_37156() + var14.field_7334);

         for (double var15 = var6; var15 > var8; var15--) {
            var5.add(var10.method_6072());
            var10.method_13368(Direction.field_802);
         }
      }

      for (class_1331 var24 : var5) {
         if (!this.field_41768.method_28258(var24).method_22007(class_6503.field_33095)) {
            double var17 = this.field_41768.method_28259(var24);
            if (class_160.method_648(var17)) {
               class_1343 var19 = class_1343.method_6219(var24, var17);
               UnmodifiableIterator var20 = var1.method_26454().iterator();

               while (var20.hasNext()) {
                  class_7653 var21 = (class_7653)var20.next();
                  class_4092 var22 = var1.method_26549(var21);
                  if (class_160.method_647(this.field_41768, var1, var22.method_18920(var19))) {
                     var1.method_37356(var21);
                     return var19;
                  }
               }
            }
         }
      }

      return new class_1343(this.method_37302(), this.method_37241().field_19939, this.method_37156());
   }

   @Override
   public void method_26431(class_1343 var1) {
      this.method_26461(this.method_7923());
      this.method_37517(this, this.field_9086, var1);
   }

   public float method_7923() {
      return (float)this.method_26575(class_7331.field_37465) * (!this.method_7924() ? 1.0F : 0.66F);
   }

   @Override
   public float method_37516() {
      return (float)this.method_26575(class_7331.field_37465) * (!this.method_7924() ? 0.55F : 0.23F);
   }

   @Override
   public void method_37519(class_1343 var1) {
      super.method_26431(var1);
   }

   @Override
   public float method_37316() {
      return this.field_41723 + 0.6F;
   }

   @Override
   public void method_37207(class_1331 var1, class_2522 var2) {
      this.method_37155(!this.method_37370() ? class_463.field_2173 : class_463.field_1925, 1.0F, 1.0F);
   }

   @Override
   public boolean method_37518() {
      return this.field_9086.method_3109(this.method_26594());
   }

   @Override
   public void method_37105(double var1, boolean var3, class_2522 var4, class_1331 var5) {
      this.method_37097();
      if (!this.method_37370()) {
         super.method_37105(var1, var3, var4, var5);
      } else {
         this.field_41706 = 0.0F;
      }
   }

   @Override
   public void method_37123() {
      if (this.method_7922() && this.field_41717.nextInt(140) == 0) {
         this.method_37155(class_463.field_2400, 1.0F, this.method_26547());
      } else if (this.method_7929() && this.field_41717.nextInt(60) == 0) {
         this.method_37155(class_463.field_2706, 1.0F, this.method_26547());
      }

      class_2522 var3 = this.field_41768.method_28262(this.method_37075());
      class_2522 var4 = this.method_37304();
      boolean var5 = var3.method_8349(class_2351.field_11744) || var4.method_8349(class_2351.field_11744) || this.method_37284(class_6503.field_33095) > 0.0;
      this.method_7921(!var5);
      super.method_37123();
      this.method_7925();
      this.method_37097();
   }

   private boolean method_7929() {
      return this.field_9087 != null && this.field_9087.method_2536();
   }

   private boolean method_7922() {
      return this.field_9093 != null && this.field_9093.method_33089();
   }

   @Override
   public boolean method_26924() {
      return true;
   }

   private void method_7925() {
      if (this.method_37370()) {
         class_214 var3 = class_214.method_926(this);
         if (var3.method_927(class_7855.field_39807, this.method_37075(), true)
            && !this.field_41768.method_28258(this.method_37075().method_6081()).method_22007(class_6503.field_33095)) {
            this.field_41726 = true;
         } else {
            this.method_37215(this.method_37098().method_6209(0.5).method_6214(0.0, 0.05, 0.0));
         }
      }
   }

   public static class_1313 method_7928() {
      return class_5886.method_26846().method_5984(class_7331.field_37465, 0.175F).method_5984(class_7331.field_37471, 16.0);
   }

   @Override
   public class_8461 method_26918() {
      return !this.method_7929() && !this.method_7922() ? class_463.field_2754 : null;
   }

   @Override
   public class_8461 method_26541(class_6199 var1) {
      return class_463.field_2599;
   }

   @Override
   public class_8461 method_26599() {
      return class_463.field_2327;
   }

   @Override
   public boolean method_37286(Entity var1) {
      return this.method_37114().isEmpty() && !this.method_37261(class_6503.field_33095);
   }

   @Override
   public boolean method_26537() {
      return true;
   }

   @Override
   public boolean method_37264() {
      return false;
   }

   @Override
   public class_1249 method_26933(World var1) {
      return new class_7632(this, var1);
   }

   @Override
   public float method_21376(class_1331 var1, class_4924 var2) {
      if (!var2.method_28262(var1).method_8364().method_22007(class_6503.field_33095)) {
         return !this.method_37370() ? 0.0F : Float.NEGATIVE_INFINITY;
      } else {
         return 10.0F;
      }
   }

   public class_1775 method_7930(class_6331 var1, class_1899 var2) {
      return class_6629.field_34233.method_30484(var1);
   }

   @Override
   public boolean method_24866(class_6098 var1) {
      return field_9091.test(var1);
   }

   @Override
   public void method_26522() {
      super.method_26522();
      if (this.method_43357()) {
         this.method_37312(class_4897.field_24836);
      }
   }

   @Override
   public class_6910 method_26857(class_704 var1, class_2584 var2) {
      boolean var5 = this.method_24866(var1.method_26617(var2));
      if (!var5 && this.method_43357() && !this.method_37151() && !var1.method_3236()) {
         if (!this.field_41768.field_33055) {
            var1.method_37353(this);
         }

         return class_6910.method_31659(this.field_41768.field_33055);
      } else {
         class_6910 var6 = super.method_26857(var1, var2);
         if (var6.method_31662()) {
            if (var5 && !this.method_37378()) {
               this.field_41768
                  .method_29528(
                     (class_704)null,
                     this.method_37302(),
                     this.method_37309(),
                     this.method_37156(),
                     class_463.field_2762,
                     this.method_37197(),
                     1.0F,
                     1.0F + (this.field_41717.nextFloat() - this.field_41717.nextFloat()) * 0.2F
                  );
            }

            return var6;
         } else {
            class_6098 var7 = var1.method_26617(var2);
            return var7.method_27960() != class_4897.field_24836 ? class_6910.field_35521 : var7.method_28000(var1, this, var2);
         }
      }
   }

   @Override
   public class_1343 method_37323() {
      return new class_1343(0.0, (double)(0.6F * this.method_37277()), (double)(this.method_37086() * 0.4F));
   }

   @Nullable
   @Override
   public class_8733 method_26864(class_1556 var1, class_9589 var2, class_2417 var3, class_8733 var4, class_5734 var5) {
      if (!this.method_26449()) {
         Object var8;
         if (this.field_41717.nextInt(30) != 0) {
            if (this.field_41717.nextInt(10) != 0) {
               var8 = new class_1821(0.5F);
            } else {
               class_1899 var9 = class_6629.field_34233.method_30484(var1.method_7066());
               var9.method_8635(-24000);
               var8 = this.method_7927(var1, var2, var9, (class_8733)null);
            }
         } else {
            class_5886 var10 = class_6629.field_34234.method_30484(var1.method_7066());
            var8 = this.method_7927(var1, var2, var10, new class_2582(class_2811.method_12789(this.field_41717), false));
            var10.method_37349(class_6943.field_35707, new class_6098(class_4897.field_24651));
            this.method_43358((class_562)null);
         }

         return super.method_26864(var1, var2, var3, (class_8733)var8, var5);
      } else {
         return super.method_26864(var1, var2, var3, var4, var5);
      }
   }

   private class_8733 method_7927(class_1556 var1, class_9589 var2, class_5886 var3, class_8733 var4) {
      var3.method_37144(this.method_37302(), this.method_37309(), this.method_37156(), this.field_41701, 0.0F);
      var3.method_26864(var1, var2, class_2417.field_12037, var4, (class_5734)null);
      var3.method_37354(this, true);
      return new class_1821(0.0F);
   }
}
