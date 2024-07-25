package remapped;

public interface class_1167<R extends class_2997> extends class_2431 {
   void method_5189(long var1, long var3);

   R method_5186(class_6604 var1);

   default R method_5187(class_6604 var1, R var2) {
      return this.method_5186(var1);
   }

   default R method_5188(class_6604 var1, R var2, R var3) {
      return this.method_5186(var1);
   }

   default int method_5190(int var1, int var2) {
      return this.㠠牰ኞ罡ใ堧(2) != 0 ? var2 : var1;
   }

   default int method_5191(int var1, int var2, int var3, int var4) {
      int var7 = this.㠠牰ኞ罡ใ堧(4);
      if (var7 != 0) {
         if (var7 != 1) {
            return var7 != 2 ? var4 : var3;
         } else {
            return var2;
         }
      } else {
         return var1;
      }
   }
}
