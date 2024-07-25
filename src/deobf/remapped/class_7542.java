package remapped;

import com.mojang.text2speech.Narrator;
import java.util.UUID;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_7542 implements class_9720 {
   public static final ITextComponent field_38486 = StringTextComponent.EMPTY;
   private static final Logger field_38485 = LogManager.getLogger();
   public static final class_7542 field_38482 = new class_7542();
   private final Narrator field_38484 = Narrator.getNarrator();

   @Override
   public void method_44914(ChatType var1, ITextComponent var2, UUID var3) {
      class_4066 var6 = method_34345();
      if (var6 != class_4066.field_19800
         && this.field_38484.active()
         && (
            var6 == class_4066.field_19796
               || var6 == class_4066.field_19801 && var1 == ChatType.CHAT
               || var6 == class_4066.field_19802 && var1 == ChatType.SYSTEM
         )) {
         Object var7;
         if (var2 instanceof TranslationTextComponent && "chat.type.text".equals(((TranslationTextComponent)var2).getKey())) {
            var7 = new TranslationTextComponent("chat.type.text.narrate", ((TranslationTextComponent)var2).getFormatArgs());
         } else {
            var7 = var2;
         }

         this.method_34342(var1.getInterrupts(), ((ITextComponent)var7).getString());
      }
   }

   public void method_34341(String var1) {
      class_4066 var4 = method_34345();
      if (this.field_38484.active() && var4 != class_4066.field_19800 && var4 != class_4066.field_19801 && !var1.isEmpty()) {
         this.field_38484.clear();
         this.method_34342(true, var1);
      }
   }

   private static class_4066 method_34345() {
      return MinecraftClient.getInstance().field_9577.field_45459;
   }

   private void method_34342(boolean var1, String var2) {
      if (class_7665.field_38958) {
         field_38485.debug("Narrating: {}", var2.replaceAll("\n", "\\\\n"));
      }

      this.field_38484.say(var2, var1);
   }

   public void method_34348(class_4066 var1) {
      this.method_34347();
      this.field_38484.say(new TranslationTextComponent("options.narrator").appendString(" : ").append(var1.method_18746()).getString(), true);
      class_9184 var4 = MinecraftClient.getInstance().method_8519();
      if (!this.field_38484.active()) {
         class_4201.method_19562(
            var4, class_200.field_666, new TranslationTextComponent("narrator.toast.disabled"), new TranslationTextComponent("options.narrator.notavailable")
         );
      } else if (var1 != class_4066.field_19800) {
         class_4201.method_19562(var4, class_200.field_666, new TranslationTextComponent("narrator.toast.enabled"), var1.method_18746());
      } else {
         class_4201.method_19562(var4, class_200.field_666, new TranslationTextComponent("narrator.toast.disabled"), (ITextComponent)null);
      }
   }

   public boolean method_34346() {
      return this.field_38484.active();
   }

   public void method_34347() {
      if (method_34345() != class_4066.field_19800 && this.field_38484.active()) {
         this.field_38484.clear();
      }
   }

   public void method_34343() {
      this.field_38484.destroy();
   }
}
