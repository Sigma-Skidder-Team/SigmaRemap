package mapped;

import com.mojang.authlib.GameProfile;
import java.util.UUID;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.commons.lang3.StringUtils;

public class Class3299 extends Class3298 {
   public Class3299(Block var1, Block var2, Class5643 var3) {
      super(var1, var2, var3);
   }

   @Override
   public ITextComponent method11731(Class8848 var1) {
      if (var1.method32107() == Class8514.field38060 && var1.method32141()) {
         String var4 = null;
         Class39 var5 = var1.method32142();
         if (!var5.method119("SkullOwner", 8)) {
            if (var5.method119("SkullOwner", 10)) {
               Class39 var6 = var5.method130("SkullOwner");
               if (var6.method119("Name", 8)) {
                  var4 = var6.method126("Name");
               }
            }
         } else {
            var4 = var5.method126("SkullOwner");
         }

         if (var4 != null) {
            return new TranslationTextComponent(this.method11719() + ".named", var4);
         }
      }

      return super.method11731(var1);
   }

   @Override
   public boolean method11705(Class39 var1) {
      super.method11705(var1);
      if (var1.method119("SkullOwner", 8) && !StringUtils.isBlank(var1.method126("SkullOwner"))) {
         GameProfile var4 = new GameProfile((UUID)null, var1.method126("SkullOwner"));
         var4 = Class968.method4008(var4);
         var1.method99("SkullOwner", Class8354.method29279(new Class39(), var4));
         return true;
      } else {
         return false;
      }
   }
}
