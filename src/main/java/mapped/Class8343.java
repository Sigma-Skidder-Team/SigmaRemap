package mapped;

import com.google.common.collect.Lists;
import com.ibm.icu.lang.UCharacter;
import com.ibm.icu.text.ArabicShaping;
import com.ibm.icu.text.Bidi;
import com.ibm.icu.text.BidiRun;
import java.util.ArrayList;
import net.minecraft.util.text.ITextProperties;

public class Class8343 {
   private static String[] field35867;

   public static Class9125 method29250(ITextProperties var0, boolean var1) {
      Class8064 var4 = Class8064.method27702(var0, UCharacter::getMirror, Class8343::method29251);
      Bidi var5 = new Bidi(var4.method27700(), !var1 ? 126 : 127);
      var5.setReorderingMode(0);
      ArrayList var6 = Lists.newArrayList();
      int var7 = var5.countRuns();

      for (int var8 = 0; var8 < var7; var8++) {
         BidiRun var9 = var5.getVisualRun(var8);
         var6.addAll(var4.method27701(var9.getStart(), var9.getLength(), var9.isOddRun()));
      }

      return Class9125.method34042(var6);
   }

   private static String method29251(String var0) {
      try {
         return new ArabicShaping(8).shape(var0);
      } catch (Exception var4) {
         return var0;
      }
   }
}
