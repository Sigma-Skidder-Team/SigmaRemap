package mapped;

import java.io.IOException;

public class Class5474 implements Packet<Class5116> {
   private static String[] field24304;
   private Class1864 field24305;
   private int field24306;
   private double field24307;
   private double field24308;
   private double field24309;
   private double field24310;
   private long field24311;
   private int field24312;
   private int field24313;

   public Class5474() {
   }

   public Class5474(Class7522 var1, Class1864 var2) {
      this.field24305 = var2;
      this.field24307 = var1.method24534();
      this.field24308 = var1.method24535();
      this.field24310 = var1.method24537();
      this.field24309 = var1.method24539();
      this.field24311 = var1.method24538();
      this.field24306 = var1.method24545();
      this.field24313 = var1.method24553();
      this.field24312 = var1.method24551();
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24305 = var1.<Class1864>method35712(Class1864.class);
      switch (Class6602.field29038[this.field24305.ordinal()]) {
         case 1:
            this.field24309 = var1.readDouble();
            break;
         case 2:
            this.field24310 = var1.readDouble();
            this.field24309 = var1.readDouble();
            this.field24311 = var1.method35715();
            break;
         case 3:
            this.field24307 = var1.readDouble();
            this.field24308 = var1.readDouble();
            break;
         case 4:
            this.field24313 = var1.method35714();
            break;
         case 5:
            this.field24312 = var1.method35714();
            break;
         case 6:
            this.field24307 = var1.readDouble();
            this.field24308 = var1.readDouble();
            this.field24310 = var1.readDouble();
            this.field24309 = var1.readDouble();
            this.field24311 = var1.method35715();
            this.field24306 = var1.method35714();
            this.field24313 = var1.method35714();
            this.field24312 = var1.method35714();
      }
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.method35713(this.field24305);
      switch (Class6602.field29038[this.field24305.ordinal()]) {
         case 1:
            var1.writeDouble(this.field24309);
            break;
         case 2:
            var1.writeDouble(this.field24310);
            var1.writeDouble(this.field24309);
            var1.method35719(this.field24311);
            break;
         case 3:
            var1.writeDouble(this.field24307);
            var1.writeDouble(this.field24308);
            break;
         case 4:
            var1.writeVarInt(this.field24313);
            break;
         case 5:
            var1.writeVarInt(this.field24312);
            break;
         case 6:
            var1.writeDouble(this.field24307);
            var1.writeDouble(this.field24308);
            var1.writeDouble(this.field24310);
            var1.writeDouble(this.field24309);
            var1.method35719(this.field24311);
            var1.writeVarInt(this.field24306);
            var1.writeVarInt(this.field24313);
            var1.writeVarInt(this.field24312);
      }
   }

   public void method17180(Class5116 var1) {
      var1.method15758(this);
   }

   public void method17221(Class7522 var1) {
      switch (Class6602.field29038[this.field24305.ordinal()]) {
         case 1:
            var1.method24540(this.field24309);
            break;
         case 2:
            var1.method24541(this.field24310, this.field24309, this.field24311);
            break;
         case 3:
            var1.method24536(this.field24307, this.field24308);
            break;
         case 4:
            var1.method24554(this.field24313);
            break;
         case 5:
            var1.method24552(this.field24312);
            break;
         case 6:
            var1.method24536(this.field24307, this.field24308);
            if (this.field24311 > 0L) {
               var1.method24541(this.field24310, this.field24309, this.field24311);
            } else {
               var1.method24540(this.field24309);
            }

            var1.method24544(this.field24306);
            var1.method24554(this.field24313);
            var1.method24552(this.field24312);
      }
   }
}