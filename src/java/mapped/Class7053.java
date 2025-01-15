// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Class7053 implements ActionListener
{
    private static String[] field27449;
    public final /* synthetic */ Class2417 field27450;
    
    public Class7053(final Class2417 field27450) {
        this.field27450 = field27450;
    }
    
    @Override
    public void actionPerformed(final ActionEvent actionEvent) {
        this.field27450.field14305 = true;
        this.field27450.setVisible(false);
    }
}
