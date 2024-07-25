package remapped;

import java.util.List;
import java.util.UUID;

public abstract class class_5676 implements class_1602 {
   public static final MinecraftClient field_28769 = MinecraftClient.getInstance();
   private boolean field_28766 = true;
   public String field_28768;
   public String field_28767;
   public class_2608 field_28765;

   public class_5676(String var1, String var2, class_2608 var3) {
      this.field_28768 = var1;
      this.field_28767 = var2;
      this.field_28765 = var3;
      SigmaMainClass.getInstance().getEventManager().subscribe2(this);
   }

   public String method_25668() {
      return this.field_28768;
   }

   public String method_25669() {
      return this.field_28767;
   }

   public void method_25664() {
   }

   public void method_25667() {
   }

   public void method_25670(boolean var1) {
      this.field_28766 = var1;
      if (!var1) {
         this.method_25667();
      } else {
         this.method_25664();
      }
   }

   public boolean method_25671() {
      return this.field_28766;
   }

   public List<AbstractClientPlayerEntity> method_25665() {
      return field_28769.theWorld.method_25873();
   }

   public List<AbstractClientPlayerEntity> method_25661() {
      return field_28769.theWorld.method_25873();
   }

   public PlayerEntity method_25662(String var1) {
      for (PlayerEntity var5 : this.method_25661()) {
         if (var5.method_45509().equals(var1)) {
            return var5;
         }
      }

      return null;
   }

   public PlayerEntity method_25663(UUID var1) {
      for (PlayerEntity var5 : this.method_25661()) {
         if (var5.method_37328().equals(var1)) {
            return var5;
         }
      }

      return null;
   }
}
