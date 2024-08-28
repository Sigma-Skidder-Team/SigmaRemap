package mapped;

import com.mojang.authlib.GameProfile;
import java.util.UUID;
import org.apache.commons.lang3.StringUtils;

public class Class3345 extends Class3343 {
   public Class3345(Class7929 var1) {
      super(Class2136.field13991, var1);
   }

   @Override
   public void method11563(Class1655 var1, BlockPos var2, Class7380 var3, Class880 var4, Class8848 var5) {
      super.method11563(var1, var2, var3, var4, var5);
      Class944 var8 = var1.method6759(var2);
      if (var8 instanceof Class968) {
         Class968 var9 = (Class968)var8;
         GameProfile var10 = null;
         if (var5.method32141()) {
            Class39 var11 = var5.method32142();
            if (!var11.method119("SkullOwner", 10)) {
               if (var11.method119("SkullOwner", 8) && !StringUtils.isBlank(var11.method126("SkullOwner"))) {
                  var10 = new GameProfile((UUID)null, var11.method126("SkullOwner"));
               }
            } else {
               var10 = Class8354.method29278(var11.method130("SkullOwner"));
            }
         }

         var9.method4006(var10);
      }
   }
}
