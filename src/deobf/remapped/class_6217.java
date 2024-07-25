package remapped;

import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_6217 extends class_8704 {
   private class_5734 field_31754;

   public class_6217(class_7762 var1, class_7522 var2, class_5645 var3) {
      super(var1, var2, var3, 8);
      this.method_39961(10);
   }

   @Override
   public void method_39967(class_9359 var1) {
      if (var1.method_45509().getString().equals(this.method_28433().method_1674())) {
         this.field_31754 = var1.method_37258(new class_5734());
      }

      super.method_39967(var1);
   }

   @Override
   public ITextComponent method_39948(SocketAddress var1, GameProfile var2) {
      return (ITextComponent)(var2.getName().equalsIgnoreCase(this.method_28433().method_1674()) && this.method_39993(var2.getName()) != null
         ? new TranslationTextComponent("multiplayer.disconnect.name_taken")
         : super.method_39948(var1, var2));
   }

   public class_7762 method_28433() {
      return (class_7762)super.method_39974();
   }

   @Override
   public class_5734 method_39949() {
      return this.field_31754;
   }
}
