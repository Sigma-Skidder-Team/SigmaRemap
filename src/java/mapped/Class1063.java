package mapped;

import java.util.Random;
import java.util.UUID;

public class Class1063 extends Class1038 implements Class1011 {
   private static final UUID field5860 = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
   private static final Class9689 field5861 = new Class9689(field5860, "Attacking speed boost", 0.05, Class2045.field13352);
   private static final Class8369 field5862 = Class8763.method31620(0, 1);
   private int field5863;
   private static final Class8369 field5864 = Class8763.method31620(20, 39);
   private int field5865;
   private UUID field5866;
   private static final Class8369 field5867 = Class8763.method31620(4, 6);
   private int field5868;

   public Class1063(Class8992<? extends Class1063> var1, Class1655 var2) {
      super(var1, var2);
      this.method4224(Class2163.field14190, 8.0F);
   }

   @Override
   public void method4349(UUID var1) {
      this.field5866 = var1;
   }

   @Override
   public double method2894() {
      return !this.method3005() ? -0.45 : -0.05;
   }

   @Override
   public void method4639() {
      this.field5600.method20002(2, new Class2654(this, 1.0, false));
      this.field5600.method20002(7, new Class2737(this, 1.0));
      this.field5601.method20002(1, new Class2704(this).method10918());
      this.field5601.method20002(2, new Class2709<PlayerEntity>(this, PlayerEntity.class, 10, true, false, this::method4367));
      this.field5601.method20002(3, new Class2779<Class1063>(this, true));
   }

   public static Class7037 method4874() {
      return Class1038.method4653().method21849(Class9173.field42116, 0.0).method21849(Class9173.field42108, 0.23F).method21849(Class9173.field42110, 5.0);
   }

   @Override
   public boolean method4645() {
      return false;
   }

   @Override
   public void method4258() {
      Class9805 var3 = this.method3085(Class9173.field42108);
      if (!this.method4369()) {
         if (var3.method38665(field5861)) {
            var3.method38670(field5861);
         }
      } else {
         if (!this.method3005() && !var3.method38665(field5861)) {
            var3.method38667(field5861);
         }

         this.method4875();
      }

      this.method4366((Class1657)this.field5024, true);
      if (this.method4232() != null) {
         this.method4876();
      }

      if (this.method4369()) {
         this.field4971 = this.field5055;
      }

      super.method4258();
   }

   private void method4875() {
      if (this.field5863 > 0) {
         this.field5863--;
         if (this.field5863 == 0) {
            this.method4878();
         }
      }
   }

   private void method4876() {
      if (this.field5868 <= 0) {
         if (this.method4231().method35460(this.method4232())) {
            this.method4877();
         }

         this.field5868 = field5867.method29319(this.field5054);
      } else {
         this.field5868--;
      }
   }

   private void method4877() {
      double var3 = this.method3086(Class9173.field42106);
      Class6488 var5 = Class6488.method19657(this.method3431()).method19663(var3, 10.0, var3);
      this.field5024
         .<Class1063>method7183(Class1063.class, var5)
         .stream()
         .filter(var1 -> var1 != this)
         .filter(var0 -> var0.method4232() == null)
         .filter(var1 -> !var1.method3345(this.method4232()))
         .forEach(var1 -> var1.method4233(this.method4232()));
   }

   private void method4878() {
      this.method2863(Class6067.field27295, this.method3099() * 2.0F, this.method3100() * 1.8F);
   }

   @Override
   public void method4233(Class880 var1) {
      if (this.method4232() == null && var1 != null) {
         this.field5863 = field5862.method29319(this.field5054);
         this.field5868 = field5867.method29319(this.field5054);
      }

      if (var1 instanceof PlayerEntity) {
         this.method3016((PlayerEntity)var1);
      }

      super.method4233(var1);
   }

   @Override
   public void method4346() {
      this.method4347(field5864.method29319(this.field5054));
   }

   public static boolean method4879(Class8992<Class1063> var0, Class1660 var1, Class2202 var2, BlockPos var3, Random var4) {
      return var1.method6997() != Class2197.field14351 && var1.method6738(var3.method8313()).method23383() != Blocks.field36891;
   }

   @Override
   public boolean method4266(Class1662 var1) {
      return var1.method7050(this) && !var1.method7014(this.method3389());
   }

   @Override
   public void method2724(Class39 var1) {
      super.method2724(var1);
      this.method4364(var1);
   }

   @Override
   public void method2723(Class39 var1) {
      super.method2723(var1);
      this.method4365((Class1657)this.field5024, var1);
   }

   @Override
   public void method4347(int var1) {
      this.field5865 = var1;
   }

   @Override
   public int method4348() {
      return this.field5865;
   }

   @Override
   public boolean method2741(Class8654 var1, float var2) {
      return !this.method2760(var1) ? super.method2741(var1, var2) : false;
   }

   @Override
   public Class9455 method4241() {
      return !this.method4369() ? Class6067.field27294 : Class6067.field27295;
   }

   @Override
   public Class9455 method2879(Class8654 var1) {
      return Class6067.field27297;
   }

   @Override
   public Class9455 method2880() {
      return Class6067.field27296;
   }

   @Override
   public void method4270(Class9755 var1) {
      this.method2944(Class2106.field13731, new Class8848(Class8514.field37815));
   }

   @Override
   public Class8848 method4644() {
      return Class8848.field39973;
   }

   @Override
   public void method4663() {
      this.method3085(Class9173.field42116).method38661(0.0);
   }

   @Override
   public UUID method4350() {
      return this.field5866;
   }

   @Override
   public boolean method4344(PlayerEntity var1) {
      return this.method4367(var1);
   }
}
