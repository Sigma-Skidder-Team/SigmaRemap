package remapped;

import java.util.List;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_4145 extends Screen {
   private static final Logger field_20164 = LogManager.getLogger();
   private final class_7081 field_20175 = new class_7081();
   public final Screen field_20176;
   public class_4116 field_20163;
   private class_3187 field_20166;
   private class_9521 field_20167;
   private class_9521 field_20174;
   private class_9521 field_20165;
   private List<ITextComponent> field_20173;
   private class_2560 field_20170;
   private class_9126 field_20168;
   private class_3406 field_20169;
   private boolean field_20171;

   public class_4145(Screen var1) {
      super(new TranslationTextComponent("multiplayer.title"));
      this.field_20176 = var1;
   }

   @Override
   public void method_1163() {
      super.method_1163();
      this.field_943.field_9600.method_38887(true);
      if (this.field_20171) {
         this.field_20163.method_36216(this.field_941, this.field_940, 32, this.field_940 - 64);
      } else {
         this.field_20171 = true;
         this.field_20166 = new class_3187(this.field_943);
         this.field_20166.method_14670();
         this.field_20168 = new class_9126();

         try {
            this.field_20169 = new class_3406(this.field_20168);
            this.field_20169.start();
         } catch (Exception var4) {
            field_20164.warn("Unable to start LAN server detection: {}", var4.getMessage());
         }

         this.field_20163 = new class_4116(this, this.field_943, this.field_941, this.field_940, 32, this.field_940 - 64, 36);
         this.field_20163.method_19117(this.field_20166);
      }

      this.field_942.add(this.field_20163);
      this.field_20174 = this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 - 154, this.field_940 - 52, 100, 20, new TranslationTextComponent("selectServer.select"), var1 -> this.method_19235()
         )
      );
      this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 - 50, this.field_940 - 52, 100, 20, new TranslationTextComponent("selectServer.direct"), var1 -> {
            this.field_20170 = new class_2560(class_6956.method_31803("selectServer.defaultName"), "", false);
            this.field_943.method_8609(new class_2006(this, this::method_19240, this.field_20170));
         })
      );
      this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 + 4 + 50, this.field_940 - 52, 100, 20, new TranslationTextComponent("selectServer.add"), var1 -> {
            this.field_20170 = new class_2560(class_6956.method_31803("selectServer.defaultName"), "", false);
            this.field_943.method_8609(new class_2413(this, this::method_19236, this.field_20170));
         })
      );
      this.field_20167 = this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 - 154, this.field_940 - 28, 70, 20, new TranslationTextComponent("selectServer.edit"), var1 -> {
            class_2269 var4x = this.field_20163.method_36226();
            if (var4x instanceof class_6757) {
               class_2560 var5 = ((class_6757)var4x).method_30964();
               this.field_20170 = new class_2560(var5.field_12670, var5.field_12675, false);
               this.field_20170.method_11629(var5);
               this.field_943.method_8609(new class_2413(this, this::method_19232, this.field_20170));
            }
         })
      );
      this.field_20165 = this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 - 74, this.field_940 - 28, 70, 20, new TranslationTextComponent("selectServer.delete"), var1 -> {
            class_2269 var4x = this.field_20163.method_36226();
            if (var4x instanceof class_6757) {
               String var5 = ((class_6757)var4x).method_30964().field_12670;
               if (var5 != null) {
                  TranslationTextComponent var6 = new TranslationTextComponent("selectServer.deleteQuestion");
                  TranslationTextComponent var7 = new TranslationTextComponent("selectServer.deleteWarning", var5);
                  TranslationTextComponent var8 = new TranslationTextComponent("selectServer.deleteButton");
                  ITextComponent var9 = class_1402.field_7633;
                  this.field_943.method_8609(new class_9640(this::method_19241, var6, var7, var8, var9));
               }
            }
         })
      );
      this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 + 4, this.field_940 - 28, 70, 20, new TranslationTextComponent("selectServer.refresh"), var1 -> this.method_19231())
      );
      this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 + 4 + 76, this.field_940 - 28, 75, 20, class_1402.field_7633, var1 -> this.field_943.method_8609(this.field_20176))
      );
      this.method_19233();
   }

   @Override
   public void method_5312() {
      super.method_5312();
      if (this.field_20168.method_41981()) {
         List var3 = this.field_20168.method_41982();
         this.field_20168.method_41985();
         this.field_20163.method_19125(var3);
      }

      this.field_20175.method_32584();
   }

   @Override
   public void method_1162() {
      this.field_943.field_9600.method_38887(false);
      if (this.field_20169 != null) {
         this.field_20169.interrupt();
         this.field_20169 = null;
      }

      this.field_20175.method_32583();
   }

   private void method_19231() {
      this.field_943.method_8609(new class_4145(this.field_20176));
   }

   private void method_19241(boolean var1) {
      class_2269 var4 = this.field_20163.method_36226();
      if (var1 && var4 instanceof class_6757) {
         this.field_20166.method_14672(((class_6757)var4).method_30964());
         this.field_20166.method_14676();
         this.field_20163.method_19114((class_2269)null);
         this.field_20163.method_19117(this.field_20166);
      }

      this.field_943.method_8609(this);
   }

   private void method_19232(boolean var1) {
      class_2269 var4 = this.field_20163.method_36226();
      if (var1 && var4 instanceof class_6757) {
         class_2560 var5 = ((class_6757)var4).method_30964();
         var5.field_12670 = this.field_20170.field_12670;
         var5.field_12675 = this.field_20170.field_12675;
         var5.method_11629(this.field_20170);
         this.field_20166.method_14676();
         this.field_20163.method_19117(this.field_20166);
      }

      this.field_943.method_8609(this);
   }

   private void method_19236(boolean var1) {
      if (var1) {
         this.field_20166.method_14674(this.field_20170);
         this.field_20166.method_14676();
         this.field_20163.method_19114((class_2269)null);
         this.field_20163.method_19117(this.field_20166);
      }

      this.field_943.method_8609(this);
   }

   private void method_19240(boolean var1) {
      if (!var1) {
         this.field_943.method_8609(this);
      } else {
         this.method_19239(this.field_20170);
      }
   }

   @Override
   public boolean method_26946(int var1, int var2, int var3) {
      if (!super.method_26946(var1, var2, var3)) {
         if (var1 != 294) {
            if (this.field_20163.method_36226() == null) {
               return false;
            } else if (var1 != 257 && var1 != 335) {
               return this.field_20163.method_26946(var1, var2, var3);
            } else {
               this.method_19235();
               return true;
            }
         } else {
            this.method_19231();
            return true;
         }
      } else {
         return true;
      }
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.field_20173 = null;
      this.method_1183(var1);
      this.field_20163.method_6767(var1, var2, var3, var4);
      method_9788(var1, this.field_948, this.field_947, this.field_941 / 2, 20, 16777215);
      super.method_6767(var1, var2, var3, var4);
      if (this.field_20173 != null) {
         this.method_1160(var1, this.field_20173, var2, var3);
      }
   }

   public void method_19235() {
      class_2269 var3 = this.field_20163.method_36226();
      if (!(var3 instanceof class_6757)) {
         if (var3 instanceof class_6343) {
            class_7295 var4 = ((class_6343)var3).method_29022();
            this.method_19239(new class_2560(var4.method_33291(), var4.method_33293(), true));
         }
      } else {
         this.method_19239(((class_6757)var3).method_30964());
      }
   }

   private void method_19239(class_2560 var1) {
      if (var1.field_12675 != null && var1.field_12675.contains("hypixel.net") && class_3347.method_15348().method_2055() < class_412.field_1732.method_2055()) {
         class_3347.field_16509 = class_412.field_1732;
      }

      class_314.method_1417(var1);
      this.field_943.method_8609(new class_501(this, this.field_943, var1));
   }

   public void method_19234(class_2269 var1) {
      this.field_20163.method_19114(var1);
      this.method_19233();
   }

   public void method_19233() {
      this.field_20174.field_36675 = false;
      this.field_20167.field_36675 = false;
      this.field_20165.field_36675 = false;
      class_2269 var3 = this.field_20163.method_36226();
      if (var3 != null && !(var3 instanceof class_7668)) {
         this.field_20174.field_36675 = true;
         if (var3 instanceof class_6757) {
            this.field_20167.field_36675 = true;
            this.field_20165.field_36675 = true;
         }
      }
   }

   public class_7081 method_19238() {
      return this.field_20175;
   }

   public void method_19237(List<ITextComponent> var1) {
      this.field_20173 = var1;
   }

   public class_3187 method_19242() {
      return this.field_20166;
   }
}
