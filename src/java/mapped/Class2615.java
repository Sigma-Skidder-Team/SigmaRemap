package mapped;

import net.minecraft.entity.player.PlayerEntity;

public class Class2615 extends Class2612 {
   private static String[] field16880;
   private final Class1043 field16889;

   public Class2615(Class1043 var1) {
      super(var1, PlayerEntity.class, 8.0F);
      this.field16889 = var1;
   }

   @Override
   public boolean method10803() {
      if (!this.field16889.method4741()) {
         return false;
      } else {
         this.field16882 = this.field16889.method4740();
         return true;
      }
   }
}
