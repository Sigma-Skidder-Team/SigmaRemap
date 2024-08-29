package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.util.text.TranslationTextComponent;

public class Class793 extends Class789 {
   private final Class9267 field4146;
   private final Class6128 field4147;
   private final Class6127 field4148;

   public Class793(Screen var1, Class6128 var2, Class6127 var3) {
      this.field4147 = var2;
      this.field4148 = var3;
      this.field4146 = new Class9267(var1);
   }

   @Override
   public void run() {
      this.method1908(new TranslationTextComponent("mco.connect.connecting"));
      Class8857 var3 = Class8857.method32249(this.field4148.field27439);
      this.field4146.method34896(this.field4147, var3.method32247(), var3.method32248());
   }

   @Override
   public void method1912() {
      this.field4146.method34897();
      Minecraft.getInstance().getPackFinder().clearResourcePack();
   }

   @Override
   public void method1910() {
      this.field4146.method34898();
   }
}
