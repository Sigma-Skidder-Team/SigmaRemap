package mapped;

public class Class4853 extends Class4852 {
   public Class4853(ResourceLocation var1) {
      super(
         var1,
         "",
         3,
         3,
         Class25.<Class120>method69(
            Class120.field427,
            Class120.method339(Class8514.field37899),
            Class120.method339(Class8514.field37899),
            Class120.method339(Class8514.field37899),
            Class120.method339(Class8514.field37899),
            Class120.method339(Class8514.field37955),
            Class120.method339(Class8514.field37899),
            Class120.method339(Class8514.field37899),
            Class120.method339(Class8514.field37899),
            Class120.method339(Class8514.field37899)
         ),
         new ItemStack(Class8514.field38056)
      );
   }

   @Override
   public boolean method14963(Class926 var1, World var2) {
      if (!super.method14963(var1, var2)) {
         return false;
      } else {
         ItemStack var5 = ItemStack.EMPTY;

         for (int var6 = 0; var6 < var1.method3629() && var5.method32105(); var6++) {
            ItemStack var7 = var1.method3618(var6);
            if (var7.method32107() == Class8514.field37955) {
               var5 = var7;
            }
         }

         if (!var5.method32105()) {
            Class7529 var8 = Class3316.method11861(var5, var2);
            if (var8 != null) {
               return !this.method14997(var8) ? var8.field32321 < 4 : false;
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }

   private boolean method14997(Class7529 var1) {
      if (var1.field32327 != null) {
         for (Class7982 var5 : var1.field32327.values()) {
            if (var5.method27126() == Class2223.field14524 || var5.method27126() == Class2223.field14525) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public ItemStack method14962(Class926 var1) {
      ItemStack var4 = ItemStack.EMPTY;

      for (int var5 = 0; var5 < var1.method3629() && var4.method32105(); var5++) {
         ItemStack var6 = var1.method3618(var5);
         if (var6.method32107() == Class8514.field37955) {
            var4 = var6;
         }
      }

      var4 = var4.copy();
      var4.method32180(1);
      var4.method32143().method102("map_scale_direction", 1);
      return var4;
   }

   @Override
   public boolean method14965() {
      return true;
   }

   @Override
   public Class6504<?> method14961() {
      return Class6504.field28475;
   }
}
