package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Difficulty;

import java.util.Random;

public class Class1109 extends Class1108 {
   private static String[] field6086;

   public Class1109(EntityType<? extends Class1109> var1, World var2) {
      super(var1, var2);
   }

   public static Class7037 method5334() {
      return Class1009.method4343().method21849(Attributes.MOVEMENT_SPEED, 0.2F);
   }

   public static boolean method5335(EntityType<Class1109> var0, Class1660 var1, Class2202 var2, BlockPos var3, Random var4) {
      return var1.method6997() != Difficulty.field14351;
   }

   @Override
   public boolean method4266(Class1662 var1) {
      return var1.method7050(this) && !var1.method7014(this.getBoundingBox());
   }

   @Override
   public void method5318(int var1, boolean var2) {
      super.method5318(var1, var2);
      this.method3085(Attributes.field42113).method38661((double)(var1 * 3));
   }

   @Override
   public float getBrightness() {
      return 1.0F;
   }

   @Override
   public Class7436 method5321() {
      return Class7940.field34074;
   }

   @Override
   public ResourceLocation method4242() {
      return !this.method5320() ? this.getType().method33212() : Class8793.field39533;
   }

   @Override
   public boolean method3327() {
      return false;
   }

   @Override
   public int method5323() {
      return super.method5323() * 4;
   }

   @Override
   public void method5322() {
      this.field6082 *= 0.9F;
   }

   @Override
   public void method2914() {
      Vector3d var3 = this.method3433();
      this.method3435(var3.field18048, (double)(this.method3103() + (float)this.method5319() * 0.1F), var3.field18050);
      this.isAirBorne = true;
   }

   @Override
   public void method3105(ITag<Fluid> var1) {
      if (var1 != Class8953.field40470) {
         super.method3105(var1);
      } else {
         Vector3d var4 = this.method3433();
         this.method3435(var4.field18048, (double)(0.22F + (float)this.method5319() * 0.05F), var4.field18050);
         this.isAirBorne = true;
      }
   }

   @Override
   public boolean method2921(float var1, float var2) {
      return false;
   }

   @Override
   public boolean method5325() {
      return this.method3138();
   }

   @Override
   public float method5326() {
      return super.method5326() + 2.0F;
   }

   @Override
   public Class9455 method2879(Class8654 var1) {
      return !this.method5320() ? Sounds.field26751 : Sounds.field26752;
   }

   @Override
   public Class9455 method2880() {
      return !this.method5320() ? Sounds.field26750 : Sounds.field26743;
   }

   @Override
   public Class9455 method5327() {
      return !this.method5320() ? Sounds.field26754 : Sounds.field26755;
   }

   @Override
   public Class9455 method5331() {
      return Sounds.field26753;
   }
}
