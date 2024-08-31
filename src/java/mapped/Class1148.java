package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.network.play.client.CUpdateStructureBlockPacket;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Class1148 extends Screen {
   private static final ITextComponent field6239 = new TranslationTextComponent("structure_block.structure_name");
   private static final ITextComponent field6240 = new TranslationTextComponent("structure_block.position");
   private static final ITextComponent field6241 = new TranslationTextComponent("structure_block.size");
   private static final ITextComponent field6242 = new TranslationTextComponent("structure_block.integrity");
   private static final ITextComponent field6243 = new TranslationTextComponent("structure_block.custom_data");
   private static final ITextComponent field6244 = new TranslationTextComponent("structure_block.include_entities");
   private static final ITextComponent field6245 = new TranslationTextComponent("structure_block.detect_size");
   private static final ITextComponent field6246 = new TranslationTextComponent("structure_block.show_air");
   private static final ITextComponent field6247 = new TranslationTextComponent("structure_block.show_boundingbox");
   private final Class964 field6248;
   private Class2089 field6249 = Class2089.field13614;
   private Class80 field6250 = Class80.field185;
   private Class104 field6251 = Class104.field321;
   private boolean field6252;
   private boolean field6253;
   private boolean field6254;
   private TextFieldWidget field6255;
   private TextFieldWidget field6256;
   private TextFieldWidget field6257;
   private TextFieldWidget field6258;
   private TextFieldWidget field6259;
   private TextFieldWidget field6260;
   private TextFieldWidget field6261;
   private TextFieldWidget field6262;
   private TextFieldWidget field6263;
   private TextFieldWidget field6264;
   private Button field6265;
   private Button field6266;
   private Button field6267;
   private Button field6268;
   private Button field6269;
   private Button field6270;
   private Button field6271;
   private Button field6272;
   private Button field6273;
   private Button field6274;
   private Button field6275;
   private Button field6276;
   private Button field6277;
   private Button field6278;
   private final DecimalFormat field6279 = new DecimalFormat("0.0###");

   public Class1148(Class964 var1) {
      super(new TranslationTextComponent(Blocks.field37113.getTranslationKey()));
      this.field6248 = var1;
      this.field6279.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT));
   }

   @Override
   public void tick() {
      this.field6255.method5633();
      this.field6256.method5633();
      this.field6257.method5633();
      this.field6258.method5633();
      this.field6259.method5633();
      this.field6260.method5633();
      this.field6261.method5633();
      this.field6262.method5633();
      this.field6263.method5633();
      this.field6264.method5633();
   }

   private void method5500() {
      if (this.method5508(Class1897.field11138)) {
         this.mc.displayGuiScreen((Screen)null);
      }
   }

   private void method5501() {
      this.field6248.method3945(this.field6249);
      this.field6248.method3947(this.field6250);
      this.field6248.method3951(this.field6251);
      this.field6248.method3954(this.field6252);
      this.field6248.method3974(this.field6253);
      this.field6248.method3976(this.field6254);
      this.mc.displayGuiScreen((Screen)null);
   }

   @Override
   public void init() {
      this.mc.keyboardListener.enableRepeatEvents(true);
      this.field6265 = this.<Button>addButton(new Button(this.width / 2 - 4 - 150, 210, 150, 20, DialogTexts.field30658, var1 -> this.method5500()));
      this.field6266 = this.<Button>addButton(new Button(this.width / 2 + 4, 210, 150, 20, DialogTexts.GUI_CANCEL, var1 -> this.method5501()));
      this.field6267 = this.<Button>addButton(
         new Button(this.width / 2 + 4 + 100, 185, 50, 20, new TranslationTextComponent("structure_block.button.save"), var1 -> {
            if (this.field6248.method3950() == Class104.field318) {
               this.method5508(Class1897.field11139);
               this.mc.displayGuiScreen((Screen)null);
            }
         })
      );
      this.field6268 = this.<Button>addButton(
         new Button(this.width / 2 + 4 + 100, 185, 50, 20, new TranslationTextComponent("structure_block.button.load"), var1 -> {
            if (this.field6248.method3950() == Class104.field319) {
               this.method5508(Class1897.field11140);
               this.mc.displayGuiScreen((Screen)null);
            }
         })
      );
      this.field6273 = this.<Button>addButton(new Button(this.width / 2 - 4 - 150, 185, 50, 20, new StringTextComponent("MODE"), var1 -> {
         this.field6248.method3952();
         this.method5507();
      }));
      this.field6274 = this.<Button>addButton(
         new Button(this.width / 2 + 4 + 100, 120, 50, 20, new TranslationTextComponent("structure_block.button.detect_size"), var1 -> {
            if (this.field6248.method3950() == Class104.field318) {
               this.method5508(Class1897.field11141);
               this.mc.displayGuiScreen((Screen)null);
            }
         })
      );
      this.field6275 = this.<Button>addButton(new Button(this.width / 2 + 4 + 100, 160, 50, 20, new StringTextComponent("ENTITIES"), var1 -> {
         this.field6248.method3954(!this.field6248.method3953());
         this.method5502();
      }));
      this.field6276 = this.<Button>addButton(new Button(this.width / 2 - 20, 185, 40, 20, new StringTextComponent("MIRROR"), var1 -> {
         switch (Class9686.field45294[this.field6248.method3944().ordinal()]) {
            case 1:
               this.field6248.method3945(Class2089.field13615);
               break;
            case 2:
               this.field6248.method3945(Class2089.field13616);
               break;
            case 3:
               this.field6248.method3945(Class2089.field13614);
         }

         this.method5505();
      }));
      this.field6277 = this.<Button>addButton(new Button(this.width / 2 + 4 + 100, 80, 50, 20, new StringTextComponent("SHOWAIR"), var1 -> {
         this.field6248.method3974(!this.field6248.method3973());
         this.method5503();
      }));
      this.field6278 = this.<Button>addButton(new Button(this.width / 2 + 4 + 100, 80, 50, 20, new StringTextComponent("SHOWBB"), var1 -> {
         this.field6248.method3976(!this.field6248.method3975());
         this.method5504();
      }));
      this.field6269 = this.<Button>addButton(new Button(this.width / 2 - 1 - 40 - 1 - 40 - 20, 185, 40, 20, new StringTextComponent("0"), var1 -> {
         this.field6248.method3947(Class80.field185);
         this.method5506();
      }));
      this.field6270 = this.<Button>addButton(new Button(this.width / 2 - 1 - 40 - 20, 185, 40, 20, new StringTextComponent("90"), var1 -> {
         this.field6248.method3947(Class80.field186);
         this.method5506();
      }));
      this.field6271 = this.<Button>addButton(new Button(this.width / 2 + 1 + 20, 185, 40, 20, new StringTextComponent("180"), var1 -> {
         this.field6248.method3947(Class80.field187);
         this.method5506();
      }));
      this.field6272 = this.<Button>addButton(new Button(this.width / 2 + 1 + 40 + 1 + 20, 185, 40, 20, new StringTextComponent("270"), var1 -> {
         this.field6248.method3947(Class80.field188);
         this.method5506();
      }));
      this.field6255 = new Class1304(
         this, this.fontRenderer, this.width / 2 - 152, 40, 300, 20, new TranslationTextComponent("structure_block.structure_name")
      );
      this.field6255.method5657(64);
      this.field6255.method5635(this.field6248.method3934());
      this.field4561.add(this.field6255);
      BlockPos var3 = this.field6248.method3940();
      this.field6256 = new TextFieldWidget(this.fontRenderer, this.width / 2 - 152, 80, 80, 20, new TranslationTextComponent("structure_block.position.x"));
      this.field6256.method5657(15);
      this.field6256.method5635(Integer.toString(var3.getX()));
      this.field4561.add(this.field6256);
      this.field6257 = new TextFieldWidget(this.fontRenderer, this.width / 2 - 72, 80, 80, 20, new TranslationTextComponent("structure_block.position.y"));
      this.field6257.method5657(15);
      this.field6257.method5635(Integer.toString(var3.getY()));
      this.field4561.add(this.field6257);
      this.field6258 = new TextFieldWidget(this.fontRenderer, this.width / 2 + 8, 80, 80, 20, new TranslationTextComponent("structure_block.position.z"));
      this.field6258.method5657(15);
      this.field6258.method5635(Integer.toString(var3.getZ()));
      this.field4561.add(this.field6258);
      BlockPos var4 = this.field6248.method3942();
      this.field6259 = new TextFieldWidget(this.fontRenderer, this.width / 2 - 152, 120, 80, 20, new TranslationTextComponent("structure_block.size.x"));
      this.field6259.method5657(15);
      this.field6259.method5635(Integer.toString(var4.getX()));
      this.field4561.add(this.field6259);
      this.field6260 = new TextFieldWidget(this.fontRenderer, this.width / 2 - 72, 120, 80, 20, new TranslationTextComponent("structure_block.size.y"));
      this.field6260.method5657(15);
      this.field6260.method5635(Integer.toString(var4.getY()));
      this.field4561.add(this.field6260);
      this.field6261 = new TextFieldWidget(this.fontRenderer, this.width / 2 + 8, 120, 80, 20, new TranslationTextComponent("structure_block.size.z"));
      this.field6261.method5657(15);
      this.field6261.method5635(Integer.toString(var4.getZ()));
      this.field4561.add(this.field6261);
      this.field6262 = new TextFieldWidget(this.fontRenderer, this.width / 2 - 152, 120, 80, 20, new TranslationTextComponent("structure_block.integrity.integrity"));
      this.field6262.method5657(15);
      this.field6262.method5635(this.field6279.format((double)this.field6248.method3955()));
      this.field4561.add(this.field6262);
      this.field6263 = new TextFieldWidget(this.fontRenderer, this.width / 2 - 72, 120, 80, 20, new TranslationTextComponent("structure_block.integrity.seed"));
      this.field6263.method5657(31);
      this.field6263.method5635(Long.toString(this.field6248.method3957()));
      this.field4561.add(this.field6263);
      this.field6264 = new TextFieldWidget(this.fontRenderer, this.width / 2 - 152, 120, 240, 20, new TranslationTextComponent("structure_block.custom_data"));
      this.field6264.method5657(128);
      this.field6264.method5635(this.field6248.method3948());
      this.field4561.add(this.field6264);
      this.field6249 = this.field6248.method3944();
      this.method5505();
      this.field6250 = this.field6248.method3946();
      this.method5506();
      this.field6251 = this.field6248.method3950();
      this.method5507();
      this.field6252 = this.field6248.method3953();
      this.method5502();
      this.field6253 = this.field6248.method3973();
      this.method5503();
      this.field6254 = this.field6248.method3975();
      this.method5504();
      this.method5536(this.field6255);
   }

   @Override
   public void resize(Minecraft var1, int var2, int var3) {
      String var6 = this.field6255.getText();
      String var7 = this.field6256.getText();
      String var8 = this.field6257.getText();
      String var9 = this.field6258.getText();
      String var10 = this.field6259.getText();
      String var11 = this.field6260.getText();
      String var12 = this.field6261.getText();
      String var13 = this.field6262.getText();
      String var14 = this.field6263.getText();
      String var15 = this.field6264.getText();
      this.init(var1, var2, var3);
      this.field6255.method5635(var6);
      this.field6256.method5635(var7);
      this.field6257.method5635(var8);
      this.field6258.method5635(var9);
      this.field6259.method5635(var10);
      this.field6260.method5635(var11);
      this.field6261.method5635(var12);
      this.field6262.method5635(var13);
      this.field6263.method5635(var14);
      this.field6264.method5635(var15);
   }

   @Override
   public void onClose() {
      this.mc.keyboardListener.enableRepeatEvents(false);
   }

   private void method5502() {
      this.field6275.setMessage(DialogTexts.method22237(!this.field6248.method3953()));
   }

   private void method5503() {
      this.field6277.setMessage(DialogTexts.method22237(this.field6248.method3973()));
   }

   private void method5504() {
      this.field6278.setMessage(DialogTexts.method22237(this.field6248.method3975()));
   }

   private void method5505() {
      Class2089 var3 = this.field6248.method3944();
      switch (Class9686.field45294[var3.ordinal()]) {
         case 1:
            this.field6276.setMessage(new StringTextComponent("|"));
            break;
         case 2:
            this.field6276.setMessage(new StringTextComponent("< >"));
            break;
         case 3:
            this.field6276.setMessage(new StringTextComponent("^ v"));
      }
   }

   private void method5506() {
      this.field6269.active = true;
      this.field6270.active = true;
      this.field6271.active = true;
      this.field6272.active = true;
      switch (Class9686.field45295[this.field6248.method3946().ordinal()]) {
         case 1:
            this.field6269.active = false;
            break;
         case 2:
            this.field6271.active = false;
            break;
         case 3:
            this.field6272.active = false;
            break;
         case 4:
            this.field6270.active = false;
      }
   }

   private void method5507() {
      this.field6255.method5671(false);
      this.field6256.method5671(false);
      this.field6257.method5671(false);
      this.field6258.method5671(false);
      this.field6259.method5671(false);
      this.field6260.method5671(false);
      this.field6261.method5671(false);
      this.field6262.method5671(false);
      this.field6263.method5671(false);
      this.field6264.method5671(false);
      this.field6267.field6483 = false;
      this.field6268.field6483 = false;
      this.field6274.field6483 = false;
      this.field6275.field6483 = false;
      this.field6276.field6483 = false;
      this.field6269.field6483 = false;
      this.field6270.field6483 = false;
      this.field6271.field6483 = false;
      this.field6272.field6483 = false;
      this.field6277.field6483 = false;
      this.field6278.field6483 = false;
      switch (Class9686.field45296[this.field6248.method3950().ordinal()]) {
         case 1:
            this.field6255.method5671(true);
            this.field6256.method5671(true);
            this.field6257.method5671(true);
            this.field6258.method5671(true);
            this.field6259.method5671(true);
            this.field6260.method5671(true);
            this.field6261.method5671(true);
            this.field6267.field6483 = true;
            this.field6274.field6483 = true;
            this.field6275.field6483 = true;
            this.field6277.field6483 = true;
            break;
         case 2:
            this.field6255.method5671(true);
            this.field6256.method5671(true);
            this.field6257.method5671(true);
            this.field6258.method5671(true);
            this.field6262.method5671(true);
            this.field6263.method5671(true);
            this.field6268.field6483 = true;
            this.field6275.field6483 = true;
            this.field6276.field6483 = true;
            this.field6269.field6483 = true;
            this.field6270.field6483 = true;
            this.field6271.field6483 = true;
            this.field6272.field6483 = true;
            this.field6278.field6483 = true;
            this.method5506();
            break;
         case 3:
            this.field6255.method5671(true);
            break;
         case 4:
            this.field6264.method5671(true);
      }

      this.field6273.setMessage(new TranslationTextComponent("structure_block.mode." + this.field6248.method3950().method257()));
   }

   private boolean method5508(Class1897 var1) {
      BlockPos var4 = new BlockPos(
         this.method5511(this.field6256.getText()), this.method5511(this.field6257.getText()), this.method5511(this.field6258.getText())
      );
      BlockPos var5 = new BlockPos(
         this.method5511(this.field6259.getText()), this.method5511(this.field6260.getText()), this.method5511(this.field6261.getText())
      );
      float var6 = this.method5510(this.field6262.getText());
      long var7 = this.method5509(this.field6263.getText());
      this.mc
         .getConnection()
         .sendPacket(
            new CUpdateStructureBlockPacket(
               this.field6248.getPos(),
               var1,
               this.field6248.method3950(),
               this.field6255.getText(),
               var4,
               var5,
               this.field6248.method3944(),
               this.field6248.method3946(),
               this.field6264.getText(),
               this.field6248.method3953(),
               this.field6248.method3973(),
               this.field6248.method3975(),
               var6,
               var7
            )
         );
      return true;
   }

   private long method5509(String var1) {
      try {
         return Long.valueOf(var1);
      } catch (NumberFormatException var5) {
         return 0L;
      }
   }

   private float method5510(String var1) {
      try {
         return Float.valueOf(var1);
      } catch (NumberFormatException var5) {
         return 1.0F;
      }
   }

   private int method5511(String var1) {
      try {
         return Integer.parseInt(var1);
      } catch (NumberFormatException var5) {
         return 0;
      }
   }

   @Override
   public void method1945() {
      this.method5501();
   }

   @Override
   public boolean keyPressed(int var1, int var2, int var3) {
      if (!super.keyPressed(var1, var2, var3)) {
         if (var1 != 257 && var1 != 335) {
            return false;
         } else {
            this.method5500();
            return true;
         }
      } else {
         return true;
      }
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.renderBackground(var1);
      Class104 var7 = this.field6248.method3950();
      drawCenteredString(var1, this.fontRenderer, this.title, this.width / 2, 10, 16777215);
      if (var7 != Class104.field321) {
         method5693(var1, this.fontRenderer, field6239, this.width / 2 - 153, 30, 10526880);
         this.field6255.render(var1, var2, var3, var4);
      }

      if (var7 == Class104.field319 || var7 == Class104.field318) {
         method5693(var1, this.fontRenderer, field6240, this.width / 2 - 153, 70, 10526880);
         this.field6256.render(var1, var2, var3, var4);
         this.field6257.render(var1, var2, var3, var4);
         this.field6258.render(var1, var2, var3, var4);
         method5693(var1, this.fontRenderer, field6244, this.width / 2 + 154 - this.fontRenderer.method38821(field6244), 150, 10526880);
      }

      if (var7 == Class104.field318) {
         method5693(var1, this.fontRenderer, field6241, this.width / 2 - 153, 110, 10526880);
         this.field6259.render(var1, var2, var3, var4);
         this.field6260.render(var1, var2, var3, var4);
         this.field6261.render(var1, var2, var3, var4);
         method5693(var1, this.fontRenderer, field6245, this.width / 2 + 154 - this.fontRenderer.method38821(field6245), 110, 10526880);
         method5693(var1, this.fontRenderer, field6246, this.width / 2 + 154 - this.fontRenderer.method38821(field6246), 70, 10526880);
      }

      if (var7 == Class104.field319) {
         method5693(var1, this.fontRenderer, field6242, this.width / 2 - 153, 110, 10526880);
         this.field6262.render(var1, var2, var3, var4);
         this.field6263.render(var1, var2, var3, var4);
         method5693(var1, this.fontRenderer, field6247, this.width / 2 + 154 - this.fontRenderer.method38821(field6247), 70, 10526880);
      }

      if (var7 == Class104.field321) {
         method5693(var1, this.fontRenderer, field6243, this.width / 2 - 153, 110, 10526880);
         this.field6264.render(var1, var2, var3, var4);
      }

      method5693(var1, this.fontRenderer, var7.method295(), this.width / 2 - 153, 174, 10526880);
      super.render(var1, var2, var3, var4);
   }

   @Override
   public boolean isPauseScreen() {
      return false;
   }
}
