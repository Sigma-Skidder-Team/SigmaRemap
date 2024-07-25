package remapped;

import com.mojang.brigadier.arguments.StringArgumentType;
import java.io.IOException;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextComponentUtils;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.util.text.event.HoverEvent;
import net.minecraft.util.text.event.HoverEvent$class_48;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_5522 implements AutoCloseable {
   private static final Logger field_28098 = LogManager.getLogger();
   private static final class_975 field_28107 = new class_975(
      new TranslationTextComponent("resourcePack.broken_assets").mergeStyle(new TextFormatting[]{TextFormatting.RED, TextFormatting.ITALIC}),
      class_7665.method_34674().getPackVersion()
   );
   private final String field_28106;
   private final Supplier<class_8169> field_28100;
   private final ITextComponent field_28105;
   private final ITextComponent field_28099;
   private final class_2057 field_28103;
   private final class_1154 field_28102;
   private final boolean field_28108;
   private final boolean field_28104;
   private final class_2541 field_28097;

   @Nullable
   public static class_5522 method_25028(String var0, boolean var1, Supplier<class_8169> var2, class_7953 var3, class_1154 var4, class_2541 var5) {
      try (class_8169 var8 = (class_8169)var2.get()) {
         class_975 var10 = var8.<class_975>method_37469(class_975.field_4998);
         if (var1 && var10 == null) {
            field_28098.error(
               "Broken/missing pack.mcmeta detected, fudging it into existance. Please check that your launcher has downloaded all assets for the game correctly!"
            );
            var10 = field_28107;
         }

         if (var10 != null) {
            return var3.method_35991(var0, var1, var2, var8, var10, var4, var5);
         }

         field_28098.warn("Couldn't find pack meta for pack {}", var0);
      } catch (IOException var24) {
         field_28098.warn("Couldn't get pack info for: {}", var24.toString());
      }

      return null;
   }

   public class_5522(
      String var1,
      boolean var2,
      Supplier<class_8169> var3,
      ITextComponent var4,
      ITextComponent var5,
      class_2057 var6,
      class_1154 var7,
      boolean var8,
      class_2541 var9
   ) {
      this.field_28106 = var1;
      this.field_28100 = var3;
      this.field_28105 = var4;
      this.field_28099 = var5;
      this.field_28103 = var6;
      this.field_28108 = var2;
      this.field_28102 = var7;
      this.field_28104 = var8;
      this.field_28097 = var9;
   }

   public class_5522(String var1, boolean var2, Supplier<class_8169> var3, class_8169 var4, class_975 var5, class_1154 var6, class_2541 var7) {
      this(var1, var2, var3, new StringTextComponent(var4.method_37470()), var5.method_4266(), class_2057.method_9601(var5.method_4267()), var6, false, var7);
   }

   public ITextComponent method_25033() {
      return this.field_28105;
   }

   public ITextComponent method_25026() {
      return this.field_28099;
   }

   public ITextComponent method_25030(boolean var1) {
      return TextComponentUtils.wrapWithSquareBrackets(this.field_28097.method_11573(new StringTextComponent(this.field_28106)))
         .modifyStyle(
            var2 -> var2.setFormatting(!var1 ? TextFormatting.RED : TextFormatting.GREEN)
                  .setInsertion(StringArgumentType.escapeIfRequired(this.field_28106))
                  .setHoverEvent(
                     new HoverEvent(
                        HoverEvent$class_48.SHOW_TEXT, new StringTextComponent("").append(this.field_28105).appendString("\n").append(this.field_28099)
                     )
                  )
         );
   }

   public class_2057 method_25022() {
      return this.field_28103;
   }

   public class_8169 method_25032() {
      return this.field_28100.get();
   }

   public String method_25023() {
      return this.field_28106;
   }

   public boolean method_25024() {
      return this.field_28108;
   }

   public boolean method_25029() {
      return this.field_28104;
   }

   public class_1154 method_25031() {
      return this.field_28102;
   }

   public class_2541 method_25025() {
      return this.field_28097;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 instanceof class_5522) {
            class_5522 var4 = (class_5522)var1;
            return this.field_28106.equals(var4.field_28106);
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      return this.field_28106.hashCode();
   }

   @Override
   public void close() {
   }
}
