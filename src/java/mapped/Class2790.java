package mapped;

import java.util.EnumSet;
import java.util.List;

public class Class2790 extends Class2595 {
   private static String[] field17423;
   public final Class1095 field17424;

   public Class2790(Class1095 var1) {
      this.field17424 = var1;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14657));
   }

   @Override
   public boolean method10803() {
      if (!this.field17424.method2943(Class2106.field13731).isEmpty()) {
         return false;
      } else if (this.field17424.method4232() != null || this.field17424.method3014() != null) {
         return false;
      } else if (Class1095.method5165(this.field17424)) {
         if (this.field17424.method3013().nextInt(10) != 0) {
            return false;
         } else {
            List var3 = this.field17424
               .world
               .<ItemEntity>method6772(ItemEntity.class, this.field17424.getBoundingBox().method19663(8.0, 8.0, 8.0), Class1095.method5166());
            return !var3.isEmpty() && this.field17424.method2943(Class2106.field13731).isEmpty();
         }
      } else {
         return false;
      }
   }

   @Override
   public void method10805() {
      List var3 = this.field17424
         .world
         .<ItemEntity>method6772(ItemEntity.class, this.field17424.getBoundingBox().method19663(8.0, 8.0, 8.0), Class1095.method5166());
      ItemStack var4 = this.field17424.method2943(Class2106.field13731);
      if (var4.isEmpty() && !var3.isEmpty()) {
         this.field17424.method4230().method21655((Entity)var3.get(0), 1.2F);
      }
   }

   @Override
   public void method10804() {
      List var3 = this.field17424
         .world
         .<ItemEntity>method6772(ItemEntity.class, this.field17424.getBoundingBox().method19663(8.0, 8.0, 8.0), Class1095.method5166());
      if (!var3.isEmpty()) {
         this.field17424.method4230().method21655((Entity)var3.get(0), 1.2F);
      }
   }
}
