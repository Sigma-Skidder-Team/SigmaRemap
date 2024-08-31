package mapped;

import net.minecraft.util.IStringSerializable;

public enum Class85 implements IStringSerializable {
   field212("floor"),
   field213("ceiling"),
   field214("single_wall"),
   field215("double_wall");

   private final String field216;
   private static final Class85[] field217 = new Class85[]{field212, field213, field214, field215};

   private Class85(String var3) {
      this.field216 = var3;
   }

   @Override
   public String getString() {
      return this.field216;
   }
}
