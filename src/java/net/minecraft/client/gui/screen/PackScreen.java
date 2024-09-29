package net.minecraft.client.gui.screen;

import com.google.common.collect.Maps;
import com.google.common.hash.Hashing;
import com.mojang.blaze3d.matrix.MatrixStack;
import mapped.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.client.util.Util;
import net.minecraft.resources.ResourcePackInfo;
import net.minecraft.resources.ResourcePackList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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

public class PackScreen extends Screen {
   private static final Logger field7093 = LogManager.getLogger();
   private static final ITextComponent field7094 = new TranslationTextComponent("pack.dropInfo").mergeStyle(TextFormatting.GRAY);
   private static final ITextComponent field7095 = new TranslationTextComponent("pack.folderInfo");
   private static final ResourceLocation field7096 = new ResourceLocation("textures/misc/unknown_pack.png");
   private final Class8719 field7097;
   private final Screen field7098;
   private Class1651 field7099;
   private long field7100;
   private Class1275 field7101;
   private Class1275 field7102;
   private final File field7103;
   private Button field7104;
   private final Map<String, ResourceLocation> field7105 = Maps.newHashMap();

   public PackScreen(Screen var1, ResourcePackList var2, Consumer<ResourcePackList> var3, File var4, ITextComponent var5) {
      super(var5);
      this.field7098 = var1;
      this.field7097 = new Class8719(this::method6401, this::method6406, var2, var3);
      this.field7103 = var4;
      this.field7099 = Class1651.method6638(var4);
   }

   @Override
   public void method1945() {
      this.field7097.method31450();
      this.mc.displayGuiScreen(this.field7098);
      this.method6400();
   }

   private void method6400() {
      if (this.field7099 != null) {
         try {
            this.field7099.close();
            this.field7099 = null;
         } catch (Exception var4) {
         }
      }
   }

   @Override
   public void init() {
      this.field7104 = this.<Button>addButton(
         new Button(this.width / 2 + 4, this.height - 48, 150, 20, DialogTexts.field30658, var1 -> this.method1945())
      );
      this.<Button>addButton(
         new Button(
            this.width / 2 - 154,
            this.height - 48,
            150,
            20,
            new TranslationTextComponent("pack.openFolder"),
            var1 -> Util.getOSType().openFile(this.field7103),
            (var1, var2, var3, var4) -> this.method2459(var2, field7095, var3, var4)
         )
      );
      this.field7101 = new Class1275(this.mc, 200, this.height, new TranslationTextComponent("pack.available.title"));
      this.field7101.method6035(this.width / 2 - 4 - 200);
      this.children.add(this.field7101);
      this.field7102 = new Class1275(this.mc, 200, this.height, new TranslationTextComponent("pack.selected.title"));
      this.field7102.method6035(this.width / 2 + 4);
      this.children.add(this.field7102);
      this.method6403();
   }

   @Override
   public void tick() {
      if (this.field7099 != null) {
         try {
            if (this.field7099.method6640()) {
               this.field7100 = 20L;
            }
         } catch (IOException var4) {
            field7093.warn("Failed to poll for directory {} changes, stopping", this.field7103);
            this.method6400();
         }
      }

      if (this.field7100 > 0L && --this.field7100 == 0L) {
         this.method6403();
      }
   }

   private void method6401() {
      this.method6402(this.field7102, this.field7097.method31449());
      this.method6402(this.field7101, this.field7097.method31448());
      this.field7104.active = !this.field7102.getEventListeners().isEmpty();
   }

   private void method6402(Class1275 var1, Stream<Class4681> var2) {
      var1.getEventListeners().clear();
      var2.forEach(var2x -> var1.getEventListeners().add(new Class1175(this.mc, var1, this, var2x)));
   }

   private void method6403() {
      this.field7097.method31451();
      this.method6401();
      this.field7100 = 0L;
      this.field7105.clear();
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.method2471(0);
      this.field7101.render(var1, var2, var3, var4);
      this.field7102.render(var1, var2, var3, var4);
      drawCenteredString(var1, this.font, this.title, this.width / 2, 8, 16777215);
      drawCenteredString(var1, this.font, field7094, this.width / 2, 20, 16777215);
      super.render(var1, var2, var3, var4);
   }

   public static void method6404(Minecraft var0, List<Path> var1, Path var2) {
      MutableBoolean var5 = new MutableBoolean();
      var1.forEach(var2x -> {
         try (Stream<Path> var5x = Files.walk(var2x)) {
            var5x.forEach(var3 -> {
               try {
                  Util.method38532(var2x.getParent(), var2, var3);
               } catch (IOException var7) {
                  field7093.warn("Failed to copy datapack file  from {} to {}", var3, var2, var7);
                  var5.setTrue();
               }
            });
         } catch (IOException var18) {
            field7093.warn("Failed to copy datapack file from {} to {}", var2x, var2);
            var5.setTrue();
         }
      });
      if (var5.isTrue()) {
         SystemToast.method24910(var0, var2.toString());
      }
   }

   @Override
   public void method2486(List<Path> var1) {
      String var4 = var1.stream().<Path>map(Path::getFileName).<CharSequence>map(Path::toString).collect(Collectors.joining(", "));
      this.mc.displayGuiScreen(new ConfirmScreen(var2 -> {
         if (var2) {
            method6404(this.mc, var1, this.field7103.toPath());
            this.method6403();
         }

         this.mc.displayGuiScreen(this);
      }, new TranslationTextComponent("pack.dropConfirm"), new StringTextComponent(var4)));
   }

   private ResourceLocation method6405(TextureManager var1, ResourcePackInfo var2) {
      try (
              IResourcePack var5 = var2.getResourcePack();
              InputStream var7 = var5.getRootResourceStream("pack.png");
      ) {
         String var9 = var2.getName();
         ResourceLocation var10 = new ResourceLocation(
            "minecraft", "pack/" + Util.method38533(var9, ResourceLocation::method8298) + "/" + Hashing.sha1().hashUnencodedChars(var9) + "/icon"
         );
         Class1806 var11 = Class1806.method7879(var7);
         var1.method1073(var10, new DynamicTexture(var11));
         return var10;
      } catch (FileNotFoundException var43) {
      } catch (Exception var44) {
         field7093.warn("Failed to load icon from pack {}", var2.getName(), var44);
      }

      return field7096;
   }

   private ResourceLocation method6406(ResourcePackInfo var1) {
      return this.field7105.computeIfAbsent(var1.getName(), var2 -> this.method6405(this.mc.getTextureManager(), var1));
   }

   // $VF: synthetic method
   public static Logger method6415() {
      return field7093;
   }
}
