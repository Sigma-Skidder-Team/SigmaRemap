package mapped;

import javax.annotation.Nullable;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class Class1010 extends Class1009 implements Class1011 {
   private static final UUID field5645 = UUID.fromString("020E0DFB-87AE-4653-9556-831010E291A0");
   private static final Class9689 field5646 = new Class9689(field5645, "Attacking speed boost", 0.15F, Class2045.field13352);
   private static final Class9289<Optional<Class7380>> field5647 = Class9361.<Optional<Class7380>>method35441(Class1010.class, Class7784.field33397);
   private static final Class9289<Boolean> field5648 = Class9361.<Boolean>method35441(Class1010.class, Class7784.field33398);
   private static final Class9289<Boolean> field5649 = Class9361.<Boolean>method35441(Class1010.class, Class7784.field33398);
   private static final Predicate<Class880> field5650 = var0 -> var0 instanceof Class1104 && ((Class1104)var0).method5297();
   private int field5651 = Integer.MIN_VALUE;
   private int field5652;
   private static final Class8369 field5653 = Class8763.method31620(20, 39);
   private int field5654;
   private UUID field5655;

   public Class1010(Class8992<? extends Class1010> var1, World var2) {
      super(var1, var2);
      this.field5051 = 1.0F;
      this.method4224(Class2163.field14191, -1.0F);
   }

   @Override
   public void method4219() {
      this.field5600.method20002(0, new Class2603(this));
      this.field5600.method20002(1, new Class2624(this));
      this.field5600.method20002(2, new Class2647(this, 1.0, false));
      this.field5600.method20002(7, new Class2737(this, 1.0, 0.0F));
      this.field5600.method20002(8, new Class2612(this, PlayerEntity.class, 8.0F));
      this.field5600.method20002(8, new Class2668(this));
      this.field5600.method20002(10, new Class2685(this));
      this.field5600.method20002(11, new Class2734(this));
      this.field5601.method20002(1, new Class2710(this, this::method4367));
      this.field5601.method20002(2, new Class2704(this));
      this.field5601.method20002(3, new Class2709<Class1104>(this, Class1104.class, 10, true, false, field5650));
      this.field5601.method20002(4, new Class2779<Class1010>(this, false));
   }

   public static Class7037 method4345() {
      return Class1009.method4343()
         .method21849(Class9173.field42105, 40.0)
         .method21849(Class9173.field42108, 0.3F)
         .method21849(Class9173.field42110, 7.0)
         .method21849(Class9173.field42106, 64.0);
   }

   @Override
   public void method4233(Class880 var1) {
      super.method4233(var1);
      Class9805 var4 = this.method3085(Class9173.field42108);
      if (var1 != null) {
         this.field5652 = this.field5055;
         this.field5063.method35446(field5648, true);
         if (!var4.method38665(field5646)) {
            var4.method38667(field5646);
         }
      } else {
         this.field5652 = 0;
         this.field5063.method35446(field5648, false);
         this.field5063.method35446(field5649, false);
         var4.method38670(field5646);
      }
   }

   @Override
   public void method2850() {
      super.method2850();
      this.field5063.method35442(field5647, Optional.<Class7380>empty());
      this.field5063.method35442(field5648, false);
      this.field5063.method35442(field5649, false);
   }

   @Override
   public void method4346() {
      this.method4347(field5653.method29319(this.field5054));
   }

   @Override
   public void method4347(int var1) {
      this.field5654 = var1;
   }

   @Override
   public int method4348() {
      return this.field5654;
   }

   @Override
   public void method4349(UUID var1) {
      this.field5655 = var1;
   }

   @Override
   public UUID method4350() {
      return this.field5655;
   }

   public void method4351() {
      if (this.field5055 >= this.field5651 + 400) {
         this.field5651 = this.field5055;
         if (!this.method3245()) {
            this.field5024.method6745(this.getPosX(), this.method3442(), this.getPosZ(), Class6067.field26549, this.method2864(), 2.5F, 1.0F, false);
         }
      }
   }

   @Override
   public void method3155(Class9289<?> var1) {
      if (field5648.equals(var1) && this.method4359() && this.field5024.field9020) {
         this.method4351();
      }

      super.method3155(var1);
   }

   @Override
   public void method2724(Class39 var1) {
      super.method2724(var1);
      Class7380 var4 = this.method4357();
      if (var4 != null) {
         var1.method99("carriedBlockState", Class8354.method29287(var4));
      }

      this.method4364(var1);
   }

   @Override
   public void method2723(Class39 var1) {
      super.method2723(var1);
      Class7380 var4 = null;
      if (var1.method119("carriedBlockState", 10)) {
         var4 = Class8354.method29285(var1.method130("carriedBlockState"));
         if (var4.method23393()) {
            var4 = null;
         }
      }

      this.method4356(var4);
      this.method4365((ServerWorld)this.field5024, var1);
   }

   private boolean method4352(PlayerEntity var1) {
      ItemStack var4 = var1.field4902.field5440.get(3);
      if (var4.method32107() != Blocks.field36589.method11581()) {
         Vector3d var5 = var1.method3281(1.0F).method11333();
         Vector3d var6 = new Vector3d(this.getPosX() - var1.getPosX(), this.method3442() - var1.method3442(), this.getPosZ() - var1.getPosZ());
         double var7 = var6.method11348();
         var6 = var6.method11333();
         double var9 = var5.method11334(var6);
         return !(var9 > 1.0 - 0.025 / var7) ? false : var1.method3135(this);
      } else {
         return false;
      }
   }

   @Override
   public float method2957(Class2090 var1, Class8847 var2) {
      return 2.55F;
   }

   @Override
   public void method2871() {
      if (this.field5024.field9020) {
         for (int var3 = 0; var3 < 2; var3++) {
            this.field5024
               .method6746(
                  Class7940.field34090,
                  this.method3438(0.5),
                  this.method3441() - 0.25,
                  this.method3445(0.5),
                  (this.field5054.nextDouble() - 0.5) * 2.0,
                  -this.field5054.nextDouble(),
                  (this.field5054.nextDouble() - 0.5) * 2.0
               );
         }
      }

      this.field4981 = false;
      if (!this.field5024.field9020) {
         this.method4366((ServerWorld)this.field5024, true);
      }

      super.method2871();
   }

   @Override
   public boolean method3124() {
      return true;
   }

   @Override
   public void method4258() {
      if (this.field5024.method6740() && this.field5055 >= this.field5652 + 600) {
         float var3 = this.method3267();
         if (var3 > 0.5F && this.field5024.method7022(this.method3432()) && this.field5054.nextFloat() * 30.0F < (var3 - 0.4F) * 2.0F) {
            this.method4233((Class880)null);
            this.method4353();
         }
      }

      super.method4258();
   }

   public boolean method4353() {
      if (!this.field5024.method6714() && this.method3066()) {
         double var3 = this.getPosX() + (this.field5054.nextDouble() - 0.5) * 64.0;
         double var5 = this.getPosY() + (double)(this.field5054.nextInt(64) - 32);
         double var7 = this.getPosZ() + (this.field5054.nextDouble() - 0.5) * 64.0;
         return this.method4355(var3, var5, var7);
      } else {
         return false;
      }
   }

   private boolean method4354(Entity var1) {
      Vector3d var4 = new Vector3d(this.getPosX() - var1.getPosX(), this.method3440(0.5) - var1.method3442(), this.getPosZ() - var1.getPosZ());
      var4 = var4.method11333();
      double var5 = 16.0;
      double var7 = this.getPosX() + (this.field5054.nextDouble() - 0.5) * 8.0 - var4.field18048 * 16.0;
      double var9 = this.getPosY() + (double)(this.field5054.nextInt(16) - 8) - var4.field18049 * 16.0;
      double var11 = this.getPosZ() + (this.field5054.nextDouble() - 0.5) * 8.0 - var4.field18050 * 16.0;
      return this.method4355(var7, var9, var11);
   }

   private boolean method4355(double var1, double var3, double var5) {
      Mutable var9 = new Mutable(var1, var3, var5);

      while (var9.getY() > 0 && !this.field5024.method6738(var9).method23384().method31087()) {
         var9.method8379(Direction.field672);
      }

      Class7380 var10 = this.field5024.method6738(var9);
      boolean var11 = var10.method23384().method31087();
      boolean var12 = var10.method23449().method23486(Class8953.field40469);
      if (var11 && !var12) {
         boolean var13 = this.method3168(var1, var3, var5, true);
         if (var13 && !this.method3245()) {
            this.field5024.method6743((PlayerEntity)null, this.field5025, this.field5026, this.field5027, Class6067.field26550, this.method2864(), 1.0F, 1.0F);
            this.method2863(Class6067.field26550, 1.0F, 1.0F);
         }

         return var13;
      } else {
         return false;
      }
   }

   @Override
   public Class9455 method4241() {
      return !this.method4358() ? Class6067.field26545 : Class6067.field26548;
   }

   @Override
   public Class9455 method2879(Class8654 var1) {
      return Class6067.field26547;
   }

   @Override
   public Class9455 method2880() {
      return Class6067.field26546;
   }

   @Override
   public void method3054(Class8654 var1, int var2, boolean var3) {
      super.method3054(var1, var2, var3);
      Class7380 var6 = this.method4357();
      if (var6 != null) {
         this.method3300(var6.method23383());
      }
   }

   public void method4356(Class7380 var1) {
      this.field5063.method35446(field5647, Optional.<Class7380>ofNullable(var1));
   }

   @Nullable
   public Class7380 method4357() {
      return this.field5063.<Optional<Class7380>>method35445(field5647).orElse((Class7380)null);
   }

   @Override
   public boolean method2741(Class8654 var1, float var2) {
      if (this.method2760(var1)) {
         return false;
      } else if (!(var1 instanceof Class8653)) {
         boolean var6 = super.method2741(var1, var2);
         if (!this.field5024.method6714() && !(var1.method31109() instanceof Class880) && this.field5054.nextInt(10) != 0) {
            this.method4353();
         }

         return var6;
      } else {
         for (int var5 = 0; var5 < 64; var5++) {
            if (this.method4353()) {
               return true;
            }
         }

         return false;
      }
   }

   public boolean method4358() {
      return this.field5063.<Boolean>method35445(field5648);
   }

   public boolean method4359() {
      return this.field5063.<Boolean>method35445(field5649);
   }

   public void method4360() {
      this.field5063.method35446(field5649, true);
   }

   @Override
   public boolean method4255() {
      return super.method4255() || this.method4357() != null;
   }

   // $VF: synthetic method
   public static boolean method4362(Class1010 var0, PlayerEntity var1) {
      return var0.method4352(var1);
   }

   // $VF: synthetic method
   public static boolean method4363(Class1010 var0, Entity var1) {
      return var0.method4354(var1);
   }
}