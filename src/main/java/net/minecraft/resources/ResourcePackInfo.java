package net.minecraft.resources;

import com.mojang.brigadier.arguments.StringArgumentType;
import java.io.IOException;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;

import mapped.*;
import net.minecraft.resources.data.PackMetadataSection;
import net.minecraft.util.SharedConstants;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextComponentUtils;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.util.text.event.HoverEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ResourcePackInfo implements AutoCloseable {
   private static final Logger field9760 = LogManager.getLogger();
   private static final PackMetadataSection field9761 = new PackMetadataSection(
      new TranslationTextComponent("resourcePack.broken_assets").mergeStyle(new TextFormatting[]{TextFormatting.RED, TextFormatting.ITALIC}),
      SharedConstants.getVersion().getPackVersion()
   );
   private final String field9762;
   private final Supplier<IResourcePack> field9763;
   private final ITextComponent field9764;
   private final ITextComponent field9765;
   private final Class2064 field9766;
   private final Priority field9767;
   private final boolean field9768;
   private final boolean field9769;
   private final IPackNameDecorator field9770;

   @Nullable
   public static ResourcePackInfo createResourcePack(String var0, boolean var1, Supplier<IResourcePack> var2, Class9325 var3, Priority var4, IPackNameDecorator var5) {
      try (IResourcePack var8 = (IResourcePack)var2.get()) {
         PackMetadataSection var10 = var8.<PackMetadataSection>getMetadata(PackMetadataSection.field29661);
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

   public ResourcePackInfo(
      String var1,
      boolean var2,
      Supplier<IResourcePack> var3,
      ITextComponent var4,
      ITextComponent var5,
      Class2064 var6,
      Priority var7,
      boolean var8,
      IPackNameDecorator var9
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

   public ResourcePackInfo(String var1, boolean var2, Supplier<IResourcePack> var3, IResourcePack var4, PackMetadataSection var5, Priority var6, IPackNameDecorator var7) {
      this(var1, var2, var3, new StringTextComponent(var4.getName()), var5.method20752(), Class2064.method8721(var5.getPackFormat()), var6, false, var7);
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
                     new HoverEvent(HoverEvent.Action.SHOW_TEXT, new StringTextComponent("").append(this.field9764).appendString("\n").append(this.field9765))
                  )
         );
   }

   public Class2064 getCompatibility() {
      return this.field9766;
   }

   public IResourcePack getResourcePack() {
      return this.field9763.get();
   }

   public String getName() {
      return this.field9762;
   }

   public boolean isAlwaysEnabled() {
      return this.field9768;
   }

   public boolean isOrderLocked() {
      return this.field9769;
   }

   public Priority method7954() {
      return this.field9767;
   }

   public IPackNameDecorator method7955() {
      return this.field9770;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 instanceof ResourcePackInfo) {
            ResourcePackInfo var4 = (ResourcePackInfo)var1;
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

   public enum Priority {
      field12829,
      field12830;

      private static final Priority[] field12831 = new Priority[]{field12829, field12830};

      public <T> int method8249(List<T> var1, T var2, Function<T, ResourcePackInfo> var3, boolean var4) {
         Priority var7 = !var4 ? this : this.method8250();
         if (var7 != field12830) {
            int var10;
            for (var10 = var1.size() - 1; var10 >= 0; var10--) {
               ResourcePackInfo var11 = (ResourcePackInfo)var3.apply(var1.get(var10));
               if (!var11.isOrderLocked() || var11.method7954() != this) {
                  break;
               }
            }

            var1.add(var10 + 1, var2);
            return var10 + 1;
         } else {
            int var8;
            for (var8 = 0; var8 < var1.size(); var8++) {
               ResourcePackInfo var9 = (ResourcePackInfo)var3.apply(var1.get(var8));
               if (!var9.isOrderLocked() || var9.method7954() != this) {
                  break;
               }
            }

            var1.add(var8, var2);
            return var8;
         }
      }

      public Priority method8250() {
         return this != field12829 ? field12829 : field12830;
      }
   }
}
