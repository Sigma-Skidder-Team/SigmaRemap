package mapped;

import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.Objects;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.commons.lang3.ArrayUtils;

public class Class5113 implements Class5112 {
   private boolean field23256;
   private boolean field23257;
   private long field23258;
   public final NetworkManager field23259;
   public final ServerData field23260;
   public final Runnable field23261;
   public final Class9118 field23262;

   public Class5113(Class9118 var1, NetworkManager var2, ServerData var3, Runnable var4) {
      this.field23262 = var1;
      this.field23259 = var2;
      this.field23260 = var3;
      this.field23261 = var4;
   }

   @Override
   public void method15688(Class5552 var1) {
      if (!this.field23257) {
         this.field23257 = true;
         Class8783 var4 = var1.method17468();
         if (var4.method31700() == null) {
            this.field23260.field33191 = StringTextComponent.EMPTY;
         } else {
            this.field23260.field33191 = var4.method31700();
         }

         if (var4.method31704() == null) {
            this.field23260.field33194 = new TranslationTextComponent("multiplayer.status.old");
            this.field23260.field33193 = 0;
         } else {
            this.field23260.field33194 = new StringTextComponent(var4.method31704().method34704());
            this.field23260.field33193 = var4.method31704().method34705();
         }

         if (var4.method31702() == null) {
            this.field23260.field33190 = new TranslationTextComponent("multiplayer.status.unknown").mergeStyle(TextFormatting.DARK_GRAY);
         } else {
            this.field23260.field33190 = Class9118.method34008(var4.method31702().method38377(), var4.method31702().method38376());
            ArrayList var5 = Lists.newArrayList();
            if (ArrayUtils.isNotEmpty(var4.method31702().method38378())) {
               for (GameProfile var9 : var4.method31702().method38378()) {
                  var5.add(new StringTextComponent(var9.getName()));
               }

               if (var4.method31702().method38378().length < var4.method31702().method38377()) {
                  var5.add(
                     new TranslationTextComponent("multiplayer.status.and_more", var4.method31702().method38377() - var4.method31702().method38378().length)
                  );
               }

               this.field23260.field33196 = var5;
            }
         }

         String var10 = null;
         if (var4.method31707() != null) {
            String var11 = var4.method31707();
            if (!var11.startsWith("data:image/png;base64,")) {
               Class9118.method34009().error("Invalid server icon (unknown format)");
            } else {
               var10 = var11.substring("data:image/png;base64,".length());
            }
         }

         if (!Objects.equals(var10, this.field23260.method25580())) {
            this.field23260.method25581(var10);
            this.field23261.run();
         }

         this.field23258 = Util.milliTime();
         this.field23259.sendPacket(new Class5587(this.field23258));
         this.field23256 = true;
      } else {
         this.field23259.method30701(new TranslationTextComponent("multiplayer.status.unrequested"));
      }
   }

   @Override
   public void method15689(Class5489 var1) {
      long var4 = this.field23258;
      long var6 = Util.milliTime();
      this.field23260.field33192 = var6 - var4;
      this.field23259.method30701(new TranslationTextComponent("multiplayer.status.finished"));
   }

   @Override
   public void method15588(ITextComponent var1) {
      if (!this.field23256) {
         Class9118.method34009().error("Can't ping {}: {}", this.field23260.field33189, var1.getString());
         this.field23260.field33191 = new TranslationTextComponent("multiplayer.status.cannot_connect").mergeStyle(TextFormatting.DARK_RED);
         this.field23260.field33190 = StringTextComponent.EMPTY;
         Class9118.method34010(this.field23262, this.field23260);
      }
   }

   @Override
   public NetworkManager getNetworkManager() {
      return this.field23259;
   }
}
