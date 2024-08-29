package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.DialogTexts;
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
   private Class1189 field6255;
   private Class1189 field6256;
   private Class1189 field6257;
   private Class1189 field6258;
   private Class1189 field6259;
   private Class1189 field6260;
   private Class1189 field6261;
   private Class1189 field6262;
   private Class1189 field6263;
   private Class1189 field6264;
   private Class1206 field6265;
   private Class1206 field6266;
   private Class1206 field6267;
   private Class1206 field6268;
   private Class1206 field6269;
   private Class1206 field6270;
   private Class1206 field6271;
   private Class1206 field6272;
   private Class1206 field6273;
   private Class1206 field6274;
   private Class1206 field6275;
   private Class1206 field6276;
   private Class1206 field6277;
   private Class1206 field6278;
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
         this.field4562.displayGuiScreen((Screen)null);
      }
   }

   private void method5501() {
      this.field6248.method3945(this.field6249);
      this.field6248.method3947(this.field6250);
      this.field6248.method3951(this.field6251);
      this.field6248.method3954(this.field6252);
      this.field6248.method3974(this.field6253);
      this.field6248.method3976(this.field6254);
      this.field4562.displayGuiScreen((Screen)null);
   }

   @Override
   public void method1921() {
      this.field4562.keyboardListener.method36347(true);
      this.field6265 = this.<Class1206>method2455(new Class1206(this.field4564 / 2 - 4 - 150, 210, 150, 20, DialogTexts.field30658, var1 -> this.method5500()));
      this.field6266 = this.<Class1206>method2455(new Class1206(this.field4564 / 2 + 4, 210, 150, 20, DialogTexts.GUI_CANCEL, var1 -> this.method5501()));
      this.field6267 = this.<Class1206>method2455(
         new Class1206(this.field4564 / 2 + 4 + 100, 185, 50, 20, new TranslationTextComponent("structure_block.button.save"), var1 -> {
            if (this.field6248.method3950() == Class104.field318) {
               this.method5508(Class1897.field11139);
               this.field4562.displayGuiScreen((Screen)null);
            }
         })
      );
      this.field6268 = this.<Class1206>method2455(
         new Class1206(this.field4564 / 2 + 4 + 100, 185, 50, 20, new TranslationTextComponent("structure_block.button.load"), var1 -> {
            if (this.field6248.method3950() == Class104.field319) {
               this.method5508(Class1897.field11140);
               this.field4562.displayGuiScreen((Screen)null);
            }
         })
      );
      this.field6273 = this.<Class1206>method2455(new Class1206(this.field4564 / 2 - 4 - 150, 185, 50, 20, new StringTextComponent("MODE"), var1 -> {
         this.field6248.method3952();
         this.method5507();
      }));
      this.field6274 = this.<Class1206>method2455(
         new Class1206(this.field4564 / 2 + 4 + 100, 120, 50, 20, new TranslationTextComponent("structure_block.button.detect_size"), var1 -> {
            if (this.field6248.method3950() == Class104.field318) {
               this.method5508(Class1897.field11141);
               this.field4562.displayGuiScreen((Screen)null);
            }
         })
      );
      this.field6275 = this.<Class1206>method2455(new Class1206(this.field4564 / 2 + 4 + 100, 160, 50, 20, new StringTextComponent("ENTITIES"), var1 -> {
         this.field6248.method3954(!this.field6248.method3953());
         this.method5502();
      }));
      this.field6276 = this.<Class1206>method2455(new Class1206(this.field4564 / 2 - 20, 185, 40, 20, new StringTextComponent("MIRROR"), var1 -> {
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
      this.field6277 = this.<Class1206>method2455(new Class1206(this.field4564 / 2 + 4 + 100, 80, 50, 20, new StringTextComponent("SHOWAIR"), var1 -> {
         this.field6248.method3974(!this.field6248.method3973());
         this.method5503();
      }));
      this.field6278 = this.<Class1206>method2455(new Class1206(this.field4564 / 2 + 4 + 100, 80, 50, 20, new StringTextComponent("SHOWBB"), var1 -> {
         this.field6248.method3976(!this.field6248.method3975());
         this.method5504();
      }));
      this.field6269 = this.<Class1206>method2455(new Class1206(this.field4564 / 2 - 1 - 40 - 1 - 40 - 20, 185, 40, 20, new StringTextComponent("0"), var1 -> {
         this.field6248.method3947(Class80.field185);
         this.method5506();
      }));
      this.field6270 = this.<Class1206>method2455(new Class1206(this.field4564 / 2 - 1 - 40 - 20, 185, 40, 20, new StringTextComponent("90"), var1 -> {
         this.field6248.method3947(Class80.field186);
         this.method5506();
      }));
      this.field6271 = this.<Class1206>method2455(new Class1206(this.field4564 / 2 + 1 + 20, 185, 40, 20, new StringTextComponent("180"), var1 -> {
         this.field6248.method3947(Class80.field187);
         this.method5506();
      }));
      this.field6272 = this.<Class1206>method2455(new Class1206(this.field4564 / 2 + 1 + 40 + 1 + 20, 185, 40, 20, new StringTextComponent("270"), var1 -> {
         this.field6248.method3947(Class80.field188);
         this.method5506();
      }));
      this.field6255 = new Class1304(
         this, this.field4568, this.field4564 / 2 - 152, 40, 300, 20, new TranslationTextComponent("structure_block.structure_name")
      );
      this.field6255.method5657(64);
      this.field6255.method5635(this.field6248.method3934());
      this.field4561.add(this.field6255);
      BlockPos var3 = this.field6248.method3940();
      this.field6256 = new Class1189(this.field4568, this.field4564 / 2 - 152, 80, 80, 20, new TranslationTextComponent("structure_block.position.x"));
      this.field6256.method5657(15);
      this.field6256.method5635(Integer.toString(var3.getX()));
      this.field4561.add(this.field6256);
      this.field6257 = new Class1189(this.field4568, this.field4564 / 2 - 72, 80, 80, 20, new TranslationTextComponent("structure_block.position.y"));
      this.field6257.method5657(15);
      this.field6257.method5635(Integer.toString(var3.getY()));
      this.field4561.add(this.field6257);
      this.field6258 = new Class1189(this.field4568, this.field4564 / 2 + 8, 80, 80, 20, new TranslationTextComponent("structure_block.position.z"));
      this.field6258.method5657(15);
      this.field6258.method5635(Integer.toString(var3.getZ()));
      this.field4561.add(this.field6258);
      BlockPos var4 = this.field6248.method3942();
      this.field6259 = new Class1189(this.field4568, this.field4564 / 2 - 152, 120, 80, 20, new TranslationTextComponent("structure_block.size.x"));
      this.field6259.method5657(15);
      this.field6259.method5635(Integer.toString(var4.getX()));
      this.field4561.add(this.field6259);
      this.field6260 = new Class1189(this.field4568, this.field4564 / 2 - 72, 120, 80, 20, new TranslationTextComponent("structure_block.size.y"));
      this.field6260.method5657(15);
      this.field6260.method5635(Integer.toString(var4.getY()));
      this.field4561.add(this.field6260);
      this.field6261 = new Class1189(this.field4568, this.field4564 / 2 + 8, 120, 80, 20, new TranslationTextComponent("structure_block.size.z"));
      this.field6261.method5657(15);
      this.field6261.method5635(Integer.toString(var4.getZ()));
      this.field4561.add(this.field6261);
      this.field6262 = new Class1189(this.field4568, this.field4564 / 2 - 152, 120, 80, 20, new TranslationTextComponent("structure_block.integrity.integrity"));
      this.field6262.method5657(15);
      this.field6262.method5635(this.field6279.format((double)this.field6248.method3955()));
      this.field4561.add(this.field6262);
      this.field6263 = new Class1189(this.field4568, this.field4564 / 2 - 72, 120, 80, 20, new TranslationTextComponent("structure_block.integrity.seed"));
      this.field6263.method5657(31);
      this.field6263.method5635(Long.toString(this.field6248.method3957()));
      this.field4561.add(this.field6263);
      this.field6264 = new Class1189(this.field4568, this.field4564 / 2 - 152, 120, 240, 20, new TranslationTextComponent("structure_block.custom_data"));
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
      String var6 = this.field6255.method5636();
      String var7 = this.field6256.method5636();
      String var8 = this.field6257.method5636();
      String var9 = this.field6258.method5636();
      String var10 = this.field6259.method5636();
      String var11 = this.field6260.method5636();
      String var12 = this.field6261.method5636();
      String var13 = this.field6262.method5636();
      String var14 = this.field6263.method5636();
      String var15 = this.field6264.method5636();
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
      this.field4562.keyboardListener.method36347(false);
   }

   private void method5502() {
      this.field6275.method5743(DialogTexts.method22237(!this.field6248.method3953()));
   }

   private void method5503() {
      this.field6277.method5743(DialogTexts.method22237(this.field6248.method3973()));
   }

   private void method5504() {
      this.field6278.method5743(DialogTexts.method22237(this.field6248.method3975()));
   }

   private void method5505() {
      Class2089 var3 = this.field6248.method3944();
      switch (Class9686.field45294[var3.ordinal()]) {
         case 1:
            this.field6276.method5743(new StringTextComponent("|"));
            break;
         case 2:
            this.field6276.method5743(new StringTextComponent("< >"));
            break;
         case 3:
            this.field6276.method5743(new StringTextComponent("^ v"));
      }
   }

   private void method5506() {
      this.field6269.field6482 = true;
      this.field6270.field6482 = true;
      this.field6271.field6482 = true;
      this.field6272.field6482 = true;
      switch (Class9686.field45295[this.field6248.method3946().ordinal()]) {
         case 1:
            this.field6269.field6482 = false;
            break;
         case 2:
            this.field6271.field6482 = false;
            break;
         case 3:
            this.field6272.field6482 = false;
            break;
         case 4:
            this.field6270.field6482 = false;
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

      this.field6273.method5743(new TranslationTextComponent("structure_block.mode." + this.field6248.method3950().method257()));
   }

   private boolean method5508(Class1897 var1) {
      BlockPos var4 = new BlockPos(
         this.method5511(this.field6256.method5636()), this.method5511(this.field6257.method5636()), this.method5511(this.field6258.method5636())
      );
      BlockPos var5 = new BlockPos(
         this.method5511(this.field6259.method5636()), this.method5511(this.field6260.method5636()), this.method5511(this.field6261.method5636())
      );
      float var6 = this.method5510(this.field6262.method5636());
      long var7 = this.method5509(this.field6263.method5636());
      this.field4562
         .getConnection()
         .sendPacket(
            new Class5601(
               this.field6248.getPos(),
               var1,
               this.field6248.method3950(),
               this.field6255.method5636(),
               var4,
               var5,
               this.field6248.method3944(),
               this.field6248.method3946(),
               this.field6264.method5636(),
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
   public boolean method1920(int var1, int var2, int var3) {
      if (!super.method1920(var1, var2, var3)) {
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
   public void method1923(MatrixStack var1, int var2, int var3, float var4) {
      this.method2469(var1);
      Class104 var7 = this.field6248.method3950();
      method5691(var1, this.field4568, this.field4560, this.field4564 / 2, 10, 16777215);
      if (var7 != Class104.field321) {
         method5693(var1, this.field4568, field6239, this.field4564 / 2 - 153, 30, 10526880);
         this.field6255.method1923(var1, var2, var3, var4);
      }

      if (var7 == Class104.field319 || var7 == Class104.field318) {
         method5693(var1, this.field4568, field6240, this.field4564 / 2 - 153, 70, 10526880);
         this.field6256.method1923(var1, var2, var3, var4);
         this.field6257.method1923(var1, var2, var3, var4);
         this.field6258.method1923(var1, var2, var3, var4);
         method5693(var1, this.field4568, field6244, this.field4564 / 2 + 154 - this.field4568.method38821(field6244), 150, 10526880);
      }

      if (var7 == Class104.field318) {
         method5693(var1, this.field4568, field6241, this.field4564 / 2 - 153, 110, 10526880);
         this.field6259.method1923(var1, var2, var3, var4);
         this.field6260.method1923(var1, var2, var3, var4);
         this.field6261.method1923(var1, var2, var3, var4);
         method5693(var1, this.field4568, field6245, this.field4564 / 2 + 154 - this.field4568.method38821(field6245), 110, 10526880);
         method5693(var1, this.field4568, field6246, this.field4564 / 2 + 154 - this.field4568.method38821(field6246), 70, 10526880);
      }

      if (var7 == Class104.field319) {
         method5693(var1, this.field4568, field6242, this.field4564 / 2 - 153, 110, 10526880);
         this.field6262.method1923(var1, var2, var3, var4);
         this.field6263.method1923(var1, var2, var3, var4);
         method5693(var1, this.field4568, field6247, this.field4564 / 2 + 154 - this.field4568.method38821(field6247), 70, 10526880);
      }

      if (var7 == Class104.field321) {
         method5693(var1, this.field4568, field6243, this.field4564 / 2 - 153, 110, 10526880);
         this.field6264.method1923(var1, var2, var3, var4);
      }

      method5693(var1, this.field4568, var7.method295(), this.field4564 / 2 - 153, 174, 10526880);
      super.method1923(var1, var2, var3, var4);
   }

   @Override
   public boolean isPauseScreen() {
      return false;
   }
}
