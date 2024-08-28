package mapped;

import javax.annotation.Nullable;
import java.util.Random;
import java.util.function.Predicate;

public class Class1088 extends Class1018 {
   private static final Class9289<BlockPos> field5956 = Class9361.<BlockPos>method35441(Class1088.class, Class7784.field33401);
   private static final Class9289<Boolean> field5957 = Class9361.<Boolean>method35441(Class1088.class, Class7784.field33398);
   private static final Class9289<Boolean> field5958 = Class9361.<Boolean>method35441(Class1088.class, Class7784.field33398);
   private static final Class9289<BlockPos> field5959 = Class9361.<BlockPos>method35441(Class1088.class, Class7784.field33401);
   private static final Class9289<Boolean> field5960 = Class9361.<Boolean>method35441(Class1088.class, Class7784.field33398);
   private static final Class9289<Boolean> field5961 = Class9361.<Boolean>method35441(Class1088.class, Class7784.field33398);
   private int field5962;
   public static final Predicate<Class880> field5963 = var0 -> var0.method3005() && !var0.method3250();

   public Class1088(Class8992<? extends Class1088> var1, World var2) {
      super(var1, var2);
      this.method4224(Class2163.field14191, 0.0F);
      this.field5596 = new Class6838(this);
      this.field5051 = 1.0F;
   }

   public void method5041(BlockPos var1) {
      this.field5063.method35446(field5956, var1);
   }

   private BlockPos method5042() {
      return this.field5063.<BlockPos>method35445(field5956);
   }

   private void method5043(BlockPos var1) {
      this.field5063.method35446(field5959, var1);
   }

   private BlockPos method5044() {
      return this.field5063.<BlockPos>method35445(field5959);
   }

   public boolean method5045() {
      return this.field5063.<Boolean>method35445(field5957);
   }

   private void method5046(boolean var1) {
      this.field5063.method35446(field5957, var1);
   }

   public boolean method5047() {
      return this.field5063.<Boolean>method35445(field5958);
   }

   private void method5048(boolean var1) {
      this.field5962 = !var1 ? 0 : 1;
      this.field5063.method35446(field5958, var1);
   }

   private boolean method5049() {
      return this.field5063.<Boolean>method35445(field5960);
   }

   private void method5050(boolean var1) {
      this.field5063.method35446(field5960, var1);
   }

   private boolean method5051() {
      return this.field5063.<Boolean>method35445(field5961);
   }

   private void method5052(boolean var1) {
      this.field5063.method35446(field5961, var1);
   }

   @Override
   public void method2850() {
      super.method2850();
      this.field5063.method35442(field5956, BlockPos.field13032);
      this.field5063.method35442(field5957, false);
      this.field5063.method35442(field5959, BlockPos.field13032);
      this.field5063.method35442(field5960, false);
      this.field5063.method35442(field5961, false);
      this.field5063.method35442(field5958, false);
   }

   @Override
   public void method2724(Class39 var1) {
      super.method2724(var1);
      var1.method102("HomePosX", this.method5042().method8304());
      var1.method102("HomePosY", this.method5042().getY());
      var1.method102("HomePosZ", this.method5042().method8306());
      var1.method115("HasEgg", this.method5045());
      var1.method102("TravelPosX", this.method5044().method8304());
      var1.method102("TravelPosY", this.method5044().getY());
      var1.method102("TravelPosZ", this.method5044().method8306());
   }

   @Override
   public void method2723(Class39 var1) {
      int var4 = var1.method122("HomePosX");
      int var5 = var1.method122("HomePosY");
      int var6 = var1.method122("HomePosZ");
      this.method5041(new BlockPos(var4, var5, var6));
      super.method2723(var1);
      this.method5046(var1.method132("HasEgg"));
      int var7 = var1.method122("TravelPosX");
      int var8 = var1.method122("TravelPosY");
      int var9 = var1.method122("TravelPosZ");
      this.method5043(new BlockPos(var7, var8, var9));
   }

   @Nullable
   @Override
   public Class5093 method4276(Class1659 var1, Class9755 var2, Class2202 var3, Class5093 var4, Class39 var5) {
      this.method5041(this.method3432());
      this.method5043(BlockPos.field13032);
      return super.method4276(var1, var2, var3, var4, var5);
   }

   public static boolean method5053(Class8992<Class1088> var0, Class1660 var1, Class2202 var2, BlockPos var3, Random var4) {
      return var3.getY() < var1.method6776() + 4 && Class3441.method12114(var1, var3) && var1.method7021(var3, 0) > 8;
   }

   @Override
   public void method4219() {
      this.field5600.method20002(0, new Class2751(this, 1.2));
      this.field5600.method20002(1, new Class2787(this, 1.0));
      this.field5600.method20002(1, new Class2630(this, 1.0));
      this.field5600.method20002(2, new Class2731(this, 1.1, Blocks.SEAGRASS.method11581()));
      this.field5600.method20002(3, new Class2635(this, 1.0));
      this.field5600.method20002(4, new Class2760(this, 1.0));
      this.field5600.method20002(7, new Class2594(this, 1.0));
      this.field5600.method20002(8, new Class2612(this, PlayerEntity.class, 8.0F));
      this.field5600.method20002(9, new Class2743(this, 1.0, 100));
   }

