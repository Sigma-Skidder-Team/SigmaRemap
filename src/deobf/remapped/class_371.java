package remapped;

import java.io.DataInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class class_371 {
   public static final int field_1474 = 1413565506;
   public static final int field_1467 = 1414745921;
   public static final int field_1506 = 1414546737;
   public static final int field_1436 = 1095780675;
   public static final int field_1448 = 1095061059;
   public static final int field_1512 = 1095979081;
   public static final int field_1513 = 1414546738;
   public static final int field_1489 = 1413632077;
   public static final int field_1515 = 1129270605;
   public static final int field_1517 = 1129270610;
   public static final int field_1501 = 1464029005;
   public static final int field_1461 = 1413697357;
   public static final int field_1477 = 1414546739;
   public static final int field_1486 = 1414091825;
   public static final int field_1500 = 1413697358;
   public static final int field_1439 = 1464029008;
   public static final int field_1443 = 1413697360;
   public static final int field_1488 = 1413828163;
   public static final int field_1459 = 1413760334;
   public static final int field_1437 = 1162756946;
   public static final int field_1507 = 1162958130;
   public static final int field_1470 = 1163150159;
   public static final int field_1435 = 1414485838;
   public static final int field_1487 = 1413893204;
   public static final int field_1452 = 1195724610;
   public static final int field_1463 = 1196575044;
   public static final int field_1482 = 1414219097;
   public static final int field_1445 = 1414681422;
   public static final int field_1460 = 1414681423;
   public static final int field_1494 = 1414546740;
   public static final int field_1434 = 1414090828;
   public static final int field_1473 = 1414746691;
   public static final int field_1427 = 1414283598;
   public static final int field_1441 = 1414284622;
   public static final int field_1464 = 1279872587;
   public static final int field_1430 = 1413830740;
   public static final int field_1479 = 1414350148;
   public static final int field_1431 = 1414352719;
   public static final int field_1483 = 1296845908;
   public static final int field_1462 = 1414349644;
   public static final int field_1485 = 1296254025;
   public static final int field_1433 = 1464811858;
   public static final int field_1426 = 1464811846;
   public static final int field_1518 = 1464811859;
   public static final int field_1493 = 1464816211;
   public static final int field_1510 = 1414480204;
   public static final int field_1471 = 1414484037;
   public static final int field_1511 = 1414481486;
   public static final int field_1444 = 1414483033;
   public static final int field_1456 = 1413762898;
   public static final int field_1457 = 1331121733;
   public static final int field_1498 = 1414549331;
   public static final int field_1447 = 1464877401;
   public static final int field_1458 = 1414745936;
   public static final int field_1504 = 1413762137;
   public static final int field_1442 = 1346588244;
   public static final int field_1481 = 1347375181;
   public static final int field_1484 = 1347375955;
   public static final int field_1508 = 1347570006;
   public static final int field_1468 = 1414550095;
   public static final int field_1429 = 1414550850;
   public static final int field_1480 = 1464882498;
   public static final int field_1497 = 1380078918;
   public static final int field_1490 = 1413763651;
   public static final int field_1516 = 1381384498;
   public static final int field_1496 = 1413763660;
   public static final int field_1475 = 1381388866;
   public static final int field_1476 = 1397048651;
   public static final int field_1469 = 1414746964;
   public static final int field_1499 = 1397311310;
   public static final int field_1478 = 1414746949;
   public static final int field_1454 = 1414091827;
   public static final int field_1491 = 1398361172;
   public static final int field_1451 = 1398363203;
   public static final int field_1440 = 1413764167;
   public static final int field_1455 = 1431520594;
   public static final int field_1503 = 1414091826;
   public static final int field_1492 = 1414745940;
   public static final int field_1450 = 1414677323;
   public static final int field_1502 = 1430669636;
   public static final int field_1514 = 1431522388;
   public static final int field_1428 = 1415075928;
   public static final int field_1449 = 1465407576;
   private static final String[] field_1432 = new String[]{"ISO-8859-1", "UTF-16", "UTF-16", "UTF-8"};
   private static final String[] field_1472 = new String[]{"yyyy, yyyy-MM", "yyyy-MM-dd", "yyyy-MM-ddTHH", "yyyy-MM-ddTHH:mm", "yyyy-MM-ddTHH:mm:ss"};
   private static final String field_1446 = "xxx";
   private long field_1466;
   private int field_1509;
   private int field_1453;
   private int field_1505;
   private int field_1495;
   private byte[] field_1465;

   public class_371(DataInputStream var1) throws IOException {
      this.field_1509 = var1.readInt();
      this.field_1466 = (long)class_7575.method_34432(var1);
      this.field_1453 = var1.readShort();
      if (this.method_1826()) {
         this.field_1505 = var1.read();
      }

      if (this.method_1820()) {
         this.field_1495 = var1.read();
      }

      this.field_1465 = new byte[(int)this.field_1466];
      var1.readFully(this.field_1465);
   }

   public int method_1831() {
      return this.field_1509;
   }

   public long method_1827() {
      return this.field_1466;
   }

   public final boolean method_1826() {
      return (this.field_1453 & 64) == 64;
   }

   public int method_1824() {
      return this.field_1505;
   }

   public final boolean method_1828() {
      return (this.field_1453 & 8) == 8;
   }

   public final boolean method_1820() {
      return (this.field_1453 & 4) == 4;
   }

   public int method_1818() {
      return this.field_1495;
   }

   public byte[] method_1823() {
      return this.field_1465;
   }

   public String method_1822() {
      return new String(this.field_1465, Charset.forName(field_1432[0]));
   }

   public String method_1819() {
      byte var3 = this.field_1465[0];
      int var4 = -1;

      for (int var5 = 1; var5 < this.field_1465.length && var4 < 0; var5++) {
         if (this.field_1465[var5] == 0 && (var3 == 0 || var3 == 3 || this.field_1465[var5 + 1] == 0)) {
            var4 = var5;
         }
      }

      return new String(this.field_1465, 1, var4 - 1, Charset.forName(field_1432[var3]));
   }

   public int method_1825() {
      return Integer.parseInt(new String(this.field_1465));
   }

   public int[] method_1830() {
      String var3 = new String(this.field_1465, Charset.forName(field_1432[0]));
      int var4 = var3.indexOf(47);
      int[] var5;
      if (var4 <= 0) {
         var5 = new int[]{Integer.parseInt(var3)};
      } else {
         var5 = new int[]{Integer.parseInt(var3.substring(0, var4)), Integer.parseInt(var3.substring(var4 + 1))};
      }

      return var5;
   }

   public Date method_1821() {
      int var3 = (int)Math.floor((double)(this.field_1465.length / 3)) - 1;
      Date var4;
      if (var3 >= 0 && var3 < field_1472.length) {
         SimpleDateFormat var5 = new SimpleDateFormat(field_1472[var3]);
         var4 = var5.parse(new String(this.field_1465), new ParsePosition(0));
      } else {
         var4 = null;
      }

      return var4;
   }

   public Locale method_1829() {
      String var3 = new String(this.field_1465).toLowerCase();
      Locale var4;
      if (!var3.equals("xxx")) {
         var4 = new Locale(var3);
      } else {
         var4 = null;
      }

      return var4;
   }
}
