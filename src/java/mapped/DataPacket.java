package mapped;

public class DataPacket {
   private short shortValue;
   private byte byteValue;
   public Vector3m.IntegerVector integerVector;

   public DataPacket(short shortValue, byte byteValue, Vector3m.IntegerVector integerVector) {
      this.shortValue = shortValue;
      this.byteValue = byteValue;
      this.integerVector = integerVector;
   }

   public short getShortValue() {
      return this.shortValue;
   }

   public byte getByteValue() {
      return this.byteValue;
   }

   public Vector3m.IntegerVector getIntegerVector() {
      return this.integerVector;
   }
}
