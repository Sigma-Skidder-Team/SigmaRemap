package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;

import javax.annotation.Nullable;
import java.util.function.Predicate;

public class Class1029 extends Class1026 {
   private static final Predicate<Entity> field5727 = var0 -> var0.isAlive() && !(var0 instanceof Class1029);
   private int field5728;
   private int field5729;
   private int field5730;

   public Class1029(EntityType<? extends Class1029> var1, World var2) {
      super(var1, var2);
      this.stepHeight = 1.0F;
      this.field5594 = 20;
   }

   @Override
   public void method4219() {
      super.method4219();
      this.field5600.method20002(0, new Class2603(this));
      this.field5600.method20002(4, new Class2653(this));
      this.field5600.method20002(5, new Class2737(this, 0.4));
      this.field5600.method20002(6, new Class2612(this, PlayerEntity.class, 6.0F));
      this.field5600.method20002(10, new Class2612(this, Class1006.class, 8.0F));
      this.field5601.method20002(2, new Class2704(this, Class1026.class).method10918());
      this.field5601.method20002(3, new Class2709<PlayerEntity>(this, PlayerEntity.class, true));
      this.field5601.method20002(4, new Class2709<Class1043>(this, Class1043.class, true));
      this.field5601.method20002(4, new Class2709<Class1058>(this, Class1058.class, true));
   }

   @Override
   public void method4240() {
      boolean var3 = !(this.method3407() instanceof Class1006) || this.method3407().getType().method33228(Class8613.field38735);
      boolean var4 = !(this.getRidingEntity() instanceof BoatEntity);
      this.field5600.method20010(Class2240.field14657, var3);
      this.field5600.method20010(Class2240.field14659, var3 && var4);
      this.field5600.method20010(Class2240.field14658, var3);
      this.field5600.method20010(Class2240.field14660, var3);
   }

   public static Class7037 method4581() {
      return Class1009.method4343()
         .method21849(Attributes.field42105, 100.0)
         .method21849(Attributes.MOVEMENT_SPEED, 0.3)
         .method21849(Attributes.field42107, 0.75)
         .method21849(Attributes.field42110, 12.0)
         .method21849(Attributes.field42111, 1.5)
         .method21849(Attributes.field42106, 32.0);
   }

   @Override
   public void method2724(CompoundNBT var1) {
      super.method2724(var1);
      var1.method102("AttackTick", this.field5728);
      var1.method102("StunTick", this.field5729);
      var1.method102("RoarTick", this.field5730);
   }

   @Override
   public void method2723(CompoundNBT var1) {
      super.method2723(var1);
      this.field5728 = var1.method122("AttackTick");
      this.field5729 = var1.method122("StunTick");
      this.field5730 = var1.method122("RoarTick");
   }

   @Override
   public SoundEvent method4546() {
      return Sounds.field26995;
   }

   @Override
   public Class6990 method4221(World var1) {
      return new Class6992(this, var1);
   }

   @Override
   public int method4260() {
      return 45;
   }

   @Override
   public double method3310() {
      return 2.1;
   }

   @Override
   public boolean method4277() {
      return !this.method4305() && this.method3407() instanceof LivingEntity;
   }

   @Nullable
   @Override
   public Entity method3407() {
      return !this.method3408().isEmpty() ? this.method3408().get(0) : null;
   }

   @Override
   public void method2871() {
      super.method2871();
      if (this.isAlive()) {
         if (!this.method2896()) {
            double var3 = this.method4232() == null ? 0.3 : 0.35;
            double var5 = this.method3085(Attributes.MOVEMENT_SPEED).method38660();
            this.method3085(Attributes.MOVEMENT_SPEED).method38661(MathHelper.method37822(0.1, var5, var3));
         } else {
            this.method3085(Attributes.MOVEMENT_SPEED).method38661(0.0);
         }

         if (this.collidedHorizontally && this.world.method6789().method17135(Class5462.field24224)) {
            boolean var7 = false;
            AxisAlignedBB var8 = this.getBoundingBox().method19664(0.2);

            for (BlockPos var10 : BlockPos.method8364(
               MathHelper.floor(var8.field28449),
               MathHelper.floor(var8.field28450),
               MathHelper.floor(var8.field28451),
               MathHelper.floor(var8.field28452),
               MathHelper.floor(var8.field28453),
               MathHelper.floor(var8.field28454)
            )) {
               BlockState var11 = this.world.getBlockState(var10);
               Block var12 = var11.getBlock();
               if (var12 instanceof Class3465) {
                  var7 = this.world.method7180(var10, true, this) || var7;
               }
            }

            if (!var7 && this.onGround) {
               this.method2914();
            }
         }

         if (this.field5730 > 0) {
            this.field5730--;
            if (this.field5730 == 10) {
               this.method4583();
            }
         }

         if (this.field5728 > 0) {
            this.field5728--;
         }

         if (this.field5729 > 0) {
            this.field5729--;
            this.method4582();
            if (this.field5729 == 0) {
               this.method2863(Sounds.field27000, 1.0F, 1.0F);
               this.field5730 = 20;
            }
         }
      }
   }

