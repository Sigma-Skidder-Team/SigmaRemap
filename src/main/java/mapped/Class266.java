// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashMap;
import com.google.common.base.Optional;
import java.util.Map;

public enum Class266
{
    field1294(-1), 
    field1295(0, Class266.field1294), 
    field1296(17, Class266.field1294), 
    field1297(21, Class266.field1294), 
    field1298(23, Class266.field1294), 
    field1299(24, Class266.field1294), 
    field1300(25, Class266.field1294), 
    field1301(26, Class266.field1294), 
    field1302(34, Class266.field1294), 
    field1303(39, Class266.field1294), 
    field1304(58, Class266.field1294), 
    field1305(63, Class266.field1294), 
    field1306(101, Class266.field1294), 
    field1307(-1, Class266.field1294), 
    field1308(1, Class266.field1307), 
    field1309(100, Class266.field1307), 
    field1310(-1, Class266.field1307), 
    field1311(18, Class266.field1310), 
    field1312(-1, Class266.field1310), 
    field1313(-1, Class266.field1312), 
    field1314(84, Class266.field1313), 
    field1315(88, Class266.field1313), 
    field1316(-1, Class266.field1313), 
    field1317(13, Class266.field1310), 
    field1318(8, Class266.field1316), 
    field1319(10, Class266.field1316), 
    field1320(49, Class266.field1319), 
    field1321(52, Class266.field1310), 
    field1322(54, Class266.field1316), 
    field1323(57, Class266.field1316), 
    field1324(59, Class266.field1316), 
    field1325(61, Class266.field1316), 
    field1326(77, Class266.field1316), 
    field1327(27, Class266.field1316), 
    field1328(-1, Class266.field1316), 
    field1329(6, Class266.field1328), 
    field1330(50, Class266.field1328), 
    field1331(93, Class266.field1328), 
    field1332(-1, Class266.field1328), 
    field1333(53, Class266.field1332), 
    field1334(-1, Class266.field1316), 
    field1335(-1, Class266.field1334), 
    field1336(12, Class266.field1335), 
    field1337(48, Class266.field1335), 
    field1338(38, Class266.field1335), 
    field1339(75, Class266.field1335), 
    field1340(31, Class266.field1334), 
    field1341(66, Class266.field1334), 
    field1342(95, Class266.field1334), 
    field1343(-1, Class266.field1312), 
    field1344(69, Class266.field1343), 
    field1345(85, Class266.field1343), 
    field1346(62, Class266.field1343), 
    field1347(-1, Class266.field1312), 
    field1348(9, Class266.field1347), 
    field1349(55, Class266.field1347), 
    field1350(60, Class266.field1347), 
    field1351(76, Class266.field1347), 
    field1352(-1, Class266.field1312), 
    field1353(4, Class266.field1352), 
    field1354(11, Class266.field1352), 
    field1355(20, Class266.field1352), 
    field1356(19, Class266.field1352), 
    field1357(29, Class266.field1352), 
    field1358(64, Class266.field1352), 
    field1359(83, Class266.field1352), 
    field1360(89, Class266.field1352), 
    field1361(90, Class266.field1352), 
    field1362(98, Class266.field1352), 
    field1363(-1, Class266.field1352), 
    field1364(-1, Class266.field1363), 
    field1365(22, Class266.field1364), 
    field1366(33, Class266.field1364), 
    field1367(86, Class266.field1363), 
    field1368(87, Class266.field1363), 
    field1369(-1, Class266.field1352), 
    field1370(65, Class266.field1369), 
    field1371(74, Class266.field1369), 
    field1372(91, Class266.field1369), 
    field1373(30, Class266.field1352), 
    field1374(16, Class266.field1373), 
    field1375(72, Class266.field1352), 
    field1376(7, Class266.field1375), 
    field1377(94, Class266.field1352), 
    field1378(15, Class266.field1377), 
    field1379(32, Class266.field1377), 
    field1380(56, Class266.field1377), 
    field1381(96, Class266.field1377), 
    field1382(-1, Class266.field1310), 
    field1383(28, Class266.field1382), 
    field1384(97, Class266.field1382), 
    field1385(-1, Class266.field1310), 
    field1386(3, Class266.field1385), 
    field1387(-1, Class266.field1310), 
    field1388(73, Class266.field1387), 
    field1389(67, Class266.field1310), 
    field1390(40, Class266.field1389), 
    field1391(-1, Class266.field1294), 
    field1392(37, Class266.field1391), 
    field1393(35, Class266.field1391), 
    field1394(51, Class266.field1391), 
    field1395(-1, Class266.field1294), 
    field1396(99, Class266.field1395), 
    field1397(-1, Class266.field1294), 
    field1398(2, Class266.field1397), 
    field1399(71, Class266.field1397), 
    field1400(82, Class266.field1397), 
    field1401(-1, Class266.field1294), 
    field1402(14, Class266.field1401), 
    field1403(36, Class266.field1401), 
    field1404(68, Class266.field1401), 
    field1405(92, Class266.field1401), 
    field1406(-1, Class266.field1294), 
    field1407(70, Class266.field1406), 
    field1408(79, Class266.field1406), 
    field1409(78, Class266.field1406), 
    field1410(81, Class266.field1406), 
    field1411(80, Class266.field1406), 
    field1412(-1, Class266.field1294), 
    field1413(-1, Class266.field1412), 
    field1414(42, Class266.field1413), 
    field1415(45, Class266.field1413), 
    field1416(41, Class266.field1412), 
    field1417(44, Class266.field1412), 
    field1418(43, Class266.field1412), 
    field1419(47, Class266.field1412), 
    field1420(46, Class266.field1412), 
    field1421(5, Class266.field1294);
    
    private static final Map<Integer, Class266> field1422;
    private final int field1423;
    private final Class266 field1424;
    
    private Class266(final int field1423) {
        this.field1423 = field1423;
        this.field1424 = null;
    }
    
    public static Optional<Class266> method907(final int i) {
        if (i != -1) {
            return (Optional<Class266>)Optional.fromNullable((Object)Class266.field1422.get(i));
        }
        return (Optional<Class266>)Optional.absent();
    }
    
    public boolean method908(final Class266... array) {
        for (int length = array.length, i = 0; i < length; ++i) {
            if (this.method909(array[i])) {
                return true;
            }
        }
        return false;
    }
    
    public boolean method909(final Class266 class266) {
        return this == class266;
    }
    
    public boolean method910(final Class266 class266) {
        Class266 method912 = this;
        while (method912 != class266) {
            method912 = method912.method912();
            if (method912 != null) {
                continue;
            }
            return false;
        }
        return true;
    }
    
    private Class266(final int field1423, final Class266 field1424) {
        this.field1423 = field1423;
        this.field1424 = field1424;
    }
    
    public int method911() {
        return this.field1423;
    }
    
    public Class266 method912() {
        return this.field1424;
    }
    
    static {
        field1422 = new HashMap<Integer, Class266>();
        for (final Class266 class266 : values()) {
            Class266.field1422.put(class266.field1423, class266);
        }
    }
}
