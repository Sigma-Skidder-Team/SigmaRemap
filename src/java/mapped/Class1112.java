package mapped;

import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Difficulty;

import java.util.Random;

public class Class1112 extends Class1111 implements Class1008 {
   private static final DataParameter<Boolean> field6091 = EntityDataManager.<Boolean>method35441(Class1112.class, Class7784.field33398);
   private int field6092 = 1;

   public Class1112(EntityType<? extends Class1112> var1, World var2) {
      super(var1, var2);
      this.field5594 = 5;
      this.field5596 = new Class6837(this);
   }

   @Override
   public void method4219() {
      this.field5600.method20002(5, new Class2684(this));
      this.field5600.method20002(7, new Class2757(this));
      this.field5600.method20002(7, new Class2639(this));
      this.field5601
         .method20002(1, new Class2709<PlayerEntity>(this, PlayerEntity.class, 10, true, false, var1 -> Math.abs(var1.getPosY() - this.getPosY()) <= 4.0));
   }

   public boolean method5357() {
      return this.dataManager.<Boolean>method35445(field6091);
   }

   public void method5358(boolean var1) {
      this.dataManager.method35446(field6091, var1);
   }

   public int method5359() {
      return this.field6092;
   }

   @Override
   public boolean method4256() {
      return true;
   }

   @Override
   public boolean method2741(Class8654 var1, float var2) {
      if (!this.method2760(var1)) {
         if (var1.method31113() instanceof Class899 && var1.method31109() instanceof PlayerEntity) {
            super.method2741(var1, 1000.0F);
            return true;
         } else {
            return super.method2741(var1, var2);
         }
      } else {
         return false;
      }
   }

   @Override
   public void registerData() {
      super.registerData();
      this.dataManager.register(field6091, false);
   }

   public static Class7037 method5360() {
      return Class1006.method4220().method21849(Attributes.field42105, 10.0).method21849(Attributes.field42106, 100.0);
   }

   @Override
   public Class2266 method2864() {
      return Class2266.field14733;
   }

   @Override
   public Class9455 method4241() {
      return Sounds.field26616;
   }

   @Override
   public Class9455 method2879(Class8654 var1) {
      return Sounds.field26618;
   }

   @Override
   public Class9455 method2880() {
      return Sounds.field26617;
   }

   @Override
   public float method3099() {
      return 5.0F;
   }

   public static boolean method5361(EntityType<Class1112> var0, Class1660 var1, Class2202 var2, BlockPos var3, Random var4) {
      return var1.method6997() != Difficulty.field14351 && var4.nextInt(20) == 0 && method4264(var0, var1, var2, var3, var4);
   }

   @Override
   public int method4267() {
      return 1;
   }

   @Override
   public void method2724(CompoundNBT var1) {
      super.method2724(var1);
      var1.method102("ExplosionPower", this.field6092);
   }

   @Override
   public void method2723(CompoundNBT var1) {
      super.method2723(var1);
      if (var1.method119("ExplosionPower", 99)) {
         this.field6092 = var1.method122("ExplosionPower");
      }
   }

   @Override
   public float method2957(Pose var1, EntitySize var2) {
      return 2.6F;
   }
}
