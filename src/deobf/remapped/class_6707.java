package remapped;

import com.google.common.collect.Maps;
import com.google.common.hash.Hashing;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_6707 extends class_266 {
   private static final Logger field_34642 = LogManager.getLogger();
   private static final ITextComponent field_34641 = new TranslationTextComponent("pack.dropInfo").mergeStyle(TextFormatting.GRAY);
   private static final ITextComponent field_34643 = new TranslationTextComponent("pack.folderInfo");
   private static final class_4639 field_34649 = new class_4639("textures/misc/unknown_pack.png");
   private final class_5655 field_34640;
   private final class_266 field_34644;
   private class_1515 field_34647;
   private long field_34645;
   private class_895 field_34637;
   private class_895 field_34646;
   private final File field_34648;
   private class_9521 field_34636;
   private final Map<String, class_4639> field_34638 = Maps.newHashMap();

   public class_6707(class_266 var1, class_6354 var2, Consumer<class_6354> var3, File var4, ITextComponent var5) {
      super(var5);
      this.field_34644 = var1;
      this.field_34640 = new class_5655(this::method_30762, this::method_30760, var2, var3);
      this.field_34648 = var4;
      this.field_34647 = class_1515.method_6929(var4);
   }

   @Override
   public void method_1156() {
      this.field_34640.method_25582();
      this.field_943.method_8609(this.field_34644);
      this.method_30757();
   }

   private void method_30757() {
      if (this.field_34647 != null) {
         try {
            this.field_34647.close();
            this.field_34647 = null;
         } catch (Exception var4) {
         }
      }
   }

   @Override
   public void method_1163() {
      this.field_34636 = this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 + 4, this.field_940 - 48, 150, 20, class_1402.field_7625, var1 -> this.method_1156())
      );
      this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 - 154,
            this.field_940 - 48,
            150,
            20,
            new TranslationTextComponent("pack.openFolder"),
            var1 -> Util.getOperatingSystem().method_37578(this.field_34648),
            (var1, var2, var3, var4) -> this.method_1176(var2, field_34643, var3, var4)
         )
      );
      this.field_34637 = new class_895(this.field_943, 200, this.field_940, new TranslationTextComponent("pack.available.title"));
      this.field_34637.method_36212(this.field_941 / 2 - 4 - 200);
      this.field_942.add(this.field_34637);
      this.field_34646 = new class_895(this.field_943, 200, this.field_940, new TranslationTextComponent("pack.selected.title"));
      this.field_34646.method_36212(this.field_941 / 2 + 4);
      this.field_942.add(this.field_34646);
      this.method_30764();
   }

   @Override
   public void method_5312() {
      if (this.field_34647 != null) {
         try {
            if (this.field_34647.method_6930()) {
               this.field_34645 = 20L;
            }
         } catch (IOException var4) {
            field_34642.warn("Failed to poll for directory {} changes, stopping", this.field_34648);
            this.method_30757();
         }
      }

      if (this.field_34645 > 0L && --this.field_34645 == 0L) {
         this.method_30764();
      }
   }

   private void method_30762() {
      this.method_30759(this.field_34646, this.field_34640.method_25579());
      this.method_30759(this.field_34637, this.field_34640.method_25585());
      this.field_34636.field_36675 = !this.field_34646.method_41183().isEmpty();
   }

   private void method_30759(class_895 var1, Stream<class_3178> var2) {
      var1.method_41183().clear();
      var2.forEach(var2x -> var1.method_41183().add(new class_6635(this.field_943, var1, this, var2x)));
   }

   private void method_30764() {
      this.field_34640.method_25583();
      this.method_30762();
      this.field_34645 = 0L;
      this.field_34638.clear();
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1170(0);
      this.field_34637.method_6767(var1, var2, var3, var4);
      this.field_34646.method_6767(var1, var2, var3, var4);
      method_9788(var1, this.field_948, this.field_947, this.field_941 / 2, 8, 16777215);
      method_9788(var1, this.field_948, field_34641, this.field_941 / 2, 20, 16777215);
      super.method_6767(var1, var2, var3, var4);
   }

   public static void method_30761(MinecraftClient var0, List<Path> var1, Path var2) {
      MutableBoolean var5 = new MutableBoolean();
      var1.forEach(var2x -> {
         try (Stream var5x = Files.walk(var2x)) {
            var5x.forEach(var3 -> {
               try {
                  Util.method_44696(var2x.getParent(), var2, var3);
               } catch (IOException var7) {
                  field_34642.warn("Failed to copy datapack file  from {} to {}", var3, var2, var7);
                  var5.setTrue();
               }
            });
         } catch (IOException var18) {
            field_34642.warn("Failed to copy datapack file from {} to {}", var2x, var2);
            var5.setTrue();
         }
      });
      if (var5.isTrue()) {
         class_4201.method_19555(var0, var2.toString());
      }
   }

   @Override
   public void method_1189(List<Path> var1) {
      String var4 = var1.stream().<Path>map(Path::getFileName).<CharSequence>map(Path::toString).collect(Collectors.joining(", "));
      this.field_943.method_8609(new class_9640(var2 -> {
         if (var2) {
            method_30761(this.field_943, var1, this.field_34648.toPath());
            this.method_30764();
         }

         this.field_943.method_8609(this);
      }, new TranslationTextComponent("pack.dropConfirm"), new StringTextComponent(var4)));
   }

   private class_4639 method_30758(class_7889 var1, class_5522 var2) {
      try (
         class_8169 var5 = var2.method_25032();
         InputStream var7 = var5.method_37465("pack.png");
      ) {
         String var9 = var2.method_25023();
         class_4639 var10 = new class_4639(
            "minecraft", "pack/" + Util.method_44678(var9, class_4639::method_21460) + "/" + Hashing.sha1().hashUnencodedChars(var9) + "/icon"
         );
         class_5797 var11 = class_5797.method_26230(var7);
         var1.method_35682(var10, new class_7884(var11));
         return var10;
      } catch (FileNotFoundException var43) {
      } catch (Exception var44) {
         field_34642.warn("Failed to load icon from pack {}", var2.method_25023(), var44);
      }

      return field_34649;
   }

   private class_4639 method_30760(class_5522 var1) {
      return this.field_34638.computeIfAbsent(var1.method_25023(), var2 -> this.method_30758(this.field_943.method_8577(), var1));
   }
}
