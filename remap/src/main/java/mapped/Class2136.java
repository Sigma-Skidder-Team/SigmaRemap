// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;

public enum Class2136
{
    field12467("key.keyboard"), 
    field12468("scancode"), 
    field12469("key.mouse");
    
    private static final String[] field12470;
    private final Int2ObjectMap<Class7985> field12471;
    private final String field12472;
    
    private static void method8288(final Class2136 class2136, final String s, final int n) {
        class2136.field12471.put(n, (Object)new Class7985(s, class2136, n, null));
    }
    
    private Class2136(final String field12472) {
        this.field12471 = (Int2ObjectMap<Class7985>)new Int2ObjectOpenHashMap();
        this.field12472 = field12472;
    }
    
    public Class7985 method8289(final int i) {
        if (!this.field12471.containsKey(i)) {
            String str;
            if (this != Class2136.field12469) {
                str = "." + i;
            }
            else if (i > 2) {
                str = "." + (i + 1);
            }
            else {
                str = "." + Class2136.field12470[i];
            }
            final Class7985 class7985 = new Class7985(this.field12472 + str, this, i, null);
            this.field12471.put(i, (Object)class7985);
            return class7985;
        }
        return (Class7985)this.field12471.get(i);
    }
    
    public String method8290() {
        return this.field12472;
    }
    
