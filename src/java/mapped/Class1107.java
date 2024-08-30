package mapped;

import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;

import java.util.Random;

public class Class1107 extends Class1009 {
   private static String[] field6079;
   private Class2753 field6080;

   public Class1107(EntityType<? extends Class1107> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public void method4219() {
      this.field6080 = new Class2753(this);
      this.field5600.method20002(1, new Class2603(this));
      this.field5600.method20002(3, this.field6080);
      this.field5600.method20002(4, new Class2647(this, 1.0, false));
      this.field5600.method20002(5, new Class2744(this));
      this.field5601.method20002(1, new Class2704(this).method10918());
      this.field5601.method20002(2, new Class2709<PlayerEntity>(this, PlayerEntity.class, true));
   }

   @Override
   public double method2894() {
      return 0.1;
   }

   @Override
   public float method2957(Pose var1, EntitySize var2) {
      return 0.13F;
   }

   public static Class7037 method5316() {
      return Class1009.method4343().method21849(Attributes.field42105, 8.0).method21849(Attributes.MOVEMENT_SPEED, 0.25).method21849(Attributes.field42110, 1.0);
   }

   @Override
   public boolean method2940() {
      return false;
   }

   @Override
   public Class9455 method4241() {
      return Sounds.field27055;
   }

   @Override
   public Class9455 method2879(Class8654 var1) {
      return Sounds.field27057;
   }

   @Override
   public Class9455 method2880() {
      return Sounds.field27056;
   }

   @Override
   public void method3241(BlockPos var1, BlockState var2) {
      this.method2863(Sounds.field27058, 0.15F, 1.0F);
   }

   @Override
   public boolean method2741(Class8654 var1, float var2) {
      if (this.method2760(var1)) {
         return false;
      } else {
         if ((var1 instanceof Class8652 || var1 == Class8654.field39006) && this.field6080 != null) {
            this.field6080.method10958();
         }

         return super.method2741(var1, var2);
      }
   }

   @Override
   public void tick() {
      this.field4965 = this.rotationYaw;
      super.tick();
   }

   @Override
   public void method3144(float var1) {
      this.rotationYaw = var1;
      super.method3144(var1);
   }

   @Override
   public float method4339(BlockPos var1, Class1662 var2) {
      return !Class3442.method12119(var2.getBlockState(var1.down())) ? super.method4339(var1, var2) : 10.0F;
   }

   public static boolean method5317(EntityType<Class1107> var0, Class1660 var1, Class2202 var2, BlockPos var3, Random var4) {
      if (!method4342(var0, var1, var2, var3, var4)) {
         return false;
      } else {
         PlayerEntity var7 = var1.method7186((double)var3.getX() + 0.5, (double)var3.getY() + 0.5, (double)var3.getZ() + 0.5, 5.0, true);
         return var7 == null;
      }
   }

   @Override
   public Class7809 method3089() {
      return Class7809.field33507;
   }
}