   private void method4582() {
      if (this.rand.nextInt(6) == 0) {
         double var3 = this.getPosX()
            - (double)this.method3429() * Math.sin((double)(this.field4965 * (float) (Math.PI / 180.0)))
            + (this.rand.nextDouble() * 0.6 - 0.3);
         double var5 = this.getPosY() + (double)this.method3430() - 0.3;
         double var7 = this.getPosZ()
            + (double)this.method3429() * Math.cos((double)(this.field4965 * (float) (Math.PI / 180.0)))
            + (this.rand.nextDouble() * 0.6 - 0.3);
         this.world.method6746(ParticleTypes.field34068, var3, var5, var7, 0.4980392156862745, 0.5137254901960784, 0.5725490196078431);
      }
   }

   @Override
   public boolean method2896() {
      return super.method2896() || this.field5728 > 0 || this.field5729 > 0 || this.field5730 > 0;
   }

   @Override
   public boolean method3135(Entity var1) {
      return this.field5729 <= 0 && this.field5730 <= 0 ? super.method3135(var1) : false;
   }

   @Override
   public void method3045(LivingEntity var1) {
      if (this.field5730 == 0) {
         if (!(this.rand.nextDouble() < 0.5)) {
            this.method4584(var1);
         } else {
            this.field5729 = 40;
            this.method2863(Sounds.field26999, 1.0F, 1.0F);
            this.world.method6786(this, (byte)39);
            var1.method3101(this);
         }

         var1.velocityChanged = true;
      }
   }

   private void method4583() {
      if (this.isAlive()) {
         for (Entity var4 : this.world.<Entity>method6772(LivingEntity.class, this.getBoundingBox().method19664(4.0), field5727)) {
            if (!(var4 instanceof Class1025)) {
               var4.method2741(Class8654.method31115(this), 6.0F);
            }

            this.method4584(var4);
         }

         Vector3d var11 = this.getBoundingBox().method19685();

         for (int var12 = 0; var12 < 40; var12++) {
            double var5 = this.rand.nextGaussian() * 0.2;
            double var7 = this.rand.nextGaussian() * 0.2;
            double var9 = this.rand.nextGaussian() * 0.2;
            this.world.method6746(ParticleTypes.field34089, var11.x, var11.y, var11.z, var5, var7, var9);
         }
      }
   }

   private void method4584(Entity var1) {
      double var4 = var1.getPosX() - this.getPosX();
      double var6 = var1.getPosZ() - this.getPosZ();
      double var8 = Math.max(var4 * var4 + var6 * var6, 0.001);
      var1.method3280(var4 / var8 * 4.0, 0.2, var6 / var8 * 4.0);
   }

   @Override
   public void method2866(byte var1) {
      if (var1 != 4) {
         if (var1 == 39) {
            this.field5729 = 40;
         }
      } else {
         this.field5728 = 10;
         this.method2863(Sounds.field26994, 1.0F, 1.0F);
      }

      super.method2866(var1);
   }

   public int method4585() {
      return this.field5728;
   }

   public int method4586() {
      return this.field5729;
   }

   public int method4587() {
      return this.field5730;
   }

   @Override
   public boolean method3114(Entity var1) {
      this.field5728 = 10;
      this.world.method6786(this, (byte)4);
      this.method2863(Sounds.field26994, 1.0F, 1.0F);
      return super.method3114(var1);
   }

   @Nullable
   @Override
   public SoundEvent method4241() {
      return Sounds.field26993;
   }

   @Override
   public SoundEvent method2879(Class8654 var1) {
      return Sounds.field26997;
   }

   @Override
   public SoundEvent method2880() {
      return Sounds.field26996;
   }

   @Override
   public void method3241(BlockPos var1, BlockState var2) {
      this.method2863(Sounds.field26998, 0.15F, 1.0F);
   }

   @Override
   public boolean method4266(Class1662 var1) {
      return !var1.method7014(this.getBoundingBox());
   }

   @Override
   public void method4545(int var1, boolean var2) {
   }

   @Override
   public boolean method4570() {
      return false;
   }
}
