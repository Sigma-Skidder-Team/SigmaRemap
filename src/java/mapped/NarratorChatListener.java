package mapped;

import com.mojang.text2speech.Narrator;
import java.util.UUID;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NarratorChatListener implements Class6687 {
   public static final ITextComponent field29300 = StringTextComponent.EMPTY;
   private static final Logger field29301 = LogManager.getLogger();
   public static final NarratorChatListener INSTANCE = new NarratorChatListener();
   private final Narrator field29303 = Narrator.getNarrator();

   @Override
   public void method20400(ChatType var1, ITextComponent var2, UUID var3) {
      Class1911 var6 = method20402();
      if (var6 != Class1911.field11267
         && this.field29303.active()
         && (var6 == Class1911.field11268 || var6 == Class1911.field11269 && var1 == ChatType.CHAT || var6 == Class1911.field11270 && var1 == ChatType.SYSTEM)) {
         Object var7;
         if (var2 instanceof TranslationTextComponent && "chat.type.text".equals(((TranslationTextComponent)var2).getKey())) {
            var7 = new TranslationTextComponent("chat.type.text.narrate", ((TranslationTextComponent)var2).getFormatArgs());
         } else {
            var7 = var2;
         }

         this.method20403(var1.getInterrupts(), ((ITextComponent)var7).getString());
      }
   }

   public void say(String var1) {
      Class1911 var4 = method20402();
      if (this.field29303.active() && var4 != Class1911.field11267 && var4 != Class1911.field11269 && !var1.isEmpty()) {
         this.field29303.clear();
         this.method20403(true, var1);
      }
   }

   private static Class1911 method20402() {
      return Minecraft.getInstance().gameSettings.field44675;
   }

   private void method20403(boolean var1, String var2) {
      if (SharedConstants.developmentMode) {
         field29301.debug("Narrating: {}", var2.replaceAll("\n", "\\\\n"));
      }

      this.field29303.say(var2, var1);
   }

   public void method20404(Class1911 var1) {
      this.clear();
      this.field29303.say(new TranslationTextComponent("options.narrator").appendString(" : ").append(var1.method8190()).getString(), true);
      ToastGui var4 = Minecraft.getInstance().getToastGui();
      if (!this.field29303.active()) {
         SystemToast.method24907(
            var4, SystemToast.Type.field11196, new TranslationTextComponent("narrator.toast.disabled"), new TranslationTextComponent("options.narrator.notavailable")
         );
      } else if (var1 != Class1911.field11267) {
         SystemToast.method24907(var4, SystemToast.Type.field11196, new TranslationTextComponent("narrator.toast.enabled"), var1.method8190());
      } else {
         SystemToast.method24907(var4, SystemToast.Type.field11196, new TranslationTextComponent("narrator.toast.disabled"), (ITextComponent)null);
      }
   }

   public boolean method20405() {
      return this.field29303.active();
   }

   public void clear() {
      if (method20402() != Class1911.field11267 && this.field29303.active()) {
         this.field29303.clear();
      }
   }

   public void close() {
      this.field29303.destroy();
   }
}
