package remapped;

import java.net.InetAddress;
import java.net.UnknownHostException;
import net.minecraft.util.text.TranslationTextComponent;

public class class_4029 extends Thread {
   public class_4029(class_7736 var1, String var2, String var3, int var4, class_1893 var5, class_7675 var6) {
      super(var2);
      this.field_19574 = var1;
      this.field_19573 = var3;
      this.field_19575 = var4;
      this.field_19572 = var5;
      this.field_19576 = var6;
   }

   @Override
   public void run() {
      InetAddress var3 = null;

      try {
         var3 = InetAddress.getByName(this.field_19573);
         if (class_7736.method_35024(this.field_19574)) {
            return;
         }

         class_7736.method_35023(this.field_19574, class_5121.method_23489(var3, this.field_19575, this.field_19572.field_9577.method_40877()));
         if (class_7736.method_35024(this.field_19574)) {
            return;
         }

         class_7736.method_35022(this.field_19574)
            .method_23495(new class_261(class_7736.method_35022(this.field_19574), this.field_19572, class_7736.method_35021(this.field_19574), var0 -> {
            }));
         if (class_7736.method_35024(this.field_19574)) {
            return;
         }

         class_7736.method_35022(this.field_19574).method_23485(new class_8135(this.field_19573, this.field_19575, class_5776.field_29174));
         if (class_7736.method_35024(this.field_19574)) {
            return;
         }

         class_7736.method_35022(this.field_19574).method_23485(new class_4014(this.field_19572.method_8502().method_5370()));
         this.field_19572.method_8604(this.field_19576.method_34780(this.field_19573));
      } catch (UnknownHostException var7) {
         this.field_19572.method_8606().method_25058();
         if (class_7736.method_35024(this.field_19574)) {
            return;
         }

         class_7736.method_35018().error("Couldn't connect to world", var7);
         class_6185 var9 = new class_6185(
            class_7736.method_35021(this.field_19574),
            class_1402.field_7627,
            new TranslationTextComponent("disconnect.genericReason", "Unknown host '" + this.field_19573 + "'")
         );
         this.field_19572.execute(() -> var0.method_8609(var9));
      } catch (Exception var8) {
         this.field_19572.method_8606().method_25058();
         if (class_7736.method_35024(this.field_19574)) {
            return;
         }

         class_7736.method_35018().error("Couldn't connect to world", var8);
         String var5 = var8.toString();
         if (var3 != null) {
            String var6 = var3 + ":" + this.field_19575;
            var5 = var5.replaceAll(var6, "");
         }

         class_6185 var10 = new class_6185(
            class_7736.method_35021(this.field_19574), class_1402.field_7627, new TranslationTextComponent("disconnect.genericReason", var5)
         );
         this.field_19572.execute(() -> var0.method_8609(var10));
      }
   }
}
