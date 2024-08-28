package mapped;

import javax.annotation.Nullable;
import java.util.Random;
import java.util.UUID;

public class Class1017 extends Class1018 implements Class1011, Class1016 {
   private static final Class9289<Byte> field5684 = Class9361.<Byte>method35441(Class1017.class, Class7784.field33390);
   private static final Class9289<Integer> field5685 = Class9361.<Integer>method35441(Class1017.class, Class7784.field33391);
   private static final Class8369 field5686 = Class8763.method31620(20, 39);
   private UUID field5687;
   private float field5688;
   private float field5689;
   private int field5690;
   private int field5691;
   private int field5692;
   private int field5693;
   private int field5694 = 0;
   private int field5695 = 0;
   private BlockPos field5696 = null;
   private BlockPos field5697 = null;
   private Class2663 field5698;
   private Class2664 field5699;
   private Class2665 field5700;
   private int field5701;

   public Class1017(Class8992<? extends Class1017> var1, World var2) {
      super(var1, var2);
      this.field5596 = new Class6832(this, 20, true);
      this.field5595 = new Class8094(this, this);
      this.method4224(Class2163.field14195, -1.0F);
      this.method4224(Class2163.field14191, -1.0F);
      this.method4224(Class2163.field14192, 16.0F);
      this.method4224(Class2163.field14207, -1.0F);
      this.method4224(Class2163.field14189, -1.0F);
   }

   @Override
   public void method2850() {
      super.method2850();
      this.field5063.method35442(field5684, (byte)0);
      this.field5063.method35442(field5685, 0);
   }

   @Override
   public float method4339(BlockPos var1, Class1662 var2) {
      return !var2.method6738(var1).method23393() ? 0.0F : 10.0F;
   }

   @Override
   public void method4219() {
      this.field5600.method20002(0, new Class2651(this, this, 1.4F, true));
      this.field5600.method20002(1, new Class2666(this, null));
      this.field5600.method20002(2, new Class2785(this, 1.0));
      this.field5600.method20002(3, new Class2680(this, 1.25, Class120.method342(Class5985.field26107), false));
      this.field5698 = new Class2663(this);
      this.field5600.method20002(4, this.field5698);
      this.field5600.method20002(5, new Class2764(this, 1.25));
      this.field5600.method20002(5, new Class2667(this, null));
      this.field5699 = new Class2664(this);
      this.field5600.method20002(5, this.field5699);
      this.field5700 = new Class2665(this);
      this.field5600.method20002(6, this.field5700);
      this.field5600.method20002(7, new Class2662(this, null));
      this.field5600.method20002(8, new Class2687(this));
      this.field5600.method20002(9, new Class2603(this));
      this.field5601.method20002(1, new Class2708(this, this).method10918(new Class[0]));
      this.field5601.method20002(2, new Class2715(this));
      this.field5601.method20002(3, new Class2779<Class1017>(this, true));
   }

   @Override
   public void method2724(Class39 var1) {
      super.method2724(var1);
      if (this.method4432()) {
         var1.method99("HivePos", Class8354.method29284(this.method4433()));
      }

      if (this.method4422()) {
         var1.method99("FlowerPos", Class8354.method29284(this.method4421()));
      }

      var1.method115("HasNectar", this.method4438());
      var1.method115("HasStung", this.method4440());
      var1.method102("TicksSincePollination", this.field5691);
      var1.method102("CannotEnterHiveTicks", this.field5692);
      var1.method102("CropsGrownSincePollination", this.field5693);
      this.method4364(var1);
   }

   @Override
   public void method2723(Class39 var1) {
      this.field5697 = null;
      if (var1.method118("HivePos")) {
         this.field5697 = Class8354.method29283(var1.method130("HivePos"));
      }

      this.field5696 = null;
      if (var1.method118("FlowerPos")) {
         this.field5696 = Class8354.method29283(var1.method130("FlowerPos"));
      }

      super.method2723(var1);
      this.method4439(var1.method132("HasNectar"));
      this.method4441(var1.method132("HasStung"));
      this.field5691 = var1.method122("TicksSincePollination");
      this.field5692 = var1.method122("CannotEnterHiveTicks");
      this.field5693 = var1.method122("CropsGrownSincePollination");
      this.method4365((ServerWorld)this.field5024, var1);
   }

