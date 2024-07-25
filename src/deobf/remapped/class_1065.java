package remapped;

import com.google.common.collect.Sets;
import java.util.HashSet;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_1065 extends class_1094 implements class_8266 {
   private static final Logger field_5838 = LogManager.getLogger();
   private final class_266 field_5840;
   private volatile ITextComponent field_5833 = StringTextComponent.EMPTY;
   private volatile ITextComponent field_5836;
   private volatile boolean field_5832;
   private int field_5839;
   private final class_5875 field_5841;
   private final int field_5834 = 212;
   public static final String[] field_5837 = new String[]{
      "▃ ▄ ▅ ▆ ▇ █ ▇ ▆ ▅ ▄ ▃",
      "_ ▃ ▄ ▅ ▆ ▇ █ ▇ ▆ ▅ ▄",
      "_ _ ▃ ▄ ▅ ▆ ▇ █ ▇ ▆ ▅",
      "_ _ _ ▃ ▄ ▅ ▆ ▇ █ ▇ ▆",
      "_ _ _ _ ▃ ▄ ▅ ▆ ▇ █ ▇",
      "_ _ _ _ _ ▃ ▄ ▅ ▆ ▇ █",
      "_ _ _ _ ▃ ▄ ▅ ▆ ▇ █ ▇",
      "_ _ _ ▃ ▄ ▅ ▆ ▇ █ ▇ ▆",
      "_ _ ▃ ▄ ▅ ▆ ▇ █ ▇ ▆ ▅",
      "_ ▃ ▄ ▅ ▆ ▇ █ ▇ ▆ ▅ ▄",
      "▃ ▄ ▅ ▆ ▇ █ ▇ ▆ ▅ ▄ ▃",
      "▄ ▅ ▆ ▇ █ ▇ ▆ ▅ ▄ ▃ _",
      "▅ ▆ ▇ █ ▇ ▆ ▅ ▄ ▃ _ _",
      "▆ ▇ █ ▇ ▆ ▅ ▄ ▃ _ _ _",
      "▇ █ ▇ ▆ ▅ ▄ ▃ _ _ _ _",
      "█ ▇ ▆ ▅ ▄ ▃ _ _ _ _ _",
      "▇ █ ▇ ▆ ▅ ▄ ▃ _ _ _ _",
      "▆ ▇ █ ▇ ▆ ▅ ▄ ▃ _ _ _",
      "▅ ▆ ▇ █ ▇ ▆ ▅ ▄ ▃ _ _",
      "▄ ▅ ▆ ▇ █ ▇ ▆ ▅ ▄ ▃ _"
   };

   public class_1065(class_266 var1, class_5875 var2) {
      this.field_5840 = var1;
      this.field_5841 = var2;
      var2.method_26753(this);
      Thread var5 = new Thread(var2, "Realms-long-running-task");
      var5.setUncaughtExceptionHandler(new class_4525(field_5838));
      var5.start();
   }

   @Override
   public void method_5312() {
      super.method_5312();
      class_7567.method_34409(this.field_5833.getString());
      this.field_5839++;
      this.field_5841.method_26754();
   }

   @Override
   public boolean method_26946(int var1, int var2, int var3) {
      if (var1 != 256) {
         return super.method_26946(var1, var2, var3);
      } else {
         this.method_4676();
         return true;
      }
   }

   @Override
   public void method_1163() {
      this.field_5841.method_26758();
      this.<class_9521>method_1186(new class_9521(this.field_941 / 2 - 106, method_4819(12), 212, 20, class_1402.field_7633, var1 -> this.method_4676()));
   }

   private void method_4676() {
      this.field_5832 = true;
      this.field_5841.method_26751();
      this.field_943.method_8609(this.field_5840);
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      method_9788(var1, this.field_948, this.field_5833, this.field_941 / 2, method_4819(3), 16777215);
      ITextComponent var7 = this.field_5836;
      if (var7 != null) {
         method_9788(var1, this.field_948, var7, this.field_941 / 2, method_4819(8), 16711680);
      } else {
         method_9787(var1, this.field_948, field_5837[this.field_5839 % field_5837.length], this.field_941 / 2, method_4819(8), 8421504);
      }

      super.method_6767(var1, var2, var3, var4);
   }

   @Override
   public void method_38113(ITextComponent var1) {
      this.field_5836 = var1;
      class_7567.method_34410(var1.getString());
      this.method_4675();
      this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 - 106, this.field_940 / 4 + 120 + 12, 200, 20, class_1402.field_7632, var1x -> this.method_4676())
      );
   }

   private void method_4675() {
      HashSet var3 = Sets.newHashSet(this.field_950);
      this.field_942.removeIf(var3::contains);
      this.field_950.clear();
   }

   public void method_4674(ITextComponent var1) {
      this.field_5833 = var1;
   }

   public boolean method_4677() {
      return this.field_5832;
   }
}
