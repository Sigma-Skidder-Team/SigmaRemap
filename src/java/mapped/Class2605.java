package mapped;

import java.util.EnumSet;

public abstract class Class2605 extends Class2595 {
   public final PhantomEntity field16851;

   public Class2605(PhantomEntity var1) {
      this.field16851 = var1;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14657));
   }

   public boolean method10812() {
      return PhantomEntity.method5339(this.field16851).squareDistanceTo(this.field16851.getPosX(), this.field16851.getPosY(), this.field16851.getPosZ()) < 4.0;
   }
}
