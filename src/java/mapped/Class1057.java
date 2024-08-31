package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.entity.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;

public class Class1057 extends Class1056 implements Class1008 {
   private static final UUID field5839 = UUID.fromString("7E0292F2-9434-48D5-A29F-9583AF7DF27F");
   private static final Class9689 field5840 = new Class9689(field5839, "Covered armor bonus", 20.0, AttributeModifierOperation.ADDITION);
   public static final DataParameter<Direction> field5841 = EntityDataManager.<Direction>createKey(Class1057.class, DataSerializers.field33403);
   public static final DataParameter<Optional<BlockPos>> field5842 = EntityDataManager.<Optional<BlockPos>>createKey(Class1057.class, DataSerializers.field33402);
   public static final DataParameter<Byte> field5843 = EntityDataManager.<Byte>createKey(Class1057.class, DataSerializers.field33390);
   public static final DataParameter<Byte> field5844 = EntityDataManager.<Byte>createKey(Class1057.class, DataSerializers.field33390);
   private float field5845;
   private float field5846;
   private BlockPos field5847 = null;
   private int field5848;

   public Class1057(EntityType<? extends Class1057> var1, World var2) {
      super(var1, var2);
      this.field5594 = 5;
   }

   @Override
   public void method4219() {
      this.field5600.method20002(1, new Class2612(this, PlayerEntity.class, 8.0F));
      this.field5600.method20002(4, new Class2746(this));
      this.field5600.method20002(7, new Class2600(this));
      this.field5600.method20002(8, new Class2668(this));
      this.field5601.method20002(1, new Class2704(this).method10918());
      this.field5601.method20002(2, new Class2721(this, this));
      this.field5601.method20002(3, new Class2719(this));
   }

   @Override
   public boolean method2940() {
      return false;
   }

   @Override
   public Class2266 method2864() {
      return Class2266.field14733;
   }

   @Override
   public SoundEvent method4241() {
      return Sounds.field27043;
   }

   @Override
   public void method4237() {
      if (!this.method4847()) {
         super.method4237();
      }
   }

   @Override
   public SoundEvent method2880() {
      return Sounds.field27049;
   }

   @Override
   public SoundEvent method2879(Class8654 var1) {
      return !this.method4847() ? Sounds.field27050 : Sounds.field27051;
   }

   @Override
   public void registerData() {
      super.registerData();
      this.dataManager.register(field5841, Direction.DOWN);
      this.dataManager.register(field5842, Optional.<BlockPos>empty());
      this.dataManager.register(field5843, (byte)0);
      this.dataManager.register(field5844, (byte)16);
   }

   public static Class7037 method4843() {
      return Class1006.method4220().method21849(Attributes.field42105, 30.0);
   }

   @Override
   public Class7395 method4226() {
      return new Class7396(this, this);
   }

   @Override
   public void method2723(CompoundNBT var1) {
      super.method2723(var1);
      this.dataManager.method35446(field5841, Direction.method546(var1.method120("AttachFace")));
      this.dataManager.method35446(field5843, var1.method120("Peek"));
      this.dataManager.method35446(field5844, var1.method120("Color"));
      if (!var1.contains("APX")) {
         this.dataManager.method35446(field5842, Optional.<BlockPos>empty());
      } else {
         int var4 = var1.method122("APX");
         int var5 = var1.method122("APY");
         int var6 = var1.method122("APZ");
         this.dataManager.method35446(field5842, Optional.<BlockPos>of(new BlockPos(var4, var5, var6)));
      }
   }

   @Override
   public void method2724(CompoundNBT var1) {
      super.method2724(var1);
      var1.method100("AttachFace", (byte)this.dataManager.<Direction>method35445(field5841).method533());
      var1.method100("Peek", this.dataManager.<Byte>method35445(field5843));
      var1.method100("Color", this.dataManager.<Byte>method35445(field5844));
      BlockPos var4 = this.method4849();
      if (var4 != null) {
         var1.method102("APX", var4.getX());
         var1.method102("APY", var4.getY());
         var1.method102("APZ", var4.getZ());
      }
   }

