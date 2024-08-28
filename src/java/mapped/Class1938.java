package mapped;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.function.BiFunction;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.LanguageMap;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.lwjgl.glfw.GLFW;

public enum Class1938 {
   field12592("key.keyboard", (var0, var1) -> {
      String var4 = GLFW.glfwGetKeyName(var0, -1);
      return var4 == null ? new TranslationTextComponent(var1) : new StringTextComponent(var4);
   }),
   field12593("scancode", (var0, var1) -> {
      String var4 = GLFW.glfwGetKeyName(-1, var0);
      return var4 == null ? new TranslationTextComponent(var1) : new StringTextComponent(var4);
   }),
   field12594("key.mouse",
      (var0, var1) -> !LanguageMap.getInstance().func_230506_b_(var1)
            ? new TranslationTextComponent("key.mouse", var0 + 1)
            : new TranslationTextComponent(var1)
   );

   private final Int2ObjectMap<Class8115> field12595 = new Int2ObjectOpenHashMap();
   private final String field12596;
   private final BiFunction<Integer, String, ITextComponent> field12597;
   private static final Class1938[] field12598 = new Class1938[]{field12592, field12593, field12594};

   private static void method8196(Class1938 var0, String var1, int var2) {
      Class8115 var5 = new Class8115(var1, var0, var2);
      var0.field12595.put(var2, var5);
   }

   private Class1938(String var3, BiFunction<Integer, String, ITextComponent> var4) {
      this.field12596 = var3;
      this.field12597 = var4;
   }

   public Class8115 method8197(int var1) {
      return (Class8115)this.field12595.computeIfAbsent(var1, var1x -> {
         int var4 = var1x;
         if (this == field12594) {
            var4 = var1x + 1;
         }

         String var5 = this.field12596 + "." + var4;
         return new Class8115(var5, this, var1x);
      });
   }

   // $VF: synthetic method
   public static String method8202(Class1938 var0) {
      return var0.field12596;
   }

   // $VF: synthetic method
   public static BiFunction method8203(Class1938 var0) {
      return var0.field12597;
   }