   @Override
   public boolean method3114(Entity var1) {
      boolean var4 = var1.method2741(Class8654.method31114(this), (float)((int)this.method3086(Class9173.field42110)));
      if (var4) {
         this.method3399(this, var1);
         if (var1 instanceof Class880) {
            ((Class880)var1).method3079(((Class880)var1).method3078() + 1);
            byte var5 = 0;
            if (this.field5024.method6997() != Class2197.field14353) {
               if (this.field5024.method6997() == Class2197.field14354) {
                  var5 = 18;
               }
            } else {
               var5 = 10;
            }

            if (var5 > 0) {
               ((Class880)var1).method3035(new Class2023(Class8254.field35485, var5 * 20, 0));
            }
         }

         this.method4441(true);
         this.method4372();
         this.method2863(Class6067.field26393, 1.0F, 1.0F);
      }

      return var4;
   }

   @Override
   public void tick() {
      super.tick();
      if (this.method4438() && this.method4434() < 10 && this.field5054.nextFloat() < 0.05F) {
         for (int var3 = 0; var3 < this.field5054.nextInt(2) + 1; var3++) {
            this.method4419(
               this.field5024,
               this.getPosX() - 0.3F,
               this.getPosX() + 0.3F,
               this.getPosZ() - 0.3F,
               this.getPosZ() + 0.3F,
               this.method3440(0.5),
               Class7940.field34111
            );
         }
      }

      this.method4428();
   }

   private void method4419(World var1, double var2, double var4, double var6, double var8, double var10, Class7436 var12) {
      var1.method6746(
         var12,
         MathHelper.method37822(var1.field9016.nextDouble(), var2, var4),
         var10,
         MathHelper.method37822(var1.field9016.nextDouble(), var6, var8),
         0.0,
         0.0,
         0.0
      );
   }

   private void method4420(BlockPos var1) {
      Vector3d var4 = Vector3d.method11330(var1);
      byte var5 = 0;
      BlockPos var6 = this.method3432();
      int var7 = (int)var4.field18049 - var6.getY();
      if (var7 <= 2) {
         if (var7 < -2) {
            var5 = -4;
         }
      } else {
         var5 = 4;
      }

      int var8 = 6;
      int var9 = 8;
      int var10 = var6.method8321(var1);
      if (var10 < 15) {
         var8 = var10 / 2;
         var9 = var10 / 2;
      }

      Vector3d var11 = Class8037.method27589(this, var8, var9, var5, var4, (float) (Math.PI / 10));
      if (var11 != null) {
         this.field5599.method21642(0.5F);
         this.field5599.method21654(var11.field18048, var11.field18049, var11.field18050, 1.0);
      }
   }

   @Nullable
   public BlockPos method4421() {
      return this.field5696;
   }

   public boolean method4422() {
      return this.field5696 != null;
   }

   public void method4423(BlockPos var1) {
      this.field5696 = var1;
   }

   private boolean method4424() {
      return this.field5691 > 3600;
   }

   private boolean method4425() {
      if (this.field5692 <= 0 && !Class2663.method10870(this.field5698) && !this.method4440() && this.method4232() == null) {
         boolean var3 = this.method4424() || this.field5024.method6795() || this.field5024.method6741() || this.method4438();
         return var3 && !this.method4430();
      } else {
         return false;
      }
   }

   public void method4426(int var1) {
      this.field5692 = var1;
   }

   public float method4427(float var1) {
      return MathHelper.method37821(var1, this.field5689, this.field5688);
   }

   private void method4428() {
      this.field5689 = this.field5688;
      if (!this.method4442()) {
         this.field5688 = Math.max(0.0F, this.field5688 - 0.24F);
      } else {
         this.field5688 = Math.min(1.0F, this.field5688 + 0.2F);
      }
   }

