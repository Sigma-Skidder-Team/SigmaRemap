package mapped;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class5585 implements Packet<Class5116> {
   private static String[] field24783;
   private static final Logger field24784 = LogManager.getLogger();
   private BlockPos field24785;
   private Class7380 field24786;
   public Class2070 field24787;
   private boolean field24788;

   public Class5585() {
   }

   public Class5585(BlockPos var1, Class7380 var2, Class2070 var3, boolean var4, String var5) {
      this.field24785 = var1.method8353();
      this.field24786 = var2;
      this.field24787 = var3;
      this.field24788 = var4;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24785 = var1.method35707();
      this.field24786 = Block.field18610.method9172(var1.method35714());
      this.field24787 = var1.<Class2070>method35712(Class2070.class);
      this.field24788 = var1.readBoolean();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.method35708(this.field24785);
      var1.writeVarInt(Block.method11535(this.field24786));
      var1.method35713(this.field24787);
      var1.writeBoolean(this.field24788);
   }

   public void method17180(Class5116 var1) {
      var1.method15780(this);
   }

   public Class7380 method17556() {
      return this.field24786;
   }

   public BlockPos method17557() {
      return this.field24785;
   }

   public boolean method17558() {
      return this.field24788;
   }

   public Class2070 method17559() {
      return this.field24787;
   }
}