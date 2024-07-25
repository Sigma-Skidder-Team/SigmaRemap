package remapped;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import java.util.Map;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

public class class_2374 implements class_7912 {
   private static String[] field_11874;
   private final GameProfile field_11877;
   private final class_4639 field_11876;
   private final StringTextComponent field_11875;

   public class_2374(GameProfile var1) {
      this.field_11877 = var1;
      MinecraftClient var4 = MinecraftClient.getInstance();
      Map var5 = var4.method_8557().method_44310(var1);
      if (!var5.containsKey(Type.SKIN)) {
         this.field_11876 = class_1512.method_6921(class_704.method_3242(var1));
      } else {
         this.field_11876 = var4.method_8557().method_44311((MinecraftProfileTexture)var5.get(Type.SKIN), Type.SKIN);
      }

      this.field_11875 = new StringTextComponent(var1.getName());
   }

   @Override
   public void method_35792(class_3421 var1) {
      MinecraftClient.getInstance().method_8614().method_4813(new class_6404(this.field_11877.getId()));
   }

   @Override
   public ITextComponent method_35794() {
      return this.field_11875;
   }

   @Override
   public void method_35795(class_7966 var1, float var2, int var3) {
      MinecraftClient.getInstance().method_8577().method_35674(this.field_11876);
      class_3542.method_16480(1.0F, 1.0F, 1.0F, (float)var3 / 255.0F);
      class_2089.method_9780(var1, 2, 2, 12, 12, 8.0F, 8.0F, 8, 8, 64, 64);
      class_2089.method_9780(var1, 2, 2, 12, 12, 40.0F, 8.0F, 8, 8, 64, 64);
   }

   @Override
   public boolean method_35793() {
      return true;
   }
}
