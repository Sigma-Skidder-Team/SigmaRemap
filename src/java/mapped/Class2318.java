package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public enum Class2318 {
   field15879(0, "cape"),
   field15880(1, "jacket"),
   field15881(2, "left_sleeve"),
   field15882(3, "right_sleeve"),
   field15883(4, "left_pants_leg"),
   field15884(5, "right_pants_leg"),
   field15885(6, "hat");

   private final int field15886;
   private final int field15887;
   private final String field15888;
   private final ITextComponent field15889;
   private static final Class2318[] field15890 = new Class2318[]{field15879, field15880, field15881, field15882, field15883, field15884, field15885};

   private Class2318(int var3, String var4) {
      this.field15886 = var3;
      this.field15887 = 1 << var3;
      this.field15888 = var4;
      this.field15889 = new TranslationTextComponent("options.modelPart." + var4);
   }

   public int method9090() {
      return this.field15887;
   }

   public String method9091() {
      return this.field15888;
   }

   public ITextComponent method9092() {
      return this.field15889;
   }
}
