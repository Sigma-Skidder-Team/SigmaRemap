package mapped;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;

public class Class5818 extends Class5812 {
   private static String[] field25490;
   private final Class920 field25491;
   private final Class8202 field25492;

   public Class5818(int var1) {
      this(var1, new Class927(1), new Class8206(1));
   }

   public Class5818(int var1, Class920 var2, Class8202 var3) {
      super(Class8298.field35664, var1);
      method18122(var2, 1);
      method18123(var3, 1);
      this.field25491 = var2;
      this.field25492 = var3;
      this.method18124(new Class5862(this, var2, 0, 0, 0));
      this.method18126(var3);
   }

   @Override
   public boolean method18104(PlayerEntity var1, int var2) {
      if (var2 >= 100) {
         int var8 = var2 - 100;
         this.method18138(0, var8);
         return true;
      } else {
         switch (var2) {
            case 1:
               int var5 = this.field25492.method28505(0);
               this.method18138(0, var5 - 1);
               return true;
            case 2:
               int var6 = this.field25492.method28505(0);
               this.method18138(0, var6 + 1);
               return true;
            case 3:
               if (!var1.method2935()) {
                  return false;
               }

               ItemStack var7 = this.field25491.method3620(0);
               this.field25491.method3622();
               if (!var1.inventory.method4045(var7)) {
                  var1.method2882(var7, false);
               }

               return true;
            default:
               return false;
         }
      }
   }

   @Override
   public void method18138(int var1, int var2) {
      super.method18138(var1, var2);
      this.method18130();
   }

   @Override
   public boolean method18103(PlayerEntity var1) {
      return this.field25491.method3623(var1);
   }

   public ItemStack method18172() {
      return this.field25491.method3618(0);
   }

   public int method18173() {
      return this.field25492.method28505(0);
   }
}
