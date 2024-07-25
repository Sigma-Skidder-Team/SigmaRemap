package remapped;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class class_4879 extends class_446 {
   private static String[] field_24272;
   private List<class_9074> field_24271 = new ArrayList<class_9074>();
   private class_9450 field_24274 = new class_9450();
   public class_5794 field_24273 = new class_5794();

   public class_4879(class_7038 var1, String var2) {
      super(var1, var2, 0, 0, MinecraftClient.getInstance().window.method_43166(), MinecraftClient.getInstance().window.method_43163(), false);
      this.method_32177(false);
      this.method_32119(false);
      this.method_32187(false);
      this.method_32091(true);
   }

   @Override
   public void method_32177(boolean var1) {
      super.method_32177(false);
   }

   @Override
   public void method_32145(int var1, int var2) {
      super.method_32145(var1, var2);
   }

   @Override
   public void method_32178(float var1) {
      this.method_32130();
      int var4 = MinecraftClient.getInstance().window.getScaledWidth();
      int var5 = MinecraftClient.getInstance().window.getScaledHeight();
      int var6 = (int)((float)var4 / 4.0F);
      boolean var7 = false;
      if (this.field_24271.size() < var6) {
         this.field_24271.add(new class_9074((float)this.field_24273.nextInt(var4), (float)this.field_24273.nextInt(var5)));
      }

      while (this.field_24271.size() > var6) {
         this.field_24271.remove(0);
      }

      if (var7) {
         for (int var8 = 0; var8 < this.field_24271.size(); var8++) {
            this.field_24271.get(var8).field_46440 = (float)this.field_24273.nextInt(var4);
            this.field_24271.get(var8).field_46449 = (float)this.field_24273.nextInt(var5);
         }
      }

      this.field_24274.method_43704();
      Iterator var10 = this.field_24271.iterator();

      while (var10.hasNext()) {
         class_9074 var9 = (class_9074)var10.next();
         var9.method_41653();
         if (!(var9.field_46440 < -50.0F)
            && !(var9.field_46440 > (float)(var4 + 50))
            && !(var9.field_46449 < -50.0F)
            && !(var9.field_46449 > (float)(var5 + 50))
            && class_9074.method_41652(var9) != 0.0F) {
            var9.method_41654(var1);
         } else {
            var10.remove();
         }
      }

      super.method_32178(var1);
   }
}
