package remapped;

import java.util.ArrayList;
import java.util.List;

public class class_5477 extends Module {
   public static class_9745 field_27898;
   private List<class_6310<?>> field_27896 = new ArrayList<class_6310<?>>();
   private class_1343 field_27899;
   public float field_27900;
   public float field_27901;

   public class_5477() {
      super(Category.PLAYER, "Blink", "Stops your packets to blink");
   }

   @Override
   public void method_42006() {
      this.field_27899 = new class_1343(mcInstance.field_9632.method_37302(), mcInstance.field_9632.method_37309(), mcInstance.field_9632.method_37156());
      this.field_27900 = mcInstance.field_9632.field_41701;
      this.field_27901 = mcInstance.field_9632.field_41755;
      field_27898 = new class_9745(mcInstance.field_9601, mcInstance.field_9632.method_3247());
      field_27898.field_3853 = mcInstance.field_9632.field_3853;
      field_27898.method_37249(this.field_27899.field_7336, this.field_27899.field_7333, this.field_27899.field_7334, this.field_27900, this.field_27901);
      field_27898.field_29618 = mcInstance.field_9632.field_29618;
      mcInstance.field_9601.method_725(-1, field_27898);
   }

   @Override
   public void method_42020() {
      int var3 = this.field_27896.size();

      for (int var4 = 0; var4 < var3; var4++) {
         mcInstance.method_8614().method_4813(this.field_27896.get(var4));
      }

      this.field_27896.clear();
      mcInstance.field_9601.method_754(-1);
   }

   @EventListen
   private void method_24894(class_2157 var1) {
      if (this.method_42015()) {
         if (mcInstance.field_9632 != null && var1.method_10047() instanceof class_2317
            || var1.method_10047() instanceof class_4609
            || var1.method_10047() instanceof class_3398
            || var1.method_10047() instanceof class_3195
            || var1.method_10047() instanceof class_1022) {
            this.field_27896.add(var1.method_10047());
            var1.method_29715(true);
         }
      }
   }
}
