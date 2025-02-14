package mapped;

import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class8036 {
   private static final Class7222 field34529 = new Class7221(null);
   private static final Class7222 field34530 = new Class7223(-1, true);
   private static final Class7222 field34531 = new Class7223(1, true);
   private static final Class7222 field34532 = new Class7223(1, false);
   private static final ITextComponent field34533 = new TranslationTextComponent("spectatorMenu.close");
   private static final ITextComponent field34534 = new TranslationTextComponent("spectatorMenu.previous_page");
   private static final ITextComponent field34535 = new TranslationTextComponent("spectatorMenu.next_page");
   public static final Class7222 field34536 = new Class7230();
   private final Class1196 field34537;
   private Class7226 field34538;
   private int field34539 = -1;
   private int field34540;

   public Class8036(Class1196 var1) {
      this.field34538 = new Class7228();
      this.field34537 = var1;
   }

   public Class7222 method27567(int var1) {
      int var4 = var1 + this.field34540 * 6;
      if (this.field34540 > 0 && var1 == 0) {
         return field34530;
      } else if (var1 != 7) {
         if (var1 == 8) {
            return field34529;
         } else {
            return var4 >= 0 && var4 < this.field34538.method22701().size()
               ? (Class7222)MoreObjects.firstNonNull(this.field34538.method22701().get(var4), field34536)
               : field34536;
         }
      } else {
         return var4 >= this.field34538.method22701().size() ? field34532 : field34531;
      }
   }

   public List<Class7222> method27568() {
      ArrayList var3 = Lists.newArrayList();

      for (int var4 = 0; var4 <= 8; var4++) {
         var3.add(this.method27567(var4));
      }

      return var3;
   }

   public Class7222 method27569() {
      return this.method27567(this.field34539);
   }

   public Class7226 method27570() {
      return this.field34538;
   }

   public void method27571(int var1) {
      Class7222 var4 = this.method27567(var1);
      if (var4 != field34536) {
         if (this.field34539 == var1 && var4.method22700()) {
            var4.method22697(this);
         } else {
            this.field34539 = var1;
         }
      }
   }

   public void method27572() {
      this.field34537.method5724(this);
   }

   public int method27573() {
      return this.field34539;
   }

   public void method27574(Class7226 var1) {
      this.field34538 = var1;
      this.field34539 = -1;
      this.field34540 = 0;
   }

   public Class8548 method27575() {
      return new Class8548(this.field34538, this.method27568(), this.field34539);
   }

   // $VF: synthetic method
   public static ITextComponent method27576() {
      return field34533;
   }

   // $VF: synthetic method
   public static int method27577(Class8036 var0, int var1) {
      return var0.field34540 = var1;
   }

   // $VF: synthetic method
   public static int method27578(Class8036 var0) {
      return var0.field34540;
   }

   // $VF: synthetic method
   public static ITextComponent method27579() {
      return field34534;
   }

   // $VF: synthetic method
   public static ITextComponent method27580() {
      return field34535;
   }
}