   @Override
   public void tick() {
      super.tick();
      BlockPos var3 = this.dataManager.<Optional<BlockPos>>method35445(field5842).orElse((BlockPos)null);
      if (var3 == null && !this.world.isRemote) {
         var3 = this.getPosition();
         this.dataManager.method35446(field5842, Optional.<BlockPos>of(var3));
      }

      if (!this.isPassenger()) {
         if (!this.world.isRemote) {
            BlockState var4 = this.world.getBlockState(var3);
            if (!var4.isAir()) {
               if (!var4.method23448(Blocks.MOVING_PISTON)) {
                  if (!var4.method23448(Blocks.PISTON_HEAD)) {
                     this.method4846();
                  } else {
                     Direction var5 = var4.<Direction>method23463(Class3436.field19198);
                     if (!this.world.method7007(var3.method8349(var5))) {
                        this.method4846();
                     } else {
                        var3 = var3.method8349(var5);
                        this.dataManager.method35446(field5842, Optional.<BlockPos>of(var3));
                     }
                  }
               } else {
                  Direction var19 = var4.<Direction>method23463(Class3435.field19198);
                  if (!this.world.method7007(var3.method8349(var19))) {
                     this.method4846();
                  } else {
                     var3 = var3.method8349(var19);
                     this.dataManager.method35446(field5842, Optional.<BlockPos>of(var3));
                  }
               }
            }

            Direction var20 = this.method4848();
            if (!this.method4845(var3, var20)) {
               Direction var6 = this.method4844(var3);
               if (var6 == null) {
                  this.method4846();
               } else {
                  this.dataManager.method35446(field5841, var6);
               }
            }
         }
      } else {
         var3 = null;
         float var17 = this.getRidingEntity().rotationYaw;
         this.rotationYaw = var17;
         this.field4965 = var17;
         this.field4966 = var17;
         this.field5848 = 0;
      }

      float var18 = (float)this.method4851() * 0.01F;
      this.field5845 = this.field5846;
      if (!(this.field5846 > var18)) {
         if (this.field5846 < var18) {
            this.field5846 = MathHelper.method37777(this.field5846 + 0.05F, 0.0F, var18);
         }
      } else {
         this.field5846 = MathHelper.method37777(this.field5846 - 0.05F, var18, 1.0F);
      }

      if (var3 != null) {
         if (this.world.isRemote) {
            if (this.field5848 > 0 && this.field5847 != null) {
               this.field5848--;
            } else {
               this.field5847 = var3;
            }
         }

         this.method3274((double)var3.getX() + 0.5, (double)var3.getY(), (double)var3.getZ() + 0.5);
         double var7 = 0.5 - (double) MathHelper.sin((0.5F + this.field5846) * (float) Math.PI) * 0.5;
         double var9 = 0.5 - (double) MathHelper.sin((0.5F + this.field5845) * (float) Math.PI) * 0.5;
         Direction var11 = this.method4848().method536();
         this.method3391(
            new AxisAlignedBB(
                  this.getPosX() - 0.5,
                  this.getPosY(),
                  this.getPosZ() - 0.5,
                  this.getPosX() + 0.5,
                  this.getPosY() + 1.0,
                  this.getPosZ() + 0.5
               )
               .method19662((double)var11.method539() * var7, (double)var11.method540() * var7, (double)var11.method541() * var7)
         );
         double var12 = var7 - var9;
         if (var12 > 0.0) {
            List<Entity> var14 = this.world.method7181(this, this.getBoundingBox());
            if (!var14.isEmpty()) {
               for (Entity var16 : var14) {
                  if (!(var16 instanceof Class1057) && !var16.noClip) {
                     var16.move(
                        Class2107.field13746,
                        new Vector3d(var12 * (double)var11.method539(), var12 * (double)var11.method540(), var12 * (double)var11.method541())
                     );
                  }
               }
            }
         }
      }
   }

   @Override
   public void move(Class2107 var1, Vector3d var2) {
      if (var1 != Class2107.field13745) {
         super.move(var1, var2);
      } else {
         this.method4846();
      }
   }

   @Override
   public void setPosition(double var1, double var3, double var5) {
      super.setPosition(var1, var3, var5);
      if (this.dataManager != null && this.ticksExisted != 0) {
         Optional var9 = this.dataManager.method35445(field5842);
         Optional var10 = Optional.<BlockPos>of(new BlockPos(var1, var3, var5));
         if (!var10.equals(var9)) {
            this.dataManager.method35446(field5842, var10);
            this.dataManager.method35446(field5843, (byte)0);
            this.isAirBorne = true;
         }
      }
   }

   @Nullable
   public Direction method4844(BlockPos var1) {
      for (Direction var7 : Direction.values()) {
         if (this.method4845(var1, var7)) {
            return var7;
         }
      }

      return null;
   }

   private boolean method4845(BlockPos var1, Direction var2) {
      return this.world.method6764(var1.method8349(var2), this, var2.method536())
         && this.world.method7053(this, Class8919.method32596(var1, var2.method536()));
   }

