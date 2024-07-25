package remapped;

import com.google.common.collect.Lists;
import com.ibm.icu.lang.UCharacter;
import com.ibm.icu.text.ArabicShaping;
import com.ibm.icu.text.Bidi;
import com.ibm.icu.text.BidiRun;
import java.util.ArrayList;
import net.minecraft.util.text.ITextProperties;

public class class_4320 {
   private static String[] field_21027;

   public static class_7107 method_20104(ITextProperties var0, boolean var1) {
      class_3505 var4 = class_3505.method_16120(var0, UCharacter::getMirror, class_4320::method_20106);
      Bidi var5 = new Bidi(var4.method_16119(), !var1 ? 126 : 127);
      var5.setReorderingMode(0);
      ArrayList var6 = Lists.newArrayList();
      int var7 = var5.countRuns();

      for (int var8 = 0; var8 < var7; var8++) {
         BidiRun var9 = var5.getVisualRun(var8);
         var6.addAll(var4.method_16121(var9.getStart(), var9.getLength(), var9.isOddRun()));
      }

      return class_7107.method_32660(var6);
   }

   private static String method_20106(String var0) {
      try {
         return new ArabicShaping(8).shape(var0);
      } catch (Exception var4) {
         return var0;
      }
   }
}
