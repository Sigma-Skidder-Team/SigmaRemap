package mapped;

import com.google.common.collect.ImmutableSet;
import com.mojang.authlib.GameProfile;

import java.util.Set;

public class Class147 extends Class128 {
   private final Class2063 field490;

   public Class147(Class122[] var1, Class2063 var2) {
      super(var1);
      this.field490 = var2;
   }

   @Override
   public Class7128 method368() {
      return Class8585.field38636;
   }

   @Override
   public Set<Class9821<?>> method355() {
      return ImmutableSet.of(this.field490.method8717());
   }

   @Override
   public ItemStack method371(ItemStack var1, Class7812 var2) {
      if (var1.method32107() == Class8514.field38060) {
         Entity var5 = var2.method26081(this.field490.method8717());
         if (var5 instanceof PlayerEntity) {
            GameProfile var6 = ((PlayerEntity)var5).getGameProfile();
            var1.method32143().method99("SkullOwner", Class8354.method29279(new Class39(), var6));
         }
      }

      return var1;
   }

   // $VF: synthetic method
   public static Class2063 method450(Class147 var0) {
      return var0.field490;
   }
}
