// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class283
{
    field1497(0, 63, "`", 96, 1), 
    field1498(73, 63, "1", 49, 1), 
    field1499(145, 63, "2", 50, 1), 
    field1500(218, 63, "3", 51, 1), 
    field1501(290, 63, "4", 52, 1), 
    field1502(363, 63, "5", 53, 1), 
    field1503(436, 63, "6", 54, 1), 
    field1504(508, 63, "7", 55, 1), 
    field1505(580, 63, "8", 56, 1), 
    field1506(653, 63, "9", 57, 1), 
    field1507(726, 63, "0", 48, 1), 
    field1508(798, 63, "-", 45, 1), 
    field1509(870, 63, "=", 61, 1), 
    field1510(943, 117, "Back", 259, 1), 
    field1511(0, 99, "Tab", 258, 2), 
    field1512(108, 63, "Q", 81, 2), 
    field1513(181, 63, "W", 87, 2), 
    field1514(253, 63, "E", 69, 2), 
    field1515(325, 63, "R", 82, 2), 
    field1516(399, 63, "T", 84, 2), 
    field1517(471, 63, "Y", 89, 2), 
    field1518(543, 63, "U", 85, 2), 
    field1519(615, 63, "I", 73, 2), 
    field1520(689, 63, "O", 79, 2), 
    field1521(761, 63, "P", 80, 2), 
    field1522(833, 63, "[", 91, 2), 
    field1523(905, 63, "]", 93, 2), 
    field1524(978, 82, "\\", 92, 2), 
    field1525(0, 116, "Caps Lock", 280, 3), 
    field1526(127, 63, "A", 65, 3), 
    field1527(199, 63, "S", 83, 3), 
    field1528(271, 63, "D", 68, 3), 
    field1529(343, 63, "F", 70, 3), 
    field1530(417, 63, "G", 71, 3), 
    field1531(489, 63, "H", 72, 3), 
    field1532(561, 63, "J", 74, 3), 
    field1533(633, 63, "K", 75, 3), 
    field1534(707, 63, "L", 76, 3), 
    field1535(779, 63, ";", 59, 3), 
    field1536(851, 63, "'", 39, 3), 
    field1537(924, 136, "Return", 257, 3), 
    field1538(0, 153, "Shift", 340, 4), 
    field1539(164, 63, "Z", 90, 4), 
    field1540(236, 63, "X", 88, 4), 
    field1541(308, 63, "C", 67, 4), 
    field1542(381, 63, "V", 86, 4), 
    field1543(454, 63, "B", 66, 4), 
    field1544(526, 63, "N", 78, 4), 
    field1545(598, 63, "M", 77, 4), 
    field1546(671, 63, ",", 44, 4), 
    field1547(744, 63, ".", 46, 4), 
    field1548(816, 63, "/", 47, 4), 
    field1549(888, 172, "Shift", 344, 4), 
    field1550(0, 97, "Ctrl", 341, 5), 
    field1551(106, 63, "Meta", 343, 5), 
    field1552(178, 103, "Alt", 342, 5), 
    field1553(290, 427, "Space", 32, 5), 
    field1554(726, 97, "Alt Gr", 346, 5), 
    field1555(833, 63, "Meta", 347, 5), 
    field1556(905, 63, "Menu", 348, 5), 
    field1557(978, 82, "Ctrl", 345, 5);
    
    public int field1558;
    public int field1559;
    public String field1560;
    public boolean field1561;
    public int field1562;
    public int field1563;
    
    private Class283(final int field1558, final int field1559, final String field1560, final int field1561, final int field1562) {
        this.field1559 = 63;
        this.field1558 = field1558;
        this.field1559 = field1559;
        this.field1561 = true;
        this.field1560 = field1560;
        this.field1563 = field1561;
        this.field1562 = field1562;
    }
    
    private Class283(final int field1558, final int field1559, final String s, final int n) {
        this.field1559 = 63;
        this.field1558 = field1558;
        this.field1559 = field1559;
        this.field1561 = false;
    }
    
    public int method927() {
        return 74 * (this.field1562 - 1);
    }
    
    public int method928() {
        return this.field1558;
    }
    
    public int method929() {
        return this.field1559;
    }
    
    public int method930() {
        return 63;
    }
}