   @Override
   public void method4258() {
      boolean var3 = this.method4440();
      if (!this.method3255()) {
         this.field5701 = 0;
      } else {
         this.field5701++;
      }

      if (this.field5701 > 20) {
         this.method2741(Class8654.field38999, 1.0F);
      }

      if (var3) {
         this.field5690++;
         if (this.field5690 % 5 == 0 && this.field5054.nextInt(MathHelper.method37775(1200 - this.field5690, 1, 1200)) == 0) {
            this.method2741(Class8654.field39005, this.method3042());
         }
      }

      if (!this.method4438()) {
         this.field5691++;
      }

      if (!this.field5024.field9020) {
         this.method4366((ServerWorld)this.field5024, false);
      }
   }

   public void method4429() {
      this.field5691 = 0;
   }

   private boolean method4430() {
      if (this.field5697 == null) {
         return false;
      } else {
         Class944 var3 = this.field5024.method6759(this.field5697);
         return var3 instanceof Class962 && ((Class962)var3).method3912();
      }
   }

   @Override
   public int method4348() {
      return this.field5063.<Integer>method35445(field5685);
   }

   @Override
   public void method4347(int var1) {
      this.field5063.method35446(field5685, var1);
   }

   @Override
   public UUID method4350() {
      return this.field5687;
   }

   @Override
   public void method4349(UUID var1) {
      this.field5687 = var1;
   }

   @Override
   public void method4346() {
      this.method4347(field5686.method29319(this.field5054));
   }

   private boolean method4431(BlockPos var1) {
      Class944 var4 = this.field5024.method6759(var1);
      return !(var4 instanceof Class962) ? false : !((Class962)var4).method3914();
   }

   public boolean method4432() {
      return this.field5697 != null;
   }

   @Nullable
   public BlockPos method4433() {
      return this.field5697;
   }

   @Override
   public void method4257() {
      super.method4257();
      Class7393.method23623(this);
   }

   private int method4434() {
      return this.field5693;
   }

   private void method4435() {
      this.field5693 = 0;
   }

   private void method4436() {
      this.field5693++;
   }

   @Override
   public void method2871() {
      super.method2871();
      if (!this.field5024.field9020) {
         if (this.field5692 > 0) {
            this.field5692--;
         }

         if (this.field5694 > 0) {
            this.field5694--;
         }

         if (this.field5695 > 0) {
            this.field5695--;
         }

         boolean var3 = this.method4369() && !this.method4440() && this.method4232() != null && this.method4232().getDistanceSq(this) < 4.0;
         this.method4443(var3);
         if (this.field5055 % 20 == 0 && !this.method4437()) {
            this.field5697 = null;
         }
      }
   }

   private boolean method4437() {
      if (!this.method4432()) {
         return false;
      } else {
         Class944 var3 = this.field5024.method6759(this.field5697);
         return var3 != null && var3.method3786() == Class4387.field21453;
      }
   }

   public boolean method4438() {
      return this.method4446(8);
   }

   private void method4439(boolean var1) {
      if (var1) {
         this.method4429();
      }

      this.method4445(8, var1);
   }

   public boolean method4440() {
      return this.method4446(4);
   }

   private void method4441(boolean var1) {
      this.method4445(4, var1);
   }

   private boolean method4442() {
      return this.method4446(2);
   }

   private void method4443(boolean var1) {
      this.method4445(2, var1);
   }

   private boolean method4444(BlockPos var1) {
      return !this.method4450(var1, 32);
   }

   private void method4445(int var1, boolean var2) {
      if (!var2) {
         this.field5063.method35446(field5684, (byte)(this.field5063.<Byte>method35445(field5684) & ~var1));
      } else {
         this.field5063.method35446(field5684, (byte)(this.field5063.<Byte>method35445(field5684) | var1));
      }
   }

   private boolean method4446(int var1) {
      return (this.field5063.<Byte>method35445(field5684) & var1) != 0;
   }

   public static Class7037 method4447() {
      return Class1006.method4220()
         .method21849(Class9173.field42105, 10.0)
         .method21849(Class9173.field42109, 0.6F)
         .method21849(Class9173.field42108, 0.3F)
         .method21849(Class9173.field42110, 2.0)
         .method21849(Class9173.field42106, 48.0);
   }

