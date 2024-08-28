package mapped;

import com.mojang.text2speech.Narrator;
import java.util.UUID;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class6688 implements Class6687 {
   public static final ITextComponent field29300 = StringTextComponent.EMPTY;
   private static final Logger field29301 = LogManager.getLogger();
   public static final Class6688 field29302 = new Class6688();
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

   public void method20401(String var1) {
      Class1911 var4 = method20402();
      if (this.field29303.active() && var4 != Class1911.field11267 && var4 != Class1911.field11269 && !var1.isEmpty()) {
         this.field29303.clear();
         this.method20403(true, var1);
      }
   }

   private static Class1911 method20402() {
      return Minecraft.getInstance().field1299.field44675;
   }

   private void method20403(boolean var1, String var2) {
      if (SharedConstants.field42545) {
         field29301.debug("Narrating: {}", var2.replaceAll("\n", "\\\\n"));
      }

      this.field29303.say(var2, var1);
   }

   public void method20404(Class1911 var1) {
      this.method20406();
      this.field29303.say(new TranslationTextComponent("options.narrator").appendString(" : ").append(var1.method8190()).getString(), true);
      Class1264 var4 = Minecraft.getInstance().method1566();
      if (!this.field29303.active()) {
         Class7603.method24907(
            var4, Class1906.field11196, new TranslationTextComponent("narrator.toast.disabled"), new TranslationTextComponent("options.narrator.notavailable")
         );
      } else if (var1 != Class1911.field11267) {
         Class7603.method24907(var4, Class1906.field11196, new TranslationTextComponent("narrator.toast.enabled"), var1.method8190());
      } else {
         Class7603.method24907(var4, Class1906.field11196, new TranslationTextComponent("narrator.toast.disabled"), (ITextComponent)null);
      }
   }

   public boolean method20405() {
      return this.field29303.active();
   }

   public void method20406() {
      if (method20402() != Class1911.field11267 && this.field29303.active()) {
         this.field29303.clear();
      }
   }

   public void method20407() {
      this.field29303.destroy();
   }
}
