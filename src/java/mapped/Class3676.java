package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.world.server.ServerWorld;

import java.util.Map;
import java.util.Map.Entry;

public abstract class Class3676<E extends LivingEntity> {
   public final Map<Class8830<?>, Class2217> field19684;
   private Class2092 field19685 = Class2092.field13632;
   private long field19686;
   private final int field19687;
   private final int field19688;

   public Class3676(Map<Class8830<?>, Class2217> var1) {
      this(var1, 60);
   }

   public Class3676(Map<Class8830<?>, Class2217> var1, int var2) {
      this(var1, var2, var2);
   }

   public Class3676(Map<Class8830<?>, Class2217> var1, int var2, int var3) {
      this.field19687 = var2;
      this.field19688 = var3;
      this.field19684 = var1;
   }

   public Class2092 method12500() {
      return this.field19685;
   }

   public final boolean method12501(ServerWorld var1, E var2, long var3) {
      if (this.method12509((E)var2) && this.method12508(var1, (E)var2)) {
         this.field19685 = Class2092.field13633;
         int var7 = this.field19687 + var1.method6814().nextInt(this.field19688 + 1 - this.field19687);
         this.field19686 = var3 + (long)var7;
         this.method12502(var1, (E)var2, var3);
         return true;
      } else {
         return false;
      }
   }

   public void method12502(ServerWorld var1, E var2, long var3) {
   }

   public final void method12503(ServerWorld var1, E var2, long var3) {
      if (!this.method12507(var3) && this.method12499(var1, (E)var2, var3)) {
         this.method12504(var1, (E)var2, var3);
      } else {
         this.method12505(var1, (E)var2, var3);
      }
   }

   public void method12504(ServerWorld var1, E var2, long var3) {
   }

   public final void method12505(ServerWorld var1, E var2, long var3) {
      this.field19685 = Class2092.field13632;
      this.method12506(var1, (E)var2, var3);
   }

   public void method12506(ServerWorld var1, E var2, long var3) {
   }

   public boolean method12499(ServerWorld var1, E var2, long var3) {
      return false;
   }

   public boolean method12507(long var1) {
      return var1 > this.field19686;
   }

   public boolean method12508(ServerWorld var1, E var2) {
      return true;
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName();
   }

   private boolean method12509(E var1) {
      for (Entry var5 : this.field19684.entrySet()) {
         Class8830 var6 = (Class8830)var5.getKey();
         Class2217 var7 = (Class2217)var5.getValue();
         if (!var1.method2992().method21412(var6, var7)) {
            return false;
         }
      }

      return true;
   }
}
