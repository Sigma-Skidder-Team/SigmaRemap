package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.world.server.ServerWorld;

public class Class3702<E extends LivingEntity> extends Class3676<E> {
   private boolean field19757;
   private boolean field19758;
   private final Class8369 field19759;
   private final Class3676<? super E> field19760;
   private int field19761;

   public Class3702(Class3676<? super E> var1, Class8369 var2) {
      this(var1, false, var2);
   }

   public Class3702(Class3676<? super E> var1, boolean var2, Class8369 var3) {
      super(var1.field19684);
      this.field19760 = var1;
      this.field19757 = !var2;
      this.field19759 = var3;
   }

   @Override
   public boolean method12508(ServerWorld var1, E var2) {
      if (!this.field19760.method12508(var1, (E)var2)) {
         return false;
      } else {
         if (this.field19757) {
            this.method12580(var1);
            this.field19757 = false;
         }

         if (this.field19761 > 0) {
            this.field19761--;
         }

         return !this.field19758 && this.field19761 == 0;
      }
   }

   @Override
   public void method12502(ServerWorld var1, E var2, long var3) {
      this.field19760.method12502(var1, (E)var2, var3);
   }

   @Override
   public boolean method12499(ServerWorld var1, E var2, long var3) {
      return this.field19760.method12499(var1, (E)var2, var3);
   }

   @Override
   public void method12504(ServerWorld var1, E var2, long var3) {
      this.field19760.method12504(var1, (E)var2, var3);
      this.field19758 = this.field19760.method12500() == Class2092.field13633;
   }

   @Override
   public void method12506(ServerWorld var1, E var2, long var3) {
      this.method12580(var1);
      this.field19760.method12506(var1, (E)var2, var3);
   }

   private void method12580(ServerWorld var1) {
      this.field19761 = this.field19759.method29319(var1.rand);
   }

   @Override
   public boolean method12507(long var1) {
      return false;
   }

   @Override
   public String toString() {
      return "RunSometimes: " + this.field19760;
   }
}
