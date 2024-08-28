package mapped;

import java.util.List;
import net.minecraft.util.text.ITextComponent;

public class Class3334 extends Class3257 {
   public Class3334(Class5643 var1) {
      super(var1);
      Class3357.method11931(this, Class3279.field18780);
   }

   @Override
   public String method11720(Class8848 var1) {
      return var1.method32145("BlockEntityTag") == null ? super.method11720(var1) : this.method11719() + '.' + method11882(var1).method310();
   }

   @Override
   public void method11730(Class8848 var1, Class1655 var2, List<ITextComponent> var3, Class2216 var4) {
      Class3301.method11848(var1, var3);
   }

   @Override
   public Class2103 method11727(Class8848 var1) {
      return Class2103.field13709;
   }

   @Override
   public int method11728(Class8848 var1) {
      return 72000;
   }

   @Override
   public Class6794<Class8848> method11700(Class1655 var1, PlayerEntity var2, Class79 var3) {
      Class8848 var6 = var2.method3094(var3);
      var2.method3154(var3);
      return Class6794.<Class8848>method20697(var6);
   }

   @Override
   public boolean method11699(Class8848 var1, Class8848 var2) {
      return Class5985.field26071.method24917(var2.method32107()) || super.method11699(var1, var2);
   }

   public static Class112 method11882(Class8848 var0) {
      return Class112.method315(var0.method32144("BlockEntityTag").method122("Base"));
   }
}
