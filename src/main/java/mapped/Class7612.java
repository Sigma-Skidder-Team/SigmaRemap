package mapped;



public abstract class Class7612 extends Class7613 {
   @Override
   public void method24932(Class6454 var1) throws Class2429 {
      if (!(var1 instanceof Class6452) || !var1.method19613() && !var1.method19614()) {
         if (var1 instanceof Class6455 && (var1.method19612() || var1.method19613() || var1.method19614())) {
            throw new Class2430("bad rsv RSV1: " + var1.method19612() + " RSV2: " + var1.method19613() + " RSV3: " + var1.method19614());
         }
      } else {
         throw new Class2430("bad rsv RSV1: " + var1.method19612() + " RSV2: " + var1.method19613() + " RSV3: " + var1.method19614());
      }
   }
}
