package remapped;

import com.mojang.datafixers.util.Pair;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_7319 extends class_9521 implements IScreen {
   public static final Identifier field_37415 = new Identifier("realms", "textures/gui/realms/slot_frame.png");
   public static final Identifier field_37418 = new Identifier("realms", "textures/gui/realms/empty_frame.png");
   public static final Identifier field_37425 = new Identifier("minecraft", "textures/gui/title/background/panorama_0.png");
   public static final Identifier field_37417 = new Identifier("minecraft", "textures/gui/title/background/panorama_2.png");
   public static final Identifier field_37422 = new Identifier("minecraft", "textures/gui/title/background/panorama_3.png");
   private static final ITextComponent field_37420 = new TranslationTextComponent("mco.configure.world.slot.tooltip.active");
   private static final ITextComponent field_37421 = new TranslationTextComponent("mco.configure.world.slot.tooltip.minigame");
   private static final ITextComponent field_37427 = new TranslationTextComponent("mco.configure.world.slot.tooltip");
   private final Supplier<class_7675> field_37423;
   private final Consumer<ITextComponent> field_37428;
   private final int field_37424;
   private int field_37426;
   private class_5333 field_37419;

   public class_7319(int var1, int var2, int var3, int var4, Supplier<class_7675> var5, Consumer<ITextComponent> var6, int var7, class_1500 var8) {
      super(var1, var2, var3, var4, StringTextComponent.EMPTY, var8);
      this.field_37423 = var5;
      this.field_37424 = var7;
      this.field_37428 = var6;
   }

   @Nullable
   public class_5333 method_33370() {
      return this.field_37419;
   }

   @Override
   public void method_5312() {
      this.field_37426++;
      class_7675 var3 = this.field_37423.get();
      if (var3 != null) {
         class_6768 var4 = var3.field_39013.get(this.field_37424);
         boolean var5 = this.field_37424 == 4;
         boolean var6;
         String var7;
         long var8;
         String var10;
         boolean var11;
         if (var5) {
            var6 = var3.field_39015 == class_8840.field_45209;
            var7 = "Minigame";
            var8 = (long)var3.field_39017;
            var10 = var3.field_39003;
            var11 = var3.field_39017 == -1;
         } else {
            var6 = var3.field_39007 == this.field_37424 && var3.field_39015 != class_8840.field_45209;
            var7 = var4.method_31027(this.field_37424);
            var8 = var4.field_34928;
            var10 = var4.field_34926;
            var11 = var4.field_34933;
         }

         class_7426 var12 = method_33368(var3, var6, var5);
         Pair var13 = this.method_33367(var3, var7, var11, var5, var12);
         this.field_37419 = new class_5333(var6, var7, var8, var10, var11, var5, var12, (ITextComponent)var13.getFirst());
         this.method_32687((ITextComponent)var13.getSecond());
      }
   }

   private static class_7426 method_33368(class_7675 var0, boolean var1, boolean var2) {
      if (!var1) {
         if (!var2) {
            return class_7426.field_37895;
         }

         if (!var0.field_39020) {
            return class_7426.field_37895;
         }
      } else if (!var0.field_39020 && var0.field_39004 != class_6804.field_35065) {
         return class_7426.field_37893;
      }

      return class_7426.field_37891;
   }

   private Pair<ITextComponent, ITextComponent> method_33367(class_7675 var1, String var2, boolean var3, boolean var4, class_7426 var5) {
      if (var5 != class_7426.field_37891) {
         Object var8;
         if (!var4) {
            var8 = new StringTextComponent(" ").appendString(var2);
         } else if (!var3) {
            var8 = new StringTextComponent(" ").appendString(var2).appendString(" ").appendString(var1.field_39018);
         } else {
            var8 = StringTextComponent.EMPTY;
         }

         ITextComponent var9;
         if (var5 != class_7426.field_37893) {
            var9 = !var4 ? field_37427 : field_37421;
         } else {
            var9 = field_37420;
         }

         IFormattableTextComponent var10 = var9.deepCopy().append((ITextComponent)var8);
         return Pair.of(var9, var10);
      } else {
         return Pair.of((ITextComponent)null, new StringTextComponent(var2));
      }
   }

   @Override
   public void method_32686(class_7966 var1, int var2, int var3, float var4) {
      if (this.field_37419 != null) {
         this.method_33369(
            var1,
            this.field_36670,
            this.field_36674,
            var2,
            var3,
            class_5333.method_24311(this.field_37419),
            class_5333.method_24309(this.field_37419),
            this.field_37424,
            class_5333.method_24310(this.field_37419),
            class_5333.method_24312(this.field_37419),
            this.field_37419.field_27209,
            this.field_37419.field_27213,
            this.field_37419.field_27208,
            class_5333.method_24307(this.field_37419)
         );
      }
   }

   private void method_33369(
      class_7966 var1,
      int var2,
      int var3,
      int var4,
      int var5,
      boolean var6,
      String var7,
      int var8,
      long var9,
      String var11,
      boolean var12,
      boolean var13,
      class_7426 var14,
      ITextComponent var15
   ) {
      boolean var18 = this.method_32703();
      if (this.method_26937((double)var4, (double)var5) && var15 != null) {
         this.field_37428.accept(var15);
      }

      MinecraftClient var19 = MinecraftClient.getInstance();
      TextureManager var20 = var19.method_8577();
      if (!var13) {
         if (!var12) {
            if (var11 != null && var9 != -1L) {
               class_3570.method_16600(String.valueOf(var9), var11);
            } else if (var8 != 1) {
               if (var8 != 2) {
                  if (var8 == 3) {
                     var20.method_35674(field_37422);
                  }
               } else {
                  var20.method_35674(field_37417);
               }
            } else {
               var20.method_35674(field_37425);
            }
         } else {
            var20.method_35674(field_37418);
         }
      } else {
         class_3570.method_16600(String.valueOf(var9), var11);
      }

      if (!var6) {
         class_3542.method_16480(0.56F, 0.56F, 0.56F, 1.0F);
      } else {
         float var21 = 0.85F + 0.15F * class_9299.method_42840((float)this.field_37426 * 0.2F);
         class_3542.method_16480(var21, var21, var21, 1.0F);
      }

      method_9778(var1, var2 + 3, var3 + 3, 0.0F, 0.0F, 74, 74, 74, 74);
      var20.method_35674(field_37415);
      boolean var22 = var18 && var14 != class_7426.field_37891;
      if (!var22) {
         if (!var6) {
            class_3542.method_16480(0.56F, 0.56F, 0.56F, 1.0F);
         } else {
            class_3542.method_16480(0.8F, 0.8F, 0.8F, 1.0F);
         }
      } else {
         class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
      }

      method_9778(var1, var2, var3, 0.0F, 0.0F, 80, 80, 80, 80);
      method_9787(var1, var19.textRenderer, var7, var2 + 40, var3 + 66, 16777215);
   }
}
