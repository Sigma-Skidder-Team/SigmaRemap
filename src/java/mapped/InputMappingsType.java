package mapped;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.function.BiFunction;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.LanguageMap;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.lwjgl.glfw.GLFW;

public enum InputMappingsType {
   KEYSYM("key.keyboard", (var0, var1) -> {
      String var4 = GLFW.glfwGetKeyName(var0, -1);
      return var4 == null ? new TranslationTextComponent(var1) : new StringTextComponent(var4);
   }),
   SCANCODE("scancode", (var0, var1) -> {
      String var4 = GLFW.glfwGetKeyName(-1, var0);
      return var4 == null ? new TranslationTextComponent(var1) : new StringTextComponent(var4);
   }),
   MOUSE("key.mouse",
      (var0, var1) -> !LanguageMap.getInstance().func_230506_b_(var1)
            ? new TranslationTextComponent("key.mouse", var0 + 1)
            : new TranslationTextComponent(var1)
   );

   private final Int2ObjectMap<InputMappingsInput> field12595 = new Int2ObjectOpenHashMap();
   private final String field12596;
   private final BiFunction<Integer, String, ITextComponent> field12597;
   private static final InputMappingsType[] field12598 = new InputMappingsType[]{KEYSYM, SCANCODE, MOUSE};

   private static void method8196(InputMappingsType var0, String var1, int var2) {
      InputMappingsInput var5 = new InputMappingsInput(var1, var0, var2);
      var0.field12595.put(var2, var5);
   }

   private InputMappingsType(String var3, BiFunction<Integer, String, ITextComponent> var4) {
      this.field12596 = var3;
      this.field12597 = var4;
   }

   public InputMappingsInput method8197(int var1) {
      return (InputMappingsInput)this.field12595.computeIfAbsent(var1, var1x -> {
         int var4 = var1x;
         if (this == MOUSE) {
            var4 = var1x + 1;
         }

         String var5 = this.field12596 + "." + var4;
         return new InputMappingsInput(var5, this, var1x);
      });
   }

   // $VF: synthetic method
   public static String method8202(InputMappingsType var0) {
      return var0.field12596;
   }

   // $VF: synthetic method
   public static BiFunction method8203(InputMappingsType var0) {
      return var0.field12597;
   }

