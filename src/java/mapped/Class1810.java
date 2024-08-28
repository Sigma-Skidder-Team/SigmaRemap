package mapped;

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
import net.minecraft.util.text.event.HoverEvent$Action;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class1810 implements AutoCloseable {
   private static final Logger field9760 = LogManager.getLogger();
   private static final Class6811 field9761 = new Class6811(
      new TranslationTextComponent("resourcePack.broken_assets").mergeStyle(new TextFormatting[]{TextFormatting.RED, TextFormatting.ITALIC}),
      Class9246.method34773().getPackVersion()
   );
   private final String field9762;
   private final Supplier<Class303> field9763;
   private final ITextComponent field9764;
   private final ITextComponent field9765;
   private final Class2064 field9766;
   private final Class1967 field9767;
   private final boolean field9768;
   private final boolean field9769;
   private final Class7725 field9770;

   @Nullable
   public static Class1810 method7945(String var0, boolean var1, Supplier<Class303> var2, Class9325 var3, Class1967 var4, Class7725 var5) {
      try (Class303 var8 = (Class303)var2.get()) {
         Class6811 var10 = var8.<Class6811>method1227(Class6811.field29661);
         if (var1 && var10 == null) {
            field9760.error(
               "Broken/missing pack.mcmeta detected, fudging it into existance. Please check that your launcher has downloaded all assets for the game correctly!"
            );
            var10 = field9761;
         }

         if (var10 != null) {
            return var3.method35244(var0, var1, var2, var8, var10, var4, var5);
         }

         field9760.warn("Couldn't find pack meta for pack {}", var0);
      } catch (IOException var24) {
         field9760.warn("Couldn't get pack info for: {}", var24.toString());
      }

      return null;
   }

   public Class1810(
      String var1,
      boolean var2,
      Supplier<Class303> var3,
      ITextComponent var4,
      ITextComponent var5,
      Class2064 var6,
      Class1967 var7,
      boolean var8,
      Class7725 var9
   ) {
      this.field9762 = var1;
      this.field9763 = var3;
      this.field9764 = var4;
      this.field9765 = var5;
      this.field9766 = var6;
      this.field9768 = var2;
      this.field9767 = var7;
      this.field9769 = var8;
      this.field9770 = var9;
   }

   public Class1810(String var1, boolean var2, Supplier<Class303> var3, Class303 var4, Class6811 var5, Class1967 var6, Class7725 var7) {
      this(var1, var2, var3, new StringTextComponent(var4.method1228()), var5.method20752(), Class2064.method8721(var5.method20753()), var6, false, var7);
   }

   public ITextComponent method7946() {
      return this.field9764;
   }

   public ITextComponent method7947() {
      return this.field9765;
   }

   public ITextComponent method7948(boolean var1) {
      return TextComponentUtils.wrapWithSquareBrackets(this.field9770.method25544(new StringTextComponent(this.field9762)))
         .modifyStyle(
            var2 -> var2.setFormatting(!var1 ? TextFormatting.RED : TextFormatting.GREEN)
                  .setInsertion(StringArgumentType.escapeIfRequired(this.field9762))
                  .setHoverEvent(
                     new HoverEvent(HoverEvent$Action.SHOW_TEXT, new StringTextComponent("").append(this.field9764).appendString("\n").append(this.field9765))
                  )
         );
   }

   public Class2064 method7949() {
      return this.field9766;
   }

   public Class303 method7950() {
      return this.field9763.get();
   }

   public String method7951() {
      return this.field9762;
   }

   public boolean method7952() {
      return this.field9768;
   }

   public boolean method7953() {
      return this.field9769;
   }

   public Class1967 method7954() {
      return this.field9767;
   }

   public Class7725 method7955() {
      return this.field9770;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 instanceof Class1810) {
            Class1810 var4 = (Class1810)var1;
            return this.field9762.equals(var4.field9762);
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      return this.field9762.hashCode();
   }

   @Override
   public void close() {
   }
}
