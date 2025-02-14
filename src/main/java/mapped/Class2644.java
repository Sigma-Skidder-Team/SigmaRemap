package mapped;

import java.util.EnumSet;

public class Class2644 extends Class2643 {
   private static String[] field16980;

   public Class2644(MobEntity var1) {
      super(var1, 6, VindicatorEntity.method4591());
      this.method10809(EnumSet.<Class2240>of(Class2240.field14657));
   }

   @Override
   public boolean method10806() {
      VindicatorEntity var3 = (VindicatorEntity)this.field16974;
      return var3.method4552() && super.method10806();
   }

   @Override
   public boolean method10803() {
      VindicatorEntity var3 = (VindicatorEntity)this.field16974;
      return var3.method4552() && VindicatorEntity.method4592(var3).nextInt(10) == 0 && super.method10803();
   }

   @Override
   public void startExecuting() {
      super.startExecuting();
      this.field16974.setIdleTime(0);
   }
}
