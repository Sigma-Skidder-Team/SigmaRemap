package mapped;


public abstract class Class6455 extends Class6453 {
   public Class6455(Class2325 var1) {
      super(var1);
   }

   @Override
   public void method19611() throws Class2429 {
      if (this.method19615()) {
         if (!this.method19612()) {
            if (!this.method19613()) {
               if (this.method19614()) {
                  throw new Class2430("Control frame cant have rsv3==true set");
               }
            } else {
               throw new Class2430("Control frame cant have rsv2==true set");
            }
         } else {
            throw new Class2430("Control frame cant have rsv1==true set");
         }
      } else {
         throw new Class2430("Control frame cant have fin==false set");
      }
   }
}