   public boolean method4846() {
      if (!this.method4305() && this.isAlive()) {
         BlockPos var3 = this.getPosition();

         for (int var4 = 0; var4 < 5; var4++) {
            BlockPos var5 = var3.method8336(8 - this.rand.nextInt(17), 8 - this.rand.nextInt(17), 8 - this.rand.nextInt(17));
            if (var5.getY() > 0
               && this.world.method7007(var5)
               && this.world.method6810().method24523(var5)
               && this.world.method7053(this, new AxisAlignedBB(var5))) {
               Direction var6 = this.method4844(var5);
               if (var6 != null) {
                  this.dataManager.method35446(field5841, var6);
                  this.method2863(Sounds.field27054, 1.0F, 1.0F);
                  this.dataManager.method35446(field5842, Optional.<BlockPos>of(var5));
                  this.dataManager.method35446(field5843, (byte)0);
                  this.method4233((LivingEntity)null);
                  return true;
               }
            }
         }

         return false;
      } else {
         return true;
      }
   }

   @Override
   public void method2871() {
      super.method2871();
      this.method3434(Vector3d.ZERO);
      if (!this.method4305()) {
         this.field4966 = 0.0F;
         this.field4965 = 0.0F;
      }
   }

   @Override
   public void method3155(DataParameter<?> var1) {
      if (field5842.equals(var1) && this.world.isRemote && !this.isPassenger()) {
         BlockPos var4 = this.method4849();
         if (var4 != null) {
            if (this.field5847 != null) {
               this.field5848 = 6;
            } else {
               this.field5847 = var4;
            }

            this.method3274((double)var4.getX() + 0.5, (double)var4.getY(), (double)var4.getZ() + 0.5);
         }
      }

      super.method3155(var1);
   }

   @Override
   public void setPositionAndRotationDirect(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
      this.field4985 = 0;
   }

   @Override
   public boolean method2741(Class8654 var1, float var2) {
      if (this.method4847()) {
         Entity var5 = var1.method31113();
         if (var5 instanceof AbstractArrowEntity) {
            return false;
         }
      }

      if (!super.method2741(var1, var2)) {
         return false;
      } else {
         if ((double)this.getHealth() < (double)this.method3075() * 0.5 && this.rand.nextInt(4) == 0) {
            this.method4846();
         }

         return true;
      }
   }

   private boolean method4847() {
      return this.method4851() == 0;
   }

   @Override
   public boolean method3306() {
      return this.isAlive();
   }

   public Direction method4848() {
      return this.dataManager.<Direction>method35445(field5841);
   }

   @Nullable
   public BlockPos method4849() {
      return this.dataManager.<Optional<BlockPos>>method35445(field5842).orElse((BlockPos)null);
   }

   public void method4850(BlockPos var1) {
      this.dataManager.method35446(field5842, Optional.<BlockPos>ofNullable(var1));
   }

   public int method4851() {
      return this.dataManager.<Byte>method35445(field5843);
   }

   public void method4852(int var1) {
      if (!this.world.isRemote) {
         this.method3085(Attributes.field42113).method38670(field5840);
         if (var1 != 0) {
            this.method2863(Sounds.field27052, 1.0F, 1.0F);
         } else {
            this.method3085(Attributes.field42113).method38668(field5840);
            this.method2863(Sounds.field27048, 1.0F, 1.0F);
         }
      }

      this.dataManager.method35446(field5843, (byte)var1);
   }

   public float method4853(float var1) {
      return MathHelper.lerp(var1, this.field5845, this.field5846);
   }

   public int method4854() {
      return this.field5848;
   }

   public BlockPos method4855() {
      return this.field5847;
   }

   @Override
   public float method2957(Pose var1, EntitySize var2) {
      return 0.5F;
   }

   @Override
   public int method4259() {
      return 180;
   }

   @Override
   public int method4260() {
      return 180;
   }

   @Override
   public void method3101(Entity var1) {
   }

   @Override
   public float method3319() {
      return 0.0F;
   }

   public boolean method4856() {
      return this.field5847 != null && this.method4849() != null;
   }

   @Nullable
   public Class112 method4857() {
      Byte var3 = this.dataManager.<Byte>method35445(field5844);
      return var3 != 16 && var3 <= 15 ? Class112.method315(var3) : null;
   }

   // $VF: synthetic method
   public static Random method4858(Class1057 var0) {
      return var0.rand;
   }

   // $VF: synthetic method
   public static Random method4859(Class1057 var0) {
      return var0.rand;
   }

   // $VF: synthetic method
   public static Random method4860(Class1057 var0) {
      return var0.rand;
   }

   // $VF: synthetic method
   public static Random method4861(Class1057 var0) {
      return var0.rand;
   }

   // $VF: synthetic method
   public static Random method4862(Class1057 var0) {
      return var0.rand;
   }
}
