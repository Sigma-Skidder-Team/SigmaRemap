package mapped;

import java.util.UUID;

public class Class6038 extends Class6037 {
   private Class187 field26241 = Class187.field699;
   private int field26242 = -1;
   private int field26243 = -1;
   private String field26244;
   private UUID field26245;
   private Class6376 field26246;

   public Class6038(Class7161 var1) {
      super(var1);
   }

   public Class187 method18673() {
      return this.field26241;
   }

   public void method18674(Class187 var1) {
      this.field26241 = var1;
   }

   public int method18675() {
      return this.field26242;
   }

   public void method18676(int var1) {
      Class5989 var4 = Class5989.method18569(var1);
      this.field26242 = var4.method18573();
   }

   public int method18677() {
      return this.field26243;
   }

   public void method18678(int var1) {
      Class5989 var4 = Class5989.method18569(var1);
      this.field26243 = var4.method18573();
   }

   public String method18679() {
      return this.field26244;
   }

   public void method18680(String var1) {
      this.field26244 = var1;
   }

   public UUID method18681() {
      return this.field26245;
   }

   public void method18682(UUID var1) {
      this.field26245 = var1;
   }

   public Class6376 method18683() {
      return this.field26246;
   }

   public void method18684(Class6376 var1) {
      this.field26246 = var1;
   }

   @Override
   public String toString() {
      return "ProtocolInfo{state="
         + this.field26241
         + ", protocolVersion="
         + this.field26242
         + ", serverProtocolVersion="
         + this.field26243
         + ", username='"
         + this.field26244
         + '\''
         + ", uuid="
         + this.field26245
         + '}';
   }
}
