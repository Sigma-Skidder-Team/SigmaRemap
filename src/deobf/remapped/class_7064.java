package remapped;

import net.minecraft.util.text.ITextComponent;

public class class_7064 {
   private static String[] field_36451;
   private final ITextComponent field_36455;
   private long field_36454;
   private class_1343 field_36453;

   public class_7064(class_4381 var1, ITextComponent var2, class_1343 var3) {
      this.field_36452 = var1;
      this.field_36455 = var2;
      this.field_36453 = var3;
      this.field_36454 = Util.getMeasuringTimeMs();
   }

   public ITextComponent method_32537() {
      return this.field_36455;
   }

   public long method_32539() {
      return this.field_36454;
   }

   public class_1343 method_32536() {
      return this.field_36453;
   }

   public void method_32538(class_1343 var1) {
      this.field_36453 = var1;
      this.field_36454 = Util.getMeasuringTimeMs();
   }
}
