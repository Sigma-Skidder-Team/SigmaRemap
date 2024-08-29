package mapped;

import java.util.Random;

public class Class2784 extends Class2595 {
   private static String[] field17400;
   private final Class1098 field17401;
   private PlayerEntity field17402;
   private BlockPos field17403;
   private int field17404;

   public Class2784(Class1098 var1) {
      this.field17401 = var1;
   }

   @Override
   public boolean method10803() {
      if (this.field17401.method4393()) {
         if (!this.field17401.method4402()) {
            Class880 var3 = this.field17401.method4400();
            if (var3 instanceof PlayerEntity) {
               this.field17402 = (PlayerEntity)var3;
               if (!var3.isSleeping()) {
                  return false;
               }

               if (this.field17401.getDistanceSq(this.field17402) > 100.0) {
                  return false;
               }

               BlockPos var4 = this.field17402.getPosition();
               BlockState var5 = this.field17401.world.getBlockState(var4);
               if (var5.getBlock().method11540(BlockTags.field32770)) {
                  this.field17403 = var5.<Direction>method23464(Class3250.field18484)
                     .<BlockPos>map(var1 -> var4.method8349(var1.method536()))
                     .orElseGet(() -> new BlockPos(var4));
                  return !this.method10974();
               }
            }

            return false;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private boolean method10974() {
      for (Class1098 var4 : this.field17401.world.<Class1098>method7182(Class1098.class, new AxisAlignedBB(this.field17403).method19664(2.0))) {
         if (var4 != this.field17401 && (var4.method5253() || var4.method5255())) {
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean method10806() {
      return this.field17401.method4393()
         && !this.field17401.method4402()
         && this.field17402 != null
         && this.field17402.isSleeping()
         && this.field17403 != null
         && !this.method10974();
   }

   @Override
   public void method10804() {
      if (this.field17403 != null) {
         this.field17401.method4396(false);
         this.field17401
            .method4230()
            .method21654((double)this.field17403.getX(), (double)this.field17403.getY(), (double)this.field17403.getZ(), 1.1F);
      }
   }

   @Override
   public void method10807() {
      this.field17401.method5252(false);
      float var3 = this.field17401.world.method7001(1.0F);
      if (this.field17402.method2910() >= 100 && (double)var3 > 0.77 && (double)var3 < 0.8 && (double)this.field17401.world.method6814().nextFloat() < 0.7) {
         this.method10975();
      }

      this.field17404 = 0;
      this.field17401.method5254(false);
      this.field17401.method4230().method21666();
   }

   private void method10975() {
      Random var3 = this.field17401.method3013();
      Mutable var4 = new Mutable();
      var4.method8374(this.field17401.getPosition());
      this.field17401
         .method3168(
            (double)(var4.getX() + var3.nextInt(11) - 5),
            (double)(var4.getY() + var3.nextInt(5) - 2),
            (double)(var4.getZ() + var3.nextInt(11) - 5),
            false
         );
      var4.method8374(this.field17401.getPosition());
      Class7318 var5 = this.field17401.world.getServer().method1411().method1058(Class8793.field39595);
      Class9464 var6 = new Class9464((ServerWorld)this.field17401.world)
         .method36454(Class9525.field44335, this.field17401.getPositionVec())
         .method36454(Class9525.field44330, this.field17401)
         .method36450(var3);

      for (ItemStack var8 : var5.method23182(var6.method36460(Class8524.field38287))) {
         this.field17401
            .world
            .method6916(
               new ItemEntity(
                  this.field17401.world,
                  (double)var4.getX() - (double) MathHelper.sin(this.field17401.field4965 * (float) (Math.PI / 180.0)),
                  (double)var4.getY(),
                  (double)var4.getZ() + (double) MathHelper.cos(this.field17401.field4965 * (float) (Math.PI / 180.0)),
                  var8
               )
            );
      }
   }

   @Override
   public void method10805() {
      if (this.field17402 != null && this.field17403 != null) {
         this.field17401.method4396(false);
         this.field17401
            .method4230()
            .method21654((double)this.field17403.getX(), (double)this.field17403.getY(), (double)this.field17403.getZ(), 1.1F);
         if (!(this.field17401.getDistanceSq(this.field17402) < 2.5)) {
            this.field17401.method5252(false);
         } else {
            this.field17404++;
            if (this.field17404 <= 16) {
               this.field17401.method4262(this.field17402, 45.0F, 45.0F);
               this.field17401.method5254(true);
            } else {
               this.field17401.method5252(true);
               this.field17401.method5254(false);
            }
         }
      }
   }
}
