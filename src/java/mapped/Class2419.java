// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.text.Document;
import javax.swing.text.BadLocationException;
import javax.swing.text.AttributeSet;
import javax.swing.SwingUtilities;
import com.mojang.util.QueueLogAppender;
import java.awt.event.FocusListener;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JPanel;
import java.awt.LayoutManager;
import java.awt.BorderLayout;
import java.awt.Dimension;
import com.google.common.collect.Lists;
import java.awt.event.WindowListener;
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.UIManager;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Collection;
import org.apache.logging.log4j.Logger;
import java.awt.Font;
import javax.swing.JComponent;

public class Class2419 extends JComponent
{
    private static final Font field14312;
    private static final Logger field14313;
    private final Class395 field14314;
    private Thread field14315;
    private final Collection<Runnable> field14316;
    private final AtomicBoolean field14317;
    
    public static Class2419 method9711(final Class395 class395) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (final Exception ex) {}
        final JFrame frame = new JFrame("Minecraft server");
        final Class2419 comp = new Class2419(class395);
        frame.setDefaultCloseOperation(2);
        frame.add(comp);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.addWindowListener(new Class7056(comp, frame, class395));
        comp.method9712(frame::dispose);
        comp.method9716();
        return comp;
    }
    
    private Class2419(final Class395 field14314) {
        this.field14316 = Lists.newArrayList();
        this.field14317 = new AtomicBoolean();
        this.field14314 = field14314;
        this.setPreferredSize(new Dimension(854, 480));
        this.setLayout(new BorderLayout());
        try {
            this.add(this.method9715(), "Center");
            this.add(this.method9713(), "West");
        }
        catch (final Exception ex) {
            Class2419.field14313.error("Couldn't build server GUI", (Throwable)ex);
        }
    }
    
    public void method9712(final Runnable runnable) {
        this.field14316.add(runnable);
    }
    
    private JComponent method9713() {
        final JPanel panel = new JPanel(new BorderLayout());
        final Class2418 comp = new Class2418(this.field14314);
        this.field14316.add(comp::method9708);
        panel.add(comp, "North");
        panel.add(this.method9714(), "Center");
        panel.setBorder(new TitledBorder(new EtchedBorder(), "Stats"));
        return panel;
    }
    
    private JComponent method9714() {
        final JScrollPane scrollPane = new JScrollPane(new Class2415(this.field14314), 22, 30);
        scrollPane.setBorder(new TitledBorder(new EtchedBorder(), "Players"));
        return scrollPane;
    }
    
    private JComponent method9715() {
        final JPanel panel = new JPanel(new BorderLayout());
        final JTextArea view = new JTextArea();
        final JScrollPane comp = new JScrollPane(view, 22, 30);
        view.setEditable(false);
        view.setFont(Class2419.field14312);
        final JTextField comp2 = new JTextField();
        comp2.addActionListener(p1 -> {
            textField.getText().trim();
            final String s;
            if (!s.isEmpty()) {
                this.field14314.method1616(s, this.field14314.method1574());
            }
            textField.setText("");
            return;
        });
        view.addFocusListener(new Class7044(this));
        panel.add(comp, "Center");
        panel.add(comp2, "South");
        panel.setBorder(new TitledBorder(new EtchedBorder(), "Log and chat"));
        (this.field14315 = new Thread(() -> {
            while (true) {
                QueueLogAppender.getNextLogEvent("ServerGuiConsole");
                final Object o;
                if (o == null) {
                    break;
                }
                else {
                    final String s2;
                    this.method9719(textArea, scrollPane, s2);
                }
            }
            return;
        })).setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)new Class8239(Class2419.field14313));
        this.field14315.setDaemon(true);
        return panel;
    }
    
    public void method9716() {
        this.field14315.start();
    }
    
    public void method9717() {
        if (!this.field14317.getAndSet(true)) {
            this.method9718();
        }
    }
    
    private void method9718() {
        this.field14316.forEach(Runnable::run);
    }
    
    public void method9719(final JTextArea textArea, final JScrollPane scrollPane, final String s) {
        if (!SwingUtilities.isEventDispatchThread()) {
            SwingUtilities.invokeLater(() -> this.method9719(textArea2, scrollPane2, s2));
        }
        else {
            final Document document = textArea.getDocument();
            final JScrollBar verticalScrollBar = scrollPane.getVerticalScrollBar();
            int n = 0;
            if (scrollPane.getViewport().getView() == textArea) {
                n = ((verticalScrollBar.getValue() + verticalScrollBar.getSize().getHeight() + Class2419.field14312.getSize() * 4 > verticalScrollBar.getMaximum()) ? 1 : 0);
            }
            try {
                document.insertString(document.getLength(), s, null);
            }
            catch (final BadLocationException ex) {}
            if (n != 0) {
                verticalScrollBar.setValue(Integer.MAX_VALUE);
            }
        }
    }
    
    static {
        field14312 = new Font("Monospaced", 0, 12);
        field14313 = LogManager.getLogger();
    }
}
