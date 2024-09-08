package mapped;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import net.minecraft.client.gui.AbstractGui;
import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.util.Util;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.play.client.CEditBookPacket;
import net.minecraft.util.Hand;
import net.minecraft.util.text.*;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.apache.commons.lang3.mutable.MutableInt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Class828 extends Screen {
   private static final ITextComponent field4574 = new TranslationTextComponent("book.editTitle");
   private static final ITextComponent field4575 = new TranslationTextComponent("book.finalizeWarning");
   private static final Class9125 field4576 = Class9125.method34038("_", Style.EMPTY.setFormatting(TextFormatting.BLACK));
   private static final Class9125 field4577 = Class9125.method34038("_", Style.EMPTY.setFormatting(TextFormatting.GRAY));
   private final PlayerEntity field4578;
   private final ItemStack field4579;
   private boolean field4580;
   private boolean field4581;
   private int field4582;
   private int field4583;
   private final List<String> field4584 = Lists.newArrayList();
   private String field4585 = "";
   private final Class9079 field4586 = new Class9079(
      this::method2509, this::method2510, this::method2494, this::method2493, var1x -> var1x.length() < 1024 && this.fontRenderer.method38827(var1x, 114) <= 128
   );
   private final Class9079 field4587 = new Class9079(
      () -> this.field4585, var1x -> this.field4585 = var1x, this::method2494, this::method2493, var0 -> var0.length() < 16
   );
   private long field4588;
   private int field4589 = -1;
   private Class1209 field4590;
   private Class1209 field4591;
   private Button field4592;
   private Button field4593;
   private Button field4594;
   private Button field4595;
   private final Hand field4596;
   private Class8398 field4597 = Class8398.method29485();
   private ITextComponent field4598 = StringTextComponent.EMPTY;
   private final ITextComponent field4599;

   public Class828(PlayerEntity var1, ItemStack var2, Hand var3) {
      super(NarratorChatListener.field29300);
      this.field4578 = var1;
      this.field4579 = var2;
      this.field4596 = var3;
      CompoundNBT var6 = var2.method32142();
      if (var6 != null) {
         ListNBT var7 = var6.method131("pages", 8).method79();

         for (int var8 = 0; var8 < var7.size(); var8++) {
            this.field4584.add(var7.method160(var8));
         }
      }

      if (this.field4584.isEmpty()) {
         this.field4584.add("");
      }

      this.field4599 = new TranslationTextComponent("book.byAuthor", var1.getName()).mergeStyle(TextFormatting.DARK_GRAY);
   }

   private void method2493(String var1) {
      if (this.mc != null) {
         Class9079.method33830(this.mc, var1);
      }
   }

   private String method2494() {
      return this.mc == null ? "" : Class9079.method33828(this.mc);
   }

   private int method2495() {
      return this.field4584.size();
   }

   @Override
   public void tick() {
      super.tick();
      this.field4582++;
   }

   @Override
   public void init() {
      this.method2518();
      this.mc.keyboardListener.enableRepeatEvents(true);
      this.field4593 = this.<Button>addButton(
         new Button(this.width / 2 - 100, 196, 98, 20, new TranslationTextComponent("book.signButton"), var1 -> {
            this.field4581 = true;
            this.method2498();
         })
      );
      this.field4592 = this.<Button>addButton(new Button(this.width / 2 + 2, 196, 98, 20, DialogTexts.field30658, var1 -> {
         this.mc.displayGuiScreen((Screen)null);
         this.method2500(false);
      }));
      this.field4594 = this.<Button>addButton(
         new Button(this.width / 2 - 100, 196, 98, 20, new TranslationTextComponent("book.finalizeButton"), var1 -> {
            if (this.field4581) {
               this.method2500(true);
               this.mc.displayGuiScreen((Screen)null);
            }
         })
      );
      this.field4595 = this.<Button>addButton(new Button(this.width / 2 + 2, 196, 98, 20, DialogTexts.GUI_CANCEL, var1 -> {
         if (this.field4581) {
            this.field4581 = false;
         }

         this.method2498();
      }));
      int var3 = (this.width - 192) / 2;
      byte var4 = 2;
      this.field4590 = this.<Class1209>addButton(new Class1209(var3 + 116, 159, true, var1 -> this.method2497(), true));
      this.field4591 = this.<Class1209>addButton(new Class1209(var3 + 43, 159, false, var1 -> this.method2496(), true));
      this.method2498();
   }

   private void method2496() {
      if (this.field4583 > 0) {
         this.field4583--;
      }

      this.method2498();
      this.method2519();
   }

   private void method2497() {
      if (this.field4583 >= this.method2495() - 1) {
         this.method2501();
         if (this.field4583 < this.method2495() - 1) {
            this.field4583++;
         }
      } else {
         this.field4583++;
      }

      this.method2498();
      this.method2519();
   }

   @Override
   public void onClose() {
      this.mc.keyboardListener.enableRepeatEvents(false);
   }

   private void method2498() {
      this.field4591.field6483 = !this.field4581 && this.field4583 > 0;
      this.field4590.field6483 = !this.field4581;
      this.field4592.field6483 = !this.field4581;
      this.field4593.field6483 = !this.field4581;
      this.field4595.field6483 = this.field4581;
      this.field4594.field6483 = this.field4581;
      this.field4594.active = !this.field4585.trim().isEmpty();
   }

   private void method2499() {
      ListIterator var3 = this.field4584.listIterator(this.field4584.size());

      while (var3.hasPrevious() && ((String)var3.previous()).isEmpty()) {
         var3.remove();
      }
   }

   private void method2500(boolean var1) {
      if (this.field4580) {
         this.method2499();
         ListNBT var4 = new ListNBT();
         this.field4584.stream().<StringNBT>map(StringNBT::valueOf).forEach(var4::add);
         if (!this.field4584.isEmpty()) {
            this.field4579.setTagInfo("pages", var4);
         }

         if (var1) {
            this.field4579.setTagInfo("author", StringNBT.valueOf(this.field4578.getGameProfile().getName()));
            this.field4579.setTagInfo("title", StringNBT.valueOf(this.field4585.trim()));
         }

         int var5 = this.field4596 != Hand.MAIN_HAND ? 40 : this.field4578.inventory.currentItem;
         this.mc.getConnection().sendPacket(new CEditBookPacket(this.field4579, var1, var5));
      }
   }

   private void method2501() {
      if (this.method2495() < 100) {
         this.field4584.add("");
         this.field4580 = true;
      }
   }

   @Override
   public boolean keyPressed(int var1, int var2, int var3) {
      if (!super.keyPressed(var1, var2, var3)) {
         if (!this.field4581) {
            boolean var6 = this.method2502(var1, var2, var3);
            if (!var6) {
               return false;
            } else {
               this.method2518();
               return true;
            }
         } else {
            return this.method2508(var1, var2, var3);
         }
      } else {
         return true;
      }
   }

   @Override
   public boolean charTyped(char var1, int var2) {
      if (!super.charTyped(var1, var2)) {
         if (!this.field4581) {
            if (!SharedConstants.isAllowedCharacter(var1)) {
               return false;
            } else {
               this.field4586.method33835(Character.toString(var1));
               this.method2518();
               return true;
            }
         } else {
            boolean var5 = this.field4587.method33831(var1);
            if (!var5) {
               return false;
            } else {
               this.method2498();
               this.field4580 = true;
               return true;
            }
         }
      } else {
         return true;
      }
   }

   private boolean method2502(int var1, int var2, int var3) {
      if (Screen.method2481(var1)) {
         this.field4586.method33843();
         return true;
      } else if (Screen.method2480(var1)) {
         this.field4586.method33842();
         return true;
      } else if (Screen.method2479(var1)) {
         this.field4586.method33841();
         return true;
      } else if (Screen.method2478(var1)) {
         this.field4586.method33840();
         return true;
      } else {
         switch (var1) {
            case 257:
            case 335:
               this.field4586.method33835("\n");
               return true;
            case 259:
               this.field4586.method33839(-1);
               return true;
            case 261:
               this.field4586.method33839(1);
               return true;
            case 262:
               this.field4586.method33837(1, Screen.method2476());
               return true;
            case 263:
               this.field4586.method33837(-1, Screen.method2476());
               return true;
            case 264:
               this.method2504();
               return true;
            case 265:
               this.method2503();
               return true;
            case 266:
               this.field4591.method5759();
               return true;
            case 267:
               this.field4590.method5759();
               return true;
            case 268:
               this.method2506();
               return true;
            case 269:
               this.method2507();
               return true;
            default:
               return false;
         }
      }
   }

   private void method2503() {
      this.method2505(-1);
   }

   private void method2504() {
      this.method2505(1);
   }

   private void method2505(int var1) {
      int var4 = this.field4586.method33849();
      int var5 = this.method2517().method29482(var4, var1);
      this.field4586.method33850(var5, Screen.method2476());
   }

   private void method2506() {
      int var3 = this.field4586.method33849();
      int var4 = this.method2517().method29483(var3);
      this.field4586.method33850(var4, Screen.method2476());
   }

   private void method2507() {
      Class8398 var3 = this.method2517();
      int var4 = this.field4586.method33849();
      int var5 = var3.method29484(var4);
      this.field4586.method33850(var5, Screen.method2476());
   }

   private boolean method2508(int var1, int var2, int var3) {
      switch (var1) {
         case 257:
         case 335:
            if (!this.field4585.isEmpty()) {
               this.method2500(true);
               this.mc.displayGuiScreen((Screen)null);
            }

            return true;
         case 259:
            this.field4587.method33839(-1);
            this.method2498();
            this.field4580 = true;
            return true;
         default:
            return false;
      }
   }

   private String method2509() {
      return this.field4583 >= 0 && this.field4583 < this.field4584.size() ? this.field4584.get(this.field4583) : "";
   }

   private void method2510(String var1) {
      if (this.field4583 >= 0 && this.field4583 < this.field4584.size()) {
         this.field4584.set(this.field4583, var1);
         this.field4580 = true;
         this.method2518();
      }
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.renderBackground(var1);
      this.setListener((IGuiEventListener2)null);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.mc.getTextureManager().bindTexture(Class870.field4820);
      int var7 = (this.width - 192) / 2;
      byte var8 = 2;
      this.method5696(var1, var7, 2, 0, 0, 192, 192);
      if (!this.field4581) {
         int var9 = this.fontRenderer.method38821(this.field4598);
         this.fontRenderer.func_243248_b(var1, this.field4598, (float)(var7 - var9 + 192 - 44), 18.0F, 0);
         Class8398 var10 = this.method2517();

         for (Class8067 var14 : Class8398.method29486(var10)) {
            this.fontRenderer.func_243248_b(var1, Class8067.method27765(var14), (float)Class8067.method27766(var14), (float)Class8067.method27767(var14), -16777216);
         }

         this.method2512(Class8398.method29487(var10));
         this.method2511(var1, Class8398.method29488(var10), Class8398.method29489(var10));
      } else {
         boolean var15 = this.field4582 / 6 % 2 == 0;
         Class9125 var16 = Class9125.method34041(Class9125.method34038(this.field4585, Style.EMPTY), !var15 ? field4577 : field4576);
         int var17 = this.fontRenderer.method38821(field4574);
         this.fontRenderer.func_243248_b(var1, field4574, (float)(var7 + 36 + (114 - var17) / 2), 34.0F, 0);
         int var18 = this.fontRenderer.method38822(var16);
         this.fontRenderer.method38804(var1, var16, (float)(var7 + 36 + (114 - var18) / 2), 50.0F, 0);
         int var19 = this.fontRenderer.method38821(this.field4599);
         this.fontRenderer.func_243248_b(var1, this.field4599, (float)(var7 + 36 + (114 - var19) / 2), 60.0F, 0);
         this.fontRenderer.method38826(field4575, var7 + 36, 82, 114, 0);
      }

      super.render(var1, var2, var3, var4);
   }

   private void method2511(MatrixStack var1, Class6178 var2, boolean var3) {
      if (this.field4582 / 6 % 2 == 0) {
         var2 = this.method2514(var2);
         if (var3) {
            this.fontRenderer.method38801(var1, "_", (float)var2.field27614, (float)var2.field27615, 0);
         } else {
            AbstractGui.method5686(var1, var2.field27614, var2.field27615 - 1, var2.field27614 + 1, var2.field27615 + 9, -16777216);
         }
      }
   }

   private void method2512(Class9518[] var1) {
      Tessellator var4 = Tessellator.getInstance();
      BufferBuilder var5 = var4.getBuffer();
      RenderSystem.color4f(0.0F, 0.0F, 255.0F, 255.0F);
      RenderSystem.disableTexture();
      RenderSystem.method27857();
      RenderSystem.method27859(Class2270.field14769);
      var5.begin(7, DefaultVertexFormats.field43341);

      for (Class9518 var9 : var1) {
         int var10 = var9.method36780();
         int var11 = var9.method36781();
         int var12 = var10 + var9.method36782();
         int var13 = var11 + var9.method36783();
         var5.pos((double)var10, (double)var13, 0.0).endVertex();
         var5.pos((double)var12, (double)var13, 0.0).endVertex();
         var5.pos((double)var12, (double)var11, 0.0).endVertex();
         var5.pos((double)var10, (double)var11, 0.0).endVertex();
      }

      var4.draw();
      RenderSystem.method27858();
      RenderSystem.enableTexture();
   }

   private Class6178 method2513(Class6178 var1) {
      return new Class6178(var1.field27614 - (this.width - 192) / 2 - 36, var1.field27615 - 32);
   }

   private Class6178 method2514(Class6178 var1) {
      return new Class6178(var1.field27614 + (this.width - 192) / 2 + 36, var1.field27615 + 32);
   }

   @Override
   public boolean mouseClicked(double var1, double var3, int var5) {
      if (super.mouseClicked(var1, var3, var5)) {
         return true;
      } else {
         if (var5 == 0) {
            long var8 = Util.milliTime();
            Class8398 var10 = this.method2517();
            int var11 = var10.method29481(this.fontRenderer, this.method2513(new Class6178((int)var1, (int)var3)));
            if (var11 >= 0) {
               if (var11 != this.field4589 || var8 - this.field4588 >= 250L) {
                  this.field4586.method33850(var11, Screen.method2476());
               } else if (this.field4586.method33853()) {
                  this.field4586.method33843();
               } else {
                  this.method2515(var11);
               }

               this.method2518();
            }

            this.field4589 = var11;
            this.field4588 = var8;
         }

         return true;
      }
   }

   private void method2515(int var1) {
      String var4 = this.method2509();
      this.field4586.method33852(CharacterManager.func_238351_a_(var4, -1, var1, false), CharacterManager.func_238351_a_(var4, 1, var1, false));
   }

   @Override
   public boolean mouseDragged(double var1, double var3, int var5, double var6, double var8) {
      if (!super.mouseDragged(var1, var3, var5, var6, var8)) {
         if (var5 == 0) {
            Class8398 var12 = this.method2517();
            int var13 = var12.method29481(this.fontRenderer, this.method2513(new Class6178((int)var1, (int)var3)));
            this.field4586.method33850(var13, true);
            this.method2518();
         }

         return true;
      } else {
         return true;
      }
   }

   private Class8398 method2517() {
      if (this.field4597 == null) {
         this.field4597 = this.method2520();
         this.field4598 = new TranslationTextComponent("book.pageIndicator", this.field4583 + 1, this.method2495());
      }

      return this.field4597;
   }

   private void method2518() {
      this.field4597 = null;
   }

   private void method2519() {
      this.field4586.method33847();
      this.method2518();
   }

   private Class8398 method2520() {
      String var3 = this.method2509();
      if (!var3.isEmpty()) {
         int var4 = this.field4586.method33849();
         int var5 = this.field4586.method33851();
         IntArrayList var6 = new IntArrayList();
         ArrayList<Class8067> var7 = Lists.newArrayList();
         MutableInt var8 = new MutableInt();
         MutableBoolean var9 = new MutableBoolean();
         CharacterManager var10 = this.fontRenderer.method38830();
         var10.func_238353_a_(var3, 114, Style.EMPTY, true, (var6x, var7x, var8x) -> {
            int var11x = var8.getAndIncrement();
            String var12x = var3.substring(var7x, var8x);
            var9.setValue(var12x.endsWith("\n"));
            String var13x = StringUtils.stripEnd(var12x, " \n");
            int var14x = var11x * 9;
            Class6178 var15x = this.method2514(new Class6178(0, var14x));
            var6.add(var7x);
            var7.add(new Class8067(var6x, var13x, var15x.field27614, var15x.field27615));
         });
         int[] var11 = var6.toIntArray();
         boolean var12 = var4 == var3.length();
         Class6178 var15;
         if (var12 && var9.isTrue()) {
            var15 = new Class6178(0, var7.size() * 9);
         } else {
            int var13 = method2521(var11, var4);
            int var14 = this.fontRenderer.getStringWidth(var3.substring(var11[var13], var4));
            var15 = new Class6178(var14, var13 * 9);
         }

         ArrayList<Class9518> var24 = Lists.newArrayList();
         if (var4 != var5) {
            int var25 = Math.min(var4, var5);
            int var16 = Math.max(var4, var5);
            int var17 = method2521(var11, var25);
            int var18 = method2521(var11, var16);
            if (var17 != var18) {
               int var19 = var17 + 1 <= var11.length ? var11[var17 + 1] : var3.length();
               var24.add(this.method2522(var3, var10, var25, var19, var17 * 9, var11[var17]));

               for (int var20 = var17 + 1; var20 < var18; var20++) {
                  int var21 = var20 * 9;
                  String var22 = var3.substring(var11[var20], var11[var20 + 1]);
                  int var23 = (int)var10.func_238350_a_(var22);
                  var24.add(this.method2523(new Class6178(0, var21), new Class6178(var23, var21 + 9)));
               }

               var24.add(this.method2522(var3, var10, var11[var18], var16, var18 * 9, var11[var18]));
            } else {
               int var26 = var17 * 9;
               int var27 = var11[var17];
               var24.add(this.method2522(var3, var10, var25, var16, var26, var27));
            }
         }

         return new Class8398(var3, var15, var12, var11, var7.toArray(new Class8067[0]), var24.toArray(new Class9518[0]));
      } else {
         return Class8398.method29485();
      }
   }

   private static int method2521(int[] var0, int var1) {
      int var4 = Arrays.binarySearch(var0, var1);
      return var4 >= 0 ? var4 : -(var4 + 2);
   }

   private Class9518 method2522(String var1, CharacterManager var2, int var3, int var4, int var5, int var6) {
      String var9 = var1.substring(var6, var3);
      String var10 = var1.substring(var6, var4);
      Class6178 var11 = new Class6178((int)var2.func_238350_a_(var9), var5);
      Class6178 var12 = new Class6178((int)var2.func_238350_a_(var10), var5 + 9);
      return this.method2523(var11, var12);
   }

   private Class9518 method2523(Class6178 var1, Class6178 var2) {
      Class6178 var5 = this.method2514(var1);
      Class6178 var6 = this.method2514(var2);
      int var7 = Math.min(var5.field27614, var6.field27614);
      int var8 = Math.max(var5.field27614, var6.field27614);
      int var9 = Math.min(var5.field27615, var6.field27615);
      int var10 = Math.max(var5.field27615, var6.field27615);
      return new Class9518(var7, var9, var8 - var7, var10 - var9);
   }

   // $VF: synthetic method
   public static int method2535(int[] var0, int var1) {
      return method2521(var0, var1);
   }
}
