package net.minecraft.util.text.filter;

@FunctionalInterface
public interface ChatFilterClient$class_52 {
   ChatFilterClient$class_52 field_244577_a = (p_244583_0_, p_244583_1_) -> false;
   ChatFilterClient$class_52 field_244578_b = (p_244581_0_, p_244581_1_) -> p_244581_0_.length() == p_244581_1_;

   boolean shouldIgnore(String var1, int var2);
}
