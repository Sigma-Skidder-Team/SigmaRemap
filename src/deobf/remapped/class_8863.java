package remapped;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.function.BiFunction;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.LanguageMap;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.lwjgl.glfw.GLFW;

public enum class_8863 {
   field_45319("key.keyboard", (var0, var1) -> {
      String var4 = GLFW.glfwGetKeyName(var0, -1);
      return (ITextComponent)(var4 == null ? new TranslationTextComponent(var1) : new StringTextComponent(var4));
   }),
   field_45315("scancode", (var0, var1) -> {
      String var4 = GLFW.glfwGetKeyName(-1, var0);
      return (ITextComponent)(var4 == null ? new TranslationTextComponent(var1) : new StringTextComponent(var4));
   }),
   field_45320(
      field_45321[1],
      (var0, var1) -> !LanguageMap.getInstance().func_230506_b_(var1)
            ? new TranslationTextComponent("key.mouse", var0 + 1)
            : new TranslationTextComponent(var1)
   );

   private final Int2ObjectMap<class_3654> field_45318 = new Int2ObjectOpenHashMap();
   private final String field_45322;
   private final BiFunction<Integer, String, ITextComponent> field_45317;

   private static void method_40760(class_8863 var0, String var1, int var2) {
      class_3654 var5 = new class_3654(var1, var0, var2, null);
      var0.field_45318.put(var2, var5);
   }

   private class_8863(String var3, BiFunction<Integer, String, ITextComponent> var4) {
      this.field_45322 = var3;
      this.field_45317 = var4;
   }

   public class_3654 method_40758(int var1) {
      return (class_3654)this.field_45318.computeIfAbsent(var1, var1x -> {
         int var4 = var1x;
         if (this == field_45320) {
            var4 = var1x + 1;
         }

         String var5 = this.field_45322 + "." + var4;
         return new class_3654(var5, this, var1x, null);
      });
   }