   @Override
   public Class6990 method4221(World var1) {
      Class6996 var4 = new Class6996(this, this, var1);
      var4.method21685(false);
      var4.method21674(false);
      var4.method21686(true);
      return var4;
   }

   @Override
   public boolean method4381(ItemStack var1) {
      return var1.method32107().method11743(Class5985.field26107);
   }

   private boolean method4448(BlockPos var1) {
      return this.field5024.method6763(var1) && this.field5024.method6738(var1).method23383().method11540(Class7645.field32773);
   }

   @Override
   public void method3241(BlockPos var1, Class7380 var2) {
   }

   @Override
   public Class9455 method4241() {
      return null;
   }

   @Override
   public Class9455 method2879(Class8654 var1) {
      return Class6067.field26390;
   }

   @Override
   public Class9455 method2880() {
      return Class6067.field26389;
   }

   @Override
   public float method3099() {
      return 0.4F;
   }

   public Class1017 method4389(ServerWorld var1, Class1045 var2) {
      return Class8992.field41009.method33215(var1);
   }

   @Override
   public float method2957(Class2090 var1, Class8847 var2) {
      return !this.method3005() ? var2.field39969 * 0.5F : var2.field39969 * 0.5F;
   }

   @Override
   public boolean method2921(float var1, float var2) {
      return false;
   }

   @Override
   public void method2761(double var1, boolean var3, Class7380 var4, BlockPos var5) {
   }

   @Override
   public boolean method3244() {
      return true;
   }

   public void method4449() {
      this.method4439(false);
      this.method4435();
   }

   @Override
   public boolean method2741(Class8654 var1, float var2) {
      if (!this.method2760(var1)) {
         Entity var5 = var1.method31109();
         if (!this.field5024.field9020) {
            Class2663.method10871(this.field5698);
         }

         return super.method2741(var1, var2);
      } else {
         return false;
      }
   }

   @Override
   public Class7809 method3089() {
      return Class7809.field33507;
   }

   @Override
   public void method3105(Class7608<Class7631> var1) {
      this.method3434(this.method3433().method11339(0.0, 0.01, 0.0));
   }

   @Override
   public Vector3d method3394() {
      return new Vector3d(0.0, (double)(0.5F * this.method3393()), (double)(this.method3429() * 0.2F));
   }

   private boolean method4450(BlockPos var1, int var2) {
      return var1.method8316(this.method3432(), (double)var2);
   }

   // $VF: synthetic method
   public static Class2663 method4451(Class1017 var0) {
      return var0.field5698;
   }

   // $VF: synthetic method
   public static boolean method4452(Class1017 var0) {
      return var0.method4425();
   }

   // $VF: synthetic method
   public static BlockPos method4453(Class1017 var0) {
      return var0.field5697;
   }

   // $VF: synthetic method
   public static BlockPos method4454(Class1017 var0, BlockPos var1) {
      return var0.field5697 = var1;
   }

   // $VF: synthetic method
   public static Class6990 method4455(Class1017 var0) {
      return var0.field5599;
   }

   // $VF: synthetic method
   public static Class6990 method4456(Class1017 var0) {
      return var0.field5599;
   }

   // $VF: synthetic method
   public static Class6990 method4457(Class1017 var0) {
      return var0.field5599;
   }

   // $VF: synthetic method
   public static boolean method4458(Class1017 var0, BlockPos var1, int var2) {
      return var0.method4450(var1, var2);
   }

   // $VF: synthetic method
   public static boolean method4459(Class1017 var0, BlockPos var1) {
      return var0.method4444(var1);
   }

   // $VF: synthetic method
   public static void method4460(Class1017 var0, BlockPos var1) {
      var0.method4420(var1);
   }

   // $VF: synthetic method
   public static Class6990 method4461(Class1017 var0) {
      return var0.field5599;
   }

   // $VF: synthetic method
   public static Class6990 method4462(Class1017 var0) {
      return var0.field5599;
   }

   // $VF: synthetic method
   public static Class6990 method4463(Class1017 var0) {
      return var0.field5599;
   }

   // $VF: synthetic method
   public static Class6990 method4464(Class1017 var0) {
      return var0.field5599;
   }