   static {
      method8196(field12592, "key.keyboard.unknown", -1);
      method8196(field12594, "key.mouse.left", 0);
      method8196(field12594, "key.mouse.right", 1);
      method8196(field12594, "key.mouse.middle", 2);
      method8196(field12594, "key.mouse.4", 3);
      method8196(field12594, "key.mouse.5", 4);
      method8196(field12594, "key.mouse.6", 5);
      method8196(field12594, "key.mouse.7", 6);
      method8196(field12594, "key.mouse.8", 7);
      method8196(field12592, "key.keyboard.0", 48);
      method8196(field12592, "key.keyboard.1", 49);
      method8196(field12592, "key.keyboard.2", 50);
      method8196(field12592, "key.keyboard.3", 51);
      method8196(field12592, "key.keyboard.4", 52);
      method8196(field12592, "key.keyboard.5", 53);
      method8196(field12592, "key.keyboard.6", 54);
      method8196(field12592, "key.keyboard.7", 55);
      method8196(field12592, "key.keyboard.8", 56);
      method8196(field12592, "key.keyboard.9", 57);
      method8196(field12592, "key.keyboard.a", 65);
      method8196(field12592, "key.keyboard.b", 66);
      method8196(field12592, "key.keyboard.c", 67);
      method8196(field12592, "key.keyboard.d", 68);
      method8196(field12592, "key.keyboard.e", 69);
      method8196(field12592, "key.keyboard.f", 70);
      method8196(field12592, "key.keyboard.g", 71);
      method8196(field12592, "key.keyboard.h", 72);
      method8196(field12592, "key.keyboard.i", 73);
      method8196(field12592, "key.keyboard.j", 74);
      method8196(field12592, "key.keyboard.k", 75);
      method8196(field12592, "key.keyboard.l", 76);
      method8196(field12592, "key.keyboard.m", 77);
      method8196(field12592, "key.keyboard.n", 78);
      method8196(field12592, "key.keyboard.o", 79);
      method8196(field12592, "key.keyboard.p", 80);
      method8196(field12592, "key.keyboard.q", 81);
      method8196(field12592, "key.keyboard.r", 82);
      method8196(field12592, "key.keyboard.s", 83);
      method8196(field12592, "key.keyboard.t", 84);
      method8196(field12592, "key.keyboard.u", 85);
      method8196(field12592, "key.keyboard.v", 86);
      method8196(field12592, "key.keyboard.w", 87);
      method8196(field12592, "key.keyboard.x", 88);
      method8196(field12592, "key.keyboard.y", 89);
      method8196(field12592, "key.keyboard.z", 90);
      method8196(field12592, "key.keyboard.f1", 290);
      method8196(field12592, "key.keyboard.f2", 291);
      method8196(field12592, "key.keyboard.f3", 292);
      method8196(field12592, "key.keyboard.f4", 293);
      method8196(field12592, "key.keyboard.f5", 294);
      method8196(field12592, "key.keyboard.f6", 295);
      method8196(field12592, "key.keyboard.f7", 296);
      method8196(field12592, "key.keyboard.f8", 297);
      method8196(field12592, "key.keyboard.f9", 298);
      method8196(field12592, "key.keyboard.f10", 299);
      method8196(field12592, "key.keyboard.f11", 300);
      method8196(field12592, "key.keyboard.f12", 301);
      method8196(field12592, "key.keyboard.f13", 302);
      method8196(field12592, "key.keyboard.f14", 303);
      method8196(field12592, "key.keyboard.f15", 304);
      method8196(field12592, "key.keyboard.f16", 305);
      method8196(field12592, "key.keyboard.f17", 306);
      method8196(field12592, "key.keyboard.f18", 307);
      method8196(field12592, "key.keyboard.f19", 308);
      method8196(field12592, "key.keyboard.f20", 309);
      method8196(field12592, "key.keyboard.f21", 310);
      method8196(field12592, "key.keyboard.f22", 311);
      method8196(field12592, "key.keyboard.f23", 312);
      method8196(field12592, "key.keyboard.f24", 313);
      method8196(field12592, "key.keyboard.f25", 314);
      method8196(field12592, "key.keyboard.num.lock", 282);
      method8196(field12592, "key.keyboard.keypad.0", 320);
      method8196(field12592, "key.keyboard.keypad.1", 321);
      method8196(field12592, "key.keyboard.keypad.2", 322);
      method8196(field12592, "key.keyboard.keypad.3", 323);
      method8196(field12592, "key.keyboard.keypad.4", 324);
      method8196(field12592, "key.keyboard.keypad.5", 325);
      method8196(field12592, "key.keyboard.keypad.6", 326);
      method8196(field12592, "key.keyboard.keypad.7", 327);
      method8196(field12592, "key.keyboard.keypad.8", 328);
      method8196(field12592, "key.keyboard.keypad.9", 329);
      method8196(field12592, "key.keyboard.keypad.add", 334);
      method8196(field12592, "key.keyboard.keypad.decimal", 330);
      method8196(field12592, "key.keyboard.keypad.enter", 335);
      method8196(field12592, "key.keyboard.keypad.equal", 336);
      method8196(field12592, "key.keyboard.keypad.multiply", 332);
      method8196(field12592, "key.keyboard.keypad.divide", 331);
      method8196(field12592, "key.keyboard.keypad.subtract", 333);
      method8196(field12592, "key.keyboard.down", 264);
      method8196(field12592, "key.keyboard.left", 263);
      method8196(field12592, "key.keyboard.right", 262);
      method8196(field12592, "key.keyboard.up", 265);
      method8196(field12592, "key.keyboard.apostrophe", 39);
      method8196(field12592, "key.keyboard.backslash", 92);
      method8196(field12592, "key.keyboard.comma", 44);
      method8196(field12592, "key.keyboard.equal", 61);
      method8196(field12592, "key.keyboard.grave.accent", 96);
      method8196(field12592, "key.keyboard.left.bracket", 91);
      method8196(field12592, "key.keyboard.minus", 45);
      method8196(field12592, "key.keyboard.period", 46);
      method8196(field12592, "key.keyboard.right.bracket", 93);
      method8196(field12592, "key.keyboard.semicolon", 59);
      method8196(field12592, "key.keyboard.slash", 47);
      method8196(field12592, "key.keyboard.space", 32);
      method8196(field12592, "key.keyboard.tab", 258);
      method8196(field12592, "key.keyboard.left.alt", 342);
      method8196(field12592, "key.keyboard.left.control", 341);
      method8196(field12592, "key.keyboard.left.shift", 340);
      method8196(field12592, "key.keyboard.left.win", 343);
      method8196(field12592, "key.keyboard.right.alt", 346);
      method8196(field12592, "key.keyboard.right.control", 345);
      method8196(field12592, "key.keyboard.right.shift", 344);
      method8196(field12592, "key.keyboard.right.win", 347);
      method8196(field12592, "key.keyboard.enter", 257);
      method8196(field12592, "key.keyboard.escape", 256);
      method8196(field12592, "key.keyboard.backspace", 259);
      method8196(field12592, "key.keyboard.delete", 261);
      method8196(field12592, "key.keyboard.end", 269);
      method8196(field12592, "key.keyboard.home", 268);
      method8196(field12592, "key.keyboard.insert", 260);
      method8196(field12592, "key.keyboard.page.down", 267);
      method8196(field12592, "key.keyboard.page.up", 266);
      method8196(field12592, "key.keyboard.caps.lock", 280);
      method8196(field12592, "key.keyboard.pause", 284);
      method8196(field12592, "key.keyboard.scroll.lock", 281);
      method8196(field12592, "key.keyboard.menu", 348);
      method8196(field12592, "key.keyboard.print.screen", 283);
      method8196(field12592, "key.keyboard.world.1", 161);
      method8196(field12592, "key.keyboard.world.2", 162);
   }
}