   static {
      method_40760(field_45319, "key.keyboard.unknown", -1);
      method_40760(field_45320, "key.mouse.left", 0);
      method_40760(field_45320, "key.mouse.right", 1);
      method_40760(field_45320, "key.mouse.middle", 2);
      method_40760(field_45320, "key.mouse.4", 3);
      method_40760(field_45320, "key.mouse.5", 4);
      method_40760(field_45320, "key.mouse.6", 5);
      method_40760(field_45320, "key.mouse.7", 6);
      method_40760(field_45320, "key.mouse.8", 7);
      method_40760(field_45319, "key.keyboard.0", 48);
      method_40760(field_45319, "key.keyboard.1", 49);
      method_40760(field_45319, "key.keyboard.2", 50);
      method_40760(field_45319, "key.keyboard.3", 51);
      method_40760(field_45319, "key.keyboard.4", 52);
      method_40760(field_45319, "key.keyboard.5", 53);
      method_40760(field_45319, "key.keyboard.6", 54);
      method_40760(field_45319, "key.keyboard.7", 55);
      method_40760(field_45319, "key.keyboard.8", 56);
      method_40760(field_45319, "key.keyboard.9", 57);
      method_40760(field_45319, "key.keyboard.a", 65);
      method_40760(field_45319, "key.keyboard.b", 66);
      method_40760(field_45319, "key.keyboard.c", 67);
      method_40760(field_45319, "key.keyboard.d", 68);
      method_40760(field_45319, "key.keyboard.e", 69);
      method_40760(field_45319, "key.keyboard.f", 70);
      method_40760(field_45319, "key.keyboard.g", 71);
      method_40760(field_45319, "key.keyboard.h", 72);
      method_40760(field_45319, "key.keyboard.i", 73);
      method_40760(field_45319, "key.keyboard.j", 74);
      method_40760(field_45319, "key.keyboard.k", 75);
      method_40760(field_45319, "key.keyboard.l", 76);
      method_40760(field_45319, "key.keyboard.m", 77);
      method_40760(field_45319, "key.keyboard.n", 78);
      method_40760(field_45319, "key.keyboard.o", 79);
      method_40760(field_45319, "key.keyboard.p", 80);
      method_40760(field_45319, "key.keyboard.q", 81);
      method_40760(field_45319, "key.keyboard.r", 82);
      method_40760(field_45319, "key.keyboard.s", 83);
      method_40760(field_45319, "key.keyboard.t", 84);
      method_40760(field_45319, "key.keyboard.u", 85);
      method_40760(field_45319, "key.keyboard.v", 86);
      method_40760(field_45319, "key.keyboard.w", 87);
      method_40760(field_45319, "key.keyboard.x", 88);
      method_40760(field_45319, "key.keyboard.y", 89);
      method_40760(field_45319, "key.keyboard.z", 90);
      method_40760(field_45319, "key.keyboard.f1", 290);
      method_40760(field_45319, "key.keyboard.f2", 291);
      method_40760(field_45319, "key.keyboard.f3", 292);
      method_40760(field_45319, "key.keyboard.f4", 293);
      method_40760(field_45319, "key.keyboard.f5", 294);
      method_40760(field_45319, "key.keyboard.f6", 295);
      method_40760(field_45319, "key.keyboard.f7", 296);
      method_40760(field_45319, "key.keyboard.f8", 297);
      method_40760(field_45319, "key.keyboard.f9", 298);
      method_40760(field_45319, "key.keyboard.f10", 299);
      method_40760(field_45319, "key.keyboard.f11", 300);
      method_40760(field_45319, "key.keyboard.f12", 301);
      method_40760(field_45319, "key.keyboard.f13", 302);
      method_40760(field_45319, "key.keyboard.f14", 303);
      method_40760(field_45319, "key.keyboard.f15", 304);
      method_40760(field_45319, "key.keyboard.f16", 305);
      method_40760(field_45319, "key.keyboard.f17", 306);
      method_40760(field_45319, "key.keyboard.f18", 307);
      method_40760(field_45319, "key.keyboard.f19", 308);
      method_40760(field_45319, "key.keyboard.f20", 309);
      method_40760(field_45319, "key.keyboard.f21", 310);
      method_40760(field_45319, "key.keyboard.f22", 311);
      method_40760(field_45319, "key.keyboard.f23", 312);
      method_40760(field_45319, "key.keyboard.f24", 313);
      method_40760(field_45319, "key.keyboard.f25", 314);
      method_40760(field_45319, "key.keyboard.num.lock", 282);
      method_40760(field_45319, "key.keyboard.keypad.0", 320);
      method_40760(field_45319, "key.keyboard.keypad.1", 321);
      method_40760(field_45319, "key.keyboard.keypad.2", 322);
      method_40760(field_45319, "key.keyboard.keypad.3", 323);
      method_40760(field_45319, "key.keyboard.keypad.4", 324);
      method_40760(field_45319, "key.keyboard.keypad.5", 325);
      method_40760(field_45319, "key.keyboard.keypad.6", 326);
      method_40760(field_45319, "key.keyboard.keypad.7", 327);
      method_40760(field_45319, "key.keyboard.keypad.8", 328);
      method_40760(field_45319, "key.keyboard.keypad.9", 329);
      method_40760(field_45319, "key.keyboard.keypad.add", 334);
      method_40760(field_45319, "key.keyboard.keypad.decimal", 330);
      method_40760(field_45319, "key.keyboard.keypad.enter", 335);
      method_40760(field_45319, "key.keyboard.keypad.equal", 336);
      method_40760(field_45319, "key.keyboard.keypad.multiply", 332);
      method_40760(field_45319, "key.keyboard.keypad.divide", 331);
      method_40760(field_45319, "key.keyboard.keypad.subtract", 333);
      method_40760(field_45319, "key.keyboard.down", 264);
      method_40760(field_45319, "key.keyboard.left", 263);
      method_40760(field_45319, "key.keyboard.right", 262);
      method_40760(field_45319, "key.keyboard.up", 265);
      method_40760(field_45319, "key.keyboard.apostrophe", 39);
      method_40760(field_45319, "key.keyboard.backslash", 92);
      method_40760(field_45319, "key.keyboard.comma", 44);
      method_40760(field_45319, "key.keyboard.equal", 61);
      method_40760(field_45319, "key.keyboard.grave.accent", 96);
      method_40760(field_45319, "key.keyboard.left.bracket", 91);
      method_40760(field_45319, "key.keyboard.minus", 45);
      method_40760(field_45319, "key.keyboard.period", 46);
      method_40760(field_45319, "key.keyboard.right.bracket", 93);
      method_40760(field_45319, "key.keyboard.semicolon", 59);
      method_40760(field_45319, "key.keyboard.slash", 47);
      method_40760(field_45319, "key.keyboard.space", 32);
      method_40760(field_45319, "key.keyboard.tab", 258);
      method_40760(field_45319, "key.keyboard.left.alt", 342);
      method_40760(field_45319, "key.keyboard.left.control", 341);
      method_40760(field_45319, "key.keyboard.left.shift", 340);
      method_40760(field_45319, "key.keyboard.left.win", 343);
      method_40760(field_45319, "key.keyboard.right.alt", 346);
      method_40760(field_45319, "key.keyboard.right.control", 345);
      method_40760(field_45319, "key.keyboard.right.shift", 344);
      method_40760(field_45319, "key.keyboard.right.win", 347);
      method_40760(field_45319, "key.keyboard.enter", 257);
      method_40760(field_45319, "key.keyboard.escape", 256);
      method_40760(field_45319, "key.keyboard.backspace", 259);
      method_40760(field_45319, "key.keyboard.delete", 261);
      method_40760(field_45319, "key.keyboard.end", 269);
      method_40760(field_45319, "key.keyboard.home", 268);
      method_40760(field_45319, "key.keyboard.insert", 260);
      method_40760(field_45319, "key.keyboard.page.down", 267);
      method_40760(field_45319, "key.keyboard.page.up", 266);
      method_40760(field_45319, "key.keyboard.caps.lock", 280);
      method_40760(field_45319, "key.keyboard.pause", 284);
      method_40760(field_45319, "key.keyboard.scroll.lock", 281);
      method_40760(field_45319, "key.keyboard.menu", 348);
      method_40760(field_45319, "key.keyboard.print.screen", 283);
      method_40760(field_45319, "key.keyboard.world.1", 161);
      method_40760(field_45319, "key.keyboard.world.2", 162);
   }
}
