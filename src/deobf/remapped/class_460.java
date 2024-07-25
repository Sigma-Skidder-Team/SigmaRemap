package remapped;

import java.io.File;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.commons.lang3.StringUtils;

public class class_460 implements Comparable<class_460> {
   private final class_6292 field_1916;
   private final class_4922 field_1912;
   private final String field_1913;
   private final boolean field_1910;
   private final boolean field_1914;
   private final File field_1915;
   private ITextComponent field_1911;

   public class_460(class_6292 var1, class_4922 var2, String var3, boolean var4, boolean var5, File var6) {
      this.field_1916 = var1;
      this.field_1912 = var2;
      this.field_1913 = var3;
      this.field_1914 = var5;
      this.field_1915 = var6;
      this.field_1910 = var4;
   }

   public String method_2203() {
      return this.field_1913;
   }

   public String method_2206() {
      return !StringUtils.isEmpty(this.field_1916.method_28716()) ? this.field_1916.method_28716() : this.field_1913;
   }

   public File method_2196() {
      return this.field_1915;
   }

   public boolean method_2199() {
      return this.field_1910;
   }

   public long method_2210() {
      return this.field_1912.method_22544();
   }

   public int compareTo(class_460 var1) {
      if (this.field_1912.method_22544() >= var1.field_1912.method_22544()) {
         return this.field_1912.method_22544() <= var1.field_1912.method_22544() ? this.field_1913.compareTo(var1.field_1913) : -1;
      } else {
         return 1;
      }
   }

   public GameType method_2211() {
      return this.field_1916.method_28720();
   }

   public boolean method_2197() {
      return this.field_1916.method_28712();
   }

   public boolean method_2200() {
      return this.field_1916.method_28719();
   }

   public IFormattableTextComponent method_2207() {
      return (IFormattableTextComponent)(!class_6660.method_30576(this.field_1912.method_22545())
         ? new StringTextComponent(this.field_1912.method_22545())
         : new TranslationTextComponent("selectWorld.versionUnknown"));
   }

   public class_4922 method_2198() {
      return this.field_1912;
   }

   public boolean method_2204() {
      return this.method_2201() || !class_7665.method_34674().isStable() && !this.field_1912.method_22542() || this.method_2209();
   }

   public boolean method_2201() {
      return this.field_1912.method_22543() > class_7665.method_34674().getWorldVersion();
   }

   public boolean method_2209() {
      return this.field_1912.method_22543() < class_7665.method_34674().getWorldVersion();
   }

   public boolean method_2208() {
      return this.field_1914;
   }

   public ITextComponent method_2205() {
      if (this.field_1911 == null) {
         this.field_1911 = this.method_2212();
      }

      return this.field_1911;
   }

   private ITextComponent method_2212() {
      if (!this.method_2208()) {
         if (!this.method_2199()) {
            Object var3 = !this.method_2197()
               ? new TranslationTextComponent("gameMode." + this.method_2211().getName())
               : new StringTextComponent("").append(new TranslationTextComponent("gameMode.hardcore").mergeStyle(TextFormatting.DARK_RED));
            if (this.method_2200()) {
               ((IFormattableTextComponent)var3).appendString(", ").append(new TranslationTextComponent("selectWorld.cheats"));
            }

            IFormattableTextComponent var4 = this.method_2207();
            IFormattableTextComponent var5 = new StringTextComponent(", ").append(new TranslationTextComponent("selectWorld.version")).appendString(" ");
            if (!this.method_2204()) {
               var5.append(var4);
            } else {
               var5.append(var4.mergeStyle(!this.method_2201() ? TextFormatting.ITALIC : TextFormatting.RED));
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