   static {
      method8196(KEYSYM, "key.keyboard.unknown", -1);
      method8196(MOUSE, "key.mouse.left", 0);
      method8196(MOUSE, "key.mouse.right", 1);
      method8196(MOUSE, "key.mouse.middle", 2);
      method8196(MOUSE, "key.mouse.4", 3);
      method8196(MOUSE, "key.mouse.5", 4);
      method8196(MOUSE, "key.mouse.6", 5);
      method8196(MOUSE, "key.mouse.7", 6);
      method8196(MOUSE, "key.mouse.8", 7);
      method8196(KEYSYM, "key.keyboard.0", 48);
      method8196(KEYSYM, "key.keyboard.1", 49);
      method8196(KEYSYM, "key.keyboard.2", 50);
      method8196(KEYSYM, "key.keyboard.3", 51);
      method8196(KEYSYM, "key.keyboard.4", 52);
      method8196(KEYSYM, "key.keyboard.5", 53);
      method8196(KEYSYM, "key.keyboard.6", 54);
      method8196(KEYSYM, "key.keyboard.7", 55);
      method8196(KEYSYM, "key.keyboard.8", 56);
      method8196(KEYSYM, "key.keyboard.9", 57);
      method8196(KEYSYM, "key.keyboard.a", 65);
      method8196(KEYSYM, "key.keyboard.b", 66);
      method8196(KEYSYM, "key.keyboard.c", 67);
      method8196(KEYSYM, "key.keyboard.d", 68);
      method8196(KEYSYM, "key.keyboard.e", 69);
      method8196(KEYSYM, "key.keyboard.f", 70);
      method8196(KEYSYM, "key.keyboard.g", 71);
      method8196(KEYSYM, "key.keyboard.h", 72);
      method8196(KEYSYM, "key.keyboard.i", 73);
      method8196(KEYSYM, "key.keyboard.j", 74);
      method8196(KEYSYM, "key.keyboard.k", 75);
      method8196(KEYSYM, "key.keyboard.l", 76);
      method8196(KEYSYM, "key.keyboard.m", 77);
      method8196(KEYSYM, "key.keyboard.n", 78);
      method8196(KEYSYM, "key.keyboard.o", 79);
      method8196(KEYSYM, "key.keyboard.p", 80);
      method8196(KEYSYM, "key.keyboard.q", 81);
      method8196(KEYSYM, "key.keyboard.r", 82);
      method8196(KEYSYM, "key.keyboard.s", 83);
      method8196(KEYSYM, "key.keyboard.t", 84);
      method8196(KEYSYM, "key.keyboard.u", 85);
      method8196(KEYSYM, "key.keyboard.v", 86);
      method8196(KEYSYM, "key.keyboard.w", 87);
      method8196(KEYSYM, "key.keyboard.x", 88);
      method8196(KEYSYM, "key.keyboard.y", 89);
      method8196(KEYSYM, "key.keyboard.z", 90);
      method8196(KEYSYM, "key.keyboard.f1", 290);
      method8196(KEYSYM, "key.keyboard.f2", 291);
      method8196(KEYSYM, "key.keyboard.f3", 292);
      method8196(KEYSYM, "key.keyboard.f4", 293);
      method8196(KEYSYM, "key.keyboard.f5", 294);
      method8196(KEYSYM, "key.keyboard.f6", 295);
      method8196(KEYSYM, "key.keyboard.f7", 296);
      method8196(KEYSYM, "key.keyboard.f8", 297);
      method8196(KEYSYM, "key.keyboard.f9", 298);
      method8196(KEYSYM, "key.keyboard.f10", 299);
      method8196(KEYSYM, "key.keyboard.f11", 300);
      method8196(KEYSYM, "key.keyboard.f12", 301);
      method8196(KEYSYM, "key.keyboard.f13", 302);
      method8196(KEYSYM, "key.keyboard.f14", 303);
      method8196(KEYSYM, "key.keyboard.f15", 304);
      method8196(KEYSYM, "key.keyboard.f16", 305);
      method8196(KEYSYM, "key.keyboard.f17", 306);
      method8196(KEYSYM, "key.keyboard.f18", 307);
      method8196(KEYSYM, "key.keyboard.f19", 308);
      method8196(KEYSYM, "key.keyboard.f20", 309);
      method8196(KEYSYM, "key.keyboard.f21", 310);
      method8196(KEYSYM, "key.keyboard.f22", 311);
      method8196(KEYSYM, "key.keyboard.f23", 312);
      method8196(KEYSYM, "key.keyboard.f24", 313);
      method8196(KEYSYM, "key.keyboard.f25", 314);
      method8196(KEYSYM, "key.keyboard.num.lock", 282);
      method8196(KEYSYM, "key.keyboard.keypad.0", 320);
      method8196(KEYSYM, "key.keyboard.keypad.1", 321);
      method8196(KEYSYM, "key.keyboard.keypad.2", 322);
      method8196(KEYSYM, "key.keyboard.keypad.3", 323);
      method8196(KEYSYM, "key.keyboard.keypad.4", 324);
      method8196(KEYSYM, "key.keyboard.keypad.5", 325);
      method8196(KEYSYM, "key.keyboard.keypad.6", 326);
      method8196(KEYSYM, "key.keyboard.keypad.7", 327);
      method8196(KEYSYM, "key.keyboard.keypad.8", 328);
      method8196(KEYSYM, "key.keyboard.keypad.9", 329);
      method8196(KEYSYM, "key.keyboard.keypad.add", 334);
      method8196(KEYSYM, "key.keyboard.keypad.decimal", 330);
      method8196(KEYSYM, "key.keyboard.keypad.enter", 335);
      method8196(KEYSYM, "key.keyboard.keypad.equal", 336);
      method8196(KEYSYM, "key.keyboard.keypad.multiply", 332);
      method8196(KEYSYM, "key.keyboard.keypad.divide", 331);
      method8196(KEYSYM, "key.keyboard.keypad.subtract", 333);
      method8196(KEYSYM, "key.keyboard.down", 264);
      method8196(KEYSYM, "key.keyboard.left", 263);
      method8196(KEYSYM, "key.keyboard.right", 262);
      method8196(KEYSYM, "key.keyboard.up", 265);
      method8196(KEYSYM, "key.keyboard.apostrophe", 39);
      method8196(KEYSYM, "key.keyboard.backslash", 92);
      method8196(KEYSYM, "key.keyboard.comma", 44);
      method8196(KEYSYM, "key.keyboard.equal", 61);
      method8196(KEYSYM, "key.keyboard.grave.accent", 96);
      method8196(KEYSYM, "key.keyboard.left.bracket", 91);
      method8196(KEYSYM, "key.keyboard.minus", 45);
      method8196(KEYSYM, "key.keyboard.period", 46);
      method8196(KEYSYM, "key.keyboard.right.bracket", 93);
      method8196(KEYSYM, "key.keyboard.semicolon", 59);
      method8196(KEYSYM, "key.keyboard.slash", 47);
      method8196(KEYSYM, "key.keyboard.space", 32);
      method8196(KEYSYM, "key.keyboard.tab", 258);
      method8196(KEYSYM, "key.keyboard.left.alt", 342);
      method8196(KEYSYM, "key.keyboard.left.control", 341);
      method8196(KEYSYM, "key.keyboard.left.shift", 340);
      method8196(KEYSYM, "key.keyboard.left.win", 343);
      method8196(KEYSYM, "key.keyboard.right.alt", 346);
      method8196(KEYSYM, "key.keyboard.right.control", 345);
      method8196(KEYSYM, "key.keyboard.right.shift", 344);
      method8196(KEYSYM, "key.keyboard.right.win", 347);
      method8196(KEYSYM, "key.keyboard.enter", 257);
      method8196(KEYSYM, "key.keyboard.escape", 256);
      method8196(KEYSYM, "key.keyboard.backspace", 259);
      method8196(KEYSYM, "key.keyboard.delete", 261);
      method8196(KEYSYM, "key.keyboard.end", 269);
      method8196(KEYSYM, "key.keyboard.home", 268);
      method8196(KEYSYM, "key.keyboard.insert", 260);
      method8196(KEYSYM, "key.keyboard.page.down", 267);
      method8196(KEYSYM, "key.keyboard.page.up", 266);
      method8196(KEYSYM, "key.keyboard.caps.lock", 280);
      method8196(KEYSYM, "key.keyboard.pause", 284);
      method8196(KEYSYM, "key.keyboard.scroll.lock", 281);
      method8196(KEYSYM, "key.keyboard.menu", 348);
      method8196(KEYSYM, "key.keyboard.print.screen", 283);
      method8196(KEYSYM, "key.keyboard.world.1", 161);
      method8196(KEYSYM, "key.keyboard.world.2", 162);
   }
}