   public static Class7037 method5054() {
      return Class1006.method4220().method21849(Class9173.field42105, 30.0).method21849(Class9173.field42108, 0.25);
   }

   @Override
   public boolean method2952() {
      return false;
   }

   @Override
   public boolean method2998() {
      return true;
   }

   @Override
   public Class7809 method3089() {
      return Class7809.field33509;
   }

   @Override
   public int method4236() {
      return 200;
   }

   @Nullable
   @Override
   public Class9455 method4241() {
      return !this.method3250() && this.field5036 && !this.method3005() ? Class6067.field27164 : super.method4241();
   }

   @Override
   public void method3242(float var1) {
      super.method3242(var1 * 1.5F);
   }

   @Override
   public Class9455 method2859() {
      return Class6067.field27175;
   }

   @Nullable
   @Override
   public Class9455 method2879(Class8654 var1) {
      return !this.method3005() ? Class6067.field27170 : Class6067.field27171;
   }

   @Nullable
   @Override
   public Class9455 method2880() {
      return !this.method3005() ? Class6067.field27165 : Class6067.field27166;
   }

   @Override
   public void method3241(BlockPos var1, Class7380 var2) {
      Class9455 var5 = !this.method3005() ? Class6067.field27173 : Class6067.field27174;
      this.method2863(var5, 0.15F, 1.0F);
   }

   @Override
   public boolean method4502() {
      return super.method4502() && !this.method5045();
   }

   @Override
   public float method3238() {
      return this.field5044 + 0.15F;
   }

   @Override
   public float method3006() {
      return !this.method3005() ? 1.0F : 0.3F;
   }

   @Override
   public Class6990 method4221(World var1) {
      return new Class6998(this, var1);
   }

   @Nullable
   @Override
   public Class1045 method4389(ServerWorld var1, Class1045 var2) {
      return Class8992.field41096.method33215(var1);
   }

   @Override
   public boolean method4381(ItemStack var1) {
      return var1.method32107() == Blocks.SEAGRASS.method11581();
   }

   @Override
   public float method4339(BlockPos var1, Class1662 var2) {
      if (!this.method5049() && var2.method6739(var1).method23486(Class8953.field40469)) {
         return 10.0F;
      } else {
         return !Class3441.method12114(var2, var1) ? var2.method7009(var1) - 0.5F : 10.0F;
      }
   }

   @Override
   public void method2871() {
      super.method2871();
      if (this.method3066() && this.method5047() && this.field5962 >= 1 && this.field5962 % 5 == 0) {
         BlockPos var3 = this.method3432();
         if (Class3441.method12114(this.field5024, var3)) {
            this.field5024.method6999(2001, var3, Block.method11535(Blocks.SAND.method11579()));
         }
      }
   }

   @Override
   public void method4679() {
      super.method4679();
      if (!this.method3005() && this.field5024.method6789().method17135(Class5462.field24227)) {
         this.method3301(Class8514.field37793, 1);
      }
   }

   @Override
   public void method2915(Vector3d var1) {
      if (this.method3138() && this.method3250()) {
         this.method3265(0.1F, var1);
         this.move(Class2107.field13742, this.method3433());
         this.method3434(this.method3433().method11344(0.9));
         if (this.method4232() == null && (!this.method5049() || !this.method5042().method8317(this.getPositionVec(), 20.0))) {
            this.method3434(this.method3433().method11339(0.0, -0.005, 0.0));
         }
      } else {
         super.method2915(var1);
      }
   }

   @Override
   public boolean method4295(PlayerEntity var1) {
      return false;
   }

   @Override
   public void method3353(ServerWorld var1, Class906 var2) {
      this.method2741(Class8654.field38993, Float.MAX_VALUE);
   }

   // $VF: synthetic method
   public static BlockPos method5056(Class1088 var0) {
      return var0.method5042();
   }

   // $VF: synthetic method
   public static void method5057(Class1088 var0, boolean var1) {
      var0.method5050(var1);
   }

   // $VF: synthetic method
   public static boolean method5058(Class1088 var0) {
      return var0.method5049();
   }

   // $VF: synthetic method
   public static int method5059(Class1088 var0) {
      return var0.field5962;
   }

   // $VF: synthetic method
   public static void method5060(Class1088 var0, boolean var1) {
      var0.method5048(var1);
   }

   // $VF: synthetic method
   public static Random method5061(Class1088 var0) {
      return var0.field5054;
   }

   // $VF: synthetic method
   public static void method5062(Class1088 var0, boolean var1) {
      var0.method5046(var1);
   }

   // $VF: synthetic method
   public static int method5063(Class1088 var0) {
      return var0.field5962++;
   }

   // $VF: synthetic method
   public static boolean method5064(Class1088 var0) {
      return var0.method5051();
   }

   // $VF: synthetic method
   public static Random method5065(Class1088 var0) {
      return var0.field5054;
   }

   // $VF: synthetic method
   public static void method5066(Class1088 var0, BlockPos var1) {
      var0.method5043(var1);
   }

   // $VF: synthetic method
   public static void method5067(Class1088 var0, boolean var1) {
      var0.method5052(var1);
   }

   // $VF: synthetic method
   public static BlockPos method5068(Class1088 var0) {
      return var0.method5044();
   }
}
