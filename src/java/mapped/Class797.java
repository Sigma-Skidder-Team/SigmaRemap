package mapped;

import com.google.common.collect.Sets;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashSet;

public class Class797 extends Class798 implements Class796 {
   private static final Logger field4156 = LogManager.getLogger();
   private final Screen field4157;
   private volatile ITextComponent field4158 = StringTextComponent.EMPTY;
   private volatile ITextComponent field4159;
   private volatile boolean field4160;
   private int field4161;
   private final Class789 field4162;
   private final int field4163 = 212;
   public static final String[] field4164 = new String[]{
      "▃ ▄ ▅ ▆ ▇ █ ▇ ▆ ▅ ▄ ▃",
      "_ ▃ ▄ ▅ ▆ ▇ █ ▇ ▆ ▅ ▄",
      "_ _ ▃ ▄ ▅ ▆ ▇ █ ▇ ▆ ▅",
      "_ _ _ ▃ ▄ ▅ ▆ ▇ █ ▇ ▆",
      "_ _ _ _ ▃ ▄ ▅ ▆ ▇ █ ▇",
      "_ _ _ _ _ ▃ ▄ ▅ ▆ ▇ █",
      "_ _ _ _ ▃ ▄ ▅ ▆ ▇ █ ▇",
      "_ _ _ ▃ ▄ ▅ ▆ ▇ █ ▇ ▆",
      "_ _ ▃ ▄ ▅ ▆ ▇ █ ▇ ▆ ▅",
      "_ ▃ ▄ ▅ ▆ ▇ █ ▇ ▆ ▅ ▄",
      "▃ ▄ ▅ ▆ ▇ █ ▇ ▆ ▅ ▄ ▃",
      "▄ ▅ ▆ ▇ █ ▇ ▆ ▅ ▄ ▃ _",
      "▅ ▆ ▇ █ ▇ ▆ ▅ ▄ ▃ _ _",
      "▆ ▇ █ ▇ ▆ ▅ ▄ ▃ _ _ _",
      "▇ █ ▇ ▆ ▅ ▄ ▃ _ _ _ _",
      "█ ▇ ▆ ▅ ▄ ▃ _ _ _ _ _",
      "▇ █ ▇ ▆ ▅ ▄ ▃ _ _ _ _",
      "▆ ▇ █ ▇ ▆ ▅ ▄ ▃ _ _ _",
      "▅ ▆ ▇ █ ▇ ▆ ▅ ▄ ▃ _ _",
      "▄ ▅ ▆ ▇ █ ▇ ▆ ▅ ▄ ▃ _"
   };

   public Class797(Screen var1, Class789 var2) {
      this.field4157 = var1;
      this.field4162 = var2;
      var2.method1906(this);
      Thread var5 = new Thread(var2, "Realms-long-running-task");
      var5.setUncaughtExceptionHandler(new Class6034(field4156));
      var5.start();
   }

   @Override
   public void method1919() {
      super.method1919();
      Class9229.method34716(this.field4158.getString());
      this.field4161++;
      this.field4162.method1910();
   }

   @Override
   public boolean method1920(int var1, int var2, int var3) {
      if (var1 != 256) {
         return super.method1920(var1, var2, var3);
      } else {
         this.method1922();
         return true;
      }
   }

   @Override
   public void method1921() {
      this.field4162.method1911();
      this.<Class1206>method2455(new Class1206(this.field4564 / 2 - 106, method1929(12), 212, 20, Class7127.field30659, var1 -> this.method1922()));
   }

   private void method1922() {
      this.field4160 = true;
      this.field4162.method1912();
      this.field4562.displayGuiScreen(this.field4157);
   }

   @Override
   public void method1923(MatrixStack var1, int var2, int var3, float var4) {
      this.method2469(var1);
      method5691(var1, this.field4568, this.field4158, this.field4564 / 2, method1929(3), 16777215);
      ITextComponent var7 = this.field4159;
      if (var7 != null) {
         method5691(var1, this.field4568, var7, this.field4564 / 2, method1929(8), 16711680);
      } else {
         method5690(var1, this.field4568, field4164[this.field4161 % field4164.length], this.field4564 / 2, method1929(8), 8421504);
      }

      super.method1923(var1, var2, var3, var4);
   }

   @Override
   public void method1907(ITextComponent var1) {
      this.field4159 = var1;
      Class9229.method34711(var1.getString());
      this.method1924();
      this.<Class1206>method2455(
         new Class1206(this.field4564 / 2 - 106, this.field4565 / 4 + 120 + 12, 200, 20, Class7127.field30663, var1x -> this.method1922())
      );
   }

   private void method1924() {
      HashSet var3 = Sets.newHashSet(this.field4566);
      this.field4561.removeIf(var3::contains);
      this.field4566.clear();
   }

   public void method1925(ITextComponent var1) {
      this.field4158 = var1;
   }

   public boolean method1926() {
      return this.field4160;
   }
}
