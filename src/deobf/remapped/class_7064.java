package remapped;

import net.minecraft.util.text.ITextComponent;

public class class_7064 {
   private static String[] field_36451;
   private final ITextComponent field_36455;
   private long field_36454;
   private Vector3d field_36453;

   public class_7064(SubtitleOverlayGui var1, ITextComponent var2, Vector3d var3) {
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

   public Vector3d method_32536() {
      return this.field_36453;
   }

   public void method_32538(Vector3d var1) {
      this.field_36453 = var1;
      this.field_36454 = Util.getMeasuringTimeMs();
   }
}
