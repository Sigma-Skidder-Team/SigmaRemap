package mapped;

import net.minecraft.client.gui.DialogTexts;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class1343 extends Class798 {
   public static final ITextComponent[] field7132 = new ITextComponent[]{
      new TranslationTextComponent("options.difficulty.peaceful"),
      new TranslationTextComponent("options.difficulty.easy"),
      new TranslationTextComponent("options.difficulty.normal"),
      new TranslationTextComponent("options.difficulty.hard")
   };
   public static final ITextComponent[] field7133 = new ITextComponent[]{
      new TranslationTextComponent("selectWorld.gameMode.survival"),
      new TranslationTextComponent("selectWorld.gameMode.creative"),
      new TranslationTextComponent("selectWorld.gameMode.adventure")
   };
   private static final ITextComponent field7134 = new TranslationTextComponent("mco.configure.world.on");
   private static final ITextComponent field7135 = new TranslationTextComponent("mco.configure.world.off");
   private static final ITextComponent field7136 = new TranslationTextComponent("selectWorld.gameMode");
   private static final ITextComponent field7137 = new TranslationTextComponent("mco.configure.world.edit.slot.name");
   private Class1189 field7138;
   public final Class815 field7139;
   private int field7140;
   private int field7141;
   private int field7142;
   private final Class6125 field7143;
   private final Class2049 field7144;
   private final int field7145;
   private int field7146;
   private int field7147;
   private Boolean field7148;
   private Boolean field7149;
   private Boolean field7150;
   private Boolean field7151;
   private Integer field7152;
   private Boolean field7153;
   private Boolean field7154;
   private Class1206 field7155;
   private Class1206 field7156;
   private Class1206 field7157;
   private Class1206 field7158;
   private Class1237 field7159;
   private Class1206 field7160;
   private Class1206 field7161;
   private Class1153 field7162;
   private Class1153 field7163;

   public Class1343(Class815 var1, Class6125 var2, Class2049 var3, int var4) {
      this.field7139 = var1;
      this.field7143 = var2;
      this.field7144 = var3;
      this.field7145 = var4;
   }

   @Override
   public void onClose() {
      this.field4562.keyboardListener.method36347(false);
   }

   @Override
   public void tick() {
      this.field7138.method5633();
   }

   @Override
   public boolean method1920(int var1, int var2, int var3) {
      if (var1 != 256) {
         return super.method1920(var1, var2, var3);
      } else {
         this.field4562.displayGuiScreen(this.field7139);
         return true;
      }
   }

   @Override
   public void method1921() {
      this.field7141 = 170;
      this.field7140 = this.field4564 / 2 - this.field7141;
      this.field7142 = this.field4564 / 2 + 10;
      this.field7146 = this.field7143.field27428;
      this.field7147 = this.field7143.field27429;
      if (this.field7144 != Class2049.field13369) {
         TranslationTextComponent var3;
         if (this.field7144 != Class2049.field13371) {
            if (this.field7144 != Class2049.field13373) {
               var3 = new TranslationTextComponent("mco.configure.world.edit.subscreen.experience");
            } else {
               var3 = new TranslationTextComponent("mco.configure.world.edit.subscreen.inspiration");
            }
         } else {
            var3 = new TranslationTextComponent("mco.configure.world.edit.subscreen.adventuremap");
         }

         this.field7163 = new Class1153(var3, this.field4564 / 2, 26, 16711680);
         this.field7148 = true;
         this.field7152 = 0;
         this.field7154 = false;
         this.field7150 = true;
         this.field7151 = true;
         this.field7149 = true;
         this.field7153 = true;
      } else {
         this.field7148 = this.field7143.field27421;
         this.field7152 = this.field7143.field27425;
         this.field7154 = this.field7143.field27427;
         this.field7150 = this.field7143.field27422;
         this.field7151 = this.field7143.field27423;
         this.field7149 = this.field7143.field27424;
         this.field7153 = this.field7143.field27426;
      }

      this.field7138 = new Class1189(
         this.field4562.fontRenderer,
         this.field7140 + 2,
         method1929(1),
         this.field7141 - 4,
         20,
         (Class1189)null,
         new TranslationTextComponent("mco.configure.world.edit.slot.name")
      );
      this.field7138.method5657(10);
      this.field7138.method5635(this.field7143.method18901(this.field7145));
      this.method5537(this.field7138);
      this.field7155 = this.<Class1206>method2455(new Class1206(this.field7142, method1929(1), this.field7141, 20, this.method6437(), var1 -> {
         this.field7148 = !this.field7148;
         var1.method5743(this.method6437());
      }));
      this.<Class1206>method2455(new Class1206(this.field7140, method1929(3), this.field7141, 20, this.method6436(), var1 -> {
         this.field7147 = (this.field7147 + 1) % field7133.length;
         var1.method5743(this.method6436());
      }));
      this.field7156 = this.<Class1206>method2455(new Class1206(this.field7142, method1929(3), this.field7141, 20, this.method6438(), var1 -> {
         this.field7150 = !this.field7150;
         var1.method5743(this.method6438());
      }));
      this.<Class1206>method2455(new Class1206(this.field7140, method1929(5), this.field7141, 20, this.method6435(), var1 -> {
         this.field7146 = (this.field7146 + 1) % field7132.length;
         var1.method5743(this.method6435());
         if (this.field7144 == Class2049.field13369) {
            this.field7157.field6482 = this.field7146 != 0;
            this.field7157.method5743(this.method6439());
         }
      }));
      this.field7157 = this.<Class1206>method2455(new Class1206(this.field7142, method1929(5), this.field7141, 20, this.method6439(), var1 -> {
         this.field7151 = !this.field7151;
         var1.method5743(this.method6439());
      }));
      this.field7159 = this.<Class1237>method2455(new Class1237(this, this.field7140, method1929(7), this.field7141, this.field7152, 0.0F, 16.0F));
      this.field7158 = this.<Class1206>method2455(new Class1206(this.field7142, method1929(7), this.field7141, 20, this.method6440(), var1 -> {
         this.field7149 = !this.field7149;
         var1.method5743(this.method6440());
      }));
      this.field7161 = this.<Class1206>method2455(new Class1206(this.field7140, method1929(9), this.field7141, 20, this.method6442(), var1 -> {
         this.field7154 = !this.field7154;
         var1.method5743(this.method6442());
      }));
      this.field7160 = this.<Class1206>method2455(new Class1206(this.field7142, method1929(9), this.field7141, 20, this.method6441(), var1 -> {
         this.field7153 = !this.field7153;
         var1.method5743(this.method6441());
      }));
      if (this.field7144 != Class2049.field13369) {
         this.field7155.field6482 = false;
         this.field7156.field6482 = false;
         this.field7158.field6482 = false;
         this.field7157.field6482 = false;
         this.field7159.field6482 = false;
         this.field7160.field6482 = false;
         this.field7161.field6482 = false;
      }

      if (this.field7146 == 0) {
         this.field7157.field6482 = false;
      }

      this.<Class1206>method2455(
         new Class1206(
            this.field7140, method1929(13), this.field7141, 20, new TranslationTextComponent("mco.configure.world.buttons.done"), var1 -> this.method6445()
         )
      );
      this.<Class1206>method2455(
         new Class1206(this.field7142, method1929(13), this.field7141, 20, DialogTexts.GUI_CANCEL, var1 -> this.field4562.displayGuiScreen(this.field7139))
      );
      this.<Class1189>method2456(this.field7138);
      this.field7162 = this.<Class1153>method2456(
         new Class1153(new TranslationTextComponent("mco.configure.world.buttons.options"), this.field4564 / 2, 17, 16777215)
      );
      if (this.field7163 != null) {
         this.<Class1153>method2456(this.field7163);
      }

      this.method1930();
   }

   private ITextComponent method6435() {
      return new TranslationTextComponent("options.difficulty").appendString(": ").append(field7132[this.field7146]);
   }

   private ITextComponent method6436() {
      return new TranslationTextComponent("options.generic_value", field7136, field7133[this.field7147]);
   }

   private ITextComponent method6437() {
      return new TranslationTextComponent("mco.configure.world.pvp").appendString(": ").append(method6443(this.field7148));
   }

   private ITextComponent method6438() {
      return new TranslationTextComponent("mco.configure.world.spawnAnimals").appendString(": ").append(method6443(this.field7150));
   }

   private ITextComponent method6439() {
      return this.field7146 != 0
         ? new TranslationTextComponent("mco.configure.world.spawnMonsters").appendString(": ").append(method6443(this.field7151))
         : new TranslationTextComponent("mco.configure.world.spawnMonsters").appendString(": ").append(new TranslationTextComponent("mco.configure.world.off"));
   }

   private ITextComponent method6440() {
      return new TranslationTextComponent("mco.configure.world.spawnNPCs").appendString(": ").append(method6443(this.field7149));
   }

   private ITextComponent method6441() {
      return new TranslationTextComponent("mco.configure.world.commandBlocks").appendString(": ").append(method6443(this.field7153));
   }

   private ITextComponent method6442() {
      return new TranslationTextComponent("mco.configure.world.forceGameMode").appendString(": ").append(method6443(this.field7154));
   }

   private static ITextComponent method6443(boolean var0) {
      return !var0 ? field7135 : field7134;
   }

   @Override
   public void method1923(MatrixStack var1, int var2, int var3, float var4) {
      this.method2469(var1);
      this.field4568
         .method38805(
            var1, field7137, (float)(this.field7140 + this.field7141 / 2 - this.field4568.method38821(field7137) / 2), (float)(method1929(0) - 5), 16777215
         );
      this.field7162.method5542(this, var1);
      if (this.field7163 != null) {
         this.field7163.method5542(this, var1);
      }

      this.field7138.method1923(var1, var2, var3, var4);
      super.method1923(var1, var2, var3, var4);
   }

   private String method6444() {
      return !this.field7138.method5636().equals(this.field7143.method18902(this.field7145)) ? this.field7138.method5636() : "";
   }

   private void method6445() {
      if (this.field7144 != Class2049.field13371 && this.field7144 != Class2049.field13372 && this.field7144 != Class2049.field13373) {
         this.field7139
            .method2293(
               new Class6125(
                  this.field7148,
                  this.field7150,
                  this.field7151,
                  this.field7149,
                  this.field7152,
                  this.field7153,
                  this.field7146,
                  this.field7147,
                  this.field7154,
                  this.method6444()
               )
            );
      } else {
         this.field7139
            .method2293(
               new Class6125(
                  this.field7143.field27421,
                  this.field7143.field27422,
                  this.field7143.field27423,
                  this.field7143.field27424,
                  this.field7143.field27425,
                  this.field7143.field27426,
                  this.field7146,
                  this.field7147,
                  this.field7143.field27427,
                  this.method6444()
               )
            );
      }
   }

   // $VF: synthetic method
   public static Class1237 method6456(Class1343 var0) {
      return var0.field7159;
   }

   // $VF: synthetic method
   public static Integer method6457(Class1343 var0, Integer var1) {
      return var0.field7152 = var1;
   }

   // $VF: synthetic method
   public static Integer method6458(Class1343 var0) {
      return var0.field7152;
   }
}