    static {
        field12470 = new String[] { "left", "middle", "right" };
        method8288(Class2136.field12467, "key.keyboard.unknown", -1);
        method8288(Class2136.field12469, "key.mouse.left", 0);
        method8288(Class2136.field12469, "key.mouse.right", 1);
        method8288(Class2136.field12469, "key.mouse.middle", 2);
        method8288(Class2136.field12469, "key.mouse.4", 3);
        method8288(Class2136.field12469, "key.mouse.5", 4);
        method8288(Class2136.field12469, "key.mouse.6", 5);
        method8288(Class2136.field12469, "key.mouse.7", 6);
        method8288(Class2136.field12469, "key.mouse.8", 7);
        method8288(Class2136.field12467, "key.keyboard.0", 48);
        method8288(Class2136.field12467, "key.keyboard.1", 49);
        method8288(Class2136.field12467, "key.keyboard.2", 50);
        method8288(Class2136.field12467, "key.keyboard.3", 51);
        method8288(Class2136.field12467, "key.keyboard.4", 52);
        method8288(Class2136.field12467, "key.keyboard.5", 53);
        method8288(Class2136.field12467, "key.keyboard.6", 54);
        method8288(Class2136.field12467, "key.keyboard.7", 55);
        method8288(Class2136.field12467, "key.keyboard.8", 56);
        method8288(Class2136.field12467, "key.keyboard.9", 57);
        method8288(Class2136.field12467, "key.keyboard.a", 65);
        method8288(Class2136.field12467, "key.keyboard.b", 66);
        method8288(Class2136.field12467, "key.keyboard.c", 67);
        method8288(Class2136.field12467, "key.keyboard.d", 68);
        method8288(Class2136.field12467, "key.keyboard.e", 69);
        method8288(Class2136.field12467, "key.keyboard.f", 70);
        method8288(Class2136.field12467, "key.keyboard.g", 71);
        method8288(Class2136.field12467, "key.keyboard.h", 72);
        method8288(Class2136.field12467, "key.keyboard.i", 73);
        method8288(Class2136.field12467, "key.keyboard.j", 74);
        method8288(Class2136.field12467, "key.keyboard.k", 75);
        method8288(Class2136.field12467, "key.keyboard.l", 76);
        method8288(Class2136.field12467, "key.keyboard.m", 77);
        method8288(Class2136.field12467, "key.keyboard.n", 78);
        method8288(Class2136.field12467, "key.keyboard.o", 79);
        method8288(Class2136.field12467, "key.keyboard.p", 80);
        method8288(Class2136.field12467, "key.keyboard.q", 81);
        method8288(Class2136.field12467, "key.keyboard.r", 82);
        method8288(Class2136.field12467, "key.keyboard.s", 83);
        method8288(Class2136.field12467, "key.keyboard.t", 84);
        method8288(Class2136.field12467, "key.keyboard.u", 85);
        method8288(Class2136.field12467, "key.keyboard.v", 86);
        method8288(Class2136.field12467, "key.keyboard.w", 87);
        method8288(Class2136.field12467, "key.keyboard.x", 88);
        method8288(Class2136.field12467, "key.keyboard.y", 89);
        method8288(Class2136.field12467, "key.keyboard.z", 90);
        method8288(Class2136.field12467, "key.keyboard.f1", 290);
        method8288(Class2136.field12467, "key.keyboard.f2", 291);
        method8288(Class2136.field12467, "key.keyboard.f3", 292);
        method8288(Class2136.field12467, "key.keyboard.f4", 293);
        method8288(Class2136.field12467, "key.keyboard.f5", 294);
        method8288(Class2136.field12467, "key.keyboard.f6", 295);
        method8288(Class2136.field12467, "key.keyboard.f7", 296);
        method8288(Class2136.field12467, "key.keyboard.f8", 297);
        method8288(Class2136.field12467, "key.keyboard.f9", 298);
        method8288(Class2136.field12467, "key.keyboard.f10", 299);
        method8288(Class2136.field12467, "key.keyboard.f11", 300);
        method8288(Class2136.field12467, "key.keyboard.f12", 301);
        method8288(Class2136.field12467, "key.keyboard.f13", 302);
        method8288(Class2136.field12467, "key.keyboard.f14", 303);
        method8288(Class2136.field12467, "key.keyboard.f15", 304);
        method8288(Class2136.field12467, "key.keyboard.f16", 305);
        method8288(Class2136.field12467, "key.keyboard.f17", 306);
        method8288(Class2136.field12467, "key.keyboard.f18", 307);
        method8288(Class2136.field12467, "key.keyboard.f19", 308);
        method8288(Class2136.field12467, "key.keyboard.f20", 309);
        method8288(Class2136.field12467, "key.keyboard.f21", 310);
        method8288(Class2136.field12467, "key.keyboard.f22", 311);
        method8288(Class2136.field12467, "key.keyboard.f23", 312);
        method8288(Class2136.field12467, "key.keyboard.f24", 313);
        method8288(Class2136.field12467, "key.keyboard.f25", 314);
        method8288(Class2136.field12467, "key.keyboard.num.lock", 282);
        method8288(Class2136.field12467, "key.keyboard.keypad.0", 320);
        method8288(Class2136.field12467, "key.keyboard.keypad.1", 321);
        method8288(Class2136.field12467, "key.keyboard.keypad.2", 322);
        method8288(Class2136.field12467, "key.keyboard.keypad.3", 323);
        method8288(Class2136.field12467, "key.keyboard.keypad.4", 324);
        method8288(Class2136.field12467, "key.keyboard.keypad.5", 325);
        method8288(Class2136.field12467, "key.keyboard.keypad.6", 326);
        method8288(Class2136.field12467, "key.keyboard.keypad.7", 327);
        method8288(Class2136.field12467, "key.keyboard.keypad.8", 328);
        method8288(Class2136.field12467, "key.keyboard.keypad.9", 329);
        method8288(Class2136.field12467, "key.keyboard.keypad.add", 334);
        method8288(Class2136.field12467, "key.keyboard.keypad.decimal", 330);
        method8288(Class2136.field12467, "key.keyboard.keypad.enter", 335);
        method8288(Class2136.field12467, "key.keyboard.keypad.equal", 336);
        method8288(Class2136.field12467, "key.keyboard.keypad.multiply", 332);
        method8288(Class2136.field12467, "key.keyboard.keypad.divide", 331);
        method8288(Class2136.field12467, "key.keyboard.keypad.subtract", 333);
        method8288(Class2136.field12467, "key.keyboard.down", 264);
        method8288(Class2136.field12467, "key.keyboard.left", 263);
        method8288(Class2136.field12467, "key.keyboard.right", 262);
        method8288(Class2136.field12467, "key.keyboard.up", 265);
        method8288(Class2136.field12467, "key.keyboard.apostrophe", 39);
        method8288(Class2136.field12467, "key.keyboard.backslash", 92);
        method8288(Class2136.field12467, "key.keyboard.comma", 44);
        method8288(Class2136.field12467, "key.keyboard.equal", 61);
        method8288(Class2136.field12467, "key.keyboard.grave.accent", 96);
        method8288(Class2136.field12467, "key.keyboard.left.bracket", 91);
        method8288(Class2136.field12467, "key.keyboard.minus", 45);
        method8288(Class2136.field12467, "key.keyboard.period", 46);
        method8288(Class2136.field12467, "key.keyboard.right.bracket", 93);
        method8288(Class2136.field12467, "key.keyboard.semicolon", 59);
        method8288(Class2136.field12467, "key.keyboard.slash", 47);
        method8288(Class2136.field12467, "key.keyboard.space", 32);
        method8288(Class2136.field12467, "key.keyboard.tab", 258);
        method8288(Class2136.field12467, "key.keyboard.left.alt", 342);
        method8288(Class2136.field12467, "key.keyboard.left.control", 341);
        method8288(Class2136.field12467, "key.keyboard.left.shift", 340);
        method8288(Class2136.field12467, "key.keyboard.left.win", 343);
        method8288(Class2136.field12467, "key.keyboard.right.alt", 346);
        method8288(Class2136.field12467, "key.keyboard.right.control", 345);
        method8288(Class2136.field12467, "key.keyboard.right.shift", 344);
        method8288(Class2136.field12467, "key.keyboard.right.win", 347);
        method8288(Class2136.field12467, "key.keyboard.enter", 257);
        method8288(Class2136.field12467, "key.keyboard.escape", 256);
        method8288(Class2136.field12467, "key.keyboard.backspace", 259);
        method8288(Class2136.field12467, "key.keyboard.delete", 261);
        method8288(Class2136.field12467, "key.keyboard.end", 269);
        method8288(Class2136.field12467, "key.keyboard.home", 268);
        method8288(Class2136.field12467, "key.keyboard.insert", 260);
        method8288(Class2136.field12467, "key.keyboard.page.down", 267);
        method8288(Class2136.field12467, "key.keyboard.page.up", 266);
        method8288(Class2136.field12467, "key.keyboard.caps.lock", 280);
        method8288(Class2136.field12467, "key.keyboard.pause", 284);
        method8288(Class2136.field12467, "key.keyboard.scroll.lock", 281);
        method8288(Class2136.field12467, "key.keyboard.menu", 348);
        method8288(Class2136.field12467, "key.keyboard.print.screen", 283);
        method8288(Class2136.field12467, "key.keyboard.world.1", 161);
        method8288(Class2136.field12467, "key.keyboard.world.2", 162);
    }
}
