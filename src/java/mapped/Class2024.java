package mapped;

import net.minecraft.util.text.*;
import net.minecraft.world.GameType;
import org.apache.commons.lang3.StringUtils;

import java.io.File;

public class Class2024 implements Comparable<Class2024> {
   private final WorldSettings field13143;
   private final Class8519 field13144;
   private final String field13145;
   private final boolean field13146;
   private final boolean field13147;
   private final File field13148;
   private ITextComponent field13149;

   public Class2024(WorldSettings var1, Class8519 var2, String var3, boolean var4, boolean var5, File var6) {
      this.field13143 = var1;
      this.field13144 = var2;
      this.field13145 = var3;
      this.field13147 = var5;
      this.field13148 = var6;
      this.field13146 = var4;
   }

   public String method8643() {
      return this.field13145;
   }

   public String method8644() {
      return !StringUtils.isEmpty(this.field13143.method32426()) ? this.field13143.method32426() : this.field13145;
   }

   public File method8645() {
      return this.field13148;
   }

   public boolean method8646() {
      return this.field13146;
   }

   public long method8647() {
      return this.field13144.method30183();
   }

   public int compareTo(Class2024 var1) {
      if (this.field13144.method30183() >= var1.field13144.method30183()) {
         return this.field13144.method30183() <= var1.field13144.method30183() ? this.field13145.compareTo(var1.field13145) : -1;
      } else {
         return 1;
      }
   }

   public GameType method8648() {
      return this.field13143.method32427();
   }

   public boolean method8649() {
      return this.field13143.method32428();
   }

   public boolean method8650() {
      return this.field13143.method32430();
   }

   public IFormattableTextComponent method8651() {
      return (IFormattableTextComponent)(!Class9001.method33256(this.field13144.method30184())
         ? new StringTextComponent(this.field13144.method30184())
         : new TranslationTextComponent("selectWorld.versionUnknown"));
   }

   public Class8519 method8652() {
      return this.field13144;
   }

   public boolean method8653() {
      return this.method8654() || !SharedConstants.getVersion().isStable() && !this.field13144.method30186() || this.method8655();
   }

   public boolean method8654() {
      return this.field13144.method30185() > SharedConstants.getVersion().getWorldVersion();
   }

   public boolean method8655() {
      return this.field13144.method30185() < SharedConstants.getVersion().getWorldVersion();
   }

   public boolean method8656() {
      return this.field13147;
   }

   public ITextComponent method8657() {
      if (this.field13149 == null) {
         this.field13149 = this.method8658();
      }

      return this.field13149;
   }

   private ITextComponent method8658() {
      if (!this.method8656()) {
         if (!this.method8646()) {
            Object var3 = !this.method8649()
               ? new TranslationTextComponent("gameMode." + this.method8648().method8153())
               : new StringTextComponent("").append(new TranslationTextComponent("gameMode.hardcore").mergeStyle(TextFormatting.DARK_RED));
            if (this.method8650()) {
               ((IFormattableTextComponent)var3).appendString(", ").append(new TranslationTextComponent("selectWorld.cheats"));
            }

            IFormattableTextComponent var4 = this.method8651();
            IFormattableTextComponent var5 = new StringTextComponent(", ").append(new TranslationTextComponent("selectWorld.version")).appendString(" ");
            if (!this.method8653()) {
               var5.append(var4);
            } else {
               var5.append(var4.mergeStyle(!this.method8654() ? TextFormatting.ITALIC : TextFormatting.RED));
            }

            ((IFormattableTextComponent)var3).append(var5);
            return (ITextComponent)var3;
         } else {
            return new TranslationTextComponent("selectWorld.conversion");
         }
      } else {
         return new TranslationTextComponent("selectWorld.locked").mergeStyle(TextFormatting.RED);
      }
   }
}
