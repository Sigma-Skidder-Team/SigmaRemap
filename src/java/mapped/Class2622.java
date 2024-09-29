package mapped;

import net.minecraft.entity.passive.fish.AbstractGroupFishEntity;

import java.util.List;
import java.util.function.Predicate;

public class Class2622 extends Class2595 {
   private static String[] field16911;
   private final AbstractGroupFishEntity field16912;
   private int field16913;
   private int field16914;

   public Class2622(AbstractGroupFishEntity var1) {
      this.field16912 = var1;
      this.field16914 = this.method10826(var1);
   }

   public int method10826(AbstractGroupFishEntity var1) {
      return 200 + var1.getRNG().nextInt(200) % 20;
   }

   @Override
   public boolean method10803() {
      if (!this.field16912.method4806()) {
         if (!this.field16912.method4800()) {
            if (this.field16914 <= 0) {
               this.field16914 = this.method10826(this.field16912);
               Predicate<AbstractGroupFishEntity> var3 = var0 -> var0.method4805() || !var0.method4800();
               List<AbstractGroupFishEntity> var4 = this.field16912.world.getEntitiesInAABBexcluding(this.field16912.getClass(),
                       this.field16912.getBoundingBox().grow(8.0, 8.0, 8.0), var3);
               AbstractGroupFishEntity var5 = var4.stream().filter(AbstractGroupFishEntity::method4805).findAny().orElse(this.field16912);
               var5.method4809(var4.stream().filter(var0 -> !var0.method4800()));
               return this.field16912.method4800();
            } else {
               this.field16914--;
               return false;
            }
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean method10806() {
      return this.field16912.method4800() && this.field16912.method4807();
   }

   @Override
   public void method10804() {
      this.field16913 = 0;
   }

   @Override
   public void method10807() {
      this.field16912.method4802();
   }

   @Override
   public void method10805() {
      if (--this.field16913 <= 0) {
         this.field16913 = 10;
         this.field16912.method4808();
      }
   }
}
