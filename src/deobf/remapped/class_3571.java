package remapped;

import com.mojang.authlib.GameProfile;
import java.util.UUID;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.commons.lang3.StringUtils;

public class class_3571 extends class_741 {
   public class_3571(class_6414 var1, class_6414 var2, class_317 var3) {
      super(var1, var2, var3);
   }

   @Override
   public ITextComponent method_11249(ItemStack var1) {
      if (var1.method_27960() == class_4897.field_24749 && var1.method_28002()) {
         String var4 = null;
         class_5734 var5 = var1.method_27990();
         if (!var5.method_25939("SkullOwner", 8)) {
            if (var5.method_25939("SkullOwner", 10)) {
               class_5734 var6 = var5.method_25937("SkullOwner");
               if (var6.method_25939("Name", 8)) {
                  var4 = var6.method_25965("Name");
               }
            }
         } else {
            var4 = var5.method_25965("SkullOwner");
         }

         if (var4 != null) {
            return new TranslationTextComponent(this.method_11216() + ".named", var4);
         }
      }

      return super.method_11249(var1);
   }

   @Override
   public boolean method_11215(class_5734 var1) {
      super.method_11215(var1);
      if (var1.method_25939("SkullOwner", 8) && !StringUtils.isBlank(var1.method_25965("SkullOwner"))) {
         GameProfile var4 = new GameProfile((UUID)null, var1.method_25965("SkullOwner"));
         var4 = class_4797.method_22108(var4);
         var1.method_25946("SkullOwner", class_4338.method_20177(new class_5734(), var4));
         return true;
      } else {
         return false;
      }
   }
}
