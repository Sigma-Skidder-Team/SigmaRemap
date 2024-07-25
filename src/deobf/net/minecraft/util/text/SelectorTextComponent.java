package net.minecraft.util.text;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import remapped.class_4550;
import remapped.class_4964;
import remapped.Entity;
import remapped.class_9155;

public class SelectorTextComponent extends TextComponent implements ITargetedTextComponent {
   private static final Logger LOGGER = LogManager.getLogger();
   private final String selector;
   private final class_4550 field_197670_d;

   public SelectorTextComponent(String selectorIn) {
      this.selector = selectorIn;
      class_4550 commandsyntaxexception = null;

      try {
         class_4964 var5 = new class_4964(new StringReader(selectorIn));
         commandsyntaxexception = var5.method_22744();
      } catch (CommandSyntaxException var6) {
         LOGGER.warn("Invalid selector component: {}", selectorIn, var6.getMessage());
      }

      this.field_197670_d = commandsyntaxexception;
   }

   public String getSelector() {
      return this.selector;
   }

   @Override
   public IFormattableTextComponent func_230535_a_(class_9155 p_230535_1_, Entity p_230535_2_, int p_230535_3_) throws CommandSyntaxException {
      return (IFormattableTextComponent)(p_230535_1_ != null && this.field_197670_d != null
         ? class_4550.method_21101(this.field_197670_d.method_21106(p_230535_1_))
         : new StringTextComponent(""));
   }

   @Override
   public String getUnformattedComponentText() {
      return this.selector;
   }

   public SelectorTextComponent copyRaw() {
      return new SelectorTextComponent(this.selector);
   }

   @Override
   public boolean equals(Object p_equals_1_) {
      if (this == p_equals_1_) {
         return true;
      } else if (!(p_equals_1_ instanceof SelectorTextComponent)) {
         return false;
      } else {
         SelectorTextComponent var4 = (SelectorTextComponent)p_equals_1_;
         return this.selector.equals(var4.selector) && super.equals(p_equals_1_);
      }
   }

   @Override
   public String toString() {
      return "SelectorComponent{pattern='" + this.selector + '\'' + ", siblings=" + this.siblings + ", style=" + this.getStyle() + '}';
   }
}
