package remapped;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;

public class class_5490 extends class_4641 {
   public class_6933 field_27978;

   public class_5490(class_6629<? extends class_5490> var1, World var2) {
      super(var1, var2);
   }

   public class_5490(World var1, class_1331 var2, Direction var3) {
      super(class_6629.field_34313, var1, var2);
      ArrayList var6 = Lists.newArrayList();
      int var7 = 0;

      for (class_6933 var9 : class_8669.field_44450) {
         this.field_27978 = var9;
         this.method_21468(var3);
         if (this.method_21472()) {
            var6.add(var9);
            int var10 = var9.method_31700() * var9.method_31699();
            if (var10 > var7) {
               var7 = var10;
            }
         }
      }

      if (!var6.isEmpty()) {
         Iterator var11 = var6.iterator();

         while (var11.hasNext()) {
            class_6933 var12 = (class_6933)var11.next();
            if (var12.method_31700() * var12.method_31699() < var7) {
               var11.remove();
            }
         }

         this.field_27978 = (class_6933)var6.get(this.field_41717.nextInt(var6.size()));
      }

      this.method_21468(var3);
   }

   public class_5490(World var1, class_1331 var2, Direction var3, class_6933 var4) {
      this(var1, var2, var3);
      this.field_27978 = var4;
      this.method_21468(var3);
   }

   @Override
   public void method_37376(CompoundNBT var1) {
      var1.method_25941("Motive", class_8669.field_44450.method_39797(this.field_27978).toString());
      var1.method_25921("Facing", (byte)this.field_22663.method_1031());
      super.method_37376(var1);
   }

   @Override
   public void method_37314(CompoundNBT var1) {
      this.field_27978 = class_8669.field_44450.method_39806(Identifier.method_21455(var1.method_25965("Motive")));
      this.field_22663 = Direction.method_1040(var1.method_25950("Facing"));
      super.method_37314(var1);
      this.method_21468(this.field_22663);
   }

   @Override
   public int method_21470() {
      return this.field_27978 != null ? this.field_27978.method_31700() : 1;
   }

   @Override
   public int method_21473() {
      return this.field_27978 != null ? this.field_27978.method_31699() : 1;
   }

   @Override
   public void method_21475(Entity var1) {
      if (this.field_41768.method_29537().method_1285(class_291.field_1024)) {
         this.method_37155(class_463.field_2198, 1.0F, 1.0F);
         if (var1 instanceof class_704) {
            class_704 var4 = (class_704)var1;
            if (var4.playerAbilities.isCreativeMode) {
               return;
            }
         }

         this.method_37312(class_4897.field_24370);
      }
   }

   @Override
   public void method_21471() {
      this.method_37155(class_463.field_2679, 1.0F, 1.0F);
   }

   @Override
   public void method_37144(double var1, double var3, double var5, float var7, float var8) {
      this.method_37256(var1, var3, var5);
   }

   @Override
   public void method_37318(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
      class_1331 var13 = this.field_22661.method_6103(var1 - this.method_37302(), var3 - this.method_37309(), var5 - this.method_37156());
      this.method_37256((double)var13.method_12173(), (double)var13.method_12165(), (double)var13.method_12185());
   }

   @Override
   public Packet<?> method_37142() {
      return new class_4448(this);
   }
}
