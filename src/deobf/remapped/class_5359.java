package remapped;

public interface class_5359 extends class_7907 {
   class_3884 method_24462();

   void method_24457();

   void method_24460(int var1, byte var2);

   void method_24463(int var1, short var2);

   void method_24458(int var1, float var2);

   @Override
   default class_7907 method_35761(double var1, double var3, double var5) {
      if (this.method_24462().method_17954() == class_2335.field_11661) {
         this.method_24458(0, (float)var1);
         this.method_24458(4, (float)var3);
         this.method_24458(8, (float)var5);
         this.method_24457();
         return this;
      } else {
         throw new IllegalStateException();
      }
   }

   @Override
   default class_7907 method_35743(int var1, int var2, int var3, int var4) {
      class_3884 var7 = this.method_24462();
      if (var7.method_17959() == class_9783.field_49652) {
         if (var7.method_17954() == class_2335.field_11663) {
            this.method_24460(0, (byte)var1);
            this.method_24460(1, (byte)var2);
            this.method_24460(2, (byte)var3);
            this.method_24460(3, (byte)var4);
            this.method_24457();
            return this;
         } else {
            throw new IllegalStateException();
         }
      } else {
         return this;
      }
   }

   @Override
   default class_7907 method_35745(float var1, float var2) {
      class_3884 var5 = this.method_24462();
      if (var5.method_17959() == class_9783.field_49659 && var5.method_17960() == 0) {
         if (var5.method_17954() == class_2335.field_11661) {
            this.method_24458(0, var1);
            this.method_24458(4, var2);
            this.method_24457();
            return this;
         } else {
            throw new IllegalStateException();
         }
      } else {
         return this;
      }
   }

   @Override
   default class_7907 method_35738(int var1, int var2) {
      return this.method_24461((short)var1, (short)var2, 1);
   }

   @Override
   default class_7907 method_35748(int var1, int var2) {
      return this.method_24461((short)var1, (short)var2, 2);
   }

   default class_7907 method_24461(short var1, short var2, int var3) {
      class_3884 var6 = this.method_24462();
      if (var6.method_17959() != class_9783.field_49659 || var6.method_17960() != var3) {
         return this;
      } else if (var6.method_17954() == class_2335.field_11655) {
         this.method_24463(0, var1);
         this.method_24463(2, var2);
         this.method_24457();
         return this;
      } else {
         throw new IllegalStateException();
      }
   }

   @Override
   default class_7907 method_35755(float var1, float var2, float var3) {
      class_3884 var6 = this.method_24462();
      if (var6.method_17959() == class_9783.field_49650) {
         if (var6.method_17954() == class_2335.field_11660) {
            this.method_24460(0, method_24459(var1));
            this.method_24460(1, method_24459(var2));
            this.method_24460(2, method_24459(var3));
            this.method_24457();
            return this;
         } else {
            throw new IllegalStateException();
         }
      } else {
         return this;
      }
   }

   static byte method_24459(float var0) {
      return (byte)((int)(class_9299.method_42828(var0, -1.0F, 1.0F) * 127.0F) & 0xFF);
   }
}