   // $VF: synthetic method
   public static Class6990 method4465(Class1017 var0) {
      return var0.field5599;
   }

   // $VF: synthetic method
   public static Class6990 method4466(Class1017 var0) {
      return var0.field5599;
   }

   // $VF: synthetic method
   public static int method4467(Class1017 var0, int var1) {
      return var0.field5694 = var1;
   }

   // $VF: synthetic method
   public static Class6990 method4468(Class1017 var0) {
      return var0.field5599;
   }

   // $VF: synthetic method
   public static BlockPos method4469(Class1017 var0) {
      return var0.field5696;
   }

   // $VF: synthetic method
   public static boolean method4470(Class1017 var0, BlockPos var1) {
      return var0.method4448(var1);
   }

   // $VF: synthetic method
   public static Class6990 method4471(Class1017 var0) {
      return var0.field5599;
   }

   // $VF: synthetic method
   public static Class6990 method4472(Class1017 var0) {
      return var0.field5599;
   }

   // $VF: synthetic method
   public static BlockPos method4473(Class1017 var0, BlockPos var1) {
      return var0.field5696 = var1;
   }

   // $VF: synthetic method
   public static Class6990 method4474(Class1017 var0) {
      return var0.field5599;
   }

   // $VF: synthetic method
   public static int method4475(Class1017 var0) {
      return var0.field5691;
   }

   // $VF: synthetic method
   public static int method4476(Class1017 var0) {
      return var0.method4434();
   }

   // $VF: synthetic method
   public static Random method4477(Class1017 var0) {
      return var0.field5054;
   }

   // $VF: synthetic method
   public static boolean method4478(Class1017 var0) {
      return var0.method4437();
   }

   // $VF: synthetic method
   public static Random method4479(Class1017 var0) {
      return var0.field5054;
   }

   // $VF: synthetic method
   public static void method4480(Class1017 var0) {
      var0.method4436();
   }

   // $VF: synthetic method
   public static int method4481(Class1017 var0) {
      return var0.field5695;
   }

   // $VF: synthetic method
   public static Random method4482(Class1017 var0) {
      return var0.field5054;
   }

   // $VF: synthetic method
   public static Class6990 method4483(Class1017 var0) {
      return var0.field5599;
   }

   // $VF: synthetic method
   public static Random method4484(Class1017 var0) {
      return var0.field5054;
   }

   // $VF: synthetic method
   public static void method4485(Class1017 var0, boolean var1) {
      var0.method4439(var1);
   }

   // $VF: synthetic method
   public static Class6990 method4486(Class1017 var0) {
      return var0.field5599;
   }

   // $VF: synthetic method
   public static int method4487(Class1017 var0, int var1) {
      return var0.field5695 = var1;
   }

   // $VF: synthetic method
   public static Random method4488(Class1017 var0) {
      return var0.field5054;
   }

   // $VF: synthetic method
   public static Class6990 method4489(Class1017 var0) {
      return var0.field5599;
   }

   // $VF: synthetic method
   public static Random method4490(Class1017 var0) {
      return var0.field5054;
   }

   // $VF: synthetic method
   public static Random method4491(Class1017 var0) {
      return var0.field5054;
   }

   // $VF: synthetic method
   public static int method4492(Class1017 var0) {
      return var0.field5694;
   }

   // $VF: synthetic method
   public static Class2664 method4493(Class1017 var0) {
      return var0.field5699;
   }

   // $VF: synthetic method
   public static boolean method4494(Class1017 var0, BlockPos var1) {
      return var0.method4431(var1);
   }

   // $VF: synthetic method
   public static Class6990 method4495(Class1017 var0) {
      return var0.field5599;
   }

   // $VF: synthetic method
   public static Random method4496(Class1017 var0) {
      return var0.field5054;
   }

   // $VF: synthetic method
   public static Class6990 method4497(Class1017 var0) {
      return var0.field5599;
   }

   // $VF: synthetic method
   public static Class6990 method4498(Class1017 var0) {
      return var0.field5599;
   }

   // $VF: synthetic method
   public static Class6990 method4499(Class1017 var0) {
      return var0.field5599;
   }
}