package mapped;

import javax.annotation.Nullable;

public class Class1067 extends Class1066 {
   private static String[] field5878;

   public Class1067(EntityType<? extends Class1067> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public Class9455 method4241() {
      super.method4241();
      return Sounds.field26508;
   }

   @Override
   public Class9455 method4893() {
      super.method4893();
      return Sounds.field26509;
   }

   @Override
   public Class9455 method2880() {
      super.method2880();
      return Sounds.field26511;
   }

   @Nullable
   @Override
   public Class9455 method4894() {
      return Sounds.field26512;
   }

   @Override
   public Class9455 method2879(Class8654 var1) {
      super.method2879(var1);
      return Sounds.field26513;
   }

   @Override
   public boolean method4386(Class1018 var1) {
      if (var1 != this) {
         return !(var1 instanceof Class1067) && !(var1 instanceof Class1074) ? false : this.method4961() && ((AbstractHorseEntity)var1).method4961();
      } else {
         return false;
      }
   }

   @Override
   public Class1045 method4389(ServerWorld var1, Class1045 var2) {
      EntityType var5 = !(var2 instanceof Class1074) ? EntityType.field41019 : EntityType.field41057;
      AbstractHorseEntity var6 = (AbstractHorseEntity)var5.method33215(var1);
      this.method4962(var2, var6);
      return var6;
   }
}
