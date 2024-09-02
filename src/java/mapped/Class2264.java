package mapped;

import net.minecraft.client.util.Util;
import net.minecraft.util.Direction;

public enum Class2264 {
   field14716(
      new Class9827(Class8993.field41132, Class8993.field41131, Class8993.field41127),
      new Class9827(Class8993.field41132, Class8993.field41131, Class8993.field41130),
      new Class9827(Class8993.field41129, Class8993.field41131, Class8993.field41130),
      new Class9827(Class8993.field41129, Class8993.field41131, Class8993.field41127)
   ),
   field14717(
      new Class9827(Class8993.field41132, Class8993.field41128, Class8993.field41130),
      new Class9827(Class8993.field41132, Class8993.field41128, Class8993.field41127),
      new Class9827(Class8993.field41129, Class8993.field41128, Class8993.field41127),
      new Class9827(Class8993.field41129, Class8993.field41128, Class8993.field41130)
   ),
   field14718(
      new Class9827(Class8993.field41129, Class8993.field41128, Class8993.field41130),
      new Class9827(Class8993.field41129, Class8993.field41131, Class8993.field41130),
      new Class9827(Class8993.field41132, Class8993.field41131, Class8993.field41130),
      new Class9827(Class8993.field41132, Class8993.field41128, Class8993.field41130)
   ),
   field14719(
      new Class9827(Class8993.field41132, Class8993.field41128, Class8993.field41127),
      new Class9827(Class8993.field41132, Class8993.field41131, Class8993.field41127),
      new Class9827(Class8993.field41129, Class8993.field41131, Class8993.field41127),
      new Class9827(Class8993.field41129, Class8993.field41128, Class8993.field41127)
   ),
   field14720(
      new Class9827(Class8993.field41132, Class8993.field41128, Class8993.field41130),
      new Class9827(Class8993.field41132, Class8993.field41131, Class8993.field41130),
      new Class9827(Class8993.field41132, Class8993.field41131, Class8993.field41127),
      new Class9827(Class8993.field41132, Class8993.field41128, Class8993.field41127)
   ),
   field14721(
      new Class9827(Class8993.field41129, Class8993.field41128, Class8993.field41127),
      new Class9827(Class8993.field41129, Class8993.field41131, Class8993.field41127),
      new Class9827(Class8993.field41129, Class8993.field41131, Class8993.field41130),
      new Class9827(Class8993.field41129, Class8993.field41128, Class8993.field41130)
   );

   private static final Class2264[] field14722 = Util.<Class2264[]>make(new Class2264[6], var0 -> {
      var0[Class8993.field41131] = field14716;
      var0[Class8993.field41128] = field14717;
      var0[Class8993.field41130] = field14718;
      var0[Class8993.field41127] = field14719;
      var0[Class8993.field41132] = field14720;
      var0[Class8993.field41129] = field14721;
   });
   private final Class9827[] field14723;
   private static final Class2264[] field14724 = new Class2264[]{field14716, field14717, field14718, field14719, field14720, field14721};

   public static Class2264 method8992(Direction var0) {
      return field14722[var0.getIndex()];
   }

   private Class2264(Class9827... var3) {
      this.field14723 = var3;
   }

   public Class9827 method8993(int var1) {
      return this.field14723[var1];
   }
}
