package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import net.minecraft.client.Minecraft;
import net.minecraft.stats.Stats;

import java.util.Comparator;

public class Class1280 extends Class1274<Class1170> {
   private static String[] field6834;
   public final Class1305 field6835;

   public Class1280(Class1305 var1, Minecraft var2) {
      super(var2, var1.width, var1.height, 32, var1.height - 64, 10);
      this.field6835 = var1;
      ObjectArrayList var5 = new ObjectArrayList(Stats.field40104.iterator());
      var5.sort(Comparator.<Class9007, String>comparing(var0 -> I18n.format(Class1305.method6192(var0))));
      ObjectListIterator var6 = var5.iterator();

      while (var6.hasNext()) {
         Class9007 var7 = (Class9007)var6.next();
         this.method6030(new Class1170(this, var7));
      }
   }

   @Override
   public void method6039(MatrixStack var1) {
      this.field6835.renderBackground(var1);
   }
}
