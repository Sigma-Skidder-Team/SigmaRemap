package remapped;

public class class_521 implements Runnable {
   public class_521(class_3484 var1, String var2, Object[] var3, class_9240 var4) {
      this.field_3182 = var1;
      this.field_3181 = var2;
      this.field_3179 = var3;
      this.field_3183 = var4;
   }

   @Override
   public void run() {
      JSONArray var3 = new JSONArray();
      var3.method_6159(this.field_3181);
      if (this.field_3179 != null) {
         for (Object var7 : this.field_3179) {
            var3.method_6159(var7);
         }
      }

      class_3872 var8 = new class_3872<JSONArray>(2, var3);
      if (this.field_3183 != null) {
         class_3484.method_16020().fine(String.format("emitting packet with ack id %d", class_3484.method_16022(this.field_3182)));
         class_3484.method_15991(this.field_3182).put(class_3484.method_16022(this.field_3182), this.field_3183);
         var8.field_18861 = class_3484.method_15988(this.field_3182);
      }

      if (!class_3484.method_16008(this.field_3182)) {
         class_3484.method_15997(this.field_3182).add(var8);
      } else {
         class_3484.method_16006(this.field_3182, var8);
      }
   }
}
