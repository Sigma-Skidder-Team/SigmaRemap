package remapped;

import java.util.UUID;
import net.minecraft.util.text.ITextComponent;

public abstract class class_9394 {
   private final UUID field_48005;
   public ITextComponent field_48006;
   public float field_48004;
   public class_1062 field_48003;
   public class_2976 field_48002;
   public boolean field_47999;
   public boolean field_48000;
   public boolean field_48001;

   public class_9394(UUID var1, ITextComponent var2, class_1062 var3, class_2976 var4) {
      this.field_48005 = var1;
      this.field_48006 = var2;
      this.field_48003 = var3;
      this.field_48002 = var4;
      this.field_48004 = 1.0F;
   }

   public UUID method_43454() {
      return this.field_48005;
   }

   public ITextComponent method_43453() {
      return this.field_48006;
   }

   public void method_43451(ITextComponent var1) {
      this.field_48006 = var1;
   }

   public float method_43450() {
      return this.field_48004;
   }

   public void method_43459(float var1) {
      this.field_48004 = var1;
   }

   public class_1062 method_43456() {
      return this.field_48003;
   }

   public void method_43452(class_1062 var1) {
      this.field_48003 = var1;
   }

   public class_2976 method_43462() {
      return this.field_48002;
   }

   public void method_43458(class_2976 var1) {
      this.field_48002 = var1;
   }

   public boolean method_43460() {
      return this.field_47999;
   }

   public class_9394 method_43461(boolean var1) {
      this.field_47999 = var1;
      return this;
   }

   public boolean method_43464() {
      return this.field_48000;
   }

   public class_9394 method_43457(boolean var1) {
      this.field_48000 = var1;
      return this;
   }

   public class_9394 method_43463(boolean var1) {
      this.field_48001 = var1;
      return this;
   }

   public boolean method_43455() {
      return this.field_48001;
   }
}
