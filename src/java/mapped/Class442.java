package mapped;

import com.google.common.collect.Maps;
import net.minecraft.client.util.Util;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.io.IOException;
import java.net.*;
import java.util.Map;

public class Class442 extends Class440 {
   private static final Logger field1990 = LogManager.getLogger();
   private long field1991;
   private final int field1992;
   private final int field1993;
   private final int field1994;
   private final String field1995;
   private final String field1996;
   private DatagramSocket field1997;
   private final byte[] field1998 = new byte[1460];
   private String field1999;
   private String field2000;
   private final Map<SocketAddress, Class8951> field2001;
   private final Class7588 field2002;
   private long field2003;
   private final Class1646 field2004;

   private Class442(Class1646 var1, int var2) {
      super("Query Listener");
      this.field2004 = var1;
      this.field1992 = var2;
      this.field2000 = var1.method6501();
      this.field1993 = var1.method6502();
      this.field1995 = var1.method6503();
      this.field1994 = var1.method1323();
      this.field1996 = var1.method6511();
      this.field2003 = 0L;
      this.field1999 = "0.0.0.0";
      if (!this.field2000.isEmpty() && !this.field1999.equals(this.field2000)) {
         this.field1999 = this.field2000;
      } else {
         this.field2000 = "0.0.0.0";

         try {
            InetAddress var5 = InetAddress.getLocalHost();
            this.field1999 = var5.getHostAddress();
         } catch (UnknownHostException var6) {
            field1990.warn("Unable to determine local host IP, please set server-ip in server.properties", var6);
         }
      }

      this.field2002 = new Class7588(1460);
      this.field2001 = Maps.newHashMap();
   }

   @Nullable
   public static Class442 method1874(Class1646 var0) {
      int var3 = var0.method6498().field43803;
      if (0 < var3 && 65535 >= var3) {
         Class442 var4 = new Class442(var0, var3);
         return var4.method1867() ? var4 : null;
      } else {
         field1990.warn("Invalid query port {} found in server.properties (queries disabled)", var3);
         return null;
      }
   }

   private void method1875(byte[] var1, DatagramPacket var2) throws IOException {
      this.field1997.send(new DatagramPacket(var1, var1.length, var2.getSocketAddress()));
   }

   private boolean method1876(DatagramPacket var1) throws IOException {
      byte[] var4 = var1.getData();
      int var5 = var1.getLength();
      SocketAddress var6 = var1.getSocketAddress();
      field1990.debug("Packet len {} [{}]", var5, var6);
      if (3 <= var5 && -2 == var4[0] && -3 == var4[1]) {
         field1990.debug("Packet '{}' [{}]", Class8414.method29546(var4[2]), var6);
         switch (var4[2]) {
            case 0:
               if (!this.method1879(var1)) {
                  field1990.debug("Invalid challenge [{}]", var6);
                  return false;
               } else if (15 == var5) {
                  this.method1875(this.method1877(var1), var1);
                  field1990.debug("Rules [{}]", var6);
               } else {
                  Class7588 var7 = new Class7588(1460);
                  var7.method24841(0);
                  var7.method24839(this.method1878(var1.getSocketAddress()));
                  var7.method24840(this.field1995);
                  var7.method24840("SMP");
                  var7.method24840(this.field1996);
                  var7.method24840(Integer.toString(this.field2004.method1322()));
                  var7.method24840(Integer.toString(this.field1994));
                  var7.method24842((short)this.field1993);
                  var7.method24840(this.field1999);
                  this.method1875(var7.method24843(), var1);
                  field1990.debug("Status [{}]", var6);
               }
            default:
               return true;
            case 9:
               this.method1880(var1);
               field1990.debug("Challenge [{}]", var6);
               return true;
         }
      } else {
         field1990.debug("Invalid packet [{}]", var6);
         return false;
      }
   }

