package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.stream.Collectors;

public class class_7720 extends DataFix {
   private static final Int2ObjectMap<String> field_39144 = (Int2ObjectMap<String>)DataFixUtils.make(new Int2ObjectOpenHashMap(), var0 -> {
      var0.put(0, "key.unknown");
      var0.put(11, "key.0");
      var0.put(2, "key.1");
      var0.put(3, "key.2");
      var0.put(4, "key.3");
      var0.put(5, "key.4");
      var0.put(6, "key.5");
      var0.put(7, "key.6");
      var0.put(8, "key.7");
      var0.put(9, "key.8");
      var0.put(10, "key.9");
      var0.put(30, "key.a");
      var0.put(40, "key.apostrophe");
      var0.put(48, "key.b");
      var0.put(43, "key.backslash");
      var0.put(14, "key.backspace");
      var0.put(46, "key.c");
      var0.put(58, "key.caps.lock");
      var0.put(51, "key.comma");
      var0.put(32, "key.d");
      var0.put(211, "key.delete");
      var0.put(208, "key.down");
      var0.put(18, "key.e");
      var0.put(207, "key.end");
      var0.put(28, "key.enter");
      var0.put(13, "key.equal");
      var0.put(1, "key.escape");
      var0.put(33, "key.f");
      var0.put(59, "key.f1");
      var0.put(68, "key.f10");
      var0.put(87, "key.f11");
      var0.put(88, "key.f12");
      var0.put(100, "key.f13");
      var0.put(101, "key.f14");
      var0.put(102, "key.f15");
      var0.put(103, "key.f16");
      var0.put(104, "key.f17");
      var0.put(105, "key.f18");
      var0.put(113, "key.f19");
      var0.put(60, "key.f2");
      var0.put(61, "key.f3");
      var0.put(62, "key.f4");
      var0.put(63, "key.f5");
      var0.put(64, "key.f6");
      var0.put(65, "key.f7");
      var0.put(66, "key.f8");
      var0.put(67, "key.f9");
      var0.put(34, "key.g");
      var0.put(41, "key.grave.accent");
      var0.put(35, "key.h");
      var0.put(199, "key.home");
      var0.put(23, "key.i");
      var0.put(210, "key.insert");
      var0.put(36, "key.j");
      var0.put(37, "key.k");
      var0.put(82, "key.keypad.0");
      var0.put(79, "key.keypad.1");
      var0.put(80, "key.keypad.2");
      var0.put(81, "key.keypad.3");
      var0.put(75, "key.keypad.4");
      var0.put(76, "key.keypad.5");
      var0.put(77, "key.keypad.6");
      var0.put(71, "key.keypad.7");
      var0.put(72, "key.keypad.8");
      var0.put(73, "key.keypad.9");
      var0.put(78, "key.keypad.add");
      var0.put(83, "key.keypad.decimal");
      var0.put(181, "key.keypad.divide");
      var0.put(156, "key.keypad.enter");
      var0.put(141, "key.keypad.equal");
      var0.put(55, "key.keypad.multiply");
      var0.put(74, "key.keypad.subtract");
      var0.put(38, "key.l");
      var0.put(203, "key.left");
      var0.put(56, "key.left.alt");
      var0.put(26, "key.left.bracket");
      var0.put(29, "key.left.control");
      var0.put(42, "key.left.shift");
      var0.put(219, "key.left.win");
      var0.put(50, "key.m");
      var0.put(12, "key.minus");
      var0.put(49, "key.n");
      var0.put(69, "key.num.lock");
      var0.put(24, "key.o");
      var0.put(25, "key.p");
      var0.put(209, "key.page.down");
      var0.put(201, "key.page.up");
      var0.put(197, "key.pause");
      var0.put(52, "key.period");
      var0.put(183, "key.print.screen");
      var0.put(16, "key.q");
      var0.put(19, "key.r");
      var0.put(205, "key.right");
      var0.put(184, "key.right.alt");
      var0.put(27, "key.right.bracket");
      var0.put(157, "key.right.control");
      var0.put(54, "key.right.shift");
      var0.put(220, "key.right.win");
      var0.put(31, "key.s");
      var0.put(70, "key.scroll.lock");
      var0.put(39, "key.semicolon");
      var0.put(53, "key.slash");
      var0.put(57, "key.space");
      var0.put(20, "key.t");
      var0.put(15, "key.tab");
      var0.put(22, "key.u");
      var0.put(200, "key.up");
      var0.put(47, "key.v");
      var0.put(17, "key.w");
      var0.put(45, "key.x");
      var0.put(21, "key.y");
      var0.put(44, "key.z");
   });

   public class_7720(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "OptionsKeyLwjgl3Fix",
         this.getInputSchema().getType(class_4002.field_19442),
         var0 -> var0.update(DSL.remainderFinder(), var0x -> var0x.getMapValues().map(var1 -> var0x.createMap(var1.entrySet().stream().<Pair>map(var0xxx -> {
                     if (!((Dynamic)var0xxx.getKey()).asString("").startsWith("key_")) {
                        return Pair.of(var0xxx.getKey(), var0xxx.getValue());
                     } else {
                        int var3 = Integer.parseInt(((Dynamic)var0xxx.getValue()).asString(""));
                        if (var3 >= 0) {
                           String var6 = (String)field_39144.getOrDefault(var3, "key.unknown");
                           return Pair.of(var0xxx.getKey(), ((Dynamic)var0xxx.getValue()).createString(var6));
                        } else {
                           int var4 = var3 + 100;
                           String var5;
                           if (var4 != 0) {
                              if (var4 != 1) {
                                 if (var4 != 2) {
                                    var5 = "key.mouse." + (var4 + 1);
                                 } else {
                                    var5 = "key.mouse.middle";
                                 }
                              } else {
                                 var5 = "key.mouse.right";
                              }
                           } else {
                              var5 = "key.mouse.left";
                           }

                           return Pair.of(var0xxx.getKey(), ((Dynamic)var0xxx.getValue()).createString(var5));
                        }
                     }
                  }).collect(Collectors.toMap(Pair::getFirst, Pair::getSecond)))).result().orElse(var0x))
      );
   }
}
