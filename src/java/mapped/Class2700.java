package mapped;

import net.minecraft.util.math.AxisAlignedBB;

import java.util.EnumSet;
import java.util.List;

public class Class2700 extends Class2699 {
   private static String[] field17161;
   private final Class1058 field17162;
   private Class880 field17163;
   private final Class8522 field17164 = new Class8522().method30203(64.0);

   public Class2700(Class1058 var1) {
      super(var1, false, true);
      this.field17162 = var1;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14660));
   }

   @Override
   public boolean method10803() {
      AxisAlignedBB var3 = this.field17162.getBoundingBox().method19663(10.0, 8.0, 10.0);
      List<Class1042> var4 = this.field17162.world.<Class1042>method7195(Class1042.class, this.field17164, this.field17162, var3);
      List<PlayerEntity> var5 = this.field17162.world.method7194(this.field17164, this.field17162, var3);

      for (Class880 var7 : var4) {
         Class1042 var8 = (Class1042)var7;

         for (PlayerEntity var10 : var5) {
            int var11 = var8.method4703(var10);
            if (var11 <= -100) {
               this.field17163 = var10;
            }
         }
      }

      return this.field17163 == null
         ? false
         : !(this.field17163 instanceof PlayerEntity) || !this.field17163.isSpectator() && !((PlayerEntity)this.field17163).isCreative();
   }

   @Override
   public void method10804() {
      this.field17162.method4233(this.field17163);
      super.method10804();
   }
}