   private byte[] method1877(DatagramPacket var1) throws IOException {
      long var4 = Util.milliTime();
      if (var4 < this.field2003 + 5000L) {
         byte[] var11 = this.field2002.method24843();
         byte[] var12 = this.method1878(var1.getSocketAddress());
         var11[1] = var12[0];
         var11[2] = var12[1];
         var11[3] = var12[2];
         var11[4] = var12[3];
         return var11;
      } else {
         this.field2003 = var4;
         this.field2002.method24844();
         this.field2002.method24841(0);
         this.field2002.method24839(this.method1878(var1.getSocketAddress()));
         this.field2002.method24840("splitnum");
         this.field2002.method24841(128);
         this.field2002.method24841(0);
         this.field2002.method24840("hostname");
         this.field2002.method24840(this.field1995);
         this.field2002.method24840("gametype");
         this.field2002.method24840("SMP");
         this.field2002.method24840("game_id");
         this.field2002.method24840("MINECRAFT");
         this.field2002.method24840("version");
         this.field2002.method24840(this.field2004.method1321());
         this.field2002.method24840("plugins");
         this.field2002.method24840(this.field2004.method6508());
         this.field2002.method24840("map");
         this.field2002.method24840(this.field1996);
         this.field2002.method24840("numplayers");
         this.field2002.method24840("" + this.field2004.method1322());
         this.field2002.method24840("maxplayers");
         this.field2002.method24840("" + this.field1994);
         this.field2002.method24840("hostport");
         this.field2002.method24840("" + this.field1993);
         this.field2002.method24840("hostip");
         this.field2002.method24840(this.field1999);
         this.field2002.method24841(0);
         this.field2002.method24841(1);
         this.field2002.method24840("player_");
         this.field2002.method24841(0);
         String[] var6 = this.field2004.method1324();

         for (String var10 : var6) {
            this.field2002.method24840(var10);
         }

         this.field2002.method24841(0);
         return this.field2002.method24843();
      }
   }

   private byte[] method1878(SocketAddress var1) {
      return this.field2001.get(var1).method32702();
   }

   private Boolean method1879(DatagramPacket var1) {
      SocketAddress var4 = var1.getSocketAddress();
      if (this.field2001.containsKey(var4)) {
         byte[] var5 = var1.getData();
         return this.field2001.get(var4).method32700() == Class8414.method29545(var5, 7, var1.getLength());
      } else {
         return false;
      }
   }

   private void method1880(DatagramPacket var1) throws IOException {
      Class8951 var4 = new Class8951(var1);
      this.field2001.put(var1.getSocketAddress(), var4);
      this.method1875(var4.method32701(), var1);
   }

   private void method1881() {
      if (this.field1982) {
         long var3 = Util.milliTime();
         if (var3 >= this.field1991 + 30000L) {
            this.field1991 = var3;
            this.field2001.values().removeIf(var2 -> var2.method32699(var3));
         }
      }
   }

   @Override
   public void run() {
      field1990.info("Query running on {}:{}", this.field2000, this.field1992);
      this.field1991 = Util.milliTime();
      DatagramPacket var3 = new DatagramPacket(this.field1998, this.field1998.length);

      try {
         while (this.field1982) {
            try {
               this.field1997.receive(var3);
               this.method1881();
               this.method1876(var3);
            } catch (SocketTimeoutException var10) {
               this.method1881();
            } catch (PortUnreachableException var11) {
            } catch (IOException var12) {
               this.method1882(var12);
            }
         }
      } finally {
         field1990.debug("closeSocket: {}:{}", this.field2000, this.field1992);
         this.field1997.close();
      }
   }

   @Override
   public boolean method1867() {
      if (!this.field1982) {
         return this.method1883() ? super.method1867() : false;
      } else {
         return true;
      }
   }

   private void method1882(Exception var1) {
      if (this.field1982) {
         field1990.warn("Unexpected exception", var1);
         if (!this.method1883()) {
            field1990.error("Failed to recover from exception, shutting down!");
            this.field1982 = false;
         }
      }
   }

   private boolean method1883() {
      try {
         this.field1997 = new DatagramSocket(this.field1992, InetAddress.getByName(this.field2000));
         this.field1997.setSoTimeout(500);
         return true;
      } catch (Exception var4) {
         field1990.warn("Unable to initialise query system on {}:{}", this.field2000, this.field1992, var4);
         return false;
      }
   }
}
