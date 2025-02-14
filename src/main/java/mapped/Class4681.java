package mapped;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public interface Class4681 {
   ResourceLocation method14677();

   Class2064 method14678();

   ITextComponent method14679();

   ITextComponent method14680();

   IPackNameDecorator method14681();

   default ITextComponent method14690() {
      return this.method14681().method25544(this.method14680());
   }

   boolean method14682();

   boolean method14683();

   void method14675();

   void method14676();

   void method14687();

   void method14689();

   boolean method14674();

   default boolean method14691() {
      return !this.method14674();
   }

   default boolean method14692() {
      return this.method14674() && !this.method14683();
   }

   boolean method14686();

   boolean method14688();
}
