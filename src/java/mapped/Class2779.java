package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.util.math.AxisAlignedBB;

import java.util.List;

public class Class2779<T extends Class1006 & Class1011> extends Class2595 {
   private static String[] field17377;
   private final T field17378;
   private final boolean field17379;
   private int field17380;

   public Class2779(T var1, boolean var2) {
      this.field17378 = (T)var1;
      this.field17379 = var2;
   }

   @Override
   public boolean method10803() {
      return this.field17378.world.method6789().method17135(Class5462.field24255) && this.method10967();
   }

   private boolean method10967() {
      return this.field17378.method3014() != null
         && this.field17378.method3014().getType() == EntityType.PLAYER
         && this.field17378.method3015() > this.field17380;
   }

   @Override
   public void method10804() {
      this.field17380 = this.field17378.method3015();
      this.field17378.method4371();
      if (this.field17379) {
         this.method10968().stream().filter(var1 -> var1 != this.field17378).<Class1011>map(var0 -> (Class1011)var0).forEach(Class1011::method4371);
      }

      super.method10804();
   }

   private List<Class1006> method10968() {
      double var3 = this.field17378.method3086(Class9173.field42106);
      AxisAlignedBB var5 = AxisAlignedBB.method19657(this.field17378.getPositionVec()).method19663(var3, 10.0, var3);
      return this.field17378.world.<Class1006>method7183((Class<? extends Class1006>)this.field17378.getClass(), var5);
   }
}
