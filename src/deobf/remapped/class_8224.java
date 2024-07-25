package remapped;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.function.Supplier;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_8224 extends class_8374<class_9662> {
   private static final Logger field_42216 = LogManager.getLogger();
   private static final DateFormat field_42215 = new SimpleDateFormat();
   private static final class_4639 field_42213 = new class_4639("textures/misc/unknown_server.png");
   private static final class_4639 field_42214 = new class_4639("textures/gui/world_selection.png");
   private static final ITextComponent field_42221 = new TranslationTextComponent("selectWorld.tooltip.fromNewerVersion1").mergeStyle(TextFormatting.RED);
   private static final ITextComponent field_42219 = new TranslationTextComponent("selectWorld.tooltip.fromNewerVersion2").mergeStyle(TextFormatting.RED);
   private static final ITextComponent field_42222 = new TranslationTextComponent("selectWorld.tooltip.snapshot1").mergeStyle(TextFormatting.GOLD);
   private static final ITextComponent field_42223 = new TranslationTextComponent("selectWorld.tooltip.snapshot2").mergeStyle(TextFormatting.GOLD);
   private static final ITextComponent field_42218 = new TranslationTextComponent("selectWorld.locked").mergeStyle(TextFormatting.RED);
   private final class_7899 field_42220;
   private List<class_460> field_42217;

   public class_8224(class_7899 var1, class_1893 var2, int var3, int var4, int var5, int var6, int var7, Supplier<String> var8, class_8224 var9) {
      super(var2, var3, var4, var5, var6, var7);
      this.field_42220 = var1;
      if (var9 != null) {
         this.field_42217 = var9.field_42217;
      }

      this.method_37658(var8, false);
   }

   public void method_37658(Supplier<String> var1, boolean var2) {
      this.method_36192();
      class_9663 var5 = this.field_40883.method_8591();
      if (this.field_42217 == null || var2) {
         try {
            this.field_42217 = var5.method_44631();
         } catch (class_4031 var9) {
            field_42216.error("Couldn't load level list", var9);
            this.field_40883
               .method_8609(new class_3831(new TranslationTextComponent("selectWorld.unable_to_load"), new StringTextComponent(var9.getMessage())));
            return;
         }

         Collections.sort(this.field_42217);
      }

      if (this.field_42217.isEmpty()) {
         this.field_40883.method_8609(class_6577.method_30058((class_266)null));
      } else {
         String var6 = ((String)var1.get()).toLowerCase(Locale.ROOT);

         for (class_460 var8 : this.field_42217) {
            if (var8.method_2206().toLowerCase(Locale.ROOT).contains(var6) || var8.method_2203().toLowerCase(Locale.ROOT).contains(var6)) {
               this.method_36202(new class_9662(this, this, var8));
            }
         }
      }
   }

   @Override
   public int method_36191() {
      return super.method_36191() + 20;
   }

   @Override
   public int method_36195() {
      return super.method_36195() + 50;
   }

   @Override
   public boolean method_36221() {
      return this.field_42220.method_41185() == this;
   }

   public void method_37648(class_9662 var1) {
      super.method_36197(var1);
      if (var1 != null) {
         class_460 var4 = class_9662.method_44604(var1);
         class_7542.field_38482
            .method_34341(
               new TranslationTextComponent(
                     "narrator.select",
                     new TranslationTextComponent(
                        "narrator.select.world",
                        var4.method_2206(),
                        new Date(var4.method_2210()),
                        !var4.method_2197()
                           ? new TranslationTextComponent("gameMode." + var4.method_2211().method_21588())
                           : new TranslationTextComponent("gameMode.hardcore"),
                        !var4.method_2200() ? StringTextComponent.EMPTY : new TranslationTextComponent("selectWorld.cheats"),
                        var4.method_2207()
                     )
                  )
                  .getString()
            );
      }

      this.field_42220.method_35707(var1 != null && !class_9662.method_44604(var1).method_2208());
   }

   @Override
   public void method_36206(class_792 var1) {
      this.method_36219(var1, var0 -> !class_9662.method_44604(var0).method_2208());
   }

   public Optional<class_9662> method_37647() {
      return Optional.<class_9662>ofNullable(this.method_36226());
   }

   public class_7899 method_37656() {
      return this.field_42220;
   }
}
