package remapped;

import java.util.Random;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class class_3845 extends class_5467 {
   private static final class_7821<class_1331> field_18771 = class_8073.<class_1331>method_36641(class_3845.class, class_2734.field_13353);
   private static final class_7821<Boolean> field_18769 = class_8073.<Boolean>method_36641(class_3845.class, class_2734.field_13347);
   private static final class_7821<Boolean> field_18765 = class_8073.<Boolean>method_36641(class_3845.class, class_2734.field_13347);
   private static final class_7821<class_1331> field_18766 = class_8073.<class_1331>method_36641(class_3845.class, class_2734.field_13353);
   private static final class_7821<Boolean> field_18764 = class_8073.<Boolean>method_36641(class_3845.class, class_2734.field_13347);
   private static final class_7821<Boolean> field_18770 = class_8073.<Boolean>method_36641(class_3845.class, class_2734.field_13347);
   private int field_18767;
   public static final Predicate<class_5834> field_18768 = var0 -> var0.method_26449() && !var0.method_37285();

   public class_3845(class_6629<? extends class_3845> var1, World var2) {
      super(var1, var2);
      this.method_26895(class_1108.field_6359, 0.0F);
      this.field_29900 = new class_2320(this);
      this.field_41733 = 1.0F;
   }

   public void method_17859(class_1331 var1) {
      this.field_41735.method_36633(field_18771, var1);
   }

   private class_1331 method_17868() {
      return this.field_41735.<class_1331>method_36640(field_18771);
   }

   private void method_17847(class_1331 var1) {
      this.field_41735.method_36633(field_18766, var1);
   }

   private class_1331 method_17852() {
      return this.field_41735.<class_1331>method_36640(field_18766);
   }

   public boolean method_17856() {
      return this.field_41735.<Boolean>method_36640(field_18769);
   }

   private void method_17865(boolean var1) {
      this.field_41735.method_36633(field_18769, var1);
   }

   public boolean method_17862() {
      return this.field_41735.<Boolean>method_36640(field_18765);
   }

   private void method_17850(boolean var1) {
      this.field_18767 = !var1 ? 0 : 1;
      this.field_41735.method_36633(field_18765, var1);
   }

   private boolean method_17864() {
      return this.field_41735.<Boolean>method_36640(field_18764);
   }

   private void method_17870(boolean var1) {
      this.field_41735.method_36633(field_18764, var1);
   }

   private boolean method_17867() {
      return this.field_41735.<Boolean>method_36640(field_18770);
   }

   private void method_17853(boolean var1) {
      this.field_41735.method_36633(field_18770, var1);
   }

   @Override
   public void method_37329() {
      super.method_37329();
      this.field_41735.method_36634(field_18771, class_1331.field_7306);
      this.field_41735.method_36634(field_18769, false);
      this.field_41735.method_36634(field_18766, class_1331.field_7306);
      this.field_41735.method_36634(field_18764, false);
      this.field_41735.method_36634(field_18770, false);
      this.field_41735.method_36634(field_18765, false);
   }

   @Override
   public void method_37376(class_5734 var1) {
      super.method_37376(var1);
      var1.method_25931("HomePosX", this.method_17868().method_12173());
      var1.method_25931("HomePosY", this.method_17868().method_12165());
      var1.method_25931("HomePosZ", this.method_17868().method_12185());
      var1.method_25934("HasEgg", this.method_17856());
      var1.method_25931("TravelPosX", this.method_17852().method_12173());
      var1.method_25931("TravelPosY", this.method_17852().method_12165());
      var1.method_25931("TravelPosZ", this.method_17852().method_12185());
   }

   @Override
   public void method_37314(class_5734 var1) {
      int var4 = var1.method_25947("HomePosX");
      int var5 = var1.method_25947("HomePosY");
      int var6 = var1.method_25947("HomePosZ");
      this.method_17859(new class_1331(var4, var5, var6));
      super.method_37314(var1);
      this.method_17865(var1.method_25933("HasEgg"));
      int var7 = var1.method_25947("TravelPosX");
      int var8 = var1.method_25947("TravelPosY");
      int var9 = var1.method_25947("TravelPosZ");
      this.method_17847(new class_1331(var7, var8, var9));
   }

   @Nullable
   @Override
   public class_8733 method_26864(class_1556 var1, class_9589 var2, class_2417 var3, class_8733 var4, class_5734 var5) {
      this.method_17859(this.method_37075());
      this.method_17847(class_1331.field_7306);
      return super.method_26864(var1, var2, var3, var4, var5);
   }

   public static boolean method_17861(class_6629<class_3845> var0, class_9379 var1, class_2417 var2, class_1331 var3, Random var4) {
      return var3.method_12165() < var1.method_22552() + 4 && class_1477.method_6812(var1, var3) && var1.method_25261(var3, 0) > 8;
   }

   @Override
   public void method_26851() {
      this.field_29916.method_3485(0, new class_2897(this, 1.2));
      this.field_29916.method_3485(1, new class_675(this, 1.0));
      this.field_29916.method_3485(1, new class_1117(this, 1.0));
      this.field_29916.method_3485(2, new class_6316(this, 1.1, class_4783.field_23563.method_10803()));
      this.field_29916.method_3485(3, new class_6549(this, 1.0, null));
      this.field_29916.method_3485(4, new class_7698(this, 1.0));
      this.field_29916.method_3485(7, new class_59(this, 1.0));
      this.field_29916.method_3485(8, new class_4407(this, class_704.class, 8.0F));
      this.field_29916.method_3485(9, new class_8373(this, 1.0, 100, null));
   }

   public static class_1313 method_17860() {
      return class_5886.method_26846().method_5984(class_7331.field_37468, 30.0).method_5984(class_7331.field_37465, 0.25);
   }

   @Override
   public boolean method_37107() {
      return false;
   }

   @Override
   public boolean method_26509() {
      return true;
   }

   @Override
   public class_2780 method_26550() {
      return class_2780.field_13578;
   }

   @Override
   public int method_26850() {
      return 200;
   }

   @Nullable
   @Override
   public class_8461 method_26918() {
      return !this.method_37285() && this.field_41726 && !this.method_26449() ? class_463.field_2278 : super.method_26918();
   }

   @Override
   public void method_37203(float var1) {
      super.method_37203(var1 * 1.5F);
   }

   @Override
   public class_8461 method_37239() {
      return class_463.field_2003;
   }

   @Nullable
   @Override
   public class_8461 method_26541(class_6199 var1) {
      return !this.method_26449() ? class_463.field_1988 : class_463.field_2223;
   }

   @Nullable
   @Override
   public class_8461 method_26599() {
      return !this.method_26449() ? class_463.field_2634 : class_463.field_2642;
   }

   @Override
   public void method_37207(class_1331 var1, class_2522 var2) {
      class_8461 var5 = !this.method_26449() ? class_463.field_2174 : class_463.field_1977;
      this.method_37155(var5, 0.15F, 1.0F);
   }

   @Override
   public boolean method_24870() {
      return super.method_24870() && !this.method_17856();
   }

   @Override
   public float method_37316() {
      return this.field_41723 + 0.15F;
   }

   @Override
   public float method_26479() {
      return !this.method_26449() ? 1.0F : 0.3F;
   }

   @Override
   public class_1249 method_26933(World var1) {
      return new class_4704(this, var1);
   }

   @Nullable
   @Override
   public class_1899 method_8638(class_6331 var1, class_1899 var2) {
      return class_6629.field_34283.method_30484(var1);
   }

   @Override
   public boolean method_24866(class_6098 var1) {
      return var1.method_27960() == class_4783.field_23563.method_10803();
   }

   @Override
   public float method_21376(class_1331 var1, class_4924 var2) {
      if (!this.method_17864() && var2.method_28258(var1).method_22007(class_6503.field_33094)) {
         return 10.0F;
      } else {
         return !class_1477.method_6812(var2, var1) ? var2.method_22566(var1) - 0.5F : 10.0F;
      }
   }

   @Override
   public void method_26606() {
      super.method_26606();
      if (this.method_37330() && this.method_17862() && this.field_18767 >= 1 && this.field_18767 % 5 == 0) {
         class_1331 var3 = this.method_37075();
         if (class_1477.method_6812(this.field_41768, var3)) {
            this.field_41768.method_43364(2001, var3, class_6414.method_29285(class_4783.field_23216.method_29260()));
         }
      }
   }

   @Override
   public void method_8637() {
      super.method_8637();
      if (!this.method_26449() && this.field_41768.method_29537().method_1285(class_291.field_1033)) {
         this.method_37313(class_4897.field_24631, 1);
      }
   }

   @Override
   public void method_26431(class_1343 var1) {
      if (this.method_26530() && this.method_37285()) {
         this.method_37092(0.1F, var1);
         this.method_37226(class_7412.field_37839, this.method_37098());
         this.method_37215(this.method_37098().method_6209(0.9));
         if (this.method_17809() == null && (!this.method_17864() || !this.method_17868().method_12170(this.method_37245(), 20.0))) {
            this.method_37215(this.method_37098().method_6214(0.0, -0.005, 0.0));
         }
      } else {
         super.method_26431(var1);
      }
   }

   @Override
   public boolean method_26887(class_704 var1) {
      return false;
   }

   @Override
   public void method_37384(class_6331 var1, class_900 var2) {
      this.method_37181(class_6199.field_31674, Float.MAX_VALUE);
   }
}
