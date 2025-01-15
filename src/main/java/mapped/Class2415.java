// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Vector;
import javax.swing.JList;

public class Class2415 extends JList<String>
{
    private static String[] field14289;
    private final Class394 field14290;
    private int field14291;
    
    public Class2415(final Class394 field14290) {
        (this.field14290 = field14290).method1472(this::method9672);
    }
    
    public void method9672() {
        if (this.field14291++ % 20 == 0) {
            final Vector listData = new Vector();
            for (int i = 0; i < this.field14290.method1537().method20623().size(); ++i) {
                listData.add(this.field14290.method1537().method20623().get(i).method2844().getName());
            }
            this.setListData(listData);
        }
    }
}
