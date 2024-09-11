package mapped;

import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.entity.player.ServerPlayerEntity;

import java.util.Collection;
import java.util.List;

public class Class6204 implements Class6205 {
   private static String[] field27686;
   private final Class8429 field27687;

   public Class6204(Class8429 var1) {
      this.field27687 = var1;
   }

   @Override
   public Collection<GameProfile> method19110(Class6619 var1) throws CommandSyntaxException {
      List<ServerPlayerEntity> var4 = this.field27687.method29620(var1);
      if (var4.isEmpty()) {
         throw Class8700.field39264.create();
      } else {
         List<GameProfile> var5 = Lists.newArrayList();

         for (ServerPlayerEntity var7 : var4) {
            var5.add(var7.getGameProfile());
         }

         return var5;
      }
   }
}
