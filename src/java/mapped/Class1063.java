package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Difficulty;

import java.util.Random;
import java.util.UUID;

public class Class1063 extends Class1038 implements Class1011 {
   private static final UUID field5860 = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
   private static final Class9689 field5861 = new Class9689(field5860, "Attacking speed boost", 0.05, AttributeModifierOperation.ADDITION);
   private static final Class8369 field5862 = Class8763.method31620(0, 1);
   private int field5863;
   private static final Class8369 field5864 = Class8763.method31620(20, 39);
   private int field5865;
   private UUID field5866;
   private static final Class8369 field5867 = Class8763.method31620(4, 6);
   private int field5868;

   public Class1063(EntityType<? extends Class1063> var1, World var2) {
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
      return Class1038.method4653().method21849(Attributes.field42116, 0.0).method21849(Attributes.MOVEMENT_SPEED, 0.23F).method21849(Attributes.field42110, 5.0);
   }

   @Override
   public boolean method4645() {
      return false;
   }

   @Override
   public void method4258() {
      Class9805 var3 = this.method3085(Attributes.MOVEMENT_SPEED);
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

      this.method4366((ServerWorld)this.world, true);
      if (this.method4232() != null) {
         this.method4876();
      }

      if (this.method4369()) {
         this.field4971 = this.ticksExisted;
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

         this.field5868 = field5867.method29319(this.rand);
      } else {
         this.field5868--;
      }
   }

   private void method4877() {
      double var3 = this.method3086(Attributes.field42106);
      AxisAlignedBB var5 = AxisAlignedBB.method19657(this.getPositionVec()).method19663(var3, 10.0, var3);
      this.world
         .<Class1063>method7183(Class1063.class, var5)
         .stream()
         .filter(var1 -> var1 != this)
         .filter(var0 -> var0.method4232() == null)
         .filter(var1 -> !var1.method3345(this.method4232()))
         .forEach(var1 -> var1.method4233(this.method4232()));
   }

   private void method4878() {
      this.method2863(Sounds.field27295, this.method3099() * 2.0F, this.method3100() * 1.8F);
   }

   @Override
   public void method4233(LivingEntity var1) {
      if (this.method4232() == null && var1 != null) {
         this.field5863 = field5862.method29319(this.rand);
         this.field5868 = field5867.method29319(this.rand);
      }

      if (var1 instanceof PlayerEntity) {
         this.method3016((PlayerEntity)var1);
      }

      super.method4233(var1);
   }

   @Override
   public void method4346() {
      this.method4347(field5864.method29319(this.rand));
   }

   public static boolean method4879(EntityType<Class1063> var0, Class1660 var1, Class2202 var2, BlockPos var3, Random var4) {
      return var1.method6997() != Difficulty.field14351 && var1.getBlockState(var3.down()).getBlock() != Blocks.field36891;
   }

   @Override
   public boolean method4266(Class1662 var1) {
      return var1.method7050(this) && !var1.method7014(this.getBoundingBox());
   }

   @Override
   public void method2724(CompoundNBT var1) {
      super.method2724(var1);
      this.method4364(var1);
   }

   @Override
   public void method2723(CompoundNBT var1) {
      super.method2723(var1);
      this.method4365((ServerWorld)this.world, var1);
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
   public SoundEvent method4241() {
      return !this.method4369() ? Sounds.field27294 : Sounds.field27295;
   }

   @Override
   public SoundEvent method2879(Class8654 var1) {
      return Sounds.field27297;
   }

   @Override
   public SoundEvent method2880() {
      return Sounds.field27296;
   }

   @Override
   public void method4270(Class9755 var1) {
      this.method2944(Class2106.field13731, new ItemStack(Items.field37815));
   }

   @Override
   public ItemStack method4644() {
      return ItemStack.EMPTY;
   }

   @Override
   public void method4663() {
      this.method3085(Attributes.field42116).method38661(0.0);
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
