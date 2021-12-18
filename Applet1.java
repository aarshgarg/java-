package practice;

import java.applet.Applet;
import java.awt.*;

public class Applet1 extends Applet{
    String s=null;
    public void init()
    {
        s= getParameter("pname");
    }
public void Paint (Graphics g)
{
    g.drawString(s,100,100);

}
}
