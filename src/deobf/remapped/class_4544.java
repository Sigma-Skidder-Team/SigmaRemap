package remapped;

import com.mojang.datafixers.util.Either;

public class class_4544 extends Thread {
   public class_4544(class_1991 var1, String var2, class_480 var3) {
      super(var2);
      this.field_22156 = var1;
      this.field_22157 = var3;
   }

   @Override
   public void run() {
      class_480 var3 = this.field_22157;
      class_176 var4 = class_176.method_777();

      while (var3 != null) {
         Either var5 = class_1991.method_9214(this.field_22156, var3, var4);
         var3 = class_1991.method_9213(this.field_22156)
            .<class_480>method_34452(
               () -> {
                  if (var5.right().isPresent()) {
                     class_1991.method_9203().error("Couldn't fetch templates: {}", var5.right().get());
                     if (class_1991.method_9208(this.field_22156).method_28462()) {
                        class_1991.method_9207(this.field_22156, class_9494.method_43852(class_6956.method_31803("mco.template.select.failure")));
                     }

                     return null;
                  } else {
                     class_480 var4x = (class_480)var5.left().get();

                     for (class_2496 var6 : var4x.field_2981) {
                        class_1991.method_9208(this.field_22156).method_28459(var6);
                     }

                     if (!var4x.field_2981.isEmpty()) {
                        return var4x;
                     } else {
                        if (class_1991.method_9208(this.field_22156).method_28462()) {
                           String var7 = class_6956.method_31803("mco.template.select.none", "%link");
                           class_468 var8 = class_468.method_2254(
                              class_6956.method_31803("mco.template.select.none.linkTitle"), "https://aka.ms/MinecraftRealmsContentCreator"
                           );
                           class_1991.method_9207(this.field_22156, class_9494.method_43852(var7, var8));
                        }

                        return null;
                     }
                  }
               }
            )
            .join();
      }
   }
}
