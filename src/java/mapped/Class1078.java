package mapped;

import net.minecraft.entity.EntityType;

import javax.annotation.Nullable;

public class Class1078 extends Class1066 {
   private static String[] field5922;

   public Class1078(EntityType<? extends Class1078> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public Class9455 method4241() {
      super.method4241();
      return Sounds.field26770;
   }

   @Override
   public Class9455 method4893() {
      super.method4893();
      return Sounds.field26771;
   }

   @Override
   public Class9455 method2880() {
      super.method2880();
      return Sounds.field26773;
   }

   @Nullable
   @Override
   public Class9455 method4894() {
      return Sounds.field26774;
   }

   @Override
   public Class9455 method2879(Class8654 var1) {
      super.method2879(var1);
      return Sounds.field26775;
   }

   @Override
   public void method4895() {
      this.method2863(Sounds.field26772, 1.0F, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
   }

   @Override
   public Class1045 method4389(ServerWorld var1, Class1045 var2) {
      return EntityType.field41057.method33215(var1);
   }
}
