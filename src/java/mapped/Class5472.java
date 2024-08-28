package mapped;

import java.io.IOException;
import java.util.UUID;
import net.minecraft.util.text.ITextComponent;

public class Class5472 implements Packet<Class5116> {
   private UUID field24287;
   private Class2151 field24288;
   public ITextComponent field24289;
   private float field24290;
   private Class2303 field24291;
   private Class2300 field24292;
   private boolean field24293;
   private boolean field24294;
   private boolean field24295;

   public Class5472() {
   }

   public Class5472(Class2151 var1, Class3625 var2) {
      this.field24288 = var1;
      this.field24287 = var2.method12289();
      this.field24289 = var2.method12290();
      this.field24290 = var2.method12291();
      this.field24291 = var2.method12292();
      this.field24292 = var2.method12293();
      this.field24293 = var2.method12294();
      this.field24294 = var2.method12295();
      this.field24295 = var2.method12296();
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24287 = var1.method35717();
      this.field24288 = var1.<Class2151>method35712(Class2151.class);
      switch (Class9255.field42562[this.field24288.ordinal()]) {
         case 1:
            this.field24289 = var1.method35710();
            this.field24290 = var1.readFloat();
            this.field24291 = var1.<Class2303>method35712(Class2303.class);
            this.field24292 = var1.<Class2300>method35712(Class2300.class);
            this.method17203(var1.readUnsignedByte());
         case 2:
         default:
            break;
         case 3:
            this.field24290 = var1.readFloat();
            break;
         case 4:
            this.field24289 = var1.method35710();
            break;
         case 5:
            this.field24291 = var1.<Class2303>method35712(Class2303.class);
            this.field24292 = var1.<Class2300>method35712(Class2300.class);
            break;
         case 6:
            this.method17203(var1.readUnsignedByte());
      }
   }

   private void method17203(int flags) {
      this.field24293 = (flags & 1) > 0;
      this.field24294 = (flags & 2) > 0;
      this.field24295 = (flags & 4) > 0;
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.method35716(this.field24287);
      var1.method35713(this.field24288);
      switch (Class9255.field42562[this.field24288.ordinal()]) {
         case 1:
            var1.method35711(this.field24289);
            var1.writeFloat(this.field24290);
            var1.method35713(this.field24291);
            var1.method35713(this.field24292);
            var1.writeByte(this.method17204());
         case 2:
         default:
            break;
         case 3:
            var1.writeFloat(this.field24290);
            break;
         case 4:
            var1.method35711(this.field24289);
            break;
         case 5:
            var1.method35713(this.field24291);
            var1.method35713(this.field24292);
            break;
         case 6:
            var1.writeByte(this.method17204());
      }
   }

   private int method17204() {
      byte var3 = 0;
      if (this.field24293) {
         var3 |= 1;
      }

      if (this.field24294) {
         var3 |= 2;
      }

      if (this.field24295) {
         var3 |= 4;
      }

      return var3;
   }

   public void method17180(Class5116 var1) {
      var1.method15762(this);
   }

   public UUID method17205() {
      return this.field24287;
   }

   public Class2151 method17206() {
      return this.field24288;
   }

   public ITextComponent method17207() {
      return this.field24289;
   }

   public float method17208() {
      return this.field24290;
   }

   public Class2303 method17209() {
      return this.field24291;
   }

   public Class2300 method17210() {
      return this.field24292;
   }

   public boolean method17211() {
      return this.field24293;
   }

   public boolean method17212() {
      return this.field24294;
   }

   public boolean method17213() {
      return this.field24295;
   }
}
