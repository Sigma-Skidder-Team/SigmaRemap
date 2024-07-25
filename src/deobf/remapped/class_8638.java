package remapped;

import java.util.logging.Level;

public class class_8638 implements class_6224 {
   public class_8638(class_6836 var1) {
      this.field_44285 = var1;
   }

   @Override
   public void method_28452(Object... var1) {
      if (!this.field_44285.field_35246[0]) {
         class_8970 var4 = (class_8970)var1[0];
         if ("pong".equals(var4.field_45957) && "probe".equals(var4.field_45952)) {
            if (class_1144.method_5064().isLoggable(Level.FINE)) {
               class_1144.method_5064().fine(String.format("probe transport '%s' pong", this.field_44285.field_35248));
            }

            class_1144.method_5020(this.field_44285.field_35249, true);
            this.field_44285.field_35249.method_19325("upgrading", new Object[]{this.field_44285.field_35244[0]});
            if (null == this.field_44285.field_35244[0]) {
               return;
            }

            class_1144.method_5050("websocket".equals(this.field_44285.field_35244[0].field_11434));
            if (class_1144.method_5064().isLoggable(Level.FINE)) {
               class_1144.method_5064().fine(String.format("pausing current transport '%s'", this.field_44285.field_35249.field_6492.field_11434));
            }

            ((class_6586)this.field_44285.field_35249.field_6492).method_30090(new class_5313(this));
         } else {
            if (class_1144.method_5064().isLoggable(Level.FINE)) {
               class_1144.method_5064().fine(String.format("probe transport '%s' failed", this.field_44285.field_35248));
            }

            class_5773 var5 = new class_5773("probe error");
            var5.field_29160 = this.field_44285.field_35244[0].field_11434;
            this.field_44285.field_35249.method_19325("upgradeError", new Object[]{var5});
         }
      }
   }
}
